package com.visa.cbp;

/* loaded from: classes5.dex */
public interface setvProvisionedTokenID {
    byte[] BuildConfig(android.content.Context context, java.lang.String str, byte[] bArr);

    byte[] BuildConfig(android.content.Context context, java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, java.lang.String str2, byte[] bArr7, byte[] bArr8) throws java.io.IOException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.UnrecoverableEntryException, java.security.InvalidAlgorithmParameterException, javax.crypto.NoSuchPaddingException, javax.crypto.BadPaddingException, java.security.KeyStoreException, javax.crypto.IllegalBlockSizeException;

    byte[] ReplenishAckRequest(android.content.Context context, java.lang.String str, byte[] bArr);

    byte[] ReplenishAckRequest(android.content.Context context, byte[] bArr, byte[] bArr2);

    byte[] ReplenishAckRequest(android.content.Context context, byte[] bArr, byte[] bArr2, java.lang.String str, byte[] bArr3, byte[] bArr4) throws java.io.IOException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.UnrecoverableEntryException, java.security.InvalidAlgorithmParameterException, javax.crypto.NoSuchPaddingException, javax.crypto.BadPaddingException, java.security.KeyStoreException, javax.crypto.IllegalBlockSizeException;

    java.util.List<java.lang.String[]> valueOf(android.content.Context context);

    java.util.List<byte[]> valueOf(android.content.Context context, byte[] bArr, java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr2, byte[] bArr3) throws java.io.IOException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.UnrecoverableEntryException, java.security.InvalidAlgorithmParameterException, javax.crypto.NoSuchPaddingException, javax.crypto.BadPaddingException, java.security.KeyStoreException, javax.crypto.IllegalBlockSizeException;

    java.util.List<byte[]> valueOf(android.content.Context context, byte[] bArr, byte[] bArr2, java.lang.String str, byte[] bArr3, byte[] bArr4, java.security.PublicKey publicKey) throws java.io.IOException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.UnrecoverableEntryException, java.security.InvalidAlgorithmParameterException, javax.crypto.NoSuchPaddingException, javax.crypto.BadPaddingException, java.security.KeyStoreException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchProviderException, java.security.spec.InvalidKeySpecException;

    byte[] valueOf(android.content.Context context, java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, java.lang.String str2, byte[] bArr7) throws java.io.IOException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.UnrecoverableEntryException, java.security.InvalidAlgorithmParameterException, javax.crypto.NoSuchPaddingException, javax.crypto.BadPaddingException, java.security.KeyStoreException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchProviderException;

    byte[] valueOf(android.content.Context context, byte[] bArr, byte[] bArr2) throws java.io.IOException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.UnrecoverableEntryException, java.security.InvalidAlgorithmParameterException, javax.crypto.NoSuchPaddingException, javax.crypto.BadPaddingException, java.security.KeyStoreException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchProviderException;

    byte[] valueOf(android.content.Context context, byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.io.IOException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.UnrecoverableEntryException, java.security.InvalidAlgorithmParameterException, javax.crypto.NoSuchPaddingException, javax.crypto.BadPaddingException, java.security.KeyStoreException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchProviderException;

    byte[] valueOf(android.content.Context context, byte[] bArr, byte[] bArr2, byte[] bArr3, java.lang.String str, byte[] bArr4, byte[] bArr5) throws java.io.IOException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.UnrecoverableEntryException, java.security.InvalidAlgorithmParameterException, javax.crypto.NoSuchPaddingException, javax.crypto.BadPaddingException, java.security.KeyStoreException, javax.crypto.IllegalBlockSizeException;

    void values();

    byte[] values(android.content.Context context, byte[] bArr) throws java.io.IOException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.UnrecoverableEntryException, java.security.InvalidAlgorithmParameterException, javax.crypto.NoSuchPaddingException, javax.crypto.BadPaddingException, java.security.KeyStoreException, javax.crypto.IllegalBlockSizeException;

    byte[] values(android.content.Context context, byte[] bArr, byte[] bArr2);
}
