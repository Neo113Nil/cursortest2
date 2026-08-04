package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class zzbif implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzb;
        zzceb zzcebVar = (zzceb) obj;
        zzbex zzbexVarZzK = zzcebVar.zzK();
        if (zzbexVarZzK == null || (jSONObjectZzb = zzbexVarZzK.zzb()) == null) {
            zzcebVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcebVar.zze("nativeClickMetaReady", jSONObjectZzb);
        }
    }
}
