package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "request", "Lio/ktor/client/request/HttpRequest;", "cause"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$3", f = "HttpCallValidator.kt", i = {0}, l = {135}, m = "invokeSuspend", n = {"unwrappedCause"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class HttpCallValidatorKt$HttpCallValidator$2$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequest, java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Throwable>, java.lang.Object> {
    final /* synthetic */ java.util.List<io.ktor.client.plugins.HandlerWrapper> Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Throwable th = (java.lang.Throwable) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            return th;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        io.ktor.client.request.HttpRequest httpRequest = (io.ktor.client.request.HttpRequest) this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable unwrapCancellationException = io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException((java.lang.Throwable) this.getHighSpeedVideoFpsRanges);
        this.getHighResolutionOutputSizeshNQ4ISI = unwrapCancellationException;
        this.getHighSpeedVideoSizes = 1;
        return io.ktor.client.plugins.HttpCallValidatorKt.access$HttpCallValidator$lambda$2$processException(this.Camera2StreamConfigurationMap, unwrapCancellationException, httpRequest, this) == coroutine_suspended ? coroutine_suspended : unwrapCancellationException;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.request.HttpRequest httpRequest, java.lang.Throwable th, kotlin.coroutines.Continuation<? super java.lang.Throwable> continuation) {
        io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$3 httpCallValidatorKt$HttpCallValidator$2$3 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$3(this.Camera2StreamConfigurationMap, continuation);
        httpCallValidatorKt$HttpCallValidator$2$3.getHighResolutionOutputSizeshNQ4ISI = httpRequest;
        httpCallValidatorKt$HttpCallValidator$2$3.getHighSpeedVideoFpsRanges = th;
        return httpCallValidatorKt$HttpCallValidator$2$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HttpCallValidatorKt$HttpCallValidator$2$3(java.util.List<? extends io.ktor.client.plugins.HandlerWrapper> list, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$3> continuation) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = list;
    }
}
