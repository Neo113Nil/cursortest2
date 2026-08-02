package io.ktor.client.plugins.sse;

@kotlin.Deprecated(message = "It should be marked with `@InternalAPI`, please use `ClientSSESession` instead")
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0004H\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u0004H\u0082@¢\u0006\u0004\b\u000e\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u001f\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010#\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0014\u0010\u001a\u001a\u00020&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+"}, d2 = {"Lio/ktor/client/plugins/sse/DefaultClientSSESession;", "Lio/ktor/client/plugins/sse/SSESession;", "Lio/ktor/client/plugins/sse/SSEClientContent;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lio/ktor/client/plugins/sse/SSEClientContent;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/CoroutineContext;)V", "(Lio/ktor/client/plugins/sse/SSEClientContent;Lio/ktor/utils/io/ByteReadChannel;)V", "Lio/ktor/sse/ServerSentEvent;", "getHighSpeedVideoFpsRangesFor", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "", "getHighSpeedVideoFpsRanges", "(Lio/ktor/sse/ServerSentEvent;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "", "Ljava/lang/String;", "", "getOutputMinFrameDuration", "J", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizesFor", "Z", "getInputFormats", "", "getInputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getOutputFormats", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/HttpClient;", "Lio/ktor/client/HttpClient;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/Flow;", "getIncoming", "()Lkotlinx/coroutines/flow/Flow;", "incoming"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultClientSSESession implements io.ktor.client.plugins.sse.SSESession {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final io.ktor.client.request.HttpRequestBuilder getOutputFormats;
    private final kotlin.coroutines.CoroutineContext coroutineContext;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private io.ktor.utils.io.ByteReadChannel getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final io.ktor.client.HttpClient getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlinx.coroutines.flow.Flow<io.ktor.sse.ServerSentEvent> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final int getInputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private boolean getInputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private long Camera2StreamConfigurationMap;

    public DefaultClientSSESession(io.ktor.client.plugins.sse.SSEClientContent sSEClientContent, io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sSEClientContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.getHighSpeedVideoSizes = byteReadChannel;
        this.coroutineContext = coroutineContext;
        this.Camera2StreamConfigurationMap = kotlin.time.Duration.m23953getInWholeMillisecondsimpl(sSEClientContent.getReconnectionTime());
        this.getHighSpeedVideoFpsRangesFor = sSEClientContent.getShowCommentEvents();
        this.getHighResolutionOutputSizeshNQ4ISI = sSEClientContent.getShowRetryEvents();
        int maxReconnectionAttempts = sSEClientContent.getMaxReconnectionAttempts();
        this.getInputSizeshNQ4ISI = maxReconnectionAttempts;
        this.getInputFormats = maxReconnectionAttempts > 0;
        io.ktor.client.request.HttpRequestBuilder initialRequest = sSEClientContent.getInitialRequest();
        this.getOutputFormats = initialRequest;
        this.getOutputMinFrameDuration = (io.ktor.client.HttpClient) initialRequest.getAttributes().get(io.ktor.client.plugins.sse.SSEKt.getSSEClientForReconnectionAttr());
        this.getHighSpeedVideoSizesFor = kotlinx.coroutines.flow.FlowKt.onCompletion(kotlinx.coroutines.flow.FlowKt.m24097catch(kotlinx.coroutines.flow.FlowKt.flow(new io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1(this, null)), new io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$2(this, null)), new io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$3(this, null));
        kotlinx.coroutines.JobKt.getJob(getCoroutineContext()).invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.DefaultClientSSESession$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.sse.DefaultClientSSESession.$r8$lambda$tTjQSheNwAQr6Nx4zZtcy_zfhek(io.ktor.client.plugins.sse.DefaultClientSSESession.this, (java.lang.Throwable) obj);
            }
        });
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DefaultClientSSESession(io.ktor.client.plugins.sse.SSEClientContent sSEClientContent, io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        this(sSEClientContent, byteReadChannel, r0.plus(r1).plus(new kotlinx.coroutines.CoroutineName("DefaultClientSSESession")));
        kotlinx.coroutines.CompletableJob Job$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sSEClientContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.coroutines.CoroutineContext callContext = sSEClientContent.getCallContext();
        Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
    }

    @Override // io.ktor.client.plugins.sse.SSESession
    public final kotlinx.coroutines.flow.Flow<io.ktor.sse.ServerSentEvent> getIncoming() {
        return this.getHighSpeedVideoSizesFor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.sse.ServerSentEvent> continuation) {
        io.ktor.client.plugins.sse.DefaultClientSSESession$tryParseEvent$1 defaultClientSSESession$tryParseEvent$1;
        int i;
        try {
            if (continuation instanceof io.ktor.client.plugins.sse.DefaultClientSSESession$tryParseEvent$1) {
                defaultClientSSESession$tryParseEvent$1 = (io.ktor.client.plugins.sse.DefaultClientSSESession$tryParseEvent$1) continuation;
                if ((defaultClientSSESession$tryParseEvent$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    defaultClientSSESession$tryParseEvent$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = defaultClientSSESession$tryParseEvent$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = defaultClientSSESession$tryParseEvent$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultClientSSESession$tryParseEvent$1.Camera2StreamConfigurationMap = 1;
                        obj = getHighSpeedVideoSizes(byteReadChannel, defaultClientSSESession$tryParseEvent$1);
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
        java.lang.Object obj2 = defaultClientSSESession$tryParseEvent$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultClientSSESession$tryParseEvent$1.Camera2StreamConfigurationMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f1, code lost:
    
        if (r2 != r4) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0243 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0237 -> B:12:0x023f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x00f1 -> B:69:0x00f3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.sse.ServerSentEvent> continuation) {
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
        io.ktor.utils.io.ByteReadChannel byteReadChannel4;
        java.lang.StringBuilder sb6;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        java.lang.String str5;
        io.ktor.utils.io.ByteReadChannel byteReadChannel5;
        java.lang.Long longOrNull;
        boolean z;
        java.lang.Object readUTF8Line$default;
        java.lang.String str6;
        java.lang.String str7;
        if (continuation instanceof io.ktor.client.plugins.sse.DefaultClientSSESession$parseEvent$1) {
            defaultClientSSESession$parseEvent$1 = (io.ktor.client.plugins.sse.DefaultClientSSESession$parseEvent$1) continuation;
            if ((defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = defaultClientSSESession$parseEvent$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    sb = new java.lang.StringBuilder();
                    sb2 = new java.lang.StringBuilder();
                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    str = this.getHighSpeedVideoFpsRanges;
                    defaultClientSSESession$parseEvent$1.getHighResolutionOutputSizeshNQ4ISI = byteReadChannel;
                    defaultClientSSESession$parseEvent$1.getHighSpeedVideoFpsRanges = sb;
                    defaultClientSSESession$parseEvent$1.Camera2StreamConfigurationMap = sb2;
                    defaultClientSSESession$parseEvent$1.getInputSizeshNQ4ISI = objectRef;
                    defaultClientSSESession$parseEvent$1.getOutputMinFrameDuration = str;
                    defaultClientSSESession$parseEvent$1.getHighSpeedVideoFpsRangesFor = 0;
                    defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizes = 0;
                    defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizesFor = 1;
                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel, 0, defaultClientSSESession$parseEvent$1, 1, null);
                    if (obj != coroutine_suspended) {
                        byteReadChannel2 = byteReadChannel;
                        i2 = 0;
                        i3 = 0;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    i2 = defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizes;
                    i3 = defaultClientSSESession$parseEvent$1.getHighSpeedVideoFpsRangesFor;
                    str = (java.lang.String) defaultClientSSESession$parseEvent$1.getOutputMinFrameDuration;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) defaultClientSSESession$parseEvent$1.getInputSizeshNQ4ISI;
                    sb2 = (java.lang.StringBuilder) defaultClientSSESession$parseEvent$1.Camera2StreamConfigurationMap;
                    sb = (java.lang.StringBuilder) defaultClientSSESession$parseEvent$1.getHighSpeedVideoFpsRanges;
                    byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) defaultClientSSESession$parseEvent$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizes;
                        i3 = defaultClientSSESession$parseEvent$1.getHighSpeedVideoFpsRangesFor;
                        java.lang.String str8 = (java.lang.String) defaultClientSSESession$parseEvent$1.getOutputFormats;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) defaultClientSSESession$parseEvent$1.getOutputMinFrameDuration;
                        java.lang.String str9 = (java.lang.String) defaultClientSSESession$parseEvent$1.getInputSizeshNQ4ISI;
                        java.lang.StringBuilder sb7 = (java.lang.StringBuilder) defaultClientSSESession$parseEvent$1.Camera2StreamConfigurationMap;
                        java.lang.StringBuilder sb8 = (java.lang.StringBuilder) defaultClientSSESession$parseEvent$1.getHighSpeedVideoFpsRanges;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel6 = (io.ktor.utils.io.ByteReadChannel) defaultClientSSESession$parseEvent$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str4 = str9;
                        sb3 = sb7;
                        char c = 2;
                        byteReadChannel5 = byteReadChannel6;
                        str = str8;
                        objectRef3 = objectRef4;
                        sb4 = sb8;
                        z = true;
                        str2 = (java.lang.String) obj;
                        if (str2 != null) {
                            return null;
                        }
                        byteReadChannel3 = byteReadChannel5;
                        objectRef2 = objectRef3;
                        if (!kotlin.text.StringsKt.isBlank(str2)) {
                            this.getHighSpeedVideoFpsRanges = str;
                            if (i3 != 0) {
                                java.lang.String obj2 = sb4.toString();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                                str6 = kotlin.text.StringsKt.removeSuffix(obj2, (java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE);
                            } else {
                                str6 = null;
                            }
                            java.lang.Long l = (java.lang.Long) objectRef2.element;
                            if (i2 != 0) {
                                java.lang.String obj3 = sb3.toString();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
                                str7 = kotlin.text.StringsKt.removeSuffix(obj3, (java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE);
                            } else {
                                str7 = null;
                            }
                            java.lang.StringBuilder sb9 = sb4;
                            java.lang.String str10 = str6;
                            java.lang.StringBuilder sb10 = sb3;
                            kotlin.jvm.internal.Ref.ObjectRef objectRef5 = objectRef2;
                            byteReadChannel4 = byteReadChannel3;
                            io.ktor.sse.ServerSentEvent serverSentEvent = new io.ktor.sse.ServerSentEvent(str10, str4, str, l, str7);
                            if (!getHighSpeedVideoFpsRanges(serverSentEvent)) {
                                return serverSentEvent;
                            }
                            sb5 = sb10;
                            sb6 = sb9;
                            objectRef3 = objectRef5;
                            c = 2;
                        } else {
                            java.lang.StringBuilder sb11 = sb4;
                            sb5 = sb3;
                            kotlin.jvm.internal.Ref.ObjectRef objectRef6 = objectRef2;
                            byteReadChannel4 = byteReadChannel3;
                            if (!kotlin.text.StringsKt.startsWith$default(str2, io.ktor.sse.ServerSentEventKt.COLON, false, 2, (java.lang.Object) null)) {
                                java.lang.String substringBefore$default = kotlin.text.StringsKt.substringBefore$default(str2, io.ktor.sse.ServerSentEventKt.COLON, (java.lang.String) null, 2, (java.lang.Object) null);
                                java.lang.String removePrefix = kotlin.text.StringsKt.removePrefix(kotlin.text.StringsKt.substringAfter(str2, io.ktor.sse.ServerSentEventKt.COLON, ""), (java.lang.CharSequence) " ");
                                int hashCode = substringBefore$default.hashCode();
                                if (hashCode == 3355) {
                                    sb6 = sb11;
                                    objectRef3 = objectRef6;
                                    if (substringBefore$default.equals("id")) {
                                        c = 2;
                                        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) removePrefix, (java.lang.CharSequence) "\u0000", false, 2, (java.lang.Object) null)) {
                                            str = removePrefix;
                                        }
                                    }
                                } else {
                                    if (hashCode == 3076010) {
                                        objectRef3 = objectRef6;
                                        if (substringBefore$default.equals(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                                            sb6 = sb11;
                                            sb6.append(removePrefix);
                                            sb6.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
                                            i3 = 1;
                                        }
                                    } else if (hashCode == 96891546) {
                                        objectRef3 = objectRef6;
                                        if (substringBefore$default.equals("event")) {
                                            str4 = removePrefix;
                                        }
                                    } else if (hashCode == 108405416 && substringBefore$default.equals("retry") && (longOrNull = kotlin.text.StringsKt.toLongOrNull(removePrefix)) != null) {
                                        long longValue = longOrNull.longValue();
                                        this.Camera2StreamConfigurationMap = longValue;
                                        objectRef3 = objectRef6;
                                        objectRef3.element = kotlin.coroutines.jvm.internal.Boxing.boxLong(longValue);
                                    } else {
                                        objectRef3 = objectRef6;
                                    }
                                    sb6 = sb11;
                                }
                                str5 = str4;
                                byteReadChannel5 = byteReadChannel4;
                                c = 2;
                            } else {
                                sb5.append(kotlin.text.StringsKt.removePrefix(kotlin.text.StringsKt.removePrefix(str2, (java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.COLON), (java.lang.CharSequence) " "));
                                sb5.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
                                c = 2;
                                str5 = str4;
                                sb6 = sb11;
                                objectRef3 = objectRef6;
                                byteReadChannel5 = byteReadChannel4;
                                i2 = 1;
                            }
                            defaultClientSSESession$parseEvent$1.getHighResolutionOutputSizeshNQ4ISI = byteReadChannel5;
                            defaultClientSSESession$parseEvent$1.getHighSpeedVideoFpsRanges = sb6;
                            defaultClientSSESession$parseEvent$1.Camera2StreamConfigurationMap = sb5;
                            defaultClientSSESession$parseEvent$1.getInputSizeshNQ4ISI = str5;
                            defaultClientSSESession$parseEvent$1.getOutputMinFrameDuration = objectRef3;
                            defaultClientSSESession$parseEvent$1.getOutputFormats = str;
                            defaultClientSSESession$parseEvent$1.getHighSpeedVideoFpsRangesFor = i3;
                            defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizes = i2;
                            defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizesFor = 3;
                            z = true;
                            readUTF8Line$default = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel5, 0, defaultClientSSESession$parseEvent$1, 1, null);
                            if (readUTF8Line$default != coroutine_suspended) {
                                str4 = str5;
                                obj = readUTF8Line$default;
                                java.lang.StringBuilder sb12 = sb6;
                                sb3 = sb5;
                                sb4 = sb12;
                                str2 = (java.lang.String) obj;
                                if (str2 != null) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        str5 = str4;
                        byteReadChannel5 = byteReadChannel4;
                        defaultClientSSESession$parseEvent$1.getHighResolutionOutputSizeshNQ4ISI = byteReadChannel5;
                        defaultClientSSESession$parseEvent$1.getHighSpeedVideoFpsRanges = sb6;
                        defaultClientSSESession$parseEvent$1.Camera2StreamConfigurationMap = sb5;
                        defaultClientSSESession$parseEvent$1.getInputSizeshNQ4ISI = str5;
                        defaultClientSSESession$parseEvent$1.getOutputMinFrameDuration = objectRef3;
                        defaultClientSSESession$parseEvent$1.getOutputFormats = str;
                        defaultClientSSESession$parseEvent$1.getHighSpeedVideoFpsRangesFor = i3;
                        defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizes = i2;
                        defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizesFor = 3;
                        z = true;
                        readUTF8Line$default = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel5, 0, defaultClientSSESession$parseEvent$1, 1, null);
                        if (readUTF8Line$default != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    i2 = defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizes;
                    i3 = defaultClientSSESession$parseEvent$1.getHighSpeedVideoFpsRangesFor;
                    str = (java.lang.String) defaultClientSSESession$parseEvent$1.getOutputMinFrameDuration;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) defaultClientSSESession$parseEvent$1.getInputSizeshNQ4ISI;
                    sb2 = (java.lang.StringBuilder) defaultClientSSESession$parseEvent$1.Camera2StreamConfigurationMap;
                    sb = (java.lang.StringBuilder) defaultClientSSESession$parseEvent$1.getHighSpeedVideoFpsRanges;
                    byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) defaultClientSSESession$parseEvent$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str3 = null;
                    str2 = (java.lang.String) obj;
                    if (str2 == null) {
                        return null;
                    }
                    if (!kotlin.text.StringsKt.isBlank(str2)) {
                        defaultClientSSESession$parseEvent$1.getHighResolutionOutputSizeshNQ4ISI = byteReadChannel2;
                        defaultClientSSESession$parseEvent$1.getHighSpeedVideoFpsRanges = sb;
                        defaultClientSSESession$parseEvent$1.Camera2StreamConfigurationMap = sb2;
                        defaultClientSSESession$parseEvent$1.getInputSizeshNQ4ISI = objectRef;
                        defaultClientSSESession$parseEvent$1.getOutputMinFrameDuration = str;
                        defaultClientSSESession$parseEvent$1.getHighSpeedVideoFpsRangesFor = i3;
                        defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizes = i2;
                        defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizesFor = 2;
                        obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel2, 0, defaultClientSSESession$parseEvent$1, 1, null);
                    } else {
                        str4 = str3;
                        byteReadChannel3 = byteReadChannel2;
                        objectRef2 = objectRef;
                        java.lang.StringBuilder sb13 = sb;
                        sb3 = sb2;
                        sb4 = sb13;
                        if (!kotlin.text.StringsKt.isBlank(str2)) {
                        }
                        str5 = str4;
                        byteReadChannel5 = byteReadChannel4;
                        defaultClientSSESession$parseEvent$1.getHighResolutionOutputSizeshNQ4ISI = byteReadChannel5;
                        defaultClientSSESession$parseEvent$1.getHighSpeedVideoFpsRanges = sb6;
                        defaultClientSSESession$parseEvent$1.Camera2StreamConfigurationMap = sb5;
                        defaultClientSSESession$parseEvent$1.getInputSizeshNQ4ISI = str5;
                        defaultClientSSESession$parseEvent$1.getOutputMinFrameDuration = objectRef3;
                        defaultClientSSESession$parseEvent$1.getOutputFormats = str;
                        defaultClientSSESession$parseEvent$1.getHighSpeedVideoFpsRangesFor = i3;
                        defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizes = i2;
                        defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizesFor = 3;
                        z = true;
                        readUTF8Line$default = io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel5, 0, defaultClientSSESession$parseEvent$1, 1, null);
                        if (readUTF8Line$default != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                }
                str2 = (java.lang.String) obj;
                if (str2 != null) {
                    return null;
                }
                str3 = null;
                if (!kotlin.text.StringsKt.isBlank(str2)) {
                }
            }
        }
        defaultClientSSESession$parseEvent$1 = new io.ktor.client.plugins.sse.DefaultClientSSESession$parseEvent$1(this, continuation);
        java.lang.Object obj4 = defaultClientSSESession$parseEvent$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultClientSSESession$parseEvent$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        str2 = (java.lang.String) obj4;
        if (str2 != null) {
        }
    }

    private static boolean getHighSpeedVideoFpsRanges(io.ktor.sse.ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getId() == null && serverSentEvent.getEvent() == null && serverSentEvent.getRetry() == null && serverSentEvent.getComments() == null;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tTjQSheNwAQr6Nx4zZtcy_zfhek(io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession, java.lang.Throwable th) {
        kotlinx.coroutines.JobKt__JobKt.cancel$default(defaultClientSSESession.getCoroutineContext(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        io.ktor.utils.io.ByteReadChannelKt.cancel(defaultClientSSESession.getHighSpeedVideoSizes);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$close(io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession) {
        kotlinx.coroutines.JobKt__JobKt.cancel$default(defaultClientSSESession.getCoroutineContext(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        io.ktor.utils.io.ByteReadChannelKt.cancel(defaultClientSSESession.getHighSpeedVideoSizes);
    }

    public static final /* synthetic */ java.lang.Object access$doReconnection(io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession, kotlin.coroutines.Continuation continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(defaultClientSSESession.getCoroutineContext(), new io.ktor.client.plugins.sse.DefaultClientSSESession$doReconnection$2(defaultClientSSESession, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ io.ktor.client.request.HttpRequestBuilder access$getRequestForReconnection(io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession) {
        io.ktor.client.request.HttpRequestBuilder takeFrom = new io.ktor.client.request.HttpRequestBuilder().takeFrom(defaultClientSSESession.getOutputFormats);
        takeFrom.getAttributes().remove(io.ktor.client.plugins.sse.BuildersKt.getSseRequestAttr());
        takeFrom.getAttributes().put(io.ktor.client.plugins.sse.SSEKt.getSSEReconnectionRequestAttr(), java.lang.Boolean.TRUE);
        java.lang.String str = defaultClientSSESession.getHighSpeedVideoFpsRanges;
        if (str != null) {
            takeFrom.getHeaders().append("Last-Event-ID", str);
        }
        return takeFrom;
    }

    public static final /* synthetic */ boolean access$isCommentsEvent(io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession, io.ktor.sse.ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getEvent() == null && serverSentEvent.getId() == null && serverSentEvent.getRetry() == null && serverSentEvent.getComments() != null;
    }

    public static final /* synthetic */ boolean access$isRetryEvent(io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession, io.ktor.sse.ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getEvent() == null && serverSentEvent.getId() == null && serverSentEvent.getComments() == null && serverSentEvent.getRetry() != null;
    }
}
