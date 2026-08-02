package androidx.camera.viewfinder.compose;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\f\u001a\u00020\t2'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R9\u0010\u0015\u001a%\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0006¢\u0006\u0002\b\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/camera/viewfinder/compose/ViewfinderInitScopeImpl;", "Landroidx/camera/viewfinder/compose/ViewfinderInitScope;", "Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "p0", "<init>", "(Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;)V", "Lkotlin/Function2;", "Landroidx/camera/viewfinder/core/ViewfinderSurfaceSessionScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onSurfaceSession", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/camera/viewfinder/core/impl/RefCounted;", "Landroid/view/Surface;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/camera/viewfinder/core/impl/RefCounted;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ViewfinderInitScopeImpl implements androidx.camera.viewfinder.compose.ViewfinderInitScope {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function2<? super androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.viewfinder.core.ViewfinderSurfaceRequest Camera2StreamConfigurationMap;

    public ViewfinderInitScopeImpl(androidx.camera.viewfinder.core.ViewfinderSurfaceRequest viewfinderSurfaceRequest) {
        this.Camera2StreamConfigurationMap = viewfinderSurfaceRequest;
    }

    @Override // androidx.camera.viewfinder.compose.ViewfinderInitScope
    public final void onSurfaceSession(kotlin.jvm.functions.Function2<? super androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> p0) {
        this.getHighSpeedVideoSizes = p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.camera.viewfinder.core.impl.RefCounted, androidx.camera.viewfinder.core.impl.RefCounted<android.view.Surface>] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(final androidx.camera.viewfinder.core.impl.RefCounted<android.view.Surface> refCounted, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$dispatchOnSurfaceSession$1 viewfinderInitScopeImpl$dispatchOnSurfaceSession$1;
        int i;
        android.view.Surface surface;
        try {
            if (continuation instanceof androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$dispatchOnSurfaceSession$1) {
                viewfinderInitScopeImpl$dispatchOnSurfaceSession$1 = (androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$dispatchOnSurfaceSession$1) continuation;
                if ((viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.jvm.functions.Function2<? super androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2 = this.getHighSpeedVideoSizes;
                        if (function2 != null && (surface = (android.view.Surface) refCounted.acquire()) != null) {
                            androidx.camera.viewfinder.core.impl.ViewfinderSurfaceSessionImpl viewfinderSurfaceSessionImpl = new androidx.camera.viewfinder.core.impl.ViewfinderSurfaceSessionImpl(surface, this.Camera2StreamConfigurationMap, new kotlin.jvm.functions.Function0() { // from class: androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl.getHighResolutionOutputSizeshNQ4ISI(androidx.camera.viewfinder.core.impl.RefCounted.this);
                                }
                            });
                            androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1 viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1 = new androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1(function2, viewfinderSurfaceSessionImpl, null);
                            viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.Camera2StreamConfigurationMap = viewfinderSurfaceSessionImpl;
                            viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.getHighSpeedVideoSizes = 1;
                            refCounted = viewfinderSurfaceSessionImpl;
                            if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1, viewfinderInitScopeImpl$dispatchOnSurfaceSession$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.AutoCloseable autoCloseable = (java.lang.AutoCloseable) viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    refCounted = autoCloseable;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.jdk7.AutoCloseableKt.closeFinally(refCounted, null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            kotlin.jdk7.AutoCloseableKt.closeFinally(refCounted, null);
            return kotlin.Unit.INSTANCE;
        } finally {
        }
        viewfinderInitScopeImpl$dispatchOnSurfaceSession$1 = new androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$dispatchOnSurfaceSession$1(this, continuation);
        java.lang.Object obj2 = viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = viewfinderInitScopeImpl$dispatchOnSurfaceSession$1.getHighSpeedVideoSizes;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.camera.viewfinder.core.impl.RefCounted refCounted) {
        refCounted.release();
        return kotlin.Unit.INSTANCE;
    }
}
