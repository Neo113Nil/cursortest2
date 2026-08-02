package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzq extends com.google.android.libraries.places.api.model.ConsumerAlert.Builder {
    private java.lang.String zza;
    private com.google.android.libraries.places.api.model.ConsumerAlertDetails zzb;
    private java.lang.String zzc;

    @Override // com.google.android.libraries.places.api.model.ConsumerAlert.Builder
    public final com.google.android.libraries.places.api.model.ConsumerAlert.Builder setOverview(java.lang.String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlert.Builder
    public final com.google.android.libraries.places.api.model.ConsumerAlert.Builder setLanguageCode(java.lang.String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlert.Builder
    public final com.google.android.libraries.places.api.model.ConsumerAlert.Builder setDetails(com.google.android.libraries.places.api.model.ConsumerAlertDetails consumerAlertDetails) {
        this.zzb = consumerAlertDetails;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlert.Builder
    public final com.google.android.libraries.places.api.model.ConsumerAlert build() {
        return new com.google.android.libraries.places.api.model.zzda(this.zza, this.zzb, this.zzc);
    }

    zzq() {
    }
}
