package com.visa.cbp.sdk.facade.activeaccountmanagement;

/* loaded from: classes5.dex */
public class RequestMapperUtil {
    public static com.visa.cbp.external.common.TokenInfo trimTokenInfoForRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.getSc getsc) {
        com.visa.cbp.external.common.TokenInfo tokenInfo = new com.visa.cbp.external.common.TokenInfo();
        com.visa.cbp.external.common.HceData hceData = new com.visa.cbp.external.common.HceData();
        com.visa.cbp.external.common.DynParams dynParams = new com.visa.cbp.external.common.DynParams();
        com.visa.cbp.sdk.j.b.d.C0206 tvls = getsc.getTvls(context, tokenKey);
        dynParams.setApi(tvls.m23156());
        dynParams.setSc(tvls.m23135().intValue());
        hceData.setDynParams(dynParams);
        tokenInfo.setHceData(hceData);
        return tokenInfo;
    }
}
