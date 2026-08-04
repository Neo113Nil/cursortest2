package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class zzcrx implements zzdad, zzcwe {
    private final p090m3.a zza;
    private final zzcrz zzb;
    private final zzfba zzc;
    private final String zzd;

    public zzcrx(p090m3.a aVar, zzcrz zzcrzVar, zzfba zzfbaVar, String str) {
        this.zza = aVar;
        this.zzb = zzcrzVar;
        this.zzc = zzfbaVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdad
    public final void zza() {
        p090m3.a aVar = this.zza;
        zzcrz zzcrzVar = this.zzb;
        String str = this.zzd;
        ((p090m3.b) aVar).getClass();
        zzcrzVar.zze(str, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final void zzs() {
        p090m3.a aVar = this.zza;
        String str = this.zzd;
        ((p090m3.b) aVar).getClass();
        this.zzb.zzd(this.zzc.zzf, str, SystemClock.elapsedRealtime());
    }
}
