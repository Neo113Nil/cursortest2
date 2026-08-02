package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzbs extends com.google.android.libraries.places.api.model.RouteModifiers {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.RouteModifiers)) {
            return false;
        }
        com.google.android.libraries.places.api.model.RouteModifiers routeModifiers = (com.google.android.libraries.places.api.model.RouteModifiers) obj;
        return this.zza == routeModifiers.isTollAvoided() && this.zzb == routeModifiers.isHighwayAvoided() && this.zzc == routeModifiers.isFerryAvoided() && this.zzd == routeModifiers.isIndoorAvoided();
    }

    public final java.lang.String toString() {
        boolean z = this.zza;
        int length = java.lang.String.valueOf(z).length();
        boolean z2 = this.zzb;
        int length2 = java.lang.String.valueOf(z2).length();
        boolean z3 = this.zzc;
        int length3 = java.lang.String.valueOf(z3).length();
        boolean z4 = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 44 + length2 + 15 + length3 + 16 + java.lang.String.valueOf(z4).length() + 1);
        sb.append("RouteModifiers{tollAvoided=");
        sb.append(z);
        sb.append(", highwayAvoided=");
        sb.append(z2);
        sb.append(", ferryAvoided=");
        sb.append(z3);
        sb.append(", indoorAvoided=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers
    public final boolean isTollAvoided() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers
    public final boolean isIndoorAvoided() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers
    public final boolean isHighwayAvoided() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers
    public final boolean isFerryAvoided() {
        return this.zzc;
    }

    public final int hashCode() {
        int i = true != this.zza ? 1237 : 1231;
        int i2 = true != this.zzb ? 1237 : 1231;
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ (true != this.zzd ? 1237 : 1231);
    }

    zzbs(boolean z, boolean z2, boolean z3, boolean z4) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
    }
}
