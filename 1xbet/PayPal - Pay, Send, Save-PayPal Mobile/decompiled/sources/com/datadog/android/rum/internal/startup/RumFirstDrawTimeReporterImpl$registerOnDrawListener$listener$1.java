package com.datadog.android.rum.internal.startup;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "", "onDraw", "()V", "", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1 implements android.view.ViewTreeObserver.OnDrawListener {
    final /* synthetic */ com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl Camera2StreamConfigurationMap;
    final /* synthetic */ android.view.View getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;
    final /* synthetic */ com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter.Callback getHighSpeedVideoSizes;

    RumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1(com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl rumFirstDrawTimeReporterImpl, com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporter.Callback callback, android.view.View view) {
        this.Camera2StreamConfigurationMap = rumFirstDrawTimeReporterImpl;
        this.getHighSpeedVideoSizes = callback;
        this.getHighResolutionOutputSizeshNQ4ISI = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        android.os.Handler handler;
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        this.getHighSpeedVideoSizes = true;
        com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl.access$onFirstDraw(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        handler = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
        final android.view.View view = this.getHighResolutionOutputSizeshNQ4ISI;
        final com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl rumFirstDrawTimeReporterImpl = this.Camera2StreamConfigurationMap;
        handler.post(new java.lang.Runnable() { // from class: com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1.$r8$lambda$onpXFWB4jGyNW6cVvCgZWXvQU9A(view, this, rumFirstDrawTimeReporterImpl);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$onpXFWB4jGyNW6cVvCgZWXvQU9A(android.view.View view, com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1 rumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1, com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl rumFirstDrawTimeReporterImpl) {
        com.datadog.android.api.InternalLogger internalLogger;
        if (view.getViewTreeObserver().isAlive()) {
            try {
                view.getViewTreeObserver().removeOnDrawListener(rumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1);
            } catch (java.lang.IllegalStateException e) {
                internalLogger = rumFirstDrawTimeReporterImpl.getHighSpeedVideoFpsRangesFor;
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1$onDraw$1$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "RumTTIDReporterImpl unable to remove onDrawListener from viewTreeObserver";
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
    }
}
