package com.visa.cbp;

/* loaded from: classes5.dex */
public interface setEncExpo {
    public static final byte[] valueOf = com.visa.cbp.getEncExpo.toString;
    public static final byte[] BuildConfig = com.visa.cbp.getEncExpo.aid;

    void BuildConfig(com.visa.cbp.sdk.facade.data.CVMPriority cVMPriority);

    void BuildConfig(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    com.visa.cbp.sdk.facade.data.TokenKey ConfirmReplenishRequest();

    void ConfirmReplenishRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str, boolean z);

    byte[] ConfirmReplenishRequest(android.content.Context context, byte[] bArr, android.os.Bundle bundle, boolean z, com.visa.cbp.sdk.facade.data.CvmMode cvmMode, boolean z2) throws java.security.UnrecoverableEntryException, java.security.cert.CertificateException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.io.IOException;

    int valueOf(android.content.Context context);

    void valueOf(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    boolean valueOf(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    boolean valueOf(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.external.common.PaywaveData paywaveData, int i, boolean z);
}
