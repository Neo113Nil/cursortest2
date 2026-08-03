package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbom implements com.google.android.gms.internal.ads.zzbpq {
    zzbom() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        org.json.JSONObject zzd;
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
        com.google.android.gms.internal.ads.zzblr zzar = zzckuVar.zzar();
        if (zzar == null || (zzd = zzar.zzd()) == null) {
            zzckuVar.zzd("nativeClickMetaReady", new org.json.JSONObject());
        } else {
            zzckuVar.zzd("nativeClickMetaReady", zzd);
        }
    }
}
