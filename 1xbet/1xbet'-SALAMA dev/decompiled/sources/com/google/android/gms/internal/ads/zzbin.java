package com.google.android.gms.internal.ads;

import E2.o;
import I2.A;

/* JADX INFO: loaded from: classes.dex */
final class zzbin implements zzgay {
    final /* synthetic */ zzceb zza;

    public zzbin(zzceb zzcebVar) {
        this.zza = zzcebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        o.f1952C.f1961g.zzw(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        J2.o oVar = this.zza.zzD() != null ? this.zza.zzD().zzax : null;
        zzceb zzcebVar = this.zza;
        new A(zzcebVar.getContext(), zzcebVar.zzm().f10834a, str, oVar).zzb();
    }
}
