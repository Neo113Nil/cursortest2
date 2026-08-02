package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class zzir implements Runnable {
    private final /* synthetic */ zzag zza;
    private final /* synthetic */ zzig zzb;

    zzir(zzig zzigVar, zzag zzagVar) {
        this.zza = zzagVar;
        this.zzb = zzigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzou zzouVar;
        zzou zzouVar2;
        zzou zzouVar3;
        zzouVar = this.zzb.zza;
        zzouVar.zzs();
        Object zza = this.zza.zzc.zza();
        zzig zzigVar = this.zzb;
        if (zza == null) {
            zzouVar3 = zzigVar.zza;
            zzouVar3.zza(this.zza);
        } else {
            zzouVar2 = zzigVar.zza;
            zzouVar2.zzb(this.zza);
        }
    }
}
