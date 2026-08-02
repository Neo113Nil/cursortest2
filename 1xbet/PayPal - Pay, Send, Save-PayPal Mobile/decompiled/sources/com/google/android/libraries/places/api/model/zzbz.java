package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzbz extends com.google.android.libraries.places.api.model.SpecialDay {
    private final com.google.android.libraries.places.api.model.LocalDate zza;
    private final boolean zzb;

    zzbz(com.google.android.libraries.places.api.model.LocalDate localDate, boolean z) {
        if (localDate == null) {
            throw new java.lang.NullPointerException("Null date");
        }
        this.zza = localDate;
        this.zzb = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.SpecialDay)) {
            return false;
        }
        com.google.android.libraries.places.api.model.SpecialDay specialDay = (com.google.android.libraries.places.api.model.SpecialDay) obj;
        return this.zza.equals(specialDay.getDate()) && this.zzb == specialDay.isExceptional();
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        boolean z = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 30 + java.lang.String.valueOf(z).length() + 1);
        sb.append("SpecialDay{date=");
        sb.append(obj);
        sb.append(", exceptional=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay
    public final boolean isExceptional() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay
    public final com.google.android.libraries.places.api.model.LocalDate getDate() {
        return this.zza;
    }
}
