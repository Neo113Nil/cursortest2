package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.OptionsContainer;
import io.sentry.Sentry;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.util.AutoClosableReentrantLock;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class SentryAndroid {
    private static final String FRAGMENT_CLASS_NAME = "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks";
    static final String SENTRY_FRAGMENT_INTEGRATION_CLASS_NAME = "io.sentry.android.fragment.FragmentLifecycleIntegration";
    static final String SENTRY_REPLAY_INTEGRATION_CLASS_NAME = "io.sentry.android.replay.ReplayIntegration";
    static final String SENTRY_TIMBER_INTEGRATION_CLASS_NAME = "io.sentry.android.timber.SentryTimberIntegration";
    private static final String TIMBER_CLASS_NAME = "timber.log.Timber";
    private static final long sdkInitMillis = SystemClock.uptimeMillis();
    protected static final AutoClosableReentrantLock staticLock = new AutoClosableReentrantLock();

    private SentryAndroid() {
    }

    private static void deduplicateIntegrations(SentryOptions sentryOptions, boolean z4, boolean z7) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Integration integration : sentryOptions.getIntegrations()) {
            if (z4 && (integration instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(integration);
            }
            if (z7 && (integration instanceof SentryTimberIntegration)) {
                arrayList.add(integration);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i7 = 0; i7 < arrayList2.size() - 1; i7++) {
                sentryOptions.getIntegrations().remove((Integration) arrayList2.get(i7));
            }
        }
        if (arrayList.size() > 1) {
            for (int i8 = 0; i8 < arrayList.size() - 1; i8++) {
                sentryOptions.getIntegrations().remove((Integration) arrayList.get(i8));
            }
        }
    }

    public static void init(Context context) {
        init(context, new AndroidLogger());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$init$0(SentryAndroidOptions sentryAndroidOptions) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$init$1(ILogger iLogger, Context context, Sentry.OptionsConfiguration optionsConfiguration, SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.util.LoadClass loadClass = new io.sentry.util.LoadClass();
        boolean zIsClassAvailable = loadClass.isClassAvailable(TIMBER_CLASS_NAME, sentryAndroidOptions);
        boolean z4 = loadClass.isClassAvailable(FRAGMENT_CLASS_NAME, sentryAndroidOptions) && loadClass.isClassAvailable(SENTRY_FRAGMENT_INTEGRATION_CLASS_NAME, sentryAndroidOptions);
        boolean z7 = zIsClassAvailable && loadClass.isClassAvailable(SENTRY_TIMBER_INTEGRATION_CLASS_NAME, sentryAndroidOptions);
        boolean zIsClassAvailable2 = loadClass.isClassAvailable(SENTRY_REPLAY_INTEGRATION_CLASS_NAME, sentryAndroidOptions);
        BuildInfoProvider buildInfoProvider = new BuildInfoProvider(iLogger);
        io.sentry.util.LoadClass loadClass2 = new io.sentry.util.LoadClass();
        ActivityFramesTracker activityFramesTracker = new ActivityFramesTracker(loadClass2, sentryAndroidOptions);
        AndroidOptionsInitializer.loadDefaultAndMetadataOptions(sentryAndroidOptions, context, iLogger, buildInfoProvider);
        AndroidOptionsInitializer.installDefaultIntegrations(context, sentryAndroidOptions, buildInfoProvider, loadClass2, activityFramesTracker, z4, z7, zIsClassAvailable2);
        try {
            optionsConfiguration.configure(sentryAndroidOptions);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
        if (sentryAndroidOptions.isEnablePerformanceV2() && buildInfoProvider.getSdkInfoVersion() >= 24) {
            TimeSpan appStartTimeSpan = appStartMetrics.getAppStartTimeSpan();
            if (appStartTimeSpan.hasNotStarted()) {
                appStartTimeSpan.setStartedAt(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            appStartMetrics.registerLifecycleCallbacks((Application) context.getApplicationContext());
        }
        TimeSpan sdkInitTimeSpan = appStartMetrics.getSdkInitTimeSpan();
        if (sdkInitTimeSpan.hasNotStarted()) {
            sdkInitTimeSpan.setStartedAt(sdkInitMillis);
        }
        AndroidOptionsInitializer.initializeIntegrationsAndProcessors(sentryAndroidOptions, context, buildInfoProvider, loadClass2, activityFramesTracker);
        deduplicateIntegrations(sentryAndroidOptions, z4, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$init$2(AtomicBoolean atomicBoolean, IScope iScope) {
        Session session = iScope.getSession();
        if (session == null || session.getStarted() == null) {
            return;
        }
        atomicBoolean.set(true);
    }

    public static void init(Context context, ILogger iLogger) {
        init(context, iLogger, new a(8));
    }

    public static void init(Context context, Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration) {
        init(context, new AndroidLogger(), optionsConfiguration);
    }

    public static void init(Context context, ILogger iLogger, Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration) {
        try {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
            try {
                Sentry.init(OptionsContainer.create(SentryAndroidOptions.class), new e(iLogger, context, optionsConfiguration), true);
                IScopes currentScopes = Sentry.getCurrentScopes();
                if (ContextUtils.isForegroundImportance()) {
                    if (currentScopes.getOptions().isEnableAutoSessionTracking()) {
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        currentScopes.configureScope(new i(atomicBoolean, 4));
                        if (!atomicBoolean.get()) {
                            currentScopes.startSession();
                        }
                    }
                    currentScopes.getOptions().getReplayController().start();
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } catch (Throwable th) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IllegalAccessException e7) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e7);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e7);
        } catch (InstantiationException e8) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e8);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e8);
        } catch (NoSuchMethodException e9) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e9);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e9);
        } catch (InvocationTargetException e10) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e10);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e10);
        }
    }
}
