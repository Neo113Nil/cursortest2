package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzffe implements com.google.android.gms.internal.ads.zzfci {
    private final java.util.Map zza;

    public zzffe(java.util.Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        try {
            ((org.json.JSONObject) obj).put("video_decoders", com.google.android.gms.ads.internal.client.zzay.zza().zzm(this.zza));
        } catch (org.json.JSONException e) {
            java.lang.String message = e.getMessage();
            java.lang.String.valueOf(message);
            com.google.android.gms.ads.internal.util.zze.zza("Could not encode video decoder properties: ".concat(java.lang.String.valueOf(message)));
        }
    }
}
