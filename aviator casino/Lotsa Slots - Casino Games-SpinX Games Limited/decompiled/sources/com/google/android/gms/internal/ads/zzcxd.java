package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcxd implements com.google.android.gms.internal.ads.zzbeq {
    private final com.google.android.gms.internal.ads.zzcku zza;
    private final java.util.concurrent.Executor zzb;
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference();

    zzcxd(com.google.android.gms.internal.ads.zzcku zzckuVar, java.util.concurrent.Executor executor) {
        this.zza = zzckuVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final synchronized void zzdj(com.google.android.gms.internal.ads.zzbep zzbepVar) {
        final com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoc)).booleanValue()) {
                if (zzbepVar.zzj) {
                    if (!java.lang.Boolean.TRUE.equals(this.zzc.getAndSet(true))) {
                        java.util.concurrent.Executor executor = this.zzb;
                        java.util.Objects.requireNonNull(zzckuVar);
                        executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcxc
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                com.google.android.gms.internal.ads.zzcku.this.onResume();
                            }
                        });
                    }
                } else {
                    if (!java.lang.Boolean.FALSE.equals(this.zzc.getAndSet(false))) {
                        java.util.concurrent.Executor executor2 = this.zzb;
                        java.util.Objects.requireNonNull(zzckuVar);
                        executor2.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcxb
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                com.google.android.gms.internal.ads.zzcku.this.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
