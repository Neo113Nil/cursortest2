package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzego implements com.google.android.gms.internal.ads.zzegq {
    private final java.util.Map zza;
    private final com.google.android.gms.internal.ads.zzhcg zzb;
    private final com.google.android.gms.internal.ads.zzdfv zzc;

    public zzego(java.util.Map map, com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzdfv zzdfvVar) {
        this.zza = map;
        this.zzb = zzhcgVar;
        this.zzc = zzdfvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        this.zzc.zzdP(zzcbdVar);
        com.google.common.util.concurrent.ListenableFuture zzc = com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzeed(3));
        for (java.lang.String str : ((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjx)).split(",")) {
            final com.google.android.gms.internal.ads.zzinj zzinjVar = (com.google.android.gms.internal.ads.zzinj) this.zza.get(str.trim());
            if (zzinjVar != null) {
                zzc = com.google.android.gms.internal.ads.zzhbw.zzh(zzc, com.google.android.gms.internal.ads.zzeed.class, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzegn
                    @Override // com.google.android.gms.internal.ads.zzhbe
                    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                        return ((com.google.android.gms.internal.ads.zzegq) com.google.android.gms.internal.ads.zzinj.this.zzb()).zza(zzcbdVar);
                    }
                }, this.zzb);
            }
        }
        com.google.android.gms.internal.ads.zzhbw.zzr(zzc, new com.google.android.gms.internal.ads.zzegm(this), com.google.android.gms.internal.ads.zzcfr.zzh);
        return zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdfv zzb() {
        return this.zzc;
    }
}
