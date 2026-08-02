package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public final class zzby {
    private boolean zza;
    private zzbr zzb;
    private final zzch zzc;
    private zzbx zzd;
    private zzbv zze;

    private zzby(zzch zzchVar) {
        this.zzb = zzbr.zza;
        this.zzd = null;
        this.zze = null;
        this.zzc = zzchVar;
    }

    public final zzby zzb() {
        zzbx zzbxVar;
        zzbxVar = zzbx.zza;
        this.zzd = zzbxVar;
        return this;
    }

    public final zzby zza() {
        zzbv zzbvVar = this.zze;
        if (zzbvVar != null) {
            zzbvVar.zzb();
        }
        this.zza = true;
        return this;
    }
}
