package com.google.android.libraries.places.api.net;

/* loaded from: classes.dex */
public abstract class FetchPlaceResponse {
    public static com.google.android.libraries.places.api.net.FetchPlaceResponse newInstance(com.google.android.libraries.places.api.model.Place place) {
        return new com.google.android.libraries.places.api.net.zzf(place);
    }

    public abstract com.google.android.libraries.places.api.model.Place getPlace();
}
