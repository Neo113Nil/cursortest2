package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzz extends com.google.android.libraries.places.api.model.EVSearchOptions {
    private final java.lang.Double zza;
    private final java.util.List zzb;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.EVSearchOptions)) {
            return false;
        }
        com.google.android.libraries.places.api.model.EVSearchOptions eVSearchOptions = (com.google.android.libraries.places.api.model.EVSearchOptions) obj;
        java.lang.Double d = this.zza;
        if (d == null) {
            if (eVSearchOptions.getMinimumChargingRateKw() != null) {
                return false;
            }
        } else if (!d.equals(eVSearchOptions.getMinimumChargingRateKw())) {
            return false;
        }
        java.util.List list = this.zzb;
        if (list == null) {
            if (eVSearchOptions.getConnectorTypes() != null) {
                return false;
            }
        } else if (!list.equals(eVSearchOptions.getConnectorTypes())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.Double d = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(d).length() + 55 + java.lang.String.valueOf(valueOf).length() + 1);
        sb.append("EVSearchOptions{minimumChargingRateKw=");
        sb.append(d);
        sb.append(", connectorTypes=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Double d = this.zza;
        int hashCode = d == null ? 0 : d.hashCode();
        java.util.List list = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (list != null ? list.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions
    public final java.lang.Double getMinimumChargingRateKw() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions
    public final java.util.List<com.google.android.libraries.places.api.model.EVConnectorType> getConnectorTypes() {
        return this.zzb;
    }

    zzz(java.lang.Double d, java.util.List list) {
        this.zza = d;
        this.zzb = list;
    }
}
