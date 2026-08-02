package a8;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.stats.CodePackage;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements S7.a {

        /* renamed from: a, reason: collision with root package name */
        private final SecretKey f36430a;

        public a(String str, KeyStore keyStore) throws GeneralSecurityException {
            SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
            this.f36430a = secretKey;
            if (secretKey == null) {
                throw new InvalidKeyException(Nk.a.b("Keystore cannot load the key with ID: ", str));
            }
        }

        @Override // S7.a
        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 2147483619) {
                throw new GeneralSecurityException("plaintext too long");
            }
            byte[] bArr3 = new byte[bArr.length + 28];
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, this.f36430a);
            cipher.updateAAD(bArr2);
            if (cipher.doFinal(bArr, 0, bArr.length, bArr3, 12) != bArr.length + 16) {
                throw new GeneralSecurityException("encryption failed: bytesWritten is wrong");
            }
            byte[] iv = cipher.getIV();
            if (iv.length != 12) {
                throw new GeneralSecurityException("IV has unexpected length");
            }
            System.arraycopy(iv, 0, bArr3, 0, 12);
            return bArr3;
        }

        @Override // S7.a
        public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length < 28) {
                throw new BadPaddingException("ciphertext too short");
            }
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, bArr, 0, 12);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, this.f36430a, gCMParameterSpec);
            cipher.updateAAD(bArr2);
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        }
    }

    public static void a(String str) throws GeneralSecurityException {
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(str, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(build);
        keyGenerator.generateKey();
    }
}
