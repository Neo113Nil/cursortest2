package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbrb implements zzbqh {
    private final zzbra zza;

    public zzbrb(zzbra zzbraVar) {
        this.zza = zzbraVar;
    }

    public static void zzb(zzclm zzclmVar, zzbra zzbraVar) {
        zzclmVar.zzab("/reward", new zzbrb(zzbraVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzc();
                    return;
                }
                return;
            }
        }
        zzcct zzcctVar = null;
        try {
            int parseInt = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzcctVar = new zzcct(str2, parseInt);
            }
        } catch (NumberFormatException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to parse reward amount.", e);
        }
        this.zza.zzb(zzcctVar);
    }
}
