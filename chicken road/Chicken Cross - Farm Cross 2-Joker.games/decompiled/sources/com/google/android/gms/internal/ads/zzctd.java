package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzctd implements zzcsl {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    zzctd(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsl
    public final void zza(Map map) {
        int intValue;
        String str = (String) map.get("default_queue_capacity");
        if (str == null || (intValue = Float.valueOf(str).intValue()) <= 0) {
            return;
        }
        this.zza.zzU(intValue);
    }
}
