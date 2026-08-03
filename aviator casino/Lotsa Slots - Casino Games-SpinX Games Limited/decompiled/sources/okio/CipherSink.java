package okio;

/* compiled from: CipherSink.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0018H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lokio/CipherSink;", "Lokio/Sink;", "sink", "Lokio/BufferedSink;", "cipher", "Ljavax/crypto/Cipher;", "(Lokio/BufferedSink;Ljavax/crypto/Cipher;)V", "blockSize", "", "getCipher", "()Ljavax/crypto/Cipher;", "closed", "", "close", "", "doFinal", "", "flush", "timeout", "Lokio/Timeout;", "update", "source", "Lokio/Buffer;", "remaining", "", "write", "byteCount", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CipherSink implements okio.Sink {
    private final int blockSize;
    private final javax.crypto.Cipher cipher;
    private boolean closed;
    private final okio.BufferedSink sink;

    public CipherSink(okio.BufferedSink sink, javax.crypto.Cipher cipher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.sink = sink;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.blockSize = blockSize;
        if (blockSize > 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    public final javax.crypto.Cipher getCipher() {
        return this.cipher;
    }

    @Override // okio.Sink
    public void write(okio.Buffer source, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        okio.SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        while (byteCount > 0) {
            byteCount -= update(source, byteCount);
        }
    }

    private final int update(okio.Buffer source, long remaining) {
        okio.Segment segment = source.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int min = (int) java.lang.Math.min(remaining, segment.limit - segment.pos);
        okio.Buffer buffer = this.sink.getBuffer();
        int outputSize = this.cipher.getOutputSize(min);
        while (outputSize > 8192) {
            int i = this.blockSize;
            if (min <= i) {
                okio.BufferedSink bufferedSink = this.sink;
                byte[] update = this.cipher.update(source.readByteArray(remaining));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(update, "update(...)");
                bufferedSink.write(update);
                return (int) remaining;
            }
            min -= i;
            outputSize = this.cipher.getOutputSize(min);
        }
        okio.Segment writableSegment$okio = buffer.writableSegment$okio(outputSize);
        int update2 = this.cipher.update(segment.data, segment.pos, min, writableSegment$okio.data, writableSegment$okio.limit);
        writableSegment$okio.limit += update2;
        buffer.setSize$okio(buffer.size() + update2);
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            buffer.head = writableSegment$okio.pop();
            okio.SegmentPool.recycle(writableSegment$okio);
        }
        this.sink.emitCompleteSegments();
        source.setSize$okio(source.size() - min);
        segment.pos += min;
        if (segment.pos == segment.limit) {
            source.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        }
        return min;
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.sink.flush();
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public okio.Timeout getTimeout() {
        return this.sink.getTimeout();
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        java.lang.Throwable doFinal = doFinal();
        try {
            this.sink.close();
        } catch (java.lang.Throwable th) {
            if (doFinal == null) {
                doFinal = th;
            }
        }
        if (doFinal != null) {
            throw doFinal;
        }
    }

    private final java.lang.Throwable doFinal() {
        int outputSize = this.cipher.getOutputSize(0);
        java.lang.Throwable th = null;
        if (outputSize == 0) {
            return null;
        }
        if (outputSize > 8192) {
            try {
                okio.BufferedSink bufferedSink = this.sink;
                byte[] doFinal = this.cipher.doFinal();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal(...)");
                bufferedSink.write(doFinal);
                return null;
            } catch (java.lang.Throwable th2) {
                return th2;
            }
        }
        okio.Buffer buffer = this.sink.getBuffer();
        okio.Segment writableSegment$okio = buffer.writableSegment$okio(outputSize);
        try {
            int doFinal2 = this.cipher.doFinal(writableSegment$okio.data, writableSegment$okio.limit);
            writableSegment$okio.limit += doFinal2;
            buffer.setSize$okio(buffer.size() + doFinal2);
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            buffer.head = writableSegment$okio.pop();
            okio.SegmentPool.recycle(writableSegment$okio);
        }
        return th;
    }
}
