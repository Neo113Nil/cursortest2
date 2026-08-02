package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/ktor/client/statement/HttpResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.LoggingKt$Logging$2$observer$1", f = "Logging.kt", i = {0, 0, 1, 3, 5}, l = {643, 646, 647, 646, 647, 646, 647}, m = "invokeSuspend", n = {"callLogger", "log", "callLogger", "callLogger", "callLogger"}, s = {"L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes17.dex */
final class LoggingKt$Logging$2$observer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.client.plugins.logging.LogLevel getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0114, code lost:
    
        if (r1.closeResponseLog(r9) != r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e0, code lost:
    
        if (r1.closeResponseLog(r9) != r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.util.AttributeKey<?> attributeKey;
        io.ktor.util.AttributeKey attributeKey2;
        io.ktor.client.plugins.logging.HttpClientCallLogger httpClientCallLogger;
        java.lang.StringBuilder sb;
        java.lang.String obj2;
        io.ktor.client.plugins.logging.HttpClientCallLogger httpClientCallLogger2;
        java.lang.String obj3;
        io.ktor.client.plugins.logging.HttpClientCallLogger httpClientCallLogger3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.getHighSpeedVideoFpsRangesFor) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) this.getHighResolutionOutputSizeshNQ4ISI;
                if (this.getHighSpeedVideoSizes != io.ktor.client.plugins.logging.LogLevel.NONE) {
                    io.ktor.util.Attributes attributes = httpResponse.getCall().getAttributes();
                    attributeKey = io.ktor.client.plugins.logging.LoggingKt.getHighResolutionOutputSizeshNQ4ISI;
                    if (!attributes.contains(attributeKey)) {
                        io.ktor.util.Attributes attributes2 = httpResponse.getCall().getAttributes();
                        attributeKey2 = io.ktor.client.plugins.logging.LoggingKt.getHighSpeedVideoFpsRanges;
                        io.ktor.client.plugins.logging.HttpClientCallLogger httpClientCallLogger4 = (io.ktor.client.plugins.logging.HttpClientCallLogger) attributes2.get(attributeKey2);
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        try {
                            this.getHighResolutionOutputSizeshNQ4ISI = httpClientCallLogger4;
                            this.Camera2StreamConfigurationMap = sb2;
                            this.getHighSpeedVideoFpsRangesFor = 1;
                            if (io.ktor.client.plugins.logging.LoggingUtilsKt.logResponseBody(sb2, io.ktor.http.HttpMessagePropertiesKt.contentType(httpResponse), httpResponse.getRawContent(), this) != coroutine_suspended) {
                                httpClientCallLogger = httpClientCallLogger4;
                                sb = sb2;
                                obj3 = sb.toString();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
                                this.getHighResolutionOutputSizeshNQ4ISI = httpClientCallLogger;
                                this.Camera2StreamConfigurationMap = null;
                                this.getHighSpeedVideoFpsRangesFor = 2;
                                if (httpClientCallLogger.logResponseBody(kotlin.text.StringsKt.trim(obj3).toString(), this) != coroutine_suspended) {
                                    httpClientCallLogger3 = httpClientCallLogger;
                                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                                    this.getHighSpeedVideoFpsRangesFor = 3;
                                    break;
                                }
                            }
                        } catch (java.lang.Throwable unused) {
                            httpClientCallLogger = httpClientCallLogger4;
                            sb = sb2;
                            obj2 = sb.toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                            this.getHighResolutionOutputSizeshNQ4ISI = httpClientCallLogger;
                            this.Camera2StreamConfigurationMap = null;
                            this.getHighSpeedVideoFpsRangesFor = 4;
                            if (httpClientCallLogger.logResponseBody(kotlin.text.StringsKt.trim(obj2).toString(), this) != coroutine_suspended) {
                                httpClientCallLogger2 = httpClientCallLogger;
                                this.getHighResolutionOutputSizeshNQ4ISI = null;
                                this.getHighSpeedVideoFpsRangesFor = 5;
                                break;
                            }
                            return coroutine_suspended;
                        }
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            case 1:
                sb = (java.lang.StringBuilder) this.Camera2StreamConfigurationMap;
                httpClientCallLogger = (io.ktor.client.plugins.logging.HttpClientCallLogger) this.getHighResolutionOutputSizeshNQ4ISI;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj3 = sb.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
                    this.getHighResolutionOutputSizeshNQ4ISI = httpClientCallLogger;
                    this.Camera2StreamConfigurationMap = null;
                    this.getHighSpeedVideoFpsRangesFor = 2;
                    if (httpClientCallLogger.logResponseBody(kotlin.text.StringsKt.trim(obj3).toString(), this) != coroutine_suspended) {
                    }
                } catch (java.lang.Throwable unused2) {
                    obj2 = sb.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                    this.getHighResolutionOutputSizeshNQ4ISI = httpClientCallLogger;
                    this.Camera2StreamConfigurationMap = null;
                    this.getHighSpeedVideoFpsRangesFor = 4;
                    if (httpClientCallLogger.logResponseBody(kotlin.text.StringsKt.trim(obj2).toString(), this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                return coroutine_suspended;
            case 2:
                httpClientCallLogger3 = (io.ktor.client.plugins.logging.HttpClientCallLogger) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRangesFor = 3;
                break;
            case 3:
            case 5:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 4:
                httpClientCallLogger2 = (io.ktor.client.plugins.logging.HttpClientCallLogger) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRangesFor = 5;
                break;
            case 6:
                java.lang.Throwable th = (java.lang.Throwable) this.Camera2StreamConfigurationMap;
                io.ktor.client.plugins.logging.HttpClientCallLogger httpClientCallLogger5 = (io.ktor.client.plugins.logging.HttpClientCallLogger) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI = th;
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoFpsRangesFor = 7;
                if (httpClientCallLogger5.closeResponseLog(this) != coroutine_suspended) {
                    throw th;
                }
                return coroutine_suspended;
            case 7:
                java.lang.Throwable th2 = (java.lang.Throwable) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                throw th2;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.logging.LoggingKt$Logging$2$observer$1) create(httpResponse, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.client.plugins.logging.LoggingKt$Logging$2$observer$1 loggingKt$Logging$2$observer$1 = new io.ktor.client.plugins.logging.LoggingKt$Logging$2$observer$1(this.getHighSpeedVideoSizes, continuation);
        loggingKt$Logging$2$observer$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return loggingKt$Logging$2$observer$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoggingKt$Logging$2$observer$1(io.ktor.client.plugins.logging.LogLevel logLevel, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.LoggingKt$Logging$2$observer$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = logLevel;
    }
}
