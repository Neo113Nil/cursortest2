package visa;

/* loaded from: classes18.dex */
public interface VISAKernelCallback {
    byte[] exchange(byte[] bArr) throws java.io.IOException;

    int updateUI(int i);

    default byte[] sha1(byte[] bArr) {
        try {
            return java.security.MessageDigest.getInstance("SHA-1").digest(bArr);
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    default byte[] rsaCipher(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            if ((bArr[0] & 128) != 0) {
                byte[] bArr4 = new byte[bArr.length + 1];
                bArr4[0] = 0;
                java.lang.System.arraycopy(bArr, 0, bArr4, 1, bArr.length);
                bArr = bArr4;
            }
            java.security.PublicKey generatePublic = java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.RSAPublicKeySpec(new java.math.BigInteger(bArr), new java.math.BigInteger(bArr2)));
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/ECB/NoPadding");
            cipher.init(i, generatePublic);
            return cipher.doFinal(bArr3);
        } catch (java.security.GeneralSecurityException e) {
            java.lang.System.err.println(e);
            return null;
        }
    }

    static void l(int i, java.lang.String str) {
        common.emv.util.Logger.isLogEnable();
    }
}
