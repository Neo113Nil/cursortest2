package com.visa.cbp;

/* loaded from: classes5.dex */
public interface getApi {
    void ConfirmReplenishRequest(int i, java.util.List<com.visa.cbp.sdk.facade.data.TokenData> list);

    java.util.List<com.visa.cbp.sdk.facade.data.TvlEntry> valueOf(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    void values(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.setTicketMetaData setticketmetadata, int i);
}
