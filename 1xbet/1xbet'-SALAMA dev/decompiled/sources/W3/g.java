package W3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements J3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f6715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J3.j f6716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6717c;

    public g(k kVar, J3.j jVar, int i7) {
        this.f6715a = kVar;
        this.f6716b = jVar;
        this.f6717c = i7;
    }

    @Override // J3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        a aVar = (a) this.f6715a;
        aVar.getClass();
        int length = bArr.length;
        int i7 = aVar.f6697b;
        int i8 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i7;
        if (length > i8) {
            throw new GeneralSecurityException(p031e1.k.d(i8, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i7];
        byte[] bArrA = n.a(i7);
        System.arraycopy(bArrA, 0, bArr3, 0, i7);
        aVar.a(bArr, 0, bArr.length, bArr3, aVar.f6697b, bArrA, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return P6.b.d(bArr3, this.f6716b.b(P6.b.d(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // J3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i7 = this.f6717c;
        if (length < i7) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i7);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i7, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f6716b.a(bArrCopyOfRange2, P6.b.d(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        a aVar = (a) this.f6715a;
        aVar.getClass();
        int length2 = bArrCopyOfRange.length;
        int i8 = aVar.f6697b;
        if (length2 < i8) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr3 = new byte[i8];
        System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i8);
        int length3 = bArrCopyOfRange.length;
        int i9 = aVar.f6697b;
        byte[] bArr4 = new byte[length3 - i9];
        aVar.a(bArrCopyOfRange, i9, bArrCopyOfRange.length - i9, bArr4, 0, bArr3, false);
        return bArr4;
    }
}
