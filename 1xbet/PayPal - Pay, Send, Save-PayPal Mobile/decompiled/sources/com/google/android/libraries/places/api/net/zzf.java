package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzf extends com.google.android.libraries.places.api.net.FetchPlaceResponse {
    private final com.google.android.libraries.places.api.model.Place zza;

    zzf(com.google.android.libraries.places.api.model.Place place) {
        if (place == null) {
            throw new java.lang.NullPointerException("Null place");
        }
        this.zza = place;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.places.api.net.FetchPlaceResponse) {
            return this.zza.equals(((com.google.android.libraries.places.api.net.FetchPlaceResponse) obj).getPlace());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 26);
        sb.append("FetchPlaceResponse{place=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceResponse
    public final com.google.android.libraries.places.api.model.Place getPlace() {
        return this.zza;
    }
}
