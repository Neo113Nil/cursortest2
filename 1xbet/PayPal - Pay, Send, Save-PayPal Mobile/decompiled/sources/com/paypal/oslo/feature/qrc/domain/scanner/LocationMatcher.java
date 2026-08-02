package com.paypal.oslo.feature.qrc.domain.scanner;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/scanner/LocationMatcher;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "userCountry", "", "latitude", "longitude", "", "matchCountryWithLocation", "(Ljava/lang/String;DD)Z", "getCountryCodeByLocation", "(Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LocationMatcher {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public LocationMatcher(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRanges = context;
    }

    public final boolean matchCountryWithLocation(java.lang.String userCountry, double latitude, double longitude) {
        android.location.Address address;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userCountry, "");
        try {
            java.util.List<android.location.Address> fromLocation = new android.location.Geocoder(this.getHighSpeedVideoFpsRanges, java.util.Locale.getDefault()).getFromLocation(latitude, longitude, 1);
            java.lang.String countryCode = (fromLocation == null || (address = (android.location.Address) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) fromLocation)) == null) ? null : address.getCountryCode();
            if (countryCode != null) {
                if (kotlin.text.StringsKt.equals(countryCode, userCountry, false)) {
                    return true;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return false;
    }

    public final java.lang.String getCountryCodeByLocation(java.lang.Double latitude, java.lang.Double longitude) {
        android.location.Address address;
        if (latitude == null || longitude == null) {
            return null;
        }
        try {
            java.util.List<android.location.Address> fromLocation = new android.location.Geocoder(this.getHighSpeedVideoFpsRanges, java.util.Locale.getDefault()).getFromLocation(latitude.doubleValue(), longitude.doubleValue(), 1);
            if (fromLocation == null || (address = (android.location.Address) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) fromLocation)) == null) {
                return null;
            }
            return address.getCountryCode();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
