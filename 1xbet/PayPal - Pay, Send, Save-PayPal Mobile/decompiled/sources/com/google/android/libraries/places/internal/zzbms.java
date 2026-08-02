package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbms {
    private final com.google.android.libraries.places.internal.zzbnp zza;
    private final java.lang.Object zzb;

    private zzbms(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        this.zzb = null;
        this.zza = (com.google.android.libraries.places.internal.zzbnp) com.google.common.base.Preconditions.checkNotNull(zzbnpVar, "status");
        com.google.common.base.Preconditions.checkArgument(!zzbnpVar.zzj(), "cannot use OK status: %s", zzbnpVar);
    }

    public static com.google.android.libraries.places.internal.zzbms zza(java.lang.Object obj) {
        return new com.google.android.libraries.places.internal.zzbms(obj);
    }

    public static com.google.android.libraries.places.internal.zzbms zzb(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        return new com.google.android.libraries.places.internal.zzbms(zzbnpVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbms zzbmsVar = (com.google.android.libraries.places.internal.zzbms) obj;
        return com.google.common.base.Objects.equal(this.zza, zzbmsVar.zza) && com.google.common.base.Objects.equal(this.zzb, zzbmsVar.zzb);
    }

    public final int hashCode() {
        return com.google.common.base.Objects.hashCode(this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.zzb;
        return obj != null ? com.google.common.base.MoreObjects.toStringHelper(this).add("config", obj).toString() : com.google.common.base.MoreObjects.toStringHelper(this).add("error", this.zza).toString();
    }

    private zzbms(java.lang.Object obj) {
        this.zzb = com.google.common.base.Preconditions.checkNotNull(obj, "config");
        this.zza = null;
    }

    @javax.annotation.Nullable
    public final com.google.android.libraries.places.internal.zzbnp zzd() {
        return this.zza;
    }

    @javax.annotation.Nullable
    public final java.lang.Object zzc() {
        return this.zzb;
    }
}
