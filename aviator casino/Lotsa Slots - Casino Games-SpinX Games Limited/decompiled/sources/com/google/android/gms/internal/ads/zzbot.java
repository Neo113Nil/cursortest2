package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbot implements com.google.android.gms.internal.ads.zzbpq {
    zzbot() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
        try {
            java.lang.String str = (java.lang.String) map.get("enabled");
            com.google.android.gms.internal.ads.zzbpq zzbpqVar = com.google.android.gms.internal.ads.zzbpp.zza;
            if (!com.google.android.gms.internal.ads.zzgss.zze("true", str) && !com.google.android.gms.internal.ads.zzgss.zze("false", str)) {
                return;
            }
            com.google.android.gms.internal.ads.zzgch.zza(zzckuVar.getContext()).zzd(java.lang.Boolean.parseBoolean(str));
        } catch (java.io.IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
