package okhttp3.internal.ws;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lokio/Buffer;", "buffer", "", "deflate", "(Lokio/Buffer;)V", "close", "()V", "getHighSpeedVideoSizes", "Z", "Camera2StreamConfigurationMap", "Lokio/Buffer;", "Ljava/util/zip/Deflater;", "getHighSpeedVideoFpsRanges", "Ljava/util/zip/Deflater;", "getHighSpeedVideoFpsRangesFor", "Lokio/DeflaterSink;", "Lokio/DeflaterSink;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MessageDeflater implements java.io.Closeable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final okio.Buffer getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.zip.Deflater getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final okio.DeflaterSink getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    public MessageDeflater(boolean z) {
        this.Camera2StreamConfigurationMap = z;
        okio.Buffer buffer = new okio.Buffer();
        this.getHighSpeedVideoSizes = buffer;
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(-1, true);
        this.getHighSpeedVideoFpsRangesFor = deflater;
        this.getHighSpeedVideoFpsRanges = new okio.DeflaterSink((okio.Sink) buffer, deflater);
    }

    public final void deflate(okio.Buffer buffer) throws java.io.IOException {
        okio.ByteString byteString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (this.getHighSpeedVideoSizes.size() != 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRangesFor.reset();
        }
        this.getHighSpeedVideoFpsRanges.write(buffer, buffer.size());
        this.getHighSpeedVideoFpsRanges.flush();
        okio.Buffer buffer2 = this.getHighSpeedVideoSizes;
        byteString = okhttp3.internal.ws.MessageDeflaterKt.getHighSpeedVideoFpsRanges;
        if (buffer2.rangeEquals(buffer2.size() - byteString.size(), byteString)) {
            long size = this.getHighSpeedVideoSizes.size();
            okio.Buffer.UnsafeCursor readAndWriteUnsafe$default = okio.Buffer.readAndWriteUnsafe$default(this.getHighSpeedVideoSizes, null, 1, null);
            try {
                readAndWriteUnsafe$default.resizeBuffer(size - 4);
                kotlin.io.CloseableKt.closeFinally(readAndWriteUnsafe$default, null);
            } finally {
            }
        } else {
            this.getHighSpeedVideoSizes.writeByte(0);
        }
        okio.Buffer buffer3 = this.getHighSpeedVideoSizes;
        buffer.write(buffer3, buffer3.size());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges.close();
    }
}
