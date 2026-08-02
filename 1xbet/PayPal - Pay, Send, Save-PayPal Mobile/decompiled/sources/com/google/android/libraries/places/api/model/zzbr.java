package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzbr extends com.google.android.libraries.places.api.model.RouteModifiers.Builder {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private byte zze;

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final com.google.android.libraries.places.api.model.RouteModifiers build() {
        if (this.zze == 15) {
            return new com.google.android.libraries.places.api.model.zzfe(this.zza, this.zzb, this.zzc, this.zzd);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.zze & 1) == 0) {
            sb.append(" tollAvoided");
        }
        if ((this.zze & 2) == 0) {
            sb.append(" highwayAvoided");
        }
        if ((this.zze & 4) == 0) {
            sb.append(" ferryAvoided");
        }
        if ((this.zze & 8) == 0) {
            sb.append(" indoorAvoided");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final boolean isFerryAvoided() {
        if ((this.zze & 4) != 0) {
            return this.zzc;
        }
        throw new java.lang.IllegalStateException("Property \"ferryAvoided\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final boolean isHighwayAvoided() {
        if ((this.zze & 2) != 0) {
            return this.zzb;
        }
        throw new java.lang.IllegalStateException("Property \"highwayAvoided\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final boolean isIndoorAvoided() {
        if ((this.zze & 8) != 0) {
            return this.zzd;
        }
        throw new java.lang.IllegalStateException("Property \"indoorAvoided\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final boolean isTollAvoided() {
        if ((this.zze & 1) != 0) {
            return this.zza;
        }
        throw new java.lang.IllegalStateException("Property \"tollAvoided\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final com.google.android.libraries.places.api.model.RouteModifiers.Builder setTollAvoided(boolean z) {
        this.zza = z;
        this.zze = (byte) (this.zze | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final com.google.android.libraries.places.api.model.RouteModifiers.Builder setIndoorAvoided(boolean z) {
        this.zzd = z;
        this.zze = (byte) (this.zze | 8);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final com.google.android.libraries.places.api.model.RouteModifiers.Builder setHighwayAvoided(boolean z) {
        this.zzb = z;
        this.zze = (byte) (this.zze | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final com.google.android.libraries.places.api.model.RouteModifiers.Builder setFerryAvoided(boolean z) {
        this.zzc = z;
        this.zze = (byte) (this.zze | 4);
        return this;
    }

    zzbr() {
    }
}
