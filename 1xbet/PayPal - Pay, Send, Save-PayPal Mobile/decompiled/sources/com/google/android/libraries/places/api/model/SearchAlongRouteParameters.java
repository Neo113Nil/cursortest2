package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class SearchAlongRouteParameters implements android.os.Parcelable {
    public static com.google.android.libraries.places.api.model.SearchAlongRouteParameters newInstance(com.google.android.libraries.places.api.model.Polyline polyline) {
        return new com.google.android.libraries.places.api.model.zzfk(polyline);
    }

    public abstract com.google.android.libraries.places.api.model.Polyline getPolyline();
}
