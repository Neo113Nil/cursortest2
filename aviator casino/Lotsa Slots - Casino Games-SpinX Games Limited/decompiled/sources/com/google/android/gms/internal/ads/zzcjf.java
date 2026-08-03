package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcjf {
    private final java.util.ArrayList zza = new java.util.ArrayList();
    private long zzb;

    zzcjf() {
    }

    final long zza() {
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            for (java.util.Map.Entry entry : ((com.google.android.gms.internal.ads.zzia) it.next()).zzj().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((java.lang.String) entry.getKey())) {
                        this.zzb = java.lang.Math.max(this.zzb, java.lang.Long.parseLong((java.lang.String) ((java.util.List) entry.getValue()).get(0)));
                    }
                } catch (java.lang.RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.zzb;
    }

    final void zzb(com.google.android.gms.internal.ads.zzia zziaVar) {
        this.zza.add(zziaVar);
    }
}
