package androidx.camera.camera2.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseCameraState", f = "UseCaseCameraState.kt", i = {0}, l = {150}, m = "updateAsync-Tp9XwKQ", n = {"result"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseCameraState$updateAsync$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraState getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.m143updateAsyncTp9XwKQ(null, false, null, false, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseCameraState$updateAsync$1(androidx.camera.camera2.impl.UseCaseCameraState useCaseCameraState, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseCameraState$updateAsync$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = useCaseCameraState;
    }
}
