package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdView;
import p167y2.d;
import p167y2.n;

/* JADX INFO: loaded from: classes.dex */
final class zzduf extends d {
    final /* synthetic */ String zza;
    final /* synthetic */ AdView zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdum zzd;

    public zzduf(zzdum zzdumVar, String str, AdView adView, String str2) {
        this.zza = str;
        this.zzb = adView;
        this.zzc = str2;
        this.zzd = zzdumVar;
    }

    @Override // p167y2.d
    public final void onAdFailedToLoad(n nVar) {
        this.zzd.zzm(zzdum.zzl(nVar), this.zzc);
    }

    @Override // p167y2.d
    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}
