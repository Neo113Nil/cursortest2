package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcyb implements com.google.android.gms.internal.ads.zzepe {
    public final java.util.List zza;

    public zzcyb(com.google.android.gms.internal.ads.zzcxt zzcxtVar) {
        this.zza = java.util.Collections.singletonList(com.google.android.gms.internal.ads.zzhbw.zza(zzcxtVar));
    }

    public zzcyb(java.util.List list) {
        this.zza = list;
    }

    public static com.google.android.gms.internal.ads.zzels zza(com.google.android.gms.internal.ads.zzeny zzenyVar) {
        return new com.google.android.gms.internal.ads.zzelt(zzenyVar, com.google.android.gms.internal.ads.zzcya.zza);
    }

    public static com.google.android.gms.internal.ads.zzels zzb(com.google.android.gms.internal.ads.zzels zzelsVar) {
        return new com.google.android.gms.internal.ads.zzelt(zzelsVar, com.google.android.gms.internal.ads.zzcxz.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzepe
    public final void zzm() {
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzhbw.zzr((com.google.common.util.concurrent.ListenableFuture) it.next(), new com.google.android.gms.internal.ads.zzcxy(this), com.google.android.gms.internal.ads.zzhcn.zza());
        }
    }
}
