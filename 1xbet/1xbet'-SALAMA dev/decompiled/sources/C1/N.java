package C1;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class N extends w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1457i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f1460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1462o;

    @Override // C1.w, C1.InterfaceC0106l
    public final ByteBuffer a() {
        int i7;
        if (super.e() && (i7 = this.f1461n) > 0) {
            j(i7).put(this.f1460m, 0, this.f1461n).flip();
            this.f1461n = 0;
        }
        return super.a();
    }

    @Override // C1.InterfaceC0106l
    public final void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i7 = iLimit - iPosition;
        if (i7 == 0) {
            return;
        }
        int iMin = Math.min(i7, this.f1459l);
        this.f1462o += (long) (iMin / this.f1557b.f1501d);
        this.f1459l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f1459l > 0) {
            return;
        }
        int i8 = i7 - iMin;
        int length = (this.f1461n + i8) - this.f1460m.length;
        ByteBuffer byteBufferJ = j(length);
        int iJ = p151v2.t.j(length, 0, this.f1461n);
        byteBufferJ.put(this.f1460m, 0, iJ);
        int iJ2 = p151v2.t.j(length - iJ, 0, i8);
        byteBuffer.limit(byteBuffer.position() + iJ2);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i9 = i8 - iJ2;
        int i10 = this.f1461n - iJ;
        this.f1461n = i10;
        byte[] bArr = this.f1460m;
        System.arraycopy(bArr, iJ, bArr, 0, i10);
        byteBuffer.get(this.f1460m, this.f1461n, i9);
        this.f1461n += i9;
        byteBufferJ.flip();
    }

    @Override // C1.w, C1.InterfaceC0106l
    public final boolean e() {
        return super.e() && this.f1461n == 0;
    }

    @Override // C1.w
    public final C0104j f(C0104j c0104j) throws C0105k {
        if (c0104j.f1500c != 2) {
            throw new C0105k(c0104j);
        }
        this.f1458k = true;
        return (this.f1457i == 0 && this.j == 0) ? C0104j.f1497e : c0104j;
    }

    @Override // C1.w
    public final void g() {
        if (this.f1458k) {
            this.f1458k = false;
            int i7 = this.j;
            int i8 = this.f1557b.f1501d;
            this.f1460m = new byte[i7 * i8];
            this.f1459l = this.f1457i * i8;
        }
        this.f1461n = 0;
    }

    @Override // C1.w
    public final void h() {
        if (this.f1458k) {
            int i7 = this.f1461n;
            if (i7 > 0) {
                this.f1462o += (long) (i7 / this.f1557b.f1501d);
            }
            this.f1461n = 0;
        }
    }

    @Override // C1.w
    public final void i() {
        this.f1460m = p151v2.t.f17164f;
    }
}
