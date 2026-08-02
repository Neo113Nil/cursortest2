package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public final class zzcz {
    final android.net.Uri zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final boolean zzd;
    final boolean zze;

    public zzcz(android.net.Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final com.google.android.gms.internal.auth.zzcz zzb() {
        if (this.zzb.isEmpty()) {
            return new com.google.android.gms.internal.auth.zzcz(null, this.zza, this.zzb, this.zzc, true, false, this.zze, false, null);
        }
        throw new java.lang.IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final com.google.android.gms.internal.auth.zzdc zzc(java.lang.String str, double d) {
        return new com.google.android.gms.internal.auth.zzcx(this, str, java.lang.Double.valueOf(0.0d), true);
    }

    public final com.google.android.gms.internal.auth.zzdc zzd(java.lang.String str, long j) {
        return new com.google.android.gms.internal.auth.zzcv(this, str, java.lang.Long.valueOf(j), true);
    }

    public final com.google.android.gms.internal.auth.zzdc zze(java.lang.String str, boolean z) {
        return new com.google.android.gms.internal.auth.zzcw(this, str, java.lang.Boolean.valueOf(z), true);
    }

    public final com.google.android.gms.internal.auth.zzdc zzf(java.lang.String str, java.lang.Object obj, com.google.android.gms.internal.auth.zzhy zzhyVar) {
        return new com.google.android.gms.internal.auth.zzcy(this, "getTokenRefactor__blocked_packages", obj, true, zzhyVar);
    }

    public final com.google.android.gms.internal.auth.zzcz zza() {
        return new com.google.android.gms.internal.auth.zzcz(null, this.zza, this.zzb, this.zzc, this.zzd, false, true, false, null);
    }

    private zzcz(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, boolean z4, @javax.annotation.Nullable com.google.android.gms.internal.auth.zzdg zzdgVar) {
        this.zza = uri;
        this.zzb = "";
        this.zzc = "";
        this.zzd = z;
        this.zze = z3;
    }
}
