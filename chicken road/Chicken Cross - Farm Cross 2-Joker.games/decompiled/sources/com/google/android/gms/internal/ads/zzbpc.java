package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbpc implements zzbqh {
    zzbpc() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzc;
        zzclm zzclmVar = (zzclm) obj;
        zzbmi zzar = zzclmVar.zzar();
        if (zzar == null || (zzc = zzar.zzc()) == null) {
            zzclmVar.zzd("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzclmVar.zzd("nativeAdViewSignalsReady", zzc);
        }
    }
}
