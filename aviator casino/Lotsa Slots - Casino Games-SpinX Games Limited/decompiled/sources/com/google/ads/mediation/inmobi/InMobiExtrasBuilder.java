package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
public class InMobiExtrasBuilder {
    public static final java.lang.String COPPA = "coppa";
    public static final java.lang.String THIRD_PARTY_KEY = "tp";
    public static final java.lang.String THIRD_PARTY_VERSION = "tp-ver";

    public static com.google.ads.mediation.inmobi.InMobiExtras build(android.content.Context context, android.os.Bundle bundle, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (bundle != null && bundle.keySet() != null) {
            for (java.lang.String str2 : bundle.keySet()) {
                if (!str2.contains(com.google.ads.mediation.inmobi.InMobiNetworkKeys.IAB_US_PRIVACY_STRING)) {
                    hashMap.put(str2, bundle.getString(str2));
                }
            }
        }
        java.lang.String string = context.getSharedPreferences("NonNullPackage", 0).getString(com.google.ads.mediation.inmobi.InMobiNetworkKeys.IAB_US_PRIVACY_STRING, null);
        if (string != null) {
            com.inmobi.compliance.InMobiPrivacyCompliance.setUSPrivacyString(string);
        }
        hashMap.put("tp", str);
        hashMap.put("tp-ver", com.google.android.gms.ads.MobileAds.getVersion().toString());
        if (com.google.android.gms.ads.MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment() == 1) {
            hashMap.put("coppa", "1");
        } else {
            hashMap.put("coppa", "0");
        }
        return new com.google.ads.mediation.inmobi.InMobiExtras(hashMap, "");
    }
}
