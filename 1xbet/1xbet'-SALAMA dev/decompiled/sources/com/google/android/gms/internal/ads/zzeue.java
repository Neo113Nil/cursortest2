package com.google.android.gms.internal.ads;

import I2.J;
import Y4.D;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzeue implements zzesg {
    private final String zza;
    private final String zzb;

    public zzeue(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            JSONObject jSONObjectE0 = D.E0((JSONObject) obj, "pii");
            jSONObjectE0.put("doritos", this.zza);
            jSONObjectE0.put("doritos_v2", this.zzb);
        } catch (JSONException unused) {
            J.k("Failed putting doritos string.");
        }
    }
}
