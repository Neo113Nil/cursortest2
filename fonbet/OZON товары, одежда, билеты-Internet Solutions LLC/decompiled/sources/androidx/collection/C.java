package androidx.collection;

import Sc.C;
import android.util.TypedValue;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class C<V> extends AbstractC5144m<V> {

    /* renamed from: f, reason: collision with root package name */
    private int f38608f;

    public /* synthetic */ C() {
        this(6);
    }

    private final int e(int i11) {
        long j11;
        int i12;
        int i13;
        long j12;
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        String str;
        int i14 = 1;
        int i15 = -862048943;
        int hashCode = Integer.hashCode(i11) * (-862048943);
        int i16 = hashCode ^ (hashCode << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & 127;
        int i19 = this.f38720d;
        int i21 = i17 & i19;
        int i22 = 0;
        while (true) {
            long[] jArr4 = this.f38717a;
            int i23 = i21 >> 3;
            int i24 = (i21 & 7) << 3;
            int i25 = i22;
            int i26 = 0;
            long j13 = (((-i24) >> 63) & (jArr4[i23 + i14] << (64 - i24))) | (jArr4[i23] >>> i24);
            long j14 = i18;
            int i27 = i14;
            int i28 = i18;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = -9187201950435737472L;
            long j17 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j17 != 0) {
                int numberOfTrailingZeros = (i21 + (Long.numberOfTrailingZeros(j17) >> 3)) & i19;
                int i29 = i15;
                long j18 = j16;
                if (this.f38718b[numberOfTrailingZeros] == i11) {
                    return numberOfTrailingZeros;
                }
                j17 &= j17 - 1;
                i15 = i29;
                j16 = j18;
            }
            int i31 = i15;
            if ((((~j13) << 6) & j13 & j16) != 0) {
                int f7 = f(i17);
                long j19 = 255;
                if (this.f38608f != 0 || ((this.f38717a[f7 >> 3] >> ((f7 & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    i12 = i27;
                    i13 = 0;
                    j12 = 128;
                } else {
                    int i32 = this.f38720d;
                    if (i32 > 8) {
                        long j21 = this.f38721e;
                        C.Companion companion = Sc.C.INSTANCE;
                        if (Long.compareUnsigned(j21 * 32, i32 * 25) <= 0) {
                            long[] jArr5 = this.f38717a;
                            int i33 = this.f38720d;
                            int[] iArr = this.f38718b;
                            Object[] objArr = this.f38719c;
                            W.a(jArr5, i33);
                            int i34 = 0;
                            int i35 = -1;
                            j12 = 128;
                            while (i34 != i33) {
                                int i36 = i34 >> 3;
                                int i37 = (i34 & 7) << 3;
                                long j22 = (jArr5[i36] >> i37) & j19;
                                if (j22 == 128) {
                                    int i38 = i34;
                                    i34++;
                                    i35 = i38;
                                } else if (j22 != 254) {
                                    i34 += i27;
                                } else {
                                    int hashCode2 = Integer.hashCode(iArr[i34]) * i31;
                                    long j23 = j19;
                                    int i39 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int f11 = f(i39);
                                    int i41 = i39 & i33;
                                    int i42 = i27;
                                    int i43 = i26;
                                    if (((f11 - i41) & i33) / 8 == ((i34 - i41) & i33) / 8) {
                                        long[] jArr6 = jArr5;
                                        jArr6[i36] = (jArr5[i36] & (~(j23 << i37))) | ((r23 & 127) << i37);
                                        jArr3 = jArr6;
                                        Intrinsics.checkNotNullParameter(jArr3, "<this>");
                                        jArr3[jArr3.length - 1] = (jArr3[i43] & 72057594037927935L) | Long.MIN_VALUE;
                                    } else {
                                        jArr3 = jArr5;
                                        int i44 = f11 >> 3;
                                        long j24 = jArr3[i44];
                                        int i45 = (f11 & 7) << 3;
                                        if (((j24 >> i45) & j23) == 128) {
                                            str = "<this>";
                                            jArr3[i44] = (j24 & (~(j23 << i45))) | ((r23 & 127) << i45);
                                            jArr3[i36] = (jArr3[i36] & (~(j23 << i37))) | (128 << i37);
                                            iArr[f11] = iArr[i34];
                                            iArr[i34] = i43;
                                            objArr[f11] = objArr[i34];
                                            objArr[i34] = null;
                                            i35 = i34;
                                        } else {
                                            str = "<this>";
                                            jArr3[i44] = (j24 & (~(j23 << i45))) | ((r23 & 127) << i45);
                                            if (i35 == -1) {
                                                i35 = W.b(jArr3, i34 + 1, i33);
                                            }
                                            iArr[i35] = iArr[f11];
                                            iArr[f11] = iArr[i34];
                                            iArr[i34] = iArr[i35];
                                            objArr[i35] = objArr[f11];
                                            objArr[f11] = objArr[i34];
                                            objArr[i34] = objArr[i35];
                                            i34--;
                                        }
                                        Intrinsics.checkNotNullParameter(jArr3, str);
                                        jArr3[jArr3.length - 1] = (jArr3[i43] & 72057594037927935L) | Long.MIN_VALUE;
                                    }
                                    i34++;
                                    jArr5 = jArr3;
                                    j19 = j23;
                                    i26 = i43;
                                    i27 = i42;
                                }
                            }
                            j11 = j19;
                            i12 = i27;
                            i13 = i26;
                            this.f38608f = W.c(this.f38720d) - this.f38721e;
                            f7 = f(i17);
                        }
                    }
                    j11 = 255;
                    i12 = i27;
                    i13 = 0;
                    j12 = 128;
                    int d11 = W.d(this.f38720d);
                    long[] jArr7 = this.f38717a;
                    int[] iArr2 = this.f38718b;
                    Object[] objArr2 = this.f38719c;
                    int i46 = this.f38720d;
                    g(d11);
                    long[] jArr8 = this.f38717a;
                    int[] iArr3 = this.f38718b;
                    Object[] objArr3 = this.f38719c;
                    int i47 = this.f38720d;
                    int i48 = 0;
                    while (i48 < i46) {
                        if (((jArr7[i48 >> 3] >> ((i48 & 7) << 3)) & 255) < 128) {
                            int i49 = iArr2[i48];
                            int hashCode3 = Integer.hashCode(i49) * i31;
                            int i51 = hashCode3 ^ (hashCode3 << 16);
                            int f12 = f(i51 >>> 7);
                            jArr = jArr8;
                            jArr2 = jArr7;
                            long j25 = i51 & 127;
                            int i52 = f12 >> 3;
                            int i53 = (f12 & 7) << 3;
                            long j26 = (jArr[i52] & (~(255 << i53))) | (j25 << i53);
                            jArr[i52] = j26;
                            jArr[(((f12 - 7) & i47) + (i47 & 7)) >> 3] = j26;
                            iArr3[f12] = i49;
                            objArr3[f12] = objArr2[i48];
                        } else {
                            jArr = jArr8;
                            jArr2 = jArr7;
                        }
                        i48++;
                        jArr7 = jArr2;
                        jArr8 = jArr;
                    }
                    f7 = f(i17);
                }
                this.f38721e++;
                int i54 = this.f38608f;
                long[] jArr9 = this.f38717a;
                int i55 = f7 >> 3;
                long j27 = jArr9[i55];
                int i56 = (f7 & 7) << 3;
                if (((j27 >> i56) & j11) == j12) {
                    i13 = i12;
                }
                this.f38608f = i54 - i13;
                int i57 = this.f38720d;
                long j28 = (j27 & (~(j11 << i56))) | (j14 << i56);
                jArr9[i55] = j28;
                jArr9[(((f7 - 7) & i57) + (i57 & 7)) >> 3] = j28;
                return f7;
            }
            i22 = i25 + 8;
            i21 = (i21 + i22) & i19;
            i18 = i28;
            i15 = i31;
            i14 = i27;
        }
    }

    private final int f(int i11) {
        int i12 = this.f38720d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f38717a;
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
        this.f38720d = max;
        if (max == 0) {
            jArr = W.f38661a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C7705l.z(jArr);
        }
        this.f38717a = jArr;
        int i12 = max >> 3;
        long j11 = 255 << ((max & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f38608f = W.c(this.f38720d) - this.f38721e;
        this.f38718b = new int[max];
        this.f38719c = new Object[max];
    }

    public final void d() {
        this.f38721e = 0;
        long[] jArr = this.f38717a;
        if (jArr != W.f38661a) {
            C7705l.z(jArr);
            long[] jArr2 = this.f38717a;
            int i11 = this.f38720d;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        C7705l.x(this.f38719c, null, 0, this.f38720d);
        this.f38608f = W.c(this.f38720d) - this.f38721e;
    }

    public final void h(int i11, TypedValue typedValue) {
        int e11 = e(i11);
        Object[] objArr = this.f38719c;
        Object obj = objArr[e11];
        this.f38718b[e11] = i11;
        objArr[e11] = typedValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V i(int i11) {
        int i12;
        int hashCode = Integer.hashCode(i11) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f38720d;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f38717a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j11 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j12 = (i14 * 72340172838076673L) ^ j11;
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j13 == 0) {
                    break;
                }
                i12 = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i15;
                if (this.f38718b[i12] == i11) {
                    break loop0;
                }
                j13 &= j13 - 1;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
        if (i12 < 0) {
            return null;
        }
        this.f38721e--;
        long[] jArr2 = this.f38717a;
        int i21 = this.f38720d;
        int i22 = i12 >> 3;
        int i23 = (i12 & 7) << 3;
        long j14 = (jArr2[i22] & (~(255 << i23))) | (254 << i23);
        jArr2[i22] = j14;
        jArr2[(((i12 - 7) & i21) + (i21 & 7)) >> 3] = j14;
        Object[] objArr = this.f38719c;
        V v11 = (V) objArr[i12];
        objArr[i12] = null;
        return v11;
    }

    public final void j(int i11, V v11) {
        int e11 = e(i11);
        this.f38718b[e11] = i11;
        this.f38719c[e11] = v11;
    }

    public C(int i11) {
        super(0);
        if (i11 >= 0) {
            g(W.f(i11));
        } else {
            k0.d.a("Capacity must be a positive value.");
            throw null;
        }
    }
}
