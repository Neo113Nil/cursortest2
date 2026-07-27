package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Tg extends Wg {
    public Tg(C0608e5 c0608e5) {
        super(c0608e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        String value = w5.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString(WebViewManager.EVENT_TYPE_KEY))) {
                return false;
            }
            zo zoVar = this.f7670a.f8104t;
            synchronized (zoVar) {
                zoVar.c(zoVar.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            w5.f7661n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        zo zoVar = this.f7670a.f8104t;
        synchronized (zoVar) {
            zoVar.a(zoVar.a() + 1);
        }
        this.f7670a.z();
        R8 r8 = this.f7670a.f8096l;
        if (r8.f7367c == null) {
            r8.a();
        }
        T8 t8 = r8.f7367c;
        t8.getClass();
        t8.f7520b = new HashSet();
        t8.f7522d = 0;
        T8 t82 = r8.f7367c;
        t82.f7519a = true;
        W8 w8 = r8.f7366b;
        IBinaryDataHelper iBinaryDataHelper = w8.f7666c;
        V8 v8 = w8.f7665b;
        w8.f7664a.getClass();
        iBinaryDataHelper.insert("event_hashes", v8.toByteArray((V8) U8.a(t82)));
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C1019u2 c1019u2 = this.f7670a.t().f8583y;
                    for (String str2 : Uri.decode(queryParameter).split("&")) {
                        String decode = Uri.decode(str2);
                        int indexOf = decode.indexOf("=");
                        if (indexOf >= 0 && a(Uri.decode(decode.substring(0, indexOf)), Uri.decode(decode.substring(indexOf + 1)), c1019u2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, C1019u2 c1019u2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c1019u2 == null) {
            return false;
        }
        for (Pair pair : c1019u2.f9332a) {
            if (AbstractC0860no.a(pair.first, str) && ((obj = pair.second) == null || ((C0993t2) obj).f9274a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
