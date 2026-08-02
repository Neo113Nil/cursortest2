package com.google.android.libraries.places.api.model.kotlin;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/google/android/libraries/places/api/model/FuelPrice$FuelType;", "type", "Lcom/google/android/libraries/places/api/model/Money;", "price", "Ljava/time/Instant;", "updateTime", "Lcom/google/android/libraries/places/api/model/FuelPrice;", "fuelPrice", "(Lcom/google/android/libraries/places/api/model/FuelPrice$FuelType;Lcom/google/android/libraries/places/api/model/Money;Ljava/time/Instant;)Lcom/google/android/libraries/places/api/model/FuelPrice;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FuelPriceKt {
    public static final com.google.android.libraries.places.api.model.FuelPrice fuelPrice(com.google.android.libraries.places.api.model.FuelPrice.FuelType fuelType, com.google.android.libraries.places.api.model.Money money, java.time.Instant instant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fuelType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        com.google.android.libraries.places.api.model.FuelPrice newInstance = com.google.android.libraries.places.api.model.FuelPrice.newInstance(fuelType, money, instant);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "");
        return newInstance;
    }
}
