package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbyp implements com.google.android.gms.ads.nativead.NativeCustomFormatAd {
    private final com.google.android.gms.internal.ads.zzbmv zza;
    private com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement zzb;

    public zzbyp(com.google.android.gms.internal.ads.zzbmv zzbmvVar) {
        this.zza = zzbmvVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final java.util.List<java.lang.String> getAvailableAssetNames() {
        try {
            return this.zza.zzg();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final java.lang.String getCustomFormatId() {
        try {
            return this.zza.zzh();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzb == null) {
                com.google.android.gms.internal.ads.zzbmv zzbmvVar = this.zza;
                if (zzbmvVar.zzo()) {
                    this.zzb = new com.google.android.gms.internal.ads.zzbyj(zzbmvVar);
                }
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final com.google.android.gms.ads.nativead.NativeAd.Image getImage(java.lang.String str) {
        try {
            com.google.android.gms.internal.ads.zzbme zzf = this.zza.zzf(str);
            if (zzf != null) {
                return new com.google.android.gms.internal.ads.zzbyk(zzf);
            }
            return null;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final com.google.android.gms.ads.MediaContent getMediaContent() {
        try {
            com.google.android.gms.internal.ads.zzbmv zzbmvVar = this.zza;
            if (zzbmvVar.zzs() != null) {
                return new com.google.android.gms.ads.internal.client.zzfb(zzbmvVar.zzs(), zzbmvVar);
            }
            return null;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final java.lang.CharSequence getText(java.lang.String str) {
        try {
            return this.zza.zze(str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(java.lang.String str) {
        try {
            this.zza.zzi(str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.zza.zzj();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }
}
