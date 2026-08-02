package androidx.camera.viewfinder.compose.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/camera/viewfinder/compose/internal/BaseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1;", "Landroidx/camera/viewfinder/compose/internal/ViewfinderSurfaceCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BaseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 implements androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceCoroutineScope, kotlinx.coroutines.CoroutineScope {
    private final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;

    BaseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1(kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.getHighSpeedVideoSizes = coroutineScope;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.getHighSpeedVideoSizes.getCoroutineContext();
    }
}
