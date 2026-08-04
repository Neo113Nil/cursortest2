package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.internal.D;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbja implements zzbiz {
    private final zzdtp zza;

    public zzbja(zzdtp zzdtpVar) {
        D.j(zzdtpVar, "The Inspector Manager must not be null");
        this.zza = zzdtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        this.zza.zzj((String) map.get("persistentData"));
    }
}
