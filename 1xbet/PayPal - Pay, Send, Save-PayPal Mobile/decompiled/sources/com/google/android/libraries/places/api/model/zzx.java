package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzx extends com.google.android.libraries.places.api.model.EVChargeOptions {
    private final java.lang.Integer zza;
    private final java.util.List zzb;

    zzx(java.lang.Integer num, java.util.List list) {
        this.zza = num;
        if (list == null) {
            throw new java.lang.NullPointerException("Null connectorAggregations");
        }
        this.zzb = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.EVChargeOptions)) {
            return false;
        }
        com.google.android.libraries.places.api.model.EVChargeOptions eVChargeOptions = (com.google.android.libraries.places.api.model.EVChargeOptions) obj;
        return this.zza.equals(eVChargeOptions.getConnectorCount()) && this.zzb.equals(eVChargeOptions.getConnectorAggregations());
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zzb.toString();
        java.lang.Integer num = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(num.toString().length() + 55 + obj.length() + 1);
        sb.append("EVChargeOptions{connectorCount=");
        sb.append(num);
        sb.append(", connectorAggregations=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions
    public final java.lang.Integer getConnectorCount() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions
    public final java.util.List<com.google.android.libraries.places.api.model.ConnectorAggregation> getConnectorAggregations() {
        return this.zzb;
    }
}
