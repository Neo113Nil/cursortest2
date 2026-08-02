package com.google.android.gms.internal.ads;

import java.util.Queue;

/* loaded from: classes.dex */
final class zzzu {
    final /* synthetic */ zzzw zza;
    private zzz zzb;

    public /* synthetic */ zzzu(zzzw zzzwVar, zzzv zzzvVar) {
        this.zza = zzzwVar;
    }

    public final void zza(zzcc zzccVar) {
        zzx zzxVar = new zzx();
        zzxVar.zzai(zzccVar.zzb);
        zzxVar.zzM(zzccVar.zzc);
        zzxVar.zzad("video/raw");
        this.zzb = zzxVar.zzaj();
    }

    public final void zzb(long j, long j3, boolean z4) {
        zzaar zzaarVar;
        zzcz zzczVar;
        Queue queue;
        zzz zzzVar = this.zzb;
        if (zzzVar == null) {
            zzzVar = new zzx().zzaj();
        }
        zzz zzzVar2 = zzzVar;
        zzzw zzzwVar = this.zza;
        zzaarVar = zzzwVar.zzg;
        zzczVar = zzzwVar.zzb;
        zzaarVar.zza(j3, zzczVar.zzc(), zzzVar2, null);
        queue = this.zza.zzd;
        ((zzabm) queue.remove()).zza(j);
    }
}
