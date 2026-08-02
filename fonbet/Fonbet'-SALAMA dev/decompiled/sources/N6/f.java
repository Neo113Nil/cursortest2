package N6;

import W5.AbstractC0486a1;
import io.sentry.protocol.Request;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class f implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final f f4798d = new f(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4799a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f4800b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f4801c;

    public f(byte[] bArr) {
        t6.h.e(bArr, "data");
        this.f4799a = bArr;
    }

    public static final f h(byte... bArr) {
        t6.h.e(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        t6.h.d(copyOf, "copyOf(this, size)");
        return new f(copyOf);
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r0 < r1) goto L9;
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
        int b7 = b();
        int b8 = fVar.b();
        int min = Math.min(b7, b8);
        for (int i7 = 0; i7 < min; i7++) {
            int f7 = f(i7) & 255;
            int f8 = fVar.f(i7) & 255;
            if (f7 == f8) {
            }
        }
        if (b7 == b8) {
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
            int b7 = fVar.b();
            byte[] bArr = this.f4799a;
            if (b7 == bArr.length && fVar.l(0, bArr, 0, bArr.length)) {
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
        int hashCode = Arrays.hashCode(this.f4799a);
        this.f4800b = hashCode;
        return hashCode;
    }

    public boolean l(int i7, byte[] bArr, int i8, int i9) {
        t6.h.e(bArr, Request.JsonKeys.OTHER);
        if (i7 >= 0) {
            byte[] bArr2 = this.f4799a;
            if (i7 <= bArr2.length - i9 && i8 >= 0 && i8 <= bArr.length - i9 && p3.f.a(bArr2, i7, bArr, i8, i9)) {
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
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                t6.h.d(copyOf, "copyOf(this, size)");
                copyOf[i7] = (byte) (b7 + 32);
                for (int i8 = i7 + 1; i8 < copyOf.length; i8++) {
                    byte b8 = copyOf[i8];
                    if (b8 >= 65 && b8 <= 90) {
                        copyOf[i8] = (byte) (b8 + 32);
                    }
                }
                return new f(copyOf);
            }
            i7++;
        }
    }

    public byte[] t() {
        byte[] bArr = this.f4799a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        t6.h.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00e8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0120, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0124, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00c8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0163, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x016a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x015c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x019b, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x019e, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01a1, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01a4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008b, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x007a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
        loop0: while (true) {
            if (i8 >= length) {
                break;
            }
            byte b8 = bArr[i8];
            if (b8 >= 0) {
                int i11 = i10 + 1;
                if (i10 == 64) {
                    break;
                }
                if ((b8 != 10 && b8 != 13 && ((b8 >= 0 && b8 < 32) || (Byte.MAX_VALUE <= b8 && b8 < 160))) || b8 == 65533) {
                    break;
                }
                i9 += b8 < 65536 ? 1 : 2;
                i8++;
                while (true) {
                    i10 = i11;
                    if (i8 < length && (b7 = bArr[i8]) >= 0) {
                        i8++;
                        i11 = i10 + 1;
                        if (i10 == 64) {
                            break loop0;
                        }
                        if ((b7 != 10 && b7 != 13 && ((b7 >= 0 && b7 < 32) || (Byte.MAX_VALUE <= b7 && b7 < 160))) || b7 == 65533) {
                            break loop0;
                        }
                        i9 += b7 < 65536 ? 1 : 2;
                    }
                }
            } else if ((b8 >> 5) == -2) {
                int i12 = i8 + 1;
                if (length > i12) {
                    byte b9 = bArr[i12];
                    if ((b9 & 192) == 128) {
                        int i13 = (b9 ^ 3968) ^ (b8 << 6);
                        if (i13 >= 128) {
                            i7 = i10 + 1;
                            if (i10 == 64) {
                                break;
                            }
                            if ((i13 != 10 && i13 != 13 && ((i13 >= 0 && i13 < 32) || (127 <= i13 && i13 < 160))) || i13 == 65533) {
                                break;
                            }
                            i9 += i13 < 65536 ? 1 : 2;
                            i8 += 2;
                            i10 = i7;
                        }
                    }
                }
            } else if ((b8 >> 4) == -2) {
                int i14 = i8 + 2;
                if (length > i14) {
                    byte b10 = bArr[i8 + 1];
                    if ((b10 & 192) == 128) {
                        byte b11 = bArr[i14];
                        if ((b11 & 192) == 128) {
                            int i15 = ((b11 ^ (-123008)) ^ (b10 << 6)) ^ (b8 << 12);
                            if (i15 >= 2048) {
                                if (55296 > i15 || i15 >= 57344) {
                                    i7 = i10 + 1;
                                    if (i10 == 64) {
                                        break;
                                    }
                                    if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                        break;
                                    }
                                    i9 += i15 < 65536 ? 1 : 2;
                                    i8 += 3;
                                    i10 = i7;
                                }
                            }
                        }
                    }
                }
            } else if ((b8 >> 3) == -2) {
                int i16 = i8 + 3;
                if (length > i16) {
                    byte b12 = bArr[i8 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i8 + 2];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i16];
                            if ((b14 & 192) == 128) {
                                int i17 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b8 << 18);
                                if (i17 <= 1114111) {
                                    if (55296 > i17 || i17 >= 57344) {
                                        if (i17 >= 65536) {
                                            i7 = i10 + 1;
                                            if (i10 == 64) {
                                                break;
                                            }
                                            if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                                break;
                                            }
                                            i9 += i17 < 65536 ? 1 : 2;
                                            i8 += 4;
                                            i10 = i7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i9 != -1) {
            String y4 = y();
            String substring = y4.substring(0, i9);
            t6.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String y02 = C6.o.y0(C6.o.y0(C6.o.y0(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i9 >= y4.length()) {
                return "[text=" + y02 + ']';
            }
            return "[size=" + bArr.length + " text=" + y02 + "…]";
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
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            t6.h.d(copyOfRange, "copyOfRange(...)");
            fVar = new f(copyOfRange);
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
        byte[] d7 = d();
        t6.h.e(d7, "<this>");
        String str2 = new String(d7, C6.a.f1581a);
        this.f4801c = str2;
        return str2;
    }

    public void z(d dVar, int i7) {
        t6.h.e(dVar, "buffer");
        dVar.k(this.f4799a, 0, i7);
    }
}
