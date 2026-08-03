package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeuz implements com.google.android.gms.internal.ads.zzfck {
    private final java.util.Set zza;

    zzeuz(java.util.Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) it.next());
        }
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzeuy(arrayList, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 8;
    }
}
