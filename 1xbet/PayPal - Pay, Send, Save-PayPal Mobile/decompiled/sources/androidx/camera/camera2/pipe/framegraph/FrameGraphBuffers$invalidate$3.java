package androidx.camera.camera2.pipe.framegraph;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "session", "Landroidx/camera/camera2/pipe/CameraGraph$Session;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers$invalidate$3", f = "FrameGraphBuffers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class FrameGraphBuffers$invalidate$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.camera.camera2.pipe.CameraGraph.Session, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Set set;
        java.util.Map map;
        java.util.Map map2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.camera.camera2.pipe.CameraGraph.Session session = (androidx.camera.camera2.pipe.CameraGraph.Session) this.getHighSpeedVideoFpsRangesFor;
            set = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            java.util.List list = kotlin.collections.CollectionsKt.toList(set);
            map = this.getHighSpeedVideoFpsRanges.getInputFormats;
            java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> filterToCaptureRequestParameters = androidx.camera.camera2.pipe.RequestsKt.filterToCaptureRequestParameters(map);
            map2 = this.getHighSpeedVideoFpsRanges.getInputFormats;
            session.startRepeating(new androidx.camera.camera2.pipe.Request(list, filterToCaptureRequestParameters, androidx.camera.camera2.pipe.RequestsKt.filterToMetadataParameters(map2), null, null, null, 56, null));
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.camera.camera2.pipe.CameraGraph.Session session, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers$invalidate$3 frameGraphBuffers$invalidate$3 = new androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers$invalidate$3(this.getHighSpeedVideoFpsRanges, continuation);
        frameGraphBuffers$invalidate$3.getHighSpeedVideoFpsRangesFor = session;
        return frameGraphBuffers$invalidate$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameGraphBuffers$invalidate$3(androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers frameGraphBuffers, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers$invalidate$3> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRanges = frameGraphBuffers;
    }
}
