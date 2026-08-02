package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzccz {
    public static final com.google.android.libraries.places.internal.zzcfj zza = com.google.android.libraries.places.internal.zzcfi.zza(okhttp3.internal.http2.Header.RESPONSE_STATUS_UTF8);
    public static final com.google.android.libraries.places.internal.zzcfj zzb = com.google.android.libraries.places.internal.zzcfi.zza(okhttp3.internal.http2.Header.TARGET_METHOD_UTF8);
    public static final com.google.android.libraries.places.internal.zzcfj zzc = com.google.android.libraries.places.internal.zzcfi.zza(okhttp3.internal.http2.Header.TARGET_PATH_UTF8);
    public static final com.google.android.libraries.places.internal.zzcfj zzd = com.google.android.libraries.places.internal.zzcfi.zza(okhttp3.internal.http2.Header.TARGET_SCHEME_UTF8);
    public static final com.google.android.libraries.places.internal.zzcfj zze = com.google.android.libraries.places.internal.zzcfi.zza(okhttp3.internal.http2.Header.TARGET_AUTHORITY_UTF8);
    public final com.google.android.libraries.places.internal.zzcfj zzf;
    public final com.google.android.libraries.places.internal.zzcfj zzg;
    final int zzh;

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzccz)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzccz zzcczVar = (com.google.android.libraries.places.internal.zzccz) obj;
        return this.zzf.equals(zzcczVar.zzf) && this.zzg.equals(zzcczVar.zzg);
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + 527) * 31) + this.zzg.hashCode();
    }

    public final java.lang.String toString() {
        return java.lang.String.format("%s: %s", this.zzf.zze(), this.zzg.zze());
    }

    static {
        com.google.android.libraries.places.internal.zzcfi.zza(":host");
        com.google.android.libraries.places.internal.zzcfi.zza(":version");
    }

    public zzccz(java.lang.String str, java.lang.String str2) {
        this(com.google.android.libraries.places.internal.zzcfi.zza(str), com.google.android.libraries.places.internal.zzcfi.zza(str2));
    }

    public zzccz(com.google.android.libraries.places.internal.zzcfj zzcfjVar, com.google.android.libraries.places.internal.zzcfj zzcfjVar2) {
        this.zzf = zzcfjVar;
        this.zzg = zzcfjVar2;
        this.zzh = zzcfjVar.zzj() + 32 + zzcfjVar2.zzj();
    }
}
