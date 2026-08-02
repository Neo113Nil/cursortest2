package Td;

import Td.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private int f27054c;

    /* renamed from: e, reason: collision with root package name */
    private final InputStream f27056e;

    /* renamed from: f, reason: collision with root package name */
    private int f27057f;

    /* renamed from: i, reason: collision with root package name */
    private int f27060i;

    /* renamed from: h, reason: collision with root package name */
    private int f27059h = Integer.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f27052a = new byte[4096];

    /* renamed from: b, reason: collision with root package name */
    private int f27053b = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f27055d = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f27058g = 0;

    private d(InputStream inputStream) {
        this.f27056e = inputStream;
    }

    public static d c(InputStream inputStream) {
        return new d(inputStream);
    }

    private byte[] k(int i11) throws IOException {
        if (i11 <= 0) {
            if (i11 == 0) {
                return i.f27091a;
            }
            throw new j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i12 = this.f27058g;
        int i13 = this.f27055d;
        int i14 = i12 + i13 + i11;
        int i15 = this.f27059h;
        if (i14 > i15) {
            v((i15 - i12) - i13);
            throw j.d();
        }
        byte[] bArr = this.f27052a;
        if (i11 < 4096) {
            byte[] bArr2 = new byte[i11];
            int i16 = this.f27053b - i13;
            System.arraycopy(bArr, i13, bArr2, 0, i16);
            this.f27055d = this.f27053b;
            int i17 = i11 - i16;
            if (i17 > 0) {
                t(i17);
            }
            System.arraycopy(bArr, 0, bArr2, i16, i17);
            this.f27055d = i17;
            return bArr2;
        }
        int i18 = this.f27053b;
        this.f27058g = i12 + i18;
        this.f27055d = 0;
        this.f27053b = 0;
        int i19 = i18 - i13;
        int i21 = i11 - i19;
        ArrayList arrayList = new ArrayList();
        while (i21 > 0) {
            int min = Math.min(i21, 4096);
            byte[] bArr3 = new byte[min];
            int i22 = 0;
            while (i22 < min) {
                InputStream inputStream = this.f27056e;
                int read = inputStream == null ? -1 : inputStream.read(bArr3, i22, min - i22);
                if (read == -1) {
                    throw j.d();
                }
                this.f27058g += read;
                i22 += read;
            }
            i21 -= min;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i11];
        System.arraycopy(bArr, i13, bArr4, 0, i19);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr5 = (byte[]) it.next();
            System.arraycopy(bArr5, 0, bArr4, i19, bArr5.length);
            i19 += bArr5.length;
        }
        return bArr4;
    }

    private void s() {
        int i11 = this.f27053b + this.f27054c;
        this.f27053b = i11;
        int i12 = this.f27058g + i11;
        int i13 = this.f27059h;
        if (i12 <= i13) {
            this.f27054c = 0;
            return;
        }
        int i14 = i12 - i13;
        this.f27054c = i14;
        this.f27053b = i11 - i14;
    }

    private void t(int i11) throws IOException {
        if (!w(i11)) {
            throw j.d();
        }
    }

    private boolean w(int i11) throws IOException {
        InputStream inputStream;
        int i12 = this.f27055d;
        int i13 = i12 + i11;
        int i14 = this.f27053b;
        if (i13 <= i14) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i11);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f27058g + i12 + i11 <= this.f27059h && (inputStream = this.f27056e) != null) {
            byte[] bArr = this.f27052a;
            if (i12 > 0) {
                if (i14 > i12) {
                    System.arraycopy(bArr, i12, bArr, 0, i14 - i12);
                }
                this.f27058g += i12;
                this.f27053b -= i12;
                this.f27055d = 0;
            }
            int i15 = this.f27053b;
            int read = inputStream.read(bArr, i15, bArr.length - i15);
            if (read == 0 || read < -1 || read > bArr.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(read);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (read > 0) {
                this.f27053b += read;
                if ((this.f27058g + i11) - 67108864 > 0) {
                    throw new j("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                s();
                if (this.f27053b >= i11) {
                    return true;
                }
                return w(i11);
            }
        }
        return false;
    }

    public final void a(int i11) throws j {
        if (this.f27057f != i11) {
            throw new j("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        int i11 = this.f27059h;
        if (i11 == Integer.MAX_VALUE) {
            return -1;
        }
        return i11 - (this.f27058g + this.f27055d);
    }

    public final void d(int i11) {
        this.f27059h = i11;
        s();
    }

    public final int e(int i11) throws j {
        if (i11 < 0) {
            throw new j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i12 = this.f27058g + this.f27055d + i11;
        int i13 = this.f27059h;
        if (i12 > i13) {
            throw j.d();
        }
        this.f27059h = i12;
        s();
        return i13;
    }

    public final c f() throws IOException {
        int n11 = n();
        int i11 = this.f27053b;
        int i12 = this.f27055d;
        if (n11 > i11 - i12 || n11 <= 0) {
            return n11 == 0 ? c.f27045a : new o(k(n11));
        }
        c cVar = c.f27045a;
        byte[] bArr = new byte[n11];
        System.arraycopy(this.f27052a, i12, bArr, 0, n11);
        o oVar = new o(bArr);
        this.f27055d += n11;
        return oVar;
    }

    public final void g(int i11, p.a aVar, f fVar) throws IOException {
        int i12 = this.f27060i;
        if (i12 >= 64) {
            throw new j("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        this.f27060i = i12 + 1;
        aVar.q1(this, fVar);
        a((i11 << 3) | 4);
        this.f27060i--;
    }

    public final int h() throws IOException {
        return n();
    }

    public final <T extends p> T i(r<T> rVar, f fVar) throws IOException {
        int n11 = n();
        if (this.f27060i >= 64) {
            throw new j("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e11 = e(n11);
        this.f27060i++;
        T a11 = rVar.a(this, fVar);
        a(0);
        this.f27060i--;
        d(e11);
        return a11;
    }

    public final void j(p.a aVar, f fVar) throws IOException {
        int n11 = n();
        if (this.f27060i >= 64) {
            throw new j("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e11 = e(n11);
        this.f27060i++;
        aVar.q1(this, fVar);
        a(0);
        this.f27060i--;
        d(e11);
    }

    public final int l() throws IOException {
        int i11 = this.f27055d;
        if (this.f27053b - i11 < 4) {
            t(4);
            i11 = this.f27055d;
        }
        this.f27055d = i11 + 4;
        byte[] bArr = this.f27052a;
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public final long m() throws IOException {
        int i11 = this.f27055d;
        if (this.f27053b - i11 < 8) {
            t(8);
            i11 = this.f27055d;
        }
        this.f27055d = i11 + 8;
        byte[] bArr = this.f27052a;
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }

    public final int n() throws IOException {
        int i11;
        int i12 = this.f27055d;
        int i13 = this.f27053b;
        if (i13 != i12) {
            int i14 = i12 + 1;
            byte[] bArr = this.f27052a;
            byte b11 = bArr[i12];
            if (b11 >= 0) {
                this.f27055d = i14;
                return b11;
            }
            if (i13 - i14 >= 9) {
                int i15 = i12 + 2;
                int i16 = (bArr[i14] << 7) ^ b11;
                long j11 = i16;
                if (j11 < 0) {
                    i11 = (int) ((-128) ^ j11);
                } else {
                    int i17 = i12 + 3;
                    int i18 = (bArr[i15] << 14) ^ i16;
                    long j12 = i18;
                    if (j12 >= 0) {
                        i11 = (int) (16256 ^ j12);
                    } else {
                        int i19 = i12 + 4;
                        long j13 = i18 ^ (bArr[i17] << 21);
                        if (j13 < 0) {
                            i11 = (int) ((-2080896) ^ j13);
                        } else {
                            i17 = i12 + 5;
                            int i21 = (int) ((r1 ^ (r2 << 28)) ^ 266354560);
                            if (bArr[i19] < 0) {
                                i19 = i12 + 6;
                                if (bArr[i17] < 0) {
                                    i17 = i12 + 7;
                                    if (bArr[i19] < 0) {
                                        i19 = i12 + 8;
                                        if (bArr[i17] < 0) {
                                            i17 = i12 + 9;
                                            if (bArr[i19] < 0) {
                                                int i22 = i12 + 10;
                                                if (bArr[i17] >= 0) {
                                                    i15 = i22;
                                                    i11 = i21;
                                                }
                                            }
                                        }
                                    }
                                }
                                i11 = i21;
                            }
                            i11 = i21;
                        }
                        i15 = i19;
                    }
                    i15 = i17;
                }
                this.f27055d = i15;
                return i11;
            }
        }
        return (int) p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o() throws IOException {
        long j11;
        long j12;
        long j13;
        int i11 = this.f27055d;
        int i12 = this.f27053b;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f27052a;
            byte b11 = bArr[i11];
            if (b11 >= 0) {
                this.f27055d = i13;
                return b11;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                long j14 = (bArr[i13] << 7) ^ b11;
                if (j14 >= 0) {
                    int i15 = i11 + 3;
                    long j15 = j14 ^ (bArr[i14] << 14);
                    if (j15 >= 0) {
                        j13 = 16256;
                    } else {
                        i14 = i11 + 4;
                        j14 = j15 ^ (bArr[i15] << 21);
                        if (j14 < 0) {
                            j12 = -2080896;
                        } else {
                            i15 = i11 + 5;
                            j15 = j14 ^ (bArr[i14] << 28);
                            if (j15 >= 0) {
                                j13 = 266354560;
                            } else {
                                i14 = i11 + 6;
                                j14 = j15 ^ (bArr[i15] << 35);
                                if (j14 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i15 = i11 + 7;
                                    j15 = j14 ^ (bArr[i14] << 42);
                                    if (j15 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i14 = i11 + 8;
                                        j14 = j15 ^ (bArr[i15] << 49);
                                        if (j14 >= 0) {
                                            long j16 = (j14 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                            i14 = j16 < 0 ? i11 + 10 : i11 + 9;
                                            j11 = j16;
                                            this.f27055d = i14;
                                            return j11;
                                        }
                                        j12 = -558586000294016L;
                                    }
                                }
                            }
                        }
                    }
                    i14 = i15;
                    j11 = j13 ^ j15;
                    this.f27055d = i14;
                    return j11;
                }
                j12 = -128;
                j11 = j12 ^ j14;
                this.f27055d = i14;
                return j11;
            }
        }
        return p();
    }

    final long p() throws IOException {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            if (this.f27055d == this.f27053b) {
                t(1);
            }
            int i12 = this.f27055d;
            this.f27055d = i12 + 1;
            j11 |= (r3 & Byte.MAX_VALUE) << i11;
            if ((this.f27052a[i12] & 128) == 0) {
                return j11;
            }
        }
        throw new j("CodedInputStream encountered a malformed varint.");
    }

    public final String q() throws IOException {
        int n11 = n();
        int i11 = this.f27053b;
        int i12 = this.f27055d;
        if (n11 > i11 - i12 || n11 <= 0) {
            return n11 == 0 ? "" : new String(k(n11), "UTF-8");
        }
        String str = new String(this.f27052a, i12, n11, "UTF-8");
        this.f27055d += n11;
        return str;
    }

    public final int r() throws IOException {
        if (this.f27055d == this.f27053b && !w(1)) {
            this.f27057f = 0;
            return 0;
        }
        int n11 = n();
        this.f27057f = n11;
        if ((n11 >>> 3) != 0) {
            return n11;
        }
        throw new j("Protocol message contained an invalid tag (zero).");
    }

    public final boolean u(int i11, e eVar) throws IOException {
        int r11;
        int i12 = i11 & 7;
        if (i12 == 0) {
            long o11 = o();
            eVar.v(i11);
            eVar.w(o11);
            return true;
        }
        if (i12 == 1) {
            long m11 = m();
            eVar.v(i11);
            eVar.u(m11);
            return true;
        }
        if (i12 == 2) {
            c f7 = f();
            eVar.v(i11);
            eVar.v(f7.size());
            eVar.r(f7);
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw new j("Protocol message tag had invalid wire type.");
            }
            int l11 = l();
            eVar.v(i11);
            eVar.t(l11);
            return true;
        }
        eVar.v(i11);
        do {
            r11 = r();
            if (r11 == 0) {
                break;
            }
        } while (u(r11, eVar));
        int i13 = ((i11 >>> 3) << 3) | 4;
        a(i13);
        eVar.v(i13);
        return true;
    }

    public final void v(int i11) throws IOException {
        int i12 = this.f27053b;
        int i13 = this.f27055d;
        int i14 = i12 - i13;
        if (i11 <= i14 && i11 >= 0) {
            this.f27055d = i13 + i11;
            return;
        }
        if (i11 < 0) {
            throw new j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i15 = this.f27058g;
        int i16 = i15 + i13 + i11;
        int i17 = this.f27059h;
        if (i16 > i17) {
            v((i17 - i15) - i13);
            throw j.d();
        }
        this.f27055d = i12;
        t(1);
        while (true) {
            int i18 = i11 - i14;
            int i19 = this.f27053b;
            if (i18 <= i19) {
                this.f27055d = i18;
                return;
            } else {
                i14 += i19;
                this.f27055d = i19;
                t(1);
            }
        }
    }
}
