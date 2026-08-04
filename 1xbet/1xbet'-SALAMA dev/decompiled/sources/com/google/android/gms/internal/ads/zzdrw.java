package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;

/* JADX INFO: loaded from: classes.dex */
public final class zzdrw {
    private final zzbjy zza;

    public zzdrw(zzbjy zzbjyVar) {
        this.zza = zzbjyVar;
    }

    private final void zzs(zzdru zzdruVar) {
        String strZza = zzdru.zza(zzdruVar);
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strZza);
        int i7 = J.f3546b;
        j.f(strConcat);
        this.zza.zzb(strZza);
    }

    public final void zza() {
        zzs(new zzdru("initialize", null));
    }

    public final void zzb(long j) {
        zzdru zzdruVar = new zzdru("interstitial", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "onAdClicked";
        this.zza.zzb(zzdru.zza(zzdruVar));
    }

    public final void zzc(long j) {
        zzdru zzdruVar = new zzdru("interstitial", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "onAdClosed";
        zzs(zzdruVar);
    }

    public final void zzd(long j, int i7) {
        zzdru zzdruVar = new zzdru("interstitial", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "onAdFailedToLoad";
        zzdruVar.zzd = Integer.valueOf(i7);
        zzs(zzdruVar);
    }

    public final void zze(long j) {
        zzdru zzdruVar = new zzdru("interstitial", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "onAdLoaded";
        zzs(zzdruVar);
    }

    public final void zzf(long j) {
        zzdru zzdruVar = new zzdru("interstitial", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdruVar);
    }

    public final void zzg(long j) {
        zzdru zzdruVar = new zzdru("interstitial", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "onAdOpened";
        zzs(zzdruVar);
    }

    public final void zzh(long j) {
        zzdru zzdruVar = new zzdru("creation", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "nativeObjectCreated";
        zzs(zzdruVar);
    }

    public final void zzi(long j) {
        zzdru zzdruVar = new zzdru("creation", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "nativeObjectNotCreated";
        zzs(zzdruVar);
    }

    public final void zzj(long j) {
        zzdru zzdruVar = new zzdru("rewarded", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "onAdClicked";
        zzs(zzdruVar);
    }

    public final void zzk(long j) {
        zzdru zzdruVar = new zzdru("rewarded", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "onRewardedAdClosed";
        zzs(zzdruVar);
    }

    public final void zzl(long j, zzbvq zzbvqVar) {
        zzdru zzdruVar = new zzdru("rewarded", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "onUserEarnedReward";
        zzdruVar.zze = zzbvqVar.zzf();
        zzdruVar.zzf = Integer.valueOf(zzbvqVar.zze());
        zzs(zzdruVar);
    }

    public final void zzm(long j, int i7) {
        zzdru zzdruVar = new zzdru("rewarded", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "onRewardedAdFailedToLoad";
        zzdruVar.zzd = Integer.valueOf(i7);
        zzs(zzdruVar);
    }

    public final void zzn(long j, int i7) {
        zzdru zzdruVar = new zzdru("rewarded", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "onRewardedAdFailedToShow";
        zzdruVar.zzd = Integer.valueOf(i7);
        zzs(zzdruVar);
    }

    public final void zzo(long j) {
        zzdru zzdruVar = new zzdru("rewarded", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "onAdImpression";
        zzs(zzdruVar);
    }

    public final void zzp(long j) {
        zzdru zzdruVar = new zzdru("rewarded", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "onRewardedAdLoaded";
        zzs(zzdruVar);
    }

    public final void zzq(long j) {
        zzdru zzdruVar = new zzdru("rewarded", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdruVar);
    }

    public final void zzr(long j) {
        zzdru zzdruVar = new zzdru("rewarded", null);
        zzdruVar.zza = Long.valueOf(j);
        zzdruVar.zzc = "onRewardedAdOpened";
        zzs(zzdruVar);
    }
}
