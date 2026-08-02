package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzo extends com.google.android.libraries.places.api.model.ConnectorAggregation.Builder {
    private com.google.android.libraries.places.api.model.EVConnectorType zza;
    private java.lang.Double zzb;
    private java.lang.Integer zzc;
    private java.lang.Integer zzd;
    private java.lang.Integer zze;
    private java.time.Instant zzf;

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final com.google.android.libraries.places.api.model.ConnectorAggregation build() {
        java.lang.Double d;
        java.lang.Integer num;
        com.google.android.libraries.places.api.model.EVConnectorType eVConnectorType = this.zza;
        if (eVConnectorType != null && (d = this.zzb) != null && (num = this.zzc) != null) {
            return new com.google.android.libraries.places.api.model.zzcy(eVConnectorType, d, num, this.zzd, this.zze, this.zzf);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" type");
        }
        if (this.zzb == null) {
            sb.append(" maxChargeRateKw");
        }
        if (this.zzc == null) {
            sb.append(" count");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final com.google.android.libraries.places.api.model.ConnectorAggregation.Builder setCount(java.lang.Integer num) {
        if (num == null) {
            throw new java.lang.NullPointerException("Null count");
        }
        this.zzc = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final com.google.android.libraries.places.api.model.ConnectorAggregation.Builder setMaxChargeRateKw(java.lang.Double d) {
        if (d == null) {
            throw new java.lang.NullPointerException("Null maxChargeRateKw");
        }
        this.zzb = d;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final com.google.android.libraries.places.api.model.ConnectorAggregation.Builder setType(com.google.android.libraries.places.api.model.EVConnectorType eVConnectorType) {
        if (eVConnectorType == null) {
            throw new java.lang.NullPointerException("Null type");
        }
        this.zza = eVConnectorType;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final com.google.android.libraries.places.api.model.ConnectorAggregation.Builder setOutOfServiceCount(java.lang.Integer num) {
        this.zze = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final com.google.android.libraries.places.api.model.ConnectorAggregation.Builder setAvailableCount(java.lang.Integer num) {
        this.zzd = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final com.google.android.libraries.places.api.model.ConnectorAggregation.Builder setAvailabilityLastUpdateTime(java.time.Instant instant) {
        this.zzf = instant;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final java.lang.Integer getOutOfServiceCount() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final java.lang.Integer getAvailableCount() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final java.time.Instant getAvailabilityLastUpdateTime() {
        return this.zzf;
    }

    zzo() {
    }
}
