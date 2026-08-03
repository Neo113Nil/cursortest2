package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfoo implements com.google.android.gms.internal.ads.zzbfk {
    private final java.util.concurrent.ScheduledExecutorService zza;
    private final java.util.concurrent.Executor zzb;
    private final java.util.Map zzc = new java.util.HashMap();
    private boolean zzd = false;

    zzfoo(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.Executor executor) {
        this.zza = scheduledExecutorService;
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        java.util.Map map = this.zzc;
        java.util.ArrayList arrayList = new java.util.ArrayList(map.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            java.util.concurrent.ScheduledFuture scheduledFuture = (java.util.concurrent.ScheduledFuture) arrayList.get(i);
            com.google.android.gms.internal.ads.zzfon zzfonVar = (com.google.android.gms.internal.ads.zzfon) map.get(scheduledFuture);
            if (zzfonVar != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                scheduledFuture.cancel(false);
                map.remove(scheduledFuture);
                zzb(zzfonVar.zza, java.lang.Math.max(0L, zzfonVar.zzb - com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()), java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zza(boolean z) {
        if (z) {
            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfom
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzfoo.this.zzc();
                }
            });
        }
    }

    public final synchronized void zzb(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        if (!this.zzd) {
            com.google.android.gms.ads.internal.zzt.zzg().zzb(this);
            this.zzd = true;
        }
        final com.google.android.gms.internal.ads.zzfon zzfonVar = new com.google.android.gms.internal.ads.zzfon(this, runnable, com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + timeUnit.toMillis(j));
        zzfonVar.zzc = this.zza.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfol
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzfon zzfonVar2;
                com.google.android.gms.internal.ads.zzfon zzfonVar3 = com.google.android.gms.internal.ads.zzfon.this;
                com.google.android.gms.internal.ads.zzfoo zzfooVar = zzfonVar3.zzd;
                synchronized (zzfooVar) {
                    java.util.concurrent.ScheduledFuture scheduledFuture = zzfonVar3.zzc;
                    zzfonVar2 = scheduledFuture != null ? (com.google.android.gms.internal.ads.zzfon) zzfooVar.zze().remove(scheduledFuture) : null;
                }
                if (zzfonVar2 != null) {
                    zzfonVar3.zzd.zzd().execute(zzfonVar3.zza);
                }
            }
        }, j, timeUnit);
        this.zzc.put(zzfonVar.zzc, zzfonVar);
    }

    final /* synthetic */ java.util.concurrent.Executor zzd() {
        return this.zzb;
    }

    final /* synthetic */ java.util.Map zze() {
        return this.zzc;
    }
}
