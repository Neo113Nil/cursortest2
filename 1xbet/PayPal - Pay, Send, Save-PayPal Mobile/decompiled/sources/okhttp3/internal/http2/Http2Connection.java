package okhttp3.internal.http2;

@kotlin.Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0006\u0018\u0000 µ\u00012\u00020\u00012\u00020\u0002:\b¶\u0001·\u0001¸\u0001µ\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010!\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\"\u0010\u001cJ-\u0010%\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00192\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0000¢\u0006\u0004\b%\u0010&J/\u0010*\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020\u0010¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u00100\u001a\u00020,H\u0000¢\u0006\u0004\b1\u0010/J\u001f\u00103\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0010H\u0000¢\u0006\u0004\b3\u00104J%\u00108\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0007¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0012¢\u0006\u0004\b:\u0010;J\r\u00108\u001a\u00020\u0012¢\u0006\u0004\b8\u0010;J\r\u0010<\u001a\u00020\u0012¢\u0006\u0004\b<\u0010;J\r\u0010=\u001a\u00020\u0012¢\u0006\u0004\b=\u0010;J\u0015\u0010>\u001a\u00020\u00122\u0006\u00100\u001a\u00020,¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0012H\u0016¢\u0006\u0004\b@\u0010;J)\u0010E\u001a\u00020\u00122\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020,2\b\u0010D\u001a\u0004\u0018\u00010CH\u0000¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00122\b\b\u0002\u0010G\u001a\u00020\u0019¢\u0006\u0004\bH\u0010IJ\u0015\u0010L\u001a\u00020\u00122\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u0010¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0012H\u0000¢\u0006\u0004\bQ\u0010;J\u0017\u0010R\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\bR\u0010SJ%\u0010T\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0000¢\u0006\u0004\bT\u0010UJ-\u0010W\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010V\u001a\u00020\u0019H\u0000¢\u0006\u0004\bW\u0010XJ/\u0010[\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020Y2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010V\u001a\u00020\u0019H\u0000¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b]\u0010/R\u001a\u0010^\u001a\u00020\u00198\u0001X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010c\u001a\u00020b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR&\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0g8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010m\u001a\u00020l8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\"\u0010q\u001a\u00020\u00078\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010\t\"\u0004\bt\u0010uR\"\u0010v\u001a\u00020\u00078\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bv\u0010r\u001a\u0004\bw\u0010\t\"\u0004\bx\u0010uR\u0016\u0010y\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\by\u0010_R\u0014\u0010{\u001a\u00020z8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007fR\u0016\u0010\u0081\u0001\u001a\u00020}8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u007fR\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0085\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0086\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0086\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0086\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0086\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0086\u0001R \u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001f\u0010\u0092\u0001\u001a\u00020J8\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R(\u0010\u0096\u0001\u001a\u00020J8\u0007@\u0007X\u0087\u000e¢\u0006\u0017\n\u0006\b\u0096\u0001\u0010\u0093\u0001\u001a\u0006\b\u0097\u0001\u0010\u0095\u0001\"\u0005\b\u0098\u0001\u0010MR \u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R)\u0010\u009e\u0001\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00108\u0007@BX\u0087\u000e¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u0086\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R)\u0010¡\u0001\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00108\u0007@BX\u0087\u000e¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u0086\u0001\u001a\u0006\b¢\u0001\u0010 \u0001R \u0010¤\u0001\u001a\u00030£\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R \u0010©\u0001\u001a\u00030¨\u00018\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R$\u0010®\u0001\u001a\u00070\u00ad\u0001R\u00020\u00008\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R\u001e\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070²\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/internal/http2/Http2Connection$Builder;", "builder", "<init>", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "", "openStreamCount", "()I", "id", "Lokhttp3/internal/http2/Http2Stream;", "getStream", "(I)Lokhttp3/internal/http2/Http2Stream;", "streamId", "removeStream$okhttp", "", "read", "", "updateConnectionFlowControl$okhttp", "(J)V", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "", "out", "pushStream", "(ILjava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;", "newStream", "(Ljava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;", "p0", "p1", "p2", "getHighResolutionOutputSizeshNQ4ISI", "outFinished", "alternating", "writeHeaders$okhttp", "(IZLjava/util/List;)V", "Lokio/Buffer;", "buffer", "byteCount", "writeData", "(IZLokio/Buffer;J)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "writeSynResetLater$okhttp", "(ILokhttp3/internal/http2/ErrorCode;)V", "statusCode", "writeSynReset$okhttp", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "(IJ)V", "reply", "payload1", "payload2", "writePing", "(ZII)V", "writePingAndAwaitPong", "()V", "awaitPong", "flush", "shutdown", "(Lokhttp3/internal/http2/ErrorCode;)V", "close", "connectionCode", "streamCode", "Ljava/io/IOException;", "cause", "close$okhttp", "(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "sendConnectionPreface", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(Z)V", "Lokhttp3/internal/http2/Settings;", "settings", "setSettings", "(Lokhttp3/internal/http2/Settings;)V", "nowNs", "isHealthy", "(J)Z", "sendDegradedPingLater$okhttp", "pushedStream$okhttp", "(I)Z", "pushRequestLater$okhttp", "(ILjava/util/List;)V", "inFinished", "pushHeadersLater$okhttp", "(ILjava/util/List;Z)V", "Lokio/BufferedSource;", "source", "pushDataLater$okhttp", "(ILokio/BufferedSource;IZ)V", "pushResetLater$okhttp", "client", "Z", "getClient$okhttp", "()Z", "Lokhttp3/internal/http2/Http2Connection$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "", "streams", "Ljava/util/Map;", "getStreams$okhttp", "()Ljava/util/Map;", "", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "lastGoodStreamId", com.visa.cbp.getEncExpo.warmup, "getLastGoodStreamId$okhttp", "setLastGoodStreamId$okhttp", "(I)V", "nextStreamId", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "isShutdown", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/concurrent/TaskQueue;", "writerQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "pushQueue", "settingsListenerQueue", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "intervalPingsSent", "J", "intervalPongsReceived", "degradedPingsSent", "degradedPongsReceived", "awaitPingsSent", "awaitPongsReceived", "degradedPongDeadlineNs", "Lokhttp3/internal/http2/FlowControlListener;", "flowControlListener", "Lokhttp3/internal/http2/FlowControlListener;", "getFlowControlListener$okhttp", "()Lokhttp3/internal/http2/FlowControlListener;", "okHttpSettings", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "peerSettings", "getPeerSettings", "setPeerSettings", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "readBytes", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "getReadBytes", "()Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "writeBytesTotal", "getWriteBytesTotal", "()J", "writeBytesMaximum", "getWriteBytesMaximum", "Lokhttp3/internal/connection/BufferedSocket;", "socket", "Lokhttp3/internal/connection/BufferedSocket;", "getSocket$okhttp", "()Lokhttp3/internal/connection/BufferedSocket;", "Lokhttp3/internal/http2/Http2Writer;", "writer", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "readerRunnable", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "", "currentPushRequests", "Ljava/util/Set;", "Companion", "Builder", "ReaderRunnable", "Listener"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Http2Connection implements java.io.Closeable, okhttp3.internal.concurrent.Lockable {
    public static final int AWAIT_PING = 3;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.http2.Http2Connection.Companion INSTANCE = new okhttp3.internal.http2.Http2Connection.Companion(null);
    private static final okhttp3.internal.http2.Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final java.lang.String connectionName;
    private final java.util.Set<java.lang.Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private final okhttp3.internal.http2.FlowControlListener flowControlListener;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final okhttp3.internal.http2.Http2Connection.Listener listener;
    private int nextStreamId;
    private final okhttp3.internal.http2.Settings okHttpSettings;
    private okhttp3.internal.http2.Settings peerSettings;
    private final okhttp3.internal.http2.PushObserver pushObserver;
    private final okhttp3.internal.concurrent.TaskQueue pushQueue;
    private final okhttp3.internal.http2.flowcontrol.WindowCounter readBytes;
    private final okhttp3.internal.http2.Http2Connection.ReaderRunnable readerRunnable;
    private final okhttp3.internal.concurrent.TaskQueue settingsListenerQueue;
    private final okhttp3.internal.connection.BufferedSocket socket;
    private final java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> streams;
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final okhttp3.internal.http2.Http2Writer writer;
    private final okhttp3.internal.concurrent.TaskQueue writerQueue;

    public final boolean pushedStream$okhttp(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    public Http2Connection(okhttp3.internal.http2.Http2Connection.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        boolean client = builder.getClient();
        this.client = client;
        this.listener = builder.getListener();
        this.streams = new java.util.LinkedHashMap();
        java.lang.String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient() ? 3 : 2;
        okhttp3.internal.concurrent.TaskRunner taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner;
        okhttp3.internal.concurrent.TaskQueue newQueue = taskRunner.newQueue();
        this.writerQueue = newQueue;
        this.pushQueue = taskRunner.newQueue();
        this.settingsListenerQueue = taskRunner.newQueue();
        this.pushObserver = builder.getPushObserver();
        this.flowControlListener = builder.getFlowControlListener();
        okhttp3.internal.http2.Settings settings = new okhttp3.internal.http2.Settings();
        if (builder.getClient()) {
            settings.set(4, 16777216);
        }
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        this.readBytes = new okhttp3.internal.http2.flowcontrol.WindowCounter(0);
        this.writeBytesMaximum = this.peerSettings.getInitialWindowSize();
        okhttp3.internal.connection.BufferedSocket socket$okhttp = builder.getSocket$okhttp();
        this.socket = socket$okhttp;
        this.writer = new okhttp3.internal.http2.Http2Writer(socket$okhttp.getSink(), client);
        this.readerRunnable = new okhttp3.internal.http2.Http2Connection.ReaderRunnable(this, new okhttp3.internal.http2.Http2Reader(socket$okhttp.getSource(), client));
        this.currentPushRequests = new java.util.LinkedHashSet();
        if (builder.getPingIntervalMillis() != 0) {
            final long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(connectionName$okhttp);
            sb.append(" ping");
            newQueue.schedule(sb.toString(), nanos, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    long Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = okhttp3.internal.http2.Http2Connection.Camera2StreamConfigurationMap(okhttp3.internal.http2.Http2Connection.this, nanos);
                    return java.lang.Long.valueOf(Camera2StreamConfigurationMap);
                }
            });
        }
    }

    /* renamed from: getClient$okhttp, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    /* renamed from: getListener$okhttp, reason: from getter */
    public final okhttp3.internal.http2.Http2Connection.Listener getListener() {
        return this.listener;
    }

    public final java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    /* renamed from: getConnectionName$okhttp, reason: from getter */
    public final java.lang.String getConnectionName() {
        return this.connectionName;
    }

    /* renamed from: getLastGoodStreamId$okhttp, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    public final void setLastGoodStreamId$okhttp(int i) {
        this.lastGoodStreamId = i;
    }

    /* renamed from: getNextStreamId$okhttp, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    public final void setNextStreamId$okhttp(int i) {
        this.nextStreamId = i;
    }

    /* renamed from: getFlowControlListener$okhttp, reason: from getter */
    public final okhttp3.internal.http2.FlowControlListener getFlowControlListener() {
        return this.flowControlListener;
    }

    public final okhttp3.internal.http2.Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final okhttp3.internal.http2.Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final void setPeerSettings(okhttp3.internal.http2.Settings settings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "");
        this.peerSettings = settings;
    }

    public final okhttp3.internal.http2.flowcontrol.WindowCounter getReadBytes() {
        return this.readBytes;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* renamed from: getSocket$okhttp, reason: from getter */
    public final okhttp3.internal.connection.BufferedSocket getSocket() {
        return this.socket;
    }

    public final okhttp3.internal.http2.Http2Writer getWriter() {
        return this.writer;
    }

    public final okhttp3.internal.http2.Http2Connection.ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Camera2StreamConfigurationMap(okhttp3.internal.http2.Http2Connection http2Connection, long j) {
        boolean z;
        synchronized (http2Connection) {
            long j2 = http2Connection.intervalPongsReceived;
            long j3 = http2Connection.intervalPingsSent;
            if (j2 < j3) {
                z = true;
            } else {
                http2Connection.intervalPingsSent = j3 + 1;
                z = false;
            }
        }
        if (!z) {
            http2Connection.writePing(false, 1, 0);
            return j;
        }
        okhttp3.internal.http2.ErrorCode errorCode = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
        http2Connection.close$okhttp(errorCode, errorCode, null);
        return -1L;
    }

    public final int openStreamCount() {
        int size;
        synchronized (this) {
            size = this.streams.size();
        }
        return size;
    }

    public final okhttp3.internal.http2.Http2Stream getStream(int id) {
        okhttp3.internal.http2.Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = this.streams.get(java.lang.Integer.valueOf(id));
        }
        return http2Stream;
    }

    public final void updateConnectionFlowControl$okhttp(long read) {
        synchronized (this) {
            okhttp3.internal.http2.flowcontrol.WindowCounter.update$default(this.readBytes, read, 0L, 2, null);
            long unacknowledged = this.readBytes.getUnacknowledged();
            if (unacknowledged >= this.okHttpSettings.getInitialWindowSize() / 2) {
                writeWindowUpdateLater$okhttp(0, unacknowledged);
                okhttp3.internal.http2.flowcontrol.WindowCounter.update$default(this.readBytes, 0L, unacknowledged, 1, null);
            }
            this.flowControlListener.receivingConnectionWindowChanged(this.readBytes);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final okhttp3.internal.http2.Http2Stream pushStream(int associatedStreamId, java.util.List<okhttp3.internal.http2.Header> requestHeaders, boolean out) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestHeaders, "");
        if (this.client) {
            throw new java.lang.IllegalStateException("Client cannot push requests.".toString());
        }
        return getHighResolutionOutputSizeshNQ4ISI(associatedStreamId, requestHeaders, out);
    }

    public final okhttp3.internal.http2.Http2Stream newStream(java.util.List<okhttp3.internal.http2.Header> requestHeaders, boolean out) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestHeaders, "");
        return getHighResolutionOutputSizeshNQ4ISI(0, requestHeaders, out);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x000c, B:9:0x0013, B:10:0x001c, B:12:0x0020, B:14:0x0033, B:16:0x003b, B:20:0x004b, B:22:0x0051, B:23:0x005a, B:39:0x0085, B:40:0x008a), top: B:6:0x000c, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final okhttp3.internal.http2.Http2Stream getHighResolutionOutputSizeshNQ4ISI(int p0, java.util.List<okhttp3.internal.http2.Header> p1, boolean p2) throws java.io.IOException {
        int i;
        okhttp3.internal.http2.Http2Stream http2Stream;
        boolean z;
        boolean z2 = !p2;
        synchronized (this.writer) {
            synchronized (this) {
                try {
                    if (this.nextStreamId > 1073741823) {
                        shutdown(okhttp3.internal.http2.ErrorCode.REFUSED_STREAM);
                    }
                    if (this.isShutdown) {
                        throw new okhttp3.internal.http2.ConnectionShutdownException();
                    }
                    i = this.nextStreamId;
                    this.nextStreamId = i + 2;
                    http2Stream = new okhttp3.internal.http2.Http2Stream(i, this, z2, false, null);
                    if (p2 && this.writeBytesTotal < this.writeBytesMaximum && http2Stream.getWriteBytesTotal() < http2Stream.getWriteBytesMaximum()) {
                        z = false;
                        if (http2Stream.isOpen()) {
                            this.streams.put(java.lang.Integer.valueOf(i), http2Stream);
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                    z = true;
                    if (http2Stream.isOpen()) {
                    }
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } finally {
                }
            }
            if (p0 == 0) {
                this.writer.headers(z2, i, p1);
            } else {
                if (this.client) {
                    throw new java.lang.IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                }
                this.writer.pushPromise(p0, i, p1);
            }
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
        }
        if (z) {
            this.writer.flush();
        }
        return http2Stream;
    }

    public final void writeHeaders$okhttp(int streamId, boolean outFinished, java.util.List<okhttp3.internal.http2.Header> alternating) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alternating, "");
        this.writer.headers(outFinished, streamId, alternating);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        r4 = java.lang.Math.min((int) java.lang.Math.min(r13, r6 - r4), r9.writer.maxDataLength());
        r7 = r4;
        r9.writeBytesTotal += r7;
        r5 = kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeData(int streamId, boolean outFinished, okio.Buffer buffer, long byteCount) throws java.io.IOException {
        int min;
        long j;
        if (byteCount == 0) {
            this.writer.data(outFinished, streamId, buffer, 0);
            return;
        }
        while (byteCount > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        long j2 = this.writeBytesTotal;
                        long j3 = this.writeBytesMaximum;
                        if (j2 < j3) {
                            break;
                        }
                        if (!this.streams.containsKey(java.lang.Integer.valueOf(streamId))) {
                            throw new java.io.IOException("stream closed");
                        }
                        okhttp3.internal.http2.Http2Connection http2Connection = this;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(http2Connection, "");
                        http2Connection.wait();
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                        throw new java.io.InterruptedIOException();
                    }
                }
            }
            byteCount -= j;
            this.writer.data(outFinished && byteCount == 0, streamId, buffer, min);
        }
    }

    public final void writeSynResetLater$okhttp(final int streamId, final okhttp3.internal.http2.ErrorCode errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        okhttp3.internal.concurrent.TaskQueue taskQueue = this.writerQueue;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.connectionName);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(streamId);
        sb.append("] writeSynReset");
        okhttp3.internal.concurrent.TaskQueue.execute$default(taskQueue, sb.toString(), 0L, false, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = okhttp3.internal.http2.Http2Connection.getHighResolutionOutputSizeshNQ4ISI(okhttp3.internal.http2.Http2Connection.this, streamId, errorCode);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(okhttp3.internal.http2.Http2Connection http2Connection, int i, okhttp3.internal.http2.ErrorCode errorCode) {
        try {
            http2Connection.writeSynReset$okhttp(i, errorCode);
        } catch (java.io.IOException e) {
            okhttp3.internal.http2.ErrorCode errorCode2 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
            http2Connection.close$okhttp(errorCode2, errorCode2, e);
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void writeSynReset$okhttp(int streamId, okhttp3.internal.http2.ErrorCode statusCode) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusCode, "");
        this.writer.rstStream(streamId, statusCode);
    }

    public final void writeWindowUpdateLater$okhttp(final int streamId, final long unacknowledgedBytesRead) {
        okhttp3.internal.concurrent.TaskQueue taskQueue = this.writerQueue;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.connectionName);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(streamId);
        sb.append("] windowUpdate");
        okhttp3.internal.concurrent.TaskQueue.execute$default(taskQueue, sb.toString(), 0L, false, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = okhttp3.internal.http2.Http2Connection.getHighSpeedVideoFpsRanges(okhttp3.internal.http2.Http2Connection.this, streamId, unacknowledgedBytesRead);
                return highSpeedVideoFpsRanges;
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(okhttp3.internal.http2.Http2Connection http2Connection, int i, long j) {
        try {
            http2Connection.writer.windowUpdate(i, j);
        } catch (java.io.IOException e) {
            okhttp3.internal.http2.ErrorCode errorCode = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
            http2Connection.close$okhttp(errorCode, errorCode, e);
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void writePing(boolean reply, int payload1, int payload2) {
        try {
            this.writer.ping(reply, payload1, payload2);
        } catch (java.io.IOException e) {
            okhttp3.internal.http2.ErrorCode errorCode = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
            close$okhttp(errorCode, errorCode, e);
        }
    }

    public final void writePingAndAwaitPong() throws java.lang.InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writePing() throws java.lang.InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }

    public final void awaitPong() throws java.lang.InterruptedException {
        synchronized (this) {
            while (this.awaitPongsReceived < this.awaitPingsSent) {
                okhttp3.internal.http2.Http2Connection http2Connection = this;
                kotlin.jvm.internal.Intrinsics.checkNotNull(http2Connection, "");
                http2Connection.wait();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void flush() throws java.io.IOException {
        this.writer.flush();
    }

    public final void shutdown(okhttp3.internal.http2.ErrorCode statusCode) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusCode, "");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i = this.lastGoodStreamId;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                this.writer.goAway(i, statusCode, okhttp3.internal._UtilCommonKt.EMPTY_BYTE_ARRAY);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        close$okhttp(okhttp3.internal.http2.ErrorCode.NO_ERROR, okhttp3.internal.http2.ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(okhttp3.internal.http2.ErrorCode connectionCode, okhttp3.internal.http2.ErrorCode streamCode, java.io.IOException cause) {
        int i;
        java.lang.Object[] objArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamCode, "");
        okhttp3.internal.http2.Http2Connection http2Connection = this;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || !java.lang.Thread.holdsLock(http2Connection)) {
            try {
                shutdown(connectionCode);
            } catch (java.io.IOException unused) {
            }
            synchronized (http2Connection) {
                if (this.streams.isEmpty()) {
                    objArr = null;
                } else {
                    objArr = this.streams.values().toArray(new okhttp3.internal.http2.Http2Stream[0]);
                    this.streams.clear();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            okhttp3.internal.http2.Http2Stream[] http2StreamArr = (okhttp3.internal.http2.Http2Stream[]) objArr;
            if (http2StreamArr != null) {
                for (okhttp3.internal.http2.Http2Stream http2Stream : http2StreamArr) {
                    try {
                        http2Stream.close(streamCode, cause);
                    } catch (java.io.IOException unused2) {
                    }
                }
            }
            try {
                this.writer.close();
            } catch (java.io.IOException unused3) {
            }
            try {
                this.socket.cancel();
            } catch (java.io.IOException unused4) {
            }
            this.writerQueue.shutdown();
            this.pushQueue.shutdown();
            this.settingsListenerQueue.shutdown();
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(http2Connection);
        throw new java.lang.AssertionError(sb.toString());
    }

    public static /* synthetic */ void start$default(okhttp3.internal.http2.Http2Connection http2Connection, boolean z, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        http2Connection.start(z);
    }

    public final void start(boolean sendConnectionPreface) throws java.io.IOException {
        if (sendConnectionPreface) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r9 - 65535);
            }
        }
        okhttp3.internal.concurrent.TaskQueue.execute$default(this.taskRunner.newQueue(), this.connectionName, 0L, false, this.readerRunnable, 6, null);
    }

    public final void setSettings(okhttp3.internal.http2.Settings settings) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new okhttp3.internal.http2.ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            this.writer.settings(settings);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        }
    }

    public final boolean isHealthy(long nowNs) {
        synchronized (this) {
            if (this.isShutdown) {
                return false;
            }
            if (this.degradedPongsReceived < this.degradedPingsSent) {
                if (nowNs >= this.degradedPongDeadlineNs) {
                    return false;
                }
            }
            return true;
        }
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j = this.degradedPongsReceived;
            long j2 = this.degradedPingsSent;
            if (j < j2) {
                return;
            }
            this.degradedPingsSent = j2 + 1;
            this.degradedPongDeadlineNs = java.lang.System.nanoTime() + 1000000000;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            okhttp3.internal.concurrent.TaskQueue taskQueue = this.writerQueue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.connectionName);
            sb.append(" ping");
            okhttp3.internal.concurrent.TaskQueue.execute$default(taskQueue, sb.toString(), 0L, false, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return okhttp3.internal.http2.Http2Connection.$r8$lambda$cu_a_P82SDW32jURw83_HhRGWmE(okhttp3.internal.http2.Http2Connection.this);
                }
            }, 6, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\t\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\b8\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\n8\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u000e\u001a\u00020\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u0011\u001a\u00020\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0014\u001a\u00020\u00138\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u0017\u001a\u00020\u00168\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "", "client", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "Lokhttp3/internal/connection/BufferedSocket;", "socket", "", "peerName", "(Lokhttp3/internal/connection/BufferedSocket;Ljava/lang/String;)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/Http2Connection$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Lokhttp3/internal/http2/Http2Connection$Listener;)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "(Lokhttp3/internal/http2/PushObserver;)Lokhttp3/internal/http2/Http2Connection$Builder;", "", "pingIntervalMillis", "(I)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/FlowControlListener;", "flowControlListener", "(Lokhttp3/internal/http2/FlowControlListener;)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/Http2Connection;", "build", "()Lokhttp3/internal/http2/Http2Connection;", "Z", "getClient$okhttp", "()Z", "setClient$okhttp", "(Z)V", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/connection/BufferedSocket;", "getSocket$okhttp", "()Lokhttp3/internal/connection/BufferedSocket;", "setSocket$okhttp", "(Lokhttp3/internal/connection/BufferedSocket;)V", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "Lokhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", com.visa.cbp.getEncExpo.warmup, "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "Lokhttp3/internal/http2/FlowControlListener;", "getFlowControlListener$okhttp", "()Lokhttp3/internal/http2/FlowControlListener;", "setFlowControlListener$okhttp", "(Lokhttp3/internal/http2/FlowControlListener;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {
        private boolean client;
        public java.lang.String connectionName;
        private okhttp3.internal.http2.FlowControlListener flowControlListener;
        private okhttp3.internal.http2.Http2Connection.Listener listener;
        private int pingIntervalMillis;
        private okhttp3.internal.http2.PushObserver pushObserver;
        public okhttp3.internal.connection.BufferedSocket socket;
        private final okhttp3.internal.concurrent.TaskRunner taskRunner;

        public Builder(boolean z, okhttp3.internal.concurrent.TaskRunner taskRunner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
            this.client = z;
            this.taskRunner = taskRunner;
            this.listener = okhttp3.internal.http2.Http2Connection.Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = okhttp3.internal.http2.PushObserver.CANCEL;
            this.flowControlListener = okhttp3.internal.http2.FlowControlListener.None.INSTANCE;
        }

        /* renamed from: getClient$okhttp, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        public final void setClient$okhttp(boolean z) {
            this.client = z;
        }

        /* renamed from: getTaskRunner$okhttp, reason: from getter */
        public final okhttp3.internal.concurrent.TaskRunner getTaskRunner() {
            return this.taskRunner;
        }

        public final okhttp3.internal.connection.BufferedSocket getSocket$okhttp() {
            okhttp3.internal.connection.BufferedSocket bufferedSocket = this.socket;
            if (bufferedSocket != null) {
                return bufferedSocket;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }

        public final void setSocket$okhttp(okhttp3.internal.connection.BufferedSocket bufferedSocket) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSocket, "");
            this.socket = bufferedSocket;
        }

        public final java.lang.String getConnectionName$okhttp() {
            java.lang.String str = this.connectionName;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }

        public final void setConnectionName$okhttp(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.connectionName = str;
        }

        /* renamed from: getListener$okhttp, reason: from getter */
        public final okhttp3.internal.http2.Http2Connection.Listener getListener() {
            return this.listener;
        }

        public final void setListener$okhttp(okhttp3.internal.http2.Http2Connection.Listener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
            this.listener = listener;
        }

        /* renamed from: getPushObserver$okhttp, reason: from getter */
        public final okhttp3.internal.http2.PushObserver getPushObserver() {
            return this.pushObserver;
        }

        public final void setPushObserver$okhttp(okhttp3.internal.http2.PushObserver pushObserver) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushObserver, "");
            this.pushObserver = pushObserver;
        }

        /* renamed from: getPingIntervalMillis$okhttp, reason: from getter */
        public final int getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            this.pingIntervalMillis = i;
        }

        /* renamed from: getFlowControlListener$okhttp, reason: from getter */
        public final okhttp3.internal.http2.FlowControlListener getFlowControlListener() {
            return this.flowControlListener;
        }

        public final void setFlowControlListener$okhttp(okhttp3.internal.http2.FlowControlListener flowControlListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowControlListener, "");
            this.flowControlListener = flowControlListener;
        }

        public final okhttp3.internal.http2.Http2Connection.Builder socket(okhttp3.internal.connection.BufferedSocket socket, java.lang.String peerName) throws java.io.IOException {
            java.lang.String concat;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerName, "");
            setSocket$okhttp(socket);
            if (this.client) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(okhttp3.internal._UtilJvmKt.okHttpName);
                sb.append(' ');
                sb.append(peerName);
                concat = sb.toString();
            } else {
                concat = "MockWebServer ".concat(java.lang.String.valueOf(peerName));
            }
            setConnectionName$okhttp(concat);
            return this;
        }

        public final okhttp3.internal.http2.Http2Connection.Builder listener(okhttp3.internal.http2.Http2Connection.Listener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
            this.listener = listener;
            return this;
        }

        public final okhttp3.internal.http2.Http2Connection.Builder pushObserver(okhttp3.internal.http2.PushObserver pushObserver) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushObserver, "");
            this.pushObserver = pushObserver;
            return this;
        }

        public final okhttp3.internal.http2.Http2Connection.Builder pingIntervalMillis(int pingIntervalMillis) {
            this.pingIntervalMillis = pingIntervalMillis;
            return this;
        }

        public final okhttp3.internal.http2.Http2Connection.Builder flowControlListener(okhttp3.internal.http2.FlowControlListener flowControlListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowControlListener, "");
            this.flowControlListener = flowControlListener;
            return this;
        }

        public final okhttp3.internal.http2.Http2Connection build() {
            return new okhttp3.internal.http2.Http2Connection(this);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010\tJ'\u0010&\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010'J'\u0010+\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J/\u00104\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u00105J-\u00108\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00106\u001a\u00020\f2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b8\u00109J?\u0010@\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u00020-H\u0016¢\u0006\u0004\b@\u0010AR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bC\u0010D"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "", "Lokhttp3/internal/http2/Http2Reader;", "reader", "<init>", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", "invoke", "()V", "", "inFinished", "", "streamId", "Lokio/BufferedSource;", "source", "length", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(ZILokio/BufferedSource;I)V", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "headers", "(ZIILjava/util/List;)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "settings", "(ZLokhttp3/internal/http2/Settings;)V", "applyAndAckSettings", "ackSettings", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "Lokio/ByteString;", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;Lokio/ByteString;)V", "", "windowSizeIncrement", "windowUpdate", "(IJ)V", "streamDependency", "weight", "exclusive", "priority", "(IIIZ)V", "promisedStreamId", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "", "origin", "protocol", com.datadog.android.log.LogAttributes.HOST, "port", "maxAge", "alternateService", "(ILjava/lang/String;Lokio/ByteString;Ljava/lang/String;IJ)V", "Lokhttp3/internal/http2/Http2Reader;", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class ReaderRunnable implements okhttp3.internal.http2.Http2Reader.Handler, kotlin.jvm.functions.Function0<kotlin.Unit> {
        private final okhttp3.internal.http2.Http2Reader reader;
        final /* synthetic */ okhttp3.internal.http2.Http2Connection this$0;

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void priority(int streamId, int streamDependency, int weight, boolean exclusive) {
        }

        public ReaderRunnable(okhttp3.internal.http2.Http2Connection http2Connection, okhttp3.internal.http2.Http2Reader http2Reader) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(http2Reader, "");
            this.this$0 = http2Connection;
            this.reader = http2Reader;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            invoke2();
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: getReader$okhttp, reason: from getter */
        public final okhttp3.internal.http2.Http2Reader getReader() {
            return this.reader;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            okhttp3.internal.http2.ErrorCode errorCode;
            okhttp3.internal.http2.ErrorCode errorCode2 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR;
            okhttp3.internal.http2.ErrorCode errorCode3 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR;
            java.io.IOException e = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    while (this.reader.nextFrame(false, this)) {
                    }
                    errorCode2 = okhttp3.internal.http2.ErrorCode.NO_ERROR;
                    errorCode = okhttp3.internal.http2.ErrorCode.CANCEL;
                } catch (java.io.IOException e2) {
                    e = e2;
                    errorCode2 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
                    errorCode = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
                }
                this.this$0.close$okhttp(errorCode2, errorCode, e);
                okhttp3.internal._UtilCommonKt.closeQuietly(this.reader);
            } catch (java.lang.Throwable th) {
                this.this$0.close$okhttp(errorCode2, errorCode3, e);
                okhttp3.internal._UtilCommonKt.closeQuietly(this.reader);
                throw th;
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void data(boolean inFinished, int streamId, okio.BufferedSource source, int length) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            if (this.this$0.pushedStream$okhttp(streamId)) {
                this.this$0.pushDataLater$okhttp(streamId, source, length, inFinished);
                return;
            }
            okhttp3.internal.http2.Http2Stream stream = this.this$0.getStream(streamId);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(streamId, okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR);
                long j = length;
                this.this$0.updateConnectionFlowControl$okhttp(j);
                source.skip(j);
                return;
            }
            stream.receiveData(source, length);
            if (inFinished) {
                stream.receiveHeaders(okhttp3.Headers.EMPTY, true);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void headers(boolean inFinished, int streamId, int associatedStreamId, java.util.List<okhttp3.internal.http2.Header> headerBlock) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBlock, "");
            if (this.this$0.pushedStream$okhttp(streamId)) {
                this.this$0.pushHeadersLater$okhttp(streamId, headerBlock, inFinished);
                return;
            }
            final okhttp3.internal.http2.Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                okhttp3.internal.http2.Http2Stream stream = http2Connection.getStream(streamId);
                if (stream != null) {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    stream.receiveHeaders(okhttp3.internal._UtilJvmKt.toHeaders(headerBlock), inFinished);
                    return;
                }
                if (http2Connection.isShutdown) {
                    return;
                }
                if (streamId <= http2Connection.getLastGoodStreamId()) {
                    return;
                }
                if (streamId % 2 == http2Connection.getNextStreamId() % 2) {
                    return;
                }
                final okhttp3.internal.http2.Http2Stream http2Stream = new okhttp3.internal.http2.Http2Stream(streamId, http2Connection, false, inFinished, okhttp3.internal._UtilJvmKt.toHeaders(headerBlock));
                http2Connection.setLastGoodStreamId$okhttp(streamId);
                http2Connection.getStreams$okhttp().put(java.lang.Integer.valueOf(streamId), http2Stream);
                okhttp3.internal.concurrent.TaskQueue newQueue = http2Connection.taskRunner.newQueue();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(http2Connection.getConnectionName());
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(streamId);
                sb.append("] onStream");
                okhttp3.internal.concurrent.TaskQueue.execute$default(newQueue, sb.toString(), 0L, false, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                        highResolutionOutputSizeshNQ4ISI = okhttp3.internal.http2.Http2Connection.ReaderRunnable.getHighResolutionOutputSizeshNQ4ISI(okhttp3.internal.http2.Http2Connection.this, http2Stream);
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                }, 6, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(okhttp3.internal.http2.Http2Connection http2Connection, okhttp3.internal.http2.Http2Stream http2Stream) {
            try {
                http2Connection.getListener().onStream(http2Stream);
            } catch (java.io.IOException e) {
                okhttp3.internal.platform.Platform platform = okhttp3.internal.platform.Platform.INSTANCE.get();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Http2Connection.Listener failure for ");
                sb.append(http2Connection.getConnectionName());
                platform.log(sb.toString(), 4, e);
                try {
                    http2Stream.close(okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR, e);
                } catch (java.io.IOException unused) {
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void rstStream(int streamId, okhttp3.internal.http2.ErrorCode errorCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            if (this.this$0.pushedStream$okhttp(streamId)) {
                this.this$0.pushResetLater$okhttp(streamId, errorCode);
                return;
            }
            okhttp3.internal.http2.Http2Stream removeStream$okhttp = this.this$0.removeStream$okhttp(streamId);
            if (removeStream$okhttp != null) {
                removeStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void settings(final boolean clearPrevious, final okhttp3.internal.http2.Settings settings) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "");
            okhttp3.internal.concurrent.TaskQueue taskQueue = this.this$0.writerQueue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.this$0.getConnectionName());
            sb.append(" applyAndAckSettings");
            okhttp3.internal.concurrent.TaskQueue.execute$default(taskQueue, sb.toString(), 0L, false, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return okhttp3.internal.http2.Http2Connection.ReaderRunnable.$r8$lambda$x5ZPvPMHRGx0rtr2nCeHtpvAJmY(okhttp3.internal.http2.Http2Connection.ReaderRunnable.this, clearPrevious, settings);
                }
            }, 6, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void applyAndAckSettings(boolean clearPrevious, okhttp3.internal.http2.Settings settings) {
            long initialWindowSize;
            int i;
            okhttp3.internal.http2.Http2Stream[] http2StreamArr;
            okhttp3.internal.http2.Http2Stream[] http2StreamArr2;
            okhttp3.internal.http2.Settings settings2 = settings;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings2, "");
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            okhttp3.internal.http2.Http2Writer writer = this.this$0.getWriter();
            final okhttp3.internal.http2.Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    okhttp3.internal.http2.Settings peerSettings = http2Connection.getPeerSettings();
                    T t = settings2;
                    if (!clearPrevious) {
                        okhttp3.internal.http2.Settings settings3 = new okhttp3.internal.http2.Settings();
                        settings3.merge(peerSettings);
                        settings3.merge(settings2);
                        t = settings3;
                    }
                    objectRef.element = t;
                    initialWindowSize = ((okhttp3.internal.http2.Settings) objectRef.element).getInitialWindowSize() - peerSettings.getInitialWindowSize();
                    if (initialWindowSize != 0 && !http2Connection.getStreams$okhttp().isEmpty()) {
                        http2StreamArr = (okhttp3.internal.http2.Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new okhttp3.internal.http2.Http2Stream[0]);
                        http2StreamArr2 = http2StreamArr;
                        http2Connection.setPeerSettings((okhttp3.internal.http2.Settings) objectRef.element);
                        okhttp3.internal.concurrent.TaskQueue taskQueue = http2Connection.settingsListenerQueue;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(http2Connection.getConnectionName());
                        sb.append(" onSettings");
                        okhttp3.internal.concurrent.TaskQueue.execute$default(taskQueue, sb.toString(), 0L, false, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return okhttp3.internal.http2.Http2Connection.ReaderRunnable.m24425$r8$lambda$_UQnGq5VUgB0kEomNLPoIaKCCk(okhttp3.internal.http2.Http2Connection.this, objectRef);
                            }
                        }, 6, null);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                    http2StreamArr = null;
                    http2StreamArr2 = http2StreamArr;
                    http2Connection.setPeerSettings((okhttp3.internal.http2.Settings) objectRef.element);
                    okhttp3.internal.concurrent.TaskQueue taskQueue2 = http2Connection.settingsListenerQueue;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(http2Connection.getConnectionName());
                    sb2.append(" onSettings");
                    okhttp3.internal.concurrent.TaskQueue.execute$default(taskQueue2, sb2.toString(), 0L, false, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return okhttp3.internal.http2.Http2Connection.ReaderRunnable.m24425$r8$lambda$_UQnGq5VUgB0kEomNLPoIaKCCk(okhttp3.internal.http2.Http2Connection.this, objectRef);
                        }
                    }, 6, null);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((okhttp3.internal.http2.Settings) objectRef.element);
                } catch (java.io.IOException e) {
                    okhttp3.internal.http2.Http2Connection.access$failConnection(http2Connection, e);
                }
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            }
            if (http2StreamArr2 != null) {
                for (okhttp3.internal.http2.Http2Stream http2Stream : http2StreamArr2) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                        kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void ping(boolean ack, final int payload1, final int payload2) {
            if (!ack) {
                okhttp3.internal.concurrent.TaskQueue taskQueue = this.this$0.writerQueue;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.this$0.getConnectionName());
                sb.append(" ping");
                java.lang.String obj = sb.toString();
                final okhttp3.internal.http2.Http2Connection http2Connection = this.this$0;
                okhttp3.internal.concurrent.TaskQueue.execute$default(taskQueue, obj, 0L, false, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return okhttp3.internal.http2.Http2Connection.ReaderRunnable.$r8$lambda$PtXKxbYp71Z79OduJTrwUeJvS08(okhttp3.internal.http2.Http2Connection.this, payload1, payload2);
                    }
                }, 6, null);
                return;
            }
            okhttp3.internal.http2.Http2Connection http2Connection2 = this.this$0;
            synchronized (http2Connection2) {
                if (payload1 == 1) {
                    http2Connection2.intervalPongsReceived++;
                } else if (payload1 != 2) {
                    if (payload1 == 3) {
                        http2Connection2.awaitPongsReceived++;
                        okhttp3.internal.http2.Http2Connection http2Connection3 = http2Connection2;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(http2Connection3, "");
                        http2Connection3.notifyAll();
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } else {
                    http2Connection2.degradedPongsReceived++;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void goAway(int lastGoodStreamId, okhttp3.internal.http2.ErrorCode errorCode, okio.ByteString debugData) {
            int i;
            java.lang.Object[] array;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugData, "");
            debugData.size();
            okhttp3.internal.http2.Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new okhttp3.internal.http2.Http2Stream[0]);
                http2Connection.isShutdown = true;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            for (okhttp3.internal.http2.Http2Stream http2Stream : (okhttp3.internal.http2.Http2Stream[]) array) {
                if (http2Stream.getId() > lastGoodStreamId && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(okhttp3.internal.http2.ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void windowUpdate(int streamId, long windowSizeIncrement) {
            if (streamId == 0) {
                okhttp3.internal.http2.Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + windowSizeIncrement;
                    okhttp3.internal.http2.Http2Connection http2Connection2 = http2Connection;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(http2Connection2, "");
                    http2Connection2.notifyAll();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                return;
            }
            okhttp3.internal.http2.Http2Stream stream = this.this$0.getStream(streamId);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(windowSizeIncrement);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void pushPromise(int streamId, int promisedStreamId, java.util.List<okhttp3.internal.http2.Header> requestHeaders) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestHeaders, "");
            this.this$0.pushRequestLater$okhttp(promisedStreamId, requestHeaders);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: $r8$lambda$-_UQnGq5VUgB0kEomNLPoIaKCCk, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m24425$r8$lambda$_UQnGq5VUgB0kEomNLPoIaKCCk(okhttp3.internal.http2.Http2Connection http2Connection, kotlin.jvm.internal.Ref.ObjectRef objectRef) {
            http2Connection.getListener().onSettings(http2Connection, (okhttp3.internal.http2.Settings) objectRef.element);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$PtXKxbYp71Z79OduJTrwUeJvS08(okhttp3.internal.http2.Http2Connection http2Connection, int i, int i2) {
            http2Connection.writePing(true, i, i2);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$x5ZPvPMHRGx0rtr2nCeHtpvAJmY(okhttp3.internal.http2.Http2Connection.ReaderRunnable readerRunnable, boolean z, okhttp3.internal.http2.Settings settings) {
            readerRunnable.applyAndAckSettings(z, settings);
            return kotlin.Unit.INSTANCE;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void alternateService(int streamId, java.lang.String origin, okio.ByteString protocol, java.lang.String host, int port, long maxAge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(origin, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "");
        }
    }

    public final void pushRequestLater$okhttp(final int streamId, final java.util.List<okhttp3.internal.http2.Header> requestHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestHeaders, "");
        synchronized (this) {
            if (this.currentPushRequests.contains(java.lang.Integer.valueOf(streamId))) {
                writeSynResetLater$okhttp(streamId, okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(java.lang.Integer.valueOf(streamId));
            okhttp3.internal.concurrent.TaskQueue taskQueue = this.pushQueue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.connectionName);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(streamId);
            sb.append("] onRequest");
            okhttp3.internal.concurrent.TaskQueue.execute$default(taskQueue, sb.toString(), 0L, false, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = okhttp3.internal.http2.Http2Connection.getHighSpeedVideoFpsRangesFor(okhttp3.internal.http2.Http2Connection.this, streamId, requestHeaders);
                    return highSpeedVideoFpsRangesFor;
                }
            }, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(okhttp3.internal.http2.Http2Connection http2Connection, int i, java.util.List list) {
        if (http2Connection.pushObserver.onRequest(i, list)) {
            try {
                http2Connection.writer.rstStream(i, okhttp3.internal.http2.ErrorCode.CANCEL);
                synchronized (http2Connection) {
                    http2Connection.currentPushRequests.remove(java.lang.Integer.valueOf(i));
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            } catch (java.io.IOException unused) {
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void pushHeadersLater$okhttp(final int streamId, final java.util.List<okhttp3.internal.http2.Header> requestHeaders, final boolean inFinished) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestHeaders, "");
        okhttp3.internal.concurrent.TaskQueue taskQueue = this.pushQueue;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.connectionName);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(streamId);
        sb.append("] onHeaders");
        okhttp3.internal.concurrent.TaskQueue.execute$default(taskQueue, sb.toString(), 0L, false, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = okhttp3.internal.http2.Http2Connection.getHighSpeedVideoFpsRanges(okhttp3.internal.http2.Http2Connection.this, streamId, requestHeaders, inFinished);
                return highSpeedVideoFpsRanges;
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(okhttp3.internal.http2.Http2Connection http2Connection, int i, java.util.List list, boolean z) {
        boolean onHeaders = http2Connection.pushObserver.onHeaders(i, list, z);
        if (onHeaders) {
            try {
                http2Connection.writer.rstStream(i, okhttp3.internal.http2.ErrorCode.CANCEL);
            } catch (java.io.IOException unused) {
            }
        }
        if (onHeaders || z) {
            synchronized (http2Connection) {
                http2Connection.currentPushRequests.remove(java.lang.Integer.valueOf(i));
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void pushDataLater$okhttp(final int streamId, okio.BufferedSource source, final int byteCount, final boolean inFinished) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        final okio.Buffer buffer = new okio.Buffer();
        long j = byteCount;
        source.require(j);
        source.read(buffer, j);
        okhttp3.internal.concurrent.TaskQueue taskQueue = this.pushQueue;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.connectionName);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(streamId);
        sb.append("] onData");
        okhttp3.internal.concurrent.TaskQueue.execute$default(taskQueue, sb.toString(), 0L, false, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = okhttp3.internal.http2.Http2Connection.Camera2StreamConfigurationMap(okhttp3.internal.http2.Http2Connection.this, streamId, buffer, byteCount, inFinished);
                return Camera2StreamConfigurationMap;
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(okhttp3.internal.http2.Http2Connection http2Connection, int i, okio.Buffer buffer, int i2, boolean z) {
        try {
            boolean onData = http2Connection.pushObserver.onData(i, buffer, i2, z);
            if (onData) {
                http2Connection.writer.rstStream(i, okhttp3.internal.http2.ErrorCode.CANCEL);
            }
            if (onData || z) {
                synchronized (http2Connection) {
                    http2Connection.currentPushRequests.remove(java.lang.Integer.valueOf(i));
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        } catch (java.io.IOException unused) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void pushResetLater$okhttp(final int streamId, final okhttp3.internal.http2.ErrorCode errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        okhttp3.internal.concurrent.TaskQueue taskQueue = this.pushQueue;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.connectionName);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(streamId);
        sb.append("] onReset");
        okhttp3.internal.concurrent.TaskQueue.execute$default(taskQueue, sb.toString(), 0L, false, new kotlin.jvm.functions.Function0() { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = okhttp3.internal.http2.Http2Connection.getHighSpeedVideoFpsRangesFor(okhttp3.internal.http2.Http2Connection.this, streamId, errorCode);
                return highSpeedVideoFpsRangesFor;
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(okhttp3.internal.http2.Http2Connection http2Connection, int i, okhttp3.internal.http2.ErrorCode errorCode) {
        http2Connection.pushObserver.onReset(i, errorCode);
        synchronized (http2Connection) {
            http2Connection.currentPushRequests.remove(java.lang.Integer.valueOf(i));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "<init>", "()V", "", "OKHTTP_CLIENT_WINDOW_SIZE", com.visa.cbp.getEncExpo.warmup, "Lokhttp3/internal/http2/Settings;", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/Settings;", "getDEFAULT_SETTINGS", "()Lokhttp3/internal/http2/Settings;", "INTERVAL_PING", "DEGRADED_PING", "AWAIT_PING", "DEGRADED_PONG_TIMEOUT_NS"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okhttp3.internal.http2.Settings getDEFAULT_SETTINGS() {
            return okhttp3.internal.http2.Http2Connection.DEFAULT_SETTINGS;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        okhttp3.internal.http2.Settings settings = new okhttp3.internal.http2.Settings();
        settings.set(4, 65535);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public final okhttp3.internal.http2.Http2Stream removeStream$okhttp(int streamId) {
        okhttp3.internal.http2.Http2Stream remove;
        synchronized (this) {
            remove = this.streams.remove(java.lang.Integer.valueOf(streamId));
            okhttp3.internal.http2.Http2Connection http2Connection = this;
            kotlin.jvm.internal.Intrinsics.checkNotNull(http2Connection, "");
            http2Connection.notifyAll();
        }
        return remove;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cu_a_P82SDW32jURw83_HhRGWmE(okhttp3.internal.http2.Http2Connection http2Connection) {
        http2Connection.writePing(false, 2, 0);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$failConnection(okhttp3.internal.http2.Http2Connection http2Connection, java.io.IOException iOException) {
        okhttp3.internal.http2.ErrorCode errorCode = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
        http2Connection.close$okhttp(errorCode, errorCode, iOException);
    }

    public final void start() throws java.io.IOException {
        start$default(this, false, 1, null);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "<init>", "()V", "Lokhttp3/internal/http2/Http2Stream;", "stream", "", "onStream", "(Lokhttp3/internal/http2/Http2Stream;)V", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Settings;", "settings", "onSettings", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Settings;)V", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Listener {
        public static final okhttp3.internal.http2.Http2Connection.Listener REFUSE_INCOMING_STREAMS = new okhttp3.internal.http2.Http2Connection.Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public final void onStream(okhttp3.internal.http2.Http2Stream stream) throws java.io.IOException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stream, "");
                stream.close(okhttp3.internal.http2.ErrorCode.REFUSED_STREAM, null);
            }
        };

        public abstract void onStream(okhttp3.internal.http2.Http2Stream stream) throws java.io.IOException;

        public void onSettings(okhttp3.internal.http2.Http2Connection connection, okhttp3.internal.http2.Settings settings) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "");
        }
    }
}
