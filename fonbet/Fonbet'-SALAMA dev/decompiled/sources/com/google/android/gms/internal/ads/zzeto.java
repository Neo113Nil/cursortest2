package com.google.android.gms.internal.ads;

import I2.J;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeto implements zzesg {
    private final String zza;

    public zzeto(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.zza);
        } catch (JSONException e7) {
            J.l("Failed putting Ad ID.", e7);
        }
    }
}
