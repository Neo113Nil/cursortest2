package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class zzbie implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZza;
        zzceb zzcebVar = (zzceb) obj;
        zzbex zzbexVarZzK = zzcebVar.zzK();
        if (zzbexVarZzK == null || (jSONObjectZza = zzbexVarZzK.zza()) == null) {
            zzcebVar.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcebVar.zze("nativeAdViewSignalsReady", jSONObjectZza);
        }
    }
}
