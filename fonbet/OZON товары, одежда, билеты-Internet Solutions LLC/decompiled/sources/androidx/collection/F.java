package androidx.collection;

import Sc.C;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F<V> extends AbstractC5149s<V> {

    /* renamed from: f, reason: collision with root package name */
    private int f38611f;

    public F() {
        this((Object) null);
    }

    private final int e(long j11) {
        long j12;
        int i11;
        int i12;
        long j13;
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        String str;
        int i13 = 1;
        int i14 = -862048943;
        int hashCode = Long.hashCode(j11) * (-862048943);
        int i15 = hashCode ^ (hashCode << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.f38739d;
        int i19 = i16 & i18;
        int i21 = 0;
        while (true) {
            long[] jArr4 = this.f38736a;
            int i22 = i19 >> 3;
            int i23 = (i19 & 7) << 3;
            int i24 = i21;
            int i25 = 0;
            long j14 = (((-i23) >> 63) & (jArr4[i22 + i13] << (64 - i23))) | (jArr4[i22] >>> i23);
            long j15 = i17;
            int i26 = i13;
            int i27 = i17;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            long j17 = (~j16) & (j16 - 72340172838076673L) & (-9187201950435737472L);
            while (j17 != 0) {
                int numberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j17) >> 3)) & i18;
                int i28 = i14;
                if (this.f38737b[numberOfTrailingZeros] == j11) {
                    return numberOfTrailingZeros;
                }
                j17 &= j17 - 1;
                i14 = i28;
            }
            int i29 = i14;
            if ((((~j14) << 6) & j14 & (-9187201950435737472L)) != 0) {
                int f7 = f(i16);
                long j18 = 255;
                if (this.f38611f != 0 || ((this.f38736a[f7 >> 3] >> ((f7 & 7) << 3)) & 255) == 254) {
                    j12 = 255;
                    i11 = i26;
                    i12 = 0;
                    j13 = 128;
                } else {
                    int i31 = this.f38739d;
                    if (i31 > 8) {
                        long j19 = this.f38740e;
                        C.Companion companion = Sc.C.INSTANCE;
                        if (Long.compareUnsigned(j19 * 32, i31 * 25) <= 0) {
                            long[] jArr5 = this.f38736a;
                            int i32 = this.f38739d;
                            long[] jArr6 = this.f38737b;
                            Object[] objArr = this.f38738c;
                            W.a(jArr5, i32);
                            int i33 = 0;
                            j13 = 128;
                            int i34 = -1;
                            while (i33 != i32) {
                                int i35 = i33 >> 3;
                                int i36 = (i33 & 7) << 3;
                                long j21 = (jArr5[i35] >> i36) & j18;
                                if (j21 == 128) {
                                    int i37 = i33;
                                    i33++;
                                    i34 = i37;
                                } else if (j21 != 254) {
                                    i33 += i26;
                                } else {
                                    int hashCode2 = Long.hashCode(jArr6[i33]) * i29;
                                    long j22 = j18;
                                    int i38 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int f11 = f(i38);
                                    int i39 = i38 & i32;
                                    int i41 = i26;
                                    int i42 = i25;
                                    if (((f11 - i39) & i32) / 8 == ((i33 - i39) & i32) / 8) {
                                        long[] jArr7 = jArr5;
                                        jArr7[i35] = (jArr5[i35] & (~(j22 << i36))) | ((r19 & 127) << i36);
                                        jArr3 = jArr7;
                                        Intrinsics.checkNotNullParameter(jArr3, "<this>");
                                        jArr3[jArr3.length - 1] = (jArr3[i42] & 72057594037927935L) | Long.MIN_VALUE;
                                    } else {
                                        jArr3 = jArr5;
                                        int i43 = f11 >> 3;
                                        long j23 = jArr3[i43];
                                        int i44 = (f11 & 7) << 3;
                                        if (((j23 >> i44) & j22) == 128) {
                                            str = "<this>";
                                            jArr3[i43] = (j23 & (~(j22 << i44))) | ((r19 & 127) << i44);
                                            jArr3[i35] = (jArr3[i35] & (~(j22 << i36))) | (128 << i36);
                                            jArr6[f11] = jArr6[i33];
                                            jArr6[i33] = 0;
                                            objArr[f11] = objArr[i33];
                                            objArr[i33] = null;
                                            i34 = i33;
                                        } else {
                                            str = "<this>";
                                            jArr3[i43] = (j23 & (~(j22 << i44))) | ((r19 & 127) << i44);
                                            if (i34 == -1) {
                                                i34 = W.b(jArr3, i33 + 1, i32);
                                            }
                                            jArr6[i34] = jArr6[f11];
                                            jArr6[f11] = jArr6[i33];
                                            jArr6[i33] = jArr6[i34];
                                            objArr[i34] = objArr[f11];
                                            objArr[f11] = objArr[i33];
                                            objArr[i33] = objArr[i34];
                                            i33--;
                                        }
                                        Intrinsics.checkNotNullParameter(jArr3, str);
                                        jArr3[jArr3.length - 1] = (jArr3[i42] & 72057594037927935L) | Long.MIN_VALUE;
                                    }
                                    i33++;
                                    jArr5 = jArr3;
                                    j18 = j22;
                                    i25 = i42;
                                    i26 = i41;
                                }
                            }
                            j12 = j18;
                            i11 = i26;
                            i12 = i25;
                            this.f38611f = W.c(this.f38739d) - this.f38740e;
                            f7 = f(i16);
                        }
                    }
                    j12 = 255;
                    i11 = i26;
                    i12 = 0;
                    j13 = 128;
                    int d11 = W.d(this.f38739d);
                    long[] jArr8 = this.f38736a;
                    long[] jArr9 = this.f38737b;
                    Object[] objArr2 = this.f38738c;
                    int i45 = this.f38739d;
                    g(d11);
                    long[] jArr10 = this.f38736a;
                    long[] jArr11 = this.f38737b;
                    Object[] objArr3 = this.f38738c;
                    int i46 = this.f38739d;
                    int i47 = 0;
                    while (i47 < i45) {
                        if (((jArr8[i47 >> 3] >> ((i47 & 7) << 3)) & 255) < 128) {
                            long j24 = jArr9[i47];
                            int hashCode3 = Long.hashCode(j24) * i29;
                            int i48 = hashCode3 ^ (hashCode3 << 16);
                            jArr = jArr10;
                            int f12 = f(i48 >>> 7);
                            jArr2 = jArr8;
                            long j25 = i48 & 127;
                            int i49 = f12 >> 3;
                            int i51 = (f12 & 7) << 3;
                            long j26 = (jArr[i49] & (~(255 << i51))) | (j25 << i51);
                            jArr[i49] = j26;
                            jArr[(((f12 - 7) & i46) + (i46 & 7)) >> 3] = j26;
                            jArr11[f12] = j24;
                            objArr3[f12] = objArr2[i47];
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i47++;
                        jArr10 = jArr;
                        jArr8 = jArr2;
                    }
                    f7 = f(i16);
                }
                this.f38740e++;
                int i52 = this.f38611f;
                long[] jArr12 = this.f38736a;
                int i53 = f7 >> 3;
                long j27 = jArr12[i53];
                int i54 = (f7 & 7) << 3;
                if (((j27 >> i54) & j12) == j13) {
                    i12 = i11;
                }
                this.f38611f = i52 - i12;
                int i55 = this.f38739d;
                long j28 = (j27 & (~(j12 << i54))) | (j15 << i54);
                jArr12[i53] = j28;
                jArr12[(((f7 - 7) & i55) + (i55 & 7)) >> 3] = j28;
                return f7;
            }
            i21 = i24 + 8;
            i19 = (i19 + i21) & i18;
            i17 = i27;
            i14 = i29;
            i13 = i26;
        }
    }

    private final int f(int i11) {
        int i12 = this.f38739d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f38736a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = j11 & ((~j11) << 7) & (-9187201950435737472L);
            if (j12 != 0) {
                return (i13 + (Long.numberOfTrailingZeros(j12) >> 3)) & i12;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    private final void g(int i11) {
        long[] jArr;
        int max = i11 > 0 ? Math.max(7, W.e(i11)) : 0;
        this.f38739d = max;
        if (max == 0) {
            jArr = W.f38661a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C7705l.z(jArr);
        }
        this.f38736a = jArr;
        int i12 = max >> 3;
        long j11 = 255 << ((max & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f38611f = W.c(this.f38739d) - this.f38740e;
        this.f38737b = new long[max];
        this.f38738c = new Object[max];
    }

    public final void d() {
        this.f38740e = 0;
        long[] jArr = this.f38736a;
        if (jArr != W.f38661a) {
            C7705l.z(jArr);
            long[] jArr2 = this.f38736a;
            int i11 = this.f38739d;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        C7705l.x(this.f38738c, null, 0, this.f38739d);
        this.f38611f = W.c(this.f38739d) - this.f38740e;
    }

    public final void h(long j11, Object obj) {
        int e11 = e(j11);
        Object[] objArr = this.f38738c;
        Object obj2 = objArr[e11];
        this.f38737b[e11] = j11;
        objArr[e11] = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V i(long j11) {
        int i11;
        int hashCode = Long.hashCode(j11) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f38739d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f38736a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j12 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j13 = (i13 * 72340172838076673L) ^ j12;
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j14 == 0) {
                    break;
                }
                i11 = ((Long.numberOfTrailingZeros(j14) >> 3) + i15) & i14;
                if (this.f38737b[i11] == j11) {
                    break loop0;
                }
                j14 &= j14 - 1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
        if (i11 < 0) {
            return null;
        }
        this.f38740e--;
        long[] jArr2 = this.f38736a;
        int i19 = this.f38739d;
        int i21 = i11 >> 3;
        int i22 = (i11 & 7) << 3;
        long j15 = (jArr2[i21] & (~(255 << i22))) | (254 << i22);
        jArr2[i21] = j15;
        jArr2[(((i11 - 7) & i19) + (i19 & 7)) >> 3] = j15;
        Object[] objArr = this.f38738c;
        V v11 = (V) objArr[i11];
        objArr[i11] = null;
        return v11;
    }

    public final void j(long j11, V v11) {
        int e11 = e(j11);
        this.f38737b[e11] = j11;
        this.f38738c[e11] = v11;
    }

    public /* synthetic */ F(Object obj) {
        this(6);
    }

    public F(int i11) {
        super(0);
        if (i11 >= 0) {
            g(W.f(i11));
        } else {
            k0.d.a("Capacity must be a positive value.");
            throw null;
        }
    }
}
