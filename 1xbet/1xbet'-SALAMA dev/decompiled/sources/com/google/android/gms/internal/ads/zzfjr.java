package com.google.android.gms.internal.ads;

import R0.n;
import R0.v;
import android.net.Uri;
import android.webkit.WebView;
import io.sentry.protocol.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class zzfjr implements v {
    final /* synthetic */ zzfjs zza;

    public zzfjr(zzfjs zzfjsVar) {
        this.zza = zzfjsVar;
    }

    @Override // R0.v
    public final void onPostMessage(WebView webView, n nVar, Uri uri, boolean z4, R0.a aVar) {
        nVar.a(0);
        try {
            JSONObject jSONObject = new JSONObject(nVar.f5863b);
            String string = jSONObject.getString(Request.JsonKeys.METHOD);
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                zzfjs.zze(this.zza, string2);
            } else if (string.equals("finishSession")) {
                zzfjs.zzc(this.zza, string2);
            } else {
                zzfje.zza.getClass();
            }
        } catch (JSONException e7) {
            zzfkz.zza("Error parsing JS message in JavaScriptSessionService.", e7);
        }
    }
}
