package com.google.android.gms.internal.ads;

import S2.c;
import S2.d;
import p167y2.n;

/* JADX INFO: loaded from: classes.dex */
final class zzduh extends d {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdum zzc;

    public zzduh(zzdum zzdumVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzdumVar;
    }

    @Override // p167y2.e
    public final void onAdFailedToLoad(n nVar) {
        this.zzc.zzm(zzdum.zzl(nVar), this.zzb);
    }

    @Override // p167y2.e
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.zzb;
        this.zzc.zzg(this.zza, (c) obj, str);
    }
}
