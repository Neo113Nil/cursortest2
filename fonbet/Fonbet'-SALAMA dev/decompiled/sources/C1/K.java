package C1;

import W5.AbstractC0486a1;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class K extends w {

    /* renamed from: i, reason: collision with root package name */
    public final long f1411i = 150000;
    public final long j = 20000;

    /* renamed from: k, reason: collision with root package name */
    public final short f1412k = 1024;

    /* renamed from: l, reason: collision with root package name */
    public int f1413l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1414m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f1415n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f1416o;

    /* renamed from: p, reason: collision with root package name */
    public int f1417p;

    /* renamed from: q, reason: collision with root package name */
    public int f1418q;

    /* renamed from: r, reason: collision with root package name */
    public int f1419r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1420s;

    /* renamed from: t, reason: collision with root package name */
    public long f1421t;

    public K() {
        byte[] bArr = v2.t.f17158f;
        this.f1415n = bArr;
        this.f1416o = bArr;
    }

    @Override // C1.InterfaceC0106l
    public final void c(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f1562g.hasRemaining()) {
            int i7 = this.f1417p;
            if (i7 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f1415n.length));
                int limit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(limit2)) > this.f1412k) {
                            int i8 = this.f1413l;
                            position = AbstractC0486a1.d(limit2, i8, i8, i8);
                            break;
                        }
                        limit2 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f1417p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f1420s = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i7 == 1) {
                int limit3 = byteBuffer.limit();
                int k7 = k(byteBuffer);
                int position2 = k7 - byteBuffer.position();
                byte[] bArr = this.f1415n;
                int length = bArr.length;
                int i9 = this.f1418q;
                int i10 = length - i9;
                if (k7 >= limit3 || position2 >= i10) {
                    int min = Math.min(position2, i10);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f1415n, this.f1418q, min);
                    int i11 = this.f1418q + min;
                    this.f1418q = i11;
                    byte[] bArr2 = this.f1415n;
                    if (i11 == bArr2.length) {
                        if (this.f1420s) {
                            l(this.f1419r, bArr2);
                            this.f1421t += (this.f1418q - (this.f1419r * 2)) / this.f1413l;
                        } else {
                            this.f1421t += (i11 - this.f1419r) / this.f1413l;
                        }
                        m(byteBuffer, this.f1415n, this.f1418q);
                        this.f1418q = 0;
                        this.f1417p = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    l(i9, bArr);
                    this.f1418q = 0;
                    this.f1417p = 0;
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException();
                }
                int limit4 = byteBuffer.limit();
                int k8 = k(byteBuffer);
                byteBuffer.limit(k8);
                this.f1421t += byteBuffer.remaining() / this.f1413l;
                m(byteBuffer, this.f1416o, this.f1419r);
                if (k8 < limit4) {
                    l(this.f1419r, this.f1416o);
                    this.f1417p = 0;
                    byteBuffer.limit(limit4);
                }
            }
        }
    }

    @Override // C1.w
    public final C0104j f(C0104j c0104j) {
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
            int i9 = ((int) ((this.f1411i * i8) / 1000000)) * i7;
            if (this.f1415n.length != i9) {
                this.f1415n = new byte[i9];
            }
            int i10 = ((int) ((this.j * i8) / 1000000)) * i7;
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
        this.f1421t += this.f1419r / this.f1413l;
    }

    @Override // C1.w
    public final void i() {
        this.f1414m = false;
        this.f1419r = 0;
        byte[] bArr = v2.t.f17158f;
        this.f1415n = bArr;
        this.f1416o = bArr;
    }

    @Override // C1.w, C1.InterfaceC0106l
    public final boolean isActive() {
        return this.f1414m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f1412k) {
                int i7 = this.f1413l;
                return (position / i7) * i7;
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
        int min = Math.min(byteBuffer.remaining(), this.f1419r);
        int i8 = this.f1419r - min;
        System.arraycopy(bArr, i7 - i8, this.f1416o, 0, i8);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f1416o, i8, min);
    }
}
