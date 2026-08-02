package U7;

import X7.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public abstract class t {

    /* renamed from: c, reason: collision with root package name */
    public static final a.EnumC0605a f27419c = a.EnumC0605a.ALGORITHM_NOT_FIPS;

    /* renamed from: a, reason: collision with root package name */
    private final r f27420a;

    /* renamed from: b, reason: collision with root package name */
    private final r f27421b;

    public t(byte[] bArr) throws GeneralSecurityException {
        if (!f27419c.a()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f27420a = d(1, bArr);
        this.f27421b = d(0, bArr);
    }

    private static byte[] c(ByteBuffer byteBuffer, byte[] bArr) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i11 = remaining % 16;
        int i12 = (i11 == 0 ? remaining : (remaining + 16) - i11) + length;
        ByteBuffer order = ByteBuffer.allocate(i12 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i12);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    public byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.f27421b.a(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(Ti.c.a(bArr4, c(byteBuffer, bArr2)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            return this.f27420a.c(byteBuffer, bArr);
        } catch (GeneralSecurityException e11) {
            throw new AEADBadTagException(e11.toString());
        }
    }

    public void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = byteBuffer.position();
        this.f27420a.d(byteBuffer, bArr, bArr2);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        this.f27421b.a(0, bArr).get(bArr4);
        byte[] a11 = Ti.c.a(bArr4, c(byteBuffer, bArr3));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(a11);
    }

    abstract r d(int i11, byte[] bArr) throws InvalidKeyException;
}
