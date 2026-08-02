package kotlin.io.encoding;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0013\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0016\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010 "}, d2 = {"Lkotlin/io/encoding/DecodeInputStream;", "Ljava/io/InputStream;", "p0", "Lkotlin/io/encoding/Base64;", "p1", "<init>", "(Ljava/io/InputStream;Lkotlin/io/encoding/Base64;)V", "", "read", "()I", "", "p2", "([BII)I", "", "close", "()V", "getHighResolutionOutputSizeshNQ4ISI", "([BII)V", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Ljava/io/InputStream;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lkotlin/io/encoding/Base64;", "", "getInputFormats", "Z", "getOutputFormats", "getHighSpeedVideoSizesFor", "[B", "getOutputMinFrameDuration", "getInputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class DecodeInputStream extends java.io.InputStream {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final byte[] getOutputMinFrameDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.io.InputStream getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.io.encoding.Base64 getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final byte[] Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final byte[] getInputSizeshNQ4ISI;

    public DecodeInputStream(java.io.InputStream inputStream, kotlin.io.encoding.Base64 base64) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "");
        this.getHighSpeedVideoSizes = inputStream;
        this.getHighResolutionOutputSizeshNQ4ISI = base64;
        this.Camera2StreamConfigurationMap = new byte[1];
        this.getInputSizeshNQ4ISI = new byte[1024];
        this.getOutputMinFrameDuration = new byte[1024];
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.getHighSpeedVideoSizesFor;
        int i2 = this.getInputFormats;
        if (i < i2) {
            byte b = this.getOutputMinFrameDuration[i];
            int i3 = i + 1;
            this.getHighSpeedVideoSizesFor = i3;
            if (i3 == i2) {
                this.getHighSpeedVideoSizesFor = 0;
                this.getInputFormats = 0;
            }
            return b & 255;
        }
        int read = read(this.Camera2StreamConfigurationMap, 0, 1);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return this.Camera2StreamConfigurationMap[0] & 255;
        }
        throw new java.lang.IllegalStateException("Unreachable".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c3, code lost:
    
        if (r4 != r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c5, code lost:
    
        if (r5 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c7, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c9, code lost:
    
        return r4 - r14;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(byte[] p0, int p1, int p2) {
        int i;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        if (p1 < 0 || p2 < 0 || (i = p1 + p2) > p0.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("offset: ");
            sb.append(p1);
            sb.append(", length: ");
            sb.append(p2);
            sb.append(", buffer size: ");
            sb.append(p0.length);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (this.getHighSpeedVideoFpsRanges) {
            throw new java.io.IOException("The input stream is closed.");
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
            return -1;
        }
        if (p2 == 0) {
            return 0;
        }
        int i2 = this.getInputFormats;
        int i3 = this.getHighSpeedVideoSizesFor;
        if (i2 - i3 >= p2) {
            getHighResolutionOutputSizeshNQ4ISI(p0, p1, p2);
            return p2;
        }
        int i4 = (((p2 - (i2 - i3)) + 2) / 3) * 4;
        int i5 = p1;
        while (true) {
            boolean z2 = this.getHighSpeedVideoFpsRangesFor;
            if (z2 || i4 <= 0) {
                break;
            }
            int min = java.lang.Math.min(this.getInputSizeshNQ4ISI.length, i4);
            int i6 = 0;
            while (true) {
                z = this.getHighSpeedVideoFpsRangesFor;
                if (z || i6 >= min) {
                    break;
                }
                int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
                if (Camera2StreamConfigurationMap == -1) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                } else if (Camera2StreamConfigurationMap != 61) {
                    this.getInputSizeshNQ4ISI[i6] = (byte) Camera2StreamConfigurationMap;
                    i6++;
                } else {
                    this.getInputSizeshNQ4ISI[i6] = kotlin.io.encoding.Base64.padSymbol;
                    if ((i6 & 3) == 2) {
                        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
                        if (Camera2StreamConfigurationMap2 >= 0) {
                            this.getInputSizeshNQ4ISI[i6 + 1] = (byte) Camera2StreamConfigurationMap2;
                        }
                        i6 += 2;
                    } else {
                        i6++;
                    }
                    this.getHighSpeedVideoFpsRangesFor = true;
                }
            }
            if (!z && i6 != min) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            i4 -= i6;
            int i7 = this.getInputFormats;
            int decodeIntoByteArray = i7 + this.getHighResolutionOutputSizeshNQ4ISI.decodeIntoByteArray(this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, i7, 0, i6);
            this.getInputFormats = decodeIntoByteArray;
            int min2 = java.lang.Math.min(decodeIntoByteArray - this.getHighSpeedVideoSizesFor, i - i5);
            getHighResolutionOutputSizeshNQ4ISI(p0, i5, min2);
            byte[] bArr = this.getOutputMinFrameDuration;
            int length = bArr.length;
            int i8 = this.getInputFormats;
            if ((this.getInputSizeshNQ4ISI.length / 4) * 3 > length - i8) {
                kotlin.collections.ArraysKt.copyInto(bArr, bArr, 0, this.getHighSpeedVideoSizesFor, i8);
                this.getInputFormats -= this.getHighSpeedVideoSizesFor;
                this.getHighSpeedVideoSizesFor = 0;
            }
            i5 += min2;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = true;
        this.getHighSpeedVideoSizes.close();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(byte[] p0, int p1, int p2) {
        byte[] bArr = this.getOutputMinFrameDuration;
        int i = this.getHighSpeedVideoSizesFor;
        kotlin.collections.ArraysKt.copyInto(bArr, p0, p1, i, i + p2);
        int i2 = this.getHighSpeedVideoSizesFor + p2;
        this.getHighSpeedVideoSizesFor = i2;
        if (i2 == this.getInputFormats) {
            this.getHighSpeedVideoSizesFor = 0;
            this.getInputFormats = 0;
        }
    }

    private final int Camera2StreamConfigurationMap() {
        int read;
        if (!this.getHighResolutionOutputSizeshNQ4ISI.getIsMimeScheme()) {
            return this.getHighSpeedVideoSizes.read();
        }
        do {
            read = this.getHighSpeedVideoSizes.read();
            if (read == -1) {
                break;
            }
        } while (!kotlin.io.encoding.Base64Kt.isInMimeAlphabet(read));
        return read;
    }
}
