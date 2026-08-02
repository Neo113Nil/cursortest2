package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzbx extends com.google.android.libraries.places.api.model.SearchAlongRouteParameters {
    private final com.google.android.libraries.places.api.model.Polyline zza;

    zzbx(com.google.android.libraries.places.api.model.Polyline polyline) {
        if (polyline == null) {
            throw new java.lang.NullPointerException("Null polyline");
        }
        this.zza = polyline;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.places.api.model.SearchAlongRouteParameters) {
            return this.zza.equals(((com.google.android.libraries.places.api.model.SearchAlongRouteParameters) obj).getPolyline());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 37);
        sb.append("SearchAlongRouteParameters{polyline=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.SearchAlongRouteParameters
    public final com.google.android.libraries.places.api.model.Polyline getPolyline() {
        return this.zza;
    }
}
