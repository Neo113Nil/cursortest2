package androidx.collection;

import Sc.C;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class I<K> extends O<K> {

    /* renamed from: f, reason: collision with root package name */
    private int f38614f;

    public I() {
        this((Object) null);
    }

    private final int c(int i11) {
        int i12 = this.f38642d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f38639a;
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

    private final int d(K k11) {
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        int i11 = 1;
        int i12 = -862048943;
        int hashCode = (k11 != null ? k11.hashCode() : 0) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f38642d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr3 = this.f38639a;
            int i19 = i17 >> 3;
            int i21 = (i17 & 7) << 3;
            int i22 = i11;
            long j13 = (((-i21) >> 63) & (jArr3[i19 + i11] << (64 - i21))) | (jArr3[i19] >>> i21);
            long j14 = i15;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (j15 - 72340172838076673L) & (~j15) & (-9187201950435737472L);
            while (j16 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i17) & i16;
                int i23 = i12;
                if (Intrinsics.d(this.f38640b[numberOfTrailingZeros], k11)) {
                    return numberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i12 = i23;
            }
            int i24 = i12;
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                int c11 = c(i14);
                long j17 = 255;
                if (this.f38614f != 0 || ((this.f38639a[c11 >> 3] >> ((c11 & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    j12 = 128;
                } else {
                    int i25 = this.f38642d;
                    if (i25 > 8) {
                        long j18 = this.f38643e;
                        C.Companion companion = Sc.C.INSTANCE;
                        boolean z11 = 8;
                        j12 = 128;
                        if (Long.compareUnsigned(j18 * 32, i25 * 25) <= 0) {
                            long[] jArr4 = this.f38639a;
                            int i26 = this.f38642d;
                            Object[] objArr = this.f38640b;
                            int[] iArr = this.f38641c;
                            W.a(jArr4, i26);
                            int i27 = 0;
                            int i28 = -1;
                            while (i27 != i26) {
                                int i29 = i27 >> 3;
                                int i31 = (i27 & 7) << 3;
                                long j19 = (jArr4[i29] >> i31) & j17;
                                if (j19 == 128) {
                                    i28 = i27;
                                    i27++;
                                } else if (j19 != 254) {
                                    i27++;
                                } else {
                                    Object obj = objArr[i27];
                                    int hashCode2 = (obj != null ? obj.hashCode() : 0) * i24;
                                    boolean z12 = z11;
                                    int i32 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int c12 = c(i32);
                                    int i33 = i32 & i26;
                                    long j21 = j17;
                                    if (((c12 - i33) & i26) / 8 == ((i27 - i33) & i26) / 8) {
                                        jArr4[i29] = (jArr4[i29] & (~(j21 << i31))) | ((r23 & 127) << i31);
                                        Intrinsics.checkNotNullParameter(jArr4, "<this>");
                                        jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    } else {
                                        int i34 = c12 >> 3;
                                        long j22 = jArr4[i34];
                                        int i35 = (c12 & 7) << 3;
                                        if (((j22 >> i35) & j21) == 128) {
                                            jArr4[i34] = (j22 & (~(j21 << i35))) | ((r23 & 127) << i35);
                                            jArr4[i29] = (jArr4[i29] & (~(j21 << i31))) | (128 << i31);
                                            objArr[c12] = objArr[i27];
                                            objArr[i27] = null;
                                            iArr[c12] = iArr[i27];
                                            iArr[i27] = 0;
                                            i28 = i27;
                                        } else {
                                            jArr4[i34] = ((r23 & 127) << i35) | (j22 & (~(j21 << i35)));
                                            if (i28 == -1) {
                                                i28 = W.b(jArr4, i27 + 1, i26);
                                            }
                                            objArr[i28] = objArr[c12];
                                            objArr[c12] = objArr[i27];
                                            objArr[i27] = objArr[i28];
                                            iArr[i28] = iArr[c12];
                                            iArr[c12] = iArr[i27];
                                            iArr[i27] = iArr[i28];
                                            i27--;
                                        }
                                        Intrinsics.checkNotNullParameter(jArr4, "<this>");
                                        jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    }
                                    i27++;
                                    z11 = z12;
                                    j17 = j21;
                                }
                            }
                            j11 = j17;
                            this.f38614f = W.c(this.f38642d) - this.f38643e;
                            c11 = c(i14);
                        }
                    } else {
                        j12 = 128;
                    }
                    j11 = 255;
                    int d11 = W.d(this.f38642d);
                    long[] jArr5 = this.f38639a;
                    Object[] objArr2 = this.f38640b;
                    int[] iArr2 = this.f38641c;
                    int i36 = this.f38642d;
                    e(d11);
                    long[] jArr6 = this.f38639a;
                    Object[] objArr3 = this.f38640b;
                    int[] iArr3 = this.f38641c;
                    int i37 = this.f38642d;
                    int i38 = 0;
                    while (i38 < i36) {
                        if (((jArr5[i38 >> 3] >> ((i38 & 7) << 3)) & 255) < j12) {
                            Object obj2 = objArr2[i38];
                            int hashCode3 = (obj2 != null ? obj2.hashCode() : 0) * i24;
                            int i39 = hashCode3 ^ (hashCode3 << 16);
                            int c13 = c(i39 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j23 = i39 & 127;
                            int i41 = c13 >> 3;
                            int i42 = (c13 & 7) << 3;
                            long j24 = (jArr[i41] & (~(255 << i42))) | (j23 << i42);
                            jArr[i41] = j24;
                            jArr[(((c13 - 7) & i37) + (i37 & 7)) >> 3] = j24;
                            objArr3[c13] = obj2;
                            iArr3[c13] = iArr2[i38];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i38++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    c11 = c(i14);
                }
                this.f38643e++;
                int i43 = this.f38614f;
                long[] jArr7 = this.f38639a;
                int i44 = c11 >> 3;
                long j25 = jArr7[i44];
                int i45 = (c11 & 7) << 3;
                if (((j25 >> i45) & j11) != j12) {
                    i22 = 0;
                }
                this.f38614f = i43 - i22;
                int i46 = this.f38642d;
                long j26 = (j25 & (~(j11 << i45))) | (j14 << i45);
                jArr7[i44] = j26;
                jArr7[(((c11 - 7) & i46) + (i46 & 7)) >> 3] = j26;
                return ~c11;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i11 = i22;
            i12 = i24;
        }
    }

    private final void e(int i11) {
        long[] jArr;
        int max = i11 > 0 ? Math.max(7, W.e(i11)) : 0;
        this.f38642d = max;
        if (max == 0) {
            jArr = W.f38661a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C7705l.z(jArr);
        }
        this.f38639a = jArr;
        int i12 = max >> 3;
        long j11 = 255 << ((max & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f38614f = W.c(this.f38642d) - this.f38643e;
        this.f38640b = new Object[max];
        this.f38641c = new int[max];
    }

    public final int f(int i11, Object obj) {
        int i12;
        int d11 = d(obj);
        if (d11 < 0) {
            d11 = ~d11;
            i12 = -1;
        } else {
            i12 = this.f38641c[d11];
        }
        this.f38640b[d11] = obj;
        this.f38641c[d11] = i11;
        return i12;
    }

    public final void g(int i11) {
        this.f38643e--;
        long[] jArr = this.f38639a;
        int i12 = this.f38642d;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j11 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j11;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j11;
        this.f38640b[i11] = null;
    }

    public final void h(int i11, Object obj) {
        int d11 = d(obj);
        if (d11 < 0) {
            d11 = ~d11;
        }
        this.f38640b[d11] = obj;
        this.f38641c[d11] = i11;
    }

    public /* synthetic */ I(Object obj) {
        this(6);
    }

    public I(int i11) {
        super(0);
        if (i11 >= 0) {
            e(W.f(i11));
        } else {
            k0.d.a("Capacity must be a positive value.");
            throw null;
        }
    }
}
