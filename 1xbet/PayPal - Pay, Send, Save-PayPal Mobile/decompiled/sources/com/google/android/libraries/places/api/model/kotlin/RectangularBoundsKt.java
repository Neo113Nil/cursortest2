package com.google.android.libraries.places.api.model.kotlin;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\b"}, d2 = {"Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", "Lcom/google/android/libraries/places/api/model/RectangularBounds;", "rectangularBounds", "(Lcom/google/android/gms/maps/model/LatLngBounds;)Lcom/google/android/libraries/places/api/model/RectangularBounds;", "Lcom/google/android/gms/maps/model/LatLng;", "southwest", "northeast", "(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/libraries/places/api/model/RectangularBounds;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RectangularBoundsKt {
    public static final com.google.android.libraries.places.api.model.RectangularBounds rectangularBounds(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng2, "");
        com.google.android.libraries.places.api.model.RectangularBounds newInstance = com.google.android.libraries.places.api.model.RectangularBounds.newInstance(latLng, latLng2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "");
        return newInstance;
    }

    public static final com.google.android.libraries.places.api.model.RectangularBounds rectangularBounds(com.google.android.gms.maps.model.LatLngBounds latLngBounds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLngBounds, "");
        com.google.android.libraries.places.api.model.RectangularBounds newInstance = com.google.android.libraries.places.api.model.RectangularBounds.newInstance(latLngBounds);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "");
        return newInstance;
    }
}
