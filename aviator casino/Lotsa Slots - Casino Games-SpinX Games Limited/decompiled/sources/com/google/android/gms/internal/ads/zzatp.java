package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzatp {
    public static final boolean zza = com.google.android.gms.internal.ads.zzatq.zzb;
    private final java.util.List zzb = new java.util.ArrayList();
    private boolean zzc = false;

    zzatp() {
    }

    protected final void finalize() throws java.lang.Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        com.google.android.gms.internal.ads.zzatq.zzc("Marker log finalized without finish() - uncaught exit point for request", new java.lang.Object[0]);
    }

    public final synchronized void zza(java.lang.String str, long j) {
        if (this.zzc) {
            throw new java.lang.IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new com.google.android.gms.internal.ads.zzato(str, j, android.os.SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(java.lang.String str) {
        this.zzc = true;
        java.util.List<com.google.android.gms.internal.ads.zzato> list = this.zzb;
        long j = list.size() == 0 ? 0L : ((com.google.android.gms.internal.ads.zzato) list.get(list.size() - 1)).zzc - ((com.google.android.gms.internal.ads.zzato) list.get(0)).zzc;
        if (j > 0) {
            long j2 = ((com.google.android.gms.internal.ads.zzato) list.get(0)).zzc;
            com.google.android.gms.internal.ads.zzatq.zzb("(%-4d ms) %s", java.lang.Long.valueOf(j), str);
            for (com.google.android.gms.internal.ads.zzato zzatoVar : list) {
                long j3 = zzatoVar.zzc;
                com.google.android.gms.internal.ads.zzatq.zzb("(+%-4d) [%2d] %s", java.lang.Long.valueOf(j3 - j2), java.lang.Long.valueOf(zzatoVar.zzb), zzatoVar.zza);
                j2 = j3;
            }
        }
    }
}
