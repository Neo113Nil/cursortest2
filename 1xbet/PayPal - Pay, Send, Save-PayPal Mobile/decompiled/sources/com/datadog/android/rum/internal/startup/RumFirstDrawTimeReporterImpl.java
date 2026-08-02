package com.datadog.android.rum.internal.startup;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 "}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumFirstDrawTimeReporterImpl;", "Lcom/datadog/android/rum/internal/startup/RumFirstDrawTimeReporter;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lkotlin/Function0;", "", "timeProviderNs", "Lcom/datadog/android/rum/internal/utils/window/RumWindowCallbacksRegistry;", "windowCallbacksRegistry", "Landroid/os/Handler;", "handler", "<init>", "(Lcom/datadog/android/api/InternalLogger;Lkotlin/jvm/functions/Function0;Lcom/datadog/android/rum/internal/utils/window/RumWindowCallbacksRegistry;Landroid/os/Handler;)V", "Landroid/app/Activity;", "p0", "Lcom/datadog/android/rum/internal/startup/RumFirstDrawTimeReporter$Callback;", "p1", "", "Camera2StreamConfigurationMap", "(Landroid/app/Activity;Lcom/datadog/android/rum/internal/startup/RumFirstDrawTimeReporter$Callback;)V", "Landroid/view/View;", "getHighSpeedVideoFpsRangesFor", "(Landroid/view/View;Lcom/datadog/android/rum/internal/startup/RumFirstDrawTimeReporter$Callback;)V", "activity", com.sun.jna.Callback.METHOD_NAME, "subscribeToFirstFrameDrawn", "getHighSpeedVideoFpsRanges", "Landroid/os/Handler;", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/rum/internal/utils/window/RumWindowCallbacksRegistry;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumFirstDrawTimeReporterImpl implements com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.os.Handler Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.utils.window.RumWindowCallbacksRegistry getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Long> getHighResolutionOutputSizeshNQ4ISI;

    public RumFirstDrawTimeReporterImpl(com.datadog.android.api.InternalLogger internalLogger, kotlin.jvm.functions.Function0<java.lang.Long> function0, com.datadog.android.rum.internal.utils.window.RumWindowCallbacksRegistry rumWindowCallbacksRegistry, android.os.Handler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumWindowCallbacksRegistry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        this.getHighSpeedVideoFpsRangesFor = internalLogger;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoFpsRanges = rumWindowCallbacksRegistry;
        this.Camera2StreamConfigurationMap = handler;
    }

    @Override // com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter
    public final void subscribeToFirstFrameDrawn(final android.app.Activity activity, final com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        if (activity.getWindow().peekDecorView() == null) {
            this.getHighSpeedVideoFpsRanges.addListener(activity, new com.datadog.android.rum.internal.utils.window.RumWindowCallbackListener() { // from class: com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl$subscribeToFirstFrameDrawn$listener$1
                @Override // com.datadog.android.rum.internal.utils.window.RumWindowCallbackListener
                public final void onContentChanged() {
                    com.datadog.android.rum.internal.utils.window.RumWindowCallbacksRegistry rumWindowCallbacksRegistry;
                    rumWindowCallbacksRegistry = com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl.this.getHighSpeedVideoFpsRanges;
                    rumWindowCallbacksRegistry.removeListener(activity, this);
                    com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl.this.Camera2StreamConfigurationMap(activity, callback);
                }
            });
        } else {
            Camera2StreamConfigurationMap(activity, callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(android.app.Activity p0, final com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter.Callback p1) {
        final android.view.View decorView = p0.getWindow().getDecorView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decorView, "");
        if (decorView.isAttachedToWindow()) {
            getHighSpeedVideoFpsRangesFor(decorView, p1);
        } else {
            decorView.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl$onDecorViewReady$attachListener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(android.view.View v) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "");
                    com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl.this.getHighSpeedVideoFpsRangesFor(decorView, p1);
                    decorView.removeOnAttachStateChangeListener(this);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(android.view.View v) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(android.view.View p0, com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter.Callback p1) {
        com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1 rumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1 = new com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1(this, p1, p0);
        if (p0.getViewTreeObserver().isAlive()) {
            try {
                p0.getViewTreeObserver().addOnDrawListener(rumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1);
            } catch (java.lang.IllegalStateException e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl$registerOnDrawListener$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "RumFirstDrawTimeReporterImpl unable to add onDrawListener onto viewTreeObserver";
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
    }

    public static final /* synthetic */ void access$onFirstDraw(com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl rumFirstDrawTimeReporterImpl, final com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter.Callback callback) {
        final long longValue = rumFirstDrawTimeReporterImpl.getHighResolutionOutputSizeshNQ4ISI.invoke().longValue();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter.Callback.this.onFirstFrameDrawn(longValue);
            }
        };
        android.os.Handler handler = rumFirstDrawTimeReporterImpl.Camera2StreamConfigurationMap;
        android.os.Message obtain = android.os.Message.obtain(handler, runnable);
        obtain.setAsynchronous(true);
        handler.sendMessageAtFrontOfQueue(obtain);
    }
}
