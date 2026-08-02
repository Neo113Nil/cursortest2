package com.datadog.android.rum.internal.utils.window;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/utils/window/RumWindowCallback;", "Lcom/datadog/android/internal/utils/FixedWindowCallback;", "Landroid/view/Window$Callback;", "p0", "<init>", "(Landroid/view/Window$Callback;)V", "", "onContentChanged", "()V", "Lcom/datadog/android/internal/utils/DDCoreSubscription;", "Lcom/datadog/android/rum/internal/utils/window/RumWindowCallbackListener;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/internal/utils/DDCoreSubscription;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Landroid/view/Window$Callback;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class RumWindowCallback extends com.datadog.android.internal.utils.FixedWindowCallback {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final com.datadog.android.internal.utils.DDCoreSubscription<com.datadog.android.rum.internal.utils.window.RumWindowCallbackListener> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final android.view.Window.Callback Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RumWindowCallback(android.view.Window.Callback callback) {
        super(callback);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        this.Camera2StreamConfigurationMap = callback;
        this.getHighResolutionOutputSizeshNQ4ISI = com.datadog.android.internal.utils.DDCoreSubscription.INSTANCE.create();
    }

    @Override // com.datadog.android.internal.utils.FixedWindowCallback, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        this.getHighResolutionOutputSizeshNQ4ISI.notifyListeners(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.utils.window.RumWindowCallbackListener, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.utils.window.RumWindowCallback$onContentChanged$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.utils.window.RumWindowCallbackListener rumWindowCallbackListener) {
                getHighSpeedVideoFpsRanges(rumWindowCallbackListener);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(com.datadog.android.rum.internal.utils.window.RumWindowCallbackListener rumWindowCallbackListener) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumWindowCallbackListener, "");
                rumWindowCallbackListener.onContentChanged();
            }
        });
    }
}
