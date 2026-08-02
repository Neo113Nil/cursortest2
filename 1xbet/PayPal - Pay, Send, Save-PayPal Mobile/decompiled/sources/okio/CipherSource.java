package okio;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0014\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0016\u0010\u001b\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010!"}, d2 = {"Lokio/CipherSource;", "Lokio/Source;", "Lokio/BufferedSource;", "source", "Ljavax/crypto/Cipher;", "cipher", "<init>", "(Lokio/BufferedSource;Ljavax/crypto/Cipher;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "", "close", "()V", "Camera2StreamConfigurationMap", "Lokio/BufferedSource;", "getHighSpeedVideoFpsRangesFor", "Ljavax/crypto/Cipher;", "getCipher", "()Ljavax/crypto/Cipher;", "", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Lokio/Buffer;", "getHighSpeedVideoFpsRanges", "", "getHighSpeedVideoSizes", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CipherSource implements okio.Source {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final okio.BufferedSource getHighSpeedVideoFpsRangesFor;
    private final javax.crypto.Cipher cipher;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final okio.Buffer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    public CipherSource(okio.BufferedSource bufferedSource, javax.crypto.Cipher cipher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipher, "");
        this.getHighSpeedVideoFpsRangesFor = bufferedSource;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.Camera2StreamConfigurationMap = blockSize;
        this.getHighSpeedVideoFpsRanges = new okio.Buffer();
        if (blockSize <= 0) {
            throw new java.lang.IllegalArgumentException("Block cipher required ".concat(java.lang.String.valueOf(cipher)).toString());
        }
    }

    public final javax.crypto.Cipher getCipher() {
        return this.cipher;
    }

    @Override // okio.Source
    public final long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        if (byteCount < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(byteCount)).toString());
        }
        if (this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        while (true) {
            if (this.getHighSpeedVideoFpsRanges.size() != 0 || this.getHighResolutionOutputSizeshNQ4ISI) {
                break;
            }
            if (this.getHighSpeedVideoFpsRangesFor.exhausted()) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                int outputSize = this.cipher.getOutputSize(0);
                if (outputSize != 0) {
                    okio.Segment writableSegment$okio = this.getHighSpeedVideoFpsRanges.writableSegment$okio(outputSize);
                    int doFinal = this.cipher.doFinal(writableSegment$okio.data, writableSegment$okio.pos);
                    writableSegment$okio.limit += doFinal;
                    okio.Buffer buffer = this.getHighSpeedVideoFpsRanges;
                    buffer.setSize$okio(buffer.size() + doFinal);
                    if (writableSegment$okio.pos == writableSegment$okio.limit) {
                        this.getHighSpeedVideoFpsRanges.head = writableSegment$okio.pop();
                        okio.SegmentPool.recycle(writableSegment$okio);
                    }
                }
            } else {
                okio.Segment segment = this.getHighSpeedVideoFpsRangesFor.getBuffer().head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                int i = segment.limit - segment.pos;
                int outputSize2 = this.cipher.getOutputSize(i);
                while (true) {
                    if (outputSize2 > 8192) {
                        int i2 = this.Camera2StreamConfigurationMap;
                        if (i <= i2) {
                            this.getHighResolutionOutputSizeshNQ4ISI = true;
                            okio.Buffer buffer2 = this.getHighSpeedVideoFpsRanges;
                            byte[] doFinal2 = this.cipher.doFinal(this.getHighSpeedVideoFpsRangesFor.readByteArray());
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doFinal2, "");
                            buffer2.write(doFinal2);
                            break;
                        }
                        i -= i2;
                        outputSize2 = this.cipher.getOutputSize(i);
                    } else {
                        okio.Segment writableSegment$okio2 = this.getHighSpeedVideoFpsRanges.writableSegment$okio(outputSize2);
                        int update = this.cipher.update(segment.data, segment.pos, i, writableSegment$okio2.data, writableSegment$okio2.pos);
                        this.getHighSpeedVideoFpsRangesFor.skip(i);
                        writableSegment$okio2.limit += update;
                        okio.Buffer buffer3 = this.getHighSpeedVideoFpsRanges;
                        buffer3.setSize$okio(buffer3.size() + update);
                        if (writableSegment$okio2.pos == writableSegment$okio2.limit) {
                            this.getHighSpeedVideoFpsRanges.head = writableSegment$okio2.pop();
                            okio.SegmentPool.recycle(writableSegment$okio2);
                        }
                    }
                }
            }
        }
        return this.getHighSpeedVideoFpsRanges.read(sink, byteCount);
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public final okio.Timeout getCamera2StreamConfigurationMap() {
        return this.getHighSpeedVideoFpsRangesFor.getCamera2StreamConfigurationMap();
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.getHighSpeedVideoSizes = true;
        this.getHighSpeedVideoFpsRangesFor.close();
    }
}
