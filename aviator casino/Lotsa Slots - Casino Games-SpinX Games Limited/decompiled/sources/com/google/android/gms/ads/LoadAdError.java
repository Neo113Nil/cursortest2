package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class LoadAdError extends com.google.android.gms.ads.AdError {
    private final com.google.android.gms.ads.ResponseInfo zza;

    public LoadAdError(int i, java.lang.String str, java.lang.String str2, com.google.android.gms.ads.AdError adError, com.google.android.gms.ads.ResponseInfo responseInfo) {
        super(i, str, str2, adError);
        this.zza = responseInfo;
    }

    public com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.AdError
    public java.lang.String toString() {
        try {
            return zzb().toString(2);
        } catch (org.json.JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @Override // com.google.android.gms.ads.AdError
    public final org.json.JSONObject zzb() throws org.json.JSONException {
        org.json.JSONObject zzb = super.zzb();
        com.google.android.gms.ads.ResponseInfo responseInfo = getResponseInfo();
        if (responseInfo == null) {
            zzb.put("Response Info", kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL);
        } else {
            zzb.put("Response Info", responseInfo.zza());
        }
        return zzb;
    }
}
