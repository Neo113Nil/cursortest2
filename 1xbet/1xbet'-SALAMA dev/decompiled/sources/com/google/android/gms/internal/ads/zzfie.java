package com.google.android.gms.internal.ads;

import J2.j;

/* JADX INFO: loaded from: classes.dex */
final class zzfie extends zzazs {
    final /* synthetic */ zzgbw zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfq zzb;
    final /* synthetic */ zzfif zzc;

    public zzfie(zzfif zzfifVar, zzgbw zzgbwVar, com.google.android.gms.ads.internal.client.zzfq zzfqVar) {
        this.zza = zzgbwVar;
        this.zzb = zzfqVar;
        this.zzc = zzfifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzb(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        j.g("Failed to load app open ad with error parcel: " + zzeVar.k().toString() + " for ad unit: " + this.zzb.f10729a);
        this.zzc.zzC(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzd(zzazq zzazqVar) {
        zzfid.zza(zzazqVar, this.zza);
    }
}
