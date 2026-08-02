package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class zzis implements Runnable {
    private final /* synthetic */ zzag zza;
    private final /* synthetic */ zzp zzb;
    private final /* synthetic */ zzig zzc;

    zzis(zzig zzigVar, zzag zzagVar, zzp zzpVar) {
        this.zza = zzagVar;
        this.zzb = zzpVar;
        this.zzc = zzigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzou zzouVar;
        zzou zzouVar2;
        zzou zzouVar3;
        zzouVar = this.zzc.zza;
        zzouVar.zzs();
        Object zza = this.zza.zzc.zza();
        zzig zzigVar = this.zzc;
        if (zza == null) {
            zzouVar3 = zzigVar.zza;
            zzouVar3.zza(this.zza, this.zzb);
        } else {
            zzouVar2 = zzigVar.zza;
            zzouVar2.zzb(this.zza, this.zzb);
        }
    }
}
