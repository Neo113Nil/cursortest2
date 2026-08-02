package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzl extends com.google.android.libraries.places.api.model.zzfs {
    private final int zza;
    private final int zzb;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.zzfs)) {
            return false;
        }
        com.google.android.libraries.places.api.model.zzfs zzfsVar = (com.google.android.libraries.places.api.model.zzfs) obj;
        return this.zza == zzfsVar.zza() && this.zzb == zzfsVar.zzb();
    }

    public final java.lang.String toString() {
        int i = this.zza;
        int length = java.lang.String.valueOf(i).length();
        int i2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 31 + java.lang.String.valueOf(i2).length() + 1);
        sb.append("SubstringMatch{offset=");
        sb.append(i);
        sb.append(", length=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.zzfs
    final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.zzfs
    final int zza() {
        return this.zza;
    }

    public final int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    zzl(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }
}
