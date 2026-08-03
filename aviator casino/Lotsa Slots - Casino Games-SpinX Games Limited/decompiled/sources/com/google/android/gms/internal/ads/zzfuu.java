package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfuu implements androidx.webkit.WebViewCompat.WebMessageListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfuw zza;

    zzfuu(com.google.android.gms.internal.ads.zzfuw zzfuwVar) {
        java.util.Objects.requireNonNull(zzfuwVar);
        this.zza = zzfuwVar;
    }

    @Override // androidx.webkit.WebViewCompat.WebMessageListener
    public final void onPostMessage(android.webkit.WebView webView, androidx.webkit.WebMessageCompat webMessageCompat, android.net.Uri uri, boolean z, androidx.webkit.JavaScriptReplyProxy javaScriptReplyProxy) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(webMessageCompat.getData());
            java.lang.String string = jSONObject.getString("method");
            java.lang.String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                this.zza.zzf(string2);
            } else if (string.equals("finishSession")) {
                this.zza.zzg(string2);
            } else {
                java.lang.String.valueOf(string);
                com.google.android.gms.internal.ads.zzfuh.zza.booleanValue();
            }
        } catch (org.json.JSONException e) {
            com.google.android.gms.internal.ads.zzfwf.zza("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
