package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzz extends com.google.android.libraries.places.api.net.SearchNearbyResponse {
    private final java.util.List zza;
    private final java.util.List zzb;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.net.SearchNearbyResponse)) {
            return false;
        }
        com.google.android.libraries.places.api.net.SearchNearbyResponse searchNearbyResponse = (com.google.android.libraries.places.api.net.SearchNearbyResponse) obj;
        if (!this.zza.equals(searchNearbyResponse.getPlaces())) {
            return false;
        }
        java.util.List list = this.zzb;
        if (list == null) {
            if (searchNearbyResponse.getRoutingSummaries() != null) {
                return false;
            }
        } else if (!list.equals(searchNearbyResponse.getRoutingSummaries())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        java.util.List list = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (list == null ? 0 : list.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 47 + java.lang.String.valueOf(valueOf).length() + 1);
        sb.append("SearchNearbyResponse{places=");
        sb.append(obj);
        sb.append(", routingSummaries=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyResponse
    public final java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> getRoutingSummaries() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyResponse
    public final java.util.List<com.google.android.libraries.places.api.model.Place> getPlaces() {
        return this.zza;
    }

    /* synthetic */ zzz(java.util.List list, java.util.List list2, byte[] bArr) {
        this.zza = list;
        this.zzb = list2;
    }
}
