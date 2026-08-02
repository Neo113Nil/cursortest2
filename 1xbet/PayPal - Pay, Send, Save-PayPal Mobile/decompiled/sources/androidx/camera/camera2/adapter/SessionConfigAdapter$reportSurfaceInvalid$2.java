package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.adapter.SessionConfigAdapter$reportSurfaceInvalid$2", f = "SessionConfigAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SessionConfigAdapter$reportSurfaceInvalid$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.core.impl.SessionConfig getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.core.impl.SessionConfig.ErrorListener errorListener;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.camera.core.impl.SessionConfig sessionConfig = this.getHighSpeedVideoSizes;
        if (sessionConfig != null && (errorListener = sessionConfig.getErrorListener()) != null) {
            errorListener.onError(this.getHighSpeedVideoSizes, androidx.camera.core.impl.SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.adapter.SessionConfigAdapter$reportSurfaceInvalid$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.adapter.SessionConfigAdapter$reportSurfaceInvalid$2(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionConfigAdapter$reportSurfaceInvalid$2(androidx.camera.core.impl.SessionConfig sessionConfig, kotlin.coroutines.Continuation<? super androidx.camera.camera2.adapter.SessionConfigAdapter$reportSurfaceInvalid$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = sessionConfig;
    }
}
