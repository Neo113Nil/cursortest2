package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.utils;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "", "isLocationAccessEnabled", "(Landroid/content/Context;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LocationHelperKt {
    public static final boolean isLocationAccessEnabled(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("location");
        android.location.LocationManager locationManager = systemService instanceof android.location.LocationManager ? (android.location.LocationManager) systemService : null;
        if (locationManager != null) {
            return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
        }
        return false;
    }
}
