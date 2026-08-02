package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdView;
import y2.d;
import y2.n;

/* loaded from: classes.dex */
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

    @Override // y2.d
    public final void onAdFailedToLoad(n nVar) {
        String zzl;
        zzdum zzdumVar = this.zzd;
        zzl = zzdum.zzl(nVar);
        zzdumVar.zzm(zzl, this.zzc);
    }

    @Override // y2.d
    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}
