package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzckj implements zzckd {
    private final zzdtp zza;

    public zzckj(zzdtp zzdtpVar) {
        this.zza = zzdtpVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // com.google.android.gms.internal.ads.zzckd
    public final void zza(Map map) {
        byte b7;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                b7 = 0;
            } else {
                b7 = -1;
            }
        } else if (str.equals("flick")) {
            b7 = 1;
        } else {
            b7 = -1;
        }
        if (b7 == 0) {
            this.zza.zzm(zzdtl.SHAKE);
        } else if (b7 != 1) {
            this.zza.zzm(zzdtl.NONE);
        } else {
            this.zza.zzm(zzdtl.FLICK);
        }
    }
}
