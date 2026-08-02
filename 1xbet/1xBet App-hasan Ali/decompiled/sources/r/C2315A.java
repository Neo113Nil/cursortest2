package r;

import s.AbstractC2351a;

/* renamed from: r.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2315A {

    /* renamed from: a, reason: collision with root package name */
    public long[] f18899a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f18900b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f18901c;

    /* renamed from: d, reason: collision with root package name */
    public int f18902d;

    /* renamed from: e, reason: collision with root package name */
    public int f18903e;
    public int f;

    public C2315A(int i) {
        this.f18899a = O.f18957a;
        this.f18900b = AbstractC2351a.f19151c;
        this.f18901c = AbstractC2335m.f19017a;
        if (i >= 0) {
            f(O.d(i));
        } else {
            AbstractC2351a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f18903e = 0;
        long[] jArr = this.f18899a;
        if (jArr != O.f18957a) {
            X3.l.C0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f18899a;
            int i = this.f18902d;
            int i5 = i >> 3;
            long j5 = 255 << ((i & 7) << 3);
            jArr2[i5] = (jArr2[i5] & (~j5)) | j5;
        }
        X3.l.B0(this.f18900b, 0, this.f18902d);
        this.f = O.a(this.f18902d) - this.f18903e;
    }

    public final int b(int i) {
        int i5 = this.f18902d;
        int i6 = i & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f18899a;
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

    public final int c(Object obj) {
        long j5;
        long j6;
        long j7;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i5 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.f18902d;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr3 = this.f18899a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j8 = ((jArr3[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr3[i12] >>> i13);
            long j9 = i8;
            int i14 = i8;
            long j10 = j8 ^ (j9 * 72340172838076673L);
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (j11 != 0) {
                int numberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j11) >> 3)) & i9;
                int i15 = i5;
                if (kotlin.jvm.internal.l.a(this.f18900b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j11 &= j11 - 1;
                i5 = i15;
            }
            int i16 = i5;
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int b3 = b(i7);
                long j12 = 255;
                if (this.f != 0 || ((this.f18899a[b3 >> 3] >> ((b3 & 7) << 3)) & 255) == 254) {
                    j5 = 255;
                    j6 = j9;
                    j7 = 128;
                } else {
                    int i17 = this.f18902d;
                    if (i17 > 8) {
                        int i18 = 8;
                        if (Long.compare((this.f18903e * 32) ^ Long.MIN_VALUE, (i17 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f18899a;
                            int i19 = this.f18902d;
                            Object[] objArr2 = this.f18900b;
                            int[] iArr = this.f18901c;
                            j7 = 128;
                            int i20 = (i19 + 7) >> 3;
                            int i21 = 0;
                            while (i21 < i20) {
                                long j13 = j12;
                                long j14 = jArr4[i21] & (-9187201950435737472L);
                                jArr4[i21] = (-72340172838076674L) & ((~j14) + (j14 >>> 7));
                                i21++;
                                i18 = i18;
                                j9 = j9;
                                j12 = j13;
                            }
                            j5 = j12;
                            j6 = j9;
                            int i22 = i18;
                            int F02 = X3.l.F0(jArr4);
                            int i23 = F02 - 1;
                            long j15 = 72057594037927935L;
                            jArr4[i23] = (jArr4[i23] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[F02] = jArr4[0];
                            int i24 = 0;
                            while (i24 != i19) {
                                int i25 = i24 >> 3;
                                int i26 = (i24 & 7) << 3;
                                long j16 = (jArr4[i25] >> i26) & j5;
                                if (j16 != 128 && j16 == 254) {
                                    Object obj2 = objArr2[i24];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i16;
                                    int i27 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int b5 = b(i27);
                                    int i28 = i27 & i19;
                                    long j17 = j15;
                                    if (((b5 - i28) & i19) / 8 == ((i24 - i28) & i19) / i22) {
                                        jArr4[i25] = ((r8 & 127) << i26) | (jArr4[i25] & (~(j5 << i26)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j17) | Long.MIN_VALUE;
                                        i24++;
                                        j15 = j17;
                                        i22 = i22;
                                    } else {
                                        int i29 = i22;
                                        int i30 = b5 >> 3;
                                        long j18 = jArr4[i30];
                                        int i31 = (b5 & 7) << 3;
                                        if (((j18 >> i31) & j5) == 128) {
                                            i = i19;
                                            objArr = objArr2;
                                            jArr4[i30] = ((~(j5 << i31)) & j18) | ((r8 & 127) << i31);
                                            jArr4[i25] = (jArr4[i25] & (~(j5 << i26))) | (128 << i26);
                                            objArr[b5] = objArr[i24];
                                            objArr[i24] = null;
                                            iArr[b5] = iArr[i24];
                                            iArr[i24] = 0;
                                        } else {
                                            i = i19;
                                            objArr = objArr2;
                                            jArr4[i30] = ((r8 & 127) << i31) | ((~(j5 << i31)) & j18);
                                            Object obj3 = objArr[b5];
                                            objArr[b5] = objArr[i24];
                                            objArr[i24] = obj3;
                                            int i32 = iArr[b5];
                                            iArr[b5] = iArr[i24];
                                            iArr[i24] = i32;
                                            i24--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j17) | Long.MIN_VALUE;
                                        i24++;
                                        i19 = i;
                                        j15 = j17;
                                        i22 = i29;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i24++;
                                }
                            }
                            this.f = O.a(this.f18902d) - this.f18903e;
                            b3 = b(i7);
                        }
                    }
                    j5 = 255;
                    j6 = j9;
                    j7 = 128;
                    int b6 = O.b(this.f18902d);
                    long[] jArr5 = this.f18899a;
                    Object[] objArr3 = this.f18900b;
                    int[] iArr2 = this.f18901c;
                    int i33 = this.f18902d;
                    f(b6);
                    long[] jArr6 = this.f18899a;
                    Object[] objArr4 = this.f18900b;
                    int[] iArr3 = this.f18901c;
                    int i34 = this.f18902d;
                    int i35 = 0;
                    while (i35 < i33) {
                        if (((jArr5[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i35];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i16;
                            int i36 = hashCode3 ^ (hashCode3 << 16);
                            int b7 = b(i36 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j19 = i36 & 127;
                            int i37 = b7 >> 3;
                            int i38 = (b7 & 7) << 3;
                            long j20 = (jArr[i37] & (~(255 << i38))) | (j19 << i38);
                            jArr[i37] = j20;
                            jArr[(((b7 - 7) & i34) + (i34 & 7)) >> 3] = j20;
                            objArr4[b7] = obj4;
                            iArr3[b7] = iArr2[i35];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i35++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    b3 = b(i7);
                }
                this.f18903e++;
                int i39 = this.f;
                long[] jArr7 = this.f18899a;
                int i40 = b3 >> 3;
                long j21 = jArr7[i40];
                int i41 = (b3 & 7) << 3;
                this.f = i39 - (((j21 >> i41) & j5) == j7 ? 1 : 0);
                int i42 = this.f18902d;
                long j22 = (j21 & (~(j5 << i41))) | (j6 << i41);
                jArr7[i40] = j22;
                jArr7[(((b3 - 7) & i42) + (i42 & 7)) >> 3] = j22;
                return ~b3;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
            i8 = i14;
            i5 = i16;
        }
    }

    public final int d(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f18902d;
        int i8 = i5 >>> 7;
        while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.f18899a;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j5 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (i6 * 72340172838076673L) ^ j5;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i9) & i7;
                if (kotlin.jvm.internal.l.a(this.f18900b[numberOfTrailingZeros], obj)) {
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

    public final int e(Object obj) {
        int d5 = d(obj);
        if (d5 >= 0) {
            return this.f18901c[d5];
        }
        AbstractC2351a.e("There is no key " + obj + " in the map");
        throw null;
    }

    public final boolean equals(Object obj) {
        boolean z3;
        boolean z5;
        boolean z6 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2315A)) {
            return false;
        }
        C2315A c2315a = (C2315A) obj;
        if (c2315a.f18903e != this.f18903e) {
            return false;
        }
        Object[] objArr = this.f18900b;
        int[] iArr = this.f18901c;
        long[] jArr = this.f18899a;
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
                        Object obj2 = objArr[i7];
                        int i8 = iArr[i7];
                        int d5 = c2315a.d(obj2);
                        if (d5 < 0) {
                            break loop0;
                        }
                        z5 = z6;
                        if (i8 != c2315a.f18901c[d5]) {
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

    public final void f(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, O.c(i)) : 0;
        this.f18902d = max;
        if (max == 0) {
            jArr = O.f18957a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            X3.l.C0(jArr, -9187201950435737472L);
        }
        this.f18899a = jArr;
        int i5 = max >> 3;
        long j5 = 255 << ((max & 7) << 3);
        jArr[i5] = (jArr[i5] & (~j5)) | j5;
        this.f = O.a(this.f18902d) - this.f18903e;
        this.f18900b = new Object[max];
        this.f18901c = new int[max];
    }

    public final void g(int i) {
        this.f18903e--;
        long[] jArr = this.f18899a;
        int i5 = this.f18902d;
        int i6 = i >> 3;
        int i7 = (i & 7) << 3;
        long j5 = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        jArr[i6] = j5;
        jArr[(((i - 7) & i5) + (i5 & 7)) >> 3] = j5;
        this.f18900b[i] = null;
    }

    public final void h(int i, Object obj) {
        int c5 = c(obj);
        if (c5 < 0) {
            c5 = ~c5;
        }
        this.f18900b[c5] = obj;
        this.f18901c[c5] = i;
    }

    public final int hashCode() {
        Object[] objArr = this.f18900b;
        int[] iArr = this.f18901c;
        long[] jArr = this.f18899a;
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
                        Object obj = objArr[i8];
                        i5 += iArr[i8] ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f18903e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f18900b;
        int[] iArr = this.f18901c;
        long[] jArr = this.f18899a;
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
                            Object obj = objArr[i8];
                            int i9 = iArr[i8];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i9);
                            i5++;
                            if (i5 < this.f18903e) {
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

    public /* synthetic */ C2315A() {
        this(6);
    }
}
