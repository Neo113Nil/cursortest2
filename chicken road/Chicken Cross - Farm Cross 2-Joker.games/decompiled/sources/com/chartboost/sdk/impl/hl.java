package com.chartboost.sdk.impl;

import com.google.common.net.HttpHeaders;
import com.tiktok.util.UrlConst;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class hl {

    public interface a {
        void a(JSONObject jSONObject);
    }

    public final void a(String str, a aVar) {
        if (a(str)) {
            mb.b("CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource", (Throwable) null, 2, (Object) null);
            if (aVar != null) {
                aVar.a(new JSONObject().put("message", "CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource"));
            }
        }
    }

    public final boolean a(String str) {
        return (str == null || !StringsKt.contains$default((CharSequence) str, (CharSequence) HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, false, 2, (Object) null) || !StringsKt.contains$default((CharSequence) str, (CharSequence) "'null'", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "http://", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) UrlConst.HTTPS, false, 2, (Object) null)) ? false : true;
    }
}
