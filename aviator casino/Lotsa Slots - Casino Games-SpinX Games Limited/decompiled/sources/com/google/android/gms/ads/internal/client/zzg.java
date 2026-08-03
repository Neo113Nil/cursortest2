package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzg extends com.google.android.gms.ads.internal.client.zzbg {
    private final com.google.android.gms.ads.AdListener zza;

    public zzg(com.google.android.gms.ads.AdListener adListener) {
        this.zza = adListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb() {
        com.google.android.gms.ads.AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc(int i) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf() {
        com.google.android.gms.ads.AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
        com.google.android.gms.ads.AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
        com.google.android.gms.ads.AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
        com.google.android.gms.ads.AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
        com.google.android.gms.ads.AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    public final com.google.android.gms.ads.AdListener zzk() {
        return this.zza;
    }
}
