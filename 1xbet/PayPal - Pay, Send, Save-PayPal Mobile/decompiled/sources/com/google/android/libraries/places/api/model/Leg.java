package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class Leg implements android.os.Parcelable {
    public static com.google.android.libraries.places.api.model.Leg newInstance(java.time.Duration duration, int i) {
        return new com.google.android.libraries.places.api.model.zzdw(duration, i);
    }

    public abstract int getDistanceMeters();

    public abstract java.time.Duration getDuration();
}
