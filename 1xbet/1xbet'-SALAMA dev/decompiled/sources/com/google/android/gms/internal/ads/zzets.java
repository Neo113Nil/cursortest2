package com.google.android.gms.internal.ads;

import I2.J;
import Y4.D;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzets implements zzesg {
    final String zza;
    final int zzb;

    public zzets(String str, int i7) {
        this.zza = str;
        this.zzb = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.zza) || this.zzb == -1) {
            return;
        }
        try {
            JSONObject jSONObjectE0 = D.E0(jSONObject, "pii");
            jSONObjectE0.put("pvid", this.zza);
            jSONObjectE0.put("pvid_s", this.zzb);
        } catch (JSONException e7) {
            J.l("Failed putting gms core app set ID info.", e7);
        }
    }
}
