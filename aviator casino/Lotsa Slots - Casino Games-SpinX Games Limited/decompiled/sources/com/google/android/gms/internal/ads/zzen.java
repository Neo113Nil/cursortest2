package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzen {
    final /* synthetic */ com.google.android.gms.internal.ads.zzer zza;
    private final java.lang.ref.WeakReference zzb;
    private final java.util.concurrent.Executor zzc;

    public zzen(com.google.android.gms.internal.ads.zzer zzerVar, com.google.android.gms.internal.ads.zzel zzelVar, java.util.concurrent.Executor executor) {
        java.util.Objects.requireNonNull(zzerVar);
        this.zza = zzerVar;
        this.zzb = new java.lang.ref.WeakReference(zzelVar);
        this.zzc = executor;
    }

    public final boolean zza() {
        return this.zzb.get() == null;
    }

    public final void zzb() {
        this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzem
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzen.this.zzc();
            }
        });
    }

    final /* synthetic */ void zzc() {
        com.google.android.gms.internal.ads.zzel zzelVar = (com.google.android.gms.internal.ads.zzel) this.zzb.get();
        if (zzelVar != null) {
            zzelVar.zza(this.zza.zzc());
        }
    }
}
