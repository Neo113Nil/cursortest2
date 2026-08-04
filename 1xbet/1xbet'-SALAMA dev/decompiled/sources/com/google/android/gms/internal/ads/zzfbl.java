package com.google.android.gms.internal.ads;

import E2.o;

/* JADX INFO: loaded from: classes.dex */
final class zzfbl implements zzgay {
    final /* synthetic */ zzfbm zza;
    final /* synthetic */ int zzb;

    public zzfbl(zzfbm zzfbmVar, int i7) {
        this.zzb = i7;
        this.zza = zzfbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        o.f1952C.f1961g.zzw(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i7 = this.zzb;
        this.zza.zzb((String) obj, i7);
    }
}
