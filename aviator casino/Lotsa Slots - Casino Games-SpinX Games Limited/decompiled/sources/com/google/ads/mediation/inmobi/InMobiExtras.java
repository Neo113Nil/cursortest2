package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
public final class InMobiExtras {
    private final java.lang.String keywords;
    private final java.util.HashMap<java.lang.String, java.lang.String> parameterMap;

    public InMobiExtras(java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.lang.String str) {
        this.parameterMap = hashMap;
        this.keywords = str;
    }

    public java.util.HashMap<java.lang.String, java.lang.String> getParameterMap() {
        return this.parameterMap;
    }

    public java.lang.String getKeywords() {
        return this.keywords;
    }
}
