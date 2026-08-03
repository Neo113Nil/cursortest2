package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeay {
    private final com.google.android.gms.internal.ads.zzbqq zza;

    zzeay(com.google.android.gms.internal.ads.zzbqq zzbqqVar) {
        this.zza = zzbqqVar;
    }

    private final void zzs(com.google.android.gms.internal.ads.zzeax zzeaxVar) throws android.os.RemoteException {
        java.lang.String zza = zzeaxVar.zza();
        java.lang.String concat = "Dispatching AFMA event on publisher webview: ".concat(zza);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(concat);
        this.zza.zzb(zza);
    }

    public final void zza() throws android.os.RemoteException {
        zzs(new com.google.android.gms.internal.ads.zzeax(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, null));
    }

    public final void zzb(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("creation", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc("nativeObjectCreated");
        zzs(zzeaxVar);
    }

    public final void zzc(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("creation", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc("nativeObjectNotCreated");
        zzs(zzeaxVar);
    }

    public final void zzd(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("interstitial", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzeaxVar);
    }

    public final void zze(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("interstitial", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc(com.ironsource.Vf.j);
        zzs(zzeaxVar);
    }

    public final void zzf(long j, int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("interstitial", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc("onAdFailedToLoad");
        zzeaxVar.zzd(java.lang.Integer.valueOf(i));
        zzs(zzeaxVar);
    }

    public final void zzg(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("interstitial", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc(com.ironsource.Vf.c);
        zzs(zzeaxVar);
    }

    public final void zzh(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("interstitial", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc(com.ironsource.Vf.f);
        this.zza.zzb(zzeaxVar.zza());
    }

    public final void zzi(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("interstitial", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc(com.ironsource.Vf.g);
        zzs(zzeaxVar);
    }

    public final void zzj(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("rewarded", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzeaxVar);
    }

    public final void zzk(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("rewarded", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc("onRewardedAdLoaded");
        zzs(zzeaxVar);
    }

    public final void zzl(long j, int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("rewarded", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc("onRewardedAdFailedToLoad");
        zzeaxVar.zzd(java.lang.Integer.valueOf(i));
        zzs(zzeaxVar);
    }

    public final void zzm(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("rewarded", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc("onRewardedAdOpened");
        zzs(zzeaxVar);
    }

    public final void zzn(long j, int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("rewarded", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc("onRewardedAdFailedToShow");
        zzeaxVar.zzd(java.lang.Integer.valueOf(i));
        zzs(zzeaxVar);
    }

    public final void zzo(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("rewarded", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc("onRewardedAdClosed");
        zzs(zzeaxVar);
    }

    public final void zzp(long j, com.google.android.gms.internal.ads.zzccf zzccfVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("rewarded", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc("onUserEarnedReward");
        zzeaxVar.zze(zzccfVar.zze());
        zzeaxVar.zzf(java.lang.Integer.valueOf(zzccfVar.zzf()));
        zzs(zzeaxVar);
    }

    public final void zzq(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("rewarded", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc("onAdImpression");
        zzs(zzeaxVar);
    }

    public final void zzr(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzeax zzeaxVar = new com.google.android.gms.internal.ads.zzeax("rewarded", null);
        zzeaxVar.zzb(java.lang.Long.valueOf(j));
        zzeaxVar.zzc(com.ironsource.Vf.f);
        zzs(zzeaxVar);
    }
}
