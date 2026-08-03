package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbyl extends com.google.android.gms.ads.nativead.NativeAd {
    private final com.google.android.gms.internal.ads.zzbnv zza;
    private final com.google.android.gms.internal.ads.zzbyk zzc;
    private final com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo zzd;
    private final java.util.List zzb = new java.util.ArrayList();
    private final java.util.List zze = new java.util.ArrayList();
    private final java.util.concurrent.atomic.AtomicLong zzf = new java.util.concurrent.atomic.AtomicLong();

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(3:2|3|(2:5|(5:8|(1:10)(1:17)|(3:12|13|14)(1:16)|15|6)))|19|20|(2:22|(5:25|(1:27)(1:34)|(3:29|30|31)(1:33)|32|23))|36|37|(7:39|40|41|42|(2:44|45)|47|48)|53|40|41|42|(0)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ab, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ac, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e A[Catch: RemoteException -> 0x00ab, TRY_LEAVE, TryCatch #2 {RemoteException -> 0x00ab, blocks: (B:42:0x0096, B:44:0x009e), top: B:41:0x0096 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbyl(com.google.android.gms.internal.ads.zzbnv zzbnvVar) {
        com.google.android.gms.internal.ads.zzbyk zzbykVar;
        com.google.android.gms.internal.ads.zzbme zzh;
        this.zza = zzbnvVar;
        com.google.android.gms.internal.ads.zzbyi zzbyiVar = null;
        try {
            java.util.List zzf = zzbnvVar.zzf();
            if (zzf != null) {
                for (java.lang.Object obj : zzf) {
                    com.google.android.gms.internal.ads.zzbme zzh2 = obj instanceof android.os.IBinder ? com.google.android.gms.internal.ads.zzbmd.zzh((android.os.IBinder) obj) : null;
                    if (zzh2 != null) {
                        this.zzb.add(new com.google.android.gms.internal.ads.zzbyk(zzh2));
                    }
                }
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
        try {
            java.util.List zzz = this.zza.zzz();
            if (zzz != null) {
                for (java.lang.Object obj2 : zzz) {
                    com.google.android.gms.ads.internal.client.zzdg zzb = obj2 instanceof android.os.IBinder ? com.google.android.gms.ads.internal.client.zzdf.zzb((android.os.IBinder) obj2) : null;
                    if (zzb != null) {
                        this.zze.add(new com.google.android.gms.ads.internal.client.zzdh(zzb));
                    }
                }
            }
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
        try {
            zzh = this.zza.zzh();
        } catch (android.os.RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
        }
        if (zzh != null) {
            zzbykVar = new com.google.android.gms.internal.ads.zzbyk(zzh);
            this.zzc = zzbykVar;
            if (this.zza.zzq() != null) {
                zzbyiVar = new com.google.android.gms.internal.ads.zzbyi(this.zza.zzq());
            }
            this.zzd = zzbyiVar;
        }
        zzbykVar = null;
        this.zzc = zzbykVar;
        if (this.zza.zzq() != null) {
        }
        this.zzd = zzbyiVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzy();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.zza.zzp();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.zza.zzD();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getAdvertiser() {
        try {
            return this.zza.zzj();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getBody() {
        try {
            return this.zza.zzg();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getCallToAction() {
        try {
            return this.zza.zzi();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final android.os.Bundle getExtras() {
        try {
            android.os.Bundle zzw = this.zza.zzw();
            if (zzw != null) {
                return zzw;
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getHeadline() {
        try {
            return this.zza.zze();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final com.google.android.gms.ads.nativead.NativeAd.Image getIcon() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.util.List<com.google.android.gms.ads.nativead.NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final com.google.android.gms.ads.MediaContent getMediaContent() {
        try {
            com.google.android.gms.internal.ads.zzbnv zzbnvVar = this.zza;
            if (zzbnvVar.zzF() != null) {
                return new com.google.android.gms.ads.internal.client.zzfb(zzbnvVar.zzF(), null);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.util.List<com.google.android.gms.ads.MuteThisAdReason> getMuteThisAdReasons() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final long getPlacementId() {
        long j;
        java.util.concurrent.atomic.AtomicLong atomicLong = this.zzf;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long zzK = this.zza.zzK();
                    java.util.concurrent.atomic.AtomicLong atomicLong2 = this.zzf;
                    atomicLong2.set(zzK);
                    j = atomicLong2.get();
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to getPlacementId", e);
                    return 0L;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getPrice() {
        try {
            return this.zza.zzm();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar;
        try {
            zzdxVar = this.zza.zzH();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            zzdxVar = null;
        }
        return com.google.android.gms.ads.ResponseInfo.zzb(zzdxVar);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.Double getStarRating() {
        try {
            double zzk = this.zza.zzk();
            if (zzk == -1.0d) {
                return null;
            }
            return java.lang.Double.valueOf(zzk);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getStore() {
        try {
            return this.zza.zzl();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzG();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzA();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void muteThisAd(com.google.android.gms.ads.MuteThisAdReason muteThisAdReason) {
        try {
            try {
                if (this.zza.zzA()) {
                    if (muteThisAdReason == null) {
                        this.zza.zzB(null);
                        return;
                    } else if (muteThisAdReason instanceof com.google.android.gms.ads.internal.client.zzdh) {
                        this.zza.zzB(((com.google.android.gms.ads.internal.client.zzdh) muteThisAdReason).zza());
                        return;
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzo.zzf("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad is not custom mute enabled");
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(android.os.Bundle bundle) {
        try {
            this.zza.zzr(bundle);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.zza.zzE();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final void recordEvent(android.os.Bundle bundle) {
        try {
            this.zza.zzJ(bundle);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to record native event", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(android.os.Bundle bundle) {
        try {
            return this.zza.zzs(bundle);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(android.os.Bundle bundle) {
        try {
            this.zza.zzt(bundle);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(com.google.android.gms.ads.MuteThisAdListener muteThisAdListener) {
        try {
            this.zza.zzC(new com.google.android.gms.ads.internal.client.zzdd(muteThisAdListener));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener) {
        try {
            this.zza.zzI(new com.google.android.gms.ads.internal.client.zzfo(onPaidEventListener));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to setOnPaidEventListener", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setPlacementId(long j) {
        try {
            this.zza.zzL(j);
            this.zzf.set(j);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to setPlacementId", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.zza.zzx(new com.google.android.gms.internal.ads.zzbyr(unconfirmedClickListener));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to setUnconfirmedClickListener", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        try {
            return this.zza.zzu();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }
}
