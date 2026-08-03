package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzba implements com.google.android.gms.internal.ads.zzhbe {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.internal.ads.zzeff zzb;

    public zzba(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzeff zzeffVar) {
        this.zza = executor;
        this.zzb = zzeffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) throws java.lang.Exception {
        final com.google.android.gms.internal.ads.zzcbd zzcbdVar = (com.google.android.gms.internal.ads.zzcbd) obj;
        return com.google.android.gms.internal.ads.zzhbw.zzj(this.zzb.zza(zzcbdVar), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaz
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj2) {
                com.google.android.gms.internal.ads.zzegs zzegsVar = (com.google.android.gms.internal.ads.zzegs) obj2;
                com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzbc(new android.util.JsonReader(new java.io.InputStreamReader(zzegsVar.zza())), zzegsVar.zzb());
                try {
                    zzbcVar.zzb = com.google.android.gms.ads.internal.client.zzay.zza().zzo(com.google.android.gms.internal.ads.zzcbd.this.zza).toString();
                } catch (org.json.JSONException unused) {
                    zzbcVar.zzb = "{}";
                }
                return com.google.android.gms.internal.ads.zzhbw.zza(zzbcVar);
            }
        }, this.zza);
    }
}
