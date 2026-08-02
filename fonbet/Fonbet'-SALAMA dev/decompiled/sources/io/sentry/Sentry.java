package io.sentry;

import io.sentry.backpressure.BackpressureMonitor;
import io.sentry.backpressure.NoOpBackpressureMonitor;
import io.sentry.cache.EnvelopeCache;
import io.sentry.cache.PersistingScopeObserver;
import io.sentry.config.PropertiesProviderFactory;
import io.sentry.internal.debugmeta.NoOpDebugMetaLoader;
import io.sentry.internal.debugmeta.ResourcesDebugMetaLoader;
import io.sentry.internal.modules.CompositeModulesLoader;
import io.sentry.internal.modules.IModulesLoader;
import io.sentry.internal.modules.ManifestModulesLoader;
import io.sentry.internal.modules.NoOpModulesLoader;
import io.sentry.internal.modules.ResourcesModulesLoader;
import io.sentry.logger.ILoggerApi;
import io.sentry.opentelemetry.OpenTelemetryUtil;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.transport.NoOpEnvelopeCache;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.DebugMetaPropertiesApplier;
import io.sentry.util.FileUtils;
import io.sentry.util.InitUtil;
import io.sentry.util.LoadClass;
import io.sentry.util.Platform;
import io.sentry.util.SentryRandom;
import io.sentry.util.thread.NoOpThreadChecker;
import io.sentry.util.thread.ThreadChecker;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Sentry {
    public static final String APP_START_PROFILING_CONFIG_FILE_NAME = "app_start_profiling_config";
    private static final boolean GLOBAL_HUB_DEFAULT_MODE = false;
    private static volatile IScopesStorage scopesStorage = NoOpScopesStorage.getInstance();
    private static volatile IScopes rootScopes = NoOpScopes.getInstance();
    private static final IScope globalScope = new Scope(SentryOptions.empty());
    private static volatile boolean globalHubMode = false;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final long classCreationTimestamp = System.currentTimeMillis();
    private static final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    public interface OptionsConfiguration<T extends SentryOptions> {
        void configure(T t7);
    }

    private Sentry() {
    }

    public static void addBreadcrumb(Breadcrumb breadcrumb, Hint hint) {
        getCurrentScopes().addBreadcrumb(breadcrumb, hint);
    }

    private static <T extends SentryOptions> void applyOptionsConfiguration(OptionsConfiguration<T> optionsConfiguration, T t7) {
        try {
            optionsConfiguration.configure(t7);
        } catch (Throwable th) {
            t7.getLogger().log(SentryLevel.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
    }

    public static void bindClient(ISentryClient iSentryClient) {
        getCurrentScopes().bindClient(iSentryClient);
    }

    public static SentryId captureCheckIn(CheckIn checkIn) {
        return getCurrentScopes().captureCheckIn(checkIn);
    }

    public static SentryId captureEvent(SentryEvent sentryEvent) {
        return getCurrentScopes().captureEvent(sentryEvent);
    }

    public static SentryId captureException(Throwable th) {
        return getCurrentScopes().captureException(th);
    }

    public static SentryId captureFeedback(Feedback feedback) {
        return getCurrentScopes().captureFeedback(feedback);
    }

    public static SentryId captureMessage(String str) {
        return getCurrentScopes().captureMessage(str);
    }

    public static void captureUserFeedback(UserFeedback userFeedback) {
        getCurrentScopes().captureUserFeedback(userFeedback);
    }

    public static void clearBreadcrumbs() {
        getCurrentScopes().clearBreadcrumbs();
    }

    public static void close() {
        ISentryLifecycleToken acquire = lock.acquire();
        try {
            IScopes currentScopes = getCurrentScopes();
            rootScopes = NoOpScopes.getInstance();
            getScopesStorage().close();
            currentScopes.close(false);
            if (acquire != null) {
                acquire.close();
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void configureScope(ScopeCallback scopeCallback) {
        configureScope(null, scopeCallback);
    }

    public static TransactionContext continueTrace(String str, List<String> list) {
        return getCurrentScopes().continueTrace(str, list);
    }

    public static void endSession() {
        getCurrentScopes().endSession();
    }

    private static void finalizePreviousSession(SentryOptions sentryOptions, IScopes iScopes) {
        try {
            sentryOptions.getExecutorService().submit(new PreviousSessionFinalizer(sentryOptions, iScopes));
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "Failed to finalize previous session.", th);
        }
    }

    public static void flush(long j) {
        getCurrentScopes().flush(j);
    }

    public static IScopes forkedCurrentScope(String str) {
        return getCurrentScopes().forkedCurrentScope(str);
    }

    public static IScopes forkedRootScopes(String str) {
        return globalHubMode ? rootScopes : rootScopes.forkedScopes(str);
    }

    public static IScopes forkedScopes(String str) {
        return getCurrentScopes().forkedScopes(str);
    }

    public static BaggageHeader getBaggage() {
        return getCurrentScopes().getBaggage();
    }

    @Deprecated
    public static IHub getCurrentHub() {
        return new HubScopesWrapper(getCurrentScopes());
    }

    public static IScopes getCurrentScopes() {
        if (globalHubMode) {
            return rootScopes;
        }
        IScopes iScopes = getScopesStorage().get();
        if (iScopes != null && !iScopes.isNoOp()) {
            return iScopes;
        }
        IScopes forkedScopes = rootScopes.forkedScopes("getCurrentScopes");
        getScopesStorage().set(forkedScopes);
        return forkedScopes;
    }

    public static IScope getGlobalScope() {
        return globalScope;
    }

    public static SentryId getLastEventId() {
        return getCurrentScopes().getLastEventId();
    }

    private static IScopesStorage getScopesStorage() {
        return scopesStorage;
    }

    public static ISpan getSpan() {
        return (globalHubMode && Platform.isAndroid()) ? getCurrentScopes().getTransaction() : getCurrentScopes().getSpan();
    }

    public static SentryTraceHeader getTraceparent() {
        return getCurrentScopes().getTraceparent();
    }

    private static void handleAppStartProfilingConfig(SentryOptions sentryOptions, ISentryExecutorService iSentryExecutorService) {
        try {
            iSentryExecutorService.submit(new j(sentryOptions, 0));
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th);
        }
    }

    public static void init() {
        init((OptionsConfiguration<SentryOptions>) new f(5), false);
    }

    private static void initConfigurations(SentryOptions sentryOptions) {
        int i7 = 0;
        ILogger logger = sentryOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.INFO;
        logger.log(sentryLevel, "Initializing SDK with DSN: '%s'", sentryOptions.getDsn());
        String outboxPath = sentryOptions.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger.log(sentryLevel, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (sentryOptions.getEnvelopeDiskCache() instanceof NoOpEnvelopeCache) {
                sentryOptions.setEnvelopeDiskCache(EnvelopeCache.create(sentryOptions));
            }
        }
        String profilingTracesDirPath = sentryOptions.getProfilingTracesDirPath();
        if ((sentryOptions.isProfilingEnabled() || sentryOptions.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                sentryOptions.getExecutorService().submit(new k(file, i7));
            } catch (RejectedExecutionException e7) {
                sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e7);
            }
        }
        IModulesLoader modulesLoader = sentryOptions.getModulesLoader();
        if (!sentryOptions.isSendModules()) {
            sentryOptions.setModulesLoader(NoOpModulesLoader.getInstance());
        } else if (modulesLoader instanceof NoOpModulesLoader) {
            sentryOptions.setModulesLoader(new CompositeModulesLoader(Arrays.asList(new ManifestModulesLoader(sentryOptions.getLogger()), new ResourcesModulesLoader(sentryOptions.getLogger())), sentryOptions.getLogger()));
        }
        if (sentryOptions.getDebugMetaLoader() instanceof NoOpDebugMetaLoader) {
            sentryOptions.setDebugMetaLoader(new ResourcesDebugMetaLoader(sentryOptions.getLogger()));
        }
        DebugMetaPropertiesApplier.apply(sentryOptions, sentryOptions.getDebugMetaLoader().loadDebugMeta());
        if (sentryOptions.getThreadChecker() instanceof NoOpThreadChecker) {
            sentryOptions.setThreadChecker(ThreadChecker.getInstance());
        }
        if (sentryOptions.getPerformanceCollectors().isEmpty()) {
            sentryOptions.addPerformanceCollector(new JavaMemoryCollector());
        }
        if (sentryOptions.isEnableBackpressureHandling() && Platform.isJvm()) {
            if (sentryOptions.getBackpressureMonitor() instanceof NoOpBackpressureMonitor) {
                sentryOptions.setBackpressureMonitor(new BackpressureMonitor(sentryOptions, ScopesAdapter.getInstance()));
            }
            sentryOptions.getBackpressureMonitor().start();
        }
    }

    private static void initFatalLogger(SentryOptions sentryOptions) {
        if (sentryOptions.getFatalLogger() instanceof NoOpLogger) {
            sentryOptions.setFatalLogger(new SystemOutLogger());
        }
    }

    private static void initForOpenTelemetryMaybe(SentryOptions sentryOptions) {
        OpenTelemetryUtil.updateOpenTelemetryModeIfAuto(sentryOptions, new LoadClass());
        if (SentryOpenTelemetryMode.OFF == sentryOptions.getOpenTelemetryMode()) {
            sentryOptions.setSpanFactory(new DefaultSpanFactory());
        }
        initScopesStorage(sentryOptions);
        OpenTelemetryUtil.applyIgnoredSpanOrigins(sentryOptions);
    }

    private static void initLogger(SentryOptions sentryOptions) {
        if (sentryOptions.isDebug() && (sentryOptions.getLogger() instanceof NoOpLogger)) {
            sentryOptions.setLogger(new SystemOutLogger());
        }
    }

    private static void initScopesStorage(SentryOptions sentryOptions) {
        getScopesStorage().close();
        if (SentryOpenTelemetryMode.OFF == sentryOptions.getOpenTelemetryMode()) {
            scopesStorage = new DefaultScopesStorage();
        } else {
            scopesStorage = ScopesStorageFactory.create(new LoadClass(), NoOpLogger.getInstance());
        }
    }

    public static Boolean isCrashedLastRun() {
        return getCurrentScopes().isCrashedLastRun();
    }

    public static boolean isEnabled() {
        return getCurrentScopes().isEnabled();
    }

    public static boolean isHealthy() {
        return getCurrentScopes().isHealthy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleAppStartProfilingConfig$3(SentryOptions sentryOptions) {
        String cacheDirPathWithoutDsn = sentryOptions.getCacheDirPathWithoutDsn();
        if (cacheDirPathWithoutDsn != null) {
            File file = new File(cacheDirPathWithoutDsn, APP_START_PROFILING_CONFIG_FILE_NAME);
            try {
                FileUtils.deleteRecursively(file);
                if (sentryOptions.isEnableAppStartProfiling() || sentryOptions.isStartProfilerOnAppStart()) {
                    if (!sentryOptions.isStartProfilerOnAppStart() && !sentryOptions.isTracingEnabled()) {
                        sentryOptions.getLogger().log(SentryLevel.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                        return;
                    }
                    if (file.createNewFile()) {
                        SentryAppStartProfilingOptions sentryAppStartProfilingOptions = new SentryAppStartProfilingOptions(sentryOptions, sentryOptions.isEnableAppStartProfiling() ? sampleAppStartProfiling(sentryOptions) : new TracesSamplingDecision(Boolean.FALSE));
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, UTF_8));
                            try {
                                sentryOptions.getSerializer().serialize((ISerializer) sentryAppStartProfilingOptions, (Writer) bufferedWriter);
                                bufferedWriter.close();
                                fileOutputStream.close();
                            } finally {
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                sentryOptions.getLogger().log(SentryLevel.ERROR, "Unable to create app start profiling config file. ", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initConfigurations$5(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.lastModified() < classCreationTimestamp - TimeUnit.MINUTES.toMillis(5L)) {
                FileUtils.deleteRecursively(file2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyOptionsObservers$4(SentryOptions sentryOptions) {
        for (IOptionsObserver iOptionsObserver : sentryOptions.getOptionsObservers()) {
            iOptionsObserver.setRelease(sentryOptions.getRelease());
            iOptionsObserver.setProguardUuid(sentryOptions.getProguardUuid());
            iOptionsObserver.setSdkVersion(sentryOptions.getSdkVersion());
            iOptionsObserver.setDist(sentryOptions.getDist());
            iOptionsObserver.setEnvironment(sentryOptions.getEnvironment());
            iOptionsObserver.setTags(sentryOptions.getTags());
            iOptionsObserver.setReplayErrorSampleRate(sentryOptions.getSessionReplay().getOnErrorSampleRate());
        }
        PersistingScopeObserver findPersistingScopeObserver = sentryOptions.findPersistingScopeObserver();
        if (findPersistingScopeObserver != null) {
            findPersistingScopeObserver.resetCache();
        }
    }

    public static ILoggerApi logger() {
        return getCurrentScopes().logger();
    }

    private static void notifyOptionsObservers(SentryOptions sentryOptions) {
        try {
            sentryOptions.getExecutorService().submit(new j(sentryOptions, 1));
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "Failed to notify options observers.", th);
        }
    }

    @Deprecated
    public static void popScope() {
        if (globalHubMode) {
            return;
        }
        getCurrentScopes().popScope();
    }

    private static boolean preInitConfigurations(SentryOptions sentryOptions) {
        if (sentryOptions.isEnableExternalConfiguration()) {
            sentryOptions.merge(ExternalOptions.from(PropertiesProviderFactory.create(), sentryOptions.getLogger()));
        }
        String dsn = sentryOptions.getDsn();
        if (!sentryOptions.isEnabled() || (dsn != null && dsn.isEmpty())) {
            close();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        sentryOptions.retrieveParsedDsn();
        return true;
    }

    public static ISentryLifecycleToken pushIsolationScope() {
        return !globalHubMode ? getCurrentScopes().pushIsolationScope() : NoOpScopesLifecycleToken.getInstance();
    }

    public static ISentryLifecycleToken pushScope() {
        return !globalHubMode ? getCurrentScopes().pushScope() : NoOpScopesLifecycleToken.getInstance();
    }

    public static void removeExtra(String str) {
        getCurrentScopes().removeExtra(str);
    }

    public static void removeTag(String str) {
        getCurrentScopes().removeTag(str);
    }

    public static IReplayApi replay() {
        return getCurrentScopes().getScope().getOptions().getReplayController();
    }

    public static void reportFullyDisplayed() {
        getCurrentScopes().reportFullyDisplayed();
    }

    private static TracesSamplingDecision sampleAppStartProfiling(SentryOptions sentryOptions) {
        TransactionContext transactionContext = new TransactionContext("app.launch", ProfileContext.TYPE);
        transactionContext.setForNextAppStart(true);
        return sentryOptions.getInternalTracesSampler().sample(new SamplingContext(transactionContext, null, Double.valueOf(SentryRandom.current().nextDouble()), null));
    }

    @Deprecated
    public static ISentryLifecycleToken setCurrentHub(IHub iHub) {
        return setCurrentScopes(iHub);
    }

    public static ISentryLifecycleToken setCurrentScopes(IScopes iScopes) {
        return getScopesStorage().set(iScopes);
    }

    public static void setExtra(String str, String str2) {
        getCurrentScopes().setExtra(str, str2);
    }

    public static void setFingerprint(List<String> list) {
        getCurrentScopes().setFingerprint(list);
    }

    public static void setLevel(SentryLevel sentryLevel) {
        getCurrentScopes().setLevel(sentryLevel);
    }

    public static void setTag(String str, String str2) {
        getCurrentScopes().setTag(str, str2);
    }

    public static void setTransaction(String str) {
        getCurrentScopes().setTransaction(str);
    }

    public static void setUser(User user) {
        getCurrentScopes().setUser(user);
    }

    public static void startProfiler() {
        getCurrentScopes().startProfiler();
    }

    public static void startSession() {
        getCurrentScopes().startSession();
    }

    public static ITransaction startTransaction(String str, String str2) {
        return getCurrentScopes().startTransaction(str, str2);
    }

    public static void stopProfiler() {
        getCurrentScopes().stopProfiler();
    }

    public static void withIsolationScope(ScopeCallback scopeCallback) {
        getCurrentScopes().withIsolationScope(scopeCallback);
    }

    public static void withScope(ScopeCallback scopeCallback) {
        getCurrentScopes().withScope(scopeCallback);
    }

    public static void addBreadcrumb(Breadcrumb breadcrumb) {
        getCurrentScopes().addBreadcrumb(breadcrumb);
    }

    public static SentryId captureEvent(SentryEvent sentryEvent, ScopeCallback scopeCallback) {
        return getCurrentScopes().captureEvent(sentryEvent, scopeCallback);
    }

    public static SentryId captureException(Throwable th, ScopeCallback scopeCallback) {
        return getCurrentScopes().captureException(th, scopeCallback);
    }

    public static SentryId captureFeedback(Feedback feedback, Hint hint) {
        return getCurrentScopes().captureFeedback(feedback, hint);
    }

    public static SentryId captureMessage(String str, ScopeCallback scopeCallback) {
        return getCurrentScopes().captureMessage(str, scopeCallback);
    }

    public static void configureScope(ScopeType scopeType, ScopeCallback scopeCallback) {
        getCurrentScopes().configureScope(scopeType, scopeCallback);
    }

    public static void init(String str) {
        init(new l(str));
    }

    public static ITransaction startTransaction(String str, String str2, TransactionOptions transactionOptions) {
        return getCurrentScopes().startTransaction(str, str2, transactionOptions);
    }

    public static void addBreadcrumb(String str) {
        getCurrentScopes().addBreadcrumb(str);
    }

    public static SentryId captureEvent(SentryEvent sentryEvent, Hint hint) {
        return getCurrentScopes().captureEvent(sentryEvent, hint);
    }

    public static SentryId captureException(Throwable th, Hint hint) {
        return getCurrentScopes().captureException(th, hint);
    }

    public static SentryId captureFeedback(Feedback feedback, Hint hint, ScopeCallback scopeCallback) {
        return getCurrentScopes().captureFeedback(feedback, hint, scopeCallback);
    }

    public static SentryId captureMessage(String str, SentryLevel sentryLevel) {
        return getCurrentScopes().captureMessage(str, sentryLevel);
    }

    public static <T extends SentryOptions> void init(OptionsContainer<T> optionsContainer, OptionsConfiguration<T> optionsConfiguration) {
        init(optionsContainer, optionsConfiguration, false);
    }

    public static ITransaction startTransaction(String str, String str2, String str3, TransactionOptions transactionOptions) {
        ITransaction startTransaction = getCurrentScopes().startTransaction(str, str2, transactionOptions);
        startTransaction.setDescription(str3);
        return startTransaction;
    }

    public static void addBreadcrumb(String str, String str2) {
        getCurrentScopes().addBreadcrumb(str, str2);
    }

    public static SentryId captureEvent(SentryEvent sentryEvent, Hint hint, ScopeCallback scopeCallback) {
        return getCurrentScopes().captureEvent(sentryEvent, hint, scopeCallback);
    }

    public static SentryId captureException(Throwable th, Hint hint, ScopeCallback scopeCallback) {
        return getCurrentScopes().captureException(th, hint, scopeCallback);
    }

    public static SentryId captureMessage(String str, SentryLevel sentryLevel, ScopeCallback scopeCallback) {
        return getCurrentScopes().captureMessage(str, sentryLevel, scopeCallback);
    }

    public static <T extends SentryOptions> void init(OptionsContainer<T> optionsContainer, OptionsConfiguration<T> optionsConfiguration, boolean z4) {
        T createInstance = optionsContainer.createInstance();
        applyOptionsConfiguration(optionsConfiguration, createInstance);
        init(createInstance, z4);
    }

    public static ITransaction startTransaction(TransactionContext transactionContext) {
        return getCurrentScopes().startTransaction(transactionContext);
    }

    public static ITransaction startTransaction(TransactionContext transactionContext, TransactionOptions transactionOptions) {
        return getCurrentScopes().startTransaction(transactionContext, transactionOptions);
    }

    public static void init(OptionsConfiguration<SentryOptions> optionsConfiguration) {
        init(optionsConfiguration, false);
    }

    public static void init(OptionsConfiguration<SentryOptions> optionsConfiguration, boolean z4) {
        SentryOptions sentryOptions = new SentryOptions();
        applyOptionsConfiguration(optionsConfiguration, sentryOptions);
        init(sentryOptions, z4);
    }

    public static void init(SentryOptions sentryOptions) {
        init(sentryOptions, false);
    }

    private static void init(SentryOptions sentryOptions, boolean z4) {
        ISentryLifecycleToken acquire = lock.acquire();
        try {
            if (!sentryOptions.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && Platform.isAndroid()) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(sentryOptions.getClass().getName()));
            }
            if (!preInitConfigurations(sentryOptions)) {
                if (acquire != null) {
                    acquire.close();
                    return;
                }
                return;
            }
            Boolean isGlobalHubMode = sentryOptions.isGlobalHubMode();
            if (isGlobalHubMode != null) {
                z4 = isGlobalHubMode.booleanValue();
            }
            sentryOptions.getLogger().log(SentryLevel.INFO, "GlobalHubMode: '%s'", String.valueOf(z4));
            globalHubMode = z4;
            initFatalLogger(sentryOptions);
            if (InitUtil.shouldInit(globalScope.getOptions(), sentryOptions, isEnabled())) {
                if (isEnabled()) {
                    sentryOptions.getLogger().log(SentryLevel.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                }
                try {
                    sentryOptions.getExecutorService().submit(new j(sentryOptions, 2));
                } catch (RejectedExecutionException e7) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e7);
                }
                getCurrentScopes().close(true);
                IScope iScope = globalScope;
                iScope.replaceOptions(sentryOptions);
                rootScopes = new Scopes(new Scope(sentryOptions), new Scope(sentryOptions), iScope, "Sentry.init");
                initLogger(sentryOptions);
                initForOpenTelemetryMaybe(sentryOptions);
                getScopesStorage().set(rootScopes);
                initConfigurations(sentryOptions);
                iScope.bindClient(new SentryClient(sentryOptions));
                if (sentryOptions.getExecutorService().isClosed()) {
                    sentryOptions.setExecutorService(new SentryExecutorService());
                }
                for (Integration integration : sentryOptions.getIntegrations()) {
                    try {
                        integration.register(ScopesAdapter.getInstance(), sentryOptions);
                    } catch (Throwable th) {
                        sentryOptions.getLogger().log(SentryLevel.WARNING, "Failed to register the integration " + integration.getClass().getName(), th);
                    }
                }
                notifyOptionsObservers(sentryOptions);
                finalizePreviousSession(sentryOptions, ScopesAdapter.getInstance());
                handleAppStartProfilingConfig(sentryOptions, sentryOptions.getExecutorService());
                ILogger logger = sentryOptions.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                logger.log(sentryLevel, "Using openTelemetryMode %s", sentryOptions.getOpenTelemetryMode());
                sentryOptions.getLogger().log(sentryLevel, "Using span factory %s", sentryOptions.getSpanFactory().getClass().getName());
                sentryOptions.getLogger().log(sentryLevel, "Using scopes storage %s", scopesStorage.getClass().getName());
            } else {
                sentryOptions.getLogger().log(SentryLevel.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
            }
            if (acquire != null) {
                acquire.close();
            }
        } catch (Throwable th2) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
