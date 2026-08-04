package com.google.android.gms.internal.ads;

import F2.B;
import F2.M;
import J2.j;

/* JADX INFO: loaded from: classes.dex */
final class zzfih extends B {
    final /* synthetic */ zzgbw zza;
    final /* synthetic */ M zzb;
    final /* synthetic */ zzfii zzc;

    public zzfih(zzfii zzfiiVar, zzgbw zzgbwVar, M m7) {
        this.zza = zzgbwVar;
        this.zzb = m7;
        this.zzc = zzfiiVar;
    }

    @Override // F2.C
    public final void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        j.g("Failed to load interstitial ad with error: " + zzeVar.k().toString() + " for ad unit: " + this.zzc.zze.f10729a);
        this.zzc.zzC(zzeVar);
    }

    @Override // F2.C
    public final void zzc() {
        zzfid.zza(this.zzb, this.zza);
    }
}
