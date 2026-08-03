package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzdip {
    protected final java.util.Map zza = new java.util.HashMap();

    protected zzdip(java.util.Set set) {
        zzr(set);
    }

    public final synchronized void zzp(com.google.android.gms.internal.ads.zzdkq zzdkqVar) {
        zzq(zzdkqVar.zza, zzdkqVar.zzb);
    }

    public final synchronized void zzq(java.lang.Object obj, java.util.concurrent.Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzr(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            zzp((com.google.android.gms.internal.ads.zzdkq) it.next());
        }
    }

    protected final synchronized void zzs(final com.google.android.gms.internal.ads.zzdio zzdioVar) {
        for (java.util.Map.Entry entry : this.zza.entrySet()) {
            final java.lang.Object key = entry.getKey();
            ((java.util.concurrent.Executor) entry.getValue()).execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdin
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    try {
                        com.google.android.gms.internal.ads.zzdio.this.zza(key);
                    } catch (java.lang.Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
