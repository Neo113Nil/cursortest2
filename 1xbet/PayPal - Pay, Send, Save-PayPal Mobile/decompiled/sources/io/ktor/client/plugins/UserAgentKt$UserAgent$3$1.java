package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/api/OnRequestContext;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "<unused var>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.UserAgentKt$UserAgent$3$1", f = "UserAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class UserAgentKt$UserAgent$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<io.ktor.client.plugins.api.OnRequestContext, io.ktor.client.request.HttpRequestBuilder, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        org.slf4j.Logger logger;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) this.Camera2StreamConfigurationMap;
            logger = io.ktor.client.plugins.UserAgentKt.getHighSpeedVideoSizes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Adding User-Agent header: agent for ");
            sb.append(httpRequestBuilder.getUrl());
            logger.trace(sb.toString());
            io.ktor.client.request.UtilsKt.header(httpRequestBuilder, io.ktor.http.HttpHeaders.INSTANCE.getUserAgent(), this.getHighSpeedVideoSizes);
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.plugins.api.OnRequestContext onRequestContext, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.UserAgentKt$UserAgent$3$1 userAgentKt$UserAgent$3$1 = new io.ktor.client.plugins.UserAgentKt$UserAgent$3$1(this.getHighSpeedVideoSizes, continuation);
        userAgentKt$UserAgent$3$1.Camera2StreamConfigurationMap = httpRequestBuilder;
        return userAgentKt$UserAgent$3$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserAgentKt$UserAgent$3$1(java.lang.String str, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.UserAgentKt$UserAgent$3$1> continuation) {
        super(4, continuation);
        this.getHighSpeedVideoSizes = str;
    }
}
