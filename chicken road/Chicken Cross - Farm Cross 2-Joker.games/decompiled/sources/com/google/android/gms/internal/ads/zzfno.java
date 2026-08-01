package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfno {
    private final zzfnn zza = new zzfnn();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    zzfno() {
    }

    public final void zza() {
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
    }

    public final void zzc() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zzd() {
        this.zzc++;
        this.zza.zzb = true;
    }

    public final void zze() {
        this.zzf++;
    }

    public final zzfnn zzf() {
        zzfnn zzfnnVar = this.zza;
        zzfnn clone = zzfnnVar.clone();
        zzfnnVar.zza = false;
        zzfnnVar.zzb = false;
        return clone;
    }

    public final String zzg() {
        return "\n\tPool does not exist: " + this.zzd + "\n\tNew pools created: " + this.zzb + "\n\tPools removed: " + this.zzc + "\n\tEntries added: " + this.zzf + "\n\tNo entries retrieved: " + this.zze + "\n";
    }
}
