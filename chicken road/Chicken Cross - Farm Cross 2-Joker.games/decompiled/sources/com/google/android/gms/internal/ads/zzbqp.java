package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbqp implements zzbqh {
    private final zzebm zza;

    public zzbqp(zzebm zzebmVar) {
        this.zza = zzebmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey("event_type") || TextUtils.isEmpty((CharSequence) map.get("event_type"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
            return;
        }
        try {
            this.zza.zza(Long.parseLong((String) map.get("id")), Integer.parseInt((String) map.get("event_type")), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e);
        }
    }
}
