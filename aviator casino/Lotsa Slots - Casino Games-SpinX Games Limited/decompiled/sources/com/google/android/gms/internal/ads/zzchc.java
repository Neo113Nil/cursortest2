package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzchc {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzchn zzb;
    private final android.view.ViewGroup zzc;
    private final com.google.android.gms.internal.ads.zzdzl zzd;
    private com.google.android.gms.internal.ads.zzchb zze;

    public zzchc(android.content.Context context, android.view.ViewGroup viewGroup, com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzckuVar;
        this.zze = null;
        this.zzd = zzdzlVar;
    }

    public final java.lang.Integer zza() {
        com.google.android.gms.internal.ads.zzchb zzchbVar = this.zze;
        if (zzchbVar != null) {
            return zzchbVar.zzl();
        }
        return null;
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        com.google.android.gms.internal.ads.zzchb zzchbVar = this.zze;
        if (zzchbVar != null) {
            zzchbVar.zzn(i, i2, i3, i4);
        }
    }

    public final void zzc(int i, int i2, int i3, int i4, int i5, boolean z, com.google.android.gms.internal.ads.zzchm zzchmVar) {
        if (this.zze != null) {
            return;
        }
        com.google.android.gms.internal.ads.zzchn zzchnVar = this.zzb;
        com.google.android.gms.internal.ads.zzbix.zza(zzchnVar.zzq().zzc(), zzchnVar.zzi(), "vpr2");
        com.google.android.gms.internal.ads.zzchb zzchbVar = new com.google.android.gms.internal.ads.zzchb(this.zza, zzchnVar, i5, z, zzchnVar.zzq().zzc(), zzchmVar, this.zzd);
        this.zze = zzchbVar;
        this.zzc.addView(zzchbVar, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.zze.zzn(i, i2, i3, i4);
        zzchnVar.zzdn(false);
    }

    public final com.google.android.gms.internal.ads.zzchb zzd() {
        return this.zze;
    }

    public final void zze() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("onPause must be called from the UI thread.");
        com.google.android.gms.internal.ads.zzchb zzchbVar = this.zze;
        if (zzchbVar != null) {
            zzchbVar.zzr();
        }
    }

    public final void zzf() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        com.google.android.gms.internal.ads.zzchb zzchbVar = this.zze;
        if (zzchbVar != null) {
            zzchbVar.zzE();
            this.zzc.removeView(this.zze);
            this.zze = null;
        }
    }

    public final void zzg(int i) {
        com.google.android.gms.internal.ads.zzchb zzchbVar = this.zze;
        if (zzchbVar != null) {
            zzchbVar.zzm(i);
        }
    }
}
