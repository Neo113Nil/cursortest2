package com.visa.cbp;

/* loaded from: classes5.dex */
public interface DynParams {
    java.util.ArrayList<com.visa.cbp.setParamsStatus> ConfirmReplenishRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    long values(com.visa.cbp.setParamsStatus setparamsstatus);

    com.visa.cbp.setParamsStatus values(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str);
}
