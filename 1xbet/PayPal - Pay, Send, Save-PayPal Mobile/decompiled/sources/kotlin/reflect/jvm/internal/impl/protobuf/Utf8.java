package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
final class Utf8 {
    public static boolean getHighSpeedVideoFpsRanges(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length && bArr[i] >= 0) {
            i++;
        }
        return i >= length || getHighSpeedVideoFpsRangesFor(bArr, i, length) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
    
        if (r9[r10] <= (-65)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        if (r9[r10] > (-65)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0094, code lost:
    
        if (r9[r10] > (-65)) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int Camera2StreamConfigurationMap(int i, byte[] bArr, int i2, int i3) {
        byte b;
        int i4;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i4 = i2 + 1;
                }
                return -1;
            }
            if (b2 < -16) {
                byte b3 = (byte) (~(i >> 8));
                if (b3 == 0) {
                    int i5 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i5 >= i3) {
                        if (b2 > -12 || b4 > -65) {
                            return -1;
                        }
                        return (b4 << 8) ^ b2;
                    }
                    i2 = i5;
                    b3 = b4;
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    i4 = i2 + 1;
                }
                return -1;
            }
            byte b5 = (byte) (~(i >> 8));
            if (b5 == 0) {
                int i6 = i2 + 1;
                b5 = bArr[i2];
                if (i6 >= i3) {
                    if (b2 > -12 || b5 > -65) {
                        return -1;
                    }
                    return (b5 << 8) ^ b2;
                }
                i2 = i6;
                b = 0;
            } else {
                b = (byte) (i >> 16);
            }
            if (b == 0) {
                int i7 = i2 + 1;
                byte b6 = bArr[i2];
                if (i7 >= i3) {
                    if (b2 > -12 || b5 > -65 || b6 > -65) {
                        return -1;
                    }
                    return ((b5 << 8) ^ b2) ^ (b6 << 16);
                }
                i2 = i7;
                b = b6;
            }
            if (b5 <= -65 && (((b2 << com.google.common.base.Ascii.FS) + (b5 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) == 0 && b <= -65) {
                i4 = i2 + 1;
            }
            return -1;
            i2 = i4;
        }
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        return getHighSpeedVideoFpsRangesFor(bArr, i2, i3);
    }

    private static int getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i3 >= i2 - 2) {
                        return Camera2StreamConfigurationMap(bArr, i3, i2);
                    }
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && (((b << com.google.common.base.Ascii.FS) + (b2 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) == 0 && bArr[i + 2] <= -65) {
                        i3 = i + 4;
                        if (bArr[i + 3] > -65) {
                        }
                    }
                    return -1;
                }
                if (i3 >= i2 - 1) {
                    return Camera2StreamConfigurationMap(bArr, i3, i2);
                }
                byte b3 = bArr[i3];
                if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                    i3 = i + 3;
                    if (bArr[i + 2] > -65) {
                    }
                }
                return -1;
            }
            i = i3;
        }
        return 0;
    }

    private static int Camera2StreamConfigurationMap(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            byte b2 = bArr[i];
            if (b > -12 || b2 > -65) {
                return -1;
            }
            return (b2 << 8) ^ b;
        }
        if (i3 == 2) {
            byte b3 = bArr[i];
            byte b4 = bArr[i + 1];
            if (b > -12 || b3 > -65 || b4 > -65) {
                return -1;
            }
            return (b4 << 16) ^ ((b3 << 8) ^ b);
        }
        throw new java.lang.AssertionError();
    }

    public static boolean getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        return i >= i2 || getHighSpeedVideoFpsRangesFor(bArr, i, i2) == 0;
    }
}
