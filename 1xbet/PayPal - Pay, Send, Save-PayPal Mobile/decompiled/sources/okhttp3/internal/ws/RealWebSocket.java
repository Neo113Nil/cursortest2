package okhttp3.internal.ws;

@kotlin.Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u0000 \u008c\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\b\u008d\u0001\u008e\u0001\u008f\u0001\u008c\u0001BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#J%\u0010)\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020(¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0018¢\u0006\u0004\b/\u0010\u001aJ\r\u00100\u001a\u00020\u0018¢\u0006\u0004\b0\u0010\u001aJ\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u000201¢\u0006\u0004\b4\u00103J\r\u00105\u001a\u000201¢\u0006\u0004\b5\u00103J\u0017\u00107\u001a\u00020\u00182\u0006\u00106\u001a\u00020$H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00107\u001a\u00020\u00182\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b7\u0010;J\u0017\u0010=\u001a\u00020\u00182\u0006\u0010<\u001a\u000209H\u0016¢\u0006\u0004\b=\u0010;J\u0017\u0010>\u001a\u00020\u00182\u0006\u0010<\u001a\u000209H\u0016¢\u0006\u0004\b>\u0010;J\u001f\u0010A\u001a\u00020\u00182\u0006\u0010?\u001a\u0002012\u0006\u0010@\u001a\u00020$H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020(2\u0006\u00106\u001a\u00020$H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010C\u001a\u00020(2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\bC\u0010EJ\u001f\u0010H\u001a\u00020(2\u0006\u0010F\u001a\u0002092\u0006\u0010G\u001a\u000201H\u0002¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020(2\u0006\u0010<\u001a\u000209¢\u0006\u0004\bJ\u0010EJ!\u0010K\u001a\u00020(2\u0006\u0010?\u001a\u0002012\b\u0010@\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\bK\u0010LJ'\u0010K\u001a\u00020(2\u0006\u0010?\u001a\u0002012\b\u0010@\u001a\u0004\u0018\u00010$2\u0006\u0010M\u001a\u00020\f¢\u0006\u0004\bK\u0010NJ\u000f\u0010O\u001a\u00020\u0018H\u0002¢\u0006\u0004\bO\u0010\u001aJ\u000f\u0010P\u001a\u00020(H\u0000¢\u0006\u0004\bP\u0010.J\u000f\u0010Q\u001a\u00020\u0018H\u0000¢\u0006\u0004\bQ\u0010\u001aJ/\u0010V\u001a\u00020\u00182\n\u0010T\u001a\u00060Rj\u0002`S2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010U\u001a\u00020(¢\u0006\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010\t\u001a\u00020\b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010H\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010O\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010d\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010b\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u0010aR\u0014\u0010g\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bf\u0010aR\u0014\u0010e\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bh\u0010iR$\u0010k\u001a\u0004\u0018\u00010j8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0018\u0010t\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010X\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010h\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010v\u001a\u00020{8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0018\u0010^\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bt\u0010iR\u0018\u0010`\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u0002090\u0080\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001e\u0010\u0081\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010\u0080\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bg\u0010\u0082\u0001R\u0018\u0010\u0085\u0001\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010aR\u0018\u0010\u0087\u0001\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bd\u0010\u0086\u0001R\u0019\u0010\u0089\u0001\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010\u008b\u0001\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010iR\u0018\u0010\u008a\u0001\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bH\u0010\u0086\u0001R\u0018\u0010~\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0088\u0001R\u0018\u0010y\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0088\u0001R\u0018\u0010|\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0088\u0001R\u0017\u0010f\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bZ\u0010\u0086\u0001"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/Request;", "originalRequest", "Lokhttp3/WebSocketListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/util/Random;", "random", "", "pingIntervalMillis", "Lokhttp3/internal/ws/WebSocketExtensions;", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "minimumDeflateSize", "webSocketCloseTimeout", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;JJ)V", "request", "()Lokhttp3/Request;", "queueSize", "()J", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "Lokhttp3/OkHttpClient;", "client", "connect", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Response;", "response", "Lokio/Socket;", "checkUpgradeSuccess$okhttp", "(Lokhttp3/Response;)Lokio/Socket;", "", "name", "Lokhttp3/internal/connection/BufferedSocket;", "socket", "", "initReaderAndWriter", "(Ljava/lang/String;Lokhttp3/internal/connection/BufferedSocket;Z)V", "loopReader", "(Lokhttp3/Response;)V", "processNextFrame", "()Z", "finishReader", "tearDown", "", "sentPingCount", "()I", "receivedPingCount", "receivedPongCount", "text", "onReadMessage", "(Ljava/lang/String;)V", "Lokio/ByteString;", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "(Lokio/ByteString;)V", "payload", "onReadPing", "onReadPong", "code", "reason", "onReadClose", "(ILjava/lang/String;)V", "send", "(Ljava/lang/String;)Z", "(Lokio/ByteString;)Z", "p0", "p1", "getHighSpeedVideoSizes", "(Lokio/ByteString;I)Z", "pong", "close", "(ILjava/lang/String;)Z", "cancelAfterCloseMillis", "(ILjava/lang/String;J)Z", "getHighResolutionOutputSizeshNQ4ISI", "writeOneFrame$okhttp", "writePingFrame$okhttp", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "e", "isWriter", "failWebSocket", "(Ljava/lang/Exception;Lokhttp3/Response;Z)V", "getHighSpeedVideoSizesFor", "Lokhttp3/Request;", "Camera2StreamConfigurationMap", "Lokhttp3/WebSocketListener;", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "getOutputStallDurationlomOqCM", "Ljava/util/Random;", "getOutputStallDuration", "J", "getHighSpeedVideoFpsRangesFor", "Lokhttp3/internal/ws/WebSocketExtensions;", "getHighSpeedVideoFpsRanges", "getOutputFormats", "CoroutineDebuggingKt", "getOutputMinFrameDuration", "getInputFormats", "Ljava/lang/String;", "Lokhttp3/Call;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "getCall$okhttp", "()Lokhttp3/Call;", "setCall$okhttp", "(Lokhttp3/Call;)V", "Lokhttp3/internal/concurrent/Task;", "accessartificialFrame", "Lokhttp3/internal/concurrent/Task;", "getInputSizeshNQ4ISI", "Lokhttp3/internal/ws/WebSocketReader;", "getOutputSizeshNQ4ISI", "Lokhttp3/internal/ws/WebSocketReader;", "Lokhttp3/internal/ws/WebSocketWriter;", "coroutineCreation", "Lokhttp3/internal/ws/WebSocketWriter;", "Lokhttp3/internal/concurrent/TaskQueue;", "ArtificialStackFrames", "Lokhttp3/internal/concurrent/TaskQueue;", "coroutineBoundary", "Lokio/Socket;", "Ljava/util/ArrayDeque;", "getOutputSizes", "Ljava/util/ArrayDeque;", "getOutputMinFrameDurationlomOqCM", "", "toString", "Z", "isOutputSupportedFor", com.visa.cbp.getEncExpo.warmup, "getValidOutputFormatsForInputhNQ4ISI", "unwrapAs", "isOutputSupportedForhNQ4ISI", "Companion", "Message", com.knotapi.knot.utilities.Constants.META_CLOSE, "WriterTask"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealWebSocket implements okhttp3.WebSocket, okhttp3.internal.ws.WebSocketReader.FrameCallback, okhttp3.internal.concurrent.Lockable {
    public static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;

    /* renamed from: ArtificialStackFrames, reason: from kotlin metadata */
    private okhttp3.internal.concurrent.TaskQueue getOutputSizeshNQ4ISI;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean CoroutineDebuggingKt;

    /* renamed from: CoroutineDebuggingKt, reason: from kotlin metadata */
    private final long getOutputMinFrameDuration;

    /* renamed from: accessartificialFrame, reason: from kotlin metadata */
    private okhttp3.internal.concurrent.Task getInputSizeshNQ4ISI;
    private okhttp3.Call call;

    /* renamed from: coroutineBoundary, reason: from kotlin metadata */
    private okio.Socket getOutputStallDuration;

    /* renamed from: coroutineCreation, reason: from kotlin metadata */
    private okhttp3.internal.ws.WebSocketWriter getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean isOutputSupportedFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private okhttp3.internal.ws.WebSocketExtensions getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean unwrapAs;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final okhttp3.Request Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.lang.String getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getOutputStallDurationlomOqCM;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.util.ArrayDeque<java.lang.Object> getOutputSizes;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private long toString;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final java.util.ArrayDeque<okio.ByteString> getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private okhttp3.internal.ws.WebSocketReader getHighSpeedVideoSizesFor;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final java.util.Random getHighSpeedVideoSizes;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private int coroutineCreation;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private int getValidOutputFormatsForInputhNQ4ISI;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private int ArtificialStackFrames;
    private final okhttp3.WebSocketListener listener;

    /* renamed from: toString, reason: from kotlin metadata */
    private int coroutineBoundary;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private java.lang.String isOutputSupportedForhNQ4ISI;
    private static final java.util.List<okhttp3.Protocol> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf(okhttp3.Protocol.HTTP_1_1);

    public RealWebSocket(okhttp3.internal.concurrent.TaskRunner taskRunner, okhttp3.Request request, okhttp3.WebSocketListener webSocketListener, java.util.Random random, long j, okhttp3.internal.ws.WebSocketExtensions webSocketExtensions, long j2, long j3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        this.Camera2StreamConfigurationMap = request;
        this.listener = webSocketListener;
        this.getHighSpeedVideoSizes = random;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRanges = webSocketExtensions;
        this.getHighSpeedVideoFpsRangesFor = j2;
        this.getOutputMinFrameDuration = j3;
        this.getOutputSizeshNQ4ISI = taskRunner.newQueue();
        this.getOutputMinFrameDurationlomOqCM = new java.util.ArrayDeque<>();
        this.getOutputSizes = new java.util.ArrayDeque<>();
        this.getValidOutputFormatsForInputhNQ4ISI = -1;
        if (!kotlin.jvm.internal.Intrinsics.areEqual("GET", request.method())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Request must be GET: ");
            sb.append(request.method());
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        okio.ByteString.Companion companion = okio.ByteString.INSTANCE;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        this.getOutputFormats = okio.ByteString.Companion.of$default(companion, bArr, 0, 0, 3, null).base64();
    }

    /* renamed from: getListener$okhttp, reason: from getter */
    public final okhttp3.WebSocketListener getListener() {
        return this.listener;
    }

    /* renamed from: getCall$okhttp, reason: from getter */
    public final okhttp3.Call getCall() {
        return this.call;
    }

    public final void setCall$okhttp(okhttp3.Call call) {
        this.call = call;
    }

    @Override // okhttp3.WebSocket
    /* renamed from: request, reason: from getter */
    public final okhttp3.Request getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // okhttp3.WebSocket
    public final long queueSize() {
        long j;
        synchronized (this) {
            j = this.toString;
        }
        return j;
    }

    @Override // okhttp3.WebSocket
    public final void cancel() {
        okhttp3.Call call = this.call;
        kotlin.jvm.internal.Intrinsics.checkNotNull(call);
        call.cancel();
    }

    public final void connect(okhttp3.OkHttpClient client) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        if (this.Camera2StreamConfigurationMap.header(com.google.common.net.HttpHeaders.SEC_WEBSOCKET_EXTENSIONS) != null) {
            failWebSocket$default(this, new java.net.ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, false, 6, null);
            return;
        }
        okhttp3.OkHttpClient build = client.newBuilder().eventListener(okhttp3.EventListener.NONE).protocols(getHighResolutionOutputSizeshNQ4ISI).build();
        final okhttp3.Request build2 = this.Camera2StreamConfigurationMap.newBuilder().header(com.google.common.net.HttpHeaders.UPGRADE, "websocket").header(com.google.common.net.HttpHeaders.CONNECTION, com.google.common.net.HttpHeaders.UPGRADE).header(com.google.common.net.HttpHeaders.SEC_WEBSOCKET_KEY, this.getOutputFormats).header(com.google.common.net.HttpHeaders.SEC_WEBSOCKET_VERSION, "13").header(com.google.common.net.HttpHeaders.SEC_WEBSOCKET_EXTENSIONS, "permessage-deflate").build();
        okhttp3.internal.connection.RealCall realCall = new okhttp3.internal.connection.RealCall(build, build2, true);
        this.call = realCall;
        kotlin.jvm.internal.Intrinsics.checkNotNull(realCall);
        realCall.enqueue(new okhttp3.Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public final void onResponse(okhttp3.Call call, okhttp3.Response response) {
                okio.Source source;
                okio.Sink sink;
                java.util.ArrayDeque arrayDeque;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                try {
                    okio.Socket checkUpgradeSuccess$okhttp = okhttp3.internal.ws.RealWebSocket.this.checkUpgradeSuccess$okhttp(response);
                    okhttp3.internal.ws.WebSocketExtensions parse = okhttp3.internal.ws.WebSocketExtensions.INSTANCE.parse(response.headers());
                    okhttp3.internal.ws.RealWebSocket.this.getHighSpeedVideoFpsRanges = parse;
                    if (!okhttp3.internal.ws.RealWebSocket.access$isValid(okhttp3.internal.ws.RealWebSocket.this, parse)) {
                        okhttp3.internal.ws.RealWebSocket realWebSocket = okhttp3.internal.ws.RealWebSocket.this;
                        synchronized (realWebSocket) {
                            arrayDeque = realWebSocket.getOutputSizes;
                            arrayDeque.clear();
                            realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(okhttp3.internal._UtilJvmKt.okHttpName);
                    sb.append(" WebSocket ");
                    sb.append(build2.url().redact());
                    okhttp3.internal.ws.RealWebSocket.this.initReaderAndWriter(sb.toString(), okhttp3.internal.connection.BufferedSocketKt.asBufferedSocket(checkUpgradeSuccess$okhttp), true);
                    okhttp3.internal.ws.RealWebSocket.this.loopReader(response);
                } catch (java.io.IOException e) {
                    okhttp3.internal.ws.RealWebSocket.failWebSocket$default(okhttp3.internal.ws.RealWebSocket.this, e, response, false, 4, null);
                    okhttp3.internal._UtilCommonKt.closeQuietly(response);
                    okio.Socket socket = response.getSocket();
                    if (socket != null && (sink = socket.getSink()) != null) {
                        okhttp3.internal._UtilCommonKt.closeQuietly(sink);
                    }
                    okio.Socket socket2 = response.getSocket();
                    if (socket2 == null || (source = socket2.getSource()) == null) {
                        return;
                    }
                    okhttp3.internal._UtilCommonKt.closeQuietly(source);
                }
            }

            @Override // okhttp3.Callback
            public final void onFailure(okhttp3.Call call, java.io.IOException e) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
                okhttp3.internal.ws.RealWebSocket.failWebSocket$default(okhttp3.internal.ws.RealWebSocket.this, e, null, false, 6, null);
            }
        });
    }

    public final okio.Socket checkUpgradeSuccess$okhttp(okhttp3.Response response) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        if (response.code() != 101) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected HTTP 101 response but was '");
            sb.append(response.code());
            sb.append(' ');
            sb.append(response.message());
            sb.append('\'');
            throw new java.net.ProtocolException(sb.toString());
        }
        java.lang.String header$default = okhttp3.Response.header$default(response, com.google.common.net.HttpHeaders.CONNECTION, null, 2, null);
        if (!kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.UPGRADE, header$default, true)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected 'Connection' header value 'Upgrade' but was '");
            sb2.append(header$default);
            sb2.append('\'');
            throw new java.net.ProtocolException(sb2.toString());
        }
        java.lang.String header$default2 = okhttp3.Response.header$default(response, com.google.common.net.HttpHeaders.UPGRADE, null, 2, null);
        if (!kotlin.text.StringsKt.equals("websocket", header$default2, true)) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected 'Upgrade' header value 'websocket' but was '");
            sb3.append(header$default2);
            sb3.append('\'');
            throw new java.net.ProtocolException(sb3.toString());
        }
        java.lang.String header$default3 = okhttp3.Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
        okio.ByteString.Companion companion = okio.ByteString.INSTANCE;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(this.getOutputFormats);
        sb4.append(okhttp3.internal.ws.WebSocketProtocol.ACCEPT_MAGIC);
        java.lang.String base64 = companion.encodeUtf8(sb4.toString()).sha1().base64();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(base64, header$default3)) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Expected 'Sec-WebSocket-Accept' header value '");
            sb5.append(base64);
            sb5.append("' but was '");
            sb5.append(header$default3);
            sb5.append('\'');
            throw new java.net.ProtocolException(sb5.toString());
        }
        okio.Socket socket = response.getSocket();
        if (socket != null) {
            return socket;
        }
        throw new java.net.ProtocolException("Web Socket socket missing: bad interceptor?");
    }

    public final void initReaderAndWriter(java.lang.String name2, okhttp3.internal.connection.BufferedSocket socket, boolean client) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
        okhttp3.internal.ws.WebSocketExtensions webSocketExtensions = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(webSocketExtensions);
        synchronized (this) {
            this.getOutputStallDurationlomOqCM = name2;
            this.getOutputStallDuration = socket;
            this.getInputFormats = new okhttp3.internal.ws.WebSocketWriter(client, socket.getSink(), this.getHighSpeedVideoSizes, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(client), this.getHighSpeedVideoFpsRangesFor);
            this.getInputSizeshNQ4ISI = new okhttp3.internal.ws.RealWebSocket.WriterTask();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                final long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(this.getHighResolutionOutputSizeshNQ4ISI);
                okhttp3.internal.concurrent.TaskQueue taskQueue = this.getOutputSizeshNQ4ISI;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(name2);
                sb.append(" ping");
                taskQueue.schedule(sb.toString(), nanos, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Long.valueOf(okhttp3.internal.ws.RealWebSocket.$r8$lambda$M3uLbVxgXTEj1BhnKpRA6a_aJpc(okhttp3.internal.ws.RealWebSocket.this, nanos));
                    }
                });
            }
            if (!this.getOutputSizes.isEmpty()) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        this.getHighSpeedVideoSizesFor = new okhttp3.internal.ws.WebSocketReader(client, socket.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!client));
    }

    public final void loopReader(okhttp3.Response response) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        try {
            this.listener.onOpen(this, response);
            while (this.getValidOutputFormatsForInputhNQ4ISI == -1) {
                okhttp3.internal.ws.WebSocketReader webSocketReader = this.getHighSpeedVideoSizesFor;
                kotlin.jvm.internal.Intrinsics.checkNotNull(webSocketReader);
                webSocketReader.processNextFrame();
            }
        } catch (java.lang.Exception e) {
            failWebSocket$default(this, e, null, false, 6, null);
        } finally {
            finishReader();
        }
    }

    public final boolean processNextFrame() throws java.io.IOException {
        try {
            okhttp3.internal.ws.WebSocketReader webSocketReader = this.getHighSpeedVideoSizesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
            return this.getValidOutputFormatsForInputhNQ4ISI == -1;
        } catch (java.lang.Exception e) {
            failWebSocket$default(this, e, null, false, 6, null);
            return false;
        }
    }

    public final void finishReader() {
        int i;
        java.lang.String str;
        okhttp3.internal.ws.WebSocketReader webSocketReader;
        boolean z;
        synchronized (this) {
            i = this.getValidOutputFormatsForInputhNQ4ISI;
            str = this.isOutputSupportedForhNQ4ISI;
            webSocketReader = this.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoSizesFor = null;
            if (this.isOutputSupportedFor && this.getOutputSizes.isEmpty()) {
                final okhttp3.internal.ws.WebSocketWriter webSocketWriter = this.getInputFormats;
                if (webSocketWriter != null) {
                    this.getInputFormats = null;
                    okhttp3.internal.concurrent.TaskQueue taskQueue = this.getOutputSizeshNQ4ISI;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(this.getOutputStallDurationlomOqCM);
                    sb.append(" writer close");
                    okhttp3.internal.concurrent.TaskQueue.execute$default(taskQueue, sb.toString(), 0L, false, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return okhttp3.internal.ws.RealWebSocket.m24427$r8$lambda$0T3qT4Eg5PnlD3bXT9nHdqY_Jw(okhttp3.internal.ws.WebSocketWriter.this);
                        }
                    }, 2, null);
                }
                this.getOutputSizeshNQ4ISI.shutdown();
            }
            z = (this.unwrapAs || this.getInputFormats != null || this.getValidOutputFormatsForInputhNQ4ISI == -1) ? false : true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (z) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            this.listener.onClosed(this, i, str);
        }
        if (webSocketReader != null) {
            okhttp3.internal._UtilCommonKt.closeQuietly(webSocketReader);
        }
    }

    public final void tearDown() throws java.lang.InterruptedException {
        this.getOutputSizeshNQ4ISI.shutdown();
        this.getOutputSizeshNQ4ISI.idleLatch().await(10L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public final int sentPingCount() {
        int i;
        synchronized (this) {
            i = this.coroutineBoundary;
        }
        return i;
    }

    public final int receivedPingCount() {
        int i;
        synchronized (this) {
            i = this.coroutineCreation;
        }
        return i;
    }

    public final int receivedPongCount() {
        int i;
        synchronized (this) {
            i = this.ArtificialStackFrames;
        }
        return i;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadMessage(java.lang.String text) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        this.listener.onMessage(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadMessage(okio.ByteString bytes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "");
        this.listener.onMessage(this, bytes);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadPing(okio.ByteString payload) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
            if (!this.unwrapAs && (!this.isOutputSupportedFor || !this.getOutputSizes.isEmpty())) {
                this.getOutputMinFrameDurationlomOqCM.add(payload);
                getHighResolutionOutputSizeshNQ4ISI();
                this.coroutineCreation++;
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadPong(okio.ByteString payload) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
            this.ArtificialStackFrames++;
            this.CoroutineDebuggingKt = false;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadClose(int code, java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        if (code == -1) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (this.getValidOutputFormatsForInputhNQ4ISI != -1) {
                throw new java.lang.IllegalStateException("already closed".toString());
            }
            this.getValidOutputFormatsForInputhNQ4ISI = code;
            this.isOutputSupportedForhNQ4ISI = reason;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        this.listener.onClosing(this, code, reason);
    }

    @Override // okhttp3.WebSocket
    public final boolean send(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        return getHighSpeedVideoSizes(okio.ByteString.INSTANCE.encodeUtf8(text), 1);
    }

    @Override // okhttp3.WebSocket
    public final boolean send(okio.ByteString bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "");
        return getHighSpeedVideoSizes(bytes, 2);
    }

    private final boolean getHighSpeedVideoSizes(okio.ByteString p0, int p1) {
        synchronized (this) {
            if (!this.unwrapAs && !this.isOutputSupportedFor) {
                if (this.toString + p0.size() > 16777216) {
                    close(1001, null);
                    return false;
                }
                this.toString += p0.size();
                this.getOutputSizes.add(new okhttp3.internal.ws.RealWebSocket.Message(p1, p0));
                getHighResolutionOutputSizeshNQ4ISI();
                return true;
            }
            return false;
        }
    }

    public final boolean pong(okio.ByteString payload) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
            if (!this.unwrapAs && (!this.isOutputSupportedFor || !this.getOutputSizes.isEmpty())) {
                this.getOutputMinFrameDurationlomOqCM.add(payload);
                getHighResolutionOutputSizeshNQ4ISI();
                return true;
            }
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public final boolean close(int code, java.lang.String reason) {
        return close(code, reason, this.getOutputMinFrameDuration);
    }

    public final boolean close(int code, java.lang.String reason, long cancelAfterCloseMillis) {
        okio.ByteString byteString;
        synchronized (this) {
            okhttp3.internal.ws.WebSocketProtocol.INSTANCE.validateCloseCode(code);
            if (reason != null) {
                byteString = okio.ByteString.INSTANCE.encodeUtf8(reason);
                if (byteString.size() > 123) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("reason.size() > 123: ");
                    sb.append(reason);
                    throw new java.lang.IllegalArgumentException(sb.toString().toString());
                }
            } else {
                byteString = null;
            }
            if (!this.unwrapAs && !this.isOutputSupportedFor) {
                this.isOutputSupportedFor = true;
                this.getOutputSizes.add(new okhttp3.internal.ws.RealWebSocket.Close(code, byteString, cancelAfterCloseMillis));
                getHighResolutionOutputSizeshNQ4ISI();
                return true;
            }
            return false;
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        okhttp3.internal.ws.RealWebSocket realWebSocket = this;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(realWebSocket)) {
            okhttp3.internal.concurrent.Task task = this.getInputSizeshNQ4ISI;
            if (task != null) {
                okhttp3.internal.concurrent.TaskQueue.schedule$default(this.getOutputSizeshNQ4ISI, task, 0L, 2, null);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append(" MUST hold lock on ");
        sb.append(realWebSocket);
        throw new java.lang.AssertionError(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final boolean writeOneFrame$okhttp() throws java.io.IOException {
        okhttp3.internal.ws.WebSocketWriter webSocketWriter;
        java.lang.String str;
        synchronized (this) {
            boolean z = false;
            if (this.unwrapAs) {
                return false;
            }
            okhttp3.internal.ws.WebSocketWriter webSocketWriter2 = this.getInputFormats;
            okio.ByteString poll = this.getOutputMinFrameDurationlomOqCM.poll();
            int i = -1;
            okhttp3.internal.ws.RealWebSocket.Message message = 0;
            if (poll == null) {
                java.lang.Object poll2 = this.getOutputSizes.poll();
                if (poll2 instanceof okhttp3.internal.ws.RealWebSocket.Close) {
                    int i2 = this.getValidOutputFormatsForInputhNQ4ISI;
                    str = this.isOutputSupportedForhNQ4ISI;
                    if (i2 != -1) {
                        okhttp3.internal.ws.WebSocketWriter webSocketWriter3 = this.getInputFormats;
                        this.getInputFormats = null;
                        if (webSocketWriter3 != null && this.getHighSpeedVideoSizesFor == null) {
                            z = true;
                        }
                        this.getOutputSizeshNQ4ISI.shutdown();
                        message = poll2;
                        webSocketWriter = webSocketWriter3;
                        i = i2;
                    } else {
                        long cancelAfterCloseMillis = ((okhttp3.internal.ws.RealWebSocket.Close) poll2).getCancelAfterCloseMillis();
                        okhttp3.internal.concurrent.TaskQueue taskQueue = this.getOutputSizeshNQ4ISI;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(this.getOutputStallDurationlomOqCM);
                        sb.append(" cancel");
                        okhttp3.internal.concurrent.TaskQueue.execute$default(taskQueue, sb.toString(), java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis), false, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return okhttp3.internal.ws.RealWebSocket.$r8$lambda$3UeTKdScoteZtprq_bJvU_Ppjpc(okhttp3.internal.ws.RealWebSocket.this);
                            }
                        }, 4, null);
                        i = i2;
                        webSocketWriter = null;
                        message = poll2;
                    }
                } else {
                    if (poll2 == null) {
                        return false;
                    }
                    str = null;
                    message = poll2;
                    webSocketWriter = null;
                }
            } else {
                webSocketWriter = null;
                str = null;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            try {
                if (poll != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(webSocketWriter2);
                    webSocketWriter2.writePong(poll);
                } else if (message instanceof okhttp3.internal.ws.RealWebSocket.Message) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(webSocketWriter2);
                    webSocketWriter2.writeMessageFrame(message.getFormatOpcode(), message.getData());
                    synchronized (this) {
                        this.toString -= message.getData().size();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (!(message instanceof okhttp3.internal.ws.RealWebSocket.Close)) {
                        throw new java.lang.AssertionError();
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNull(webSocketWriter2);
                    webSocketWriter2.writeClose(message.getCode(), ((okhttp3.internal.ws.RealWebSocket.Close) message).getReason());
                    if (z) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                        this.listener.onClosed(this, i, str);
                    }
                }
                if (webSocketWriter != null) {
                    okhttp3.internal._UtilCommonKt.closeQuietly(webSocketWriter);
                }
                return true;
            } catch (java.lang.Throwable th) {
                if (webSocketWriter != null) {
                    okhttp3.internal._UtilCommonKt.closeQuietly(webSocketWriter);
                }
                throw th;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            if (this.unwrapAs) {
                return;
            }
            okhttp3.internal.ws.WebSocketWriter webSocketWriter = this.getInputFormats;
            if (webSocketWriter == null) {
                return;
            }
            int i = this.CoroutineDebuggingKt ? this.coroutineBoundary : -1;
            this.coroutineBoundary++;
            this.CoroutineDebuggingKt = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            if (i == -1) {
                try {
                    webSocketWriter.writePing(okio.ByteString.EMPTY);
                    return;
                } catch (java.io.IOException e) {
                    failWebSocket$default(this, e, null, true, 2, null);
                    return;
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("sent ping but didn't receive pong within ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append("ms (after ");
            sb.append(i - 1);
            sb.append(" successful ping/pongs)");
            failWebSocket$default(this, new java.net.SocketTimeoutException(sb.toString()), null, true, 2, null);
        }
    }

    public static /* synthetic */ void failWebSocket$default(okhttp3.internal.ws.RealWebSocket realWebSocket, java.lang.Exception exc, okhttp3.Response response, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            response = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        realWebSocket.failWebSocket(exc, response, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, okhttp3.internal.ws.WebSocketWriter] */
    public final void failWebSocket(java.lang.Exception e, okhttp3.Response response, boolean isWriter) {
        okhttp3.internal.ws.WebSocketWriter webSocketWriter;
        okhttp3.internal.ws.WebSocketWriter webSocketWriter2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        synchronized (this) {
            if (this.unwrapAs) {
                return;
            }
            this.unwrapAs = true;
            okio.Socket socket = this.getOutputStallDuration;
            objectRef.element = this.getInputFormats;
            this.getInputFormats = null;
            if (!isWriter && objectRef.element != 0) {
                okhttp3.internal.concurrent.TaskQueue taskQueue = this.getOutputSizeshNQ4ISI;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.getOutputStallDurationlomOqCM);
                sb.append(" writer close");
                okhttp3.internal.concurrent.TaskQueue.execute$default(taskQueue, sb.toString(), 0L, false, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return okhttp3.internal.ws.RealWebSocket.$r8$lambda$CoyTb8PMxSv5bSlhxaYuHDtmnaQ(kotlin.jvm.internal.Ref.ObjectRef.this);
                    }
                }, 2, null);
            }
            this.getOutputSizeshNQ4ISI.shutdown();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            try {
                this.listener.onFailure(this, e, response);
                if (socket != null) {
                    socket.cancel();
                }
                if (!isWriter || (webSocketWriter2 = (okhttp3.internal.ws.WebSocketWriter) objectRef.element) == null) {
                    return;
                }
                okhttp3.internal._UtilCommonKt.closeQuietly(webSocketWriter2);
            } catch (java.lang.Throwable th) {
                if (socket != null) {
                    socket.cancel();
                }
                if (isWriter && (webSocketWriter = (okhttp3.internal.ws.WebSocketWriter) objectRef.element) != null) {
                    okhttp3.internal._UtilCommonKt.closeQuietly(webSocketWriter);
                }
                throw th;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "", "formatOpcode", "Lokio/ByteString;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(ILokio/ByteString;)V", com.visa.cbp.getEncExpo.warmup, "getFormatOpcode", "()I", "Lokio/ByteString;", "getData", "()Lokio/ByteString;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Message {
        private final okio.ByteString data;
        private final int formatOpcode;

        public Message(int i, okio.ByteString byteString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
            this.formatOpcode = i;
            this.data = byteString;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }

        public final okio.ByteString getData() {
            return this.data;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "", "code", "Lokio/ByteString;", "reason", "", "cancelAfterCloseMillis", "<init>", "(ILokio/ByteString;J)V", com.visa.cbp.getEncExpo.warmup, "getCode", "()I", "Lokio/ByteString;", "getReason", "()Lokio/ByteString;", "J", "getCancelAfterCloseMillis", "()J"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final okio.ByteString reason;

        public Close(int i, okio.ByteString byteString, long j) {
            this.code = i;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j;
        }

        public final int getCode() {
            return this.code;
        }

        public final okio.ByteString getReason() {
            return this.reason;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "<init>", "(Lokhttp3/internal/ws/RealWebSocket;)V", "", "runOnce", "()J"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    final class WriterTask extends okhttp3.internal.concurrent.Task {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public WriterTask() {
            super(r0.toString(), false, 2, null);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(okhttp3.internal.ws.RealWebSocket.this.getOutputStallDurationlomOqCM);
            sb.append(" writer");
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long runOnce() {
            try {
                return okhttp3.internal.ws.RealWebSocket.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (java.io.IOException e) {
                okhttp3.internal.ws.RealWebSocket.failWebSocket$default(okhttp3.internal.ws.RealWebSocket.this, e, null, true, 2, null);
                return -1L;
            }
        }
    }

    /* renamed from: $r8$lambda$0T3qT4Eg5PnlD3bX-T9nHdqY_Jw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24427$r8$lambda$0T3qT4Eg5PnlD3bXT9nHdqY_Jw(okhttp3.internal.ws.WebSocketWriter webSocketWriter) {
        okhttp3.internal._UtilCommonKt.closeQuietly(webSocketWriter);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3UeTKdScoteZtprq_bJvU_Ppjpc(okhttp3.internal.ws.RealWebSocket realWebSocket) {
        realWebSocket.cancel();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CoyTb8PMxSv5bSlhxaYuHDtmnaQ(kotlin.jvm.internal.Ref.ObjectRef objectRef) {
        okhttp3.internal._UtilCommonKt.closeQuietly((java.io.Closeable) objectRef.element);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ long $r8$lambda$M3uLbVxgXTEj1BhnKpRA6a_aJpc(okhttp3.internal.ws.RealWebSocket realWebSocket, long j) {
        realWebSocket.writePingFrame$okhttp();
        return j;
    }

    public static final /* synthetic */ boolean access$isValid(okhttp3.internal.ws.RealWebSocket realWebSocket, okhttp3.internal.ws.WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        if (webSocketExtensions.serverMaxWindowBits == null) {
            return true;
        }
        int intValue = webSocketExtensions.serverMaxWindowBits.intValue();
        return 8 <= intValue && intValue < 16;
    }
}
