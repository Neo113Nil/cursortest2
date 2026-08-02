package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.zB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1868zB extends AbstractC1674uy {

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f16555m;

    /* renamed from: n, reason: collision with root package name */
    public int f16556n;

    /* renamed from: o, reason: collision with root package name */
    public int f16557o;

    /* renamed from: p, reason: collision with root package name */
    public int f16558p;

    /* renamed from: q, reason: collision with root package name */
    public final int f16559q;

    /* renamed from: r, reason: collision with root package name */
    public int f16560r;

    /* renamed from: s, reason: collision with root package name */
    public int f16561s = Integer.MAX_VALUE;

    public /* synthetic */ C1868zB(byte[] bArr, int i, int i5) {
        this.f16555m = bArr;
        this.f16556n = i5 + i;
        this.f16558p = i;
        this.f16559q = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final long A() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final long B() {
        return AbstractC1674uy.i(M());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final long C() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final C1733wB D() {
        int K = K();
        byte[] bArr = this.f16555m;
        if (K > 0) {
            int i = this.f16556n;
            int i5 = this.f16558p;
            if (K <= i - i5) {
                C1733wB r5 = AbstractC1823yB.r(bArr, i5, K);
                this.f16558p += K;
                return r5;
            }
        }
        if (K == 0) {
            return AbstractC1823yB.f16414l;
        }
        if (K > 0) {
            int i6 = this.f16556n;
            int i7 = this.f16558p;
            if (K <= i6 - i7) {
                int i8 = K + i7;
                this.f16558p = i8;
                return new C1733wB(Arrays.copyOfRange(bArr, i7, i8));
            }
        }
        if (K <= 0) {
            throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final String E() {
        int K = K();
        if (K > 0) {
            int i = this.f16556n;
            int i5 = this.f16558p;
            if (K <= i - i5) {
                String str = new String(this.f16555m, i5, K, VB.f11871a);
                this.f16558p += K;
                return str;
            }
        }
        if (K == 0) {
            return "";
        }
        if (K < 0) {
            throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final String F() {
        int K = K();
        if (K > 0) {
            int i = this.f16556n;
            int i5 = this.f16558p;
            if (K <= i - i5) {
                EC.f8472a.getClass();
                String m5 = Fz.m(this.f16555m, i5, K);
                this.f16558p += K;
                return m5;
            }
        }
        if (K == 0) {
            return "";
        }
        if (K <= 0) {
            throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final void G() {
        if (this.f16560r != 0) {
            throw new XB("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final void H(int i) {
        this.f16561s = i;
        I();
    }

    public final void I() {
        int i = this.f16556n + this.f16557o;
        this.f16556n = i;
        int i5 = i - this.f16559q;
        int i6 = this.f16561s;
        if (i5 <= i6) {
            this.f16557o = 0;
            return;
        }
        int i7 = i5 - i6;
        this.f16557o = i7;
        this.f16556n = i - i7;
    }

    public final int J() {
        int i = this.f16558p;
        if (this.f16556n - i < 4) {
            throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f16558p = i + 4;
        byte[] bArr = this.f16555m;
        int i5 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i7 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i6 << 8) | i5 | (i7 << 16);
    }

    public final int K() {
        int i;
        int i5 = this.f16558p;
        int i6 = this.f16556n;
        if (i6 != i5) {
            int i7 = i5 + 1;
            byte[] bArr = this.f16555m;
            byte b3 = bArr[i5];
            if (b3 >= 0) {
                this.f16558p = i7;
                return b3;
            }
            if (i6 - i7 >= 9) {
                int i8 = i5 + 2;
                int i9 = (bArr[i7] << 7) ^ b3;
                if (i9 < 0) {
                    i = i9 ^ (-128);
                } else {
                    int i10 = i5 + 3;
                    int i11 = (bArr[i8] << 14) ^ i9;
                    if (i11 >= 0) {
                        i = i11 ^ 16256;
                    } else {
                        int i12 = i5 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        if (i13 < 0) {
                            i = (-2080896) ^ i13;
                        } else {
                            i10 = i5 + 5;
                            byte b5 = bArr[i12];
                            int i14 = (i13 ^ (b5 << 28)) ^ 266354560;
                            if (b5 < 0) {
                                i12 = i5 + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i5 + 7;
                                    if (bArr[i12] < 0) {
                                        i12 = i5 + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i5 + 9;
                                            if (bArr[i12] < 0) {
                                                int i15 = i5 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i8 = i15;
                                                    i = i14;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i14;
                            }
                            i = i14;
                        }
                        i8 = i12;
                    }
                    i8 = i10;
                }
                this.f16558p = i8;
                return i;
            }
        }
        return (int) N();
    }

    public final long L() {
        int i = this.f16558p;
        if (this.f16556n - i < 8) {
            throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f16558p = i + 8;
        byte[] bArr = this.f16555m;
        long j5 = bArr[i];
        long j6 = bArr[i + 2];
        long j7 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j5 & 255) | ((bArr[i + 1] & 255) << 8) | ((j6 & 255) << 16) | ((j7 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    public final long M() {
        long j5;
        long j6;
        long j7;
        long j8;
        int i = this.f16558p;
        int i5 = this.f16556n;
        if (i5 != i) {
            int i6 = i + 1;
            byte[] bArr = this.f16555m;
            byte b3 = bArr[i];
            if (b3 >= 0) {
                this.f16558p = i6;
                return b3;
            }
            if (i5 - i6 >= 9) {
                int i7 = i + 2;
                int i8 = (bArr[i6] << 7) ^ b3;
                if (i8 < 0) {
                    j6 = i8 ^ (-128);
                } else {
                    int i9 = i + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        j6 = i10 ^ 16256;
                    } else {
                        int i11 = i + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            long j9 = (-2080896) ^ i12;
                            i7 = i11;
                            j6 = j9;
                        } else {
                            i9 = i + 5;
                            long j10 = i12 ^ (bArr[i11] << 28);
                            if (j10 >= 0) {
                                j8 = 266354560;
                            } else {
                                int i13 = i + 6;
                                long j11 = j10 ^ (bArr[i9] << 35);
                                if (j11 < 0) {
                                    j7 = -34093383808L;
                                } else {
                                    i9 = i + 7;
                                    j10 = j11 ^ (bArr[i13] << 42);
                                    if (j10 >= 0) {
                                        j8 = 4363953127296L;
                                    } else {
                                        i13 = i + 8;
                                        j11 = j10 ^ (bArr[i9] << 49);
                                        if (j11 < 0) {
                                            j7 = -558586000294016L;
                                        } else {
                                            i9 = i + 9;
                                            j5 = (j11 ^ (bArr[i13] << 56)) ^ 71499008037633920L;
                                            if (j5 < 0) {
                                                int i14 = i + 10;
                                                if (bArr[i9] >= 0) {
                                                    j6 = j5;
                                                    i7 = i14;
                                                }
                                            }
                                            j6 = j5;
                                        }
                                    }
                                }
                                j6 = j11 ^ j7;
                                i7 = i13;
                            }
                            j5 = j10 ^ j8;
                            j6 = j5;
                        }
                    }
                    i7 = i9;
                }
                this.f16558p = i7;
                return j6;
            }
        }
        return N();
    }

    public final long N() {
        long j5 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i5 = this.f16558p;
            if (i5 == this.f16556n) {
                throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f16558p = i5 + 1;
            j5 |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f16555m[i5] & 128) == 0) {
                return j5;
            }
        }
        throw new XB("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final boolean f() {
        return this.f16558p == this.f16556n;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final boolean g() {
        return M() != 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final double k() {
        return Double.longBitsToDouble(L());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final float m() {
        return Float.intBitsToFloat(J());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int o() {
        return this.f16558p - this.f16559q;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int q(int i) {
        if (i < 0) {
            throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = (this.f16558p - this.f16559q) + i;
        if (i5 < 0) {
            throw new XB("Failed to parse the message.");
        }
        int i6 = this.f16561s;
        if (i5 > i6) {
            throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f16561s = i5;
        I();
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int r() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int s() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int t() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int u() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int v() {
        return AbstractC1674uy.h(K());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int w() {
        if (f()) {
            this.f16560r = 0;
            return 0;
        }
        int K = K();
        this.f16560r = K;
        if ((K >>> 3) != 0) {
            return K;
        }
        throw new XB("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int x() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final long y() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final long z() {
        return M();
    }
}
