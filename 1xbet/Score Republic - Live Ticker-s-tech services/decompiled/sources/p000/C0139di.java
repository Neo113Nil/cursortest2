package p000;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: di */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0139di extends AbstractC0175ei {

    /* JADX INFO: renamed from: c */
    public final FileInputStream f1653c;

    /* JADX INFO: renamed from: d */
    public final byte[] f1654d;

    /* JADX INFO: renamed from: e */
    public int f1655e;

    /* JADX INFO: renamed from: f */
    public int f1656f;

    /* JADX INFO: renamed from: g */
    public int f1657g;

    /* JADX INFO: renamed from: h */
    public int f1658h;

    /* JADX INFO: renamed from: i */
    public int f1659i;

    /* JADX INFO: renamed from: j */
    public int f1660j = Integer.MAX_VALUE;

    public C0139di(FileInputStream fileInputStream) {
        Charset charset = ge0.f2710a;
        this.f1653c = fileInputStream;
        this.f1654d = new byte[4096];
        this.f1655e = 0;
        this.f1657g = 0;
        this.f1659i = 0;
    }

    /* JADX INFO: renamed from: A */
    public final byte[] m1213A(int i) throws IOException {
        byte[] bArrM1214B = m1214B(i);
        if (bArrM1214B != null) {
            return bArrM1214B;
        }
        int i2 = this.f1657g;
        int i3 = this.f1655e;
        int length = i3 - i2;
        this.f1659i += i3;
        this.f1657g = 0;
        this.f1655e = 0;
        ArrayList arrayListM1215C = m1215C(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f1654d, i2, bArr, 0, length);
        int size = arrayListM1215C.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListM1215C.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: B */
    public final byte[] m1214B(int i) throws IOException {
        if (i == 0) {
            return ge0.f2711b;
        }
        if (i < 0) {
            throw if0.m2599d();
        }
        int i2 = this.f1659i;
        int i3 = this.f1657g;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new if0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f1660j;
        if (i4 > i5) {
            m1223K((i5 - i2) - i3);
            throw if0.m2600e();
        }
        int i6 = this.f1655e - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.f1653c;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (if0 e) {
                e.f3561j = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f1654d, this.f1657g, bArr, 0, i6);
        this.f1659i += this.f1655e;
        this.f1657g = 0;
        this.f1655e = 0;
        while (i6 < i) {
            try {
                int i8 = fileInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw if0.m2600e();
                }
                this.f1659i += i8;
                i6 += i8;
            } catch (if0 e2) {
                e2.f3561j = true;
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: C */
    public final ArrayList m1215C(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f1653c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw if0.m2600e();
                }
                this.f1659i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public final int m1216D() throws if0 {
        int i = this.f1657g;
        if (this.f1655e - i < 4) {
            m1222J(4);
            i = this.f1657g;
        }
        this.f1657g = i + 4;
        byte[] bArr = this.f1654d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: E */
    public final long m1217E() throws if0 {
        int i = this.f1657g;
        if (this.f1655e - i < 8) {
            m1222J(8);
            i = this.f1657g;
        }
        this.f1657g = i + 8;
        byte[] bArr = this.f1654d;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: F */
    public final int m1218F() {
        int i;
        int i2 = this.f1657g;
        int i3 = this.f1655e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f1654d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f1657g = i4;
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
                this.f1657g = i5;
                return i;
            }
        }
        return (int) m1220H();
    }

    /* JADX INFO: renamed from: G */
    public final long m1219G() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f1657g;
        int i2 = this.f1655e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f1654d;
            byte b = bArr[i];
            if (b >= 0) {
                this.f1657g = i3;
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
                this.f1657g = i4;
                return j;
            }
        }
        return m1220H();
    }

    /* JADX INFO: renamed from: H */
    public final long m1220H() throws if0 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f1657g == this.f1655e) {
                m1222J(1);
            }
            int i2 = this.f1657g;
            this.f1657g = i2 + 1;
            byte b = this.f1654d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw if0.m2598c();
    }

    /* JADX INFO: renamed from: I */
    public final void m1221I() {
        int i = this.f1655e + this.f1656f;
        this.f1655e = i;
        int i2 = this.f1659i + i;
        int i3 = this.f1660j;
        if (i2 <= i3) {
            this.f1656f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f1656f = i4;
        this.f1655e = i - i4;
    }

    /* JADX INFO: renamed from: J */
    public final void m1222J(int i) throws if0 {
        if (m1224L(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f1659i) - this.f1657g) {
            throw if0.m2600e();
        }
        throw new if0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: K */
    public final void m1223K(int i) throws if0 {
        int i2 = this.f1655e;
        int i3 = this.f1657g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f1657g = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.f1653c;
        if (i < 0) {
            throw if0.m2599d();
        }
        int i5 = this.f1659i;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.f1660j;
        if (i7 > i8) {
            m1223K((i8 - i5) - i3);
            throw if0.m2600e();
        }
        this.f1659i = i6;
        this.f1655e = 0;
        this.f1657g = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (if0 e) {
                    e.f3561j = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f1659i += i4;
                m1221I();
                throw th;
            }
        }
        this.f1659i += i4;
        m1221I();
        if (i4 >= i) {
            return;
        }
        int i9 = this.f1655e;
        int i10 = i9 - this.f1657g;
        this.f1657g = i9;
        m1222J(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f1655e;
            if (i11 <= i12) {
                this.f1657g = i11;
                return;
            } else {
                i10 += i12;
                this.f1657g = i12;
                m1222J(1);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m1224L(int i) throws IOException {
        FileInputStream fileInputStream = this.f1653c;
        int i2 = this.f1657g;
        int i3 = i2 + i;
        int i4 = this.f1655e;
        if (i3 <= i4) {
            C0270h1.m2191g(AbstractC0024an.m282e(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.f1659i;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.f1660j) {
            byte[] bArr = this.f1654d;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f1659i += i2;
                this.f1655e -= i2;
                this.f1657g = 0;
            }
            int i6 = this.f1655e;
            try {
                int i7 = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.f1659i) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f1655e += i7;
                    m1221I();
                    if (this.f1655e >= i) {
                        return true;
                    }
                    return m1224L(i);
                }
            } catch (if0 e) {
                e.f3561j = true;
                throw e;
            }
        }
        return false;
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: a */
    public final void mo676a(int i) throws if0 {
        if (this.f1658h != i) {
            throw new if0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: b */
    public final int mo677b() {
        return this.f1659i + this.f1657g;
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: c */
    public final boolean mo678c() {
        return this.f1657g == this.f1655e && !m1224L(1);
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: d */
    public final void mo679d(int i) {
        this.f1660j = i;
        m1221I();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: e */
    public final int mo680e(int i) throws if0 {
        if (i < 0) {
            throw if0.m2599d();
        }
        int i2 = this.f1659i + this.f1657g + i;
        if (i2 < 0) {
            throw new if0("Failed to parse the message.");
        }
        int i3 = this.f1660j;
        if (i2 > i3) {
            throw if0.m2600e();
        }
        this.f1660j = i2;
        m1221I();
        return i3;
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: f */
    public final boolean mo681f() {
        return m1219G() != 0;
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: g */
    public final C0799vd mo682g() throws IOException {
        int iM1218F = m1218F();
        int i = this.f1655e;
        int i2 = this.f1657g;
        int i3 = i - i2;
        byte[] bArr = this.f1654d;
        if (iM1218F <= i3 && iM1218F > 0) {
            C0799vd c0799vdM5148d = C0799vd.m5148d(bArr, i2, iM1218F);
            this.f1657g += iM1218F;
            return c0799vdM5148d;
        }
        if (iM1218F == 0) {
            return C0799vd.f8177l;
        }
        if (iM1218F < 0) {
            throw if0.m2599d();
        }
        byte[] bArrM1214B = m1214B(iM1218F);
        if (bArrM1214B != null) {
            return C0799vd.m5148d(bArrM1214B, 0, bArrM1214B.length);
        }
        int i4 = this.f1657g;
        int i5 = this.f1655e;
        int length = i5 - i4;
        this.f1659i += i5;
        this.f1657g = 0;
        this.f1655e = 0;
        ArrayList arrayListM1215C = m1215C(iM1218F - length);
        byte[] bArr2 = new byte[iM1218F];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        int size = arrayListM1215C.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListM1215C.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0799vd c0799vd = C0799vd.f8177l;
        return new C0799vd(bArr2);
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: h */
    public final double mo683h() {
        return Double.longBitsToDouble(m1217E());
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: i */
    public final int mo684i() {
        return m1218F();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: j */
    public final int mo685j() {
        return m1216D();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: k */
    public final long mo686k() {
        return m1217E();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: l */
    public final float mo687l() {
        return Float.intBitsToFloat(m1216D());
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: m */
    public final int mo688m() {
        return m1218F();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: n */
    public final long mo689n() {
        return m1219G();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: o */
    public final int mo690o() {
        return m1216D();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: p */
    public final long mo691p() {
        return m1217E();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: q */
    public final int mo692q() {
        int iM1218F = m1218F();
        return (-(iM1218F & 1)) ^ (iM1218F >>> 1);
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: r */
    public final long mo693r() {
        long jM1219G = m1219G();
        return (-(jM1219G & 1)) ^ (jM1219G >>> 1);
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: s */
    public final String mo694s() throws if0 {
        int iM1218F = m1218F();
        byte[] bArr = this.f1654d;
        if (iM1218F > 0) {
            int i = this.f1655e;
            int i2 = this.f1657g;
            if (iM1218F <= i - i2) {
                String str = new String(bArr, i2, iM1218F, ge0.f2710a);
                this.f1657g += iM1218F;
                return str;
            }
        }
        if (iM1218F == 0) {
            return "";
        }
        if (iM1218F < 0) {
            throw if0.m2599d();
        }
        if (iM1218F > this.f1655e) {
            return new String(m1213A(iM1218F), ge0.f2710a);
        }
        m1222J(iM1218F);
        String str2 = new String(bArr, this.f1657g, iM1218F, ge0.f2710a);
        this.f1657g += iM1218F;
        return str2;
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: t */
    public final String mo695t() throws IOException {
        int iM1218F = m1218F();
        int i = this.f1657g;
        int i2 = this.f1655e;
        int i3 = i2 - i;
        byte[] bArrM1213A = this.f1654d;
        if (iM1218F <= i3 && iM1218F > 0) {
            this.f1657g = i + iM1218F;
        } else {
            if (iM1218F == 0) {
                return "";
            }
            if (iM1218F < 0) {
                throw if0.m2599d();
            }
            i = 0;
            if (iM1218F <= i2) {
                m1222J(iM1218F);
                this.f1657g = iM1218F;
            } else {
                bArrM1213A = m1213A(iM1218F);
            }
        }
        return xg1.f8962a.mo3413b(bArrM1213A, i, iM1218F);
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: u */
    public final int mo696u() throws if0 {
        if (mo678c()) {
            this.f1658h = 0;
            return 0;
        }
        int iM1218F = m1218F();
        this.f1658h = iM1218F;
        if ((iM1218F >>> 3) != 0) {
            return iM1218F;
        }
        throw new if0("Protocol message contained an invalid tag (zero).");
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: v */
    public final int mo697v() {
        return m1218F();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: w */
    public final long mo698w() {
        return m1219G();
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: x */
    public final boolean mo699x(int i) throws if0 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                m1223K(8);
                return true;
            }
            if (i2 == 2) {
                m1223K(m1218F());
                return true;
            }
            if (i2 == 3) {
                m1426y();
                mo676a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw if0.m2597b();
            }
            m1223K(4);
            return true;
        }
        int i4 = this.f1655e - this.f1657g;
        byte[] bArr = this.f1654d;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f1657g;
                this.f1657g = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw if0.m2598c();
        }
        while (i3 < 10) {
            if (this.f1657g == this.f1655e) {
                m1222J(1);
            }
            int i6 = this.f1657g;
            this.f1657g = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw if0.m2598c();
        return true;
    }
}
