package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbum implements com.google.android.gms.internal.ads.zzbty {
    private final com.google.android.gms.internal.ads.zzbua zza;
    private final com.google.android.gms.internal.ads.zzbub zzb;
    private final com.google.android.gms.internal.ads.zzbtu zzc;
    private final java.lang.String zzd;

    zzbum(com.google.android.gms.internal.ads.zzbtu zzbtuVar, java.lang.String str, com.google.android.gms.internal.ads.zzbub zzbubVar, com.google.android.gms.internal.ads.zzbua zzbuaVar) {
        this.zzc = zzbtuVar;
        this.zzd = str;
        this.zzb = zzbubVar;
        this.zza = zzbuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) throws java.lang.Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbty
    public final com.google.common.util.concurrent.ListenableFuture zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
        com.google.android.gms.internal.ads.zzbto zzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzb.zze(new com.google.android.gms.internal.ads.zzbuj(this, zzb, obj, zzcfwVar), new com.google.android.gms.internal.ads.zzbuk(this, zzcfwVar, zzb));
        return zzcfwVar;
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzbto zzbtoVar, com.google.android.gms.internal.ads.zzbtv zzbtvVar, java.lang.Object obj, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            com.google.android.gms.internal.ads.zzbpp.zzo.zzb(uuid, new com.google.android.gms.internal.ads.zzbul(this, zzbtoVar, zzcfwVar));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", this.zzb.zzb(obj));
            zzbtvVar.zzb(this.zzd, jSONObject);
        } catch (java.lang.Exception e) {
            try {
                zzcfwVar.zzd(e);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to invokeJavascript", e);
            } finally {
                zzbtoVar.zza();
            }
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbua zzd() {
        return this.zza;
    }
}
