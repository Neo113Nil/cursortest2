package androidx.camera.camera2.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.FlashControl", f = "FlashControl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, m = "stopScreenFlashCaptureTasks", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class FlashControl$stopScreenFlashCaptureTasks$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.impl.FlashControl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.stopScreenFlashCaptureTasks(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashControl$stopScreenFlashCaptureTasks$1(androidx.camera.camera2.impl.FlashControl flashControl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = flashControl;
    }
}
