package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzby extends com.google.android.libraries.places.api.model.SpecialDay.Builder {
    private com.google.android.libraries.places.api.model.LocalDate zza;
    private boolean zzb;
    private byte zzc;

    @Override // com.google.android.libraries.places.api.model.SpecialDay.Builder
    public final com.google.android.libraries.places.api.model.SpecialDay build() {
        com.google.android.libraries.places.api.model.LocalDate localDate;
        if (this.zzc == 1 && (localDate = this.zza) != null) {
            return new com.google.android.libraries.places.api.model.zzfm(localDate, this.zzb);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" date");
        }
        if (this.zzc == 0) {
            sb.append(" exceptional");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay.Builder
    public final com.google.android.libraries.places.api.model.LocalDate getDate() {
        com.google.android.libraries.places.api.model.LocalDate localDate = this.zza;
        if (localDate != null) {
            return localDate;
        }
        throw new java.lang.IllegalStateException("Property \"date\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay.Builder
    public final boolean isExceptional() {
        if (this.zzc != 0) {
            return this.zzb;
        }
        throw new java.lang.IllegalStateException("Property \"exceptional\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay.Builder
    public final com.google.android.libraries.places.api.model.SpecialDay.Builder setDate(com.google.android.libraries.places.api.model.LocalDate localDate) {
        if (localDate == null) {
            throw new java.lang.NullPointerException("Null date");
        }
        this.zza = localDate;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay.Builder
    public final com.google.android.libraries.places.api.model.SpecialDay.Builder setExceptional(boolean z) {
        this.zzb = z;
        this.zzc = (byte) 1;
        return this;
    }

    zzby() {
    }
}
