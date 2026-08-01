package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzauf implements zzatr {
    private final Map zza = new HashMap();
    private final zzate zzb;
    private final BlockingQueue zzc;
    private final zzatj zzd;

    zzauf(zzate zzateVar, BlockingQueue blockingQueue, zzatj zzatjVar) {
        this.zzd = zzatjVar;
        this.zzb = zzateVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final void zza(zzats zzatsVar, zzaty zzatyVar) {
        List list;
        zzatb zzatbVar = zzatyVar.zzb;
        if (zzatbVar == null || zzatbVar.zza(System.currentTimeMillis())) {
            zzb(zzatsVar);
            return;
        }
        String zzi = zzatsVar.zzi();
        synchronized (this) {
            list = (List) this.zza.remove(zzi);
        }
        if (list != null) {
            if (zzaue.zzb) {
                zzaue.zza("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzi);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zza((zzats) it.next(), zzatyVar, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final synchronized void zzb(zzats zzatsVar) {
        Map map = this.zza;
        String zzi = zzatsVar.zzi();
        List list = (List) map.remove(zzi);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (zzaue.zzb) {
            zzaue.zza("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzi);
        }
        zzats zzatsVar2 = (zzats) list.remove(0);
        map.put(zzi, list);
        zzatsVar2.zzu(this);
        try {
            this.zzc.put(zzatsVar2);
        } catch (InterruptedException e) {
            zzaue.zzc("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.zzb.zza();
        }
    }

    final synchronized boolean zzc(zzats zzatsVar) {
        Map map = this.zza;
        String zzi = zzatsVar.zzi();
        if (!map.containsKey(zzi)) {
            map.put(zzi, null);
            zzatsVar.zzu(this);
            if (zzaue.zzb) {
                zzaue.zzb("new request, sending to network %s", zzi);
            }
            return false;
        }
        List list = (List) map.get(zzi);
        if (list == null) {
            list = new ArrayList();
        }
        zzatsVar.zzc("waiting-for-response");
        list.add(zzatsVar);
        map.put(zzi, list);
        if (zzaue.zzb) {
            zzaue.zzb("Request for cacheKey=%s is in flight, putting on hold.", zzi);
        }
        return true;
    }
}
