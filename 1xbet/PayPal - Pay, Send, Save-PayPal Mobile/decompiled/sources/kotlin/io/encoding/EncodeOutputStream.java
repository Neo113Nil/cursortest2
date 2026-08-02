package kotlin.io.encoding;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u0019\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0016\u0010 \u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lkotlin/io/encoding/EncodeOutputStream;", "Ljava/io/OutputStream;", "p0", "Lkotlin/io/encoding/Base64;", "p1", "<init>", "(Ljava/io/OutputStream;Lkotlin/io/encoding/Base64;)V", "", "", "write", "(I)V", "", "p2", "([BII)V", "flush", "()V", "close", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "([BII)I", "getHighSpeedVideoSizesFor", "Ljava/io/OutputStream;", "getHighSpeedVideoFpsRanges", "Lkotlin/io/encoding/Base64;", "", "getHighSpeedVideoSizes", "Z", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getInputFormats", "[B", "getInputSizeshNQ4ISI", "getOutputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class EncodeOutputStream extends java.io.OutputStream {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final byte[] getInputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.io.encoding.Base64 Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final java.io.OutputStream getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final byte[] getHighSpeedVideoSizes;

    public EncodeOutputStream(java.io.OutputStream outputStream, kotlin.io.encoding.Base64 base64) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "");
        this.getHighSpeedVideoFpsRanges = outputStream;
        this.Camera2StreamConfigurationMap = base64;
        this.getHighSpeedVideoFpsRangesFor = base64.getIsMimeScheme() ? base64.getMimeLineLength() : -1;
        this.getHighSpeedVideoSizes = new byte[1024];
        this.getInputSizeshNQ4ISI = new byte[3];
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        if (this.getOutputFormats != 0) {
            getHighSpeedVideoFpsRangesFor();
        }
        this.getHighSpeedVideoFpsRanges.close();
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        if (Camera2StreamConfigurationMap(this.getInputSizeshNQ4ISI, 0, this.getOutputFormats) != 4) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        this.getOutputFormats = 0;
    }

    private final int Camera2StreamConfigurationMap(byte[] p0, int p1, int p2) {
        int encodeIntoByteArray = this.Camera2StreamConfigurationMap.encodeIntoByteArray(p0, this.getHighSpeedVideoSizes, 0, p1, p2);
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            this.getHighSpeedVideoFpsRanges.write(kotlin.io.encoding.Base64.INSTANCE.getMimeLineSeparatorSymbols$kotlin_stdlib());
            this.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getMimeLineLength();
            if (encodeIntoByteArray > this.Camera2StreamConfigurationMap.getMimeLineLength()) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
        }
        this.getHighSpeedVideoFpsRanges.write(this.getHighSpeedVideoSizes, 0, encodeIntoByteArray);
        this.getHighSpeedVideoFpsRangesFor -= encodeIntoByteArray;
        return encodeIntoByteArray;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRanges.flush();
            return;
        }
        throw new java.io.IOException("The output stream is closed.");
    }

    @Override // java.io.OutputStream
    public final void write(int p0) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            byte[] bArr = this.getInputSizeshNQ4ISI;
            int i = this.getOutputFormats;
            int i2 = i + 1;
            this.getOutputFormats = i2;
            bArr[i] = (byte) p0;
            if (i2 == 3) {
                getHighSpeedVideoFpsRangesFor();
                return;
            }
            return;
        }
        throw new java.io.IOException("The output stream is closed.");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] p0, int p1, int p2) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            if (p1 < 0 || p2 < 0 || (i = p1 + p2) > p0.length) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("offset: ");
                sb.append(p1);
                sb.append(", length: ");
                sb.append(p2);
                sb.append(", source size: ");
                sb.append(p0.length);
                throw new java.lang.IndexOutOfBoundsException(sb.toString());
            }
            if (p2 != 0) {
                int i2 = this.getOutputFormats;
                if (i2 >= 3) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                if (i2 != 0) {
                    int min = java.lang.Math.min(3 - i2, i - p1);
                    int i3 = p1 + min;
                    kotlin.collections.ArraysKt.copyInto(p0, this.getInputSizeshNQ4ISI, this.getOutputFormats, p1, i3);
                    int i4 = this.getOutputFormats + min;
                    this.getOutputFormats = i4;
                    if (i4 == 3) {
                        getHighSpeedVideoFpsRangesFor();
                    }
                    if (this.getOutputFormats != 0) {
                        return;
                    } else {
                        p1 = i3;
                    }
                }
                while (p1 + 3 <= i) {
                    int min2 = java.lang.Math.min((this.Camera2StreamConfigurationMap.getIsMimeScheme() ? this.getHighSpeedVideoFpsRangesFor : this.getHighSpeedVideoSizes.length) / 4, (i - p1) / 3);
                    int i5 = (min2 * 3) + p1;
                    if (Camera2StreamConfigurationMap(p0, p1, i5) != min2 * 4) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    p1 = i5;
                }
                kotlin.collections.ArraysKt.copyInto(p0, this.getInputSizeshNQ4ISI, 0, p1, i);
                this.getOutputFormats = i - p1;
                return;
            }
            return;
        }
        throw new java.io.IOException("The output stream is closed.");
    }
}
