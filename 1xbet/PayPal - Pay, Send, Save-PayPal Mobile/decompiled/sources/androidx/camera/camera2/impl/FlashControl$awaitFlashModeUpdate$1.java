package androidx.camera.camera2.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.FlashControl", f = "FlashControl.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE}, m = "awaitFlashModeUpdate", n = {"initialFlashMode"}, s = {"I$0"}, v = 1)
/* loaded from: classes6.dex */
final class FlashControl$awaitFlashModeUpdate$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.impl.FlashControl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.awaitFlashModeUpdate(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashControl$awaitFlashModeUpdate$1(androidx.camera.camera2.impl.FlashControl flashControl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.FlashControl$awaitFlashModeUpdate$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = flashControl;
    }
}
