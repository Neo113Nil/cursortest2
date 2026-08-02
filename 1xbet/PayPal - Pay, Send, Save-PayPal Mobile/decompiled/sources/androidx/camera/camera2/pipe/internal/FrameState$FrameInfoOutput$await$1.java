package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.FrameState$FrameInfoOutput", f = "FrameState.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m = "await", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class FrameState$FrameInfoOutput$await$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.camera.camera2.pipe.internal.FrameState.FrameInfoOutput Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.await(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameState$FrameInfoOutput$await$1(androidx.camera.camera2.pipe.internal.FrameState.FrameInfoOutput frameInfoOutput, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.FrameState$FrameInfoOutput$await$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = frameInfoOutput;
    }
}
