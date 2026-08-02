package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzbj extends com.google.android.libraries.places.api.model.zzge {
    private com.google.android.libraries.places.api.model.Money zza;
    private com.google.android.libraries.places.api.model.Money zzb;

    @Override // com.google.android.libraries.places.api.model.zzge
    public final com.google.android.libraries.places.api.model.zzgf zzc() {
        return new com.google.android.libraries.places.api.model.zzew(this.zza, this.zzb);
    }

    @Override // com.google.android.libraries.places.api.model.zzge
    public final com.google.android.libraries.places.api.model.zzge zzb(com.google.android.libraries.places.api.model.Money money) {
        this.zzb = money;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzge
    public final com.google.android.libraries.places.api.model.zzge zza(com.google.android.libraries.places.api.model.Money money) {
        this.zza = money;
        return this;
    }

    zzbj() {
    }
}
