package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class RoutingSummary implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.RoutingSummary autoBuild();

        public com.google.android.libraries.places.api.model.RoutingSummary build() {
            setLegs(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) getLegs()));
            return autoBuild();
        }

        public abstract java.util.List<com.google.android.libraries.places.api.model.Leg> getLegs();

        public abstract com.google.android.libraries.places.api.model.RoutingSummary.Builder setDirectionsUri(android.net.Uri uri);

        public abstract com.google.android.libraries.places.api.model.RoutingSummary.Builder setLegs(java.util.List<com.google.android.libraries.places.api.model.Leg> list);
    }

    public static com.google.android.libraries.places.api.model.RoutingSummary.Builder builder(java.util.List<com.google.android.libraries.places.api.model.Leg> list) {
        com.google.android.libraries.places.api.model.zzbv zzbvVar = new com.google.android.libraries.places.api.model.zzbv();
        zzbvVar.setLegs(list);
        return zzbvVar;
    }

    public static com.google.android.libraries.places.api.model.RoutingSummary newInstance(java.util.List<com.google.android.libraries.places.api.model.Leg> list) {
        return builder(list).build();
    }

    public abstract android.net.Uri getDirectionsUri();

    public abstract java.util.List<com.google.android.libraries.places.api.model.Leg> getLegs();
}
