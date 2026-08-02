package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzckj implements zzckd {
    private final zzdtp zza;

    public zzckj(zzdtp zzdtpVar) {
        this.zza = zzdtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzckd
    public final void zza(Map map) {
        char c3;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c3 = 0;
            }
            c3 = 65535;
        } else {
            if (str.equals("flick")) {
                c3 = 1;
            }
            c3 = 65535;
        }
        if (c3 == 0) {
            this.zza.zzm(zzdtl.SHAKE);
        } else if (c3 != 1) {
            this.zza.zzm(zzdtl.NONE);
        } else {
            this.zza.zzm(zzdtl.FLICK);
        }
    }
}
