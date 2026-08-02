package androidx.camera.camera2.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseSurfaceManager", f = "UseCaseSurfaceManager.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, m = "getSurfaces", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseSurfaceManager$getSurfaces$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseSurfaceManager getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return androidx.camera.camera2.impl.UseCaseSurfaceManager.access$getSurfaces(this.getHighResolutionOutputSizeshNQ4ISI, null, 0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseSurfaceManager$getSurfaces$1(androidx.camera.camera2.impl.UseCaseSurfaceManager useCaseSurfaceManager, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = useCaseSurfaceManager;
    }
}
