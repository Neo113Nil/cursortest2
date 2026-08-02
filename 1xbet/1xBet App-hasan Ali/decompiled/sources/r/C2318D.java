package r;

import java.util.Arrays;
import java.util.Collection;
import s.AbstractC2351a;

/* renamed from: r.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2318D {

    /* renamed from: a, reason: collision with root package name */
    public long[] f18911a = O.f18957a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f18912b = AbstractC2351a.f19151c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f18913c = AbstractC2339q.f19034b;

    /* renamed from: d, reason: collision with root package name */
    public int f18914d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f18915e = Integer.MAX_VALUE;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f18916g;

    /* renamed from: h, reason: collision with root package name */
    public int f18917h;

    public C2318D(int i) {
        if (i >= 0) {
            f(O.d(i));
        } else {
            AbstractC2351a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.f18916g;
        int d5 = d(obj);
        this.f18912b[d5] = obj;
        long[] jArr = this.f18913c;
        int i5 = this.f18914d;
        jArr[d5] = (i5 & 2147483647L) | 4611686016279904256L;
        if (i5 != Integer.MAX_VALUE) {
            jArr[i5] = ((2147483647L & d5) << 31) | (jArr[i5] & (-4611686016279904257L));
        }
        this.f18914d = d5;
        if (this.f18915e == Integer.MAX_VALUE) {
            this.f18915e = d5;
        }
        return this.f18916g != i;
    }

    public final void b() {
        this.f18916g = 0;
        long[] jArr = this.f18911a;
        if (jArr != O.f18957a) {
            X3.l.C0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f18911a;
            int i = this.f;
            int i5 = i >> 3;
            long j5 = 255 << ((i & 7) << 3);
            jArr2[i5] = (jArr2[i5] & (~j5)) | j5;
        }
        X3.l.B0(this.f18912b, 0, this.f);
        X3.l.C0(this.f18913c, 4611686018427387903L);
        this.f18914d = Integer.MAX_VALUE;
        this.f18915e = Integer.MAX_VALUE;
        this.f18917h = O.a(this.f) - this.f18916g;
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
        int i7 = this.f;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f18911a;
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
                if (kotlin.jvm.internal.l.a(this.f18912b[i], obj)) {
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
        int i;
        long j5;
        long j6;
        long j7;
        char c5;
        long[] jArr;
        long[] jArr2;
        long j8;
        int i5 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.f;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr3 = this.f18911a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j9 = ((jArr3[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr3[i12] >>> i13);
            long j10 = i8;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            long j12 = (j11 - 72340172838076673L) & (~j11) & (-9187201950435737472L);
            while (j12 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i10) & i9;
                int i14 = i5;
                if (kotlin.jvm.internal.l.a(this.f18912b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j12 &= j12 - 1;
                i5 = i14;
            }
            int i15 = i5;
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                int e3 = e(i7);
                long j13 = 255;
                if (this.f18917h != 0 || ((this.f18911a[e3 >> 3] >> ((e3 & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j5 = j10;
                    j6 = 255;
                    j7 = 128;
                } else {
                    int i16 = this.f;
                    if (i16 > 8) {
                        c5 = 31;
                        j7 = 128;
                        if (Long.compare((this.f18916g * 32) ^ Long.MIN_VALUE, (i16 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f18911a;
                            if (jArr4 == null) {
                                i = 0;
                                j5 = j10;
                                j6 = 255;
                            } else {
                                int i17 = this.f;
                                Object[] objArr = this.f18912b;
                                long[] jArr5 = this.f18913c;
                                long[] jArr6 = new long[i17];
                                Arrays.fill(jArr6, 0, i17, 9223372034707292159L);
                                i = 0;
                                int i18 = (i17 + 7) >> 3;
                                int i19 = 0;
                                while (i19 < i18) {
                                    long j14 = j13;
                                    long j15 = jArr4[i19] & (-9187201950435737472L);
                                    int i20 = i19;
                                    jArr4[i20] = ((~j15) + (j15 >>> 7)) & (-72340172838076674L);
                                    i19 = i20 + 1;
                                    j13 = j14;
                                }
                                j6 = j13;
                                int length = jArr4.length;
                                int i21 = length - 1;
                                int i22 = length - 2;
                                jArr4[i22] = (jArr4[i22] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i21] = jArr4[0];
                                int i23 = 0;
                                while (i23 != i17) {
                                    int i24 = i23 >> 3;
                                    int i25 = (i23 & 7) << 3;
                                    long j16 = (jArr4[i24] >> i25) & j6;
                                    if (j16 != 128 && j16 == 254) {
                                        Object obj2 = objArr[i23];
                                        int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i15;
                                        int i26 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                        int e5 = e(i26);
                                        int i27 = i26 & i17;
                                        if (((e5 - i27) & i17) / 8 == ((i23 - i27) & i17) / 8) {
                                            int i28 = i17;
                                            Object[] objArr2 = objArr;
                                            jArr4[i24] = (jArr4[i24] & (~(j6 << i25))) | ((r17 & 127) << i25);
                                            if (jArr6[i23] == 9223372034707292159L) {
                                                long j17 = i23;
                                                jArr6[i23] = j17 | (j17 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i23++;
                                            i17 = i28;
                                            objArr = objArr2;
                                        } else {
                                            int i29 = i17;
                                            Object[] objArr3 = objArr;
                                            int i30 = e5 >> 3;
                                            long j18 = jArr4[i30];
                                            int i31 = (e5 & 7) << 3;
                                            if (((j18 >> i31) & j6) == 128) {
                                                jArr4[i30] = (j18 & (~(j6 << i31))) | ((r17 & 127) << i31);
                                                jArr4[i24] = (jArr4[i24] & (~(j6 << i25))) | (128 << i25);
                                                objArr3[e5] = objArr3[i23];
                                                objArr3[i23] = null;
                                                jArr5[e5] = jArr5[i23];
                                                jArr5[i23] = 4611686018427387903L;
                                                int i32 = (int) ((jArr6[i23] >> 32) & 4294967295L);
                                                int i33 = Integer.MAX_VALUE;
                                                if (i32 != Integer.MAX_VALUE) {
                                                    j8 = j10;
                                                    jArr6[i32] = e5 | (jArr6[i32] & (-4294967296L));
                                                    jArr6[i23] = (jArr6[i23] & 4294967295L) | (-4294967296L);
                                                    i33 = Integer.MAX_VALUE;
                                                } else {
                                                    j8 = j10;
                                                    jArr6[i23] = (Integer.MAX_VALUE << 32) | e5;
                                                }
                                                jArr6[e5] = (i23 << 32) | i33;
                                            } else {
                                                j8 = j10;
                                                jArr4[i30] = ((r17 & 127) << i31) | (j18 & (~(j6 << i31)));
                                                Object obj3 = objArr3[e5];
                                                objArr3[e5] = objArr3[i23];
                                                objArr3[i23] = obj3;
                                                long j19 = jArr5[e5];
                                                jArr5[e5] = jArr5[i23];
                                                jArr5[i23] = j19;
                                                int i34 = (int) ((jArr6[i23] >> 32) & 4294967295L);
                                                if (i34 != Integer.MAX_VALUE) {
                                                    long j20 = e5;
                                                    jArr6[i34] = (jArr6[i34] & (-4294967296L)) | j20;
                                                    jArr6[i23] = (jArr6[i23] & 4294967295L) | (j20 << 32);
                                                } else {
                                                    long j21 = e5;
                                                    jArr6[i23] = j21 | (j21 << 32);
                                                    i34 = i23;
                                                }
                                                jArr6[e5] = (i34 << 32) | i23;
                                                i23--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i23++;
                                            i17 = i29;
                                            objArr = objArr3;
                                            j10 = j8;
                                        }
                                    } else {
                                        i23++;
                                    }
                                }
                                j5 = j10;
                                this.f18917h = O.a(this.f) - this.f18916g;
                                long[] jArr7 = this.f18913c;
                                int length2 = jArr7.length;
                                for (int i35 = 0; i35 < length2; i35++) {
                                    long j22 = jArr7[i35];
                                    jArr7[i35] = (((j22 & (-4611686018427387904L)) | (((int) ((j22 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r4] & 4294967295L))) << 31) | (((int) (j22 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r6] & 4294967295L));
                                }
                                int i36 = this.f18914d;
                                if (i36 != Integer.MAX_VALUE) {
                                    this.f18914d = (int) (jArr6[i36] & 4294967295L);
                                }
                                int i37 = this.f18915e;
                                if (i37 != Integer.MAX_VALUE) {
                                    this.f18915e = (int) (jArr6[i37] & 4294967295L);
                                }
                            }
                            e3 = e(i7);
                        }
                    } else {
                        c5 = 31;
                        j7 = 128;
                    }
                    i = 0;
                    j5 = j10;
                    j6 = 255;
                    int b3 = O.b(this.f);
                    long[] jArr8 = this.f18911a;
                    Object[] objArr4 = this.f18912b;
                    long[] jArr9 = this.f18913c;
                    int i38 = this.f;
                    int[] iArr = new int[i38];
                    f(b3);
                    long[] jArr10 = this.f18911a;
                    Object[] objArr5 = this.f18912b;
                    long[] jArr11 = this.f18913c;
                    int i39 = this.f;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr8[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < j7) {
                            Object obj4 = objArr4[i40];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i15;
                            int i41 = hashCode3 ^ (hashCode3 << 16);
                            int e6 = e(i41 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j23 = i41 & 127;
                            int i42 = e6 >> 3;
                            int i43 = (e6 & 7) << 3;
                            long j24 = (jArr[i42] & (~(255 << i43))) | (j23 << i43);
                            jArr[i42] = j24;
                            jArr[(((e6 - 7) & i39) + (i39 & 7)) >> 3] = j24;
                            objArr5[e6] = obj4;
                            jArr11[e6] = jArr9[i40];
                            iArr[i40] = e6;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i40++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f18913c;
                    int length3 = jArr12.length;
                    for (int i44 = 0; i44 < length3; i44++) {
                        long j25 = jArr12[i44];
                        jArr12[i44] = (((j25 & (-4611686018427387904L)) | (((int) ((j25 >> c5) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c5) | (((int) (j25 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                    }
                    int i45 = this.f18914d;
                    if (i45 != Integer.MAX_VALUE) {
                        this.f18914d = iArr[i45];
                    }
                    int i46 = this.f18915e;
                    if (i46 != Integer.MAX_VALUE) {
                        this.f18915e = iArr[i46];
                    }
                    e3 = e(i7);
                }
                this.f18916g++;
                int i47 = this.f18917h;
                long[] jArr13 = this.f18911a;
                int i48 = e3 >> 3;
                long j26 = jArr13[i48];
                int i49 = (e3 & 7) << 3;
                if (((j26 >> i49) & j6) == j7) {
                    i = 1;
                }
                this.f18917h = i47 - i;
                int i50 = this.f;
                long j27 = (j26 & (~(j6 << i49))) | (j5 << i49);
                jArr13[i48] = j27;
                jArr13[(((e3 - 7) & i50) + (i50 & 7)) >> 3] = j27;
                return e3;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
            i5 = i15;
        }
    }

    public final int e(int i) {
        int i5 = this.f;
        int i6 = i & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f18911a;
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
        if (!(obj instanceof C2318D)) {
            return false;
        }
        C2318D c2318d = (C2318D) obj;
        if (c2318d.f18916g != this.f18916g) {
            return false;
        }
        Object[] objArr = this.f18912b;
        long[] jArr = this.f18911a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j5 = jArr[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j5) < 128 && !c2318d.c(objArr[(i << 3) + i6])) {
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
        long[] jArr2;
        int max = i > 0 ? Math.max(7, O.c(i)) : 0;
        this.f = max;
        if (max == 0) {
            jArr = O.f18957a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            X3.l.C0(jArr, -9187201950435737472L);
        }
        this.f18911a = jArr;
        int i5 = max >> 3;
        long j5 = 255 << ((max & 7) << 3);
        jArr[i5] = (jArr[i5] & (~j5)) | j5;
        this.f18917h = O.a(this.f) - this.f18916g;
        this.f18912b = max == 0 ? AbstractC2351a.f19151c : new Object[max];
        if (max == 0) {
            jArr2 = AbstractC2339q.f19034b;
        } else {
            jArr2 = new long[max];
            X3.l.C0(jArr2, 4611686018427387903L);
        }
        this.f18913c = jArr2;
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
    public final boolean g(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f18911a;
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
                if (kotlin.jvm.internal.l.a(this.f18912b[i], obj)) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        boolean z3 = i >= 0;
        if (z3) {
            h(i);
        }
        return z3;
    }

    public final void h(int i) {
        this.f18916g--;
        long[] jArr = this.f18911a;
        int i5 = this.f;
        int i6 = i >> 3;
        int i7 = (i & 7) << 3;
        long j5 = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        jArr[i6] = j5;
        jArr[(((i - 7) & i5) + (i5 & 7)) >> 3] = j5;
        this.f18912b[i] = null;
        long[] jArr2 = this.f18913c;
        long j6 = jArr2[i];
        int i8 = (int) ((j6 >> 31) & 2147483647L);
        int i9 = (int) (j6 & 2147483647L);
        if (i8 != Integer.MAX_VALUE) {
            jArr2[i8] = (jArr2[i8] & (-2147483648L)) | (i9 & 2147483647L);
        } else {
            this.f18914d = i9;
        }
        if (i9 != Integer.MAX_VALUE) {
            jArr2[i9] = ((i8 & 2147483647L) << 31) | (jArr2[i9] & (-4611686016279904257L));
        } else {
            this.f18915e = i8;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final int hashCode() {
        int i = (this.f * 31) + this.f18916g;
        Object[] objArr = this.f18912b;
        long[] jArr = this.f18911a;
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

    public final boolean i(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        Object[] objArr = this.f18912b;
        int i = this.f18916g;
        long[] jArr = this.f18911a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            int i8 = (i5 << 3) + i7;
                            if (!X3.m.V(collection, objArr[i8])) {
                                h(i8);
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        return i != this.f18916g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f18912b;
        long[] jArr = this.f18913c;
        int i = this.f18915e;
        int i5 = 0;
        while (true) {
            if (i == Integer.MAX_VALUE) {
                sb.append((CharSequence) "]");
                break;
            }
            int i6 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i5 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i5 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i5++;
            i = i6;
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }
}
