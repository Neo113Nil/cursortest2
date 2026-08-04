package com.google.android.gms.internal.ads;

import E2.o;
import F2.InterfaceC0217a;
import I2.J;
import android.content.Context;
import android.os.SystemClock;
import java.util.Collections;
import java.util.List;
import p172z2.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzdrp implements e, zzcxn, InterfaceC0217a, zzcuq, zzcvk, zzcvl, zzcwe, zzcut, zzfff {
    private final List zza;
    private final zzdrd zzb;
    private long zzc;

    public zzdrp(zzdrd zzdrdVar, zzcgb zzcgbVar) {
        this.zzb = zzdrdVar;
        this.zza = Collections.singletonList(zzcgbVar);
    }

    private final void zzg(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // F2.InterfaceC0217a
    public final void onAdClicked() {
        zzg(InterfaceC0217a.class, "onAdClicked", new Object[0]);
    }

    @Override // p172z2.e
    public final void onAppEvent(String str, String str2) {
        zzg(e.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zza() {
        zzg(zzcuq.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzb() {
        zzg(zzcuq.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzc() {
        zzg(zzcuq.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzd(zzfey zzfeyVar, String str) {
        zzg(zzfex.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzdA(zzfey zzfeyVar, String str) {
        zzg(zzfex.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzdB(zzfey zzfeyVar, String str, Throwable th) {
        zzg(zzfex.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzdC(zzfey zzfeyVar, String str) {
        zzg(zzfex.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zzdh(Context context) {
        zzg(zzcvl.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zzdj(Context context) {
        zzg(zzcvl.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zzdk(Context context) {
        zzg(zzcvl.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdl(zzbuo zzbuoVar) {
        o.f1952C.j.getClass();
        this.zzc = SystemClock.elapsedRealtime();
        zzg(zzcxn.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdm(zzfar zzfarVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzdq(zzbva zzbvaVar, String str, String str2) {
        zzg(zzcuq.class, "onRewarded", zzbvaVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcut
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzg(zzcut.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.f10720a), zzeVar.f10721b, zzeVar.f10722c);
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zze() {
        zzg(zzcuq.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzf() {
        zzg(zzcuq.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzr() {
        zzg(zzcvk.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final void zzs() {
        o.f1952C.j.getClass();
        J.k("Ad Request Latency : " + (SystemClock.elapsedRealtime() - this.zzc));
        zzg(zzcwe.class, "onAdLoaded", new Object[0]);
    }
}
