package com.iab.omid.library.inmobi.adsession;

/* loaded from: classes5.dex */
public final class UniversalAdId {
    private final java.lang.String idRegistry;
    private final java.lang.String universalAdIdValue;

    private UniversalAdId(java.lang.String str, java.lang.String str2) {
        this.universalAdIdValue = str;
        this.idRegistry = str2;
    }

    public static com.iab.omid.library.inmobi.adsession.UniversalAdId createUniversalAdId(java.lang.String str, java.lang.String str2) {
        com.iab.omid.library.inmobi.utils.g.a(str, "UniversalADID is null or empty");
        com.iab.omid.library.inmobi.utils.g.a(str2, "UniversalADID registry is null or empty");
        return new com.iab.omid.library.inmobi.adsession.UniversalAdId(str, str2);
    }

    public java.lang.String toString() {
        return java.lang.String.format("%s; %s", this.universalAdIdValue, this.idRegistry);
    }
}
