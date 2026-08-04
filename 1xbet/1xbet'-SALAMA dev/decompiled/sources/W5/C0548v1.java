package W5;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* JADX INFO: renamed from: W5.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0548v1 extends AbstractC0490c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f7382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7383d = -1;

    public C0548v1(byte[] bArr, int i7, int i8) {
        p113p3.f.d("offset must be >= 0", i7 >= 0);
        p113p3.f.d("length must be >= 0", i8 >= 0);
        int i9 = i8 + i7;
        p113p3.f.d("offset + length exceeds array boundary", i9 <= bArr.length);
        this.f7382c = bArr;
        this.f7380a = i7;
        this.f7381b = i9;
    }

    @Override // W5.AbstractC0490c
    public final void b() {
        this.f7383d = this.f7380a;
    }

    @Override // W5.AbstractC0490c
    public final AbstractC0490c d(int i7) {
        a(i7);
        int i8 = this.f7380a;
        this.f7380a = i8 + i7;
        return new C0548v1(this.f7382c, i8, i7);
    }

    @Override // W5.AbstractC0490c
    public final void e(OutputStream outputStream, int i7) throws IOException {
        a(i7);
        outputStream.write(this.f7382c, this.f7380a, i7);
        this.f7380a += i7;
    }

    @Override // W5.AbstractC0490c
    public final void f(ByteBuffer byteBuffer) {
        p113p3.f.k(byteBuffer, "dest");
        int iRemaining = byteBuffer.remaining();
        a(iRemaining);
        byteBuffer.put(this.f7382c, this.f7380a, iRemaining);
        this.f7380a += iRemaining;
    }

    @Override // W5.AbstractC0490c
    public final void g(byte[] bArr, int i7, int i8) {
        System.arraycopy(this.f7382c, this.f7380a, bArr, i7, i8);
        this.f7380a += i8;
    }

    @Override // W5.AbstractC0490c
    public final int h() {
        a(1);
        int i7 = this.f7380a;
        this.f7380a = i7 + 1;
        return this.f7382c[i7] & 255;
    }

    @Override // W5.AbstractC0490c
    public final int i() {
        return this.f7381b - this.f7380a;
    }

    @Override // W5.AbstractC0490c
    public final void j(int i7) {
        a(i7);
        this.f7380a += i7;
    }

    @Override // W5.AbstractC0490c
    public final void reset() {
        int i7 = this.f7383d;
        if (i7 == -1) {
            throw new InvalidMarkException();
        }
        this.f7380a = i7;
    }
}
