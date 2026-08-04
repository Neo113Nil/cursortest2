package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzckv implements zzckd {
    private final zzfae zza;

    public zzckv(zzfae zzfaeVar) {
        this.zza = zzfaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzckd
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zza.zzb(Boolean.parseBoolean(str));
        } catch (Exception e7) {
            throw new IllegalStateException("Invalid render_in_browser state", e7);
        }
    }
}
