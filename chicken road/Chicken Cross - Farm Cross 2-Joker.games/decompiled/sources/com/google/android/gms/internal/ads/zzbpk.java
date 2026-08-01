package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbpk implements zzbqh {
    zzbpk() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclm zzclmVar = (zzclm) obj;
        try {
            String str = (String) map.get("enabled");
            zzbqh zzbqhVar = zzbqg.zza;
            if (!zzgts.zze("true", str) && !zzgts.zze("false", str)) {
                return;
            }
            zzgdk.zza(zzclmVar.getContext()).zzd(Boolean.parseBoolean(str));
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
