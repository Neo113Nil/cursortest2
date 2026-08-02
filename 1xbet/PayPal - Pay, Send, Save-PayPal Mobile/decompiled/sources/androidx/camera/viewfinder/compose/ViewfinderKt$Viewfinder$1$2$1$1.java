package androidx.camera.viewfinder.compose;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/camera/viewfinder/compose/internal/ViewfinderSurfaceCoroutineScope;", "viewfinderSurfaceHolder", "Landroidx/camera/viewfinder/compose/internal/ViewfinderSurfaceHolder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.viewfinder.compose.ViewfinderKt$Viewfinder$1$2$1$1", f = "Viewfinder.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class ViewfinderKt$Viewfinder$1$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceCoroutineScope, androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceHolder, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceHolder viewfinderSurfaceHolder = (androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceHolder) this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(true));
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(viewfinderSurfaceHolder.getRefCountedSurface(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceCoroutineScope viewfinderSurfaceCoroutineScope, androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceHolder viewfinderSurfaceHolder, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.viewfinder.compose.ViewfinderKt$Viewfinder$1$2$1$1 viewfinderKt$Viewfinder$1$2$1$1 = new androidx.camera.viewfinder.compose.ViewfinderKt$Viewfinder$1$2$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        viewfinderKt$Viewfinder$1$2$1$1.getHighSpeedVideoSizes = viewfinderSurfaceHolder;
        return viewfinderKt$Viewfinder$1$2$1$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewfinderKt$Viewfinder$1$2$1$1(androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl viewfinderInitScopeImpl, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super androidx.camera.viewfinder.compose.ViewfinderKt$Viewfinder$1$2$1$1> continuation) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = viewfinderInitScopeImpl;
        this.getHighSpeedVideoFpsRanges = mutableState;
    }
}
