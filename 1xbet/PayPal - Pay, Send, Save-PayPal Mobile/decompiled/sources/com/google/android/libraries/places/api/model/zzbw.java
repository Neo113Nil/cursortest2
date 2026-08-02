package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzbw extends com.google.android.libraries.places.api.model.RoutingSummary {
    private final java.util.List zza;
    private final android.net.Uri zzb;

    zzbw(java.util.List list, android.net.Uri uri) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null legs");
        }
        this.zza = list;
        this.zzb = uri;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.RoutingSummary)) {
            return false;
        }
        com.google.android.libraries.places.api.model.RoutingSummary routingSummary = (com.google.android.libraries.places.api.model.RoutingSummary) obj;
        if (!this.zza.equals(routingSummary.getLegs())) {
            return false;
        }
        android.net.Uri uri = this.zzb;
        if (uri == null) {
            if (routingSummary.getDirectionsUri() != null) {
                return false;
            }
        } else if (!uri.equals(routingSummary.getDirectionsUri())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        android.net.Uri uri = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (uri == null ? 0 : uri.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 36 + java.lang.String.valueOf(valueOf).length() + 1);
        sb.append("RoutingSummary{legs=");
        sb.append(obj);
        sb.append(", directionsUri=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.RoutingSummary
    public final java.util.List<com.google.android.libraries.places.api.model.Leg> getLegs() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingSummary
    public final android.net.Uri getDirectionsUri() {
        return this.zzb;
    }
}
