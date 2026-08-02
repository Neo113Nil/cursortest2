package com.google.android.libraries.places.api.model.kotlin;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/google/android/libraries/places/api/model/FuelPrice;", "fuelPrices", "Lcom/google/android/libraries/places/api/model/FuelOptions;", "fuelOptions", "(Ljava/util/List;)Lcom/google/android/libraries/places/api/model/FuelOptions;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FuelOptionsKt {
    public static final com.google.android.libraries.places.api.model.FuelOptions fuelOptions(java.util.List<? extends com.google.android.libraries.places.api.model.FuelPrice> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        com.google.android.libraries.places.api.model.FuelOptions newInstance = com.google.android.libraries.places.api.model.FuelOptions.newInstance(list);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "");
        return newInstance;
    }
}
