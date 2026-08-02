package com.visa.cbp;

/* loaded from: classes5.dex */
public interface setWidth {
    byte[] BuildConfig(android.content.Context context, com.visa.cbp.setCertUsage setcertusage) throws java.security.cert.CertificateException, java.security.UnrecoverableEntryException, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.io.IOException;

    byte[] BuildConfig(android.content.Context context, byte[] bArr, com.visa.cbp.getLocale getlocale);

    byte[] BuildConfig(android.content.Context context, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    java.lang.String ConfirmReplenishRequest();

    byte[] ConfirmReplenishRequest(android.content.Context context, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, java.lang.String str, byte[] bArr7, byte[] bArr8);

    java.util.List<java.lang.String[]> ReplenishAckRequest(android.content.Context context);

    byte[] ReplenishAckRequest(android.content.Context context, java.lang.String str);

    byte[] ReplenishAckRequest(android.content.Context context, byte[] bArr, byte[] bArr2);

    byte[] valueOf(android.content.Context context, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    byte[] valueOf(android.content.Context context, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, java.lang.String str, byte[] bArr7);

    java.security.KeyPair values(android.content.Context context, com.visa.cbp.setCertUsage setcertusage);

    java.util.List<byte[]> values(android.content.Context context, byte[] bArr, byte[] bArr2, byte[] bArr3);

    java.util.List<byte[]> values(android.content.Context context, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    byte[] values(android.content.Context context, byte[] bArr);

    byte[] values(android.content.Context context, byte[] bArr, java.lang.String str);

    byte[] values(android.content.Context context, byte[] bArr, byte[] bArr2);
}
