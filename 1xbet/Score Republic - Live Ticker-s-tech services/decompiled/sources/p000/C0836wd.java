package p000;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: wd */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0836wd implements Serializable, Comparable {

    /* JADX INFO: renamed from: m */
    public static final C0836wd f8510m = new C0836wd(new byte[0]);

    /* JADX INFO: renamed from: j */
    public final byte[] f8511j;

    /* JADX INFO: renamed from: k */
    public transient int f8512k;

    /* JADX INFO: renamed from: l */
    public transient String f8513l;

    public C0836wd(byte[] bArr) {
        bArr.getClass();
        this.f8511j = bArr;
    }

    /* JADX INFO: renamed from: f */
    public static final C0836wd m5316f(byte... bArr) {
        bArr.getClass();
        return new C0836wd(Arrays.copyOf(bArr, bArr.length));
    }

    /* JADX INFO: renamed from: a */
    public String mo2555a() {
        byte[] bArr = AbstractC0000a.f0a;
        byte[] bArr2 = this.f8511j;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            bArr3[i2] = bArr[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr2[i];
            byte b6 = bArr2[i5];
            bArr3[i2] = bArr[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, AbstractC0321ig.f3562a);
    }

    /* JADX INFO: renamed from: b */
    public int mo2556b() {
        return this.f8511j.length;
    }

    /* JADX INFO: renamed from: c */
    public String mo2557c() {
        byte[] bArr = this.f8511j;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = zg1.f9758d;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0836wd c0836wd = (C0836wd) obj;
        c0836wd.getClass();
        int iMo2556b = mo2556b();
        int iMo2556b2 = c0836wd.mo2556b();
        int iMin = Math.min(iMo2556b, iMo2556b2);
        for (int i = 0; i < iMin; i++) {
            int iMo2559e = mo2559e(i) & 255;
            int iMo2559e2 = c0836wd.mo2559e(i) & 255;
            if (iMo2559e != iMo2559e2) {
                return iMo2559e < iMo2559e2 ? -1 : 1;
            }
        }
        if (iMo2556b == iMo2556b2) {
            return 0;
        }
        return iMo2556b < iMo2556b2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: d */
    public byte[] mo2558d() {
        return this.f8511j;
    }

    /* JADX INFO: renamed from: e */
    public byte mo2559e(int i) {
        return this.f8511j[i];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0836wd) {
            C0836wd c0836wd = (C0836wd) obj;
            int iMo2556b = c0836wd.mo2556b();
            byte[] bArr = this.f8511j;
            if (iMo2556b == bArr.length && c0836wd.mo2560g(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo2560g(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0) {
            byte[] bArr2 = this.f8511j;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (bArr2[i4 + i] == bArr[i4 + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo2561h(C0836wd c0836wd, int i) {
        c0836wd.getClass();
        return c0836wd.mo2560g(0, this.f8511j, 0, i);
    }

    public int hashCode() {
        int i = this.f8512k;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f8511j);
        this.f8512k = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public C0836wd mo2562i() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f8511j;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C0836wd(bArrCopyOf);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: j */
    public byte[] mo2563j() {
        byte[] bArr = this.f8511j;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: k */
    public final String m5317k() {
        String str = this.f8513l;
        if (str != null) {
            return str;
        }
        byte[] bArrMo2558d = mo2558d();
        bArrMo2558d.getClass();
        String str2 = new String(bArrMo2558d, AbstractC0321ig.f3562a);
        this.f8513l = str2;
        return str2;
    }

    /* JADX INFO: renamed from: l */
    public void mo2564l(C0539oc c0539oc, int i) {
        c0539oc.write(this.f8511j, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:179:0x01b6 A[EDGE_INSN: B:179:0x01b6->B:180:0x01b7 BREAK  A[LOOP:0: B:7:0x000e->B:241:0x000e]] */
    public String toString() {
        byte b;
        int i;
        C0836wd c0836wd = this;
        byte[] bArr = c0836wd.f8511j;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i2 < length) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if ((b2 >> 5) != -2) {
                    if ((b2 >> 4) != -2) {
                        if ((b2 >> 3) != -2) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i5 = i2 + 3;
                        if (length > i5) {
                            byte b3 = bArr[i2 + 1];
                            if ((b3 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b4 = bArr[i2 + 2];
                            if ((b4 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b5 = bArr[i5];
                            if ((b5 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i6 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i6 <= 1114111) {
                                if (55296 <= i6 && i6 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                if (i6 >= 65536) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i6 != 10 && i6 != 13 && ((i6 >= 0 && i6 < 32) || (127 <= i6 && i6 < 160))) || i6 == 65533) {
                                        i3 = -1;
                                        break;
                                    }
                                    i3 += i6 < 65536 ? 1 : 2;
                                    i2 += 4;
                                    i4 = i;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        int i7 = i2 + 2;
                        if (length > i7) {
                            byte b6 = bArr[i2 + 1];
                            if ((b6 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b7 = bArr[i7];
                            if ((b7 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i8 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b2 << 12);
                            if (i8 >= 2048) {
                                if (55296 <= i8 && i8 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                                    i3 = -1;
                                    break;
                                }
                                i3 += i8 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    }
                } else {
                    int i9 = i2 + 1;
                    if (length > i9) {
                        byte b8 = bArr[i9];
                        if ((b8 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i10 = (b8 ^ 3968) ^ (b2 << 6);
                        if (i10 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                i3 = -1;
                                break;
                            }
                            i3 += i10 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i3 = -1;
                        break;
                    }
                }
            } else {
                int i11 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (127 > b2 || b2 >= 160))) && b2 != 65533) {
                    i3 += b2 < 65536 ? 1 : 2;
                    i2++;
                    while (true) {
                        i4 = i11;
                        if (i2 < length && (b = bArr[i2]) >= 0) {
                            i2++;
                            i11 = i4 + 1;
                            if (i4 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (127 > b || b >= 160))) && b != 65533) {
                                i3 += b < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            String strM5317k = c0836wd.m5317k();
            String strM1762x = fb1.m1762x(fb1.m1762x(fb1.m1762x(strM5317k.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strM5317k.length()) {
                return "[text=" + strM1762x + ']';
            }
            return "[size=" + bArr.length + " text=" + strM1762x + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + c0836wd.mo2557c() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (64 != bArr.length) {
            zg1.m5893d(64, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            bArrCopyOfRange.getClass();
            c0836wd = new C0836wd(bArrCopyOfRange);
        }
        sb.append(c0836wd.mo2557c());
        sb.append("…]");
        return sb.toString();
    }
}
