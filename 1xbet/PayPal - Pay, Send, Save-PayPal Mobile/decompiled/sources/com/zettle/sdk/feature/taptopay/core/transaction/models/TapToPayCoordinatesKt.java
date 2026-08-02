package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TapToPayCoordinatesKt {
    public static final /* synthetic */ java.lang.Double access$readOptDouble(android.os.Parcel parcel) {
        java.lang.Double valueOf = java.lang.Double.valueOf(parcel.readDouble());
        if (valueOf.doubleValue() == Double.MIN_VALUE) {
            return null;
        }
        return valueOf;
    }
}
