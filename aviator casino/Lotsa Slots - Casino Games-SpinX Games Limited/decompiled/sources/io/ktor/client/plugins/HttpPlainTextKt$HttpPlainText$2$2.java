package io.ktor.client.plugins;

/* compiled from: HttpPlainText.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/api/TransformResponseBodyContext;", com.ironsource.Ve.n, "Lio/ktor/client/statement/HttpResponse;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "requestedType", "Lio/ktor/util/reflect/TypeInfo;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2", f = "HttpPlainText.kt", i = {0}, l = {147}, m = "invokeSuspend", n = {com.ironsource.Ve.n}, s = {"L$0"})
/* loaded from: classes6.dex */
final class HttpPlainTextKt$HttpPlainText$2$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function5<io.ktor.client.plugins.api.TransformResponseBodyContext, io.ktor.client.statement.HttpResponse, io.ktor.utils.io.ByteReadChannel, io.ktor.util.reflect.TypeInfo, kotlin.coroutines.Continuation<? super java.lang.Object>, java.lang.Object> {
    final /* synthetic */ java.nio.charset.Charset $responseCharsetFallback;
    /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    /* synthetic */ java.lang.Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpPlainTextKt$HttpPlainText$2$2(java.nio.charset.Charset charset, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2> continuation) {
        super(5, continuation);
        this.$responseCharsetFallback = charset;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(io.ktor.client.plugins.api.TransformResponseBodyContext transformResponseBodyContext, io.ktor.client.statement.HttpResponse httpResponse, io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.util.reflect.TypeInfo typeInfo, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2 httpPlainTextKt$HttpPlainText$2$2 = new io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2(this.$responseCharsetFallback, continuation);
        httpPlainTextKt$HttpPlainText$2$2.L$0 = httpResponse;
        httpPlainTextKt$HttpPlainText$2$2.L$1 = byteReadChannel;
        httpPlainTextKt$HttpPlainText$2$2.L$2 = typeInfo;
        return httpPlainTextKt$HttpPlainText$2$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ java.lang.Object invoke(io.ktor.client.plugins.api.TransformResponseBodyContext transformResponseBodyContext, io.ktor.client.statement.HttpResponse httpResponse, io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.util.reflect.TypeInfo typeInfo, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return invoke2(transformResponseBodyContext, httpResponse, byteReadChannel, typeInfo, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.client.statement.HttpResponse httpResponse;
        java.lang.String HttpPlainText$lambda$6$read;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) this.L$0;
            io.ktor.utils.io.ByteReadChannel byteReadChannel = (io.ktor.utils.io.ByteReadChannel) this.L$1;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.util.reflect.TypeInfo) this.L$2).getType(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class))) {
                return null;
            }
            this.L$0 = httpResponse2;
            this.L$1 = null;
            this.label = 1;
            java.lang.Object readRemaining = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(byteReadChannel, this);
            if (readRemaining == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpResponse = httpResponse2;
            obj = readRemaining;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            httpResponse = (io.ktor.client.statement.HttpResponse) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        HttpPlainText$lambda$6$read = io.ktor.client.plugins.HttpPlainTextKt.HttpPlainText$lambda$6$read(this.$responseCharsetFallback, httpResponse.getCall(), (kotlinx.io.Source) obj);
        return HttpPlainText$lambda$6$read;
    }
}
