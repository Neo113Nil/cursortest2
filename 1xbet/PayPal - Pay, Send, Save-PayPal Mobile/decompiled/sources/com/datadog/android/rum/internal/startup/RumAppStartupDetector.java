package com.datadog.android.rum.internal.startup;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \t2\u00020\u0001:\u0002\t\nJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumAppStartupDetector;", "", "", "clearPendingScenario", "()V", "destroy", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", "getPendingScenario", "()Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", "Companion", "Listener"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RumAppStartupDetector {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.startup.RumAppStartupDetector.Companion INSTANCE = com.datadog.android.rum.internal.startup.RumAppStartupDetector.Companion.getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumAppStartupDetector$Listener;", "", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl.KEY_SCENARIO, "", "onAppStartupDetected", "(Lcom/datadog/android/rum/internal/startup/RumStartupScenario;)V", "pendingScenario", "Landroid/app/Activity;", "activity", "onNextActivityCreated", "(Lcom/datadog/android/rum/internal/startup/RumStartupScenario;Landroid/app/Activity;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Listener {
        void onAppStartupDetected(com.datadog.android.rum.internal.startup.RumStartupScenario scenario);

        void onNextActivityCreated(com.datadog.android.rum.internal.startup.RumStartupScenario pendingScenario, android.app.Activity activity);
    }

    void clearPendingScenario();

    void destroy();

    /* renamed from: getPendingScenario */
    com.datadog.android.rum.internal.startup.RumStartupScenario getGetHighSpeedVideoSizesFor();

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumAppStartupDetector$Companion;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/startup/RumAppStartupDetector$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/datadog/android/rum/startup/AppStartupActivityPredicate;", "appStartupActivityPredicate", "Lcom/datadog/android/rum/internal/startup/RumAppStartupDetector;", "create", "(Landroid/app/Application;Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/rum/internal/startup/RumAppStartupDetector$Listener;Lcom/datadog/android/rum/startup/AppStartupActivityPredicate;)Lcom/datadog/android/rum/internal/startup/RumAppStartupDetector;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.datadog.android.rum.internal.startup.RumAppStartupDetector.Companion getHighSpeedVideoFpsRanges = new com.datadog.android.rum.internal.startup.RumAppStartupDetector.Companion();

        private Companion() {
        }

        public final com.datadog.android.rum.internal.startup.RumAppStartupDetector create(android.app.Application application, final com.datadog.android.core.InternalSdkCore sdkCore, com.datadog.android.rum.internal.startup.RumAppStartupDetector.Listener listener, com.datadog.android.rum.startup.AppStartupActivityPredicate appStartupActivityPredicate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStartupActivityPredicate, "");
            return new com.datadog.android.rum.internal.startup.RumAppStartupDetectorImpl(application, com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT(), new kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.domain.Time>() { // from class: com.datadog.android.rum.internal.startup.RumAppStartupDetector$Companion$create$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final com.datadog.android.rum.internal.domain.Time invoke() {
                    return com.datadog.android.rum.internal.domain.TimeKt.asTimeNs(com.datadog.android.core.InternalSdkCore.this.getAppStartTimeNs());
                }

                {
                    super(0);
                }
            }, new kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.domain.Time>() { // from class: com.datadog.android.rum.internal.startup.RumAppStartupDetector$Companion$create$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final com.datadog.android.rum.internal.domain.Time invoke() {
                    return new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null);
                }
            }, listener, appStartupActivityPredicate);
        }
    }
}
