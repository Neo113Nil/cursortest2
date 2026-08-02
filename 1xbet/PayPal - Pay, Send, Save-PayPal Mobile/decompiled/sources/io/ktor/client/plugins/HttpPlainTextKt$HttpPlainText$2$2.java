package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/api/TransformResponseBodyContext;", "response", "Lio/ktor/client/statement/HttpResponse;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "requestedType", "Lio/ktor/util/reflect/TypeInfo;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2", f = "HttpPlainText.kt", i = {0}, l = {147}, m = "invokeSuspend", n = {"response"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class HttpPlainTextKt$HttpPlainText$2$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function5<io.ktor.client.plugins.api.TransformResponseBodyContext, io.ktor.client.statement.HttpResponse, io.ktor.utils.io.ByteReadChannel, io.ktor.util.reflect.TypeInfo, kotlin.coroutines.Continuation<? super java.lang.Object>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.nio.charset.Charset getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.client.statement.HttpResponse httpResponse;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoFpsRangesFor;
            io.ktor.utils.io.ByteReadChannel byteReadChannel = (io.ktor.utils.io.ByteReadChannel) this.getHighResolutionOutputSizeshNQ4ISI;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.util.reflect.TypeInfo) this.getHighSpeedVideoFpsRanges).getType(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class))) {
                return null;
            }
            this.getHighSpeedVideoFpsRangesFor = httpResponse2;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.Camera2StreamConfigurationMap = 1;
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
            httpResponse = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return io.ktor.client.plugins.HttpPlainTextKt.access$HttpPlainText$lambda$6$read(this.getHighSpeedVideoSizes, httpResponse.getCall(), (kotlinx.io.Source) obj);
    }

    @Override // kotlin.jvm.functions.Function5
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.plugins.api.TransformResponseBodyContext transformResponseBodyContext, io.ktor.client.statement.HttpResponse httpResponse, io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.util.reflect.TypeInfo typeInfo, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2 httpPlainTextKt$HttpPlainText$2$2 = new io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2(this.getHighSpeedVideoSizes, continuation);
        httpPlainTextKt$HttpPlainText$2$2.getHighSpeedVideoFpsRangesFor = httpResponse;
        httpPlainTextKt$HttpPlainText$2$2.getHighResolutionOutputSizeshNQ4ISI = byteReadChannel;
        httpPlainTextKt$HttpPlainText$2$2.getHighSpeedVideoFpsRanges = typeInfo;
        return httpPlainTextKt$HttpPlainText$2$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpPlainTextKt$HttpPlainText$2$2(java.nio.charset.Charset charset, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2> continuation) {
        super(5, continuation);
        this.getHighSpeedVideoSizes = charset;
    }
}
