package io.ktor.client.plugins;

/* compiled from: HttpCallValidator.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "request", "Lio/ktor/client/request/HttpRequest;", "cause"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$3", f = "HttpCallValidator.kt", i = {0}, l = {135}, m = "invokeSuspend", n = {"unwrappedCause"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class HttpCallValidatorKt$HttpCallValidator$2$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequest, java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Throwable>, java.lang.Object> {
    final /* synthetic */ java.util.List<io.ktor.client.plugins.HandlerWrapper> $callExceptionHandlers;
    /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HttpCallValidatorKt$HttpCallValidator$2$3(java.util.List<? extends io.ktor.client.plugins.HandlerWrapper> list, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$3> continuation) {
        super(3, continuation);
        this.$callExceptionHandlers = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(io.ktor.client.request.HttpRequest httpRequest, java.lang.Throwable th, kotlin.coroutines.Continuation<? super java.lang.Throwable> continuation) {
        io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$3 httpCallValidatorKt$HttpCallValidator$2$3 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$3(this.$callExceptionHandlers, continuation);
        httpCallValidatorKt$HttpCallValidator$2$3.L$0 = httpRequest;
        httpCallValidatorKt$HttpCallValidator$2$3.L$1 = th;
        return httpCallValidatorKt$HttpCallValidator$2$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object HttpCallValidator$lambda$2$processException;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Throwable th = (java.lang.Throwable) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            return th;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        io.ktor.client.request.HttpRequest httpRequest = (io.ktor.client.request.HttpRequest) this.L$0;
        java.lang.Throwable unwrapCancellationException = io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException((java.lang.Throwable) this.L$1);
        this.L$0 = unwrapCancellationException;
        this.label = 1;
        HttpCallValidator$lambda$2$processException = io.ktor.client.plugins.HttpCallValidatorKt.HttpCallValidator$lambda$2$processException(this.$callExceptionHandlers, unwrapCancellationException, httpRequest, this);
        return HttpCallValidator$lambda$2$processException == coroutine_suspended ? coroutine_suspended : unwrapCancellationException;
    }
}
