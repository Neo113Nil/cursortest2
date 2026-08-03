package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbuu implements com.google.android.gms.internal.ads.zzhbe {
    private final java.lang.String zza = "google.afma.activeView.handleUpdate";
    private final com.google.common.util.concurrent.ListenableFuture zzb;

    zzbuu(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.String str, com.google.android.gms.internal.ads.zzbub zzbubVar, com.google.android.gms.internal.ads.zzbua zzbuaVar) {
        this.zzb = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) throws java.lang.Exception {
        return zzb(obj);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(final java.lang.Object obj) {
        return com.google.android.gms.internal.ads.zzhbw.zzj(this.zzb, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzbut
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj2) {
                return com.google.android.gms.internal.ads.zzbuu.this.zzc(obj, (com.google.android.gms.internal.ads.zzbtv) obj2);
            }
        }, com.google.android.gms.internal.ads.zzcfr.zzh);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(java.lang.Object obj, com.google.android.gms.internal.ads.zzbtv zzbtvVar) {
        com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
        com.google.android.gms.ads.internal.zzt.zzc();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        com.google.android.gms.internal.ads.zzbpp.zzo.zzb(uuid, new com.google.android.gms.internal.ads.zzbus(this, zzcfwVar));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (org.json.JSONObject) obj);
        zzbtvVar.zzb(this.zza, jSONObject);
        return zzcfwVar;
    }
}
