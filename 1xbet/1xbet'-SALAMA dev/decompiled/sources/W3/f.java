package W3;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f6714a = Charset.forName("UTF-8");

    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        if (r7 != 4) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(String str) {
        byte[] bytes = str.getBytes(f6714a);
        int length = bytes.length;
        int i7 = (length * 3) / 4;
        byte[] bArr = new byte[i7];
        int[] iArr = e.f6712d;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i8 < length) {
            if (i9 == 0) {
                while (true) {
                    int i12 = i8 + 4;
                    if (i12 > length || (i10 = (iArr[bytes[i8] & 255] << 18) | (iArr[bytes[i8 + 1] & 255] << 12) | (iArr[bytes[i8 + 2] & 255] << 6) | iArr[bytes[i8 + 3] & 255]) < 0) {
                        break;
                    }
                    bArr[i11 + 2] = (byte) i10;
                    bArr[i11 + 1] = (byte) (i10 >> 8);
                    bArr[i11] = (byte) (i10 >> 16);
                    i11 += 3;
                    i8 = i12;
                }
                if (i8 >= length) {
                    break;
                }
                throw new IllegalArgumentException("bad base-64");
            }
            int i13 = i8 + 1;
            int i14 = iArr[bytes[i8] & 255];
            if (i9 != 0) {
                if (i9 == 1) {
                    if (i14 >= 0) {
                        i14 |= i10 << 6;
                    } else if (i14 != -1) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    i8 = i13;
                } else if (i9 == 2) {
                    if (i14 >= 0) {
                        i14 |= i10 << 6;
                    } else if (i14 == -2) {
                        bArr[i11] = (byte) (i10 >> 4);
                        i9 = 4;
                        i11++;
                    } else if (i14 != -1) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    i8 = i13;
                } else if (i9 == 3) {
                    if (i14 >= 0) {
                        i14 |= i10 << 6;
                        bArr[i11 + 2] = (byte) i14;
                        bArr[i11 + 1] = (byte) (i14 >> 8);
                        bArr[i11] = (byte) (i14 >> 16);
                        i11 += 3;
                        i9 = 0;
                    } else if (i14 == -2) {
                        bArr[i11 + 1] = (byte) (i10 >> 2);
                        bArr[i11] = (byte) (i10 >> 10);
                        i11 += 2;
                        i9 = 5;
                    } else if (i14 != -1) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    i8 = i13;
                } else if (i9 == 4) {
                    if (i14 == -2) {
                        i9++;
                    } else if (i14 != -1) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    i8 = i13;
                } else {
                    if (i9 == 5 && i14 != -1) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    i8 = i13;
                }
                i9++;
            } else {
                if (i14 >= 0) {
                    i9++;
                } else if (i14 != -1) {
                    throw new IllegalArgumentException("bad base-64");
                }
                i8 = i13;
            }
            i10 = i14;
            i8 = i13;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                bArr[i11] = (byte) (i10 >> 4);
                i11++;
            } else if (i9 == 3) {
                int i15 = i11 + 1;
                bArr[i11] = (byte) (i10 >> 10);
                i11 += 2;
                bArr[i15] = (byte) (i10 >> 2);
            }
            if (i11 == i7) {
                return bArr;
            }
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, 0, bArr2, 0, i11);
            return bArr2;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = e.f6713e;
        int i7 = (length / 3) * 4;
        if (length % 3 > 0) {
            i7 += 4;
        }
        byte[] bArr3 = new byte[i7];
        int i8 = 0;
        int i9 = -1;
        int i10 = 0;
        while (true) {
            int i11 = i8 + 3;
            if (i11 > length) {
                break;
            }
            int i12 = (bArr[i8 + 2] & 255) | ((bArr[i8] & 255) << 16) | ((bArr[i8 + 1] & 255) << 8);
            bArr3[i10] = bArr2[(i12 >> 18) & 63];
            bArr3[i10 + 1] = bArr2[(i12 >> 12) & 63];
            bArr3[i10 + 2] = bArr2[(i12 >> 6) & 63];
            bArr3[i10 + 3] = bArr2[i12 & 63];
            int i13 = i10 + 4;
            i9--;
            if (i9 == 0) {
                i10 += 5;
                bArr3[i13] = 10;
                i9 = 19;
            } else {
                i10 = i13;
            }
            i8 = i11;
        }
        if (i8 == length - 1) {
            int i14 = (bArr[i8] & 255) << 4;
            bArr3[i10] = bArr2[(i14 >> 6) & 63];
            bArr3[i10 + 1] = bArr2[i14 & 63];
            bArr3[i10 + 2] = 61;
            bArr3[i10 + 3] = 61;
        } else if (i8 == length - 2) {
            int i15 = ((bArr[i8 + 1] & 255) << 2) | ((bArr[i8] & 255) << 10);
            bArr3[i10] = bArr2[(i15 >> 12) & 63];
            bArr3[i10 + 1] = bArr2[(i15 >> 6) & 63];
            bArr3[i10 + 2] = bArr2[i15 & 63];
            bArr3[i10 + 3] = 61;
        }
        return bArr3;
    }
}
