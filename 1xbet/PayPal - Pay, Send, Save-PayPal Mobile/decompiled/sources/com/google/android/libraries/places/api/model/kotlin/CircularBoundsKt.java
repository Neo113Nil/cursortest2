package com.google.android.libraries.places.api.model.kotlin;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/android/gms/maps/model/LatLng;", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER, "", "radius", "Lcom/google/android/libraries/places/api/model/CircularBounds;", "circularBounds", "(Lcom/google/android/gms/maps/model/LatLng;D)Lcom/google/android/libraries/places/api/model/CircularBounds;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CircularBoundsKt {
    public static final com.google.android.libraries.places.api.model.CircularBounds circularBounds(com.google.android.gms.maps.model.LatLng latLng, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "");
        com.google.android.libraries.places.api.model.CircularBounds newInstance = com.google.android.libraries.places.api.model.CircularBounds.newInstance(latLng, d);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "");
        return newInstance;
    }
}
