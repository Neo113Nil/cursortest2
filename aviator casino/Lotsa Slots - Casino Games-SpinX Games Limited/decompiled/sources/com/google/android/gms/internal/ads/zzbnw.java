package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbnw extends com.google.android.gms.ads.formats.UnifiedNativeAd {
    private final com.google.android.gms.internal.ads.zzbnv zza;
    private final com.google.android.gms.internal.ads.zzbmf zzc;
    private final java.util.List zzb = new java.util.ArrayList();
    private final com.google.android.gms.ads.VideoController zzd = new com.google.android.gms.ads.VideoController();
    private final java.util.List zze = new java.util.ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbnw(com.google.android.gms.internal.ads.zzbnv zzbnvVar) {
        com.google.android.gms.internal.ads.zzbme zzbmeVar;
        android.os.IBinder iBinder;
        this.zza = zzbnvVar;
        com.google.android.gms.internal.ads.zzbmf zzbmfVar = null;
        try {
            java.util.List zzf = zzbnvVar.zzf();
            if (zzf != null) {
                for (java.lang.Object obj : zzf) {
                    if ((obj instanceof android.os.IBinder) && (iBinder = (android.os.IBinder) obj) != null) {
                        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbmeVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbme ? (com.google.android.gms.internal.ads.zzbme) queryLocalInterface : new com.google.android.gms.internal.ads.zzbmc(iBinder);
                        if (zzbmeVar == null) {
                            this.zzb.add(new com.google.android.gms.internal.ads.zzbmf(zzbmeVar));
                        }
                    }
                    zzbmeVar = null;
                    if (zzbmeVar == null) {
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
            com.google.android.gms.internal.ads.zzbme zzh = this.zza.zzh();
            if (zzh != null) {
                zzbmfVar = new com.google.android.gms.internal.ads.zzbmf(zzh);
            }
        } catch (android.os.RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
        }
        this.zzc = zzbmfVar;
        try {
            if (this.zza.zzq() != null) {
                new com.google.android.gms.internal.ads.zzbly(this.zza.zzq());
            }
        } catch (android.os.RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e4);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(android.os.Bundle bundle) {
        try {
            this.zza.zzr(bundle);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(android.os.Bundle bundle) {
        try {
            return this.zza.zzs(bundle);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(android.os.Bundle bundle) {
        try {
            this.zza.zzt(bundle);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zza() {
        try {
            return this.zza.zze();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.util.List zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zzc() {
        try {
            return this.zza.zzg();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final com.google.android.gms.ads.formats.NativeAd.Image zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zze() {
        try {
            return this.zza.zzi();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zzf() {
        try {
            return this.zza.zzj();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.Double zzg() {
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

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zzh() {
        try {
            return this.zza.zzl();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zzi() {
        try {
            return this.zza.zzm();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final com.google.android.gms.ads.VideoController zzj() {
        try {
            com.google.android.gms.internal.ads.zzbnv zzbnvVar = this.zza;
            if (zzbnvVar.zzn() != null) {
                this.zzd.zza(zzbnvVar.zzn());
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception occurred while getting video controller", e);
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.Object zzk() {
        try {
            com.google.android.gms.dynamic.IObjectWrapper zzv = this.zza.zzv();
            if (zzv != null) {
                return com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzv);
            }
            return null;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }
}
