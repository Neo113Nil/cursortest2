package io.ktor.client.plugins.sse;

/* compiled from: DefaultClientSSESession.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$doReconnection$2", f = "DefaultClientSSESession.kt", i = {0, 1, 1}, l = {95, 102}, m = "invokeSuspend", n = {"retries", "retries", "reconnectionRequest"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes6.dex */
final class DefaultClientSSESession$doReconnection$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ io.ktor.client.plugins.sse.DefaultClientSSESession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultClientSSESession$doReconnection$2(io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.DefaultClientSSESession$doReconnection$2> continuation) {
        super(2, continuation);
        this.this$0 = defaultClientSSESession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.client.plugins.sse.DefaultClientSSESession$doReconnection$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.sse.DefaultClientSSESession$doReconnection$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00d1 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0016, B:8:0x00c1, B:10:0x00d1, B:11:0x00e9, B:13:0x00fc, B:14:0x0102, B:31:0x0044, B:22:0x0064, B:24:0x0076, B:25:0x00ab, B:21:0x0028), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00fc A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0016, B:8:0x00c1, B:10:0x00d1, B:11:0x00e9, B:13:0x00fc, B:14:0x0102, B:31:0x0044, B:22:0x0064, B:24:0x0076, B:25:0x00ab, B:21:0x0028), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0016, B:8:0x00c1, B:10:0x00d1, B:11:0x00e9, B:13:0x00fc, B:14:0x0102, B:31:0x0044, B:22:0x0064, B:24:0x0076, B:25:0x00ab, B:21:0x0028), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0 A[RETURN] */
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
        io.ktor.client.request.HttpRequestBuilder requestForReconnection;
        org.slf4j.Logger logger;
        io.ktor.client.HttpClient httpClient;
        int i5;
        io.ktor.client.statement.HttpResponse response;
        org.slf4j.Logger logger2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.label;
        try {
        } finally {
            if (i != i2) {
                i3 = intRef.element;
                i4 = this.this$0.maxReconnectionAttempts;
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
            i4 = this.this$0.maxReconnectionAttempts;
            if (i3 > i4) {
                byteReadChannel = this.this$0.input;
                io.ktor.utils.io.ByteReadChannelKt.cancel(byteReadChannel);
                j = this.this$0.reconnectionTimeMillis;
                this.L$0 = intRef;
                this.L$1 = null;
                this.label = 1;
                if (kotlinx.coroutines.DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                requestForReconnection = this.this$0.getRequestForReconnection();
                logger = io.ktor.client.plugins.sse.SSEKt.getLOGGER();
                io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession = this.this$0;
                if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                }
                httpClient = this.this$0.clientForReconnection;
                this.L$0 = intRef;
                this.L$1 = requestForReconnection;
                this.label = 2;
                obj = httpClient.execute$ktor_client_core(requestForReconnection, this);
                if (obj == coroutine_suspended) {
                }
                response = ((io.ktor.client.call.HttpClientCall) obj).getResponse();
                logger2 = io.ktor.client.plugins.sse.SSEKt.getLOGGER();
                if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger2)) {
                }
                io.ktor.client.plugins.sse.SSEKt.checkResponse(response);
                if (kotlin.jvm.internal.Intrinsics.areEqual(response.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getNoContent())) {
                }
                this.this$0.input = response.getRawContent();
                return kotlin.Unit.INSTANCE;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            requestForReconnection = (io.ktor.client.request.HttpRequestBuilder) this.L$1;
            intRef = (kotlin.jvm.internal.Ref.IntRef) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            response = ((io.ktor.client.call.HttpClientCall) obj).getResponse();
            logger2 = io.ktor.client.plugins.sse.SSEKt.getLOGGER();
            if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger2)) {
                logger2.trace("Receive response for reconnection SSE request to " + requestForReconnection.getUrl());
            }
            io.ktor.client.plugins.sse.SSEKt.checkResponse(response);
            if (kotlin.jvm.internal.Intrinsics.areEqual(response.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getNoContent())) {
                this.this$0.needToReconnect = false;
            }
            this.this$0.input = response.getRawContent();
            return kotlin.Unit.INSTANCE;
        }
        intRef = (kotlin.jvm.internal.Ref.IntRef) this.L$0;
        kotlin.ResultKt.throwOnFailure(obj);
        requestForReconnection = this.this$0.getRequestForReconnection();
        logger = io.ktor.client.plugins.sse.SSEKt.getLOGGER();
        io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession2 = this.this$0;
        if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Sending SSE request ");
            sb.append(requestForReconnection.getUrl());
            sb.append(" (attempt ");
            sb.append(intRef.element + 1);
            sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            i5 = defaultClientSSESession2.maxReconnectionAttempts;
            sb.append(i5 + 1);
            sb.append(')');
            logger.trace(sb.toString());
        }
        httpClient = this.this$0.clientForReconnection;
        this.L$0 = intRef;
        this.L$1 = requestForReconnection;
        this.label = 2;
        obj = httpClient.execute$ktor_client_core(requestForReconnection, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        response = ((io.ktor.client.call.HttpClientCall) obj).getResponse();
        logger2 = io.ktor.client.plugins.sse.SSEKt.getLOGGER();
        if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger2)) {
        }
        io.ktor.client.plugins.sse.SSEKt.checkResponse(response);
        if (kotlin.jvm.internal.Intrinsics.areEqual(response.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getNoContent())) {
        }
        this.this$0.input = response.getRawContent();
        return kotlin.Unit.INSTANCE;
    }
}
