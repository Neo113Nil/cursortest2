package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzak extends com.google.android.libraries.places.api.model.GoogleMapsLinks {
    private final android.net.Uri zza;
    private final android.net.Uri zzb;
    private final android.net.Uri zzc;
    private final android.net.Uri zzd;
    private final android.net.Uri zze;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.GoogleMapsLinks)) {
            return false;
        }
        com.google.android.libraries.places.api.model.GoogleMapsLinks googleMapsLinks = (com.google.android.libraries.places.api.model.GoogleMapsLinks) obj;
        android.net.Uri uri = this.zza;
        if (uri == null) {
            if (googleMapsLinks.getDirectionsUri() != null) {
                return false;
            }
        } else if (!uri.equals(googleMapsLinks.getDirectionsUri())) {
            return false;
        }
        android.net.Uri uri2 = this.zzb;
        if (uri2 == null) {
            if (googleMapsLinks.getPlaceUri() != null) {
                return false;
            }
        } else if (!uri2.equals(googleMapsLinks.getPlaceUri())) {
            return false;
        }
        android.net.Uri uri3 = this.zzc;
        if (uri3 == null) {
            if (googleMapsLinks.getWriteAReviewUri() != null) {
                return false;
            }
        } else if (!uri3.equals(googleMapsLinks.getWriteAReviewUri())) {
            return false;
        }
        android.net.Uri uri4 = this.zzd;
        if (uri4 == null) {
            if (googleMapsLinks.getReviewsUri() != null) {
                return false;
            }
        } else if (!uri4.equals(googleMapsLinks.getReviewsUri())) {
            return false;
        }
        android.net.Uri uri5 = this.zze;
        if (uri5 == null) {
            if (googleMapsLinks.getPhotosUri() != null) {
                return false;
            }
        } else if (!uri5.equals(googleMapsLinks.getPhotosUri())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        android.net.Uri uri = this.zze;
        android.net.Uri uri2 = this.zzd;
        android.net.Uri uri3 = this.zzc;
        android.net.Uri uri4 = this.zzb;
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String valueOf2 = java.lang.String.valueOf(uri4);
        java.lang.String valueOf3 = java.lang.String.valueOf(uri3);
        java.lang.String valueOf4 = java.lang.String.valueOf(uri2);
        java.lang.String valueOf5 = java.lang.String.valueOf(uri);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 41 + java.lang.String.valueOf(valueOf2).length() + 18 + java.lang.String.valueOf(valueOf3).length() + 13 + java.lang.String.valueOf(valueOf4).length() + 12 + java.lang.String.valueOf(valueOf5).length() + 1);
        sb.append("GoogleMapsLinks{directionsUri=");
        sb.append(valueOf);
        sb.append(", placeUri=");
        sb.append(valueOf2);
        sb.append(", writeAReviewUri=");
        sb.append(valueOf3);
        sb.append(", reviewsUri=");
        sb.append(valueOf4);
        sb.append(", photosUri=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        android.net.Uri uri = this.zza;
        int hashCode = uri == null ? 0 : uri.hashCode();
        android.net.Uri uri2 = this.zzb;
        int hashCode2 = uri2 == null ? 0 : uri2.hashCode();
        android.net.Uri uri3 = this.zzc;
        int hashCode3 = uri3 == null ? 0 : uri3.hashCode();
        android.net.Uri uri4 = this.zzd;
        int hashCode4 = uri4 == null ? 0 : uri4.hashCode();
        android.net.Uri uri5 = this.zze;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (uri5 != null ? uri5.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks
    public final android.net.Uri getWriteAReviewUri() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks
    public final android.net.Uri getReviewsUri() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks
    public final android.net.Uri getPlaceUri() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks
    public final android.net.Uri getPhotosUri() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks
    public final android.net.Uri getDirectionsUri() {
        return this.zza;
    }

    zzak(android.net.Uri uri, android.net.Uri uri2, android.net.Uri uri3, android.net.Uri uri4, android.net.Uri uri5) {
        this.zza = uri;
        this.zzb = uri2;
        this.zzc = uri3;
        this.zzd = uri4;
        this.zze = uri5;
    }
}
