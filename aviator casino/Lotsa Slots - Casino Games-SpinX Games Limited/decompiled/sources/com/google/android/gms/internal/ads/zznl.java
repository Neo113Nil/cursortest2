package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zznl implements com.google.android.gms.internal.ads.zzmb {
    private boolean zza;
    private long zzb;
    private long zzc;
    private com.google.android.gms.internal.ads.zzav zzd = com.google.android.gms.internal.ads.zzav.zza;

    public zznl(com.google.android.gms.internal.ads.zzdo zzdoVar) {
    }

    public final void zza() {
        if (this.zza) {
            return;
        }
        this.zzc = android.os.SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zzb() {
        if (this.zza) {
            zzc(zzg());
            this.zza = false;
        }
    }

    public final void zzc(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final long zzg() {
        long j = this.zzb;
        if (!this.zza) {
            return j;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.zzc;
        com.google.android.gms.internal.ads.zzav zzavVar = this.zzd;
        return j + (zzavVar.zzb == 1.0f ? com.google.android.gms.internal.ads.zzfl.zzs(elapsedRealtime) : zzavVar.zza(elapsedRealtime));
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public /* synthetic */ boolean zzh() {
        return com.google.android.gms.internal.ads.zzmb.CC.$default$zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzi(com.google.android.gms.internal.ads.zzav zzavVar) {
        if (this.zza) {
            zzc(zzg());
        }
        this.zzd = zzavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final com.google.android.gms.internal.ads.zzav zzj() {
        return this.zzd;
    }
}
