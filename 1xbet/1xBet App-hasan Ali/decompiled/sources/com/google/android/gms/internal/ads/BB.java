package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class BB extends AbstractC1674uy {

    /* renamed from: m, reason: collision with root package name */
    public final InputStream f7785m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f7786n;

    /* renamed from: o, reason: collision with root package name */
    public int f7787o;

    /* renamed from: p, reason: collision with root package name */
    public int f7788p;

    /* renamed from: q, reason: collision with root package name */
    public int f7789q;

    /* renamed from: r, reason: collision with root package name */
    public int f7790r;

    /* renamed from: s, reason: collision with root package name */
    public int f7791s;

    /* renamed from: t, reason: collision with root package name */
    public int f7792t = Integer.MAX_VALUE;

    public /* synthetic */ BB(InputStream inputStream) {
        Charset charset = VB.f11871a;
        this.f7785m = inputStream;
        this.f7786n = new byte[4096];
        this.f7787o = 0;
        this.f7789q = 0;
        this.f7791s = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final long A() {
        return R();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final long B() {
        return AbstractC1674uy.i(S());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final long C() {
        return S();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final C1733wB D() {
        int Q5 = Q();
        int i = this.f7787o;
        int i5 = this.f7789q;
        int i6 = i - i5;
        byte[] bArr = this.f7786n;
        if (Q5 <= i6 && Q5 > 0) {
            C1733wB r5 = AbstractC1823yB.r(bArr, i5, Q5);
            this.f7789q += Q5;
            return r5;
        }
        if (Q5 == 0) {
            return AbstractC1823yB.f16414l;
        }
        if (Q5 < 0) {
            throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] O5 = O(Q5);
        if (O5 != null) {
            return AbstractC1823yB.r(O5, 0, O5.length);
        }
        int i7 = this.f7789q;
        int i8 = this.f7787o;
        int i9 = i8 - i7;
        this.f7791s += i8;
        this.f7789q = 0;
        this.f7787o = 0;
        ArrayList J = J(Q5 - i9);
        byte[] bArr2 = new byte[Q5];
        System.arraycopy(bArr, i7, bArr2, 0, i9);
        int size = J.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = J.get(i10);
            i10++;
            byte[] bArr3 = (byte[]) obj;
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i9, length);
            i9 += length;
        }
        return new C1733wB(bArr2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final String E() {
        int Q5 = Q();
        byte[] bArr = this.f7786n;
        if (Q5 > 0) {
            int i = this.f7787o;
            int i5 = this.f7789q;
            if (Q5 <= i - i5) {
                String str = new String(bArr, i5, Q5, VB.f11871a);
                this.f7789q += Q5;
                return str;
            }
        }
        if (Q5 == 0) {
            return "";
        }
        if (Q5 < 0) {
            throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (Q5 > this.f7787o) {
            return new String(N(Q5), VB.f11871a);
        }
        L(Q5);
        String str2 = new String(bArr, this.f7789q, Q5, VB.f11871a);
        this.f7789q += Q5;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final String F() {
        int Q5 = Q();
        int i = this.f7789q;
        int i5 = this.f7787o;
        int i6 = i5 - i;
        byte[] bArr = this.f7786n;
        if (Q5 <= i6 && Q5 > 0) {
            this.f7789q = i + Q5;
        } else {
            if (Q5 == 0) {
                return "";
            }
            if (Q5 < 0) {
                throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (Q5 <= i5) {
                L(Q5);
                this.f7789q = Q5;
            } else {
                bArr = N(Q5);
            }
        }
        EC.f8472a.getClass();
        return Fz.m(bArr, i, Q5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final void G() {
        if (this.f7790r != 0) {
            throw new XB("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final void H(int i) {
        this.f7792t = i;
        K();
    }

    public final void I(int i) {
        InputStream inputStream = this.f7785m;
        int i5 = this.f7787o;
        int i6 = this.f7789q;
        int i7 = i5 - i6;
        if (i <= i7 && i >= 0) {
            this.f7789q = i6 + i;
            return;
        }
        if (i < 0) {
            throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i8 = this.f7791s;
        int i9 = i8 + i6;
        int i10 = this.f7792t;
        if (i9 + i > i10) {
            I((i10 - i8) - i6);
            throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f7791s = i9;
        this.f7787o = 0;
        this.f7789q = 0;
        while (i7 < i) {
            long j5 = i - i7;
            try {
                try {
                    long skip = inputStream.skip(j5);
                    if (skip < 0 || skip > j5) {
                        throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i7 += (int) skip;
                    }
                } catch (XB e3) {
                    e3.f12158k = true;
                    throw e3;
                }
            } catch (Throwable th) {
                this.f7791s += i7;
                K();
                throw th;
            }
        }
        this.f7791s += i7;
        K();
        if (i7 >= i) {
            return;
        }
        int i11 = this.f7787o;
        int i12 = i11 - this.f7789q;
        this.f7789q = i11;
        L(1);
        while (true) {
            int i13 = i - i12;
            int i14 = this.f7787o;
            if (i13 <= i14) {
                this.f7789q = i13;
                return;
            } else {
                i12 += i14;
                this.f7789q = i14;
                L(1);
            }
        }
    }

    public final ArrayList J(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i5 = 0;
            while (i5 < min) {
                int read = this.f7785m.read(bArr, i5, min - i5);
                if (read == -1) {
                    throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f7791s += read;
                i5 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void K() {
        int i = this.f7787o + this.f7788p;
        this.f7787o = i;
        int i5 = this.f7791s + i;
        int i6 = this.f7792t;
        if (i5 <= i6) {
            this.f7788p = 0;
            return;
        }
        int i7 = i5 - i6;
        this.f7788p = i7;
        this.f7787o = i - i7;
    }

    public final void L(int i) {
        if (M(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f7791s) - this.f7789q) {
            throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new XB("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final boolean M(int i) {
        InputStream inputStream = this.f7785m;
        int i5 = this.f7789q;
        int i6 = i5 + i;
        int i7 = this.f7787o;
        if (i6 <= i7) {
            throw new IllegalStateException(L1.a.l(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i8 = this.f7791s;
        if (i > (Integer.MAX_VALUE - i8) - i5 || i8 + i5 + i > this.f7792t) {
            return false;
        }
        byte[] bArr = this.f7786n;
        if (i5 > 0) {
            if (i7 > i5) {
                System.arraycopy(bArr, i5, bArr, 0, i7 - i5);
            }
            i8 = this.f7791s + i5;
            this.f7791s = i8;
            i7 = this.f7787o - i5;
            this.f7787o = i7;
            this.f7789q = 0;
        }
        try {
            int read = inputStream.read(bArr, i7, Math.min(4096 - i7, (Integer.MAX_VALUE - i8) - i7));
            if (read == 0 || read < -1 || read > 4096) {
                throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f7787o += read;
            K();
            if (this.f7787o >= i) {
                return true;
            }
            return M(i);
        } catch (XB e3) {
            e3.f12158k = true;
            throw e3;
        }
    }

    public final byte[] N(int i) {
        byte[] O5 = O(i);
        if (O5 != null) {
            return O5;
        }
        int i5 = this.f7789q;
        int i6 = this.f7787o;
        int i7 = i6 - i5;
        this.f7791s += i6;
        this.f7789q = 0;
        this.f7787o = 0;
        ArrayList J = J(i - i7);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f7786n, i5, bArr, 0, i7);
        int size = J.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = J.get(i8);
            i8++;
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i7, length);
            i7 += length;
        }
        return bArr;
    }

    public final byte[] O(int i) {
        if (i == 0) {
            return VB.f11872b;
        }
        int i5 = this.f7791s;
        int i6 = this.f7789q;
        int i7 = i5 + i6 + i;
        if ((-2147483647) + i7 > 0) {
            throw new XB("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i8 = this.f7792t;
        if (i7 > i8) {
            I((i8 - i5) - i6);
            throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i9 = this.f7787o - i6;
        int i10 = i - i9;
        InputStream inputStream = this.f7785m;
        if (i10 >= 4096) {
            try {
                if (i10 > inputStream.available()) {
                    return null;
                }
            } catch (XB e3) {
                e3.f12158k = true;
                throw e3;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f7786n, this.f7789q, bArr, 0, i9);
        this.f7791s += this.f7787o;
        this.f7789q = 0;
        this.f7787o = 0;
        while (i9 < i) {
            try {
                int read = inputStream.read(bArr, i9, i - i9);
                if (read == -1) {
                    throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f7791s += read;
                i9 += read;
            } catch (XB e5) {
                e5.f12158k = true;
                throw e5;
            }
        }
        return bArr;
    }

    public final int P() {
        int i = this.f7789q;
        if (this.f7787o - i < 4) {
            L(4);
            i = this.f7789q;
        }
        this.f7789q = i + 4;
        byte[] bArr = this.f7786n;
        int i5 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i7 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i6 << 8) | i5 | (i7 << 16);
    }

    public final int Q() {
        int i;
        int i5 = this.f7789q;
        int i6 = this.f7787o;
        if (i6 != i5) {
            int i7 = i5 + 1;
            byte[] bArr = this.f7786n;
            byte b3 = bArr[i5];
            if (b3 >= 0) {
                this.f7789q = i7;
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
                this.f7789q = i8;
                return i;
            }
        }
        return (int) T();
    }

    public final long R() {
        int i = this.f7789q;
        if (this.f7787o - i < 8) {
            L(8);
            i = this.f7789q;
        }
        this.f7789q = i + 8;
        byte[] bArr = this.f7786n;
        long j5 = bArr[i];
        long j6 = bArr[i + 2];
        long j7 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j5 & 255) | ((bArr[i + 1] & 255) << 8) | ((j6 & 255) << 16) | ((j7 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    public final long S() {
        long j5;
        long j6;
        long j7;
        long j8;
        int i = this.f7789q;
        int i5 = this.f7787o;
        if (i5 != i) {
            int i6 = i + 1;
            byte[] bArr = this.f7786n;
            byte b3 = bArr[i];
            if (b3 >= 0) {
                this.f7789q = i6;
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
                this.f7789q = i7;
                return j6;
            }
        }
        return T();
    }

    public final long T() {
        long j5 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f7789q == this.f7787o) {
                L(1);
            }
            int i5 = this.f7789q;
            this.f7789q = i5 + 1;
            j5 |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f7786n[i5] & 128) == 0) {
                return j5;
            }
        }
        throw new XB("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final boolean f() {
        return this.f7789q == this.f7787o && !M(1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final boolean g() {
        return S() != 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final double k() {
        return Double.longBitsToDouble(R());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final float m() {
        return Float.intBitsToFloat(P());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int o() {
        return this.f7791s + this.f7789q;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int q(int i) {
        if (i < 0) {
            throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.f7791s + this.f7789q + i;
        if (i5 < 0) {
            throw new XB("Failed to parse the message.");
        }
        int i6 = this.f7792t;
        if (i5 > i6) {
            throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f7792t = i5;
        K();
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int r() {
        return Q();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int s() {
        return P();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int t() {
        return Q();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int u() {
        return P();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int v() {
        return AbstractC1674uy.h(Q());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int w() {
        if (f()) {
            this.f7790r = 0;
            return 0;
        }
        int Q5 = Q();
        this.f7790r = Q5;
        if ((Q5 >>> 3) != 0) {
            return Q5;
        }
        throw new XB("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int x() {
        return Q();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final long y() {
        return R();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final long z() {
        return S();
    }
}
