package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzbie implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzceb zzcebVar = (zzceb) obj;
        zzbex zzK = zzcebVar.zzK();
        if (zzK == null || (zza = zzK.zza()) == null) {
            zzcebVar.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcebVar.zze("nativeAdViewSignalsReady", zza);
        }
    }
}
