package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzv extends com.google.android.libraries.places.api.net.SearchByTextResponse {
    private final java.util.List zza;
    private final java.util.List zzb;
    private final com.google.android.libraries.places.api.net.Pagination zzc;
    private final java.lang.String zzd;
    private final int zze;
    private final android.net.Uri zzf;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.net.SearchByTextResponse)) {
            return false;
        }
        com.google.android.libraries.places.api.net.SearchByTextResponse searchByTextResponse = (com.google.android.libraries.places.api.net.SearchByTextResponse) obj;
        if (!this.zza.equals(searchByTextResponse.getPlaces())) {
            return false;
        }
        java.util.List list = this.zzb;
        if (list == null) {
            if (searchByTextResponse.getRoutingSummaries() != null) {
                return false;
            }
        } else if (!list.equals(searchByTextResponse.getRoutingSummaries())) {
            return false;
        }
        com.google.android.libraries.places.api.net.Pagination pagination = this.zzc;
        if (pagination == null) {
            if (searchByTextResponse.getPagination() != null) {
                return false;
            }
        } else if (!pagination.equals(searchByTextResponse.getPagination())) {
            return false;
        }
        java.lang.String str = this.zzd;
        if (str == null) {
            if (searchByTextResponse.zza() != null) {
                return false;
            }
        } else if (!str.equals(searchByTextResponse.zza())) {
            return false;
        }
        if (this.zze != searchByTextResponse.zzb()) {
            return false;
        }
        android.net.Uri uri = this.zzf;
        if (uri == null) {
            if (searchByTextResponse.getSearchUri() != null) {
                return false;
            }
        } else if (!uri.equals(searchByTextResponse.getSearchUri())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        java.util.List list = this.zzb;
        int hashCode2 = list == null ? 0 : list.hashCode();
        com.google.android.libraries.places.api.net.Pagination pagination = this.zzc;
        int hashCode3 = pagination == null ? 0 : pagination.hashCode();
        java.lang.String str = this.zzd;
        int hashCode4 = str == null ? 0 : str.hashCode();
        int i = this.zze;
        android.net.Uri uri = this.zzf;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i) * 1000003) ^ (uri != null ? uri.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        android.net.Uri uri = this.zzf;
        com.google.android.libraries.places.api.net.Pagination pagination = this.zzc;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.String valueOf2 = java.lang.String.valueOf(pagination);
        java.lang.String valueOf3 = java.lang.String.valueOf(uri);
        int length2 = java.lang.String.valueOf(valueOf).length();
        int length3 = java.lang.String.valueOf(valueOf2).length();
        java.lang.String str = this.zzd;
        int length4 = java.lang.String.valueOf(str).length();
        int i = this.zze;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 47 + length2 + 13 + length3 + 16 + length4 + 20 + java.lang.String.valueOf(i).length() + 12 + java.lang.String.valueOf(valueOf3).length() + 1);
        sb.append("SearchByTextResponse{places=");
        sb.append(obj);
        sb.append(", routingSummaries=");
        sb.append(valueOf);
        sb.append(", pagination=");
        sb.append(valueOf2);
        sb.append(", nextPageToken=");
        sb.append(str);
        sb.append(", responsePageIndex=");
        sb.append(i);
        sb.append(", searchUri=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse
    public final java.lang.String zza() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse
    public final android.net.Uri getSearchUri() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse, com.google.android.libraries.places.api.net.SearchResponse
    public final java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> getRoutingSummaries() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse, com.google.android.libraries.places.api.net.SearchResponse
    public final java.util.List<com.google.android.libraries.places.api.model.Place> getPlaces() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse, com.google.android.libraries.places.api.net.SearchResponse
    public final com.google.android.libraries.places.api.net.Pagination getPagination() {
        return this.zzc;
    }

    /* synthetic */ zzv(java.util.List list, java.util.List list2, com.google.android.libraries.places.api.net.Pagination pagination, java.lang.String str, int i, android.net.Uri uri, byte[] bArr) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = pagination;
        this.zzd = str;
        this.zze = i;
        this.zzf = uri;
    }
}
