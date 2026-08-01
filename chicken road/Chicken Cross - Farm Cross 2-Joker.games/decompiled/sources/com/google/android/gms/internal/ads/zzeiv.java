package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzeiv implements zzfpi {
    static final /* synthetic */ zzeiv zza = new zzeiv();

    private /* synthetic */ zzeiv() {
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
        com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
        return jSONObject;
    }
}
