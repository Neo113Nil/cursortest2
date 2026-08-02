package androidx.camera.viewfinder.compose;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl", f = "Viewfinder.kt", i = {}, l = {317}, m = "dispatchOnSurfaceSession", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class ViewfinderInitScopeImpl$dispatchOnSurfaceSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewfinderInitScopeImpl$dispatchOnSurfaceSession$1(androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl viewfinderInitScopeImpl, kotlin.coroutines.Continuation<? super androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$dispatchOnSurfaceSession$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = viewfinderInitScopeImpl;
    }
}
