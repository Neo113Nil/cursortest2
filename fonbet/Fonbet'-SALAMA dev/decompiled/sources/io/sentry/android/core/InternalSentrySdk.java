package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISerializer;
import io.sentry.PropagationContext;
import io.sentry.ScopeCallback;
import io.sentry.ScopeType;
import io.sentry.ScopesAdapter;
import io.sentry.Sentry;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.android.core.performance.ActivityLifecycleTimeSpan;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.cache.EnvelopeCache;
import io.sentry.protocol.App;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.MapObjectWriter;
import io.sentry.util.TracingUtils;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class InternalSentrySdk {
    private static void addTimeSpanToSerializedSpans(TimeSpan timeSpan, List<Map<String, Object>> list) {
        if (timeSpan.hasNotStarted()) {
            ScopesAdapter.getInstance().getOptions().getLogger().log(SentryLevel.WARNING, "Can not convert not-started TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        if (timeSpan.hasNotStopped()) {
            ScopesAdapter.getInstance().getOptions().getLogger().log(SentryLevel.WARNING, "Can not convert not-stopped TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("description", timeSpan.getDescription());
        hashMap.put("start_timestamp_ms", Long.valueOf(timeSpan.getStartTimestampMs()));
        hashMap.put("end_timestamp_ms", Long.valueOf(timeSpan.getProjectedStopTimestampMs()));
        list.add(hashMap);
    }

    public static SentryId captureEnvelope(byte[] bArr, boolean z4) {
        ScopesAdapter scopesAdapter = ScopesAdapter.getInstance();
        SentryOptions options = scopesAdapter.getOptions();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ISerializer serializer = options.getSerializer();
                SentryEnvelope read = options.getEnvelopeReader().read(byteArrayInputStream);
                if (read == null) {
                    byteArrayInputStream.close();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Session.State state = null;
                boolean z7 = false;
                for (SentryEnvelopeItem sentryEnvelopeItem : read.getItems()) {
                    arrayList.add(sentryEnvelopeItem);
                    SentryEvent event = sentryEnvelopeItem.getEvent(serializer);
                    if (event != null) {
                        if (event.isCrashed()) {
                            state = Session.State.Crashed;
                        }
                        if (event.isCrashed() || event.isErrored()) {
                            z7 = true;
                        }
                    }
                }
                Session updateSession = updateSession(scopesAdapter, options, state, z7);
                if (updateSession != null) {
                    arrayList.add(SentryEnvelopeItem.fromSession(serializer, updateSession));
                    deleteCurrentSessionFile(options, (z4 && scopesAdapter.getOptions().getThreadChecker().isMainThread()) ? false : true);
                    if (z4) {
                        scopesAdapter.startSession();
                    }
                }
                SentryId captureEnvelope = scopesAdapter.captureEnvelope(new SentryEnvelope(read.getHeader(), arrayList));
                byteArrayInputStream.close();
                return captureEnvelope;
            } finally {
            }
        } catch (Throwable th) {
            options.getLogger().log(SentryLevel.ERROR, "Failed to capture envelope", th);
            return null;
        }
    }

    private static void deleteCurrentSessionFile(SentryOptions sentryOptions, boolean z4) {
        if (z4) {
            deleteCurrentSessionFile(sentryOptions);
            return;
        }
        try {
            sentryOptions.getExecutorService().submit(new d(sentryOptions, 4));
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.WARNING, "Submission of deletion of the current session file rejected.", th);
        }
    }

    public static Map<String, Object> getAppStartMeasurement() {
        AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
        ArrayList arrayList = new ArrayList();
        addTimeSpanToSerializedSpans(appStartMetrics.createProcessInitSpan(), arrayList);
        addTimeSpanToSerializedSpans(appStartMetrics.getApplicationOnCreateTimeSpan(), arrayList);
        Iterator<TimeSpan> it = appStartMetrics.getContentProviderOnCreateTimeSpans().iterator();
        while (it.hasNext()) {
            addTimeSpanToSerializedSpans(it.next(), arrayList);
        }
        for (ActivityLifecycleTimeSpan activityLifecycleTimeSpan : appStartMetrics.getActivityLifecycleTimeSpans()) {
            addTimeSpanToSerializedSpans(activityLifecycleTimeSpan.getOnCreate(), arrayList);
            addTimeSpanToSerializedSpans(activityLifecycleTimeSpan.getOnStart(), arrayList);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(SentryTransaction.JsonKeys.SPANS, arrayList);
        hashMap.put("type", appStartMetrics.getAppStartType().toString().toLowerCase(Locale.ROOT));
        if (appStartMetrics.getAppStartTimeSpan().hasStarted()) {
            hashMap.put("app_start_timestamp_ms", Long.valueOf(appStartMetrics.getAppStartTimeSpan().getStartTimestampMs()));
        }
        return hashMap;
    }

    public static IScope getCurrentScope() {
        AtomicReference atomicReference = new AtomicReference();
        ScopesAdapter.getInstance().configureScope(ScopeType.COMBINED, new i(atomicReference, 3));
        return (IScope) atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCurrentScope$0(AtomicReference atomicReference, IScope iScope) {
        atomicReference.set(iScope.m9clone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateSession$2(Session.State state, boolean z4, AtomicReference atomicReference, SentryOptions sentryOptions, IScope iScope) {
        Session session = iScope.getSession();
        if (session == null) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "Session is null on updateSession", new Object[0]);
        } else if (session.update(state, null, z4, null)) {
            if (session.getStatus() == Session.State.Crashed) {
                session.end();
                iScope.clearSession();
            }
            atomicReference.set(session);
        }
    }

    public static Map<String, Object> serializeScope(Context context, SentryAndroidOptions sentryAndroidOptions, IScope iScope) {
        HashMap hashMap = new HashMap();
        if (iScope == null) {
            return hashMap;
        }
        try {
            ILogger logger = sentryAndroidOptions.getLogger();
            MapObjectWriter mapObjectWriter = new MapObjectWriter(hashMap);
            DeviceInfoUtil deviceInfoUtil = DeviceInfoUtil.getInstance(context, sentryAndroidOptions);
            iScope.getContexts().setDevice(deviceInfoUtil.collectDeviceInformation(true, true));
            iScope.getContexts().setOperatingSystem(deviceInfoUtil.getOperatingSystem());
            User user = iScope.getUser();
            if (user == null) {
                user = new User();
                iScope.setUser(user);
            }
            if (user.getId() == null) {
                try {
                    user.setId(Installation.id(context));
                } catch (RuntimeException e7) {
                    logger.log(SentryLevel.ERROR, "Could not retrieve installation ID", e7);
                }
            }
            App app = iScope.getContexts().getApp();
            if (app == null) {
                app = new App();
            }
            app.setAppName(ContextUtils.getApplicationName(context));
            TimeSpan appStartTimeSpanWithFallback = AppStartMetrics.getInstance().getAppStartTimeSpanWithFallback(sentryAndroidOptions);
            if (appStartTimeSpanWithFallback.hasStarted()) {
                app.setAppStartTime(DateUtils.toUtilDate(appStartTimeSpanWithFallback.getStartTimestamp()));
            }
            BuildInfoProvider buildInfoProvider = new BuildInfoProvider(sentryAndroidOptions.getLogger());
            PackageInfo packageInfo = ContextUtils.getPackageInfo(context, 4096, sentryAndroidOptions.getLogger(), buildInfoProvider);
            if (packageInfo != null) {
                ContextUtils.setAppPackageInfo(packageInfo, buildInfoProvider, deviceInfoUtil, app);
            }
            iScope.getContexts().setApp(app);
            mapObjectWriter.name(SentryBaseEvent.JsonKeys.USER).value(logger, iScope.getUser());
            mapObjectWriter.name("contexts").value(logger, iScope.getContexts());
            mapObjectWriter.name("tags").value(logger, iScope.getTags());
            mapObjectWriter.name("extras").value(logger, iScope.getExtras());
            mapObjectWriter.name(SentryEvent.JsonKeys.FINGERPRINT).value(logger, iScope.getFingerprint());
            mapObjectWriter.name("level").value(logger, iScope.getLevel());
            mapObjectWriter.name(SentryBaseEvent.JsonKeys.BREADCRUMBS).value(logger, iScope.getBreadcrumbs());
            return hashMap;
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Could not serialize scope.", th);
            return new HashMap();
        }
    }

    public static void setTrace(String str, String str2, Double d7, Double d8) {
        TracingUtils.setTrace(Sentry.getCurrentScopes(), PropagationContext.fromExistingTrace(str, str2, d7, d8));
    }

    private static Session updateSession(IScopes iScopes, final SentryOptions sentryOptions, final Session.State state, final boolean z4) {
        final AtomicReference atomicReference = new AtomicReference();
        iScopes.configureScope(new ScopeCallback() { // from class: io.sentry.android.core.p
            @Override // io.sentry.ScopeCallback
            public final void run(IScope iScope) {
                InternalSentrySdk.lambda$updateSession$2(Session.State.this, z4, atomicReference, sentryOptions, iScope);
            }
        });
        return (Session) atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void deleteCurrentSessionFile(SentryOptions sentryOptions) {
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "Cache dir is not set, not deleting the current session.", new Object[0]);
        } else if (!sentryOptions.isEnableAutoSessionTracking()) {
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "Session tracking is disabled, bailing from deleting current session file.", new Object[0]);
        } else {
            if (EnvelopeCache.getCurrentSessionFile(cacheDirPath).delete()) {
                return;
            }
            sentryOptions.getLogger().log(SentryLevel.WARNING, "Failed to delete the current session file.", new Object[0]);
        }
    }
}
