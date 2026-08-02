package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: ci */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0099ci extends AbstractC0860x0 {

    /* JADX INFO: renamed from: m */
    public final InputStream f1254m;

    /* JADX INFO: renamed from: n */
    public final byte[] f1255n;

    /* JADX INFO: renamed from: o */
    public int f1256o;

    /* JADX INFO: renamed from: p */
    public int f1257p;

    /* JADX INFO: renamed from: q */
    public int f1258q;

    /* JADX INFO: renamed from: r */
    public int f1259r;

    /* JADX INFO: renamed from: s */
    public int f1260s;

    /* JADX INFO: renamed from: t */
    public int f1261t = Integer.MAX_VALUE;

    public C0099ci(InputStream inputStream) {
        fe0.m1772a(inputStream, "input");
        this.f1254m = inputStream;
        this.f1255n = new byte[4096];
        this.f1256o = 0;
        this.f1258q = 0;
        this.f1260s = 0;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: A */
    public final long mo214A() {
        return m941r0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: B */
    public final boolean mo215B(int i) throws hf0 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                m945v0(8);
                return true;
            }
            if (i2 == 2) {
                m945v0(m940q0());
                return true;
            }
            if (i2 == 3) {
                m5490C();
                mo216a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw hf0.m2259b();
            }
            m945v0(4);
            return true;
        }
        int i4 = this.f1256o - this.f1258q;
        byte[] bArr = this.f1255n;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f1258q;
                this.f1258q = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw hf0.m2260c();
        }
        while (i3 < 10) {
            if (this.f1258q == this.f1256o) {
                m944u0(1);
            }
            int i6 = this.f1258q;
            this.f1258q = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw hf0.m2260c();
        return true;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: a */
    public final void mo216a(int i) throws hf0 {
        if (this.f1259r != i) {
            throw new hf0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: b */
    public final int mo217b() {
        return this.f1260s + this.f1258q;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: c */
    public final boolean mo218c() {
        return this.f1258q == this.f1256o && !m946w0(1);
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: e */
    public final void mo219e(int i) {
        this.f1261t = i;
        m943t0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: f */
    public final int mo220f(int i) throws hf0 {
        if (i < 0) {
            throw hf0.m2261d();
        }
        int i2 = this.f1260s + this.f1258q + i;
        int i3 = this.f1261t;
        if (i2 > i3) {
            throw hf0.m2262e();
        }
        this.f1261t = i2;
        m943t0();
        return i3;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: g */
    public final boolean mo221g() {
        return m941r0() != 0;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: i */
    public final C0762ud mo222i() throws IOException {
        int iM940q0 = m940q0();
        int i = this.f1256o;
        int i2 = this.f1258q;
        int i3 = i - i2;
        byte[] bArr = this.f1255n;
        if (iM940q0 <= i3 && iM940q0 > 0) {
            C0762ud c0762udM4908d = C0762ud.m4908d(bArr, i2, iM940q0);
            this.f1258q += iM940q0;
            return c0762udM4908d;
        }
        if (iM940q0 == 0) {
            return C0762ud.f7797l;
        }
        if (iM940q0 < 0) {
            throw hf0.m2261d();
        }
        byte[] bArrM936m0 = m936m0(iM940q0);
        if (bArrM936m0 != null) {
            return C0762ud.m4908d(bArrM936m0, 0, bArrM936m0.length);
        }
        int i4 = this.f1258q;
        int i5 = this.f1256o;
        int length = i5 - i4;
        this.f1260s += i5;
        this.f1258q = 0;
        this.f1256o = 0;
        ArrayList arrayListM937n0 = m937n0(iM940q0 - length);
        byte[] bArr2 = new byte[iM940q0];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        int size = arrayListM937n0.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListM937n0.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0762ud c0762ud = C0762ud.f7797l;
        return new C0762ud(bArr2);
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: k */
    public final double mo223k() {
        return Double.longBitsToDouble(m939p0());
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: l */
    public final int mo224l() {
        return m940q0();
    }

    /* JADX INFO: renamed from: l0 */
    public final byte[] m935l0(int i) throws IOException {
        byte[] bArrM936m0 = m936m0(i);
        if (bArrM936m0 != null) {
            return bArrM936m0;
        }
        int i2 = this.f1258q;
        int i3 = this.f1256o;
        int length = i3 - i2;
        this.f1260s += i3;
        this.f1258q = 0;
        this.f1256o = 0;
        ArrayList arrayListM937n0 = m937n0(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f1255n, i2, bArr, 0, length);
        int size = arrayListM937n0.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListM937n0.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: m */
    public final int mo226m() {
        return m938o0();
    }

    /* JADX INFO: renamed from: m0 */
    public final byte[] m936m0(int i) throws IOException {
        if (i == 0) {
            return fe0.f2382b;
        }
        if (i < 0) {
            throw hf0.m2261d();
        }
        int i2 = this.f1260s;
        int i3 = this.f1258q;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new hf0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f1261t;
        if (i4 > i5) {
            m945v0((i5 - i2) - i3);
            throw hf0.m2262e();
        }
        int i6 = this.f1256o - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f1254m;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (hf0 e) {
                e.f3197j = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f1255n, this.f1258q, bArr, 0, i6);
        this.f1260s += this.f1256o;
        this.f1258q = 0;
        this.f1256o = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw hf0.m2262e();
                }
                this.f1260s += i8;
                i6 += i8;
            } catch (hf0 e2) {
                e2.f3197j = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: n */
    public final long mo228n() {
        return m939p0();
    }

    /* JADX INFO: renamed from: n0 */
    public final ArrayList m937n0(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f1254m.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw hf0.m2262e();
                }
                this.f1260s += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: o */
    public final float mo230o() {
        return Float.intBitsToFloat(m938o0());
    }

    /* JADX INFO: renamed from: o0 */
    public final int m938o0() throws hf0 {
        int i = this.f1258q;
        if (this.f1256o - i < 4) {
            m944u0(4);
            i = this.f1258q;
        }
        this.f1258q = i + 4;
        byte[] bArr = this.f1255n;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: p */
    public final int mo232p() {
        return m940q0();
    }

    /* JADX INFO: renamed from: p0 */
    public final long m939p0() throws hf0 {
        int i = this.f1258q;
        if (this.f1256o - i < 8) {
            m944u0(8);
            i = this.f1258q;
        }
        this.f1258q = i + 8;
        byte[] bArr = this.f1255n;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: q */
    public final long mo234q() {
        return m941r0();
    }

    /* JADX INFO: renamed from: q0 */
    public final int m940q0() {
        int i;
        int i2 = this.f1258q;
        int i3 = this.f1256o;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f1255n;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f1258q = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f1258q = i5;
                return i;
            }
        }
        return (int) m942s0();
    }

    /* JADX INFO: renamed from: r0 */
    public final long m941r0() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f1258q;
        int i2 = this.f1256o;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f1255n;
            byte b = bArr[i];
            if (b >= 0) {
                this.f1258q = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f1258q = i4;
                return j;
            }
        }
        return m942s0();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: s */
    public final int mo237s() {
        return m938o0();
    }

    /* JADX INFO: renamed from: s0 */
    public final long m942s0() throws hf0 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f1258q == this.f1256o) {
                m944u0(1);
            }
            int i2 = this.f1258q;
            this.f1258q = i2 + 1;
            byte b = this.f1255n[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw hf0.m2260c();
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: t */
    public final long mo238t() {
        return m939p0();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m943t0() {
        int i = this.f1256o + this.f1257p;
        this.f1256o = i;
        int i2 = this.f1260s + i;
        int i3 = this.f1261t;
        if (i2 <= i3) {
            this.f1257p = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f1257p = i4;
        this.f1256o = i - i4;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: u */
    public final int mo239u() {
        int iM940q0 = m940q0();
        return (-(iM940q0 & 1)) ^ (iM940q0 >>> 1);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m944u0(int i) throws hf0 {
        if (m946w0(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f1260s) - this.f1258q) {
            throw hf0.m2262e();
        }
        throw new hf0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: v */
    public final long mo240v() {
        long jM941r0 = m941r0();
        return (-(jM941r0 & 1)) ^ (jM941r0 >>> 1);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m945v0(int i) throws hf0 {
        int i2 = this.f1256o;
        int i3 = this.f1258q;
        if (i <= i2 - i3 && i >= 0) {
            this.f1258q = i3 + i;
            return;
        }
        InputStream inputStream = this.f1254m;
        if (i < 0) {
            throw hf0.m2261d();
        }
        int i4 = this.f1260s;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.f1261t;
        if (i6 > i7) {
            m945v0((i7 - i4) - i3);
            throw hf0.m2262e();
        }
        this.f1260s = i5;
        int i8 = i2 - i3;
        this.f1256o = 0;
        this.f1258q = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i8 += (int) jSkip;
                    }
                } catch (hf0 e) {
                    e.f3197j = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f1260s += i8;
                m943t0();
                throw th;
            }
        }
        this.f1260s += i8;
        m943t0();
        if (i8 >= i) {
            return;
        }
        int i9 = this.f1256o;
        int i10 = i9 - this.f1258q;
        this.f1258q = i9;
        m944u0(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f1256o;
            if (i11 <= i12) {
                this.f1258q = i11;
                return;
            } else {
                i10 += i12;
                this.f1258q = i12;
                m944u0(1);
            }
        }
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: w */
    public final String mo241w() throws hf0 {
        int iM940q0 = m940q0();
        byte[] bArr = this.f1255n;
        if (iM940q0 > 0) {
            int i = this.f1256o;
            int i2 = this.f1258q;
            if (iM940q0 <= i - i2) {
                String str = new String(bArr, i2, iM940q0, fe0.f2381a);
                this.f1258q += iM940q0;
                return str;
            }
        }
        if (iM940q0 == 0) {
            return "";
        }
        if (iM940q0 < 0) {
            throw hf0.m2261d();
        }
        if (iM940q0 > this.f1256o) {
            return new String(m935l0(iM940q0), fe0.f2381a);
        }
        m944u0(iM940q0);
        String str2 = new String(bArr, this.f1258q, iM940q0, fe0.f2381a);
        this.f1258q += iM940q0;
        return str2;
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m946w0(int i) throws IOException {
        InputStream inputStream = this.f1254m;
        int i2 = this.f1258q;
        int i3 = i2 + i;
        int i4 = this.f1256o;
        if (i3 <= i4) {
            C0270h1.m2191g(AbstractC0024an.m282e(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.f1260s;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.f1261t) {
            byte[] bArr = this.f1255n;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f1260s += i2;
                this.f1256o -= i2;
                this.f1258q = 0;
            }
            int i6 = this.f1256o;
            try {
                int i7 = inputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.f1260s) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f1256o += i7;
                    m943t0();
                    if (this.f1256o >= i) {
                        return true;
                    }
                    return m946w0(i);
                }
            } catch (hf0 e) {
                e.f3197j = true;
                throw e;
            }
        }
        return false;
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: x */
    public final String mo242x() throws IOException {
        int iM940q0 = m940q0();
        int i = this.f1258q;
        int i2 = this.f1256o;
        int i3 = i2 - i;
        byte[] bArrM935l0 = this.f1255n;
        if (iM940q0 <= i3 && iM940q0 > 0) {
            this.f1258q = i + iM940q0;
        } else {
            if (iM940q0 == 0) {
                return "";
            }
            if (iM940q0 < 0) {
                throw hf0.m2261d();
            }
            i = 0;
            if (iM940q0 <= i2) {
                m944u0(iM940q0);
                this.f1258q = iM940q0;
            } else {
                bArrM935l0 = m935l0(iM940q0);
            }
        }
        return wg1.f8548a.mo4522d(bArrM935l0, i, iM940q0);
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: y */
    public final int mo243y() throws hf0 {
        if (mo218c()) {
            this.f1259r = 0;
            return 0;
        }
        int iM940q0 = m940q0();
        this.f1259r = iM940q0;
        if ((iM940q0 >>> 3) != 0) {
            return iM940q0;
        }
        throw new hf0("Protocol message contained an invalid tag (zero).");
    }

    @Override // p000.AbstractC0860x0
    /* JADX INFO: renamed from: z */
    public final int mo244z() {
        return m940q0();
    }
}
