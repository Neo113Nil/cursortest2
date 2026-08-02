package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class zzdag {
    protected final Map zza = new HashMap();

    public zzdag(Set set) {
        zzp(set);
    }

    public final synchronized void zzk(zzdch zzdchVar) {
        zzo(zzdchVar.zza, zzdchVar.zzb);
    }

    public final synchronized void zzo(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzp(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzk((zzdch) it.next());
        }
    }

    public final synchronized void zzq(final zzdaf zzdafVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdae
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdaf.this.zza(key);
                    } catch (Throwable th) {
                        o.f1952C.f1961g.zzv(th, "EventEmitter.notify");
                        J.l("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
