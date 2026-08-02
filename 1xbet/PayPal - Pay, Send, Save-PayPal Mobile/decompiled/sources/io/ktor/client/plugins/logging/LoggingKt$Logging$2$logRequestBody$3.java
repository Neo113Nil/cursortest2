package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestBody$3", f = "Logging.kt", i = {0}, l = {765}, m = "invokeSuspend", n = {"charset$iv"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class LoggingKt$Logging$2$logRequestBody$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.StringBuilder getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.nio.charset.Charset getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.client.plugins.logging.HttpClientCallLogger getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.utils.io.ByteChannel getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.nio.charset.Charset charset;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        java.lang.String str = null;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                try {
                    io.ktor.utils.io.ByteChannel byteChannel = this.getHighSpeedVideoSizes;
                    java.nio.charset.Charset charset2 = this.getHighSpeedVideoFpsRanges;
                    this.Camera2StreamConfigurationMap = charset2;
                    this.getInputSizeshNQ4ISI = 1;
                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(byteChannel, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    charset = charset2;
                } catch (java.lang.Throwable th) {
                    io.ktor.client.plugins.logging.HttpClientCallLogger httpClientCallLogger = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.String obj2 = this.getHighResolutionOutputSizeshNQ4ISI.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                    httpClientCallLogger.logRequest(obj2);
                    this.getHighSpeedVideoFpsRangesFor.closeRequestLog();
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                charset = (java.nio.charset.Charset) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            str = io.ktor.utils.io.core.StringsKt.readText$default((kotlinx.io.Source) obj, charset, 0, 2, null);
        } catch (java.lang.Throwable unused) {
        }
        if (str == null) {
            str = "[request body omitted]";
        }
        this.getHighResolutionOutputSizeshNQ4ISI.append("BODY START\n");
        java.lang.StringBuilder sb = this.getHighResolutionOutputSizeshNQ4ISI;
        sb.append(str);
        sb.append('\n');
        this.getHighResolutionOutputSizeshNQ4ISI.append("BODY END");
        io.ktor.client.plugins.logging.HttpClientCallLogger httpClientCallLogger2 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String obj3 = this.getHighResolutionOutputSizeshNQ4ISI.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
        httpClientCallLogger2.logRequest(obj3);
        this.getHighSpeedVideoFpsRangesFor.closeRequestLog();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestBody$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestBody$3(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoggingKt$Logging$2$logRequestBody$3(io.ktor.utils.io.ByteChannel byteChannel, java.nio.charset.Charset charset, java.lang.StringBuilder sb, io.ktor.client.plugins.logging.HttpClientCallLogger httpClientCallLogger, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestBody$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = byteChannel;
        this.getHighSpeedVideoFpsRanges = charset;
        this.getHighResolutionOutputSizeshNQ4ISI = sb;
        this.getHighSpeedVideoFpsRangesFor = httpClientCallLogger;
    }
}
