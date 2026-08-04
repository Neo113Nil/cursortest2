package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import Y4.D;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzeuz implements zzesg {
    private final String zza;

    public zzeuz(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.zza)) {
                return;
            }
            D.E0(jSONObject, "pii").put("adsid", this.zza);
        } catch (JSONException e7) {
            int i7 = J.f3546b;
            j.h("Failed putting trustless token.", e7);
        }
    }
}
