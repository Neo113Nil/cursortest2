package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbpp {
    private java.lang.String zza = "unknown-authority";
    private com.google.android.libraries.places.internal.zzbio zzb = com.google.android.libraries.places.internal.zzbio.zza;

    @javax.annotation.Nullable
    private java.lang.String zzc;

    @javax.annotation.Nullable
    private com.google.android.libraries.places.internal.zzbki zzd;

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbpp)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbpp zzbppVar = (com.google.android.libraries.places.internal.zzbpp) obj;
        return this.zza.equals(zzbppVar.zza) && this.zzb.equals(zzbppVar.zzb) && com.google.common.base.Objects.equal(this.zzc, zzbppVar.zzc) && com.google.common.base.Objects.equal(this.zzd, zzbppVar.zzd);
    }

    public final int hashCode() {
        return com.google.common.base.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final com.google.android.libraries.places.internal.zzbpp zzb(java.lang.String str) {
        this.zza = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str, "authority");
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbpp zzd(com.google.android.libraries.places.internal.zzbio zzbioVar) {
        com.google.common.base.Preconditions.checkNotNull(zzbioVar, "eagAttributes");
        this.zzb = zzbioVar;
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbpp zzh(@javax.annotation.Nullable com.google.android.libraries.places.internal.zzbki zzbkiVar) {
        this.zzd = zzbkiVar;
        return this;
    }

    @javax.annotation.Nullable
    public final com.google.android.libraries.places.internal.zzbki zzg() {
        return this.zzd;
    }

    public final com.google.android.libraries.places.internal.zzbpp zzf(@javax.annotation.Nullable java.lang.String str) {
        this.zzc = str;
        return this;
    }

    @javax.annotation.Nullable
    public final java.lang.String zze() {
        return this.zzc;
    }

    public final com.google.android.libraries.places.internal.zzbio zzc() {
        return this.zzb;
    }

    public final java.lang.String zza() {
        return this.zza;
    }
}
