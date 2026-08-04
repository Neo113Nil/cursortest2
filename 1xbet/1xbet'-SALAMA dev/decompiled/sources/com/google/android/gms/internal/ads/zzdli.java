package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzdli extends zzbfx {
    private final String zza;
    private final zzdgx zzb;
    private final zzdhc zzc;

    public zzdli(String str, zzdgx zzdgxVar, zzdhc zzdhcVar) {
        this.zza = str;
        this.zzb = zzdgxVar;
        this.zzc = zzdhcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final double zzb() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final Bundle zzc() {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final I0 zzd() {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final zzbfc zze() {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final zzbfj zzf() {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final p105o3.a zzg() {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final p105o3.a zzh() {
        return new p105o3.b(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final String zzi() {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final String zzj() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final String zzk() {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final String zzl() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final String zzm() {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final String zzn() {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final List zzo() {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final void zzp() {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final void zzq(Bundle bundle) {
        this.zzb.zzG(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final void zzr(Bundle bundle) {
        this.zzb.zzM(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final boolean zzs(Bundle bundle) {
        return this.zzb.zzZ(bundle);
    }
}
