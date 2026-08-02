package com.visa.cbp;

/* loaded from: classes5.dex */
public interface getSc extends com.visa.cbp.setDki {
    int BuildConfig(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    int BuildConfig(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, int i);

    com.visa.cbp.Content BuildConfig(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, boolean z);

    com.visa.cbp.setDeviceId BuildConfig(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    boolean BuildConfig(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.sdk.j.b.d.C0206 c0206);

    boolean BuildConfig(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.Content content);

    boolean BuildConfig(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.external.common.ReplenishODAData replenishODAData);

    java.lang.String ConfirmReplenishRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    boolean ConfirmReplenishRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    boolean ConfirmReplenishRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, int i);

    boolean ConfirmReplenishRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str);

    boolean ConfirmReplenishRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str, com.visa.cbp.Content content);

    com.visa.cbp.Content ReplenishAckRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    java.util.List<com.visa.cbp.setDeviceId> ReplenishAckRequest();

    boolean ReplenishAckRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    boolean ReplenishAckRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str, com.visa.cbp.Content content, byte[] bArr);

    com.visa.cbp.external.common.DynParams ReplenishRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    boolean ReplenishRequest();

    boolean ReplenishRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    com.visa.cbp.sdk.facade.data.TokenType getEncryptionMetaData(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    com.visa.cbp.external.common.ODAData getTokenInfo(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    com.visa.cbp.sdk.facade.data.TokenData getTvls(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    com.visa.cbp.sdk.j.b.d.C0206 getTvls(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    java.util.List<com.visa.cbp.sdk.facade.data.TokenData> getTvls();

    boolean setEncryptionMetaData(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    long setTokenInfo(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    byte[] setTvls(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    int valueOf(android.content.Context context);

    int valueOf(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    com.visa.cbp.Content valueOf(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, int i);

    com.visa.cbp.sdk.facade.data.TokenKey valueOf(com.visa.cbp.external.enp.ProvisionResponse provisionResponse, byte[] bArr, com.visa.cbp.Content content, java.lang.String str);

    com.visa.cbp.sdk.facade.data.TokenKey valueOf(java.lang.String str);

    boolean valueOf(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.sdk.j.b.d.C0206 c0206, com.visa.cbp.external.common.DynParams dynParams);

    boolean valueOf(com.visa.cbp.external.common.CardMetadataUpdateResponse cardMetadataUpdateResponse);

    byte[] valueOf(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    int values(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    com.visa.cbp.setDeviceId values(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    java.util.List<com.visa.cbp.sdk.facade.data.TokenData> values();

    boolean values(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.sdk.j.b.d.C0206 c0206, com.visa.cbp.external.common.DynParams dynParams);

    boolean values(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.external.enp.RepersoTokenResponse repersoTokenResponse, com.visa.cbp.Content content);
}
