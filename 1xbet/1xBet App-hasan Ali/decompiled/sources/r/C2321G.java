package r;

import s.AbstractC2351a;

/* renamed from: r.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2321G {

    /* renamed from: a, reason: collision with root package name */
    public long[] f18928a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f18929b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f18930c;

    /* renamed from: d, reason: collision with root package name */
    public int f18931d;

    /* renamed from: e, reason: collision with root package name */
    public int f18932e;
    public int f;

    public C2321G(int i) {
        this.f18928a = O.f18957a;
        Object[] objArr = AbstractC2351a.f19151c;
        this.f18929b = objArr;
        this.f18930c = objArr;
        if (i >= 0) {
            h(O.d(i));
        } else {
            AbstractC2351a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f18932e = 0;
        long[] jArr = this.f18928a;
        if (jArr != O.f18957a) {
            X3.l.C0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f18928a;
            int i = this.f18931d;
            int i5 = i >> 3;
            long j5 = 255 << ((i & 7) << 3);
            jArr2[i5] = (jArr2[i5] & (~j5)) | j5;
        }
        X3.l.B0(this.f18930c, 0, this.f18931d);
        X3.l.B0(this.f18929b, 0, this.f18931d);
        this.f = O.a(this.f18931d) - this.f18932e;
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
    public final boolean b(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f18931d;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f18928a;
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
                if (kotlin.jvm.internal.l.a(this.f18929b[i], obj)) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        return i >= 0;
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
        int i7 = this.f18931d;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f18928a;
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
                if (kotlin.jvm.internal.l.a(this.f18929b[i], obj)) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        return i >= 0;
    }

    public final boolean d(Object obj) {
        Object[] objArr = this.f18930c;
        long[] jArr = this.f18928a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j5 = jArr[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j5) < 128 && kotlin.jvm.internal.l.a(obj, objArr[(i << 3) + i6])) {
                            return true;
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
        return false;
    }

    public final int e(int i) {
        int i5 = this.f18931d;
        int i6 = i & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f18928a;
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
        if (!(obj instanceof C2321G)) {
            return false;
        }
        C2321G c2321g = (C2321G) obj;
        if (c2321g.f18932e != this.f18932e) {
            return false;
        }
        Object[] objArr = this.f18929b;
        Object[] objArr2 = this.f18930c;
        long[] jArr = this.f18928a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j5 = jArr[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j5) < 128) {
                            int i7 = (i << 3) + i6;
                            Object obj2 = objArr[i7];
                            Object obj3 = objArr2[i7];
                            if (obj3 == null) {
                                if (c2321g.g(obj2) != null || !c2321g.c(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(c2321g.g(obj2))) {
                                return false;
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

    public final int f(Object obj) {
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
        int i9 = this.f18931d;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr3 = this.f18928a;
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
                if (kotlin.jvm.internal.l.a(this.f18929b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j11 &= j11 - 1;
                i5 = i15;
            }
            int i16 = i5;
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int e3 = e(i7);
                long j12 = 255;
                if (this.f != 0 || ((this.f18928a[e3 >> 3] >> ((e3 & 7) << 3)) & 255) == 254) {
                    j5 = 255;
                    j6 = j9;
                    j7 = 128;
                } else {
                    int i17 = this.f18931d;
                    if (i17 > 8) {
                        int i18 = 8;
                        if (Long.compare((this.f18932e * 32) ^ Long.MIN_VALUE, (i17 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f18928a;
                            int i19 = this.f18931d;
                            Object[] objArr2 = this.f18929b;
                            Object[] objArr3 = this.f18930c;
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
                            jArr4[i23] = (jArr4[i23] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[F02] = jArr4[0];
                            int i24 = 0;
                            while (i24 != i19) {
                                int i25 = i24 >> 3;
                                int i26 = (i24 & 7) << 3;
                                long j15 = (jArr4[i25] >> i26) & j5;
                                if (j15 != 128 && j15 == 254) {
                                    Object obj2 = objArr2[i24];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i16;
                                    int i27 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e5 = e(i27);
                                    int i28 = i27 & i19;
                                    if (((e5 - i28) & i19) / i22 == ((i24 - i28) & i19) / i22) {
                                        jArr4[i25] = ((r8 & 127) << i26) | (jArr4[i25] & (~(j5 << i26)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i24++;
                                        i22 = i22;
                                    } else {
                                        int i29 = i22;
                                        int i30 = e5 >> 3;
                                        long j16 = jArr4[i30];
                                        int i31 = (e5 & 7) << 3;
                                        if (((j16 >> i31) & j5) == 128) {
                                            i = i19;
                                            objArr = objArr2;
                                            jArr4[i30] = ((~(j5 << i31)) & j16) | ((r8 & 127) << i31);
                                            jArr4[i25] = (jArr4[i25] & (~(j5 << i26))) | (128 << i26);
                                            objArr[e5] = objArr[i24];
                                            objArr[i24] = null;
                                            objArr3[e5] = objArr3[i24];
                                            objArr3[i24] = null;
                                        } else {
                                            i = i19;
                                            objArr = objArr2;
                                            jArr4[i30] = ((r8 & 127) << i31) | ((~(j5 << i31)) & j16);
                                            Object obj3 = objArr[e5];
                                            objArr[e5] = objArr[i24];
                                            objArr[i24] = obj3;
                                            Object obj4 = objArr3[e5];
                                            objArr3[e5] = objArr3[i24];
                                            objArr3[i24] = obj4;
                                            i24--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i24++;
                                        i22 = i29;
                                        i19 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i24++;
                                }
                            }
                            this.f = O.a(this.f18931d) - this.f18932e;
                            e3 = e(i7);
                        }
                    }
                    j5 = 255;
                    j6 = j9;
                    j7 = 128;
                    int b3 = O.b(this.f18931d);
                    long[] jArr5 = this.f18928a;
                    Object[] objArr4 = this.f18929b;
                    Object[] objArr5 = this.f18930c;
                    int i32 = this.f18931d;
                    h(b3);
                    long[] jArr6 = this.f18928a;
                    Object[] objArr6 = this.f18929b;
                    Object[] objArr7 = this.f18930c;
                    int i33 = this.f18931d;
                    int i34 = 0;
                    while (i34 < i32) {
                        if (((jArr5[i34 >> 3] >> ((i34 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i34];
                            int hashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i16;
                            int i35 = hashCode3 ^ (hashCode3 << 16);
                            int e6 = e(i35 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = i35 & 127;
                            int i36 = e6 >> 3;
                            int i37 = (e6 & 7) << 3;
                            long j18 = (jArr[i36] & (~(255 << i37))) | (j17 << i37);
                            jArr[i36] = j18;
                            jArr[(((e6 - 7) & i33) + (i33 & 7)) >> 3] = j18;
                            objArr6[e6] = obj5;
                            objArr7[e6] = objArr5[i34];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i34++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e3 = e(i7);
                }
                this.f18932e++;
                int i38 = this.f;
                long[] jArr7 = this.f18928a;
                int i39 = e3 >> 3;
                long j19 = jArr7[i39];
                int i40 = (e3 & 7) << 3;
                this.f = i38 - (((j19 >> i40) & j5) == j7 ? 1 : 0);
                int i41 = this.f18931d;
                long j20 = (j19 & (~(j5 << i40))) | (j6 << i40);
                jArr7[i39] = j20;
                jArr7[(((e3 - 7) & i41) + (i41 & 7)) >> 3] = j20;
                return ~e3;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
            i8 = i14;
            i5 = i16;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        int i;
        int i5 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 & 127;
        int i8 = this.f18931d;
        int i9 = i6 >>> 7;
        loop0: while (true) {
            int i10 = i9 & i8;
            long[] jArr = this.f18928a;
            int i11 = i10 >> 3;
            int i12 = (i10 & 7) << 3;
            long j5 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j6 = (i7 * 72340172838076673L) ^ j5;
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j7) >> 3) + i10) & i8;
                if (kotlin.jvm.internal.l.a(this.f18929b[i], obj)) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i5 += 8;
            i9 = i10 + i5;
        }
        if (i >= 0) {
            return this.f18930c[i];
        }
        return null;
    }

    public final void h(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, O.c(i)) : 0;
        this.f18931d = max;
        if (max == 0) {
            jArr = O.f18957a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            X3.l.C0(jArr, -9187201950435737472L);
            int i5 = max >> 3;
            long j5 = 255 << ((max & 7) << 3);
            jArr[i5] = (jArr[i5] & (~j5)) | j5;
        }
        this.f18928a = jArr;
        this.f = O.a(this.f18931d) - this.f18932e;
        Object[] objArr = AbstractC2351a.f19151c;
        this.f18929b = max == 0 ? objArr : new Object[max];
        if (max != 0) {
            objArr = new Object[max];
        }
        this.f18930c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.f18929b;
        Object[] objArr2 = this.f18930c;
        long[] jArr = this.f18928a;
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
                        Object obj2 = objArr2[i8];
                        i5 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final boolean i() {
        return this.f18932e == 0;
    }

    public final boolean j() {
        return this.f18932e != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        int i;
        int i5 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 & 127;
        int i8 = this.f18931d;
        int i9 = i6 >>> 7;
        loop0: while (true) {
            int i10 = i9 & i8;
            long[] jArr = this.f18928a;
            int i11 = i10 >> 3;
            int i12 = (i10 & 7) << 3;
            long j5 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j6 = (i7 * 72340172838076673L) ^ j5;
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j7) >> 3) + i10) & i8;
                if (kotlin.jvm.internal.l.a(this.f18929b[i], obj)) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i5 += 8;
            i9 = i10 + i5;
        }
        if (i >= 0) {
            return l(i);
        }
        return null;
    }

    public final Object l(int i) {
        this.f18932e--;
        long[] jArr = this.f18928a;
        int i5 = this.f18931d;
        int i6 = i >> 3;
        int i7 = (i & 7) << 3;
        long j5 = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        jArr[i6] = j5;
        jArr[(((i - 7) & i5) + (i5 & 7)) >> 3] = j5;
        this.f18929b[i] = null;
        Object[] objArr = this.f18930c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void m(Object obj, Object obj2) {
        int f = f(obj);
        if (f < 0) {
            f = ~f;
        }
        this.f18929b[f] = obj;
        this.f18930c[f] = obj2;
    }

    public final String toString() {
        if (i()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f18929b;
        Object[] objArr2 = this.f18930c;
        long[] jArr = this.f18928a;
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
                            Object obj2 = objArr2[i8];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i5++;
                            if (i5 < this.f18932e) {
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

    public /* synthetic */ C2321G() {
        this(6);
    }
}
