package io.ktor.client.plugins.sse;

/* compiled from: DefaultClientSSESession.kt */
@kotlin.Deprecated(message = "It should be marked with `@InternalAPI`, please use `ClientSSESession` instead")
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0004H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u0004H\u0082@¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u000b*\u00060\u0017j\u0002`\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u0019*\u00060\u0017j\u0002`\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u0013H\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u001f*\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010!J\u0013\u0010#\u001a\u00020\u001f*\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010!R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010.R\u0014\u00104\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0013098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0013098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lio/ktor/client/plugins/sse/DefaultClientSSESession;", "Lio/ktor/client/plugins/sse/SSESession;", "Lio/ktor/client/plugins/sse/SSEClientContent;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lio/ktor/client/plugins/sse/SSEClientContent;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/CoroutineContext;)V", "(Lio/ktor/client/plugins/sse/SSEClientContent;Lio/ktor/utils/io/ByteReadChannel;)V", "", "doReconnection", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestBuilder;", "getRequestForReconnection", "()Lio/ktor/client/request/HttpRequestBuilder;", "close", "()V", "Lio/ktor/sse/ServerSentEvent;", "tryParseEvent", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseEvent", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "comment", "appendComment", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "toText", "(Ljava/lang/StringBuilder;)Ljava/lang/String;", "", "isEmpty", "(Lio/ktor/sse/ServerSentEvent;)Z", "isCommentsEvent", "isRetryEvent", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "lastEventId", "Ljava/lang/String;", "", "reconnectionTimeMillis", "J", "showCommentEvents", "Z", "showRetryEvents", "", "maxReconnectionAttempts", "I", "needToReconnect", "initialRequest", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/HttpClient;", "clientForReconnection", "Lio/ktor/client/HttpClient;", "Lkotlinx/coroutines/flow/Flow;", "_incoming", "Lkotlinx/coroutines/flow/Flow;", "getIncoming", "()Lkotlinx/coroutines/flow/Flow;", "incoming", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultClientSSESession implements io.ktor.client.plugins.sse.SSESession {
    private kotlinx.coroutines.flow.Flow<io.ktor.sse.ServerSentEvent> _incoming;
    private final io.ktor.client.HttpClient clientForReconnection;
    private final kotlin.coroutines.CoroutineContext coroutineContext;
    private final io.ktor.client.request.HttpRequestBuilder initialRequest;
    private io.ktor.utils.io.ByteReadChannel input;
    private java.lang.String lastEventId;
    private final int maxReconnectionAttempts;
    private boolean needToReconnect;
    private long reconnectionTimeMillis;
    private final boolean showCommentEvents;
    private final boolean showRetryEvents;

    public DefaultClientSSESession(io.ktor.client.plugins.sse.SSEClientContent content, io.ktor.utils.io.ByteReadChannel input, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.input = input;
        this.coroutineContext = coroutineContext;
        this.reconnectionTimeMillis = kotlin.time.Duration.m12157getInWholeMillisecondsimpl(content.getReconnectionTime());
        this.showCommentEvents = content.getShowCommentEvents();
        this.showRetryEvents = content.getShowRetryEvents();
        int maxReconnectionAttempts = content.getMaxReconnectionAttempts();
        this.maxReconnectionAttempts = maxReconnectionAttempts;
        this.needToReconnect = maxReconnectionAttempts > 0;
        io.ktor.client.request.HttpRequestBuilder initialRequest = content.getInitialRequest();
        this.initialRequest = initialRequest;
        this.clientForReconnection = (io.ktor.client.HttpClient) initialRequest.getAttributes().get(io.ktor.client.plugins.sse.SSEKt.getSSEClientForReconnectionAttr());
        this._incoming = kotlinx.coroutines.flow.FlowKt.onCompletion(kotlinx.coroutines.flow.FlowKt.m12340catch(kotlinx.coroutines.flow.FlowKt.flow(new io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1(this, null)), new io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$2(this, null)), new io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$3(this, null));
        kotlinx.coroutines.JobKt.getJob(getCoroutineContext()).invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.DefaultClientSSESession$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit _init_$lambda$0;
                _init_$lambda$0 = io.ktor.client.plugins.sse.DefaultClientSSESession._init_$lambda$0(io.ktor.client.plugins.sse.DefaultClientSSESession.this, (java.lang.Throwable) obj);
                return _init_$lambda$0;
            }
        });
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DefaultClientSSESession(io.ktor.client.plugins.sse.SSEClientContent content, io.ktor.utils.io.ByteReadChannel input) {
        this(content, input, r0.plus(r1).plus(new kotlinx.coroutines.CoroutineName("DefaultClientSSESession")));
        kotlinx.coroutines.CompletableJob Job$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.coroutines.CoroutineContext callContext = content.getCallContext();
        Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit _init_$lambda$0(io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession, java.lang.Throwable th) {
        defaultClientSSESession.close();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object doReconnection(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(getCoroutineContext(), new io.ktor.client.plugins.sse.DefaultClientSSESession$doReconnection$2(this, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.ktor.client.request.HttpRequestBuilder getRequestForReconnection() {
        io.ktor.client.request.HttpRequestBuilder takeFrom = new io.ktor.client.request.HttpRequestBuilder().takeFrom(this.initialRequest);
        takeFrom.getAttributes().remove(io.ktor.client.plugins.sse.BuildersKt.getSseRequestAttr());
        takeFrom.getAttributes().put(io.ktor.client.plugins.sse.SSEKt.getSSEReconnectionRequestAttr(), true);
        java.lang.String str = this.lastEventId;
        if (str != null) {
            takeFrom.getHeaders().append(com.google.common.net.HttpHeaders.LAST_EVENT_ID, str);
        }
        return takeFrom;
    }

    @Override // io.ktor.client.plugins.sse.SSESession
    public kotlinx.coroutines.flow.Flow<io.ktor.sse.ServerSentEvent> getIncoming() {
        return this._incoming;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void close() {
        kotlinx.coroutines.JobKt__JobKt.cancel$default(getCoroutineContext(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        io.ktor.utils.io.ByteReadChannelKt.cancel(this.input);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object tryParseEvent(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.sse.ServerSentEvent> continuation) {
        io.ktor.client.plugins.sse.DefaultClientSSESession$tryParseEvent$1 defaultClientSSESession$tryParseEvent$1;
        int i;
        try {
            if (continuation instanceof io.ktor.client.plugins.sse.DefaultClientSSESession$tryParseEvent$1) {
                defaultClientSSESession$tryParseEvent$1 = (io.ktor.client.plugins.sse.DefaultClientSSESession$tryParseEvent$1) continuation;
                if ((defaultClientSSESession$tryParseEvent$1.label & Integer.MIN_VALUE) != 0) {
                    defaultClientSSESession$tryParseEvent$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = defaultClientSSESession$tryParseEvent$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = defaultClientSSESession$tryParseEvent$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultClientSSESession$tryParseEvent$1.label = 1;
                        obj = parseEvent(byteReadChannel, defaultClientSSESession$tryParseEvent$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (io.ktor.sse.ServerSentEvent) obj;
                }
            }
            if (i != 0) {
            }
            return (io.ktor.sse.ServerSentEvent) obj;
        } catch (io.ktor.utils.io.ClosedByteChannelException unused) {
            return null;
        }
        defaultClientSSESession$tryParseEvent$1 = new io.ktor.client.plugins.sse.DefaultClientSSESession$tryParseEvent$1(this, continuation);
        java.lang.Object obj2 = defaultClientSSESession$tryParseEvent$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultClientSSESession$tryParseEvent$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x021c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0211 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0212 -> B:12:0x0218). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x00f0 -> B:68:0x00f3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object parseEvent(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.sse.ServerSentEvent> continuation) {
        io.ktor.client.plugins.sse.DefaultClientSSESession$parseEvent$1 defaultClientSSESession$parseEvent$1;
        int i;
        java.lang.StringBuilder sb;
        java.lang.StringBuilder sb2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.lang.String str;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        int i2;
        int i3;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        java.lang.StringBuilder sb3;
        java.lang.StringBuilder sb4;
        java.lang.StringBuilder sb5;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        io.ktor.utils.io.ByteReadChannel byteReadChannel4;
        java.lang.StringBuilder sb6;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        java.lang.String str5;
        io.ktor.utils.io.ByteReadChannel byteReadChannel5;
        java.lang.Long longOrNull;
        if (continuation instanceof io.ktor.client.plugins.sse.DefaultClientSSESession$parseEvent$1) {
            defaultClientSSESession$parseEvent$1 = (io.ktor.client.plugins.sse.DefaultClientSSESession$parseEvent$1) continuation;
            if ((defaultClientSSESession$parseEvent$1.label & Integer.MIN_VALUE) != 0) {
                defaultClientSSESession$parseEvent$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = defaultClientSSESession$parseEvent$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultClientSSESession$parseEvent$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    sb = new java.lang.StringBuilder();
                    sb2 = new java.lang.StringBuilder();
                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    str = this.lastEventId;
                    defaultClientSSESession$parseEvent$1.L$0 = byteReadChannel;
                    defaultClientSSESession$parseEvent$1.L$1 = sb;
                    defaultClientSSESession$parseEvent$1.L$2 = sb2;
                    defaultClientSSESession$parseEvent$1.L$3 = objectRef;
                    defaultClientSSESession$parseEvent$1.L$4 = str;
                    defaultClientSSESession$parseEvent$1.I$0 = 0;
                    defaultClientSSESession$parseEvent$1.I$1 = 0;
                    defaultClientSSESession$parseEvent$1.label = 1;
                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel, 0, defaultClientSSESession$parseEvent$1, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    byteReadChannel2 = byteReadChannel;
                    i2 = 0;
                    i3 = 0;
                } else if (i == 1) {
                    i2 = defaultClientSSESession$parseEvent$1.I$1;
                    i3 = defaultClientSSESession$parseEvent$1.I$0;
                    str = (java.lang.String) defaultClientSSESession$parseEvent$1.L$4;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) defaultClientSSESession$parseEvent$1.L$3;
                    sb2 = (java.lang.StringBuilder) defaultClientSSESession$parseEvent$1.L$2;
                    sb = (java.lang.StringBuilder) defaultClientSSESession$parseEvent$1.L$1;
                    byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) defaultClientSSESession$parseEvent$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    i2 = defaultClientSSESession$parseEvent$1.I$1;
                    i3 = defaultClientSSESession$parseEvent$1.I$0;
                    str = (java.lang.String) defaultClientSSESession$parseEvent$1.L$4;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) defaultClientSSESession$parseEvent$1.L$3;
                    sb2 = (java.lang.StringBuilder) defaultClientSSESession$parseEvent$1.L$2;
                    sb = (java.lang.StringBuilder) defaultClientSSESession$parseEvent$1.L$1;
                    byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) defaultClientSSESession$parseEvent$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str3 = null;
                    str2 = (java.lang.String) obj;
                    if (str2 == null) {
                        return null;
                    }
                    if (kotlin.text.StringsKt.isBlank(str2)) {
                        defaultClientSSESession$parseEvent$1.L$0 = byteReadChannel2;
                        defaultClientSSESession$parseEvent$1.L$1 = sb;
                        defaultClientSSESession$parseEvent$1.L$2 = sb2;
                        defaultClientSSESession$parseEvent$1.L$3 = objectRef;
                        defaultClientSSESession$parseEvent$1.L$4 = str;
                        defaultClientSSESession$parseEvent$1.I$0 = i3;
                        defaultClientSSESession$parseEvent$1.I$1 = i2;
                        defaultClientSSESession$parseEvent$1.label = 2;
                        obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel2, 0, defaultClientSSESession$parseEvent$1, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = (java.lang.String) obj;
                        if (str2 == null) {
                        }
                        if (kotlin.text.StringsKt.isBlank(str2)) {
                            str4 = str3;
                            byteReadChannel3 = byteReadChannel2;
                            objectRef2 = objectRef;
                            java.lang.StringBuilder sb7 = sb;
                            sb3 = sb2;
                            sb4 = sb7;
                            if (!kotlin.text.StringsKt.isBlank(str2)) {
                            }
                            objectRef4 = objectRef3;
                            str5 = str4;
                            byteReadChannel5 = byteReadChannel4;
                            defaultClientSSESession$parseEvent$1.L$0 = byteReadChannel5;
                            defaultClientSSESession$parseEvent$1.L$1 = sb5;
                            defaultClientSSESession$parseEvent$1.L$2 = sb6;
                            defaultClientSSESession$parseEvent$1.L$3 = str5;
                            defaultClientSSESession$parseEvent$1.L$4 = objectRef4;
                            defaultClientSSESession$parseEvent$1.L$5 = str;
                            defaultClientSSESession$parseEvent$1.I$0 = i3;
                            defaultClientSSESession$parseEvent$1.I$1 = i2;
                            defaultClientSSESession$parseEvent$1.label = 3;
                            obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel5, 0, defaultClientSSESession$parseEvent$1, 1, null);
                            if (obj == coroutine_suspended) {
                            }
                        }
                    }
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = defaultClientSSESession$parseEvent$1.I$1;
                    i3 = defaultClientSSESession$parseEvent$1.I$0;
                    java.lang.String str6 = (java.lang.String) defaultClientSSESession$parseEvent$1.L$5;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) defaultClientSSESession$parseEvent$1.L$4;
                    java.lang.String str7 = (java.lang.String) defaultClientSSESession$parseEvent$1.L$3;
                    java.lang.StringBuilder sb8 = (java.lang.StringBuilder) defaultClientSSESession$parseEvent$1.L$2;
                    java.lang.StringBuilder sb9 = (java.lang.StringBuilder) defaultClientSSESession$parseEvent$1.L$1;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel6 = (io.ktor.utils.io.ByteReadChannel) defaultClientSSESession$parseEvent$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.utils.io.ByteReadChannel byteReadChannel7 = byteReadChannel6;
                    str = str6;
                    str4 = str7;
                    sb3 = sb8;
                    objectRef2 = objectRef5;
                    sb4 = sb9;
                    str2 = (java.lang.String) obj;
                    if (str2 != null) {
                        return null;
                    }
                    byteReadChannel3 = byteReadChannel7;
                    if (!kotlin.text.StringsKt.isBlank(str2)) {
                        this.lastEventId = str;
                        sb5 = sb4;
                        java.lang.StringBuilder sb10 = sb3;
                        objectRef3 = objectRef2;
                        byteReadChannel4 = byteReadChannel3;
                        io.ktor.sse.ServerSentEvent serverSentEvent = new io.ktor.sse.ServerSentEvent(i3 != 0 ? toText(sb4) : null, str4, str, (java.lang.Long) objectRef2.element, i2 != 0 ? toText(sb3) : null);
                        if (!isEmpty(serverSentEvent)) {
                            return serverSentEvent;
                        }
                        sb6 = sb10;
                    } else {
                        sb5 = sb4;
                        java.lang.StringBuilder sb11 = sb3;
                        objectRef3 = objectRef2;
                        byteReadChannel4 = byteReadChannel3;
                        if (kotlin.text.StringsKt.startsWith$default(str2, ":", false, 2, (java.lang.Object) null)) {
                            sb6 = sb11;
                            appendComment(sb6, str2);
                            str5 = str4;
                            objectRef4 = objectRef3;
                            byteReadChannel5 = byteReadChannel4;
                            i2 = 1;
                        } else {
                            sb6 = sb11;
                            java.lang.String substringBefore$default = kotlin.text.StringsKt.substringBefore$default(str2, ":", (java.lang.String) null, 2, (java.lang.Object) null);
                            java.lang.String removePrefix = kotlin.text.StringsKt.removePrefix(kotlin.text.StringsKt.substringAfter(str2, ":", ""), (java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.SPACE);
                            int hashCode = substringBefore$default.hashCode();
                            if (hashCode == 3355) {
                                objectRef4 = objectRef3;
                                if (substringBefore$default.equals("id") && !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) removePrefix, (java.lang.CharSequence) "\u0000", false, 2, (java.lang.Object) null)) {
                                    str = removePrefix;
                                }
                            } else if (hashCode == 3076010) {
                                objectRef4 = objectRef3;
                                if (substringBefore$default.equals("data")) {
                                    sb5.append(removePrefix);
                                    sb5.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
                                    str5 = str4;
                                    byteReadChannel5 = byteReadChannel4;
                                    i3 = 1;
                                }
                            } else if (hashCode == 96891546) {
                                objectRef4 = objectRef3;
                                if (substringBefore$default.equals(androidx.core.app.NotificationCompat.CATEGORY_EVENT)) {
                                    str5 = removePrefix;
                                    byteReadChannel5 = byteReadChannel4;
                                }
                            } else if (hashCode == 108405416 && substringBefore$default.equals("retry") && (longOrNull = kotlin.text.StringsKt.toLongOrNull(removePrefix)) != null) {
                                long longValue = longOrNull.longValue();
                                this.reconnectionTimeMillis = longValue;
                                objectRef4 = objectRef3;
                                objectRef4.element = kotlin.coroutines.jvm.internal.Boxing.boxLong(longValue);
                            }
                            str5 = str4;
                            byteReadChannel5 = byteReadChannel4;
                        }
                        defaultClientSSESession$parseEvent$1.L$0 = byteReadChannel5;
                        defaultClientSSESession$parseEvent$1.L$1 = sb5;
                        defaultClientSSESession$parseEvent$1.L$2 = sb6;
                        defaultClientSSESession$parseEvent$1.L$3 = str5;
                        defaultClientSSESession$parseEvent$1.L$4 = objectRef4;
                        defaultClientSSESession$parseEvent$1.L$5 = str;
                        defaultClientSSESession$parseEvent$1.I$0 = i3;
                        defaultClientSSESession$parseEvent$1.I$1 = i2;
                        defaultClientSSESession$parseEvent$1.label = 3;
                        obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel5, 0, defaultClientSSESession$parseEvent$1, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str4 = str5;
                        sb3 = sb6;
                        sb4 = sb5;
                        byteReadChannel7 = byteReadChannel5;
                        objectRef2 = objectRef4;
                        str2 = (java.lang.String) obj;
                        if (str2 != null) {
                        }
                    }
                    objectRef4 = objectRef3;
                    str5 = str4;
                    byteReadChannel5 = byteReadChannel4;
                    defaultClientSSESession$parseEvent$1.L$0 = byteReadChannel5;
                    defaultClientSSESession$parseEvent$1.L$1 = sb5;
                    defaultClientSSESession$parseEvent$1.L$2 = sb6;
                    defaultClientSSESession$parseEvent$1.L$3 = str5;
                    defaultClientSSESession$parseEvent$1.L$4 = objectRef4;
                    defaultClientSSESession$parseEvent$1.L$5 = str;
                    defaultClientSSESession$parseEvent$1.I$0 = i3;
                    defaultClientSSESession$parseEvent$1.I$1 = i2;
                    defaultClientSSESession$parseEvent$1.label = 3;
                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel5, 0, defaultClientSSESession$parseEvent$1, 1, null);
                    if (obj == coroutine_suspended) {
                    }
                }
                str2 = (java.lang.String) obj;
                if (str2 != null) {
                    return null;
                }
                str3 = null;
                if (kotlin.text.StringsKt.isBlank(str2)) {
                }
            }
        }
        defaultClientSSESession$parseEvent$1 = new io.ktor.client.plugins.sse.DefaultClientSSESession$parseEvent$1(this, continuation);
        java.lang.Object obj2 = defaultClientSSESession$parseEvent$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultClientSSESession$parseEvent$1.label;
        if (i != 0) {
        }
        str2 = (java.lang.String) obj2;
        if (str2 != null) {
        }
    }

    private final void appendComment(java.lang.StringBuilder sb, java.lang.String str) {
        sb.append(kotlin.text.StringsKt.removePrefix(kotlin.text.StringsKt.removePrefix(str, (java.lang.CharSequence) ":"), (java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.SPACE));
        sb.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
    }

    private final java.lang.String toText(java.lang.StringBuilder sb) {
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return kotlin.text.StringsKt.removeSuffix(sb2, (java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE);
    }

    private final boolean isEmpty(io.ktor.sse.ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getId() == null && serverSentEvent.getEvent() == null && serverSentEvent.getRetry() == null && serverSentEvent.getComments() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCommentsEvent(io.ktor.sse.ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getEvent() == null && serverSentEvent.getId() == null && serverSentEvent.getRetry() == null && serverSentEvent.getComments() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRetryEvent(io.ktor.sse.ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getEvent() == null && serverSentEvent.getId() == null && serverSentEvent.getComments() == null && serverSentEvent.getRetry() != null;
    }
}
