package androidx.camera.camera2.pipe.framegraph;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "session", "Landroidx/camera/camera2/pipe/CameraGraph$Session;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers$invalidate$2", f = "FrameGraphBuffers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class FrameGraphBuffers$invalidate$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.camera.camera2.pipe.CameraGraph.Session, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        ((androidx.camera.camera2.pipe.CameraGraph.Session) this.getHighSpeedVideoFpsRangesFor).stopRepeating();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.camera.camera2.pipe.CameraGraph.Session session, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers$invalidate$2 frameGraphBuffers$invalidate$2 = new androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers$invalidate$2(continuation);
        frameGraphBuffers$invalidate$2.getHighSpeedVideoFpsRangesFor = session;
        return frameGraphBuffers$invalidate$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    FrameGraphBuffers$invalidate$2(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers$invalidate$2> continuation) {
        super(3, continuation);
    }
}
