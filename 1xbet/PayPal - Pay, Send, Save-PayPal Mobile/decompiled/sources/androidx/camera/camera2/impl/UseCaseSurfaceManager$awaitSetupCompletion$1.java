package androidx.camera.camera2.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseSurfaceManager", f = "UseCaseSurfaceManager.kt", i = {}, l = {193}, m = "awaitSetupCompletion$suspendImpl", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseSurfaceManager$awaitSetupCompletion$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseSurfaceManager getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return androidx.camera.camera2.impl.UseCaseSurfaceManager.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseSurfaceManager$awaitSetupCompletion$1(androidx.camera.camera2.impl.UseCaseSurfaceManager useCaseSurfaceManager, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseSurfaceManager$awaitSetupCompletion$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = useCaseSurfaceManager;
    }
}
