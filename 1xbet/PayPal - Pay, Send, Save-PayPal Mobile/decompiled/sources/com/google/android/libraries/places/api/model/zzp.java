package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzp extends com.google.android.libraries.places.api.model.ConnectorAggregation {
    private final com.google.android.libraries.places.api.model.EVConnectorType zza;
    private final java.lang.Double zzb;
    private final java.lang.Integer zzc;
    private final java.lang.Integer zzd;
    private final java.lang.Integer zze;
    private final java.time.Instant zzf;

    zzp(com.google.android.libraries.places.api.model.EVConnectorType eVConnectorType, java.lang.Double d, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.time.Instant instant) {
        if (eVConnectorType == null) {
            throw new java.lang.NullPointerException("Null type");
        }
        this.zza = eVConnectorType;
        this.zzb = d;
        this.zzc = num;
        this.zzd = num2;
        this.zze = num3;
        this.zzf = instant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.ConnectorAggregation)) {
            return false;
        }
        com.google.android.libraries.places.api.model.ConnectorAggregation connectorAggregation = (com.google.android.libraries.places.api.model.ConnectorAggregation) obj;
        if (!this.zza.equals(connectorAggregation.getType()) || !this.zzb.equals(connectorAggregation.getMaxChargeRateKw()) || !this.zzc.equals(connectorAggregation.getCount())) {
            return false;
        }
        java.lang.Integer num = this.zzd;
        if (num == null) {
            if (connectorAggregation.getAvailableCount() != null) {
                return false;
            }
        } else if (!num.equals(connectorAggregation.getAvailableCount())) {
            return false;
        }
        java.lang.Integer num2 = this.zze;
        if (num2 == null) {
            if (connectorAggregation.getOutOfServiceCount() != null) {
                return false;
            }
        } else if (!num2.equals(connectorAggregation.getOutOfServiceCount())) {
            return false;
        }
        java.time.Instant instant = this.zzf;
        if (instant == null) {
            if (connectorAggregation.getAvailabilityLastUpdateTime() != null) {
                return false;
            }
        } else if (!instant.equals(connectorAggregation.getAvailabilityLastUpdateTime())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        int hashCode2 = this.zzb.hashCode();
        int hashCode3 = this.zzc.hashCode();
        java.lang.Integer num = this.zzd;
        int hashCode4 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.zze;
        int hashCode5 = num2 == null ? 0 : num2.hashCode();
        java.time.Instant instant = this.zzf;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ (instant != null ? instant.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        java.lang.String valueOf = java.lang.String.valueOf(this.zzf);
        java.lang.Double d = this.zzb;
        int length2 = d.toString().length();
        java.lang.Integer num = this.zzc;
        int length3 = num.toString().length();
        java.lang.Integer num2 = this.zzd;
        int length4 = java.lang.String.valueOf(num2).length();
        java.lang.Integer num3 = this.zze;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 44 + length2 + 8 + length3 + 17 + length4 + 20 + java.lang.String.valueOf(num3).length() + 29 + java.lang.String.valueOf(valueOf).length() + 1);
        sb.append("ConnectorAggregation{type=");
        sb.append(obj);
        sb.append(", maxChargeRateKw=");
        sb.append(d);
        sb.append(", count=");
        sb.append(num);
        sb.append(", availableCount=");
        sb.append(num2);
        sb.append(", outOfServiceCount=");
        sb.append(num3);
        sb.append(", availabilityLastUpdateTime=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final com.google.android.libraries.places.api.model.EVConnectorType getType() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final java.lang.Integer getOutOfServiceCount() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final java.lang.Double getMaxChargeRateKw() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final java.lang.Integer getCount() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final java.lang.Integer getAvailableCount() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final java.time.Instant getAvailabilityLastUpdateTime() {
        return this.zzf;
    }
}
