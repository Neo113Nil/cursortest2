package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzf implements zzt {
    private final Map<String, List<zzr<?>>> zzp = new HashMap();
    private final zzd zzq;

    zzf(zzd zzdVar) {
        this.zzq = zzdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzb(zzr<?> zzrVar) {
        String url = zzrVar.getUrl();
        if (!this.zzp.containsKey(url)) {
            this.zzp.put(url, null);
            zzrVar.zza((zzt) this);
            if (zzaf.DEBUG) {
                zzaf.d("new request, sending to network %s", url);
            }
            return false;
        }
        List<zzr<?>> list = this.zzp.get(url);
        if (list == null) {
            list = new ArrayList<>();
        }
        zzrVar.zzb("waiting-for-response");
        list.add(zzrVar);
        this.zzp.put(url, list);
        if (zzaf.DEBUG) {
            zzaf.d("Request for cacheKey=%s is in flight, putting on hold.", url);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final synchronized void zza(zzr<?> zzrVar) {
        String url = zzrVar.getUrl();
        List<zzr<?>> remove = this.zzp.remove(url);
        if (remove != null && !remove.isEmpty()) {
            if (zzaf.DEBUG) {
                zzaf.v("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), url);
            }
            zzr<?> remove2 = remove.remove(0);
            this.zzp.put(url, remove);
            remove2.zza((zzt) this);
            try {
                this.zzq.zzi.put(remove2);
            } catch (InterruptedException e) {
                zzaf.e("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.zzq.quit();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final void zza(zzr<?> zzrVar, zzx<?> zzxVar) {
        List<zzr<?>> remove;
        if (zzxVar.zzbg == null || zzxVar.zzbg.zzb()) {
            zza(zzrVar);
            return;
        }
        String url = zzrVar.getUrl();
        synchronized (this) {
            remove = this.zzp.remove(url);
        }
        if (remove != null) {
            if (zzaf.DEBUG) {
                zzaf.v("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), url);
            }
            Iterator<zzr<?>> it = remove.iterator();
            while (it.hasNext()) {
                this.zzq.zzk.zzb(it.next(), zzxVar);
            }
        }
    }
}
