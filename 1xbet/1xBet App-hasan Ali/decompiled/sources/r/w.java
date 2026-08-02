package r;

import s.AbstractC2351a;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public long[] f19052a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f19053b;

    /* renamed from: c, reason: collision with root package name */
    public int f19054c;

    /* renamed from: d, reason: collision with root package name */
    public int f19055d;

    /* renamed from: e, reason: collision with root package name */
    public int f19056e;

    public w(int i) {
        this.f19052a = O.f18957a;
        this.f19053b = AbstractC2335m.f19017a;
        if (i >= 0) {
            d(O.d(i));
        } else {
            AbstractC2351a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        r21 = r12;
        r4 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        if (((((~r8) << 6) & r8) & r21) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        r3 = c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        if (r38.f19056e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        if (((r38.f19052a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        r3 = r38.f19054c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (r3 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        r23 = 128;
        r25 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c8, code lost:
    
        if (java.lang.Long.compare((r38.f19055d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        r3 = r38.f19052a;
        r6 = r38.f19054c;
        r7 = r38.f19053b;
        r8 = (r6 + 7) >> 3;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
    
        if (r9 >= r8) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        r12 = r3[r9] & r21;
        r3[r9] = (-72340172838076674L) & ((~r12) + (r12 >>> 7));
        r9 = r9 + 1;
        r15 = r15;
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f3, code lost:
    
        r29 = r14;
        r18 = r15;
        r8 = X3.l.F0(r3);
        r9 = r8 - 1;
        r14 = 72057594037927935L;
        r3[r9] = (r3[r9] & 72057594037927935L) | (-72057594037927936L);
        r3[r8] = r3[0];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0111, code lost:
    
        if (r8 == r6) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0113, code lost:
    
        r9 = r8 >> 3;
        r21 = (r8 & 7) << 3;
        r12 = (r3[r9] >> r21) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0121, code lost:
    
        if (r12 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0128, code lost:
    
        if (r12 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012b, code lost:
    
        r12 = r7[r8] * r29;
        r13 = (r12 ^ (r12 << 16)) >>> 7;
        r22 = c(r13);
        r13 = r13 & r6;
        r31 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0146, code lost:
    
        if ((((r22 - r13) & r6) / 8) != (((r8 - r13) & r6) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0148, code lost:
    
        r34 = r14;
        r3[r9] = ((r12 & 127) << r21) | (r3[r9] & (~(255 << r21)));
        r3[r3.length - 1] = (r3[0] & r34) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r4 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0168, code lost:
    
        r14 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016b, code lost:
    
        r34 = r14;
        r4 = r22 >> 3;
        r13 = r3[r4];
        r15 = (r22 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017b, code lost:
    
        if (((r13 >> r15) & 255) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017d, code lost:
    
        r30 = r6;
        r32 = r7;
        r3[r4] = ((~(255 << r15)) & r13) | ((r12 & 127) << r15);
        r3[r9] = (r3[r9] & (~(255 << r21))) | (128 << r21);
        r32[r22] = r32[r8];
        r32[r8] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01bd, code lost:
    
        r3[r3.length - 1] = (r3[0] & r34) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r6 = r30;
        r4 = r31;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a1, code lost:
    
        r30 = r6;
        r32 = r7;
        r3[r4] = ((~(255 << r15)) & r13) | ((r12 & 127) << r15);
        r4 = r32[r22];
        r32[r22] = r32[r8];
        r32[r8] = r4;
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0123, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d1, code lost:
    
        r38.f19056e = r.O.a(r38.f19054c) - r38.f19055d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0254, code lost:
    
        r3 = c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0258, code lost:
    
        r38.f19055d++;
        r4 = r38.f19056e;
        r5 = r38.f19052a;
        r6 = r3 >> 3;
        r7 = r5[r6];
        r9 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0270, code lost:
    
        if (((r7 >> r9) & r25) != r23) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0272, code lost:
    
        r12 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0277, code lost:
    
        r38.f19056e = r4 - r12;
        r4 = r38.f19054c;
        r7 = (r7 & (~(r25 << r9))) | (r10 << r9);
        r5[r6] = r7;
        r5[(((r3 - 7) & r4) + (r4 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0275, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01de, code lost:
    
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ea, code lost:
    
        r3 = r.O.b(r38.f19054c);
        r4 = r38.f19052a;
        r6 = r38.f19053b;
        r7 = r38.f19054c;
        d(r3);
        r3 = r38.f19052a;
        r8 = r38.f19053b;
        r9 = r38.f19054c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0201, code lost:
    
        if (r12 >= r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0210, code lost:
    
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & r25) >= r23) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0212, code lost:
    
        r13 = r6[r12];
        r14 = r13 * r14;
        r14 = r14 ^ (r14 << 16);
        r15 = c(r14 >>> 7);
        r20 = r3;
        r19 = r4;
        r3 = r14 & 127;
        r14 = r15 >> 3;
        r21 = (r15 & 7) << 3;
        r3 = (r20[r14] & (~(r25 << r21))) | (r3 << r21);
        r20[r14] = r3;
        r20[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x024d, code lost:
    
        r12 = r12 + 1;
        r4 = r19;
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0249, code lost:
    
        r20 = r3;
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e3, code lost:
    
        r25 = 255;
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009e, code lost:
    
        r25 = 255;
        r18 = true;
        r23 = 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [int] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i) {
        int c5;
        boolean z3;
        int i5 = this.f19055d;
        int i6 = -862048943;
        int i7 = i * (-862048943);
        int i8 = i7 ^ (i7 << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f19054c;
        int i12 = i9 & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f19052a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            boolean z5 = true;
            int i16 = i13;
            long j5 = (((-i15) >> 63) & (jArr[i14 + 1] << (64 - i15))) | (jArr[i14] >>> i15);
            long j6 = i10;
            int i17 = i6;
            int i18 = i10;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = -9187201950435737472L;
            long j9 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j9 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j9) >> 3)) & i11;
                long j10 = j8;
                if (this.f19053b[numberOfTrailingZeros] == i) {
                    c5 = numberOfTrailingZeros;
                    z3 = true;
                    break loop0;
                }
                j9 &= j9 - 1;
                j8 = j10;
            }
            i13 = i16 + 8;
            i12 = (i12 + i13) & i11;
            i10 = i18;
            i6 = i17;
        }
        this.f19053b[c5] = i;
        if (this.f19055d != i5) {
            return z3;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i) {
        int i5;
        int i6 = (-862048943) * i;
        int i7 = i6 ^ (i6 << 16);
        int i8 = i7 & 127;
        int i9 = this.f19054c;
        int i10 = (i7 >>> 7) & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr = this.f19052a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j5 = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j6 = (i8 * 72340172838076673L) ^ j5;
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                i5 = ((Long.numberOfTrailingZeros(j7) >> 3) + i10) & i9;
                if (this.f19053b[i5] == i) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
        }
        return i5 >= 0;
    }

    public final int c(int i) {
        int i5 = this.f19054c;
        int i6 = i & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f19052a;
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

    public final void d(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, O.c(i)) : 0;
        this.f19054c = max;
        if (max == 0) {
            jArr = O.f18957a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            X3.l.C0(jArr, -9187201950435737472L);
        }
        this.f19052a = jArr;
        int i5 = max >> 3;
        long j5 = 255 << ((max & 7) << 3);
        jArr[i5] = (jArr[i5] & (~j5)) | j5;
        this.f19056e = O.a(this.f19054c) - this.f19055d;
        this.f19053b = new int[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(int i) {
        int i5;
        int i6 = (-862048943) * i;
        int i7 = i6 ^ (i6 << 16);
        int i8 = i7 & 127;
        int i9 = this.f19054c;
        int i10 = (i7 >>> 7) & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr = this.f19052a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j5 = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j6 = (i8 * 72340172838076673L) ^ j5;
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                i5 = ((Long.numberOfTrailingZeros(j7) >> 3) + i10) & i9;
                if (this.f19053b[i5] == i) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
        }
        boolean z3 = i5 >= 0;
        if (z3) {
            f(i5);
        }
        return z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (wVar.f19055d != this.f19055d) {
            return false;
        }
        int[] iArr = this.f19053b;
        long[] jArr = this.f19052a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j5 = jArr[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j5) < 128 && !wVar.b(iArr[(i << 3) + i6])) {
                            return false;
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
        }
        return true;
    }

    public final void f(int i) {
        this.f19055d--;
        long[] jArr = this.f19052a;
        int i5 = this.f19054c;
        int i6 = i >> 3;
        int i7 = (i & 7) << 3;
        long j5 = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        jArr[i6] = j5;
        jArr[(((i - 7) & i5) + (i5 & 7)) >> 3] = j5;
    }

    public final int hashCode() {
        int[] iArr = this.f19053b;
        long[] jArr = this.f19052a;
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
                        i5 += iArr[(i << 3) + i7];
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
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f19053b;
        long[] jArr = this.f19052a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i5 = 0;
            loop0: while (true) {
                long j5 = jArr[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            int i8 = iArr[(i << 3) + i7];
                            if (i5 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i5 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(i8);
                            i5++;
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
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }

    public /* synthetic */ w() {
        this(6);
    }
}
