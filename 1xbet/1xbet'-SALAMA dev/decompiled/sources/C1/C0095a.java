package C1;

import W5.AbstractC0486a1;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: C1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0095a implements N1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1465c;

    public /* synthetic */ C0095a(int i7, int i8, Object obj) {
        this.f1463a = i7;
        this.f1464b = i8;
        this.f1465c = obj;
    }

    public void A(int i7) {
        byte[] bArr = (byte[]) this.f1465c;
        if (bArr.length < i7) {
            bArr = new byte[i7];
        }
        B(i7, bArr);
    }

    public void B(int i7, byte[] bArr) {
        this.f1465c = bArr;
        this.f1464b = i7;
        this.f1463a = 0;
    }

    public void C(int i7) {
        p151v2.a.f(i7 >= 0 && i7 <= ((byte[]) this.f1465c).length);
        this.f1464b = i7;
    }

    public void D(int i7) {
        p151v2.a.f(i7 >= 0 && i7 <= this.f1464b);
        this.f1463a = i7;
    }

    public void E(int i7) {
        D(this.f1463a + i7);
    }

    @Override // N1.d
    public int a() {
        return this.f1463a;
    }

    @Override // N1.d
    public int b() {
        return this.f1464b;
    }

    @Override // N1.d
    public int c() {
        int i7 = this.f1463a;
        return i7 == -1 ? ((C0095a) this.f1465c).w() : i7;
    }

    public int d() {
        return this.f1464b - this.f1463a;
    }

    public void e(int i7) {
        byte[] bArr = (byte[]) this.f1465c;
        if (i7 > bArr.length) {
            this.f1465c = Arrays.copyOf(bArr, i7);
        }
    }

    public void f(byte[] bArr, int i7, int i8) {
        System.arraycopy((byte[]) this.f1465c, this.f1463a, bArr, i7, i8);
        this.f1463a += i8;
    }

    public int g() {
        byte[] bArr = (byte[]) this.f1465c;
        int i7 = this.f1463a;
        int i8 = i7 + 1;
        this.f1463a = i8;
        int i9 = (bArr[i7] & 255) << 24;
        int i10 = i7 + 2;
        this.f1463a = i10;
        int i11 = ((bArr[i8] & 255) << 16) | i9;
        int i12 = i7 + 3;
        this.f1463a = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 8);
        this.f1463a = i7 + 4;
        return (bArr[i12] & 255) | i13;
    }

    public String h() {
        if (d() == 0) {
            return null;
        }
        int i7 = this.f1463a;
        while (i7 < this.f1464b) {
            byte b7 = ((byte[]) this.f1465c)[i7];
            int i8 = p151v2.t.f17159a;
            if (b7 == 10 || b7 == 13) {
                break;
            }
            i7++;
        }
        int i9 = this.f1463a;
        if (i7 - i9 >= 3) {
            byte[] bArr = (byte[]) this.f1465c;
            if (bArr[i9] == -17 && bArr[i9 + 1] == -69 && bArr[i9 + 2] == -65) {
                this.f1463a = i9 + 3;
            }
        }
        byte[] bArr2 = (byte[]) this.f1465c;
        int i10 = this.f1463a;
        int i11 = p151v2.t.f17159a;
        String str = new String(bArr2, i10, i7 - i10, D3.f.f1719c);
        this.f1463a = i7;
        int i12 = this.f1464b;
        if (i7 == i12) {
            return str;
        }
        byte[] bArr3 = (byte[]) this.f1465c;
        if (bArr3[i7] == 13) {
            int i13 = i7 + 1;
            this.f1463a = i13;
            if (i13 == i12) {
                return str;
            }
        }
        int i14 = this.f1463a;
        if (bArr3[i14] == 10) {
            this.f1463a = i14 + 1;
        }
        return str;
    }

    public int i() {
        byte[] bArr = (byte[]) this.f1465c;
        int i7 = this.f1463a;
        int i8 = i7 + 1;
        this.f1463a = i8;
        int i9 = bArr[i7] & 255;
        int i10 = i7 + 2;
        this.f1463a = i10;
        int i11 = ((bArr[i8] & 255) << 8) | i9;
        int i12 = i7 + 3;
        this.f1463a = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 16);
        this.f1463a = i7 + 4;
        return ((bArr[i12] & 255) << 24) | i13;
    }

    public long j() {
        byte[] bArr = (byte[]) this.f1465c;
        int i7 = this.f1463a;
        int i8 = i7 + 1;
        this.f1463a = i8;
        long j = ((long) bArr[i7]) & 255;
        int i9 = i7 + 2;
        this.f1463a = i9;
        long j3 = j | ((((long) bArr[i8]) & 255) << 8);
        int i10 = i7 + 3;
        this.f1463a = i10;
        long j7 = j3 | ((((long) bArr[i9]) & 255) << 16);
        int i11 = i7 + 4;
        this.f1463a = i11;
        long j8 = j7 | ((((long) bArr[i10]) & 255) << 24);
        int i12 = i7 + 5;
        this.f1463a = i12;
        long j9 = j8 | ((((long) bArr[i11]) & 255) << 32);
        int i13 = i7 + 6;
        this.f1463a = i13;
        long j10 = j9 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i7 + 7;
        this.f1463a = i14;
        long j11 = j10 | ((((long) bArr[i13]) & 255) << 48);
        this.f1463a = i7 + 8;
        return ((((long) bArr[i14]) & 255) << 56) | j11;
    }

    public long k() {
        byte[] bArr = (byte[]) this.f1465c;
        int i7 = this.f1463a;
        int i8 = i7 + 1;
        this.f1463a = i8;
        long j = ((long) bArr[i7]) & 255;
        int i9 = i7 + 2;
        this.f1463a = i9;
        long j3 = j | ((((long) bArr[i8]) & 255) << 8);
        int i10 = i7 + 3;
        this.f1463a = i10;
        long j7 = j3 | ((((long) bArr[i9]) & 255) << 16);
        this.f1463a = i7 + 4;
        return ((((long) bArr[i10]) & 255) << 24) | j7;
    }

    public int l() {
        int i7 = i();
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalStateException(p031e1.k.d(i7, "Top bit not zero: "));
    }

    public int m() {
        byte[] bArr = (byte[]) this.f1465c;
        int i7 = this.f1463a;
        int i8 = i7 + 1;
        this.f1463a = i8;
        int i9 = bArr[i7] & 255;
        this.f1463a = i7 + 2;
        return ((bArr[i8] & 255) << 8) | i9;
    }

    public long n() {
        byte[] bArr = (byte[]) this.f1465c;
        int i7 = this.f1463a;
        int i8 = i7 + 1;
        this.f1463a = i8;
        long j = (((long) bArr[i7]) & 255) << 56;
        int i9 = i7 + 2;
        this.f1463a = i9;
        long j3 = j | ((((long) bArr[i8]) & 255) << 48);
        int i10 = i7 + 3;
        this.f1463a = i10;
        long j7 = j3 | ((((long) bArr[i9]) & 255) << 40);
        int i11 = i7 + 4;
        this.f1463a = i11;
        long j8 = j7 | ((((long) bArr[i10]) & 255) << 32);
        int i12 = i7 + 5;
        this.f1463a = i12;
        long j9 = j8 | ((((long) bArr[i11]) & 255) << 24);
        int i13 = i7 + 6;
        this.f1463a = i13;
        long j10 = j9 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i7 + 7;
        this.f1463a = i14;
        long j11 = j10 | ((((long) bArr[i13]) & 255) << 8);
        this.f1463a = i7 + 8;
        return (((long) bArr[i14]) & 255) | j11;
    }

    public String o() {
        if (d() == 0) {
            return null;
        }
        int i7 = this.f1463a;
        while (i7 < this.f1464b && ((byte[]) this.f1465c)[i7] != 0) {
            i7++;
        }
        byte[] bArr = (byte[]) this.f1465c;
        int i8 = this.f1463a;
        int i9 = p151v2.t.f17159a;
        String str = new String(bArr, i8, i7 - i8, D3.f.f1719c);
        this.f1463a = i7;
        if (i7 < this.f1464b) {
            this.f1463a = i7 + 1;
        }
        return str;
    }

    public String p(int i7) {
        if (i7 == 0) {
            return "";
        }
        int i8 = this.f1463a;
        int i9 = (i8 + i7) - 1;
        int i10 = (i9 >= this.f1464b || ((byte[]) this.f1465c)[i9] != 0) ? i7 : i7 - 1;
        byte[] bArr = (byte[]) this.f1465c;
        int i11 = p151v2.t.f17159a;
        String str = new String(bArr, i8, i10, D3.f.f1719c);
        this.f1463a += i7;
        return str;
    }

    public short q() {
        byte[] bArr = (byte[]) this.f1465c;
        int i7 = this.f1463a;
        int i8 = i7 + 1;
        this.f1463a = i8;
        int i9 = (bArr[i7] & 255) << 8;
        this.f1463a = i7 + 2;
        return (short) ((bArr[i8] & 255) | i9);
    }

    public String r(int i7, Charset charset) {
        String str = new String((byte[]) this.f1465c, this.f1463a, i7, charset);
        this.f1463a += i7;
        return str;
    }

    public int s() {
        return (t() << 21) | (t() << 14) | (t() << 7) | t();
    }

    public int t() {
        byte[] bArr = (byte[]) this.f1465c;
        int i7 = this.f1463a;
        this.f1463a = i7 + 1;
        return bArr[i7] & 255;
    }

    public long u() {
        byte[] bArr = (byte[]) this.f1465c;
        int i7 = this.f1463a;
        int i8 = i7 + 1;
        this.f1463a = i8;
        long j = (((long) bArr[i7]) & 255) << 24;
        int i9 = i7 + 2;
        this.f1463a = i9;
        long j3 = j | ((((long) bArr[i8]) & 255) << 16);
        int i10 = i7 + 3;
        this.f1463a = i10;
        long j7 = j3 | ((((long) bArr[i9]) & 255) << 8);
        this.f1463a = i7 + 4;
        return (((long) bArr[i10]) & 255) | j7;
    }

    public int v() {
        byte[] bArr = (byte[]) this.f1465c;
        int i7 = this.f1463a;
        int i8 = i7 + 1;
        this.f1463a = i8;
        int i9 = (bArr[i7] & 255) << 16;
        int i10 = i7 + 2;
        this.f1463a = i10;
        int i11 = ((bArr[i8] & 255) << 8) | i9;
        this.f1463a = i7 + 3;
        return (bArr[i10] & 255) | i11;
    }

    public int w() {
        int iG = g();
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException(p031e1.k.d(iG, "Top bit not zero: "));
    }

    public long x() {
        long jN = n();
        if (jN >= 0) {
            return jN;
        }
        throw new IllegalStateException(AbstractC0486a1.g("Top bit not zero: ", jN));
    }

    public int y() {
        byte[] bArr = (byte[]) this.f1465c;
        int i7 = this.f1463a;
        int i8 = i7 + 1;
        this.f1463a = i8;
        int i9 = (bArr[i7] & 255) << 8;
        this.f1463a = i7 + 2;
        return (bArr[i8] & 255) | i9;
    }

    public long z() {
        int i7;
        int i8;
        long j = ((byte[]) this.f1465c)[this.f1463a];
        int i9 = 7;
        while (true) {
            if (i9 >= 0) {
                int i10 = 1 << i9;
                if ((((long) i10) & j) == 0) {
                    if (i9 < 6) {
                        j &= (long) (i10 - 1);
                        i8 = 7 - i9;
                        break;
                    }
                    if (i9 == 7) {
                        i8 = 1;
                        break;
                    }
                } else {
                    i9--;
                }
            }
            i8 = 0;
            break;
        }
        if (i8 == 0) {
            throw new NumberFormatException(AbstractC0486a1.g("Invalid UTF-8 sequence first byte: ", j));
        }
        for (i7 = 1; i7 < i8; i7++) {
            byte b7 = ((byte[]) this.f1465c)[this.f1463a + i7];
            if ((b7 & 192) != 128) {
                throw new NumberFormatException(AbstractC0486a1.g("Invalid UTF-8 sequence continuation byte: ", j));
            }
            j = (j << 6) | ((long) (b7 & 63));
        }
        this.f1463a += i8;
        return j;
    }

    public C0095a(int i7) {
        this.f1465c = new byte[i7];
        this.f1464b = i7;
    }

    public C0095a(byte[] bArr) {
        this.f1465c = bArr;
        this.f1464b = bArr.length;
    }

    public C0095a(byte[] bArr, int i7) {
        this.f1465c = bArr;
        this.f1464b = i7;
    }

    public C0095a(int i7, boolean z4) {
        switch (i7) {
            case 4:
                this.f1465c = p151v2.t.f17164f;
                break;
            default:
                this.f1465c = new C0095a[256];
                this.f1463a = 0;
                this.f1464b = 0;
                break;
        }
    }
}
