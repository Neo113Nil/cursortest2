package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzal extends com.google.android.libraries.places.api.model.Leg {
    private final java.time.Duration zza;
    private final int zzb;

    zzal(java.time.Duration duration, int i) {
        if (duration == null) {
            throw new java.lang.NullPointerException("Null duration");
        }
        this.zza = duration;
        this.zzb = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.Leg)) {
            return false;
        }
        com.google.android.libraries.places.api.model.Leg leg = (com.google.android.libraries.places.api.model.Leg) obj;
        return this.zza.equals(leg.getDuration()) && this.zzb == leg.getDistanceMeters();
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        int i = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 30 + java.lang.String.valueOf(i).length() + 1);
        sb.append("Leg{duration=");
        sb.append(obj);
        sb.append(", distanceMeters=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.Leg
    public final java.time.Duration getDuration() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Leg
    public final int getDistanceMeters() {
        return this.zzb;
    }
}
