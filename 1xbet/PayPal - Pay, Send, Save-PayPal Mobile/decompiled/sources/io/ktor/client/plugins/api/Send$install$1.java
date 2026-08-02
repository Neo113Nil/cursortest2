package io.ktor.client.plugins.api;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.api.Send$install$1", f = "CommonHooks.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class Send$install$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.plugins.Sender, io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function3<io.ktor.client.plugins.api.Send.Sender, io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.client.HttpClient getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        io.ktor.client.plugins.Sender sender = (io.ktor.client.plugins.Sender) this.getHighSpeedVideoSizes;
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) this.Camera2StreamConfigurationMap;
        kotlin.jvm.functions.Function3<io.ktor.client.plugins.api.Send.Sender, io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, java.lang.Object> function3 = this.getHighResolutionOutputSizeshNQ4ISI;
        io.ktor.client.plugins.api.Send.Sender sender2 = new io.ktor.client.plugins.api.Send.Sender(sender, this.getHighSpeedVideoFpsRanges.getCoroutineContext());
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object invoke = function3.invoke(sender2, httpRequestBuilder, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.plugins.Sender sender, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall> continuation) {
        io.ktor.client.plugins.api.Send$install$1 send$install$1 = new io.ktor.client.plugins.api.Send$install$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        send$install$1.getHighSpeedVideoSizes = sender;
        send$install$1.Camera2StreamConfigurationMap = httpRequestBuilder;
        return send$install$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Send$install$1(kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.api.Send.Sender, ? super io.ktor.client.request.HttpRequestBuilder, ? super kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, ? extends java.lang.Object> function3, io.ktor.client.HttpClient httpClient, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.api.Send$install$1> continuation) {
        super(3, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function3;
        this.getHighSpeedVideoFpsRanges = httpClient;
    }
}
