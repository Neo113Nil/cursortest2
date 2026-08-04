package com.google.android.gms.internal.ads;

import p167y2.d;
import p167y2.n;

/* JADX INFO: loaded from: classes.dex */
final class zzduj extends d {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdum zzb;

    public zzduj(zzdum zzdumVar, String str) {
        this.zza = str;
        this.zzb = zzdumVar;
    }

    @Override // p167y2.d
    public final void onAdFailedToLoad(n nVar) {
        this.zzb.zzm(zzdum.zzl(nVar), this.zza);
    }
}
