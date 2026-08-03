package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgpc {
    private final java.util.Set zza;
    private final com.google.android.gms.internal.ads.zzgpt zzb;

    zzgpc(com.google.android.gms.internal.ads.zzgpt zzgptVar, java.util.Set set) {
        this.zza = set;
        this.zzb = zzgptVar;
    }

    public final void zza(java.util.List list) {
        this.zzb.zza(list);
    }

    public final java.util.Map zzb() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzgpe) it.next()).zzb(hashMap);
        }
        return hashMap;
    }

    public final java.util.Map zzc(android.content.Context context, android.view.View view) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzgpe) it.next()).zzc(hashMap, context, view);
        }
        return hashMap;
    }

    public final java.util.Map zzd() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzgpe) it.next()).zzd(hashMap);
        }
        return hashMap;
    }
}
