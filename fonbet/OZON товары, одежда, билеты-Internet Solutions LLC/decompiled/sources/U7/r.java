package U7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes9.dex */
abstract class r {

    /* renamed from: a, reason: collision with root package name */
    int[] f27417a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27418b;

    public r(int i11, byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f27417a = o.f(bArr);
        this.f27418b = i11;
    }

    private void f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != e()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + e());
        }
        int remaining = byteBuffer2.remaining();
        int i11 = remaining / 64;
        int i12 = i11 + 1;
        for (int i13 = 0; i13 < i12; i13++) {
            ByteBuffer a11 = a(this.f27418b + i13, bArr);
            if (i13 == i11) {
                i8.h.b(byteBuffer, byteBuffer2, a11, remaining % 64);
            } else {
                i8.h.b(byteBuffer, byteBuffer2, a11, 64);
            }
        }
    }

    final ByteBuffer a(int i11, byte[] bArr) {
        int[] b11 = b(o.f(bArr), i11);
        int[] iArr = (int[]) b11.clone();
        o.e(iArr);
        for (int i12 = 0; i12 < b11.length; i12++) {
            b11[i12] = b11[i12] + iArr[i12];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b11, 0, 16);
        return order;
    }

    abstract int[] b(int[] iArr, int i11);

    public byte[] c(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        f(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    public void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    abstract int e();
}
