package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzo extends com.google.android.libraries.places.api.net.FindCurrentPlaceResponse {
    private final java.util.List zza;

    zzo(java.util.List list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null placeLikelihoods");
        }
        this.zza = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.places.api.net.FindCurrentPlaceResponse) {
            return this.zza.equals(((com.google.android.libraries.places.api.net.FindCurrentPlaceResponse) obj).getPlaceLikelihoods());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 43);
        sb.append("FindCurrentPlaceResponse{placeLikelihoods=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceResponse
    public final java.util.List<com.google.android.libraries.places.api.model.PlaceLikelihood> getPlaceLikelihoods() {
        return this.zza;
    }
}
