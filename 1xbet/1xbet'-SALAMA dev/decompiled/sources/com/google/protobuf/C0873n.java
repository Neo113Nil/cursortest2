package com.google.protobuf;

import W5.AbstractC0486a1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0873n extends H6.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12235A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f12236B = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InputStream f12237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f12238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12239f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12240x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12241y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12242z;

    public C0873n(InputStream inputStream) {
        Charset charset = K.f12112a;
        this.f12237d = inputStream;
        this.f12238e = new byte[4096];
        this.f12239f = 0;
        this.f12241y = 0;
        this.f12235A = 0;
    }

    @Override // H6.b
    public final int A() throws M {
        if (f()) {
            this.f12242z = 0;
            return 0;
        }
        int iJ = J();
        this.f12242z = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw M.b();
    }

    @Override // H6.b
    public final int B() {
        return J();
    }

    @Override // H6.b
    public final long C() {
        return K();
    }

    @Override // H6.b
    public final boolean D(int i7) throws M {
        int iA;
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            int i10 = this.f12239f - this.f12241y;
            byte[] bArr = this.f12238e;
            if (i10 >= 10) {
                while (i9 < 10) {
                    int i11 = this.f12241y;
                    this.f12241y = i11 + 1;
                    if (bArr[i11] < 0) {
                        i9++;
                    }
                }
                throw M.e();
            }
            while (i9 < 10) {
                if (this.f12241y == this.f12239f) {
                    N(1);
                }
                int i12 = this.f12241y;
                this.f12241y = i12 + 1;
                if (bArr[i12] < 0) {
                    i9++;
                }
            }
            throw M.e();
            return true;
        }
        if (i8 == 1) {
            O(8);
            return true;
        }
        if (i8 == 2) {
            O(J());
            return true;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return false;
            }
            if (i8 != 5) {
                throw M.d();
            }
            O(4);
            return true;
        }
        do {
            iA = A();
            if (iA == 0) {
                break;
            }
        } while (D(iA));
        a(((i7 >>> 3) << 3) | 4);
        return true;
    }

    public final byte[] E(int i7) throws IOException {
        byte[] bArrF = F(i7);
        if (bArrF != null) {
            return bArrF;
        }
        int i8 = this.f12241y;
        int i9 = this.f12239f;
        int length = i9 - i8;
        this.f12235A += i9;
        this.f12241y = 0;
        this.f12239f = 0;
        ArrayList<byte[]> arrayListG = G(i7 - length);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f12238e, i8, bArr, 0, length);
        for (byte[] bArr2 : arrayListG) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] F(int i7) throws IOException {
        if (i7 == 0) {
            return K.f12113b;
        }
        if (i7 < 0) {
            throw M.f();
        }
        int i8 = this.f12235A;
        int i9 = this.f12241y;
        int i10 = i8 + i9 + i7;
        if (i10 - com.google.android.gms.common.api.f.API_PRIORITY_OTHER > 0) {
            throw new M("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i11 = this.f12236B;
        if (i10 > i11) {
            O((i11 - i8) - i9);
            throw M.h();
        }
        int i12 = this.f12239f - i9;
        int i13 = i7 - i12;
        InputStream inputStream = this.f12237d;
        if (i13 >= 4096) {
            try {
                if (i13 > inputStream.available()) {
                    return null;
                }
            } catch (M e7) {
                e7.f12124a = true;
                throw e7;
            }
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f12238e, this.f12241y, bArr, 0, i12);
        this.f12235A += this.f12239f;
        this.f12241y = 0;
        this.f12239f = 0;
        while (i12 < i7) {
            try {
                int i14 = inputStream.read(bArr, i12, i7 - i12);
                if (i14 == -1) {
                    throw M.h();
                }
                this.f12235A += i14;
                i12 += i14;
            } catch (M e8) {
                e8.f12124a = true;
                throw e8;
            }
        }
        return bArr;
    }

    public final ArrayList G(int i7) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int iMin = Math.min(i7, 4096);
            byte[] bArr = new byte[iMin];
            int i8 = 0;
            while (i8 < iMin) {
                int i9 = this.f12237d.read(bArr, i8, iMin - i8);
                if (i9 == -1) {
                    throw M.h();
                }
                this.f12235A += i9;
                i8 += i9;
            }
            i7 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int H() throws M {
        int i7 = this.f12241y;
        if (this.f12239f - i7 < 4) {
            N(4);
            i7 = this.f12241y;
        }
        this.f12241y = i7 + 4;
        byte[] bArr = this.f12238e;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long I() throws M {
        int i7 = this.f12241y;
        if (this.f12239f - i7 < 8) {
            N(8);
            i7 = this.f12241y;
        }
        this.f12241y = i7 + 8;
        byte[] bArr = this.f12238e;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public final int J() {
        int i7;
        int i8 = this.f12241y;
        int i9 = this.f12239f;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f12238e;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.f12241y = i10;
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
                this.f12241y = i11;
                return i7;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j3;
        long j7;
        long j8;
        int i7 = this.f12241y;
        int i8 = this.f12239f;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f12238e;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.f12241y = i9;
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
                this.f12241y = i10;
                return j;
            }
        }
        return L();
    }

    public final long L() throws M {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.f12241y == this.f12239f) {
                N(1);
            }
            int i8 = this.f12241y;
            this.f12241y = i8 + 1;
            byte b7 = this.f12238e[i8];
            j |= ((long) (b7 & 127)) << i7;
            if ((b7 & 128) == 0) {
                return j;
            }
        }
        throw M.e();
    }

    public final void M() {
        int i7 = this.f12239f + this.f12240x;
        this.f12239f = i7;
        int i8 = this.f12235A + i7;
        int i9 = this.f12236B;
        if (i8 <= i9) {
            this.f12240x = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f12240x = i10;
        this.f12239f = i7 - i10;
    }

    public final void N(int i7) throws M {
        if (P(i7)) {
            return;
        }
        if (i7 <= (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.f12235A) - this.f12241y) {
            throw M.h();
        }
        throw new M("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void O(int i7) throws M {
        int i8 = this.f12239f;
        int i9 = this.f12241y;
        if (i7 <= i8 - i9 && i7 >= 0) {
            this.f12241y = i9 + i7;
            return;
        }
        InputStream inputStream = this.f12237d;
        if (i7 < 0) {
            throw M.f();
        }
        int i10 = this.f12235A;
        int i11 = i10 + i9;
        int i12 = i11 + i7;
        int i13 = this.f12236B;
        if (i12 > i13) {
            O((i13 - i10) - i9);
            throw M.h();
        }
        this.f12235A = i11;
        int i14 = i8 - i9;
        this.f12239f = 0;
        this.f12241y = 0;
        while (i14 < i7) {
            long j = i7 - i14;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i14 += (int) jSkip;
                    }
                } catch (M e7) {
                    e7.f12124a = true;
                    throw e7;
                }
            } catch (Throwable th) {
                this.f12235A += i14;
                M();
                throw th;
            }
        }
        this.f12235A += i14;
        M();
        if (i14 >= i7) {
            return;
        }
        int i15 = this.f12239f;
        int i16 = i15 - this.f12241y;
        this.f12241y = i15;
        N(1);
        while (true) {
            int i17 = i7 - i16;
            int i18 = this.f12239f;
            if (i17 <= i18) {
                this.f12241y = i17;
                return;
            } else {
                i16 += i18;
                this.f12241y = i18;
                N(1);
            }
        }
    }

    public final boolean P(int i7) throws IOException {
        int i8 = this.f12241y;
        int i9 = i8 + i7;
        int i10 = this.f12239f;
        if (i9 <= i10) {
            throw new IllegalStateException(AbstractC0486a1.f(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i11 = this.f12235A;
        if (i7 > (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i11) - i8 || i11 + i8 + i7 > this.f12236B) {
            return false;
        }
        byte[] bArr = this.f12238e;
        if (i8 > 0) {
            if (i10 > i8) {
                System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
            }
            this.f12235A += i8;
            this.f12239f -= i8;
            this.f12241y = 0;
        }
        int i12 = this.f12239f;
        int iMin = Math.min(bArr.length - i12, (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.f12235A) - i12);
        InputStream inputStream = this.f12237d;
        try {
            int i13 = inputStream.read(bArr, i12, iMin);
            if (i13 == 0 || i13 < -1 || i13 > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i13 + "\nThe InputStream implementation is buggy.");
            }
            if (i13 <= 0) {
                return false;
            }
            this.f12239f += i13;
            M();
            if (this.f12239f >= i7) {
                return true;
            }
            return P(i7);
        } catch (M e7) {
            e7.f12124a = true;
            throw e7;
        }
    }

    @Override // H6.b
    public final void a(int i7) throws M {
        if (this.f12242z != i7) {
            throw M.a();
        }
    }

    @Override // H6.b
    public final int e() {
        return this.f12235A + this.f12241y;
    }

    @Override // H6.b
    public final boolean f() {
        return this.f12241y == this.f12239f && !P(1);
    }

    @Override // H6.b
    public final void h(int i7) {
        this.f12236B = i7;
        M();
    }

    @Override // H6.b
    public final int i(int i7) throws M {
        if (i7 < 0) {
            throw M.f();
        }
        int i8 = this.f12235A + this.f12241y + i7;
        int i9 = this.f12236B;
        if (i8 > i9) {
            throw M.h();
        }
        this.f12236B = i8;
        M();
        return i9;
    }

    @Override // H6.b
    public final boolean j() {
        return K() != 0;
    }

    @Override // H6.b
    public final C0865j k() throws IOException {
        int iJ = J();
        int i7 = this.f12239f;
        int i8 = this.f12241y;
        int i9 = i7 - i8;
        byte[] bArr = this.f12238e;
        if (iJ <= i9 && iJ > 0) {
            C0865j c0865jA = AbstractC0867k.A(bArr, i8, iJ);
            this.f12241y += iJ;
            return c0865jA;
        }
        if (iJ == 0) {
            return AbstractC0867k.f12212b;
        }
        byte[] bArrF = F(iJ);
        if (bArrF != null) {
            return AbstractC0867k.A(bArrF, 0, bArrF.length);
        }
        int i10 = this.f12241y;
        int i11 = this.f12239f;
        int length = i11 - i10;
        this.f12235A += i11;
        this.f12241y = 0;
        this.f12239f = 0;
        ArrayList<byte[]> arrayListG = G(iJ - length);
        byte[] bArr2 = new byte[iJ];
        System.arraycopy(bArr, i10, bArr2, 0, length);
        for (byte[] bArr3 : arrayListG) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0865j c0865j = AbstractC0867k.f12212b;
        return new C0865j(bArr2);
    }

    @Override // H6.b
    public final double l() {
        return Double.longBitsToDouble(I());
    }

    @Override // H6.b
    public final int m() {
        return J();
    }

    @Override // H6.b
    public final int n() {
        return H();
    }

    @Override // H6.b
    public final long o() {
        return I();
    }

    @Override // H6.b
    public final float p() {
        return Float.intBitsToFloat(H());
    }

    @Override // H6.b
    public final int q() {
        return J();
    }

    @Override // H6.b
    public final long s() {
        return K();
    }

    @Override // H6.b
    public final int u() {
        return H();
    }

    @Override // H6.b
    public final long v() {
        return I();
    }

    @Override // H6.b
    public final int w() {
        return H6.b.b(J());
    }

    @Override // H6.b
    public final long x() {
        return H6.b.d(K());
    }

    @Override // H6.b
    public final String y() throws M {
        int iJ = J();
        byte[] bArr = this.f12238e;
        if (iJ > 0) {
            int i7 = this.f12239f;
            int i8 = this.f12241y;
            if (iJ <= i7 - i8) {
                String str = new String(bArr, i8, iJ, K.f12112a);
                this.f12241y += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ > this.f12239f) {
            return new String(E(iJ), K.f12112a);
        }
        N(iJ);
        String str2 = new String(bArr, this.f12241y, iJ, K.f12112a);
        this.f12241y += iJ;
        return str2;
    }

    @Override // H6.b
    public final String z() throws IOException {
        int iJ = J();
        int i7 = this.f12241y;
        int i8 = this.f12239f;
        int i9 = i8 - i7;
        byte[] bArrE = this.f12238e;
        if (iJ <= i9 && iJ > 0) {
            this.f12241y = i7 + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            i7 = 0;
            if (iJ <= i8) {
                N(iJ);
                this.f12241y = iJ;
            } else {
                bArrE = E(iJ);
            }
        }
        return N0.f12134a.H(bArrE, i7, iJ);
    }
}
