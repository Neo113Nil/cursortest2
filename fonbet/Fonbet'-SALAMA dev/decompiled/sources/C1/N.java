package C1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class N extends w {

    /* renamed from: i, reason: collision with root package name */
    public int f1457i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1458k;

    /* renamed from: l, reason: collision with root package name */
    public int f1459l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f1460m;

    /* renamed from: n, reason: collision with root package name */
    public int f1461n;

    /* renamed from: o, reason: collision with root package name */
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
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 == 0) {
            return;
        }
        int min = Math.min(i7, this.f1459l);
        this.f1462o += min / this.f1557b.f1501d;
        this.f1459l -= min;
        byteBuffer.position(position + min);
        if (this.f1459l > 0) {
            return;
        }
        int i8 = i7 - min;
        int length = (this.f1461n + i8) - this.f1460m.length;
        ByteBuffer j = j(length);
        int j3 = v2.t.j(length, 0, this.f1461n);
        j.put(this.f1460m, 0, j3);
        int j7 = v2.t.j(length - j3, 0, i8);
        byteBuffer.limit(byteBuffer.position() + j7);
        j.put(byteBuffer);
        byteBuffer.limit(limit);
        int i9 = i8 - j7;
        int i10 = this.f1461n - j3;
        this.f1461n = i10;
        byte[] bArr = this.f1460m;
        System.arraycopy(bArr, j3, bArr, 0, i10);
        byteBuffer.get(this.f1460m, this.f1461n, i9);
        this.f1461n += i9;
        j.flip();
    }

    @Override // C1.w, C1.InterfaceC0106l
    public final boolean e() {
        return super.e() && this.f1461n == 0;
    }

    @Override // C1.w
    public final C0104j f(C0104j c0104j) {
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
            if (this.f1461n > 0) {
                this.f1462o += r0 / this.f1557b.f1501d;
            }
            this.f1461n = 0;
        }
    }

    @Override // C1.w
    public final void i() {
        this.f1460m = v2.t.f17158f;
    }
}
