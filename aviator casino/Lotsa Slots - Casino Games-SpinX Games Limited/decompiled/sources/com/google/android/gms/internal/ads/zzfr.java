package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfr {
    private final com.google.android.gms.internal.ads.zzfq zza;
    private final com.google.android.gms.internal.ads.zzdz zzb;
    private final com.google.android.gms.internal.ads.zzdz zzc;
    private boolean zzd;
    private boolean zze;

    public zzfr(android.content.Context context, android.os.Looper looper, com.google.android.gms.internal.ads.zzdo zzdoVar) {
        this.zza = new com.google.android.gms.internal.ads.zzfq(context.getApplicationContext());
        this.zzb = zzdoVar.zzd(looper, null);
        this.zzc = zzdoVar.zzd(android.os.Looper.getMainLooper(), null);
    }

    private final void zzg(final boolean z, final boolean z2) {
        if (zzh(z, z2)) {
            this.zzb.zzm(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzfr.this.zze(z, z2);
                }
            });
            return;
        }
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.zzc.zzn(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzfr.this.zzc(atomicBoolean);
            }
        }, 1000L);
        this.zzb.zzm(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzfr.this.zzd(atomicBoolean, z, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzh(boolean z, boolean z2) {
        return z && z2;
    }

    public final void zza(boolean z) {
        if (this.zzd == z) {
            return;
        }
        this.zzd = z;
        zzg(z, this.zze);
    }

    public final void zzb(boolean z) {
        if (this.zze == z) {
            return;
        }
        this.zze = z;
        if (this.zzd) {
            zzg(true, z);
        }
    }

    final /* synthetic */ void zzc(final java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        if (atomicBoolean.get()) {
            final com.google.android.gms.internal.ads.zzfq zzfqVar = this.zza;
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzfq.this.zza(atomicBoolean);
                }
            }, "ExoPlayer:WakeLockManager").start();
        }
    }

    final /* synthetic */ void zzd(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, boolean z, boolean z2) {
        atomicBoolean.set(false);
        this.zza.zzb(z, z2);
    }

    final /* synthetic */ void zze(boolean z, boolean z2) {
        this.zza.zzb(z, z2);
    }
}
