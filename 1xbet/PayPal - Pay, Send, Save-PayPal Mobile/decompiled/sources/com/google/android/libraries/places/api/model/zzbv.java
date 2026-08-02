package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzbv extends com.google.android.libraries.places.api.model.RoutingSummary.Builder {
    private java.util.List zza;
    private android.net.Uri zzb;

    @Override // com.google.android.libraries.places.api.model.RoutingSummary.Builder
    public final com.google.android.libraries.places.api.model.RoutingSummary autoBuild() {
        java.util.List list = this.zza;
        if (list != null) {
            return new com.google.android.libraries.places.api.model.zzfi(list, this.zzb);
        }
        throw new java.lang.IllegalStateException("Missing required properties: legs");
    }

    @Override // com.google.android.libraries.places.api.model.RoutingSummary.Builder
    public final java.util.List<com.google.android.libraries.places.api.model.Leg> getLegs() {
        java.util.List<com.google.android.libraries.places.api.model.Leg> list = this.zza;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("Property \"legs\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.RoutingSummary.Builder
    public final com.google.android.libraries.places.api.model.RoutingSummary.Builder setLegs(java.util.List<com.google.android.libraries.places.api.model.Leg> list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null legs");
        }
        this.zza = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingSummary.Builder
    public final com.google.android.libraries.places.api.model.RoutingSummary.Builder setDirectionsUri(android.net.Uri uri) {
        this.zzb = uri;
        return this;
    }

    zzbv() {
    }
}
