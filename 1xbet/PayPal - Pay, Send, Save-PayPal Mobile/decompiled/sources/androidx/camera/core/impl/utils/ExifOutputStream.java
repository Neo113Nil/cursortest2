package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
public final class ExifOutputStream extends java.io.FilterOutputStream {
    private static final byte[] Camera2StreamConfigurationMap = "Exif\u0000\u0000".getBytes(androidx.camera.core.impl.utils.ExifAttribute.getHighSpeedVideoFpsRangesFor);
    private int getHighResolutionOutputSizeshNQ4ISI;
    private final java.nio.ByteBuffer getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.impl.utils.ExifData getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private final byte[] getHighSpeedVideoSizesFor;
    private int getOutputMinFrameDuration;

    public ExifOutputStream(java.io.OutputStream outputStream, androidx.camera.core.impl.utils.ExifData exifData) {
        super(new java.io.BufferedOutputStream(outputStream, 65536));
        this.getHighSpeedVideoSizesFor = new byte[1];
        this.getHighSpeedVideoFpsRanges = java.nio.ByteBuffer.allocate(4);
        this.getOutputMinFrameDuration = 0;
        this.getHighSpeedVideoFpsRangesFor = exifData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x03c7, code lost:
    
        r16.out.write(r17, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x03cc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x03c5, code lost:
    
        if (r3 <= 0) goto L152;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i;
        int i4 = i2;
        while (true) {
            int i5 = this.getHighSpeedVideoSizes;
            if ((i5 > 0 || this.getHighResolutionOutputSizeshNQ4ISI > 0 || this.getOutputMinFrameDuration != 2) && i4 > 0) {
                if (i5 > 0) {
                    int min = java.lang.Math.min(i4, i5);
                    i4 -= min;
                    this.getHighSpeedVideoSizes -= min;
                    i3 += min;
                }
                int i6 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i6 > 0) {
                    int min2 = java.lang.Math.min(i4, i6);
                    this.out.write(bArr, i3, min2);
                    i4 -= min2;
                    this.getHighResolutionOutputSizeshNQ4ISI -= min2;
                    i3 += min2;
                }
                if (i4 == 0) {
                    return;
                }
                int i7 = this.getOutputMinFrameDuration;
                if (i7 == 0) {
                    int min3 = java.lang.Math.min(i4, 2 - this.getHighSpeedVideoFpsRanges.position());
                    this.getHighSpeedVideoFpsRanges.put(bArr, i3, min3);
                    i3 += min3;
                    i4 -= min3;
                    if (this.getHighSpeedVideoFpsRanges.position() < 2) {
                        return;
                    }
                    this.getHighSpeedVideoFpsRanges.rewind();
                    if (this.getHighSpeedVideoFpsRanges.getShort() != -40) {
                        throw new java.io.IOException("Not a valid jpeg image, cannot write exif");
                    }
                    this.out.write(this.getHighSpeedVideoFpsRanges.array(), 0, 2);
                    this.getOutputMinFrameDuration = 1;
                    this.getHighSpeedVideoFpsRanges.rewind();
                    androidx.camera.core.impl.utils.ByteOrderedDataOutputStream byteOrderedDataOutputStream = new androidx.camera.core.impl.utils.ByteOrderedDataOutputStream(this.out, java.nio.ByteOrder.BIG_ENDIAN);
                    byteOrderedDataOutputStream.getHighResolutionOutputSizeshNQ4ISI((short) -31);
                    int[] iArr = new int[androidx.camera.core.impl.utils.ExifData.Camera2StreamConfigurationMap.length];
                    int[] iArr2 = new int[androidx.camera.core.impl.utils.ExifData.Camera2StreamConfigurationMap.length];
                    for (androidx.camera.core.impl.utils.ExifTag exifTag : androidx.camera.core.impl.utils.ExifData.getHighSpeedVideoFpsRanges) {
                        for (int i8 = 0; i8 < androidx.camera.core.impl.utils.ExifData.Camera2StreamConfigurationMap.length; i8++) {
                            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(i8).remove(exifTag.Camera2StreamConfigurationMap);
                        }
                    }
                    if (!this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(1).isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(0).put(androidx.camera.core.impl.utils.ExifData.getHighSpeedVideoFpsRanges[1].Camera2StreamConfigurationMap, androidx.camera.core.impl.utils.ExifAttribute.getHighSpeedVideoFpsRanges(0L, this.getHighSpeedVideoFpsRangesFor.getByteOrder()));
                    }
                    if (!this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(2).isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(0).put(androidx.camera.core.impl.utils.ExifData.getHighSpeedVideoFpsRanges[2].Camera2StreamConfigurationMap, androidx.camera.core.impl.utils.ExifAttribute.getHighSpeedVideoFpsRanges(0L, this.getHighSpeedVideoFpsRangesFor.getByteOrder()));
                    }
                    if (!this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(3).isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(1).put(androidx.camera.core.impl.utils.ExifData.getHighSpeedVideoFpsRanges[3].Camera2StreamConfigurationMap, androidx.camera.core.impl.utils.ExifAttribute.getHighSpeedVideoFpsRanges(0L, this.getHighSpeedVideoFpsRangesFor.getByteOrder()));
                    }
                    for (int i9 = 0; i9 < androidx.camera.core.impl.utils.ExifData.Camera2StreamConfigurationMap.length; i9++) {
                        java.util.Iterator<java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> it = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(i9).entrySet().iterator();
                        int i10 = 0;
                        while (it.hasNext()) {
                            androidx.camera.core.impl.utils.ExifAttribute value = it.next().getValue();
                            int i11 = androidx.camera.core.impl.utils.ExifAttribute.getHighResolutionOutputSizeshNQ4ISI[value.getInputFormats] * value.getOutputFormats;
                            if (i11 > 4) {
                                i10 += i11;
                            }
                        }
                        iArr2[i9] = iArr2[i9] + i10;
                    }
                    int i12 = 8;
                    for (int i13 = 0; i13 < androidx.camera.core.impl.utils.ExifData.Camera2StreamConfigurationMap.length; i13++) {
                        if (!this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(i13).isEmpty()) {
                            iArr[i13] = i12;
                            i12 += (this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(i13).size() * 12) + 6 + iArr2[i13];
                        }
                    }
                    if (!this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(1).isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(0).put(androidx.camera.core.impl.utils.ExifData.getHighSpeedVideoFpsRanges[1].Camera2StreamConfigurationMap, androidx.camera.core.impl.utils.ExifAttribute.getHighSpeedVideoFpsRanges(iArr[1], this.getHighSpeedVideoFpsRangesFor.getByteOrder()));
                    }
                    if (!this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(2).isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(0).put(androidx.camera.core.impl.utils.ExifData.getHighSpeedVideoFpsRanges[2].Camera2StreamConfigurationMap, androidx.camera.core.impl.utils.ExifAttribute.getHighSpeedVideoFpsRanges(iArr[2], this.getHighSpeedVideoFpsRangesFor.getByteOrder()));
                    }
                    if (!this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(3).isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(1).put(androidx.camera.core.impl.utils.ExifData.getHighSpeedVideoFpsRanges[3].Camera2StreamConfigurationMap, androidx.camera.core.impl.utils.ExifAttribute.getHighSpeedVideoFpsRanges(iArr[3], this.getHighSpeedVideoFpsRangesFor.getByteOrder()));
                    }
                    byteOrderedDataOutputStream.getHighResolutionOutputSizeshNQ4ISI((short) (i12 + 8));
                    byteOrderedDataOutputStream.write(Camera2StreamConfigurationMap);
                    byteOrderedDataOutputStream.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor.getByteOrder() == java.nio.ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                    byteOrderedDataOutputStream.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getByteOrder();
                    byteOrderedDataOutputStream.getHighResolutionOutputSizeshNQ4ISI((short) 42);
                    byteOrderedDataOutputStream.getHighSpeedVideoFpsRanges(8);
                    for (int i14 = 0; i14 < androidx.camera.core.impl.utils.ExifData.Camera2StreamConfigurationMap.length; i14++) {
                        if (!this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(i14).isEmpty()) {
                            byteOrderedDataOutputStream.getHighResolutionOutputSizeshNQ4ISI((short) this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(i14).size());
                            int size = iArr[i14] + 2 + (this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(i14).size() * 12) + 4;
                            for (java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute> entry : this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(i14).entrySet()) {
                                androidx.camera.core.impl.utils.ExifTag exifTag2 = androidx.camera.core.impl.utils.ExifData.Builder.getHighSpeedVideoFpsRanges.get(i14).get(entry.getKey());
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag not supported: ");
                                sb.append(entry.getKey());
                                sb.append(". Tag needs to be ported from ExifInterface to ExifData.");
                                int i15 = ((androidx.camera.core.impl.utils.ExifTag) androidx.core.util.Preconditions.checkNotNull(exifTag2, sb.toString())).getHighResolutionOutputSizeshNQ4ISI;
                                androidx.camera.core.impl.utils.ExifAttribute value2 = entry.getValue();
                                int i16 = androidx.camera.core.impl.utils.ExifAttribute.getHighResolutionOutputSizeshNQ4ISI[value2.getInputFormats] * value2.getOutputFormats;
                                byteOrderedDataOutputStream.getHighResolutionOutputSizeshNQ4ISI((short) i15);
                                byteOrderedDataOutputStream.getHighResolutionOutputSizeshNQ4ISI((short) value2.getInputFormats);
                                byteOrderedDataOutputStream.getHighSpeedVideoFpsRanges(value2.getOutputFormats);
                                if (i16 <= 4) {
                                    byteOrderedDataOutputStream.write(value2.getHighSpeedVideoSizes);
                                    if (i16 < 4) {
                                        for (int i17 = 4; i16 < i17; i17 = 4) {
                                            byteOrderedDataOutputStream.getHighSpeedVideoFpsRangesFor.write(0);
                                            i16++;
                                        }
                                    }
                                } else {
                                    byteOrderedDataOutputStream.getHighSpeedVideoFpsRanges(size);
                                    size += i16;
                                }
                            }
                            byteOrderedDataOutputStream.getHighSpeedVideoFpsRanges(0);
                            java.util.Iterator<java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> it2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(i14).entrySet().iterator();
                            while (it2.hasNext()) {
                                androidx.camera.core.impl.utils.ExifAttribute value3 = it2.next().getValue();
                                if (value3.getHighSpeedVideoSizes.length > 4) {
                                    byteOrderedDataOutputStream.write(value3.getHighSpeedVideoSizes, 0, value3.getHighSpeedVideoSizes.length);
                                }
                            }
                        }
                    }
                    byteOrderedDataOutputStream.getHighSpeedVideoSizes = java.nio.ByteOrder.BIG_ENDIAN;
                } else if (i7 == 1) {
                    int min4 = java.lang.Math.min(i4, 4 - this.getHighSpeedVideoFpsRanges.position());
                    this.getHighSpeedVideoFpsRanges.put(bArr, i3, min4);
                    i3 += min4;
                    i4 -= min4;
                    if (this.getHighSpeedVideoFpsRanges.position() == 2 && this.getHighSpeedVideoFpsRanges.getShort() == -39) {
                        this.out.write(this.getHighSpeedVideoFpsRanges.array(), 0, 2);
                        this.getHighSpeedVideoFpsRanges.rewind();
                    }
                    if (this.getHighSpeedVideoFpsRanges.position() < 4) {
                        return;
                    }
                    this.getHighSpeedVideoFpsRanges.rewind();
                    short s = this.getHighSpeedVideoFpsRanges.getShort();
                    if (s == -31) {
                        this.getHighSpeedVideoSizes = (this.getHighSpeedVideoFpsRanges.getShort() & kotlin.UShort.MAX_VALUE) - 2;
                        this.getOutputMinFrameDuration = 2;
                    } else if (!androidx.camera.core.impl.utils.ExifOutputStream.JpegHeader.getHighSpeedVideoFpsRangesFor(s)) {
                        this.out.write(this.getHighSpeedVideoFpsRanges.array(), 0, 4);
                        this.getHighResolutionOutputSizeshNQ4ISI = (this.getHighSpeedVideoFpsRanges.getShort() & kotlin.UShort.MAX_VALUE) - 2;
                    } else {
                        this.out.write(this.getHighSpeedVideoFpsRanges.array(), 0, 4);
                        this.getOutputMinFrameDuration = 2;
                    }
                    this.getHighSpeedVideoFpsRanges.rewind();
                } else {
                    continue;
                }
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        byte[] bArr = this.getHighSpeedVideoSizesFor;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws java.io.IOException {
        write(bArr, 0, bArr.length);
    }

    static final class JpegHeader {
        public static boolean getHighSpeedVideoFpsRangesFor(short s) {
            return (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) ? false : true;
        }

        private JpegHeader() {
        }
    }
}
