package io.ktor.client.plugins.sse;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$doReconnection$2", f = "DefaultClientSSESession.kt", i = {0, 1, 1}, l = {95, 102}, m = "invokeSuspend", n = {"retries", "retries", "reconnectionRequest"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class DefaultClientSSESession$doReconnection$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.client.plugins.sse.DefaultClientSSESession getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (r9 != r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0016, B:8:0x00c1, B:10:0x00d1, B:11:0x00e9, B:13:0x00fc, B:14:0x0102, B:31:0x0044, B:22:0x0064, B:24:0x0076, B:25:0x00ab, B:21:0x0028), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044 A[Catch: all -> 0x002c, TRY_ENTER, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0016, B:8:0x00c1, B:10:0x00d1, B:11:0x00e9, B:13:0x00fc, B:14:0x0102, B:31:0x0044, B:22:0x0064, B:24:0x0076, B:25:0x00ab, B:21:0x0028), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0169  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00be -> B:8:0x00c1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i;
        int i2;
        kotlin.jvm.internal.Ref.IntRef intRef;
        int i3;
        int i4;
        io.ktor.utils.io.ByteReadChannel byteReadChannel;
        long j;
        io.ktor.client.request.HttpRequestBuilder access$getRequestForReconnection;
        org.slf4j.Logger logger;
        io.ktor.client.HttpClient httpClient;
        int i5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.Camera2StreamConfigurationMap;
        try {
        } finally {
            if (i != i2) {
                i3 = intRef.element;
                i4 = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
                if (i3 > i4) {
                }
            }
        }
        if (i6 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
            intRef2.element = 1;
            intRef = intRef2;
            i3 = intRef.element;
            i4 = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
            if (i3 > i4) {
                byteReadChannel = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                io.ktor.utils.io.ByteReadChannelKt.cancel(byteReadChannel);
                j = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = intRef;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.Camera2StreamConfigurationMap = 1;
                if (kotlinx.coroutines.DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                access$getRequestForReconnection = io.ktor.client.plugins.sse.DefaultClientSSESession.access$getRequestForReconnection(this.getHighResolutionOutputSizeshNQ4ISI);
                logger = io.ktor.client.plugins.sse.SSEKt.getLOGGER();
                io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession = this.getHighResolutionOutputSizeshNQ4ISI;
                if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                }
                httpClient = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
                this.getHighSpeedVideoFpsRanges = intRef;
                this.getHighSpeedVideoFpsRangesFor = access$getRequestForReconnection;
                this.Camera2StreamConfigurationMap = 2;
                obj = httpClient.execute$ktor_client_core(access$getRequestForReconnection, this);
            } else {
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                access$getRequestForReconnection = (io.ktor.client.request.HttpRequestBuilder) this.getHighSpeedVideoFpsRangesFor;
                intRef = (kotlin.jvm.internal.Ref.IntRef) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.client.statement.HttpResponse response = ((io.ktor.client.call.HttpClientCall) obj).getResponse();
                org.slf4j.Logger logger2 = io.ktor.client.plugins.sse.SSEKt.getLOGGER();
                if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger2)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Receive response for reconnection SSE request to ");
                    sb.append(access$getRequestForReconnection.getUrl());
                    logger2.trace(sb.toString());
                }
                io.ktor.client.plugins.sse.SSEKt.checkResponse(response);
                if (kotlin.jvm.internal.Intrinsics.areEqual(response.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getNoContent())) {
                    this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats = false;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes = response.getRawContent();
                return kotlin.Unit.INSTANCE;
            }
            intRef = (kotlin.jvm.internal.Ref.IntRef) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            access$getRequestForReconnection = io.ktor.client.plugins.sse.DefaultClientSSESession.access$getRequestForReconnection(this.getHighResolutionOutputSizeshNQ4ISI);
            logger = io.ktor.client.plugins.sse.SSEKt.getLOGGER();
            io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append("Sending SSE request ");
                sb2.append(access$getRequestForReconnection.getUrl());
                sb2.append(" (attempt ");
                sb2.append(intRef.element + 1);
                sb2.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                i5 = defaultClientSSESession2.getInputSizeshNQ4ISI;
                sb2.append(i5 + 1);
                sb2.append(')');
                logger.trace(sb2.toString());
            }
            httpClient = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
            this.getHighSpeedVideoFpsRanges = intRef;
            this.getHighSpeedVideoFpsRangesFor = access$getRequestForReconnection;
            this.Camera2StreamConfigurationMap = 2;
            obj = httpClient.execute$ktor_client_core(access$getRequestForReconnection, this);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.sse.DefaultClientSSESession$doReconnection$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.client.plugins.sse.DefaultClientSSESession$doReconnection$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultClientSSESession$doReconnection$2(io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.DefaultClientSSESession$doReconnection$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = defaultClientSSESession;
    }
}
