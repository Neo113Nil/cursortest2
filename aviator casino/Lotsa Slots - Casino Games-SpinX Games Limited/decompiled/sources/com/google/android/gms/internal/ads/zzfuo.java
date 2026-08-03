package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfuo extends com.google.android.gms.internal.ads.zzfuk {
    private final com.google.android.gms.internal.ads.zzfum zza;
    private com.google.android.gms.internal.ads.zzfwz zzc;
    private com.google.android.gms.internal.ads.zzfvy zzd;
    private final java.lang.String zzg;
    private final com.google.android.gms.internal.ads.zzfvm zzb = new com.google.android.gms.internal.ads.zzfvm();
    private boolean zze = false;
    private boolean zzf = false;

    zzfuo(com.google.android.gms.internal.ads.zzful zzfulVar, com.google.android.gms.internal.ads.zzfum zzfumVar, java.lang.String str) {
        this.zza = zzfumVar;
        this.zzg = str;
        zzk(null);
        if (zzfumVar.zzi() == com.google.android.gms.internal.ads.zzfun.HTML || zzfumVar.zzi() == com.google.android.gms.internal.ads.zzfun.JAVASCRIPT) {
            this.zzd = new com.google.android.gms.internal.ads.zzfvz(str, zzfumVar.zzf());
        } else {
            this.zzd = new com.google.android.gms.internal.ads.zzfwc(str, zzfumVar.zze(), null);
        }
        this.zzd.zza();
        com.google.android.gms.internal.ads.zzfvi.zza().zzb(this);
        this.zzd.zzj(zzfulVar);
    }

    private final void zzk(android.view.View view) {
        this.zzc = new com.google.android.gms.internal.ads.zzfwz(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfuk
    public final void zza() {
        if (this.zze || this.zzd == null) {
            return;
        }
        this.zze = true;
        com.google.android.gms.internal.ads.zzfvi.zza().zzc(this);
        this.zzd.zzo(com.google.android.gms.internal.ads.zzfvq.zza().zzg());
        this.zzd.zzn(com.google.android.gms.internal.ads.zzfvg.zza().zzb());
        this.zzd.zzk(this, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfuk
    public final void zzb(android.view.View view) {
        if (this.zzf || zzi() == view) {
            return;
        }
        zzk(view);
        this.zzd.zzp();
        java.util.Collection<com.google.android.gms.internal.ads.zzfuo> zze = com.google.android.gms.internal.ads.zzfvi.zza().zze();
        if (zze == null || zze.isEmpty()) {
            return;
        }
        for (com.google.android.gms.internal.ads.zzfuo zzfuoVar : zze) {
            if (zzfuoVar != this && zzfuoVar.zzi() == view) {
                zzfuoVar.zzc.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuk
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        if (!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zzm();
        com.google.android.gms.internal.ads.zzfvi.zza().zzd(this);
        this.zzd.zzb();
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfuk
    public final void zzd(android.view.View view, com.google.android.gms.internal.ads.zzfur zzfurVar, java.lang.String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, zzfurVar, "Ad overlay");
    }

    public final java.util.List zzf() {
        return this.zzb.zza();
    }

    public final com.google.android.gms.internal.ads.zzfvy zzg() {
        return this.zzd;
    }

    public final java.lang.String zzh() {
        return this.zzg;
    }

    public final android.view.View zzi() {
        return (android.view.View) this.zzc.get();
    }

    public final boolean zzj() {
        return this.zze && !this.zzf;
    }
}
