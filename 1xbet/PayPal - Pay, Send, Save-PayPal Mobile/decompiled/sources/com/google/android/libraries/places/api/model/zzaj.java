package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzaj extends com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder {
    private android.net.Uri zza;
    private android.net.Uri zzb;
    private android.net.Uri zzc;
    private android.net.Uri zzd;
    private android.net.Uri zze;

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder
    public final com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder setWriteAReviewUri(android.net.Uri uri) {
        this.zzc = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder
    public final com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder setReviewsUri(android.net.Uri uri) {
        this.zzd = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder
    public final com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder setPlaceUri(android.net.Uri uri) {
        this.zzb = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder
    public final com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder setPhotosUri(android.net.Uri uri) {
        this.zze = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder
    public final com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder setDirectionsUri(android.net.Uri uri) {
        this.zza = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder
    public final com.google.android.libraries.places.api.model.GoogleMapsLinks build() {
        return new com.google.android.libraries.places.api.model.zzdu(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    zzaj() {
    }
}
