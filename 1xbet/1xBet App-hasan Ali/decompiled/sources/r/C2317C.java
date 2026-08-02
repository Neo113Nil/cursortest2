package r;

import s.AbstractC2351a;

/* renamed from: r.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2317C {

    /* renamed from: a, reason: collision with root package name */
    public long[] f18906a = O.f18957a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f18907b = AbstractC2351a.f19151c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f18908c = AbstractC2337o.f19028a;

    /* renamed from: d, reason: collision with root package name */
    public int f18909d;

    /* renamed from: e, reason: collision with root package name */
    public int f18910e;
    public int f;

    public C2317C(int i) {
        if (i >= 0) {
            d(O.d(i));
        } else {
            AbstractC2351a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i) {
        int i5 = this.f18909d;
        int i6 = i & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f18906a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j5 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j6 = j5 & ((~j5) << 7) & (-9187201950435737472L);
            if (j6 != 0) {
                return (i6 + (Long.numberOfTrailingZeros(j6) >> 3)) & i5;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final int b(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f18909d;
        int i8 = i5 >>> 7;
        while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.f18906a;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j5 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (i6 * 72340172838076673L) ^ j5;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i9) & i7;
                if (kotlin.jvm.internal.l.a(this.f18907b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i8 = i9 + i;
        }
    }

    public final long c(Object obj) {
        int b3 = b(obj);
        if (b3 >= 0) {
            return this.f18908c[b3];
        }
        AbstractC2351a.e("There is no key " + obj + " in the map");
        throw null;
    }

    public final void d(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, O.c(i)) : 0;
        this.f18909d = max;
        if (max == 0) {
            jArr = O.f18957a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            X3.l.C0(jArr, -9187201950435737472L);
        }
        this.f18906a = jArr;
        int i5 = max >> 3;
        long j5 = 255 << ((max & 7) << 3);
        jArr[i5] = (jArr[i5] & (~j5)) | j5;
        this.f = O.a(this.f18909d) - this.f18910e;
        this.f18907b = new Object[max];
        this.f18908c = new long[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        r2 = a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        if (r39.f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        if (((r39.f18906a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        r2 = r39.f18909d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if (r2 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        r8 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c5, code lost:
    
        if (java.lang.Long.compare((r39.f18910e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c7, code lost:
    
        r2 = r39.f18906a;
        r3 = r39.f18909d;
        r5 = r39.f18907b;
        r6 = r39.f18908c;
        r13 = (r3 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d6, code lost:
    
        if (r7 >= r13) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
    
        r10 = r8;
        r8 = r2[r7] & (-9187201950435737472L);
        r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> r10));
        r7 = r7 + 1;
        r8 = r10;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f3, code lost:
    
        r12 = r8;
        r31 = r9;
        r29 = 128;
        r7 = X3.l.F0(r2);
        r8 = r7 - 1;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0112, code lost:
    
        if (r7 == r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0114, code lost:
    
        r8 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r11) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0121, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0128, code lost:
    
        if (r9 == 254) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012b, code lost:
    
        r9 = r5[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012d, code lost:
    
        if (r9 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012f, code lost:
    
        r9 = r9.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0135, code lost:
    
        r9 = r9 * r21;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r13 = a(r10);
        r10 = r10 & r3;
        r33 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014e, code lost:
    
        if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0175, code lost:
    
        r18 = r14;
        r34 = r15;
        r10 = r13 >> 3;
        r14 = r2[r10];
        r12 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0187, code lost:
    
        if (((r14 >> r12) & 255) != 128) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0189, code lost:
    
        r35 = r5;
        r36 = r6;
        r2[r10] = ((~(255 << r12)) & r14) | ((r9 & 127) << r12);
        r2[r8] = (r2[r8] & (~(255 << r11))) | (128 << r11);
        r35[r13] = r35[r7];
        r35[r7] = null;
        r36[r13] = r36[r7];
        r36[r7] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d5, code lost:
    
        r2[r2.length - 1] = (r2[r34] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r18;
        r12 = r33;
        r15 = r34;
        r5 = r35;
        r6 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b4, code lost:
    
        r35 = r5;
        r36 = r6;
        r2[r10] = ((r9 & 127) << r12) | ((~(255 << r12)) & r14);
        r5 = r35[r13];
        r35[r13] = r35[r7];
        r35[r7] = r5;
        r5 = r36[r13];
        r36[r13] = r36[r7];
        r36[r7] = r5;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0150, code lost:
    
        r34 = r15;
        r2[r8] = ((r9 & 127) << r11) | (r2[r8] & (~(255 << r11)));
        r2[r2.length - 1] = (r2[r34] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r14;
        r12 = r33;
        r15 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0134, code lost:
    
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0123, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ee, code lost:
    
        r18 = r14;
        r34 = r15;
        r39.f = r.O.a(r39.f18909d) - r39.f18910e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0283, code lost:
    
        r2 = a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0287, code lost:
    
        r39.f18910e++;
        r1 = r39.f;
        r3 = r39.f18906a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x029f, code lost:
    
        if (((r5 >> r7) & 255) != r29) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02a2, code lost:
    
        r18 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a4, code lost:
    
        r39.f = r1 - r18;
        r1 = r39.f18909d;
        r5 = (r5 & (~(255 << r7))) | (r31 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0203, code lost:
    
        r31 = r9;
        r18 = 1;
        r34 = 0;
        r29 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x020f, code lost:
    
        r2 = r.O.b(r39.f18909d);
        r3 = r39.f18906a;
        r5 = r39.f18907b;
        r6 = r39.f18908c;
        r7 = r39.f18909d;
        d(r2);
        r2 = r39.f18906a;
        r8 = r39.f18907b;
        r9 = r39.f18908c;
        r10 = r39.f18909d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x022a, code lost:
    
        if (r11 >= r7) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0239, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= 128) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x023b, code lost:
    
        r12 = r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x023d, code lost:
    
        if (r12 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x023f, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0246, code lost:
    
        r13 = r13 * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = a(r13 >>> 7);
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r16 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r16))) | (r1 << r16);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x027d, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0244, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x027c, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x009e, code lost:
    
        r31 = r9;
        r18 = 1;
        r34 = 0;
        r29 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j5, Object obj) {
        int i;
        int i5;
        Object obj2 = obj;
        int i6 = -862048943;
        int hashCode = obj2.hashCode() * (-862048943);
        int i7 = hashCode ^ (hashCode << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.f18909d;
        int i11 = i8 & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f18906a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            int i15 = 1;
            int i16 = i12;
            int i17 = 0;
            long j6 = (((-i14) >> 63) & (jArr[i13 + 1] << (64 - i14))) | (jArr[i13] >>> i14);
            long j7 = i9;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (true) {
                if (j9 == 0) {
                    break;
                }
                i5 = ((Long.numberOfTrailingZeros(j9) >> 3) + i11) & i10;
                int i18 = i6;
                if (kotlin.jvm.internal.l.a(this.f18907b[i5], obj2)) {
                    break loop0;
                }
                j9 &= j9 - 1;
                i6 = i18;
            }
            i12 = i16 + 8;
            i11 = (i11 + i12) & i10;
            obj2 = obj;
            i6 = i;
        }
        if (i5 < 0) {
            i5 = ~i5;
        }
        this.f18907b[i5] = obj;
        this.f18908c[i5] = j5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2317C)) {
            return false;
        }
        C2317C c2317c = (C2317C) obj;
        if (c2317c.f18910e != this.f18910e) {
            return false;
        }
        Object[] objArr = this.f18907b;
        long[] jArr = this.f18908c;
        long[] jArr2 = this.f18906a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j5 = jArr2[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j5) < 128) {
                            int i7 = (i << 3) + i6;
                            Object obj2 = objArr[i7];
                            long j6 = jArr[i7];
                            int b3 = c2317c.b(obj2);
                            if (b3 < 0 || j6 != c2317c.f18908c[b3]) {
                                break loop0;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i5;
        Object[] objArr = this.f18907b;
        long[] jArr = this.f18908c;
        long[] jArr2 = this.f18906a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            long j5 = jArr2[i6];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i6 - length)) >>> 31);
                int i9 = 0;
                while (i9 < i8) {
                    if ((255 & j5) < 128) {
                        int i10 = (i6 << 3) + i9;
                        Object obj = objArr[i10];
                        long j6 = jArr[i10];
                        i5 = i6;
                        i7 += ((int) (j6 ^ (j6 >>> 32))) ^ (obj != null ? obj.hashCode() : 0);
                    } else {
                        i5 = i6;
                    }
                    j5 >>= 8;
                    i9++;
                    i6 = i5;
                }
                int i11 = i6;
                if (i8 != 8) {
                    return i7;
                }
                i = i11;
            } else {
                i = i6;
            }
            if (i == length) {
                return i7;
            }
            i6 = i + 1;
        }
    }

    public final String toString() {
        int i;
        int i5;
        if (this.f18910e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f18907b;
        long[] jArr = this.f18908c;
        long[] jArr2 = this.f18906a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                long j5 = jArr2[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((255 & j5) < 128) {
                            int i10 = (i6 << 3) + i9;
                            Object obj = objArr[i10];
                            i5 = i6;
                            long j6 = jArr[i10];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j6);
                            i7++;
                            if (i7 < this.f18910e) {
                                sb.append(", ");
                            }
                        } else {
                            i5 = i6;
                        }
                        j5 >>= 8;
                        i9++;
                        i6 = i5;
                    }
                    int i11 = i6;
                    if (i8 != 8) {
                        break;
                    }
                    i = i11;
                } else {
                    i = i6;
                }
                if (i == length) {
                    break;
                }
                i6 = i + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }
}
