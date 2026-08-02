package Td;

/* loaded from: classes.dex */
final class x {
    private static int a(int i11, int i12) {
        if (i11 > -12 || i12 > -65) {
            return -1;
        }
        return i11 ^ (i12 << 8);
    }

    private static int b(int i11, int i12, byte[] bArr) {
        byte b11 = bArr[i11 - 1];
        int i13 = i12 - i11;
        if (i13 == 0) {
            if (b11 > -12) {
                return -1;
            }
            return b11;
        }
        if (i13 == 1) {
            return a(b11, bArr[i11]);
        }
        if (i13 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i11];
        byte b13 = bArr[i11 + 1];
        if (b11 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b12 << 8) ^ b11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r7[r8] > (-65)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        if (r7[r8] > (-65)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        if (r7[r6] > (-65)) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int i11, byte[] bArr, int i12, int i13) {
        byte b11;
        int i14;
        int i15;
        if (i11 != 0) {
            if (i12 >= i13) {
                return i11;
            }
            byte b12 = (byte) i11;
            if (b12 < -32) {
                if (b12 >= -62) {
                    i15 = i12 + 1;
                }
                return -1;
            }
            if (b12 < -16) {
                byte b13 = (byte) (~(i11 >> 8));
                if (b13 == 0) {
                    int i16 = i12 + 1;
                    byte b14 = bArr[i12];
                    if (i16 >= i13) {
                        return a(b12, b14);
                    }
                    i12 = i16;
                    b13 = b14;
                }
                if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                    i15 = i12 + 1;
                }
            } else {
                byte b15 = (byte) (~(i11 >> 8));
                if (b15 == 0) {
                    i14 = i12 + 1;
                    b15 = bArr[i12];
                    if (i14 >= i13) {
                        return a(b12, b15);
                    }
                    b11 = 0;
                } else {
                    b11 = (byte) (i11 >> 16);
                    i14 = i12;
                }
                if (b11 == 0) {
                    int i17 = i14 + 1;
                    byte b16 = bArr[i14];
                    if (i17 >= i13) {
                        if (b12 > -12 || b15 > -65 || b16 > -65) {
                            return -1;
                        }
                        return (b16 << 16) ^ ((b15 << 8) ^ b12);
                    }
                    b11 = b16;
                    i14 = i17;
                }
                if (b15 <= -65) {
                    if ((((b15 + 112) + (b12 << 28)) >> 30) == 0 && b11 <= -65) {
                        i12 = i14 + 1;
                    }
                }
            }
            return -1;
        }
        return d(bArr, i12, i13);
    }

    public static int d(byte[] bArr, int i11, int i12) {
        while (i11 < i12 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 >= i12) {
            return 0;
        }
        while (i11 < i12) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            if (b11 >= 0) {
                i11 = i13;
            } else if (b11 < -32) {
                if (i13 >= i12) {
                    return b11;
                }
                if (b11 < -62) {
                    return -1;
                }
                i11 += 2;
                if (bArr[i13] > -65) {
                    return -1;
                }
            } else if (b11 < -16) {
                if (i13 >= i12 - 1) {
                    return b(i13, i12, bArr);
                }
                int i14 = i11 + 2;
                byte b12 = bArr[i13];
                if (b12 > -65) {
                    return -1;
                }
                if (b11 == -32 && b12 < -96) {
                    return -1;
                }
                if (b11 == -19 && b12 >= -96) {
                    return -1;
                }
                i11 += 3;
                if (bArr[i14] > -65) {
                    return -1;
                }
            } else {
                if (i13 >= i12 - 2) {
                    return b(i13, i12, bArr);
                }
                int i15 = i11 + 2;
                byte b13 = bArr[i13];
                if (b13 > -65) {
                    return -1;
                }
                if ((((b13 + 112) + (b11 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i16 = i11 + 3;
                if (bArr[i15] > -65) {
                    return -1;
                }
                i11 += 4;
                if (bArr[i16] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
