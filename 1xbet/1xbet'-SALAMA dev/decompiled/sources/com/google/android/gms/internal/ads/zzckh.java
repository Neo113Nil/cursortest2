package com.google.android.gms.internal.ads;

import I2.L;
import I2.M;
import android.content.SharedPreferences;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzckh implements zzckd {
    private final L zza;

    public zzckh(L l7) {
        this.zza = l7;
    }

    @Override // com.google.android.gms.internal.ads.zzckd
    public final void zza(Map map) {
        boolean z4 = Boolean.parseBoolean((String) map.get("content_vertical_opted_out"));
        M m7 = (M) this.zza;
        m7.l();
        synchronized (m7.f3551a) {
            try {
                if (m7.f3571v == z4) {
                    return;
                }
                m7.f3571v = z4;
                SharedPreferences.Editor editor = m7.f3557g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z4);
                    m7.f3557g.apply();
                }
                m7.m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
