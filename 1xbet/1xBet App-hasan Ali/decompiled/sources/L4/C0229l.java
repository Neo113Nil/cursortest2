package L4;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import n.AbstractC2107A;
import o4.AbstractC2223a;
import o4.AbstractC2234l;

/* renamed from: L4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0229l implements Serializable, Comparable {

    /* renamed from: n, reason: collision with root package name */
    public static final C0229l f3092n = new C0229l(new byte[0]);

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f3093k;

    /* renamed from: l, reason: collision with root package name */
    public transient int f3094l;

    /* renamed from: m, reason: collision with root package name */
    public transient String f3095m;

    public C0229l(byte[] bArr) {
        kotlin.jvm.internal.l.f("data", bArr);
        this.f3093k = bArr;
    }

    public static int f(C0229l c0229l, C0229l c0229l2) {
        c0229l.getClass();
        kotlin.jvm.internal.l.f("other", c0229l2);
        return c0229l.e(0, c0229l2.f3093k);
    }

    public static int j(C0229l c0229l, C0229l c0229l2) {
        c0229l.getClass();
        kotlin.jvm.internal.l.f("other", c0229l2);
        return c0229l.i(c0229l2.f3093k);
    }

    public static /* synthetic */ C0229l n(C0229l c0229l, int i, int i5, int i6) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = -1234567890;
        }
        return c0229l.m(i, i5);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0229l c0229l) {
        kotlin.jvm.internal.l.f("other", c0229l);
        int c5 = c();
        int c6 = c0229l.c();
        int min = Math.min(c5, c6);
        for (int i = 0; i < min; i++) {
            int h3 = h(i) & 255;
            int h4 = c0229l.h(i) & 255;
            if (h3 != h4) {
                return h3 < h4 ? -1 : 1;
            }
        }
        if (c5 == c6) {
            return 0;
        }
        return c5 < c6 ? -1 : 1;
    }

    public C0229l b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f3093k, 0, c());
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.l.c(digest);
        return new C0229l(digest);
    }

    public int c() {
        return this.f3093k.length;
    }

    public String d() {
        byte[] bArr = this.f3093k;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b3 : bArr) {
            int i5 = i + 1;
            char[] cArr2 = M4.b.f3620a;
            cArr[i] = cArr2[(b3 >> 4) & 15];
            i += 2;
            cArr[i5] = cArr2[b3 & 15];
        }
        return new String(cArr);
    }

    public int e(int i, byte[] bArr) {
        kotlin.jvm.internal.l.f("other", bArr);
        byte[] bArr2 = this.f3093k;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!G4.l.i(max, 0, bArr.length, bArr2, bArr)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0229l) {
            C0229l c0229l = (C0229l) obj;
            int c5 = c0229l.c();
            byte[] bArr = this.f3093k;
            if (c5 == bArr.length && c0229l.k(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte[] g() {
        return this.f3093k;
    }

    public byte h(int i) {
        return this.f3093k[i];
    }

    public int hashCode() {
        int i = this.f3094l;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f3093k);
        this.f3094l = hashCode;
        return hashCode;
    }

    public int i(byte[] bArr) {
        kotlin.jvm.internal.l.f("other", bArr);
        int c5 = c();
        byte[] bArr2 = this.f3093k;
        for (int min = Math.min(c5, bArr2.length - bArr.length); -1 < min; min--) {
            if (G4.l.i(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public boolean k(int i, int i5, int i6, byte[] bArr) {
        kotlin.jvm.internal.l.f("other", bArr);
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f3093k;
        return i <= bArr2.length - i6 && i5 >= 0 && i5 <= bArr.length - i6 && G4.l.i(i, i5, i6, bArr2, bArr);
    }

    public boolean l(int i, C0229l c0229l, int i5) {
        kotlin.jvm.internal.l.f("other", c0229l);
        return c0229l.k(0, i, i5, this.f3093k);
    }

    public C0229l m(int i, int i5) {
        if (i5 == -1234567890) {
            i5 = c();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f3093k;
        if (i5 > bArr.length) {
            throw new IllegalArgumentException(AbstractC2107A.t(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i5 - i >= 0) {
            return (i == 0 && i5 == bArr.length) ? this : new C0229l(X3.l.z0(bArr, i, i5));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public C0229l o() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f3093k;
            if (i >= bArr.length) {
                return this;
            }
            byte b3 = bArr[i];
            if (b3 >= 65 && b3 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
                copyOf[i] = (byte) (b3 + 32);
                for (int i5 = i + 1; i5 < copyOf.length; i5++) {
                    byte b5 = copyOf[i5];
                    if (b5 >= 65 && b5 <= 90) {
                        copyOf[i5] = (byte) (b5 + 32);
                    }
                }
                return new C0229l(copyOf);
            }
            i++;
        }
    }

    public final String p() {
        String str = this.f3095m;
        if (str != null) {
            return str;
        }
        byte[] g5 = g();
        kotlin.jvm.internal.l.f("<this>", g5);
        String str2 = new String(g5, AbstractC2223a.f18653a);
        this.f3095m = str2;
        return str2;
    }

    public void q(C0226i c0226i, int i) {
        kotlin.jvm.internal.l.f("buffer", c0226i);
        c0226i.N(this.f3093k, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00ee, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0128, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x012c, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ce, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x016b, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0172, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0164, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01a2, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01a5, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01a8, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0138, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01ab, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008e, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bc, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007d, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f6, code lost:
    
        if (r6 == 64) goto L183;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b3;
        int i;
        byte[] bArr = this.f3093k;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        loop0: while (true) {
            if (i5 >= length) {
                break;
            }
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                int i8 = i7 + 1;
                if (i7 == 64) {
                    break;
                }
                if ((b5 != 10 && b5 != 13 && ((b5 >= 0 && b5 < 32) || (Byte.MAX_VALUE <= b5 && b5 < 160))) || b5 == 65533) {
                    break;
                }
                i6 += b5 < 65536 ? 1 : 2;
                i5++;
                while (true) {
                    i7 = i8;
                    if (i5 < length && (b3 = bArr[i5]) >= 0) {
                        i5++;
                        i8 = i7 + 1;
                        if (i7 == 64) {
                            break loop0;
                        }
                        if ((b3 != 10 && b3 != 13 && ((b3 >= 0 && b3 < 32) || (Byte.MAX_VALUE <= b3 && b3 < 160))) || b3 == 65533) {
                            break loop0;
                        }
                        i6 += b3 < 65536 ? 1 : 2;
                    }
                }
            } else if ((b5 >> 5) == -2) {
                int i9 = i5 + 1;
                if (length > i9) {
                    byte b6 = bArr[i9];
                    if ((b6 & 192) == 128) {
                        int i10 = (b6 ^ 3968) ^ (b5 << 6);
                        if (i10 >= 128) {
                            i = i7 + 1;
                            if (i7 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                break;
                            }
                            i6 += i10 < 65536 ? 1 : 2;
                            i5 += 2;
                            i7 = i;
                        }
                    }
                }
            } else if ((b5 >> 4) == -2) {
                int i11 = i5 + 2;
                if (length > i11) {
                    byte b7 = bArr[i5 + 1];
                    if ((b7 & 192) == 128) {
                        byte b8 = bArr[i11];
                        if ((b8 & 192) == 128) {
                            int i12 = ((b8 ^ (-123008)) ^ (b7 << 6)) ^ (b5 << 12);
                            if (i12 >= 2048) {
                                if (55296 > i12 || i12 >= 57344) {
                                    i = i7 + 1;
                                    if (i7 == 64) {
                                        break;
                                    }
                                    if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                        break;
                                    }
                                    i6 += i12 < 65536 ? 1 : 2;
                                    i5 += 3;
                                    i7 = i;
                                }
                            }
                        }
                    }
                }
            } else if ((b5 >> 3) == -2) {
                int i13 = i5 + 3;
                if (length > i13) {
                    byte b9 = bArr[i5 + 1];
                    if ((b9 & 192) == 128) {
                        byte b10 = bArr[i5 + 2];
                        if ((b10 & 192) == 128) {
                            byte b11 = bArr[i13];
                            if ((b11 & 192) == 128) {
                                int i14 = (((b11 ^ 3678080) ^ (b10 << 6)) ^ (b9 << 12)) ^ (b5 << 18);
                                if (i14 <= 1114111) {
                                    if (55296 > i14 || i14 >= 57344) {
                                        if (i14 >= 65536) {
                                            i = i7 + 1;
                                            if (i7 == 64) {
                                                break;
                                            }
                                            if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                                break;
                                            }
                                            i6 += i14 < 65536 ? 1 : 2;
                                            i5 += 4;
                                            i7 = i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i6 == -1) {
            if (bArr.length <= 64) {
                return "[hex=" + d() + ']';
            }
            StringBuilder sb = new StringBuilder("[size=");
            sb.append(bArr.length);
            sb.append(" hex=");
            if (64 > bArr.length) {
                throw new IllegalArgumentException(AbstractC2107A.t(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
            }
            sb.append((64 == bArr.length ? this : new C0229l(X3.l.z0(bArr, 0, 64))).d());
            sb.append("…]");
            return sb.toString();
        }
        String p5 = p();
        String substring = p5.substring(0, i6);
        kotlin.jvm.internal.l.e("substring(...)", substring);
        String v02 = AbstractC2234l.v0(AbstractC2234l.v0(AbstractC2234l.v0(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i6 >= p5.length()) {
            return "[text=" + v02 + ']';
        }
        return "[size=" + bArr.length + " text=" + v02 + "…]";
    }
}
