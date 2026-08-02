package com.google.android.libraries.places.api.net;

/* loaded from: classes.dex */
public abstract class FindAutocompletePredictionsResponse {
    public static com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse newInstance(java.util.List<com.google.android.libraries.places.api.model.AutocompletePrediction> list) {
        return new com.google.android.libraries.places.api.net.zzl(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list));
    }

    public abstract java.util.List<com.google.android.libraries.places.api.model.AutocompletePrediction> getAutocompletePredictions();
}
