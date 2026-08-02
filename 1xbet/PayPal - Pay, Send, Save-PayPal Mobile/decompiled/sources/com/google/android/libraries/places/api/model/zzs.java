package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzs extends com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder {
    private java.lang.String zza;
    private java.lang.String zzb;
    private java.lang.String zzc;
    private android.net.Uri zzd;

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder
    public final com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder setTitle(java.lang.String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder
    public final com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder setDescription(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder
    public final com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder setAboutLinkUri(android.net.Uri uri) {
        this.zzd = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder
    public final com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder setAboutLinkTitle(java.lang.String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder
    public final com.google.android.libraries.places.api.model.ConsumerAlertDetails build() {
        return new com.google.android.libraries.places.api.model.zzdc(this.zza, this.zzb, this.zzc, this.zzd);
    }

    zzs() {
    }
}
