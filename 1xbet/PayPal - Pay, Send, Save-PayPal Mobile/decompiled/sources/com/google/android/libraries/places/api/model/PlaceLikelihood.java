package com.google.android.libraries.places.api.model;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public abstract class PlaceLikelihood implements android.os.Parcelable {
    public static final double LIKELIHOOD_MAX_VALUE = 1.0d;
    public static final double LIKELIHOOD_MIN_VALUE = 0.0d;

    public static com.google.android.libraries.places.api.model.PlaceLikelihood newInstance(com.google.android.libraries.places.api.model.Place place, double d) {
        java.lang.Double valueOf = java.lang.Double.valueOf(0.0d);
        java.lang.Double valueOf2 = java.lang.Double.valueOf(1.0d);
        com.google.common.collect.Range closed = com.google.common.collect.Range.closed(valueOf, valueOf2);
        java.lang.Double valueOf3 = java.lang.Double.valueOf(d);
        com.google.common.base.Preconditions.checkArgument(closed.contains(valueOf3), "Likelihood must not be out-of-range: %s to %s, but was: %s.", valueOf, valueOf2, valueOf3);
        return new com.google.android.libraries.places.api.model.zzes(place, d);
    }

    public abstract double getLikelihood();

    public abstract com.google.android.libraries.places.api.model.Place getPlace();
}
