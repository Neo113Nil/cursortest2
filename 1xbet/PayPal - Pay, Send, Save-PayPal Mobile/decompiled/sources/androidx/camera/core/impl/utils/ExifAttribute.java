package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
final class ExifAttribute {
    public final byte[] getHighSpeedVideoSizes;
    public final int getInputFormats;
    public final long getInputSizeshNQ4ISI;
    public final int getOutputFormats;
    static final java.nio.charset.Charset getHighSpeedVideoFpsRangesFor = java.nio.charset.StandardCharsets.US_ASCII;
    static final java.lang.String[] getHighSpeedVideoFpsRanges = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] getHighResolutionOutputSizeshNQ4ISI = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] Camera2StreamConfigurationMap = {65, 83, 67, 73, 73, 0, 0, 0};

    private ExifAttribute(int i, int i2, byte[] bArr) {
        this(i, i2, bArr, (byte) 0);
    }

    private ExifAttribute(int i, int i2, byte[] bArr, byte b) {
        this.getInputFormats = i;
        this.getOutputFormats = i2;
        this.getInputSizeshNQ4ISI = -1L;
        this.getHighSpeedVideoSizes = bArr;
    }

    public static androidx.camera.core.impl.utils.ExifAttribute getHighResolutionOutputSizeshNQ4ISI(int[] iArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[getHighResolutionOutputSizeshNQ4ISI[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putShort((short) i);
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(3, iArr.length, wrap.array());
    }

    public static androidx.camera.core.impl.utils.ExifAttribute getHighSpeedVideoSizes(long[] jArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[getHighResolutionOutputSizeshNQ4ISI[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(4, jArr.length, wrap.array());
    }

    public static androidx.camera.core.impl.utils.ExifAttribute getHighSpeedVideoFpsRanges(long j, java.nio.ByteOrder byteOrder) {
        return getHighSpeedVideoSizes(new long[]{j}, byteOrder);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute Camera2StreamConfigurationMap(int[] iArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[getHighResolutionOutputSizeshNQ4ISI[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putInt(i);
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(9, iArr.length, wrap.array());
    }

    public static androidx.camera.core.impl.utils.ExifAttribute getHighSpeedVideoFpsRanges(java.lang.String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new androidx.camera.core.impl.utils.ExifAttribute(1, 1, new byte[]{(byte) (str.charAt(0) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)});
        }
        byte[] bytes = str.getBytes(getHighSpeedVideoFpsRangesFor);
        return new androidx.camera.core.impl.utils.ExifAttribute(1, bytes.length, bytes);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute Camera2StreamConfigurationMap(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append((char) 0);
        byte[] bytes = sb.toString().getBytes(getHighSpeedVideoFpsRangesFor);
        return new androidx.camera.core.impl.utils.ExifAttribute(2, bytes.length, bytes);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute getHighSpeedVideoFpsRangesFor(androidx.camera.core.impl.utils.LongRational[] longRationalArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[getHighResolutionOutputSizeshNQ4ISI[5] * longRationalArr.length]);
        wrap.order(byteOrder);
        for (androidx.camera.core.impl.utils.LongRational longRational : longRationalArr) {
            wrap.putInt((int) longRational.getHighSpeedVideoSizes);
            wrap.putInt((int) longRational.getHighResolutionOutputSizeshNQ4ISI);
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(5, longRationalArr.length, wrap.array());
    }

    public static androidx.camera.core.impl.utils.ExifAttribute Camera2StreamConfigurationMap(androidx.camera.core.impl.utils.LongRational[] longRationalArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[getHighResolutionOutputSizeshNQ4ISI[10] * longRationalArr.length]);
        wrap.order(byteOrder);
        for (androidx.camera.core.impl.utils.LongRational longRational : longRationalArr) {
            wrap.putInt((int) longRational.getHighSpeedVideoSizes);
            wrap.putInt((int) longRational.getHighResolutionOutputSizeshNQ4ISI);
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(10, longRationalArr.length, wrap.array());
    }

    public static androidx.camera.core.impl.utils.ExifAttribute getHighResolutionOutputSizeshNQ4ISI(double[] dArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[getHighResolutionOutputSizeshNQ4ISI[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d : dArr) {
            wrap.putDouble(d);
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(12, dArr.length, wrap.array());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(getHighSpeedVideoFpsRanges[this.getInputFormats]);
        sb.append(", data length:");
        sb.append(this.getHighSpeedVideoSizes.length);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0133: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:102:0x0133 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v21, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v23, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v25, types: [androidx.camera.core.impl.utils.LongRational[]] */
    /* JADX WARN: Type inference failed for: r13v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v29, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v31, types: [androidx.camera.core.impl.utils.LongRational[]] */
    /* JADX WARN: Type inference failed for: r13v33, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v36, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final java.lang.Object getHighSpeedVideoSizes(java.nio.ByteOrder byteOrder) {
        androidx.camera.core.impl.utils.ByteOrderedDataInputStream byteOrderedDataInputStream;
        java.io.InputStream inputStream;
        java.lang.String str;
        byte b;
        byte b2;
        java.io.InputStream inputStream2 = null;
        try {
            try {
                byteOrderedDataInputStream = new androidx.camera.core.impl.utils.ByteOrderedDataInputStream(this.getHighSpeedVideoSizes);
                try {
                    byteOrderedDataInputStream.getHighSpeedVideoFpsRanges = byteOrder;
                    int i = 0;
                    switch (this.getInputFormats) {
                        case 1:
                        case 6:
                            byte[] bArr = this.getHighSpeedVideoSizes;
                            if (bArr.length == 1 && (b = bArr[0]) >= 0 && b <= 1) {
                                str = new java.lang.String(new char[]{(char) (b + 48)});
                                break;
                            } else {
                                str = new java.lang.String(bArr, getHighSpeedVideoFpsRangesFor);
                                break;
                            }
                            break;
                        case 2:
                        case 7:
                            if (this.getOutputFormats >= Camera2StreamConfigurationMap.length) {
                                int i2 = 0;
                                while (true) {
                                    byte[] bArr2 = Camera2StreamConfigurationMap;
                                    if (i2 >= bArr2.length) {
                                        i = bArr2.length;
                                    } else if (this.getHighSpeedVideoSizes[i2] == bArr2[i2]) {
                                        i2++;
                                    }
                                }
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            while (i < this.getOutputFormats && (b2 = this.getHighSpeedVideoSizes[i]) != 0) {
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                i++;
                            }
                            str = sb.toString();
                            break;
                        case 3:
                            ?? r13 = new int[this.getOutputFormats];
                            while (true) {
                                str = r13;
                                if (i < this.getOutputFormats) {
                                    r13[i] = byteOrderedDataInputStream.readUnsignedShort();
                                    i++;
                                }
                            }
                            break;
                        case 4:
                            ?? r132 = new long[this.getOutputFormats];
                            while (true) {
                                str = r132;
                                if (i < this.getOutputFormats) {
                                    r132[i] = byteOrderedDataInputStream.readInt() & 4294967295L;
                                    i++;
                                }
                            }
                            break;
                        case 5:
                            ?? r133 = new androidx.camera.core.impl.utils.LongRational[this.getOutputFormats];
                            while (true) {
                                str = r133;
                                if (i < this.getOutputFormats) {
                                    r133[i] = new androidx.camera.core.impl.utils.LongRational(byteOrderedDataInputStream.readInt() & 4294967295L, byteOrderedDataInputStream.readInt() & 4294967295L);
                                    i++;
                                }
                            }
                            break;
                        case 8:
                            ?? r134 = new int[this.getOutputFormats];
                            while (true) {
                                str = r134;
                                if (i < this.getOutputFormats) {
                                    r134[i] = byteOrderedDataInputStream.readShort();
                                    i++;
                                }
                            }
                            break;
                        case 9:
                            ?? r135 = new int[this.getOutputFormats];
                            while (true) {
                                str = r135;
                                if (i < this.getOutputFormats) {
                                    r135[i] = byteOrderedDataInputStream.readInt();
                                    i++;
                                }
                            }
                            break;
                        case 10:
                            ?? r136 = new androidx.camera.core.impl.utils.LongRational[this.getOutputFormats];
                            while (true) {
                                str = r136;
                                if (i < this.getOutputFormats) {
                                    r136[i] = new androidx.camera.core.impl.utils.LongRational(byteOrderedDataInputStream.readInt(), byteOrderedDataInputStream.readInt());
                                    i++;
                                }
                            }
                            break;
                        case 11:
                            ?? r137 = new double[this.getOutputFormats];
                            while (true) {
                                str = r137;
                                if (i < this.getOutputFormats) {
                                    r137[i] = byteOrderedDataInputStream.readFloat();
                                    i++;
                                }
                            }
                            break;
                        case 12:
                            ?? r138 = new double[this.getOutputFormats];
                            while (true) {
                                str = r138;
                                if (i < this.getOutputFormats) {
                                    r138[i] = byteOrderedDataInputStream.readDouble();
                                    i++;
                                }
                            }
                            break;
                        default:
                            try {
                                byteOrderedDataInputStream.close();
                                return null;
                            } catch (java.io.IOException e) {
                                androidx.camera.core.Logger.e("ExifAttribute", "IOException occurred while closing InputStream", e);
                                return null;
                            }
                    }
                    try {
                        byteOrderedDataInputStream.close();
                        return str;
                    } catch (java.io.IOException e2) {
                        androidx.camera.core.Logger.e("ExifAttribute", "IOException occurred while closing InputStream", e2);
                        return str;
                    }
                } catch (java.io.IOException e3) {
                    e = e3;
                    androidx.camera.core.Logger.w("ExifAttribute", "IOException occurred during reading a value", e);
                    if (byteOrderedDataInputStream != null) {
                        try {
                            byteOrderedDataInputStream.close();
                        } catch (java.io.IOException e4) {
                            androidx.camera.core.Logger.e("ExifAttribute", "IOException occurred while closing InputStream", e4);
                        }
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (java.io.IOException e5) {
                        androidx.camera.core.Logger.e("ExifAttribute", "IOException occurred while closing InputStream", e5);
                    }
                }
                throw th;
            }
        } catch (java.io.IOException e6) {
            e = e6;
            byteOrderedDataInputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }
}
