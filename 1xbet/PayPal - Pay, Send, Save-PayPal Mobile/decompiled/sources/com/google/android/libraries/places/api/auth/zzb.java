package com.google.android.libraries.places.api.auth;

/* loaded from: classes8.dex */
public abstract class zzb {
    public static final com.google.android.libraries.places.api.auth.zzb zza;

    static {
        com.google.android.libraries.places.api.auth.zzc zzcVar = new com.google.android.libraries.places.api.auth.zzc();
        zzcVar.zza(false);
        zza = zzcVar.zzd();
    }

    public abstract boolean zza();

    public abstract java.lang.String zzb();

    public abstract java.lang.String zzc();

    public static com.google.android.libraries.places.api.auth.zza zzd() {
        return new com.google.android.libraries.places.api.auth.zzc();
    }
}
