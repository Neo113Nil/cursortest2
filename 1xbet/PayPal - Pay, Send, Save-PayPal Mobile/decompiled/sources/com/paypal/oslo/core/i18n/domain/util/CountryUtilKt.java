package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\" \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\n"}, d2 = {"", "toISOCountryCode", "(Ljava/lang/String;)Ljava/lang/String;", "regionCode", "Ljava/util/Locale;", "userLocale", "getCountryNameFromRegionCode", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "", "GOOGLE_LIB_UNSUPPORTED_COUNTRIES", "Ljava/util/Map;", "getGOOGLE_LIB_UNSUPPORTED_COUNTRIES", "()Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CountryUtilKt {
    private static final java.util.Map<java.lang.String, java.lang.String> GOOGLE_LIB_UNSUPPORTED_COUNTRIES = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("AN", "599"), kotlin.TuplesKt.to("PN", "64"));
    private static final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("C2", "CN"), kotlin.TuplesKt.to("UK", "GB"));

    public static final java.lang.String toISOCountryCode(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = getHighSpeedVideoFpsRanges.get(str);
        return str2 == null ? str : str2;
    }

    public static final java.lang.String getCountryNameFromRegionCode(java.lang.String str, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.lang.String displayCountry = new java.util.Locale.Builder().setRegion(toISOCountryCode(str)).build().getDisplayCountry(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayCountry, "");
        return displayCountry;
    }

    public static final java.util.Map<java.lang.String, java.lang.String> getGOOGLE_LIB_UNSUPPORTED_COUNTRIES() {
        return GOOGLE_LIB_UNSUPPORTED_COUNTRIES;
    }
}
