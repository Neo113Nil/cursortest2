package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzclb implements zzckd {
    private final zzdtp zza;

    public zzclb(zzdtp zzdtpVar) {
        this.zza = zzdtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzckd
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzo(str.equals("true"));
    }
}
