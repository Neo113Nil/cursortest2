package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public class ApvKey {
    java.lang.String agr_key_knd;
    com.visa.cbp.sdk.facade.JwkApv jwk;
    java.lang.String kid_knd;

    public ApvKey(java.lang.String str) {
        this.agr_key_knd = "STATIC";
        this.kid_knd = "REFID";
        this.jwk = new com.visa.cbp.sdk.facade.JwkApv(str);
    }

    public /* synthetic */ ApvKey() {
    }
}
