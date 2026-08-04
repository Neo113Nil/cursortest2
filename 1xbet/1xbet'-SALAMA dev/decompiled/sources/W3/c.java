package W3;

import W5.AbstractC0486a1;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements J3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6706b;

    public c(byte[] bArr, int i7) throws GeneralSecurityException {
        this.f6705a = i7;
        switch (i7) {
            case 1:
                this.f6706b = new L3.f(bArr, 0);
                return;
            case 2:
                this.f6706b = new L3.f(bArr, 1);
                return;
            default:
                if (!p150v0.a.b(2)) {
                    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                }
                this.f6706b = new L3.c(bArr);
                return;
        }
    }

    @Override // J3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f6705a) {
            case 0:
                byte[] bArrA = n.a(12);
                L3.c cVar = (L3.c) this.f6706b;
                cVar.getClass();
                if (bArrA.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                }
                if (bArr.length > 2147483619) {
                    throw new GeneralSecurityException("plaintext too long");
                }
                boolean z4 = cVar.f4332b;
                byte[] bArr3 = new byte[z4 ? bArr.length + 28 : bArr.length + 16];
                if (z4) {
                    System.arraycopy(bArrA, 0, bArr3, 0, 12);
                }
                AlgorithmParameterSpec algorithmParameterSpecA = L3.c.a(bArrA);
                L3.b bVar = L3.c.f4330c;
                ((Cipher) bVar.get()).init(1, cVar.f4331a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) bVar.get()).updateAAD(bArr2);
                }
                int iDoFinal = ((Cipher) bVar.get()).doFinal(bArr, 0, bArr.length, bArr3, z4 ? 12 : 0);
                if (iDoFinal == bArr.length + 16) {
                    return bArr3;
                }
                throw new GeneralSecurityException(AbstractC0486a1.f(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
            case 1:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrA2 = n.a(12);
                byteBufferAllocate.put(bArrA2);
                ((L3.f) this.f6706b).i(byteBufferAllocate, bArrA2, bArr, bArr2);
                return byteBufferAllocate.array();
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrA3 = n.a(24);
                byteBufferAllocate2.put(bArrA3);
                ((L3.f) this.f6706b).i(byteBufferAllocate2, bArrA3, bArr, bArr2);
                return byteBufferAllocate2.array();
        }
    }

    @Override // J3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f6705a) {
            case 0:
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
                L3.c cVar = (L3.c) this.f6706b;
                cVar.getClass();
                if (bArrCopyOf.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                }
                boolean z4 = cVar.f4332b;
                if (bArr.length < (z4 ? 28 : 16)) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (z4 && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                AlgorithmParameterSpec algorithmParameterSpecA = L3.c.a(bArrCopyOf);
                L3.b bVar = L3.c.f4330c;
                ((Cipher) bVar.get()).init(2, cVar.f4331a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) bVar.get()).updateAAD(bArr2);
                }
                int i7 = z4 ? 12 : 0;
                int length = bArr.length;
                if (z4) {
                    length -= 12;
                }
                return ((Cipher) bVar.get()).doFinal(bArr, i7, length);
            case 1:
                if (bArr.length < 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((L3.f) this.f6706b).h(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
            default:
                if (bArr.length < 40) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((L3.f) this.f6706b).h(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
        }
    }
}
