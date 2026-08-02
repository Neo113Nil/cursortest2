package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.FrameState$ImageOutput", f = "FrameState.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m = "await", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class FrameState$ImageOutput$await$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.pipe.internal.FrameState.ImageOutput getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.await(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameState$ImageOutput$await$1(androidx.camera.camera2.pipe.internal.FrameState.ImageOutput imageOutput, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.FrameState$ImageOutput$await$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = imageOutput;
    }
}
