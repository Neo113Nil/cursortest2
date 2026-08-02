package com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo;

/* loaded from: classes10.dex */
public final class ClassInfo {
    private final java.lang.Object Camera2StreamConfigurationMap;
    private final long getHighSpeedVideoFpsRanges;

    public ClassInfo(long j, java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = j;
        this.Camera2StreamConfigurationMap = obj;
    }

    private static native java.lang.String countryNameNativeGet(long j);

    private static native int countryNativeGet(long j);

    private static native boolean emptyNativeGet(long j);

    private static native java.lang.String isoAlpha2CountryCodeNativeGet(long j);

    private static native java.lang.String isoAlpha3CountryCodeNativeGet(long j);

    private static native java.lang.String isoNumericCountryCodeNativeGet(long j);

    private static native int regionNativeGet(long j);

    private static native int typeNativeGet(long j);

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country getCountry() {
        return com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country.values()[countryNativeGet(this.getHighSpeedVideoFpsRanges)];
    }

    public final java.lang.String getCountryName() {
        return countryNameNativeGet(this.getHighSpeedVideoFpsRanges);
    }

    public final java.lang.String getIsoAlpha2CountryCode() {
        return isoAlpha2CountryCodeNativeGet(this.getHighSpeedVideoFpsRanges);
    }

    public final java.lang.String getIsoAlpha3CountryCode() {
        return isoAlpha3CountryCodeNativeGet(this.getHighSpeedVideoFpsRanges);
    }

    public final java.lang.String getIsoNumericCountryCode() {
        return isoNumericCountryCodeNativeGet(this.getHighSpeedVideoFpsRanges);
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region getRegion() {
        return com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region.values()[regionNativeGet(this.getHighSpeedVideoFpsRanges)];
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type getType() {
        return com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type.values()[typeNativeGet(this.getHighSpeedVideoFpsRanges)];
    }

    public final boolean isEmpty() {
        return emptyNativeGet(this.getHighSpeedVideoFpsRanges);
    }
}
