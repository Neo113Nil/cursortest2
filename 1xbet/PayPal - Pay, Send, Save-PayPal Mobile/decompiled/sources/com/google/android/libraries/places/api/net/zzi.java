package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzi extends com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse {
    private final android.net.Uri zza;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse)) {
            return false;
        }
        com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse fetchResolvedPhotoUriResponse = (com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse) obj;
        android.net.Uri uri = this.zza;
        return uri == null ? fetchResolvedPhotoUriResponse.getUri() == null : uri.equals(fetchResolvedPhotoUriResponse.getUri());
    }

    public final int hashCode() {
        android.net.Uri uri = this.zza;
        return (uri == null ? 0 : uri.hashCode()) ^ 1000003;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 35);
        sb.append("FetchResolvedPhotoUriResponse{uri=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse
    public final android.net.Uri getUri() {
        return this.zza;
    }

    zzi(android.net.Uri uri) {
        this.zza = uri;
    }
}
