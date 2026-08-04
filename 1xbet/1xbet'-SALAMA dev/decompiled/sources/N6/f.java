package N6;

import W5.AbstractC0486a1;
import io.sentry.protocol.Request;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class f implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f4798d = new f(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f4800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient String f4801c;

    public f(byte[] bArr) {
        t6.h.e(bArr, "data");
        this.f4799a = bArr;
    }

    public static final f h(byte... bArr) {
        t6.h.e(bArr, "data");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        t6.h.d(bArrCopyOf, "copyOf(this, size)");
        return new f(bArrCopyOf);
    }

    public String a() {
        byte[] bArr = a.f4789a;
        byte[] bArr2 = this.f4799a;
        t6.h.e(bArr2, "<this>");
        t6.h.e(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            byte b7 = bArr2[i7];
            int i9 = i7 + 2;
            byte b8 = bArr2[i7 + 1];
            i7 += 3;
            byte b9 = bArr2[i9];
            bArr3[i8] = bArr[(b7 & 255) >> 2];
            bArr3[i8 + 1] = bArr[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            int i10 = i8 + 3;
            bArr3[i8 + 2] = bArr[((b8 & 15) << 2) | ((b9 & 255) >> 6)];
            i8 += 4;
            bArr3[i10] = bArr[b9 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b10 = bArr2[i7];
            bArr3[i8] = bArr[(b10 & 255) >> 2];
            bArr3[i8 + 1] = bArr[(b10 & 3) << 4];
            bArr3[i8 + 2] = 61;
            bArr3[i8 + 3] = 61;
        } else if (length2 == 2) {
            int i11 = i7 + 1;
            byte b11 = bArr2[i7];
            byte b12 = bArr2[i11];
            bArr3[i8] = bArr[(b11 & 255) >> 2];
            bArr3[i8 + 1] = bArr[((b11 & 3) << 4) | ((b12 & 255) >> 4)];
            bArr3[i8 + 2] = bArr[(b12 & 15) << 2];
            bArr3[i8 + 3] = 61;
        }
        return new String(bArr3, C6.a.f1581a);
    }

    public int b() {
        return this.f4799a.length;
    }

    public String c() {
        byte[] bArr = this.f4799a;
        char[] cArr = new char[bArr.length * 2];
        int i7 = 0;
        for (byte b7 : bArr) {
            int i8 = i7 + 1;
            char[] cArr2 = O6.b.f5016a;
            cArr[i7] = cArr2[(b7 >> 4) & 15];
            i7 += 2;
            cArr[i8] = cArr2[b7 & 15];
        }
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        t6.h.e(fVar, Request.JsonKeys.OTHER);
        int iB = b();
        int iB2 = fVar.b();
        int iMin = Math.min(iB, iB2);
        for (int i7 = 0; i7 < iMin; i7++) {
            int iF = f(i7) & 255;
            int iF2 = fVar.f(i7) & 255;
            if (iF == iF2) {
            }
        }
        if (iB == iB2) {
            return 0;
        }
    }

    public byte[] d() {
        return this.f4799a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int iB = fVar.b();
            byte[] bArr = this.f4799a;
            if (iB == bArr.length && fVar.l(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte f(int i7) {
        return this.f4799a[i7];
    }

    public int hashCode() {
        int i7 = this.f4800b;
        if (i7 != 0) {
            return i7;
        }
        int iHashCode = Arrays.hashCode(this.f4799a);
        this.f4800b = iHashCode;
        return iHashCode;
    }

    public boolean l(int i7, byte[] bArr, int i8, int i9) {
        t6.h.e(bArr, Request.JsonKeys.OTHER);
        if (i7 >= 0) {
            byte[] bArr2 = this.f4799a;
            if (i7 <= bArr2.length - i9 && i8 >= 0 && i8 <= bArr.length - i9 && p113p3.f.a(bArr2, i7, bArr, i8, i9)) {
                return true;
            }
        }
        return false;
    }

    public boolean m(f fVar, int i7) {
        t6.h.e(fVar, Request.JsonKeys.OTHER);
        return fVar.l(0, this.f4799a, 0, i7);
    }

    public f p() {
        int i7 = 0;
        while (true) {
            byte[] bArr = this.f4799a;
            if (i7 >= bArr.length) {
                return this;
            }
            byte b7 = bArr[i7];
            if (b7 >= 65 && b7 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                t6.h.d(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i7] = (byte) (b7 + 32);
                for (int i8 = i7 + 1; i8 < bArrCopyOf.length; i8++) {
                    byte b8 = bArrCopyOf[i8];
                    if (b8 >= 65 && b8 <= 90) {
                        bArrCopyOf[i8] = (byte) (b8 + 32);
                    }
                }
                return new f(bArrCopyOf);
            }
            i7++;
        }
    }

    public byte[] t() {
        byte[] bArr = this.f4799a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        t6.h.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003c A[EDGE_INSN: B:22:0x003c->B:180:0x01a6 BREAK  A[LOOP:0: B:6:0x000f->B:242:0x000f]] */
    public String toString() {
        f fVar;
        byte b7;
        int i7;
        byte[] bArr = this.f4799a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        loop0: while (i8 < length) {
            byte b8 = bArr[i8];
            if (b8 < 0) {
                if ((b8 >> 5) != -2) {
                    if ((b8 >> 4) != -2) {
                        if ((b8 >> 3) != -2) {
                            if (i10 == 64) {
                                break;
                            }
                            i9 = -1;
                            break;
                        }
                        int i11 = i8 + 3;
                        if (length > i11) {
                            byte b9 = bArr[i8 + 1];
                            if ((b9 & 192) != 128) {
                                if (i10 == 64) {
                                    break;
                                }
                                i9 = -1;
                                break;
                            }
                            byte b10 = bArr[i8 + 2];
                            if ((b10 & 192) != 128) {
                                if (i10 == 64) {
                                    break;
                                }
                                i9 = -1;
                                break;
                            }
                            byte b11 = bArr[i11];
                            if ((b11 & 192) != 128) {
                                if (i10 == 64) {
                                    break;
                                }
                                i9 = -1;
                                break;
                            }
                            int i12 = (((b11 ^ 3678080) ^ (b10 << 6)) ^ (b9 << 12)) ^ (b8 << 18);
                            if (i12 <= 1114111) {
                                if (55296 <= i12 && i12 < 57344) {
                                    if (i10 == 64) {
                                        break;
                                    }
                                    i9 = -1;
                                    break;
                                }
                                if (i12 >= 65536) {
                                    i7 = i10 + 1;
                                    if (i10 == 64) {
                                        break;
                                    }
                                    if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                        i9 = -1;
                                        break;
                                    }
                                    i9 += i12 < 65536 ? 1 : 2;
                                    i8 += 4;
                                    i10 = i7;
                                } else {
                                    if (i10 == 64) {
                                        break;
                                    }
                                    i9 = -1;
                                    break;
                                }
                            } else {
                                if (i10 == 64) {
                                    break;
                                }
                                i9 = -1;
                                break;
                            }
                        } else {
                            if (i10 == 64) {
                                break;
                            }
                            i9 = -1;
                            break;
                        }
                    } else {
                        int i13 = i8 + 2;
                        if (length > i13) {
                            byte b12 = bArr[i8 + 1];
                            if ((b12 & 192) != 128) {
                                if (i10 == 64) {
                                    break;
                                }
                                i9 = -1;
                                break;
                            }
                            byte b13 = bArr[i13];
                            if ((b13 & 192) != 128) {
                                if (i10 == 64) {
                                    break;
                                }
                                i9 = -1;
                                break;
                            }
                            int i14 = ((b13 ^ (-123008)) ^ (b12 << 6)) ^ (b8 << 12);
                            if (i14 >= 2048) {
                                if (55296 <= i14 && i14 < 57344) {
                                    if (i10 == 64) {
                                        break;
                                    }
                                    i9 = -1;
                                    break;
                                }
                                i7 = i10 + 1;
                                if (i10 == 64) {
                                    break;
                                }
                                if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                    i9 = -1;
                                    break;
                                }
                                i9 += i14 < 65536 ? 1 : 2;
                                i8 += 3;
                                i10 = i7;
                            } else {
                                if (i10 == 64) {
                                    break;
                                }
                                i9 = -1;
                                break;
                            }
                        } else {
                            if (i10 == 64) {
                                break;
                            }
                            i9 = -1;
                            break;
                        }
                    }
                } else {
                    int i15 = i8 + 1;
                    if (length > i15) {
                        byte b14 = bArr[i15];
                        if ((b14 & 192) != 128) {
                            if (i10 == 64) {
                                break;
                            }
                            i9 = -1;
                            break;
                        }
                        int i16 = (b14 ^ 3968) ^ (b8 << 6);
                        if (i16 >= 128) {
                            i7 = i10 + 1;
                            if (i10 == 64) {
                                break;
                            }
                            if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                                i9 = -1;
                                break;
                            }
                            i9 += i16 < 65536 ? 1 : 2;
                            i8 += 2;
                            i10 = i7;
                        } else {
                            if (i10 == 64) {
                                break;
                            }
                            i9 = -1;
                            break;
                        }
                    } else {
                        if (i10 == 64) {
                            break;
                        }
                        i9 = -1;
                        break;
                    }
                }
            } else {
                int i17 = i10 + 1;
                if (i10 == 64) {
                    break;
                }
                if ((b8 == 10 || b8 == 13 || ((b8 < 0 || b8 >= 32) && (127 > b8 || b8 >= 160))) && b8 != 65533) {
                    i9 += b8 < 65536 ? 1 : 2;
                    i8++;
                    while (true) {
                        i10 = i17;
                        if (i8 < length && (b7 = bArr[i8]) >= 0) {
                            i8++;
                            i17 = i10 + 1;
                            if (i10 == 64) {
                                break loop0;
                            }
                            if ((b7 == 10 || b7 == 13 || ((b7 < 0 || b7 >= 32) && (127 > b7 || b7 >= 160))) && b7 != 65533) {
                                i9 += b7 < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i9 = -1;
                break;
            }
        }
        if (i9 != -1) {
            String strY = y();
            String strSubstring = strY.substring(0, i9);
            t6.h.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strY0 = C6.o.y0(C6.o.y0(C6.o.y0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i9 >= strY.length()) {
                return "[text=" + strY0 + ']';
            }
            return "[size=" + bArr.length + " text=" + strY0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + c() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (64 == bArr.length) {
            fVar = this;
        } else {
            int length2 = bArr.length;
            if (64 > length2) {
                throw new IndexOutOfBoundsException(AbstractC0486a1.f(length2, "toIndex (64) is greater than size (", ")."));
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            t6.h.d(bArrCopyOfRange, "copyOfRange(...)");
            fVar = new f(bArrCopyOfRange);
        }
        sb.append(fVar.c());
        sb.append("…]");
        return sb.toString();
    }

    public final String y() {
        String str = this.f4801c;
        if (str != null) {
            return str;
        }
        byte[] bArrD = d();
        t6.h.e(bArrD, "<this>");
        String str2 = new String(bArrD, C6.a.f1581a);
        this.f4801c = str2;
        return str2;
    }

    public void z(d dVar, int i7) {
        t6.h.e(dVar, "buffer");
        dVar.k(this.f4799a, 0, i7);
    }
}
