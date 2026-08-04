package com.google.crypto.tink.shaded.protobuf;

import W5.AbstractC0486a1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0831k extends L3.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteArrayInputStream f11791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f11792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11797i;
    public int j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public C0831k(ByteArrayInputStream byteArrayInputStream) {
        Charset charset = A.f11702a;
        this.f11791c = byteArrayInputStream;
        this.f11792d = new byte[4096];
        this.f11793e = 0;
        this.f11795g = 0;
        this.f11797i = 0;
    }

    @Override // L3.e
    public final String A() throws C {
        int iM = M();
        byte[] bArr = this.f11792d;
        if (iM > 0) {
            int i7 = this.f11793e;
            int i8 = this.f11795g;
            if (iM <= i7 - i8) {
                String str = new String(bArr, i8, iM, A.f11702a);
                this.f11795g += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM > this.f11793e) {
            return new String(H(iM), A.f11702a);
        }
        Q(iM);
        String str2 = new String(bArr, this.f11795g, iM, A.f11702a);
        this.f11795g += iM;
        return str2;
    }

    @Override // L3.e
    public final String B() throws IOException {
        int iM = M();
        int i7 = this.f11795g;
        int i8 = this.f11793e;
        int i9 = i8 - i7;
        byte[] bArrH = this.f11792d;
        if (iM <= i9 && iM > 0) {
            this.f11795g = i7 + iM;
        } else {
            if (iM == 0) {
                return "";
            }
            i7 = 0;
            if (iM <= i8) {
                Q(iM);
                this.f11795g = iM;
            } else {
                bArrH = H(iM);
            }
        }
        return r0.f11823a.t(bArrH, i7, iM);
    }

    @Override // L3.e
    public final int C() throws C {
        if (g()) {
            this.f11796h = 0;
            return 0;
        }
        int iM = M();
        this.f11796h = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw C.a();
    }

    @Override // L3.e
    public final int D() {
        return M();
    }

    @Override // L3.e
    public final long E() {
        return N();
    }

    public final byte[] H(int i7) throws IOException {
        byte[] bArrI = I(i7);
        if (bArrI != null) {
            return bArrI;
        }
        int i8 = this.f11795g;
        int i9 = this.f11793e;
        int length = i9 - i8;
        this.f11797i += i9;
        this.f11795g = 0;
        this.f11793e = 0;
        ArrayList<byte[]> arrayListJ = J(i7 - length);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f11792d, i8, bArr, 0, length);
        for (byte[] bArr2 : arrayListJ) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] I(int i7) throws IOException {
        if (i7 == 0) {
            return A.f11703b;
        }
        if (i7 < 0) {
            throw C.e();
        }
        int i8 = this.f11797i;
        int i9 = this.f11795g;
        int i10 = i8 + i9 + i7;
        if (i10 - com.google.android.gms.common.api.f.API_PRIORITY_OTHER > 0) {
            throw new C("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i11 = this.j;
        if (i10 > i11) {
            R((i11 - i8) - i9);
            throw C.g();
        }
        int i12 = this.f11793e - i9;
        int i13 = i7 - i12;
        ByteArrayInputStream byteArrayInputStream = this.f11791c;
        if (i13 >= 4096) {
            try {
                if (i13 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (C e7) {
                e7.f11704a = true;
                throw e7;
            }
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f11792d, this.f11795g, bArr, 0, i12);
        this.f11797i += this.f11793e;
        this.f11795g = 0;
        this.f11793e = 0;
        while (i12 < i7) {
            try {
                int i14 = byteArrayInputStream.read(bArr, i12, i7 - i12);
                if (i14 == -1) {
                    throw C.g();
                }
                this.f11797i += i14;
                i12 += i14;
            } catch (C e8) {
                e8.f11704a = true;
                throw e8;
            }
        }
        return bArr;
    }

    public final ArrayList J(int i7) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int iMin = Math.min(i7, 4096);
            byte[] bArr = new byte[iMin];
            int i8 = 0;
            while (i8 < iMin) {
                int i9 = this.f11791c.read(bArr, i8, iMin - i8);
                if (i9 == -1) {
                    throw C.g();
                }
                this.f11797i += i9;
                i8 += i9;
            }
            i7 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int K() throws C {
        int i7 = this.f11795g;
        if (this.f11793e - i7 < 4) {
            Q(4);
            i7 = this.f11795g;
        }
        this.f11795g = i7 + 4;
        byte[] bArr = this.f11792d;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long L() throws C {
        int i7 = this.f11795g;
        if (this.f11793e - i7 < 8) {
            Q(8);
            i7 = this.f11795g;
        }
        this.f11795g = i7 + 8;
        byte[] bArr = this.f11792d;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public final int M() {
        int i7;
        int i8 = this.f11795g;
        int i9 = this.f11793e;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f11792d;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.f11795g = i10;
                return b7;
            }
            if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b7;
                if (i12 < 0) {
                    i7 = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i7 = i14 ^ 16256;
                    } else {
                        int i15 = i8 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i7 = (-2080896) ^ i16;
                        } else {
                            i13 = i8 + 5;
                            byte b8 = bArr[i15];
                            int i17 = (i16 ^ (b8 << 28)) ^ 266354560;
                            if (b8 < 0) {
                                i15 = i8 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i8 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i8 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i8 + 9;
                                            if (bArr[i15] < 0) {
                                                int i18 = i8 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i11 = i18;
                                                    i7 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i17;
                            }
                            i7 = i17;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.f11795g = i11;
                return i7;
            }
        }
        return (int) O();
    }

    public final long N() {
        long j;
        long j3;
        long j7;
        long j8;
        int i7 = this.f11795g;
        int i8 = this.f11793e;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f11792d;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.f11795g = i9;
                return b7;
            }
            if (i8 - i9 >= 9) {
                int i10 = i7 + 2;
                int i11 = (bArr[i9] << 7) ^ b7;
                if (i11 < 0) {
                    j = i11 ^ (-128);
                } else {
                    int i12 = i7 + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        j = i13 ^ 16256;
                        i10 = i12;
                    } else {
                        int i14 = i7 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            j8 = (-2080896) ^ i15;
                        } else {
                            long j9 = i15;
                            i10 = i7 + 5;
                            long j10 = j9 ^ (((long) bArr[i14]) << 28);
                            if (j10 >= 0) {
                                j7 = 266354560;
                            } else {
                                i14 = i7 + 6;
                                long j11 = j10 ^ (((long) bArr[i10]) << 35);
                                if (j11 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i10 = i7 + 7;
                                    j10 = j11 ^ (((long) bArr[i14]) << 42);
                                    if (j10 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i14 = i7 + 8;
                                        j11 = j10 ^ (((long) bArr[i10]) << 49);
                                        if (j11 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i10 = i7 + 9;
                                            long j12 = (j11 ^ (((long) bArr[i14]) << 56)) ^ 71499008037633920L;
                                            if (j12 < 0) {
                                                int i16 = i7 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i10 = i16;
                                                }
                                            }
                                            j = j12;
                                        }
                                    }
                                }
                                j8 = j3 ^ j11;
                            }
                            j = j7 ^ j10;
                        }
                        i10 = i14;
                        j = j8;
                    }
                }
                this.f11795g = i10;
                return j;
            }
        }
        return O();
    }

    public final long O() throws C {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.f11795g == this.f11793e) {
                Q(1);
            }
            int i8 = this.f11795g;
            this.f11795g = i8 + 1;
            byte b7 = this.f11792d[i8];
            j |= ((long) (b7 & 127)) << i7;
            if ((b7 & 128) == 0) {
                return j;
            }
        }
        throw C.d();
    }

    public final void P() {
        int i7 = this.f11793e + this.f11794f;
        this.f11793e = i7;
        int i8 = this.f11797i + i7;
        int i9 = this.j;
        if (i8 <= i9) {
            this.f11794f = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f11794f = i10;
        this.f11793e = i7 - i10;
    }

    public final void Q(int i7) throws C {
        if (S(i7)) {
            return;
        }
        if (i7 <= (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.f11797i) - this.f11795g) {
            throw C.g();
        }
        throw new C("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void R(int i7) throws C {
        int i8 = this.f11793e;
        int i9 = this.f11795g;
        int i10 = i8 - i9;
        if (i7 <= i10 && i7 >= 0) {
            this.f11795g = i9 + i7;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.f11791c;
        if (i7 < 0) {
            throw C.e();
        }
        int i11 = this.f11797i;
        int i12 = i11 + i9;
        int i13 = i12 + i7;
        int i14 = this.j;
        if (i13 > i14) {
            R((i14 - i11) - i9);
            throw C.g();
        }
        this.f11797i = i12;
        this.f11793e = 0;
        this.f11795g = 0;
        while (i10 < i7) {
            long j = i7 - i10;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i10 += (int) jSkip;
                    }
                } catch (C e7) {
                    e7.f11704a = true;
                    throw e7;
                }
            } catch (Throwable th) {
                this.f11797i += i10;
                P();
                throw th;
            }
        }
        this.f11797i += i10;
        P();
        if (i10 >= i7) {
            return;
        }
        int i15 = this.f11793e;
        int i16 = i15 - this.f11795g;
        this.f11795g = i15;
        Q(1);
        while (true) {
            int i17 = i7 - i16;
            int i18 = this.f11793e;
            if (i17 <= i18) {
                this.f11795g = i17;
                return;
            } else {
                i16 += i18;
                this.f11795g = i18;
                Q(1);
            }
        }
    }

    public final boolean S(int i7) throws IOException {
        int i8 = this.f11795g;
        int i9 = i8 + i7;
        int i10 = this.f11793e;
        if (i9 <= i10) {
            throw new IllegalStateException(AbstractC0486a1.f(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i11 = this.f11797i;
        if (i7 > (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i11) - i8 || i11 + i8 + i7 > this.j) {
            return false;
        }
        byte[] bArr = this.f11792d;
        if (i8 > 0) {
            if (i10 > i8) {
                System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
            }
            this.f11797i += i8;
            this.f11793e -= i8;
            this.f11795g = 0;
        }
        int i12 = this.f11793e;
        int iMin = Math.min(bArr.length - i12, (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.f11797i) - i12);
        ByteArrayInputStream byteArrayInputStream = this.f11791c;
        try {
            int i13 = byteArrayInputStream.read(bArr, i12, iMin);
            if (i13 == 0 || i13 < -1 || i13 > bArr.length) {
                throw new IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + i13 + "\nThe InputStream implementation is buggy.");
            }
            if (i13 <= 0) {
                return false;
            }
            this.f11793e += i13;
            P();
            if (this.f11793e >= i7) {
                return true;
            }
            return S(i7);
        } catch (C e7) {
            e7.f11704a = true;
            throw e7;
        }
    }

    @Override // L3.e
    public final void b(int i7) throws C {
        if (this.f11796h != i7) {
            throw new C("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // L3.e
    public final int f() {
        return this.f11797i + this.f11795g;
    }

    @Override // L3.e
    public final boolean g() {
        return this.f11795g == this.f11793e && !S(1);
    }

    @Override // L3.e
    public final void j(int i7) {
        this.j = i7;
        P();
    }

    @Override // L3.e
    public final int l(int i7) throws C {
        if (i7 < 0) {
            throw C.e();
        }
        int i8 = this.f11797i + this.f11795g + i7;
        int i9 = this.j;
        if (i8 > i9) {
            throw C.g();
        }
        this.j = i8;
        P();
        return i9;
    }

    @Override // L3.e
    public final boolean m() {
        return N() != 0;
    }

    @Override // L3.e
    public final C0828h o() throws IOException {
        int iM = M();
        int i7 = this.f11793e;
        int i8 = this.f11795g;
        int i9 = i7 - i8;
        byte[] bArr = this.f11792d;
        if (iM <= i9 && iM > 0) {
            C0828h c0828hT = AbstractC0829i.t(bArr, i8, iM);
            this.f11795g += iM;
            return c0828hT;
        }
        if (iM == 0) {
            return AbstractC0829i.f11779b;
        }
        byte[] bArrI = I(iM);
        if (bArrI != null) {
            return AbstractC0829i.t(bArrI, 0, bArrI.length);
        }
        int i10 = this.f11795g;
        int i11 = this.f11793e;
        int length = i11 - i10;
        this.f11797i += i11;
        this.f11795g = 0;
        this.f11793e = 0;
        ArrayList<byte[]> arrayListJ = J(iM - length);
        byte[] bArr2 = new byte[iM];
        System.arraycopy(bArr, i10, bArr2, 0, length);
        for (byte[] bArr3 : arrayListJ) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0828h c0828h = AbstractC0829i.f11779b;
        return new C0828h(bArr2);
    }

    @Override // L3.e
    public final double p() {
        return Double.longBitsToDouble(L());
    }

    @Override // L3.e
    public final int q() {
        return M();
    }

    @Override // L3.e
    public final int r() {
        return K();
    }

    @Override // L3.e
    public final long s() {
        return L();
    }

    @Override // L3.e
    public final float t() {
        return Float.intBitsToFloat(K());
    }

    @Override // L3.e
    public final int u() {
        return M();
    }

    @Override // L3.e
    public final long v() {
        return N();
    }

    @Override // L3.e
    public final int w() {
        return K();
    }

    @Override // L3.e
    public final long x() {
        return L();
    }

    @Override // L3.e
    public final int y() {
        return L3.e.d(M());
    }

    @Override // L3.e
    public final long z() {
        return L3.e.e(N());
    }
}
