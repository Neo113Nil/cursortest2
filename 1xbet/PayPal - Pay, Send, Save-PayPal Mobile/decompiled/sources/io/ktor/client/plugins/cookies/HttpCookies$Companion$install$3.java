package io.ktor.client.plugins.cookies;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "response"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookies$Companion$install$3", f = "HttpCookies.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class HttpCookies$Companion$install$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, kotlin.Unit>, io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.client.plugins.cookies.HttpCookies getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            if (this.getHighSpeedVideoSizes.saveCookiesFrom$ktor_client_core(httpResponse, this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, kotlin.Unit> pipelineContext, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cookies.HttpCookies$Companion$install$3 httpCookies$Companion$install$3 = new io.ktor.client.plugins.cookies.HttpCookies$Companion$install$3(this.getHighSpeedVideoSizes, continuation);
        httpCookies$Companion$install$3.getHighSpeedVideoFpsRanges = httpResponse;
        return httpCookies$Companion$install$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCookies$Companion$install$3(io.ktor.client.plugins.cookies.HttpCookies httpCookies, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cookies.HttpCookies$Companion$install$3> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = httpCookies;
    }
}
