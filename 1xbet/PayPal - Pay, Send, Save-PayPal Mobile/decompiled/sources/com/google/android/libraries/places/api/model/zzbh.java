package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzbh extends com.google.android.libraries.places.api.model.PlusCode.Builder {
    private java.lang.String zza;
    private java.lang.String zzb;

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final com.google.android.libraries.places.api.model.PlusCode.Builder setGlobalCode(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final com.google.android.libraries.places.api.model.PlusCode.Builder setCompoundCode(java.lang.String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final java.lang.String getGlobalCode() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final java.lang.String getCompoundCode() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final com.google.android.libraries.places.api.model.PlusCode build() {
        return new com.google.android.libraries.places.api.model.zzeu(this.zza, this.zzb);
    }

    zzbh() {
    }
}
