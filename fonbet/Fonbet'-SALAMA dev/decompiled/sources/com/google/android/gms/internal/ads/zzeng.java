package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeng implements zzesg {
    private final JSONObject zza;
    private final JSONObject zzb;

    public zzeng(JSONObject jSONObject, JSONObject jSONObject2) {
        this.zza = jSONObject;
        this.zzb = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = this.zzb;
        zzcts zzctsVar = (zzcts) obj;
        if (jSONObject != null) {
            zzctsVar.zzb.putString("fwd_common_cld", jSONObject.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        JSONObject jSONObject = this.zza;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.zzb;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
