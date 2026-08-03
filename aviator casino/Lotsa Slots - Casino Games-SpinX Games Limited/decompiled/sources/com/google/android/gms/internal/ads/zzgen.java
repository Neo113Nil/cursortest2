package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgen implements com.google.android.gms.internal.ads.zzgel {
    private final java.util.concurrent.Executor zza;
    private final java.util.Queue zzb = new java.util.PriorityQueue();

    public zzgen(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzgcn zzgcnVar) {
        this.zza = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final void zza(java.lang.Runnable runnable, long j) {
        if (j <= 0) {
            this.zza.execute(runnable);
            return;
        }
        com.google.android.gms.internal.ads.zzgep zzgepVar = new com.google.android.gms.internal.ads.zzgep(runnable, java.lang.System.currentTimeMillis() + j);
        java.util.Queue queue = this.zzb;
        synchronized (queue) {
            queue.add(zzgepVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final void zzb() {
        java.util.Queue queue = this.zzb;
        synchronized (queue) {
            if (queue.isEmpty()) {
                return;
            }
            java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            for (com.google.android.gms.internal.ads.zzgep zzgepVar = (com.google.android.gms.internal.ads.zzgep) queue.peek(); zzgepVar != null && zzgepVar.zzb <= currentTimeMillis; zzgepVar = (com.google.android.gms.internal.ads.zzgep) queue.peek()) {
                priorityQueue.add(zzgepVar);
            }
            java.util.Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                try {
                    this.zza.execute(((com.google.android.gms.internal.ads.zzgep) it.next()).zza);
                } catch (java.lang.RuntimeException unused) {
                }
            }
        }
    }
}
