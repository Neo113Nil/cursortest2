package com.google.android.gms.internal.ads;

import y2.n;

/* loaded from: classes.dex */
final class zzdui extends T2.b {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdum zzc;

    public zzdui(zzdum zzdumVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzdumVar;
    }

    @Override // y2.e
    public final void onAdFailedToLoad(n nVar) {
        String zzl;
        zzdum zzdumVar = this.zzc;
        zzl = zzdum.zzl(nVar);
        zzdumVar.zzm(zzl, this.zzb);
    }

    @Override // y2.e
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.zzb;
        this.zzc.zzg(this.zza, (T2.a) obj, str);
    }
}
