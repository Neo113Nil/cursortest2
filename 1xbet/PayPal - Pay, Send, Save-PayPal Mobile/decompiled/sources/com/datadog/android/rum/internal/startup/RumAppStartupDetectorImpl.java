package com.datadog.android.rum.internal.startup;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0003\b\u0000\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BBC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010\u001fJ!\u0010!\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\"\u0010\u001fJ\u001f\u0010$\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010\u001dJ\u0017\u0010%\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010\u001fJ\u0017\u0010&\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b&\u0010\u001fJ!\u0010)\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b)\u0010\u001dR\u0014\u0010,\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010-\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00100R\u0014\u0010*\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00101R\u0016\u0010)\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00106\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010.R,\u0010=\u001a\u001a\u0012\b\u0012\u0006*\u00020\u00180\u0018*\f\u0012\b\u0012\u0006*\u00020\u00180\u00180?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumAppStartupDetectorImpl;", "Lcom/datadog/android/rum/internal/startup/RumAppStartupDetector;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Application;", "application", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "Lkotlin/Function0;", "Lcom/datadog/android/rum/internal/domain/Time;", "appStartupTimeProvider", "timeProvider", "Lcom/datadog/android/rum/internal/startup/RumAppStartupDetector$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/datadog/android/rum/startup/AppStartupActivityPredicate;", "appStartupActivityPredicate", "<init>", "(Landroid/app/Application;Lcom/datadog/android/internal/system/BuildSdkVersionProvider;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/datadog/android/rum/internal/startup/RumAppStartupDetector$Listener;Lcom/datadog/android/rum/startup/AppStartupActivityPredicate;)V", "", "clearPendingScenario", "()V", "destroy", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", "getPendingScenario", "()Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityDestroyed", "(Landroid/app/Activity;)V", "onActivityPaused", "onActivityPreCreated", "onActivityResumed", "outState", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "p0", "p1", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/rum/startup/AppStartupActivityPredicate;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/app/Application;", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "", "getOutputMinFrameDuration", "Z", "getInputFormats", "getInputSizeshNQ4ISI", "Lcom/datadog/android/rum/internal/startup/RumAppStartupDetector$Listener;", "", "getOutputFormats", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizesFor", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", "getOutputStallDurationlomOqCM", "", "", "getOutputStallDuration", "Ljava/util/Set;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumAppStartupDetectorImpl implements com.datadog.android.rum.internal.startup.RumAppStartupDetector, android.app.Application.ActivityLifecycleCallbacks {
    private static final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.internal.system.BuildSdkVersionProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.domain.Time> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.rum.startup.AppStartupActivityPredicate getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.app.Application getHighSpeedVideoFpsRanges;
    private com.datadog.android.rum.internal.startup.RumStartupScenario getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private final com.datadog.android.rum.internal.startup.RumAppStartupDetector.Listener getInputSizeshNQ4ISI;
    private int getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final java.util.Set<android.app.Activity> getOutputStallDurationlomOqCM;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.domain.Time> getOutputMinFrameDuration;

    public RumAppStartupDetectorImpl(android.app.Application application, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.domain.Time> function0, kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.domain.Time> function02, com.datadog.android.rum.internal.startup.RumAppStartupDetector.Listener listener, com.datadog.android.rum.startup.AppStartupActivityPredicate appStartupActivityPredicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStartupActivityPredicate, "");
        this.getHighSpeedVideoFpsRanges = application;
        this.getHighSpeedVideoFpsRangesFor = buildSdkVersionProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getOutputMinFrameDuration = function02;
        this.getInputSizeshNQ4ISI = listener;
        this.getHighSpeedVideoSizes = appStartupActivityPredicate;
        this.getInputFormats = true;
        this.getOutputStallDurationlomOqCM = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        if (this.getHighSpeedVideoFpsRangesFor.getIsAtLeastQ()) {
            Camera2StreamConfigurationMap(activity, savedInstanceState);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        if (this.getHighSpeedVideoFpsRangesFor.getIsAtLeastQ()) {
            return;
        }
        Camera2StreamConfigurationMap(activity, savedInstanceState);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        this.getOutputFormats--;
        this.getOutputStallDurationlomOqCM.remove(activity);
        if (this.getOutputFormats == 0) {
            this.Camera2StreamConfigurationMap = activity.isChangingConfigurations();
        }
    }

    private final void Camera2StreamConfigurationMap(android.app.Activity p0, android.os.Bundle p1) {
        boolean z;
        com.datadog.android.rum.internal.startup.RumStartupScenario.WarmAfterActivityDestroyed warmAfterActivityDestroyed;
        this.getOutputFormats++;
        com.datadog.android.rum.internal.domain.Time invoke = this.getOutputMinFrameDuration.invoke();
        boolean shouldTrackStartup = this.getHighSpeedVideoSizes.shouldTrackStartup(p0);
        if (shouldTrackStartup) {
            this.getOutputStallDurationlomOqCM.add(p0);
        }
        com.datadog.android.rum.internal.startup.RumStartupScenario rumStartupScenario = this.getHighSpeedVideoSizesFor;
        if (rumStartupScenario != null && invoke.getNanoTime() - rumStartupScenario.getInitialTime().getNanoTime() > com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl.INSTANCE.getMAX_TTID_DURATION_NS$dd_sdk_android_rum_release()) {
            this.getHighSpeedVideoSizesFor = null;
        }
        if (this.getOutputStallDurationlomOqCM.size() == 1 && !this.Camera2StreamConfigurationMap && shouldTrackStartup && this.getHighSpeedVideoSizesFor == null) {
            com.datadog.android.rum.internal.domain.Time invoke2 = this.getHighResolutionOutputSizeshNQ4ISI.invoke();
            long nanoTime = invoke.getNanoTime() - invoke2.getNanoTime();
            boolean z2 = p1 != null;
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(p0);
            if (!this.getInputFormats) {
                z = false;
                warmAfterActivityDestroyed = new com.datadog.android.rum.internal.startup.RumStartupScenario.WarmAfterActivityDestroyed(z2, weakReference, invoke);
            } else if (nanoTime > getHighResolutionOutputSizeshNQ4ISI) {
                warmAfterActivityDestroyed = new com.datadog.android.rum.internal.startup.RumStartupScenario.WarmFirstActivity(z2, weakReference, nanoTime, invoke);
                z = false;
            } else {
                z = false;
                warmAfterActivityDestroyed = new com.datadog.android.rum.internal.startup.RumStartupScenario.Cold(z2, weakReference, nanoTime, invoke2);
            }
            this.getHighSpeedVideoSizesFor = warmAfterActivityDestroyed;
            this.getInputSizeshNQ4ISI.onAppStartupDetected(warmAfterActivityDestroyed);
            this.getInputFormats = z;
        }
        com.datadog.android.rum.internal.startup.RumStartupScenario rumStartupScenario2 = this.getHighSpeedVideoSizesFor;
        if (rumStartupScenario2 == null || !shouldTrackStartup || rumStartupScenario2.getActivity().get() == p0) {
            return;
        }
        this.getInputSizeshNQ4ISI.onNextActivityCreated(rumStartupScenario2, p0);
    }

    @Override // com.datadog.android.rum.internal.startup.RumAppStartupDetector
    /* renamed from: getPendingScenario, reason: from getter */
    public final com.datadog.android.rum.internal.startup.RumStartupScenario getGetHighSpeedVideoSizesFor() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // com.datadog.android.rum.internal.startup.RumAppStartupDetector
    public final void clearPendingScenario() {
        this.getHighSpeedVideoSizesFor = null;
    }

    @Override // com.datadog.android.rum.internal.startup.RumAppStartupDetector
    public final void destroy() {
        this.getHighSpeedVideoSizesFor = null;
        this.getHighSpeedVideoFpsRanges.unregisterActivityLifecycleCallbacks(this);
    }

    static {
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.time.Duration.m23955getInWholeNanosecondsimpl(kotlin.time.DurationKt.toDuration(10, kotlin.time.DurationUnit.SECONDS));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }
}
