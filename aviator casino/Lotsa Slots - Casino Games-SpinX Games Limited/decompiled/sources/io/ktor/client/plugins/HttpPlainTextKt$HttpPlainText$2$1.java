package io.ktor.client.plugins;

/* compiled from: HttpPlainText.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lio/ktor/http/content/OutgoingContent;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "content", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1", f = "HttpPlainText.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class HttpPlainTextKt$HttpPlainText$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequestBuilder, java.lang.Object, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, java.lang.Object> {
    final /* synthetic */ java.lang.String $acceptCharsetHeader;
    final /* synthetic */ java.nio.charset.Charset $requestCharset;
    /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpPlainTextKt$HttpPlainText$2$1(java.lang.String str, java.nio.charset.Charset charset, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1> continuation) {
        super(3, continuation);
        this.$acceptCharsetHeader = str;
        this.$requestCharset = charset;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.Object obj, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent> continuation) {
        io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1 httpPlainTextKt$HttpPlainText$2$1 = new io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1(this.$acceptCharsetHeader, this.$requestCharset, continuation);
        httpPlainTextKt$HttpPlainText$2$1.L$0 = httpRequestBuilder;
        httpPlainTextKt$HttpPlainText$2$1.L$1 = obj;
        return httpPlainTextKt$HttpPlainText$2$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.http.content.OutgoingContent HttpPlainText$lambda$6$wrapContent;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) this.L$0;
            java.lang.Object obj2 = this.L$1;
            io.ktor.client.plugins.HttpPlainTextKt.HttpPlainText$lambda$6$addCharsetHeaders(this.$acceptCharsetHeader, httpRequestBuilder);
            if (!(obj2 instanceof java.lang.String)) {
                return null;
            }
            io.ktor.http.ContentType contentType = io.ktor.http.HttpMessagePropertiesKt.contentType(httpRequestBuilder);
            if (contentType != null && !kotlin.jvm.internal.Intrinsics.areEqual(contentType.getContentType(), io.ktor.http.ContentType.Text.INSTANCE.getPlain().getContentType())) {
                return null;
            }
            HttpPlainText$lambda$6$wrapContent = io.ktor.client.plugins.HttpPlainTextKt.HttpPlainText$lambda$6$wrapContent(this.$requestCharset, httpRequestBuilder, (java.lang.String) obj2, contentType);
            return HttpPlainText$lambda$6$wrapContent;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
