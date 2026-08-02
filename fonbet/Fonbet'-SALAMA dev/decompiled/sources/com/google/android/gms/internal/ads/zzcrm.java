package com.google.android.gms.internal.ads;

import F2.InterfaceC0217a;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzbbd;
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
public final class zzcrm implements zzcwe, InterfaceC0217a, zzcxn, zzcvk, zzcuq, zzczz {
    private final InterfaceC1436a zza;
    private final zzbyj zzb;

    public zzcrm(InterfaceC1436a interfaceC1436a, zzbyj zzbyjVar) {
        this.zza = interfaceC1436a;
        this.zzb = zzbyjVar;
    }

    @Override // F2.InterfaceC0217a
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdl(zzbuo zzbuoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdm(zzfar zzfarVar) {
        InterfaceC1436a interfaceC1436a = this.zza;
        zzbyj zzbyjVar = this.zzb;
        ((m3.b) interfaceC1436a).getClass();
        zzbyjVar.zzk(SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzdq(zzbva zzbvaVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzf() {
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void zzi(zzbbd.zzb zzbVar) {
        this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void zzj(zzbbd.zzb zzbVar) {
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzj(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void zzl(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void zzm(zzbbd.zzb zzbVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void zzn(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzr() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final void zzs() {
        this.zzb.zzh(true);
    }
}
