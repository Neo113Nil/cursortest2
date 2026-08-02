package r;

import s.AbstractC2351a;

/* renamed from: r.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2322H {

    /* renamed from: a, reason: collision with root package name */
    public long[] f18933a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f18934b;

    /* renamed from: c, reason: collision with root package name */
    public int f18935c;

    /* renamed from: d, reason: collision with root package name */
    public int f18936d;

    /* renamed from: e, reason: collision with root package name */
    public int f18937e;

    public C2322H(int i) {
        this.f18933a = O.f18957a;
        this.f18934b = AbstractC2351a.f19151c;
        if (i >= 0) {
            f(O.d(i));
        } else {
            AbstractC2351a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.f18936d;
        this.f18934b[d(obj)] = obj;
        return this.f18936d != i;
    }

    public final void b() {
        this.f18936d = 0;
        long[] jArr = this.f18933a;
        if (jArr != O.f18957a) {
            X3.l.C0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f18933a;
            int i = this.f18935c;
            int i5 = i >> 3;
            long j5 = 255 << ((i & 7) << 3);
            jArr2[i5] = (jArr2[i5] & (~j5)) | j5;
        }
        X3.l.B0(this.f18934b, 0, this.f18935c);
        this.f18937e = O.a(this.f18935c) - this.f18936d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f18935c;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f18933a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j5 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (i6 * 72340172838076673L) ^ j5;
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                if (kotlin.jvm.internal.l.a(this.f18934b[i], obj)) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        return i >= 0;
    }

    public final int d(Object obj) {
        long j5;
        long j6;
        long j7;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i5;
        int i6 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = hashCode ^ (hashCode << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.f18935c;
        int i11 = i8 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr3 = this.f18933a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j8 = ((jArr3[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr3[i13] >>> i14);
            long j9 = i9;
            int i15 = i9;
            long j10 = j8 ^ (j9 * 72340172838076673L);
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (j11 != 0) {
                int numberOfTrailingZeros = (i11 + (Long.numberOfTrailingZeros(j11) >> 3)) & i10;
                int i16 = i6;
                if (kotlin.jvm.internal.l.a(this.f18934b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j11 &= j11 - 1;
                i6 = i16;
            }
            int i17 = i6;
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int e3 = e(i8);
                long j12 = 255;
                if (this.f18937e != 0 || ((this.f18933a[e3 >> 3] >> ((e3 & 7) << 3)) & 255) == 254) {
                    j5 = 255;
                    j6 = j9;
                    j7 = 128;
                } else {
                    int i18 = this.f18935c;
                    if (i18 > 8) {
                        int i19 = 8;
                        if (Long.compare((this.f18936d * 32) ^ Long.MIN_VALUE, (i18 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f18933a;
                            int i20 = this.f18935c;
                            Object[] objArr2 = this.f18934b;
                            int i21 = (i20 + 7) >> 3;
                            int i22 = 0;
                            j7 = 128;
                            while (i22 < i21) {
                                long j13 = j12;
                                long j14 = jArr4[i22] & (-9187201950435737472L);
                                jArr4[i22] = (-72340172838076674L) & ((~j14) + (j14 >>> 7));
                                i22++;
                                i19 = i19;
                                j9 = j9;
                                j12 = j13;
                            }
                            j5 = j12;
                            j6 = j9;
                            int i23 = i19;
                            int F02 = X3.l.F0(jArr4);
                            int i24 = F02 - 1;
                            long j15 = 72057594037927935L;
                            jArr4[i24] = (jArr4[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[F02] = jArr4[0];
                            int i25 = 0;
                            while (i25 != i20) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j16 = (jArr4[i26] >> i27) & j5;
                                if (j16 != 128 && j16 == 254) {
                                    Object obj2 = objArr2[i25];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i17;
                                    int i28 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e5 = e(i28);
                                    int i29 = i28 & i20;
                                    if (((e5 - i29) & i20) / i23 == ((i25 - i29) & i20) / i23) {
                                        long j17 = j15;
                                        jArr4[i26] = ((r7 & 127) << i27) | ((~(j5 << i27)) & jArr4[i26]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j17) | Long.MIN_VALUE;
                                        i25++;
                                        j15 = j17;
                                    } else {
                                        long j18 = j15;
                                        int i30 = e5 >> 3;
                                        long j19 = jArr4[i30];
                                        int i31 = (e5 & 7) << 3;
                                        if (((j19 >> i31) & j5) == 128) {
                                            i5 = i23;
                                            i = i20;
                                            objArr = objArr2;
                                            jArr4[i30] = ((~(j5 << i31)) & j19) | ((r7 & 127) << i31);
                                            jArr4[i26] = (jArr4[i26] & (~(j5 << i27))) | (128 << i27);
                                            objArr[e5] = objArr[i25];
                                            objArr[i25] = null;
                                        } else {
                                            i = i20;
                                            objArr = objArr2;
                                            i5 = i23;
                                            jArr4[i30] = ((r7 & 127) << i31) | ((~(j5 << i31)) & j19);
                                            Object obj3 = objArr[e5];
                                            objArr[e5] = objArr[i25];
                                            objArr[i25] = obj3;
                                            i25--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j18) | Long.MIN_VALUE;
                                        i25++;
                                        j15 = j18;
                                        i23 = i5;
                                        i20 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            this.f18937e = O.a(this.f18935c) - this.f18936d;
                            e3 = e(i8);
                        }
                    }
                    j5 = 255;
                    j6 = j9;
                    j7 = 128;
                    int b3 = O.b(this.f18935c);
                    long[] jArr5 = this.f18933a;
                    Object[] objArr3 = this.f18934b;
                    int i32 = this.f18935c;
                    f(b3);
                    long[] jArr6 = this.f18933a;
                    Object[] objArr4 = this.f18934b;
                    int i33 = this.f18935c;
                    int i34 = 0;
                    while (i34 < i32) {
                        if (((jArr5[i34 >> 3] >> ((i34 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i34];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i17;
                            int i35 = hashCode3 ^ (hashCode3 << 16);
                            int e6 = e(i35 >>> 7);
                            long j20 = i35 & 127;
                            int i36 = e6 >> 3;
                            int i37 = (e6 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j21 = (jArr6[i36] & (~(255 << i37))) | (j20 << i37);
                            jArr[i36] = j21;
                            jArr[(((e6 - 7) & i33) + (i33 & 7)) >> 3] = j21;
                            objArr4[e6] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i34++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e3 = e(i8);
                }
                this.f18936d++;
                int i38 = this.f18937e;
                long[] jArr7 = this.f18933a;
                int i39 = e3 >> 3;
                long j22 = jArr7[i39];
                int i40 = (e3 & 7) << 3;
                this.f18937e = i38 - (((j22 >> i40) & j5) == j7 ? 1 : 0);
                int i41 = this.f18935c;
                long j23 = (j22 & (~(j5 << i40))) | (j6 << i40);
                jArr7[i39] = j23;
                jArr7[(((e3 - 7) & i41) + (i41 & 7)) >> 3] = j23;
                return e3;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
            i9 = i15;
            i6 = i17;
        }
    }

    public final int e(int i) {
        int i5 = this.f18935c;
        int i6 = i & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f18933a;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2322H)) {
            return false;
        }
        C2322H c2322h = (C2322H) obj;
        if (c2322h.f18936d != this.f18936d) {
            return false;
        }
        Object[] objArr = this.f18934b;
        long[] jArr = this.f18933a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j5 = jArr[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j5) < 128 && !c2322h.c(objArr[(i << 3) + i6])) {
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
        long[] jArr;
        int max = i > 0 ? Math.max(7, O.c(i)) : 0;
        this.f18935c = max;
        if (max == 0) {
            jArr = O.f18957a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            X3.l.C0(jArr, -9187201950435737472L);
        }
        this.f18933a = jArr;
        int i5 = max >> 3;
        long j5 = 255 << ((max & 7) << 3);
        jArr[i5] = (jArr[i5] & (~j5)) | j5;
        this.f18937e = O.a(this.f18935c) - this.f18936d;
        this.f18934b = max == 0 ? AbstractC2351a.f19151c : new Object[max];
    }

    public final boolean g() {
        return this.f18936d == 0;
    }

    public final boolean h() {
        return this.f18936d != 0;
    }

    public final int hashCode() {
        int i = (this.f18935c * 31) + this.f18936d;
        Object[] objArr = this.f18934b;
        long[] jArr = this.f18933a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            Object obj = objArr[(i5 << 3) + i7];
                            if (!kotlin.jvm.internal.l.a(obj, this)) {
                                i += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        return i;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        return i;
    }

    public final void i(Object obj) {
        this.f18934b[d(obj)] = obj;
    }

    public final void j(C2322H c2322h) {
        kotlin.jvm.internal.l.f("elements", c2322h);
        Object[] objArr = c2322h.f18934b;
        long[] jArr = c2322h.f18933a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j5 = jArr[i];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j5) < 128) {
                        i(objArr[(i << 3) + i6]);
                    }
                    j5 >>= 8;
                }
                if (i5 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f18935c;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f18933a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j5 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (i6 * 72340172838076673L) ^ j5;
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                if (kotlin.jvm.internal.l.a(this.f18934b[i], obj)) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        boolean z3 = i >= 0;
        if (z3) {
            l(i);
        }
        return z3;
    }

    public final void l(int i) {
        this.f18936d--;
        long[] jArr = this.f18933a;
        int i5 = this.f18935c;
        int i6 = i >> 3;
        int i7 = (i & 7) << 3;
        long j5 = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        jArr[i6] = j5;
        jArr[(((i - 7) & i5) + (i5 & 7)) >> 3] = j5;
        this.f18934b[i] = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f18934b;
        long[] jArr = this.f18933a;
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
                            Object obj = objArr[(i << 3) + i7];
                            if (i5 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i5 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
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

    public /* synthetic */ C2322H() {
        this(6);
    }
}
