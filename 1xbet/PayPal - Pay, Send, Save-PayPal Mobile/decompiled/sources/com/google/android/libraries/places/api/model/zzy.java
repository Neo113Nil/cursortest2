package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzy extends com.google.android.libraries.places.api.model.EVSearchOptions.Builder {
    private java.lang.Double zza;
    private java.util.List zzb;

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions.Builder
    public final com.google.android.libraries.places.api.model.EVSearchOptions.Builder setMinimumChargingRateKw(java.lang.Double d) {
        this.zza = d;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions.Builder
    public final com.google.android.libraries.places.api.model.EVSearchOptions.Builder setConnectorTypes(java.util.List<com.google.android.libraries.places.api.model.EVConnectorType> list) {
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions.Builder
    public final java.lang.Double getMinimumChargingRateKw() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions.Builder
    public final java.util.List<com.google.android.libraries.places.api.model.EVConnectorType> getConnectorTypes() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions.Builder
    public final com.google.android.libraries.places.api.model.EVSearchOptions build() {
        return new com.google.android.libraries.places.api.model.zzdi(this.zza, this.zzb);
    }

    zzy() {
    }
}
