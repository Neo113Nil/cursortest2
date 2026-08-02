package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.D;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbjt implements zzbiz {
    private final zzdtp zza;

    public zzbjt(zzdtp zzdtpVar) {
        D.j(zzdtpVar, "The Inspector Manager must not be null");
        this.zza = zzdtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi((String) map.get("extras"), j);
    }
}
