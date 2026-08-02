package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzba extends com.google.android.libraries.places.api.model.Period.Builder {
    private com.google.android.libraries.places.api.model.TimeOfWeek zza;
    private com.google.android.libraries.places.api.model.TimeOfWeek zzb;

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    public final com.google.android.libraries.places.api.model.Period.Builder setOpen(com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek) {
        this.zza = timeOfWeek;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    public final com.google.android.libraries.places.api.model.Period.Builder setClose(com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek) {
        this.zzb = timeOfWeek;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    public final com.google.android.libraries.places.api.model.TimeOfWeek getOpen() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    public final com.google.android.libraries.places.api.model.TimeOfWeek getClose() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    public final com.google.android.libraries.places.api.model.Period build() {
        return new com.google.android.libraries.places.api.model.zzem(this.zza, this.zzb);
    }

    zzba() {
    }
}
