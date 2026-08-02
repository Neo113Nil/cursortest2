package androidx.camera.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/camera/viewfinder/core/ViewfinderSurfaceSessionScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1", f = "CameraXViewfinder.kt", i = {0, 0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE}, m = "invokeSuspend", n = {"$this$onSurfaceSession", "$this$invokeSuspend_u24lambda_u240", "$this$onSurfaceSession", "$this$invokeSuspend_u24lambda_u240"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.compose.SurfaceRequestScope getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x00ac, code lost:
    
        if (kotlinx.coroutines.CoroutineScopeKt.isActive(r2) != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00a2 -> B:6:0x001f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope viewfinderSurfaceSessionScope;
        androidx.camera.compose.SurfaceRequestScope surfaceRequestScope;
        kotlinx.coroutines.channels.ChannelIterator<androidx.camera.core.SurfaceRequest> it;
        java.lang.Object obj2;
        androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope viewfinderSurfaceSessionScope2;
        kotlinx.coroutines.channels.ChannelIterator<androidx.camera.core.SurfaceRequest> channelIterator;
        kotlinx.coroutines.Job launch$default;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            viewfinderSurfaceSessionScope = (androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope) this.getHighSpeedVideoSizes;
            surfaceRequestScope = this.getHighResolutionOutputSizeshNQ4ISI;
            it = surfaceRequestScope.getHighSpeedVideoSizes().iterator();
            this.getHighSpeedVideoSizes = viewfinderSurfaceSessionScope;
            this.Camera2StreamConfigurationMap = surfaceRequestScope;
            this.getHighSpeedVideoFpsRanges = it;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj2 = it.hasNext(this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            kotlinx.coroutines.channels.ChannelIterator<androidx.camera.core.SurfaceRequest> channelIterator2 = it;
            viewfinderSurfaceSessionScope2 = viewfinderSurfaceSessionScope;
            channelIterator = channelIterator2;
            if (((java.lang.Boolean) obj2).booleanValue()) {
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i == 1) {
            channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRanges;
            surfaceRequestScope = (androidx.camera.compose.SurfaceRequestScope) this.Camera2StreamConfigurationMap;
            viewfinderSurfaceSessionScope2 = (androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = obj;
            if (((java.lang.Boolean) obj2).booleanValue()) {
                androidx.camera.core.SurfaceRequest next = channelIterator.next();
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(viewfinderSurfaceSessionScope2, null, null, new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$cancellationWatcherJob$1(next, null), 3, null);
                kotlinx.coroutines.NonCancellable nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$1 cameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$1 = new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$1(surfaceRequestScope, next, viewfinderSurfaceSessionScope2, launch$default, null);
                this.getHighSpeedVideoSizes = viewfinderSurfaceSessionScope2;
                this.Camera2StreamConfigurationMap = surfaceRequestScope;
                this.getHighSpeedVideoFpsRanges = channelIterator;
                this.getHighSpeedVideoFpsRangesFor = 2;
                if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, cameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope viewfinderSurfaceSessionScope3 = viewfinderSurfaceSessionScope2;
                it = channelIterator;
                viewfinderSurfaceSessionScope = viewfinderSurfaceSessionScope3;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 2) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRanges;
        surfaceRequestScope = (androidx.camera.compose.SurfaceRequestScope) this.Camera2StreamConfigurationMap;
        viewfinderSurfaceSessionScope2 = (androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope) this.getHighSpeedVideoSizes;
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope viewfinderSurfaceSessionScope32 = viewfinderSurfaceSessionScope2;
        it = channelIterator;
        viewfinderSurfaceSessionScope = viewfinderSurfaceSessionScope32;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope viewfinderSurfaceSessionScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1) create(viewfinderSurfaceSessionScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1 cameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1 = new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        cameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1.getHighSpeedVideoSizes = obj;
        return cameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1(androidx.camera.compose.SurfaceRequestScope surfaceRequestScope, kotlin.coroutines.Continuation<? super androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = surfaceRequestScope;
    }
}
