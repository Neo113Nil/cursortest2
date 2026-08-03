package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfvd implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfve zza;

    zzfvd(com.google.android.gms.internal.ads.zzfve zzfveVar) {
        java.util.Objects.requireNonNull(zzfveVar);
        this.zza = zzfveVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzfve zzfveVar = this.zza;
        java.util.concurrent.atomic.AtomicBoolean zzf = zzfveVar.zzf();
        float zzc = zzfveVar.zzc();
        zzf.set(false);
        if (((java.lang.Float) zzfveVar.zze().getAndSet(java.lang.Float.valueOf(zzc))).floatValue() != zzc) {
            zzfveVar.zzd().post(new com.google.android.gms.internal.ads.zzfvc(this, zzc));
        }
    }
}
