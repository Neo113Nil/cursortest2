package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public class KeyAgr {
    java.lang.String alg;
    java.util.List<com.visa.cbp.sdk.facade.ApuKey> apu_keys;
    java.util.List<com.visa.cbp.sdk.facade.ApvKey> apv_keys;

    public KeyAgr(java.util.List<com.visa.cbp.sdk.facade.ApuKey> list, java.util.List<com.visa.cbp.sdk.facade.ApvKey> list2) {
        this.alg = org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.ECDH_ES;
        this.apu_keys = list;
        this.apv_keys = list2;
    }

    public /* synthetic */ KeyAgr() {
    }
}
