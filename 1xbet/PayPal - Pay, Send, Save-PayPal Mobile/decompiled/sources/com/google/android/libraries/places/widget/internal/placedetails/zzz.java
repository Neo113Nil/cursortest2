package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzz {
    public static final boolean zza(com.google.android.libraries.places.api.model.FuelPrice.FuelType fuelType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fuelType, "");
        return fuelType == com.google.android.libraries.places.api.model.FuelPrice.FuelType.REGULAR_UNLEADED || fuelType == com.google.android.libraries.places.api.model.FuelPrice.FuelType.MIDGRADE || fuelType == com.google.android.libraries.places.api.model.FuelPrice.FuelType.PREMIUM || fuelType == com.google.android.libraries.places.api.model.FuelPrice.FuelType.DIESEL;
    }

    public static final boolean zzb(com.google.android.libraries.places.api.model.FuelPrice fuelPrice, java.time.Instant instant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fuelPrice, "");
        if (instant == null) {
            return false;
        }
        java.time.Instant minus = instant.minus(24L, (java.time.temporal.TemporalUnit) java.time.temporal.ChronoUnit.HOURS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(minus, "");
        return fuelPrice.getUpdateTime().isBefore(minus);
    }
}
