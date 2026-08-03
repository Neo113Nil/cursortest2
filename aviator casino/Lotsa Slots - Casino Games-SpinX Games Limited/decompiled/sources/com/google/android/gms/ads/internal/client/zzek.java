package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzek {
    final com.google.android.gms.ads.internal.client.zzaz zza;
    private final com.google.android.gms.internal.ads.zzbuy zzb;
    private final com.google.android.gms.ads.internal.client.zzq zzc;
    private final java.util.concurrent.atomic.AtomicBoolean zzd;
    private final com.google.android.gms.ads.VideoController zze;
    private com.google.android.gms.ads.internal.client.zza zzf;
    private com.google.android.gms.ads.AdListener zzg;
    private com.google.android.gms.ads.AdSize[] zzh;
    private com.google.android.gms.ads.admanager.AppEventListener zzi;
    private com.google.android.gms.ads.internal.client.zzbu zzj;
    private com.google.android.gms.ads.VideoOptions zzk;
    private java.lang.String zzl;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final android.view.ViewGroup zzm;
    private int zzn;
    private boolean zzo;
    private com.google.android.gms.ads.OnPaidEventListener zzp;
    private final java.util.concurrent.atomic.AtomicLong zzq;

    public zzek(android.view.ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, com.google.android.gms.ads.internal.client.zzq.zza, null, i);
    }

    private static com.google.android.gms.ads.internal.client.zzr zzF(android.content.Context context, com.google.android.gms.ads.AdSize[] adSizeArr, int i) {
        for (com.google.android.gms.ads.AdSize adSize : adSizeArr) {
            if (adSize.equals(com.google.android.gms.ads.AdSize.INVALID)) {
                return new com.google.android.gms.ads.internal.client.zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false, false);
            }
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar = new com.google.android.gms.ads.internal.client.zzr(context, adSizeArr);
        zzrVar.zzj = zzG(i);
        return zzrVar;
    }

    private static boolean zzG(int i) {
        return i == 1;
    }

    public final com.google.android.gms.ads.VideoOptions zzB() {
        return this.zzk;
    }

    public final boolean zzC(com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        try {
            com.google.android.gms.dynamic.IObjectWrapper zzb = zzbuVar.zzb();
            if (zzb == null || ((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzb)).getParent() != null) {
                return false;
            }
            this.zzm.addView((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzb));
            this.zzj = zzbuVar;
            return true;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    final /* synthetic */ void zzD(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zzm.addView((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }

    final /* synthetic */ com.google.android.gms.ads.VideoController zzE() {
        return this.zze;
    }

    public final void zza() {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzc();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final com.google.android.gms.ads.AdListener zzb() {
        return this.zzg;
    }

    public final com.google.android.gms.ads.AdSize zzc() {
        com.google.android.gms.ads.internal.client.zzr zzn;
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar != null && (zzn = zzbuVar.zzn()) != null) {
                return com.google.android.gms.ads.zzc.zza(zzn.zze, zzn.zzb, zzn.zza);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        com.google.android.gms.ads.AdSize[] adSizeArr = this.zzh;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final com.google.android.gms.ads.AdSize[] zzd() {
        return this.zzh;
    }

    public final java.lang.String zze() {
        com.google.android.gms.ads.internal.client.zzbu zzbuVar;
        if (this.zzl == null && (zzbuVar = this.zzj) != null) {
            try {
                this.zzl = zzbuVar.zzu();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return this.zzl;
    }

    public final com.google.android.gms.ads.admanager.AppEventListener zzf() {
        return this.zzi;
    }

    public final void zzg(com.google.android.gms.ads.internal.client.zzeh zzehVar) {
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar == null) {
                if ((this.zzh == null || this.zzl == null) && zzbuVar == null) {
                    throw new java.lang.IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                android.view.ViewGroup viewGroup = this.zzm;
                android.content.Context context = viewGroup.getContext();
                com.google.android.gms.ads.internal.client.zzbu zzbuVar2 = (com.google.android.gms.ads.internal.client.zzbu) new com.google.android.gms.ads.internal.client.zzal(com.google.android.gms.ads.internal.client.zzay.zzb(), context, zzF(context, this.zzh, this.zzn), this.zzl, this.zzb).zzd(context, false);
                this.zzj = zzbuVar2;
                zzbuVar2.zzdS(new com.google.android.gms.ads.internal.client.zzg(this.zza));
                com.google.android.gms.ads.internal.client.zza zzaVar = this.zzf;
                if (zzaVar != null) {
                    this.zzj.zzy(new com.google.android.gms.ads.internal.client.zzb(zzaVar));
                }
                com.google.android.gms.ads.admanager.AppEventListener appEventListener = this.zzi;
                if (appEventListener != null) {
                    this.zzj.zzi(new com.google.android.gms.internal.ads.zzbff(appEventListener));
                }
                if (this.zzk != null) {
                    this.zzj.zzG(new com.google.android.gms.ads.internal.client.zzfw(this.zzk));
                }
                this.zzj.zzP(new com.google.android.gms.ads.internal.client.zzfo(this.zzp));
                this.zzj.zzz(this.zzo);
                com.google.android.gms.ads.internal.client.zzbu zzbuVar3 = this.zzj;
                if (zzbuVar3 != null) {
                    try {
                        final com.google.android.gms.dynamic.IObjectWrapper zzb = zzbuVar3.zzb();
                        if (zzb != null) {
                            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzf.zze()).booleanValue()) {
                                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmD)).booleanValue()) {
                                    com.google.android.gms.ads.internal.util.client.zzf.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.client.zzej
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            com.google.android.gms.ads.internal.client.zzek.this.zzD(zzb);
                                        }
                                    });
                                }
                            }
                            viewGroup.addView((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzb));
                        }
                    } catch (android.os.RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
            zzehVar.zzp(currentTimeMillis);
            if (zzehVar.zzr() != 0) {
                this.zzq.set(zzehVar.zzr());
            }
            com.google.android.gms.ads.internal.client.zzbu zzbuVar4 = this.zzj;
            zzbuVar4.getClass();
            java.util.concurrent.atomic.AtomicLong atomicLong = this.zzq;
            if (atomicLong.get() != 0) {
                zzbuVar4.zzT(atomicLong.get());
            }
            zzbuVar4.zze(this.zzc.zza(this.zzm.getContext(), zzehVar));
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzh() {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzf();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzi() {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzm();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzj() {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzg();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzk(com.google.android.gms.ads.AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zza zzaVar) {
        try {
            this.zzf = zzaVar;
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzy(zzaVar != null ? new com.google.android.gms.ads.internal.client.zzb(zzaVar) : null);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzm(com.google.android.gms.ads.AdSize... adSizeArr) {
        if (this.zzh != null) {
            throw new java.lang.IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzn(adSizeArr);
    }

    public final void zzn(com.google.android.gms.ads.AdSize... adSizeArr) {
        this.zzh = adSizeArr;
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzo(zzF(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        this.zzm.requestLayout();
    }

    public final void zzo(java.lang.String str) {
        if (this.zzl != null) {
            throw new java.lang.IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzl = str;
    }

    public final void zzp(com.google.android.gms.ads.admanager.AppEventListener appEventListener) {
        try {
            this.zzi = appEventListener;
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzi(appEventListener != null ? new com.google.android.gms.internal.ads.zzbff(appEventListener) : null);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzq(boolean z) {
        this.zzo = z;
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzz(z);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final boolean zzr() {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                return zzbuVar.zzA();
            }
            return false;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final boolean zzs() {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                return zzbuVar.zzB();
            }
            return false;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final com.google.android.gms.ads.ResponseInfo zzt() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = null;
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzdxVar = zzbuVar.zzt();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return com.google.android.gms.ads.ResponseInfo.zzb(zzdxVar);
    }

    public final void zzu(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzP(new com.google.android.gms.ads.internal.client.zzfo(onPaidEventListener));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final long zzv() {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.zzq;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                atomicLong.set(zzbuVar.zzU());
                return atomicLong.get();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return 0L;
    }

    public final void zzw(long j) {
        this.zzq.set(j);
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzT(j);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final com.google.android.gms.ads.OnPaidEventListener zzx() {
        return this.zzp;
    }

    public final com.google.android.gms.ads.VideoController zzy() {
        return this.zze;
    }

    public final com.google.android.gms.ads.internal.client.zzea zzz() {
        com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
        if (zzbuVar != null) {
            try {
                return zzbuVar.zzF();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public zzek(android.view.ViewGroup viewGroup, android.util.AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, com.google.android.gms.ads.internal.client.zzq.zza, null, 0);
    }

    public final void zzA(com.google.android.gms.ads.VideoOptions videoOptions) {
        this.zzk = videoOptions;
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzG(videoOptions == null ? null : new com.google.android.gms.ads.internal.client.zzfw(videoOptions));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public zzek(android.view.ViewGroup viewGroup, android.util.AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, com.google.android.gms.ads.internal.client.zzq.zza, null, i);
    }

    zzek(android.view.ViewGroup viewGroup, android.util.AttributeSet attributeSet, boolean z, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, int i) {
        com.google.android.gms.ads.internal.client.zzr zzrVar;
        this.zzb = new com.google.android.gms.internal.ads.zzbuy();
        this.zze = new com.google.android.gms.ads.VideoController();
        this.zza = new com.google.android.gms.ads.internal.client.zzei(this);
        this.zzq = new java.util.concurrent.atomic.AtomicLong();
        this.zzm = viewGroup;
        this.zzc = zzqVar;
        this.zzj = null;
        this.zzd = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.zzn = i;
        if (attributeSet != null) {
            android.content.Context context = viewGroup.getContext();
            try {
                com.google.android.gms.ads.internal.client.zzz zzzVar = new com.google.android.gms.ads.internal.client.zzz(context, attributeSet);
                this.zzh = zzzVar.zza(z);
                this.zzl = zzzVar.zzb();
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zza = com.google.android.gms.ads.internal.client.zzay.zza();
                    com.google.android.gms.ads.AdSize adSize = this.zzh[0];
                    int i2 = this.zzn;
                    if (adSize.equals(com.google.android.gms.ads.AdSize.INVALID)) {
                        zzrVar = new com.google.android.gms.ads.internal.client.zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false, false);
                    } else {
                        com.google.android.gms.ads.internal.client.zzr zzrVar2 = new com.google.android.gms.ads.internal.client.zzr(context, adSize);
                        zzrVar2.zzj = zzG(i2);
                        zzrVar = zzrVar2;
                    }
                    zza.zzc(viewGroup, zzrVar, "Ads by Google");
                }
            } catch (java.lang.IllegalArgumentException e) {
                com.google.android.gms.ads.internal.client.zzay.zza().zzb(viewGroup, new com.google.android.gms.ads.internal.client.zzr(context, com.google.android.gms.ads.AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }
}
