package C1;

import W5.AbstractC0486a1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class K extends w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f1411i = 150000;
    public final long j = 20000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final short f1412k = 1024;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f1415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f1416o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f1421t;

    public K() {
        byte[] bArr = p151v2.t.f17164f;
        this.f1415n = bArr;
        this.f1416o = bArr;
    }

    @Override // C1.InterfaceC0106l
    public final void c(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f1562g.hasRemaining()) {
            int i7 = this.f1417p;
            if (i7 == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f1415n.length));
                int iLimit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.f1412k) {
                            int i8 = this.f1413l;
                            iPosition = AbstractC0486a1.d(iLimit2, i8, i8, i8);
                            break;
                        }
                        iLimit2 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f1417p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    j(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f1420s = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i7 == 1) {
                int iLimit3 = byteBuffer.limit();
                int iK = k(byteBuffer);
                int iPosition2 = iK - byteBuffer.position();
                byte[] bArr = this.f1415n;
                int length = bArr.length;
                int i9 = this.f1418q;
                int i10 = length - i9;
                if (iK >= iLimit3 || iPosition2 >= i10) {
                    int iMin = Math.min(iPosition2, i10);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f1415n, this.f1418q, iMin);
                    int i11 = this.f1418q + iMin;
                    this.f1418q = i11;
                    byte[] bArr2 = this.f1415n;
                    if (i11 == bArr2.length) {
                        if (this.f1420s) {
                            l(this.f1419r, bArr2);
                            this.f1421t += (long) ((this.f1418q - (this.f1419r * 2)) / this.f1413l);
                        } else {
                            this.f1421t += (long) ((i11 - this.f1419r) / this.f1413l);
                        }
                        m(byteBuffer, this.f1415n, this.f1418q);
                        this.f1418q = 0;
                        this.f1417p = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    l(i9, bArr);
                    this.f1418q = 0;
                    this.f1417p = 0;
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iK2 = k(byteBuffer);
                byteBuffer.limit(iK2);
                this.f1421t += (long) (byteBuffer.remaining() / this.f1413l);
                m(byteBuffer, this.f1416o, this.f1419r);
                if (iK2 < iLimit4) {
                    l(this.f1419r, this.f1416o);
                    this.f1417p = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }

    @Override // C1.w
    public final C0104j f(C0104j c0104j) throws C0105k {
        if (c0104j.f1500c == 2) {
            return this.f1414m ? c0104j : C0104j.f1497e;
        }
        throw new C0105k(c0104j);
    }

    @Override // C1.w
    public final void g() {
        if (this.f1414m) {
            C0104j c0104j = this.f1557b;
            int i7 = c0104j.f1501d;
            this.f1413l = i7;
            int i8 = c0104j.f1498a;
            int i9 = ((int) ((this.f1411i * ((long) i8)) / 1000000)) * i7;
            if (this.f1415n.length != i9) {
                this.f1415n = new byte[i9];
            }
            int i10 = ((int) ((this.j * ((long) i8)) / 1000000)) * i7;
            this.f1419r = i10;
            if (this.f1416o.length != i10) {
                this.f1416o = new byte[i10];
            }
        }
        this.f1417p = 0;
        this.f1421t = 0L;
        this.f1418q = 0;
        this.f1420s = false;
    }

    @Override // C1.w
    public final void h() {
        int i7 = this.f1418q;
        if (i7 > 0) {
            l(i7, this.f1415n);
        }
        if (this.f1420s) {
            return;
        }
        this.f1421t += (long) (this.f1419r / this.f1413l);
    }

    @Override // C1.w
    public final void i() {
        this.f1414m = false;
        this.f1419r = 0;
        byte[] bArr = p151v2.t.f17164f;
        this.f1415n = bArr;
        this.f1416o = bArr;
    }

    @Override // C1.w, C1.InterfaceC0106l
    public final boolean isActive() {
        return this.f1414m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f1412k) {
                int i7 = this.f1413l;
                return (iPosition / i7) * i7;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(int i7, byte[] bArr) {
        j(i7).put(bArr, 0, i7).flip();
        if (i7 > 0) {
            this.f1420s = true;
        }
    }

    public final void m(ByteBuffer byteBuffer, byte[] bArr, int i7) {
        int iMin = Math.min(byteBuffer.remaining(), this.f1419r);
        int i8 = this.f1419r - iMin;
        System.arraycopy(bArr, i7 - i8, this.f1416o, 0, i8);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f1416o, i8, iMin);
    }
}
