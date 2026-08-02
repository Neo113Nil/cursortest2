package okhttp3.internal.http2;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0003&'%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "Lokio/BufferedSource;", "source", "", "client", "<init>", "(Lokio/BufferedSource;Z)V", "Lokhttp3/internal/http2/Http2Reader$Handler;", "handler", "", "readConnectionPreface", "(Lokhttp3/internal/http2/Http2Reader$Handler;)V", "requireSettings", "nextFrame", "(ZLokhttp3/internal/http2/Http2Reader$Handler;)Z", "", "p0", "p1", "p2", "p3", "", "Lokhttp3/internal/http2/Header;", "getHighSpeedVideoSizes", "(IIII)Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "(Lokhttp3/internal/http2/Http2Reader$Handler;I)V", "close", "()V", "Lokio/BufferedSource;", "Z", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "continuation", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lokhttp3/internal/http2/Hpack$Reader;", "hpackReader", "Lokhttp3/internal/http2/Hpack$Reader;", "Companion", "ContinuationSource", "Handler"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Http2Reader implements java.io.Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.http2.Http2Reader.Companion INSTANCE = new okhttp3.internal.http2.Http2Reader.Companion(null);
    private static final java.util.logging.Logger logger;
    private final boolean client;
    private final okhttp3.internal.http2.Http2Reader.ContinuationSource continuation;
    private final okhttp3.internal.http2.Hpack.Reader hpackReader;
    private final okio.BufferedSource source;

    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH&¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J/\u0010-\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0002H&¢\u0006\u0004\b-\u0010.J-\u00101\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b1\u00102J?\u00109\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\"2\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020&H&¢\u0006\u0004\b9\u0010:À\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "", "inFinished", "", "streamId", "Lokio/BufferedSource;", "source", "length", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(ZILokio/BufferedSource;I)V", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "headers", "(ZIILjava/util/List;)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "settings", "(ZLokhttp3/internal/http2/Settings;)V", "ackSettings", "()V", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "Lokio/ByteString;", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;Lokio/ByteString;)V", "", "windowSizeIncrement", "windowUpdate", "(IJ)V", "streamDependency", "weight", "exclusive", "priority", "(IIIZ)V", "promisedStreamId", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "", "origin", "protocol", com.datadog.android.log.LogAttributes.HOST, "port", "maxAge", "alternateService", "(ILjava/lang/String;Lokio/ByteString;Ljava/lang/String;IJ)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Handler {
        void ackSettings();

        void alternateService(int streamId, java.lang.String origin, okio.ByteString protocol, java.lang.String host, int port, long maxAge);

        void data(boolean inFinished, int streamId, okio.BufferedSource source, int length) throws java.io.IOException;

        void goAway(int lastGoodStreamId, okhttp3.internal.http2.ErrorCode errorCode, okio.ByteString debugData);

        void headers(boolean inFinished, int streamId, int associatedStreamId, java.util.List<okhttp3.internal.http2.Header> headerBlock);

        void ping(boolean ack, int payload1, int payload2);

        void priority(int streamId, int streamDependency, int weight, boolean exclusive);

        void pushPromise(int streamId, int promisedStreamId, java.util.List<okhttp3.internal.http2.Header> requestHeaders) throws java.io.IOException;

        void rstStream(int streamId, okhttp3.internal.http2.ErrorCode errorCode);

        void settings(boolean clearPrevious, okhttp3.internal.http2.Settings settings);

        void windowUpdate(int streamId, long windowSizeIncrement);
    }

    public Http2Reader(okio.BufferedSource bufferedSource, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        this.source = bufferedSource;
        this.client = z;
        okhttp3.internal.http2.Http2Reader.ContinuationSource continuationSource = new okhttp3.internal.http2.Http2Reader.ContinuationSource(bufferedSource);
        this.continuation = continuationSource;
        this.hpackReader = new okhttp3.internal.http2.Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    public final void readConnectionPreface(okhttp3.internal.http2.Http2Reader.Handler handler) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new java.io.IOException("Required SETTINGS preface not received");
            }
            return;
        }
        okio.ByteString readByteString = this.source.readByteString(okhttp3.internal.http2.Http2.CONNECTION_PREFACE.size());
        java.util.logging.Logger logger2 = logger;
        if (logger2.isLoggable(java.util.logging.Level.FINE)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("<< CONNECTION ");
            sb.append(readByteString.hex());
            logger2.fine(okhttp3.internal._UtilJvmKt.format(sb.toString(), new java.lang.Object[0]));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(okhttp3.internal.http2.Http2.CONNECTION_PREFACE, readByteString)) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected a connection header but was ");
        sb2.append(readByteString.utf8());
        throw new java.io.IOException(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean nextFrame(boolean requireSettings, okhttp3.internal.http2.Http2Reader.Handler handler) throws java.io.IOException {
        int i;
        int readInt;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        try {
            this.source.require(9L);
            int readMedium = okhttp3.internal._UtilCommonKt.readMedium(this.source);
            if (readMedium > 16384) {
                throw new java.io.IOException("FRAME_SIZE_ERROR: ".concat(java.lang.String.valueOf(readMedium)));
            }
            int and = okhttp3.internal._UtilCommonKt.and(this.source.readByte(), 255);
            int and2 = okhttp3.internal._UtilCommonKt.and(this.source.readByte(), 255);
            int readInt2 = this.source.readInt() & Integer.MAX_VALUE;
            if (and != 8) {
                java.util.logging.Logger logger2 = logger;
                if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                    i = 8;
                    logger2.fine(okhttp3.internal.http2.Http2.INSTANCE.frameLog(true, readInt2, readMedium, and, and2));
                    if (!requireSettings && and != 4) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a SETTINGS frame but was ");
                        sb.append(okhttp3.internal.http2.Http2.INSTANCE.formattedType$okhttp(and));
                        throw new java.io.IOException(sb.toString());
                    }
                    switch (and) {
                        case 0:
                            if (readInt2 == 0) {
                                throw new java.io.IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                            }
                            boolean z = (and2 & 1) != 0;
                            if ((and2 & 32) != 0) {
                                throw new java.io.IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                            }
                            int and3 = (and2 & 8) != 0 ? okhttp3.internal._UtilCommonKt.and(this.source.readByte(), 255) : 0;
                            handler.data(z, readInt2, this.source, INSTANCE.lengthWithoutPadding(readMedium, and2, and3));
                            this.source.skip(and3);
                            return true;
                        case 1:
                            if (readInt2 == 0) {
                                throw new java.io.IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                            }
                            boolean z2 = (and2 & 1) != 0;
                            int and4 = (and2 & 8) != 0 ? okhttp3.internal._UtilCommonKt.and(this.source.readByte(), 255) : 0;
                            if ((and2 & 32) != 0) {
                                getHighSpeedVideoFpsRangesFor(handler, readInt2);
                                readMedium -= 5;
                            }
                            handler.headers(z2, readInt2, -1, getHighSpeedVideoSizes(INSTANCE.lengthWithoutPadding(readMedium, and2, and4), and4, and2, readInt2));
                            return true;
                        case 2:
                            if (readMedium == 5) {
                                if (readInt2 == 0) {
                                    throw new java.io.IOException("TYPE_PRIORITY streamId == 0");
                                }
                                getHighSpeedVideoFpsRangesFor(handler, readInt2);
                                return true;
                            }
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("TYPE_PRIORITY length: ");
                            sb2.append(readMedium);
                            sb2.append(" != 5");
                            throw new java.io.IOException(sb2.toString());
                        case 3:
                            if (readMedium != 4) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("TYPE_RST_STREAM length: ");
                                sb3.append(readMedium);
                                sb3.append(" != 4");
                                throw new java.io.IOException(sb3.toString());
                            }
                            if (readInt2 == 0) {
                                throw new java.io.IOException("TYPE_RST_STREAM streamId == 0");
                            }
                            int readInt3 = this.source.readInt();
                            okhttp3.internal.http2.ErrorCode fromHttp2 = okhttp3.internal.http2.ErrorCode.INSTANCE.fromHttp2(readInt3);
                            if (fromHttp2 == null) {
                                throw new java.io.IOException("TYPE_RST_STREAM unexpected error code: ".concat(java.lang.String.valueOf(readInt3)));
                            }
                            handler.rstStream(readInt2, fromHttp2);
                            return true;
                        case 4:
                            if (readInt2 != 0) {
                                throw new java.io.IOException("TYPE_SETTINGS streamId != 0");
                            }
                            if ((and2 & 1) != 0) {
                                if (readMedium != 0) {
                                    throw new java.io.IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                                }
                                handler.ackSettings();
                            } else {
                                if (readMedium % 6 != 0) {
                                    throw new java.io.IOException("TYPE_SETTINGS length % 6 != 0: ".concat(java.lang.String.valueOf(readMedium)));
                                }
                                okhttp3.internal.http2.Settings settings = new okhttp3.internal.http2.Settings();
                                kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, readMedium), 6);
                                int first = step.getFirst();
                                int last = step.getLast();
                                int step2 = step.getStep();
                                if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
                                    while (true) {
                                        int and5 = okhttp3.internal._UtilCommonKt.and(this.source.readShort(), 65535);
                                        readInt = this.source.readInt();
                                        if (and5 != 2) {
                                            if (and5 != 4) {
                                                if (and5 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                                }
                                            } else if (readInt < 0) {
                                                throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                            }
                                        } else if (readInt != 0 && readInt != 1) {
                                            throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        }
                                        settings.set(and5, readInt);
                                        if (first != last) {
                                            first += step2;
                                        }
                                    }
                                    throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ".concat(java.lang.String.valueOf(readInt)));
                                }
                                handler.settings(false, settings);
                            }
                            return true;
                        case 5:
                            if (readInt2 == 0) {
                                throw new java.io.IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                            }
                            int and6 = (and2 & 8) != 0 ? okhttp3.internal._UtilCommonKt.and(this.source.readByte(), 255) : 0;
                            handler.pushPromise(readInt2, this.source.readInt() & Integer.MAX_VALUE, getHighSpeedVideoSizes(INSTANCE.lengthWithoutPadding(readMedium - 4, and2, and6), and6, and2, readInt2));
                            return true;
                        case 6:
                            if (readMedium != i) {
                                throw new java.io.IOException("TYPE_PING length != 8: ".concat(java.lang.String.valueOf(readMedium)));
                            }
                            if (readInt2 != 0) {
                                throw new java.io.IOException("TYPE_PING streamId != 0");
                            }
                            handler.ping((and2 & 1) != 0, this.source.readInt(), this.source.readInt());
                            return true;
                        case 7:
                            if (readMedium < i) {
                                throw new java.io.IOException("TYPE_GOAWAY length < 8: ".concat(java.lang.String.valueOf(readMedium)));
                            }
                            if (readInt2 != 0) {
                                throw new java.io.IOException("TYPE_GOAWAY streamId != 0");
                            }
                            int readInt4 = this.source.readInt();
                            int readInt5 = this.source.readInt();
                            int i2 = readMedium - 8;
                            okhttp3.internal.http2.ErrorCode fromHttp22 = okhttp3.internal.http2.ErrorCode.INSTANCE.fromHttp2(readInt5);
                            if (fromHttp22 == null) {
                                throw new java.io.IOException("TYPE_GOAWAY unexpected error code: ".concat(java.lang.String.valueOf(readInt5)));
                            }
                            okio.ByteString byteString = okio.ByteString.EMPTY;
                            if (i2 > 0) {
                                byteString = this.source.readByteString(i2);
                            }
                            handler.goAway(readInt4, fromHttp22, byteString);
                            return true;
                        case 8:
                            try {
                                if (readMedium != 4) {
                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("TYPE_WINDOW_UPDATE length !=4: ");
                                    sb4.append(readMedium);
                                    throw new java.io.IOException(sb4.toString());
                                }
                                long and7 = okhttp3.internal._UtilCommonKt.and(this.source.readInt(), androidx.collection.SieveCacheKt.NodeLinkMask);
                                if (and7 == 0) {
                                    throw new java.io.IOException("windowSizeIncrement was 0");
                                }
                                java.util.logging.Logger logger3 = logger;
                                if (logger3.isLoggable(java.util.logging.Level.FINE)) {
                                    logger3.fine(okhttp3.internal.http2.Http2.INSTANCE.frameLogWindowUpdate(true, readInt2, readMedium, and7));
                                }
                                handler.windowUpdate(readInt2, and7);
                                return true;
                            } catch (java.lang.Exception e) {
                                logger.fine(okhttp3.internal.http2.Http2.INSTANCE.frameLog(true, readInt2, readMedium, 8, and2));
                                throw e;
                            }
                        default:
                            this.source.skip(readMedium);
                            return true;
                    }
                }
            }
            i = 8;
            if (!requireSettings) {
            }
            switch (and) {
            }
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    private final java.util.List<okhttp3.internal.http2.Header> getHighSpeedVideoSizes(int p0, int p1, int p2, int p3) throws java.io.IOException {
        this.continuation.setLeft(p0);
        okhttp3.internal.http2.Http2Reader.ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(p1);
        this.continuation.setFlags(p2);
        this.continuation.setStreamId(p3);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void getHighSpeedVideoFpsRangesFor(okhttp3.internal.http2.Http2Reader.Handler p0, int p1) throws java.io.IOException {
        int readInt = this.source.readInt();
        p0.priority(p1, readInt & Integer.MAX_VALUE, okhttp3.internal._UtilCommonKt.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.source.close();
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\"\u0010 \u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\"\u0010#\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lokio/Source;", "Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "", "close", "()V", "Lokio/BufferedSource;", "", "length", com.visa.cbp.getEncExpo.warmup, "getLength", "()I", "setLength", "(I)V", "flags", "getFlags", "setFlags", "streamId", "getStreamId", "setStreamId", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, "getLeft", "setLeft", "padding", "getPadding", "setPadding"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ContinuationSource implements okio.Source {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final okio.BufferedSource source;
        private int streamId;

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
        }

        public ContinuationSource(okio.BufferedSource bufferedSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
            this.source = bufferedSource;
        }

        public final int getLength() {
            return this.length;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final int getFlags() {
            return this.flags;
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        public final void setStreamId(int i) {
            this.streamId = i;
        }

        public final int getLeft() {
            return this.left;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        @Override // okio.Source
        public final long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
            int i;
            int readInt;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
            do {
                int i2 = this.left;
                if (i2 == 0) {
                    this.source.skip(this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    i = this.streamId;
                    int readMedium = okhttp3.internal._UtilCommonKt.readMedium(this.source);
                    this.left = readMedium;
                    this.length = readMedium;
                    int and = okhttp3.internal._UtilCommonKt.and(this.source.readByte(), 255);
                    this.flags = okhttp3.internal._UtilCommonKt.and(this.source.readByte(), 255);
                    if (okhttp3.internal.http2.Http2Reader.INSTANCE.getLogger().isLoggable(java.util.logging.Level.FINE)) {
                        okhttp3.internal.http2.Http2Reader.INSTANCE.getLogger().fine(okhttp3.internal.http2.Http2.INSTANCE.frameLog(true, this.streamId, this.length, and, this.flags));
                    }
                    readInt = this.source.readInt() & Integer.MAX_VALUE;
                    this.streamId = readInt;
                    if (and != 9) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(and);
                        sb.append(" != TYPE_CONTINUATION");
                        throw new java.io.IOException(sb.toString());
                    }
                } else {
                    long read = this.source.read(sink, java.lang.Math.min(byteCount, i2));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left -= (int) read;
                    return read;
                }
            } while (readInt == i);
            throw new java.io.IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public final okio.Timeout getGetHighSpeedVideoFpsRangesFor() {
            return this.source.getGetHighSpeedVideoFpsRangesFor();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "<init>", "()V", "", "length", "flags", "padding", "lengthWithoutPadding", "(III)I", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.logging.Logger getLogger() {
            return okhttp3.internal.http2.Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int length, int flags, int padding) throws java.io.IOException {
            if ((flags & 8) != 0) {
                length--;
            }
            if (padding <= length) {
                return length - padding;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PROTOCOL_ERROR padding ");
            sb.append(padding);
            sb.append(" > remaining length ");
            sb.append(length);
            throw new java.io.IOException(sb.toString());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger(okhttp3.internal.http2.Http2.class.getName());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(logger2, "");
        logger = logger2;
    }
}
