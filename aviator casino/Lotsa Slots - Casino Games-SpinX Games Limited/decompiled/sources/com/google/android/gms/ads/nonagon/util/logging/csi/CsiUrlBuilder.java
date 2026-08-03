package com.google.android.gms.ads.nonagon.util.logging.csi;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public class CsiUrlBuilder {
    private final java.lang.String zza = (java.lang.String) com.google.android.gms.internal.ads.zzbkk.zza.zze();

    public java.lang.String generateUrl(java.util.Map<java.lang.String, java.lang.String> map) {
        android.net.Uri.Builder buildUpon = android.net.Uri.parse(this.zza).buildUpon();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
