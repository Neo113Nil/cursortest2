package com.google.i18n.phonenumbers.internal;

/* loaded from: classes9.dex */
public final class GeoEntityUtility {
    public static final java.lang.String REGION_CODE_FOR_NON_GEO_ENTITIES = "001";

    public static boolean isGeoEntity(java.lang.String str) {
        return !str.equals("001");
    }

    public static boolean isGeoEntity(int i) {
        java.util.List<java.lang.String> list = com.google.i18n.phonenumbers.CountryCodeToRegionCodeMap.getCountryCodeToRegionCodeMap().get(java.lang.Integer.valueOf(i));
        return (list == null || list.contains("001")) ? false : true;
    }

    private GeoEntityUtility() {
    }
}
