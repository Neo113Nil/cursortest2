package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
final class zzapo implements zzapa {
    private final Map zza = new HashMap();
    private final zzaon zzb;
    private final BlockingQueue zzc;
    private final zzaos zzd;

    public zzapo(zzaon zzaonVar, BlockingQueue blockingQueue, zzaos zzaosVar) {
        this.zzd = zzaosVar;
        this.zzb = zzaonVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final synchronized void zza(zzapb zzapbVar) {
        try {
            Map map = this.zza;
            String strZzj = zzapbVar.zzj();
            List list = (List) map.remove(strZzj);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (zzapn.zzb) {
                zzapn.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzj);
            }
            zzapb zzapbVar2 = (zzapb) list.remove(0);
            this.zza.put(strZzj, list);
            zzapbVar2.zzu(this);
            try {
                this.zzc.put(zzapbVar2);
            } catch (InterruptedException e7) {
                zzapn.zzb("Couldn't add request to queue. %s", e7.toString());
                Thread.currentThread().interrupt();
                this.zzb.zzb();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zzb(zzapb zzapbVar, zzaph zzaphVar) {
        List list;
        zzaok zzaokVar = zzaphVar.zzb;
        if (zzaokVar == null || zzaokVar.zza(System.currentTimeMillis())) {
            zza(zzapbVar);
            return;
        }
        String strZzj = zzapbVar.zzj();
        synchronized (this) {
            list = (List) this.zza.remove(strZzj);
        }
        if (list != null) {
            if (zzapn.zzb) {
                zzapn.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzj);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zzb((zzapb) it.next(), zzaphVar, null);
            }
        }
    }

    public final synchronized boolean zzc(zzapb zzapbVar) {
        try {
            Map map = this.zza;
            String strZzj = zzapbVar.zzj();
            if (!map.containsKey(strZzj)) {
                this.zza.put(strZzj, null);
                zzapbVar.zzu(this);
                if (zzapn.zzb) {
                    zzapn.zza("new request, sending to network %s", strZzj);
                }
                return false;
            }
            List arrayList = (List) this.zza.get(strZzj);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            zzapbVar.zzm("waiting-for-response");
            arrayList.add(zzapbVar);
            this.zza.put(strZzj, arrayList);
            if (zzapn.zzb) {
                zzapn.zza("Request for cacheKey=%s is in flight, putting on hold.", strZzj);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
