package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzbg extends com.google.android.libraries.places.api.model.PlaceLikelihood {
    private final com.google.android.libraries.places.api.model.Place zza;
    private final double zzb;

    zzbg(com.google.android.libraries.places.api.model.Place place, double d) {
        if (place == null) {
            throw new java.lang.NullPointerException("Null place");
        }
        this.zza = place;
        this.zzb = d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.PlaceLikelihood)) {
            return false;
        }
        com.google.android.libraries.places.api.model.PlaceLikelihood placeLikelihood = (com.google.android.libraries.places.api.model.PlaceLikelihood) obj;
        return this.zza.equals(placeLikelihood.getPlace()) && java.lang.Double.doubleToLongBits(this.zzb) == java.lang.Double.doubleToLongBits(placeLikelihood.getLikelihood());
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        double d = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (java.lang.Double.doubleToLongBits(d) ^ (java.lang.Double.doubleToLongBits(d) >>> 32)));
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        double d = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 35 + java.lang.String.valueOf(d).length() + 1);
        sb.append("PlaceLikelihood{place=");
        sb.append(obj);
        sb.append(", likelihood=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.PlaceLikelihood
    public final com.google.android.libraries.places.api.model.Place getPlace() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.PlaceLikelihood
    public final double getLikelihood() {
        return this.zzb;
    }
}
