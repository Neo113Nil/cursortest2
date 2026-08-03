package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzac extends com.google.android.gms.internal.ads.zzbza implements com.google.android.gms.internal.ads.zzbfk {
    private final com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel zza;
    private final android.app.Activity zzb;
    private final boolean zzf;
    private boolean zzc = false;
    private boolean zzd = false;
    private boolean zze = false;
    private boolean zzg = false;
    private boolean zzh = false;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfM)).booleanValue() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzac(android.app.Activity activity, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfH)).booleanValue()) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfI)).booleanValue()) {
            }
        }
        com.google.android.gms.ads.internal.overlay.zzc zzcVar = adOverlayInfoParcel.zza;
        if (zzcVar != null && zzcVar.zzj) {
            if (android.os.Build.MANUFACTURER.matches((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfK))) {
                if (android.os.Build.MODEL.matches((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfL))) {
                    z = true;
                }
            }
        }
        this.zzf = z;
    }

    private final synchronized void zzc() {
        if (!this.zzd) {
            com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zza.zzc;
            if (zzrVar != null) {
                zzrVar.zzdU(4);
            }
            this.zzd = true;
            if (this.zzf) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfM)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzg().zzc(this);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzH(int i, java.lang.String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zza(boolean z) {
        if (!z) {
            this.zzh = true;
        } else if (this.zzh) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Foregrounded: finishing activity from LauncherOverlay");
            this.zzb.finish();
        }
    }

    final /* synthetic */ void zzb() {
        if (this.zzg) {
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zze() throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzf() throws android.os.RemoteException {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final boolean zzg() throws android.os.RemoteException {
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfI)).booleanValue() && this.zzf && this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzh(android.os.Bundle bundle) {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkm)).booleanValue() && !this.zze) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
            return;
        }
        if (z) {
            this.zzb.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            com.google.android.gms.internal.ads.zzdky zzdkyVar = adOverlayInfoParcel.zzu;
            if (zzdkyVar != null) {
                zzdkyVar.zzdu();
            }
            android.app.Activity activity = this.zzb;
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                zzrVar.zzh();
            }
        }
        if (this.zzf) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfM)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzg().zzb(this);
            }
        }
        android.app.Activity activity2 = this.zzb;
        com.google.android.gms.ads.internal.overlay.zzc zzcVar = adOverlayInfoParcel.zza;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = adOverlayInfoParcel.zzi;
        com.google.android.gms.ads.internal.zzt.zza();
        if (com.google.android.gms.ads.internal.overlay.zza.zzb(activity2, zzcVar, zzadVar, zzcVar.zzi, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzi() throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzj() throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzk() throws android.os.RemoteException {
        if (this.zzc) {
            com.google.android.gms.ads.internal.util.zze.zza("LauncherOverlay finishing activity");
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        this.zzg = true;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdx();
        }
        if (this.zzf) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfH)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzab
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.ads.internal.overlay.zzac.this.zzb();
                    }
                }, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfJ)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzl() throws android.os.RemoteException {
        this.zzg = false;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdw();
        }
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzm(int i, int i2, android.content.Intent intent) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzo(android.os.Bundle bundle) throws android.os.RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzp() throws android.os.RemoteException {
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzq() throws android.os.RemoteException {
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzs() throws android.os.RemoteException {
        this.zze = true;
    }
}
