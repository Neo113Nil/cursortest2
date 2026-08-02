package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class zzba implements Runnable {
    private final /* synthetic */ zzjh zza;
    private final /* synthetic */ zzbb zzb;

    zzba(zzbb zzbbVar, zzjh zzjhVar) {
        this.zza = zzjhVar;
        this.zzb = zzbbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
        if (zzaf.zza()) {
            this.zza.zzl().zzb(this);
            return;
        }
        boolean zzc = this.zzb.zzc();
        this.zzb.zzd = 0L;
        if (zzc) {
            this.zzb.zzb();
        }
    }
}
