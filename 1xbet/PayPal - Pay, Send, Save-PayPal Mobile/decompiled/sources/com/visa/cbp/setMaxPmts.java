package com.visa.cbp;

/* loaded from: classes5.dex */
public interface setMaxPmts {
    java.lang.String AidInfo();

    void BuildConfig(java.lang.String str);

    boolean BuildConfig(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    void ConfirmReplenishRequest(long j);

    void ConfirmReplenishRequest(java.lang.String str);

    void ConfirmReplenishRequest(boolean z);

    boolean ConfirmReplenishRequest(java.util.HashMap<com.visa.cbp.sdk.facade.data.IdStore, java.lang.String> hashMap);

    long ReplenishAckRequest();

    com.visa.cbp.getDeviceId ReplenishAckRequest(android.content.Context context);

    void ReplenishAckRequest(java.lang.String str);

    void ReplenishAckRequest(boolean z);

    boolean ReplenishAckRequest(com.visa.cbp.sdk.facade.data.CVMPriority cVMPriority);

    byte[] ReplenishAckRequest(com.visa.cbp.setKeyExpTS setkeyexpts);

    int ReplenishRequest();

    boolean ReplenishResponse();

    boolean Signature();

    java.lang.String getEncryptionMetaData();

    boolean getIssuerApplicationDiscretionaryData();

    boolean getMac();

    java.lang.String getSignature();

    java.lang.String getTokenInfo();

    java.util.HashMap<com.visa.cbp.sdk.facade.data.IdStore, java.lang.String> getTvls();

    java.lang.String setEncryptionMetaData();

    boolean setMac();

    com.visa.cbp.sdk.facade.data.CVMPriority setSignature();

    boolean setTokenInfo();

    byte[] setTvls();

    void valueOf(boolean z);

    void valueOf(byte[] bArr);

    boolean valueOf(android.content.Context context, int i);

    boolean valueOf(byte[] bArr, com.visa.cbp.setKeyExpTS setkeyexpts);

    com.visa.cbp.sdk.facade.data.TokenKey values();

    void values(android.content.Context context, java.lang.String str);

    void values(java.lang.String str);

    void values(boolean z);
}
