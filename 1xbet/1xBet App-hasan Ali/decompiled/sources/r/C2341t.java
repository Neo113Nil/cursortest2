package r;

import s.AbstractC2351a;

/* renamed from: r.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2341t {

    /* renamed from: a, reason: collision with root package name */
    public long[] f19045a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f19046b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f19047c;

    /* renamed from: d, reason: collision with root package name */
    public int f19048d;

    /* renamed from: e, reason: collision with root package name */
    public int f19049e;
    public int f;

    public C2341t(int i) {
        this.f19045a = O.f18957a;
        int[] iArr = AbstractC2335m.f19017a;
        this.f19046b = iArr;
        this.f19047c = iArr;
        if (i >= 0) {
            e(O.d(i));
        } else {
            AbstractC2351a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f19049e = 0;
        long[] jArr = this.f19045a;
        if (jArr != O.f18957a) {
            X3.l.C0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f19045a;
            int i = this.f19048d;
            int i5 = i >> 3;
            long j5 = 255 << ((i & 7) << 3);
            jArr2[i5] = (jArr2[i5] & (~j5)) | j5;
        }
        this.f = O.a(this.f19048d) - this.f19049e;
    }

    public final int b(int i) {
        int i5 = this.f19048d;
        int i6 = i & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f19045a;
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

    public final int c(int i) {
        int i5 = (-862048943) * i;
        int i6 = i5 ^ (i5 << 16);
        int i7 = i6 & 127;
        int i8 = this.f19048d;
        int i9 = (i6 >>> 7) & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f19045a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j5 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j6 = (i7 * 72340172838076673L) ^ j5;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i9) & i8;
                if (this.f19046b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
        }
    }

    public final int d(int i) {
        int c5 = c(i);
        if (c5 >= 0) {
            return this.f19047c[c5];
        }
        return -1;
    }

    public final void e(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, O.c(i)) : 0;
        this.f19048d = max;
        if (max == 0) {
            jArr = O.f18957a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            X3.l.C0(jArr, -9187201950435737472L);
        }
        this.f19045a = jArr;
        int i5 = max >> 3;
        long j5 = 255 << ((max & 7) << 3);
        jArr[i5] = (jArr[i5] & (~j5)) | j5;
        this.f = O.a(this.f19048d) - this.f19049e;
        this.f19046b = new int[max];
        this.f19047c = new int[max];
    }

    public final boolean equals(Object obj) {
        boolean z3;
        boolean z5;
        boolean z6 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2341t)) {
            return false;
        }
        C2341t c2341t = (C2341t) obj;
        if (c2341t.f19049e != this.f19049e) {
            return false;
        }
        int[] iArr = this.f19046b;
        int[] iArr2 = this.f19047c;
        long[] jArr = this.f19045a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j5 = jArr[i];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((255 & j5) < 128) {
                        int i7 = (i << 3) + i6;
                        int i8 = iArr[i7];
                        int i9 = iArr2[i7];
                        int c5 = c2341t.c(i8);
                        if (c5 < 0) {
                            break loop0;
                        }
                        z5 = z6;
                        if (i9 != c2341t.f19047c[c5]) {
                            break loop0;
                        }
                    } else {
                        z5 = z6;
                    }
                    j5 >>= 8;
                    i6++;
                    z6 = z5;
                }
                z3 = z6;
                if (i5 != 8) {
                    return z3;
                }
            } else {
                z3 = z6;
            }
            if (i == length) {
                return z3;
            }
            i++;
            z6 = z3;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        r20 = r11;
        r3 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (((((~r7) << 6) & r7) & r20) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        r2 = b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r37.f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (((r37.f19045a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        r2 = r37.f19048d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if (r2 <= 8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        r22 = 128;
        r24 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        if (java.lang.Long.compare((r37.f19049e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        r2 = r37.f19045a;
        r5 = r37.f19048d;
        r6 = r37.f19046b;
        r7 = r37.f19047c;
        r8 = (r5 + 7) >> 3;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        if (r11 >= r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d4, code lost:
    
        r17 = r13;
        r13 = r2[r11] & r20;
        r2[r11] = ((~r13) + (r13 >>> 7)) & (-72340172838076674L);
        r11 = r11 + 1;
        r14 = r14;
        r13 = r17;
        r4 = r4;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f5, code lost:
    
        r28 = r4;
        r17 = r13;
        r12 = r14;
        r3 = X3.l.F0(r2);
        r4 = r3 - 1;
        r2[r4] = (r2[r4] & 72057594037927935L) | (-72057594037927936L);
        r2[r3] = r2[0];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0116, code lost:
    
        if (r3 == r5) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0118, code lost:
    
        r4 = r3 >> 3;
        r8 = (r3 & 7) << 3;
        r13 = (r2[r4] >> r8) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0125, code lost:
    
        if (r13 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012c, code lost:
    
        if (r13 == 254) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012f, code lost:
    
        r11 = r6[r3] * r17;
        r13 = (r11 ^ (r11 << 16)) >>> 7;
        r14 = b(r13);
        r13 = r13 & r5;
        r31 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014a, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r3 - r13) & r5) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014c, code lost:
    
        r2[r4] = ((~(255 << r8)) & r2[r4]) | ((r11 & 127) << r8);
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016a, code lost:
    
        r12 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016d, code lost:
    
        r30 = r3;
        r3 = r14 >> 3;
        r12 = r2[r3];
        r4 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017f, code lost:
    
        if (((r12 >> r4) & 255) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0181, code lost:
    
        r2[r3] = ((~(255 << r4)) & r12) | ((r11 & 127) << r4);
        r2[r4] = (r2[r4] & (~(255 << r8))) | (128 << r8);
        r6[r14] = r6[r30];
        r6[r30] = 0;
        r7[r14] = r7[r30];
        r7[r30] = 0;
        r3 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d1, code lost:
    
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ad, code lost:
    
        r2[r3] = ((~(255 << r4)) & r12) | ((r11 & 127) << r4);
        r3 = r6[r14];
        r6[r14] = r6[r30];
        r6[r30] = r3;
        r3 = r7[r14];
        r7[r14] = r7[r30];
        r7[r30] = r3;
        r3 = r30 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0127, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01df, code lost:
    
        r31 = r12;
        r37.f = r.O.a(r37.f19048d) - r37.f19049e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x026e, code lost:
    
        r2 = b(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0272, code lost:
    
        r37.f19049e++;
        r1 = r37.f;
        r3 = r37.f19045a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x028a, code lost:
    
        if (((r5 >> r7) & r24) != r22) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x028d, code lost:
    
        r31 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x028f, code lost:
    
        r37.f = r1 - r31;
        r1 = r37.f19048d;
        r5 = (r5 & (~(r24 << r7))) | (r9 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f0, code lost:
    
        r28 = r4;
        r31 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01fe, code lost:
    
        r2 = r.O.b(r37.f19048d);
        r3 = r37.f19045a;
        r4 = r37.f19046b;
        r5 = r37.f19047c;
        r6 = r37.f19048d;
        e(r2);
        r2 = r37.f19045a;
        r7 = r37.f19046b;
        r8 = r37.f19047c;
        r11 = r37.f19048d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0218, code lost:
    
        if (r12 >= r6) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0228, code lost:
    
        if (((r3[r12 >> 3] >> ((r12 & 7) << 3)) & r24) >= r22) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x022a, code lost:
    
        r13 = r4[r12];
        r14 = r13 * r13;
        r14 = r14 ^ (r14 << 16);
        r15 = b(r14 >>> 7);
        r19 = r2;
        r1 = r14 & 127;
        r14 = r15 >> 3;
        r20 = (r15 & 7) << 3;
        r1 = (r19[r14] & (~(r24 << r20))) | (r1 << r20);
        r19[r14] = r1;
        r19[(((r15 - 7) & r11) + (r11 & 7)) >> 3] = r1;
        r7[r15] = r13;
        r8[r15] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0266, code lost:
    
        r12 = r12 + 1;
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0264, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f7, code lost:
    
        r24 = 255;
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0099, code lost:
    
        r24 = 255;
        r31 = 1;
        r22 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i, int i5) {
        int i6;
        int i7 = i;
        int i8 = -862048943;
        int i9 = i7 * (-862048943);
        int i10 = i9 ^ (i9 << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f19048d;
        int i14 = i11 & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f19045a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            int i18 = 1;
            int i19 = i15;
            long j5 = (((-i17) >> 63) & (jArr[i16 + 1] << (64 - i17))) | (jArr[i16] >>> i17);
            long j6 = i12;
            int i20 = i8;
            int i21 = i12;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = -9187201950435737472L;
            long j9 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j9 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j9) >> 3)) & i13;
                long j10 = j8;
                if (this.f19046b[numberOfTrailingZeros] == i7) {
                    i6 = numberOfTrailingZeros;
                    break loop0;
                } else {
                    j9 &= j9 - 1;
                    j8 = j10;
                }
            }
            i15 = i19 + 8;
            i14 = (i14 + i15) & i13;
            i8 = i20;
            i12 = i21;
            i7 = i;
        }
        if (i6 < 0) {
            i6 = ~i6;
        }
        this.f19046b[i6] = i;
        this.f19047c[i6] = i5;
    }

    public final int hashCode() {
        int[] iArr = this.f19046b;
        int[] iArr2 = this.f19047c;
        long[] jArr = this.f19045a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i5 = 0;
        while (true) {
            long j5 = jArr[i];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        int i8 = (i << 3) + i7;
                        i5 += iArr2[i8] ^ iArr[i8];
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return i5;
                }
            }
            if (i == length) {
                return i5;
            }
            i++;
        }
    }

    public final String toString() {
        if (this.f19049e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f19046b;
        int[] iArr2 = this.f19047c;
        long[] jArr = this.f19045a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i5 = 0;
            while (true) {
                long j5 = jArr[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            int i8 = (i << 3) + i7;
                            int i9 = iArr[i8];
                            int i10 = iArr2[i8];
                            sb.append(i9);
                            sb.append("=");
                            sb.append(i10);
                            i5++;
                            if (i5 < this.f19049e) {
                                sb.append(", ");
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }

    public /* synthetic */ C2341t() {
        this(6);
    }
}
