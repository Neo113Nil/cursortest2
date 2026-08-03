package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzjx implements java.lang.Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zzb;

    zzjx(com.google.android.gms.measurement.internal.zzli zzliVar, boolean z) {
        this.zza = z;
        java.util.Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzli zzliVar = this.zzb;
        com.google.android.gms.measurement.internal.zzib zzibVar = zzliVar.zzu;
        boolean zzB = zzibVar.zzB();
        boolean zzA = zzibVar.zzA();
        boolean z = this.zza;
        zzibVar.zzz(z);
        if (zzA == z) {
            zzibVar.zzaV().zzk().zzb("Default data collection state already set to", java.lang.Boolean.valueOf(z));
        }
        if (zzibVar.zzB() == zzB || zzibVar.zzB() != zzibVar.zzA()) {
            zzibVar.zzaV().zzh().zzc("Default data collection is different than actual status", java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(zzB));
        }
        zzliVar.zzak();
    }
}
