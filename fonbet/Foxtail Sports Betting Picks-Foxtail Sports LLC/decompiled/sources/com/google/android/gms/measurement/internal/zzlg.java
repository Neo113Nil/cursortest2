package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class zzlg implements Runnable {
    private final /* synthetic */ zzbd zza;
    private final /* synthetic */ zzju zzb;

    zzlg(zzju zzjuVar, zzbd zzbdVar) {
        this.zza = zzbdVar;
        this.zzb = zzjuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zza = this.zzb.zzk().zza(this.zza);
        zzju zzjuVar = this.zzb;
        if (!zza) {
            zzjuVar.zzj().zzp().zza("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.zza.zza()));
            return;
        }
        zzjuVar.zzj().zzq().zza("Setting DMA consent(FE)", this.zza);
        boolean zzao = this.zzb.zzq().zzao();
        zzju zzjuVar2 = this.zzb;
        if (zzao) {
            zzjuVar2.zzq().zzaj();
        } else {
            zzjuVar2.zzq().zza(false);
        }
    }
}
