package okhttp3.internal.ws;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u001d\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010\"R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010\"R\u0014\u0010.\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u00100R\u0014\u0010)\u001a\u00020/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u0010\"R\u0018\u0010,\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u00105R\u0016\u00103\u001a\u0004\u0018\u0001068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u00107R\u0016\u0010*\u001a\u0004\u0018\u0001088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00109"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "isClient", "Lokio/BufferedSink;", "sink", "Ljava/util/Random;", "random", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "<init>", "(ZLokio/BufferedSink;Ljava/util/Random;ZZJ)V", "Lokio/ByteString;", "payload", "", "writePing", "(Lokio/ByteString;)V", "writePong", "", "code", "reason", "writeClose", "(ILokio/ByteString;)V", "p0", "p1", "getHighSpeedVideoSizes", "formatOpcode", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "writeMessageFrame", "close", "()V", "Camera2StreamConfigurationMap", "Z", "Lokio/BufferedSink;", "getSink", "()Lokio/BufferedSink;", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "getOutputFormats", "getHighSpeedVideoSizesFor", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "J", "getHighResolutionOutputSizeshNQ4ISI", "Lokio/Buffer;", "Lokio/Buffer;", "getHighSpeedVideoFpsRanges", "getInputFormats", "getOutputMinFrameDuration", "Lokhttp3/internal/ws/MessageDeflater;", "Lokhttp3/internal/ws/MessageDeflater;", "", "[B", "Lokio/Buffer$UnsafeCursor;", "Lokio/Buffer$UnsafeCursor;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WebSocketWriter implements java.io.Closeable {
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final okio.Buffer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final okio.Buffer.UnsafeCursor getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private okhttp3.internal.ws.MessageDeflater getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final byte[] getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final okio.Buffer getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private boolean getInputFormats;
    private final java.util.Random random;
    private final okio.BufferedSink sink;

    public WebSocketWriter(boolean z, okio.BufferedSink bufferedSink, java.util.Random random, boolean z2, boolean z3, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        this.Camera2StreamConfigurationMap = z;
        this.sink = bufferedSink;
        this.random = random;
        this.getHighSpeedVideoSizes = z2;
        this.getHighSpeedVideoFpsRangesFor = z3;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRanges = new okio.Buffer();
        this.getOutputFormats = bufferedSink.getBuffer();
        this.getOutputMinFrameDuration = z ? new byte[4] : null;
        this.getHighSpeedVideoSizesFor = z ? new okio.Buffer.UnsafeCursor() : null;
    }

    public final okio.BufferedSink getSink() {
        return this.sink;
    }

    public final java.util.Random getRandom() {
        return this.random;
    }

    public final void writePing(okio.ByteString payload) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
        getHighSpeedVideoSizes(9, payload);
    }

    public final void writePong(okio.ByteString payload) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
        getHighSpeedVideoSizes(10, payload);
    }

    public final void writeClose(int code, okio.ByteString reason) throws java.io.IOException {
        okio.ByteString byteString = okio.ByteString.EMPTY;
        if (code != 0 || reason != null) {
            if (code != 0) {
                okhttp3.internal.ws.WebSocketProtocol.INSTANCE.validateCloseCode(code);
            }
            okio.Buffer buffer = new okio.Buffer();
            buffer.writeShort(code);
            if (reason != null) {
                buffer.write(reason);
            }
            byteString = buffer.readByteString();
        }
        try {
            getHighSpeedVideoSizes(8, byteString);
        } finally {
            this.getInputFormats = true;
        }
    }

    private final void getHighSpeedVideoSizes(int p0, okio.ByteString p1) throws java.io.IOException {
        if (this.getInputFormats) {
            throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        int size = p1.size();
        if (size > 125) {
            throw new java.lang.IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.getOutputFormats.writeByte(p0 | 128);
        if (this.Camera2StreamConfigurationMap) {
            this.getOutputFormats.writeByte(size | 128);
            java.util.Random random = this.random;
            byte[] bArr = this.getOutputMinFrameDuration;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.getOutputFormats.write(this.getOutputMinFrameDuration);
            if (size > 0) {
                long size2 = this.getOutputFormats.size();
                this.getOutputFormats.write(p1);
                okio.Buffer buffer = this.getOutputFormats;
                okio.Buffer.UnsafeCursor unsafeCursor = this.getHighSpeedVideoSizesFor;
                kotlin.jvm.internal.Intrinsics.checkNotNull(unsafeCursor);
                buffer.readAndWriteUnsafe(unsafeCursor);
                this.getHighSpeedVideoSizesFor.seek(size2);
                okhttp3.internal.ws.WebSocketProtocol.INSTANCE.toggleMask(this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration);
                this.getHighSpeedVideoSizesFor.close();
            }
        } else {
            this.getOutputFormats.writeByte(size);
            this.getOutputFormats.write(p1);
        }
        this.sink.flush();
    }

    public final void writeMessageFrame(int formatOpcode, okio.ByteString data) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        if (this.getInputFormats) {
            throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.getHighSpeedVideoFpsRanges.write(data);
        int i = formatOpcode | 128;
        if (this.getHighSpeedVideoSizes && data.size() >= this.getHighResolutionOutputSizeshNQ4ISI) {
            okhttp3.internal.ws.MessageDeflater messageDeflater = this.getInputSizeshNQ4ISI;
            if (messageDeflater == null) {
                messageDeflater = new okhttp3.internal.ws.MessageDeflater(this.getHighSpeedVideoFpsRangesFor);
                this.getInputSizeshNQ4ISI = messageDeflater;
            }
            messageDeflater.deflate(this.getHighSpeedVideoFpsRanges);
            i = formatOpcode | 192;
        }
        long size = this.getHighSpeedVideoFpsRanges.size();
        this.getOutputFormats.writeByte(i);
        int i2 = this.Camera2StreamConfigurationMap ? 128 : 0;
        if (size <= 125) {
            this.getOutputFormats.writeByte(i2 | ((int) size));
        } else if (size <= okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.getOutputFormats.writeByte(i2 | 126);
            this.getOutputFormats.writeShort((int) size);
        } else {
            this.getOutputFormats.writeByte(i2 | 127);
            this.getOutputFormats.writeLong(size);
        }
        if (this.Camera2StreamConfigurationMap) {
            java.util.Random random = this.random;
            byte[] bArr = this.getOutputMinFrameDuration;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.getOutputFormats.write(this.getOutputMinFrameDuration);
            if (size > 0) {
                okio.Buffer buffer = this.getHighSpeedVideoFpsRanges;
                okio.Buffer.UnsafeCursor unsafeCursor = this.getHighSpeedVideoSizesFor;
                kotlin.jvm.internal.Intrinsics.checkNotNull(unsafeCursor);
                buffer.readAndWriteUnsafe(unsafeCursor);
                this.getHighSpeedVideoSizesFor.seek(0L);
                okhttp3.internal.ws.WebSocketProtocol.INSTANCE.toggleMask(this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration);
                this.getHighSpeedVideoSizesFor.close();
            }
        }
        this.getOutputFormats.write(this.getHighSpeedVideoFpsRanges, size);
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        okhttp3.internal.ws.MessageDeflater messageDeflater = this.getInputSizeshNQ4ISI;
        if (messageDeflater != null) {
            okhttp3.internal._UtilCommonKt.closeQuietly(messageDeflater);
        }
        okhttp3.internal._UtilCommonKt.closeQuietly(this.sink);
    }
}
