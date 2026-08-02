package W3;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public final class a implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final L3.b f6695d = new L3.b(2);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f6696a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6697b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6698c;

    public a(byte[] bArr, int i7) {
        if (!AbstractC1663a.b(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        o.a(bArr.length);
        this.f6696a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f6695d.get()).getBlockSize();
        this.f6698c = blockSize;
        if (i7 < 12 || i7 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f6697b = i7;
    }

    public final void a(byte[] bArr, int i7, int i8, byte[] bArr2, int i9, byte[] bArr3, boolean z4) {
        Cipher cipher = (Cipher) f6695d.get();
        byte[] bArr4 = new byte[this.f6698c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f6697b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f6696a;
        if (z4) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i7, i8, bArr2, i9) != i8) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
