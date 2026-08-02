package com.visa.cbp;

/* loaded from: classes5.dex */
public interface setSignExpo {
    byte[] BuildConfig(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, java.lang.String str);

    byte[] ConfirmReplenishRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, byte[] bArr) throws java.security.UnrecoverableEntryException, java.security.cert.CertificateException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.io.IOException;

    void ReplenishAckRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    int valueOf(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, int i);

    java.lang.String valueOf(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    void valueOf(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str, byte[] bArr);

    void valueOf(java.lang.Exception exc);

    void values(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.setTicketMetaData setticketmetadata);

    byte[] values(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, byte[] bArr);
}
