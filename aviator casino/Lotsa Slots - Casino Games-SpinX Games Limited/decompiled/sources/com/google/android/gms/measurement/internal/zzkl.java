package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzkl implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zzb;

    zzkl(com.google.android.gms.measurement.internal.zzli zzliVar, com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        this.zza = zzcuVar;
        java.util.Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        java.lang.Long valueOf;
        com.google.android.gms.measurement.internal.zzli zzliVar = this.zzb;
        com.google.android.gms.measurement.internal.zzib zzibVar = zzliVar.zzu.zzh().zzu;
        if (!zzibVar.zzd().zzl().zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
            zzibVar.zzaV().zzh().zza("Analytics storage consent denied; will not get session id");
        } else if (!zzibVar.zzd().zzp(zzibVar.zzaZ().currentTimeMillis()) && zzibVar.zzd().zzl.zza() != 0) {
            valueOf = java.lang.Long.valueOf(zzibVar.zzd().zzl.zza());
            if (valueOf == null) {
                zzliVar.zzu.zzk().zzam(this.zza, valueOf.longValue());
                return;
            } else {
                try {
                    this.zza.zzb(null);
                    return;
                } catch (android.os.RemoteException e) {
                    this.zzb.zzu.zzaV().zzb().zzb("getSessionId failed with exception", e);
                    return;
                }
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }
}
