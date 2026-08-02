package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lio/ktor/http/content/OutgoingContent;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "content", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1", f = "HttpPlainText.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class HttpPlainTextKt$HttpPlainText$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequestBuilder, java.lang.Object, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, java.lang.Object> {
    final /* synthetic */ java.nio.charset.Charset Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) this.getHighSpeedVideoFpsRanges;
        java.lang.Object obj2 = this.getHighResolutionOutputSizeshNQ4ISI;
        io.ktor.client.plugins.HttpPlainTextKt.access$HttpPlainText$lambda$6$addCharsetHeaders(this.getHighSpeedVideoFpsRangesFor, httpRequestBuilder);
        if (!(obj2 instanceof java.lang.String)) {
            return null;
        }
        io.ktor.http.ContentType contentType = io.ktor.http.HttpMessagePropertiesKt.contentType(httpRequestBuilder);
        if (contentType == null || kotlin.jvm.internal.Intrinsics.areEqual(contentType.getContentType(), io.ktor.http.ContentType.Text.INSTANCE.getPlain().getContentType())) {
            return io.ktor.client.plugins.HttpPlainTextKt.access$HttpPlainText$lambda$6$wrapContent(this.Camera2StreamConfigurationMap, httpRequestBuilder, (java.lang.String) obj2, contentType);
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.Object obj, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent> continuation) {
        io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1 httpPlainTextKt$HttpPlainText$2$1 = new io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        httpPlainTextKt$HttpPlainText$2$1.getHighSpeedVideoFpsRanges = httpRequestBuilder;
        httpPlainTextKt$HttpPlainText$2$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return httpPlainTextKt$HttpPlainText$2$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpPlainTextKt$HttpPlainText$2$1(java.lang.String str, java.nio.charset.Charset charset, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = charset;
    }
}
