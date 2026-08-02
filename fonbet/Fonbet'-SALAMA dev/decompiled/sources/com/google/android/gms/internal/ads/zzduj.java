package com.google.android.gms.internal.ads;

import y2.d;
import y2.n;

/* loaded from: classes.dex */
final class zzduj extends d {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdum zzb;

    public zzduj(zzdum zzdumVar, String str) {
        this.zza = str;
        this.zzb = zzdumVar;
    }

    @Override // y2.d
    public final void onAdFailedToLoad(n nVar) {
        String zzl;
        zzdum zzdumVar = this.zzb;
        zzl = zzdum.zzl(nVar);
        zzdumVar.zzm(zzl, this.zza);
    }
}
