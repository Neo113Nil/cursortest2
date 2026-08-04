package com.google.android.gms.internal.ads;

import F2.E;
import F2.InterfaceC0266z;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzeih extends E {
    private final zzejo zza;

    public zzeih(Context context, zzcgb zzcgbVar, zzfay zzfayVar, zzdhn zzdhnVar, InterfaceC0266z interfaceC0266z) {
        zzejq zzejqVar = new zzejq(zzdhnVar, zzcgbVar.zzi());
        zzejqVar.zze(interfaceC0266z);
        this.zza = new zzejo(new zzeka(zzcgbVar, context, zzejqVar, zzfayVar), zzfayVar.zzL());
    }

    @Override // F2.F
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // F2.F
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // F2.F
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza.zzd(zzmVar, 1);
    }

    @Override // F2.F
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzm zzmVar, int i7) {
        this.zza.zzd(zzmVar, i7);
    }

    @Override // F2.F
    public final synchronized boolean zzi() {
        return this.zza.zze();
    }
}
