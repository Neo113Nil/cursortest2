package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzw extends com.google.android.libraries.places.api.model.EVChargeOptions.Builder {
    private java.lang.Integer zza;
    private java.util.List zzb;

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions.Builder
    public final com.google.android.libraries.places.api.model.EVChargeOptions build() {
        java.util.List list;
        java.lang.Integer num = this.zza;
        if (num != null && (list = this.zzb) != null) {
            return new com.google.android.libraries.places.api.model.zzdg(num, list);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" connectorCount");
        }
        if (this.zzb == null) {
            sb.append(" connectorAggregations");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions.Builder
    public final com.google.android.libraries.places.api.model.EVChargeOptions.Builder setConnectorAggregations(java.util.List<com.google.android.libraries.places.api.model.ConnectorAggregation> list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null connectorAggregations");
        }
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions.Builder
    public final com.google.android.libraries.places.api.model.EVChargeOptions.Builder setConnectorCount(java.lang.Integer num) {
        if (num == null) {
            throw new java.lang.NullPointerException("Null connectorCount");
        }
        this.zza = num;
        return this;
    }

    zzw() {
    }
}
