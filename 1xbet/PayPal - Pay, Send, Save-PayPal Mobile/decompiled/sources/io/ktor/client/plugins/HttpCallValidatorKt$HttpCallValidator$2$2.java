package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$2", f = "HttpCallValidator.kt", i = {1}, l = {128, 129}, m = "invokeSuspend", n = {androidx.core.app.NotificationCompat.CATEGORY_CALL}, s = {"L$0"})
/* loaded from: classes17.dex */
final class HttpCallValidatorKt$HttpCallValidator$2$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.plugins.api.Send.Sender, io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r7 != r0) goto L13;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = ((io.ktor.client.plugins.api.Send.Sender) this.getHighResolutionOutputSizeshNQ4ISI).proceed((io.ktor.client.request.HttpRequestBuilder) this.getHighSpeedVideoSizes, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                io.ktor.client.call.HttpClientCall httpClientCall = (io.ktor.client.call.HttpClientCall) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                return httpClientCall;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        io.ktor.client.call.HttpClientCall httpClientCall2 = (io.ktor.client.call.HttpClientCall) obj;
        this.getHighResolutionOutputSizeshNQ4ISI = httpClientCall2;
        this.getHighSpeedVideoFpsRangesFor = 2;
        return io.ktor.client.plugins.HttpCallValidatorKt.access$HttpCallValidator$lambda$2$validateResponse(this.getHighSpeedVideoFpsRanges, httpClientCall2.getResponse(), this) == coroutine_suspended ? coroutine_suspended : httpClientCall2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.plugins.api.Send.Sender sender, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall> continuation) {
        io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$2 httpCallValidatorKt$HttpCallValidator$2$2 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$2(this.getHighSpeedVideoFpsRanges, continuation);
        httpCallValidatorKt$HttpCallValidator$2$2.getHighResolutionOutputSizeshNQ4ISI = sender;
        httpCallValidatorKt$HttpCallValidator$2$2.getHighSpeedVideoSizes = httpRequestBuilder;
        return httpCallValidatorKt$HttpCallValidator$2$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HttpCallValidatorKt$HttpCallValidator$2$2(java.util.List<? extends kotlin.jvm.functions.Function2<? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> list, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$2> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRanges = list;
    }
}
