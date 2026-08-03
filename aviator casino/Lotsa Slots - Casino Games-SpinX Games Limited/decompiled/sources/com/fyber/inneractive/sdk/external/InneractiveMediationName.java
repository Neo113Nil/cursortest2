package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public enum InneractiveMediationName {
    ADMOB(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.ADMOB),
    DFP(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.DFP),
    FYBER(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.FYBER),
    OTHER("other");

    final java.lang.String key;

    InneractiveMediationName(java.lang.String str) {
        this.key = str;
    }

    public java.lang.String getKey() {
        return this.key;
    }
}
