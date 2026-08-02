package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
public final class zzcrx implements zzdad, zzcwe {
    private final InterfaceC1436a zza;
    private final zzcrz zzb;
    private final zzfba zzc;
    private final String zzd;

    public zzcrx(InterfaceC1436a interfaceC1436a, zzcrz zzcrzVar, zzfba zzfbaVar, String str) {
        this.zza = interfaceC1436a;
        this.zzb = zzcrzVar;
        this.zzc = zzfbaVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdad
    public final void zza() {
        InterfaceC1436a interfaceC1436a = this.zza;
        zzcrz zzcrzVar = this.zzb;
        String str = this.zzd;
        ((m3.b) interfaceC1436a).getClass();
        zzcrzVar.zze(str, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final void zzs() {
        InterfaceC1436a interfaceC1436a = this.zza;
        String str = this.zzd;
        ((m3.b) interfaceC1436a).getClass();
        this.zzb.zzd(this.zzc.zzf, str, SystemClock.elapsedRealtime());
    }
}
