package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbwb {

    @javax.annotation.Nullable
    private final com.google.android.libraries.places.internal.zzbvz zza;
    private final java.util.Map zzb;
    private final java.util.Map zzc;

    @javax.annotation.Nullable
    private final com.google.android.libraries.places.internal.zzbze zzd;

    @javax.annotation.Nullable
    private final java.lang.Object zze;

    @javax.annotation.Nullable
    private final java.util.Map zzf;

    zzbwb(@javax.annotation.Nullable com.google.android.libraries.places.internal.zzbvz zzbvzVar, java.util.Map map, java.util.Map map2, @javax.annotation.Nullable com.google.android.libraries.places.internal.zzbze zzbzeVar, @javax.annotation.Nullable java.lang.Object obj, @javax.annotation.Nullable java.util.Map map3) {
        this.zza = zzbvzVar;
        this.zzb = java.util.Collections.unmodifiableMap(new java.util.HashMap(map));
        this.zzc = java.util.Collections.unmodifiableMap(new java.util.HashMap(map2));
        this.zzd = zzbzeVar;
        this.zze = obj;
        this.zzf = map3 != null ? java.util.Collections.unmodifiableMap(new java.util.HashMap(map3)) : null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbwb zzbwbVar = (com.google.android.libraries.places.internal.zzbwb) obj;
        return com.google.common.base.Objects.equal(this.zza, zzbwbVar.zza) && com.google.common.base.Objects.equal(this.zzb, zzbwbVar.zzb) && com.google.common.base.Objects.equal(this.zzc, zzbwbVar.zzc) && com.google.common.base.Objects.equal(this.zzd, zzbwbVar.zzd) && com.google.common.base.Objects.equal(this.zze, zzbwbVar.zze);
    }

    public final int hashCode() {
        return com.google.common.base.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("defaultMethodConfig", this.zza).add("serviceMethodMap", this.zzb).add("serviceMap", this.zzc).add("retryThrottling", this.zzd).add("loadBalancingConfig", this.zze).toString();
    }

    @javax.annotation.Nullable
    final com.google.android.libraries.places.internal.zzbkq zzb() {
        if (this.zzc.isEmpty() && this.zzb.isEmpty() && this.zza == null) {
            return null;
        }
        return new com.google.android.libraries.places.internal.zzbwa(this, null);
    }

    @javax.annotation.Nullable
    final com.google.android.libraries.places.internal.zzbvz zze(com.google.android.libraries.places.internal.zzbml zzbmlVar) {
        com.google.android.libraries.places.internal.zzbvz zzbvzVar = (com.google.android.libraries.places.internal.zzbvz) this.zzb.get(zzbmlVar.zzb());
        if (zzbvzVar == null) {
            zzbvzVar = (com.google.android.libraries.places.internal.zzbvz) this.zzc.get(zzbmlVar.zzc());
        }
        return zzbvzVar == null ? this.zza : zzbvzVar;
    }

    @javax.annotation.Nullable
    final com.google.android.libraries.places.internal.zzbze zzd() {
        return this.zzd;
    }

    @javax.annotation.Nullable
    final java.lang.Object zzc() {
        return this.zze;
    }

    @javax.annotation.Nullable
    final java.util.Map zza() {
        return this.zzf;
    }
}
