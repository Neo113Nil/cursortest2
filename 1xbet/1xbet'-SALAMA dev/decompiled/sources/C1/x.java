package C1;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class x extends w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f1564i;
    public int[] j;

    @Override // C1.InterfaceC0106l
    public final void c(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.f1557b.f1501d) * this.f1558c.f1501d);
        while (iPosition < iLimit) {
            for (int i7 : iArr) {
                byteBufferJ.putShort(byteBuffer.getShort((i7 * 2) + iPosition));
            }
            iPosition += this.f1557b.f1501d;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }

    @Override // C1.w
    public final C0104j f(C0104j c0104j) throws C0105k {
        int[] iArr = this.f1564i;
        if (iArr == null) {
            return C0104j.f1497e;
        }
        if (c0104j.f1500c != 2) {
            throw new C0105k(c0104j);
        }
        int length = iArr.length;
        int i7 = c0104j.f1499b;
        boolean z4 = i7 != length;
        int i8 = 0;
        while (i8 < iArr.length) {
            int i9 = iArr[i8];
            if (i9 >= i7) {
                throw new C0105k(c0104j);
            }
            z4 |= i9 != i8;
            i8++;
        }
        return z4 ? new C0104j(c0104j.f1498a, iArr.length, 2) : C0104j.f1497e;
    }

    @Override // C1.w
    public final void g() {
        this.j = this.f1564i;
    }

    @Override // C1.w
    public final void i() {
        this.j = null;
        this.f1564i = null;
    }
}
