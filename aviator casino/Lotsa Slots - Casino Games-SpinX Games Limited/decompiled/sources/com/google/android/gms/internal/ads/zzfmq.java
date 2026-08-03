package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfmq {
    private final com.google.android.gms.internal.ads.zzfmp zza = new com.google.android.gms.internal.ads.zzfmp();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    zzfmq() {
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

    public final com.google.android.gms.internal.ads.zzfmp zzf() {
        com.google.android.gms.internal.ads.zzfmp zzfmpVar = this.zza;
        com.google.android.gms.internal.ads.zzfmp clone = zzfmpVar.clone();
        zzfmpVar.zza = false;
        zzfmpVar.zzb = false;
        return clone;
    }

    public final java.lang.String zzg() {
        return "\n\tPool does not exist: " + this.zzd + "\n\tNew pools created: " + this.zzb + "\n\tPools removed: " + this.zzc + "\n\tEntries added: " + this.zzf + "\n\tNo entries retrieved: " + this.zze + "\n";
    }
}
