package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdtz extends com.google.android.gms.internal.ads.zzbsd implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, com.google.android.gms.internal.ads.zzblo {
    private android.view.View zza;
    private com.google.android.gms.ads.internal.client.zzea zzb;
    private com.google.android.gms.internal.ads.zzdpo zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdtz(com.google.android.gms.internal.ads.zzdpo zzdpoVar, com.google.android.gms.internal.ads.zzdpt zzdptVar) {
        this.zza = zzdptVar.zzJ();
        this.zzb = zzdptVar.zzy();
        this.zzc = zzdpoVar;
        if (zzdptVar.zzT() != null) {
            zzdptVar.zzT().zzax(this);
        }
    }

    private final void zzg() {
        android.view.View view = this.zza;
        if (view == null) {
            return;
        }
        android.view.ViewParent parent = view.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(this.zza);
        }
    }

    private final void zzh() {
        android.view.View view;
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzc;
        if (zzdpoVar == null || (view = this.zza) == null) {
            return;
        }
        zzdpoVar.zzu(view, java.util.Collections.emptyMap(), java.util.Collections.emptyMap(), com.google.android.gms.internal.ads.zzdpo.zzI(this.zza));
    }

    private static final void zzi(com.google.android.gms.internal.ads.zzbsh zzbshVar, int i) {
        try {
            zzbshVar.zzf(i);
        } catch (android.os.RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzblo
    public final void zza() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdty
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    com.google.android.gms.internal.ads.zzdtz.this.zzc();
                } catch (android.os.RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbse
    public final com.google.android.gms.ads.internal.client.zzea zzb() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbse
    public final void zzc() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzg();
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzc;
        if (zzdpoVar != null) {
            zzdpoVar.zzd();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbse
    public final void zzd(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbsh zzbshVar) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Instream ad can not be shown after destroy().");
            zzi(zzbshVar, 2);
            return;
        }
        android.view.View view = this.zza;
        if (view == null || this.zzb == null) {
            java.lang.String str = view == null ? "can not get video view." : "can not get video controller.";
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Instream internal error: ".concat(str));
            zzi(zzbshVar, 0);
            return;
        }
        if (this.zze) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Instream ad should not be used again.");
            zzi(zzbshVar, 1);
            return;
        }
        this.zze = true;
        zzg();
        ((android.view.ViewGroup) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new android.view.ViewGroup.LayoutParams(-1, -1));
        com.google.android.gms.ads.internal.zzt.zzC();
        com.google.android.gms.internal.ads.zzcge.zza(this.zza, this);
        com.google.android.gms.ads.internal.zzt.zzC();
        com.google.android.gms.internal.ads.zzcge.zzb(this.zza, this);
        zzh();
        try {
            zzbshVar.zze();
        } catch (android.os.RemoteException e) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbse
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzd(iObjectWrapper, new com.google.android.gms.internal.ads.zzdtx(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbse
    public final com.google.android.gms.internal.ads.zzbmb zzf() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzc;
        if (zzdpoVar == null || zzdpoVar.zzP() == null) {
            return null;
        }
        return zzdpoVar.zzP().zza();
    }
}
