package com.google.android.libraries.places.api.net;

@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class FindCurrentPlaceResponse {
    public static com.google.android.libraries.places.api.net.FindCurrentPlaceResponse newInstance(java.util.List<com.google.android.libraries.places.api.model.PlaceLikelihood> list) {
        return new com.google.android.libraries.places.api.net.zzo(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list));
    }

    public abstract java.util.List<com.google.android.libraries.places.api.model.PlaceLikelihood> getPlaceLikelihoods();
}
