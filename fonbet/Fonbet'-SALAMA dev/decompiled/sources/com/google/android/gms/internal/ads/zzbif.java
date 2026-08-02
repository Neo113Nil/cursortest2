package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzbif implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzceb zzcebVar = (zzceb) obj;
        zzbex zzK = zzcebVar.zzK();
        if (zzK == null || (zzb = zzK.zzb()) == null) {
            zzcebVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcebVar.zze("nativeClickMetaReady", zzb);
        }
    }
}
