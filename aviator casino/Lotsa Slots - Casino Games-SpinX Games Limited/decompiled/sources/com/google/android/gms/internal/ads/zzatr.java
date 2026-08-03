package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzatr implements com.google.android.gms.internal.ads.zzatd {
    private final java.util.Map zza = new java.util.HashMap();
    private final com.google.android.gms.internal.ads.zzasq zzb;
    private final java.util.concurrent.BlockingQueue zzc;
    private final com.google.android.gms.internal.ads.zzasv zzd;

    zzatr(com.google.android.gms.internal.ads.zzasq zzasqVar, java.util.concurrent.BlockingQueue blockingQueue, com.google.android.gms.internal.ads.zzasv zzasvVar) {
        this.zzd = zzasvVar;
        this.zzb = zzasqVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzatd
    public final void zza(com.google.android.gms.internal.ads.zzate zzateVar, com.google.android.gms.internal.ads.zzatk zzatkVar) {
        java.util.List list;
        com.google.android.gms.internal.ads.zzasn zzasnVar = zzatkVar.zzb;
        if (zzasnVar == null || zzasnVar.zza(java.lang.System.currentTimeMillis())) {
            zzb(zzateVar);
            return;
        }
        java.lang.String zzi = zzateVar.zzi();
        synchronized (this) {
            list = (java.util.List) this.zza.remove(zzi);
        }
        if (list != null) {
            if (com.google.android.gms.internal.ads.zzatq.zzb) {
                com.google.android.gms.internal.ads.zzatq.zza("Releasing %d waiting requests for cacheKey=%s.", java.lang.Integer.valueOf(list.size()), zzi);
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zza((com.google.android.gms.internal.ads.zzate) it.next(), zzatkVar, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatd
    public final synchronized void zzb(com.google.android.gms.internal.ads.zzate zzateVar) {
        java.util.Map map = this.zza;
        java.lang.String zzi = zzateVar.zzi();
        java.util.List list = (java.util.List) map.remove(zzi);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (com.google.android.gms.internal.ads.zzatq.zzb) {
            com.google.android.gms.internal.ads.zzatq.zza("%d waiting requests for cacheKey=%s; resend to network", java.lang.Integer.valueOf(list.size()), zzi);
        }
        com.google.android.gms.internal.ads.zzate zzateVar2 = (com.google.android.gms.internal.ads.zzate) list.remove(0);
        map.put(zzi, list);
        zzateVar2.zzu(this);
        try {
            this.zzc.put(zzateVar2);
        } catch (java.lang.InterruptedException e) {
            com.google.android.gms.internal.ads.zzatq.zzc("Couldn't add request to queue. %s", e.toString());
            java.lang.Thread.currentThread().interrupt();
            this.zzb.zza();
        }
    }

    final synchronized boolean zzc(com.google.android.gms.internal.ads.zzate zzateVar) {
        java.util.Map map = this.zza;
        java.lang.String zzi = zzateVar.zzi();
        if (!map.containsKey(zzi)) {
            map.put(zzi, null);
            zzateVar.zzu(this);
            if (com.google.android.gms.internal.ads.zzatq.zzb) {
                com.google.android.gms.internal.ads.zzatq.zzb("new request, sending to network %s", zzi);
            }
            return false;
        }
        java.util.List list = (java.util.List) map.get(zzi);
        if (list == null) {
            list = new java.util.ArrayList();
        }
        zzateVar.zzc("waiting-for-response");
        list.add(zzateVar);
        map.put(zzi, list);
        if (com.google.android.gms.internal.ads.zzatq.zzb) {
            com.google.android.gms.internal.ads.zzatq.zzb("Request for cacheKey=%s is in flight, putting on hold.", zzi);
        }
        return true;
    }
}
