package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Tg extends Wg {
    public Tg(C0459e5 c0459e5) {
        super(c0459e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        String value = w5.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            zo zoVar = this.f6796a.f7211t;
            synchronized (zoVar) {
                zoVar.c(zoVar.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            w5.f6787n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        zo zoVar = this.f6796a.f7211t;
        synchronized (zoVar) {
            zoVar.a(zoVar.a() + 1);
        }
        this.f6796a.z();
        R8 r8 = this.f6796a.f7203l;
        if (r8.f6503c == null) {
            r8.a();
        }
        T8 t8 = r8.f6503c;
        t8.getClass();
        t8.f6649b = new HashSet();
        t8.f6651d = 0;
        T8 t82 = r8.f6503c;
        t82.f6648a = true;
        W8 w8 = r8.f6502b;
        IBinaryDataHelper iBinaryDataHelper = w8.f6792c;
        V8 v8 = w8.f6791b;
        w8.f6790a.getClass();
        iBinaryDataHelper.insert("event_hashes", v8.toByteArray((V8) U8.a(t82)));
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C0870u2 c0870u2 = this.f6796a.t().y;
                    for (String str2 : Uri.decode(queryParameter).split("&")) {
                        String decode = Uri.decode(str2);
                        int indexOf = decode.indexOf("=");
                        if (indexOf >= 0 && a(Uri.decode(decode.substring(0, indexOf)), Uri.decode(decode.substring(indexOf + 1)), c0870u2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, C0870u2 c0870u2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c0870u2 == null) {
            return false;
        }
        for (Pair pair : c0870u2.f8381a) {
            if (AbstractC0711no.a(pair.first, str) && ((obj = pair.second) == null || ((C0844t2) obj).f8326a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
