package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Build;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class V {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f137 = StringFog.decrypt("Eu+bS8p2G28x45Vu\n", "RYr5HaMTbDo=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean f136 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    public static boolean f135 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean f134 = true;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean f133 = false;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static boolean f132 = false;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static U f131 = new U();

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static U f130 = new U();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static WebViewClient m5323(WebView webView) {
        JSONObject jSONObject;
        if (Build.VERSION.SDK_INT >= 26) {
            L m5325 = m5325();
            synchronized (m5325) {
                jSONObject = m5325.f3224;
            }
            boolean z = true;
            if (jSONObject.optBoolean(StringFog.decrypt("Uxi+VQ==\n", "NG/INq8AWV4=\n"), true)) {
                Context context = webView.getContext();
                if (f135) {
                    try {
                        f135 = false;
                        WebView webView2 = new WebView(context);
                        B b = new B(null, new O());
                        webView2.setWebViewClient(b);
                        if (b != webView2.getWebViewClient()) {
                            z = false;
                        }
                        f133 = z;
                    } catch (Throwable th) {
                        AbstractC0480.m5464(f137, StringFog.decrypt("/HUQMewQa3XcZAk38FcodN8nET/zVShK3GU0N/tHS3HQYgwq\n", "uQdiXp4wCB0=\n"), th, false);
                    }
                }
                if (f133) {
                    return webView.getWebViewClient();
                }
            }
        }
        m5329(webView.getContext());
        InterfaceC0388 m5327 = m5327(webView, new S(), f131);
        if (m5327 != null) {
            return (WebViewClient) ((C1303) m5327).m5943();
        }
        throw new RuntimeException(StringFog.decrypt("jqeB7wLH9iHtrp3tAomGMK+eneYR6r08qKaAowDAtDmp\n", "zcj0g2ap0VU=\n"));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized L m5325() {
        L l;
        synchronized (V.class) {
            l = ((C0470) AbstractC0398.m5397()).f889;
        }
        return l;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static WebChromeClient m5324(WebView webView) {
        JSONObject jSONObject;
        if (Build.VERSION.SDK_INT >= 26) {
            L m5325 = m5325();
            synchronized (m5325) {
                jSONObject = m5325.f3224;
            }
            if (jSONObject.optBoolean(StringFog.decrypt("QjVSyw==\n", "JUIxqHUFRgk=\n"), true)) {
                Context context = webView.getContext();
                if (f134) {
                    f134 = false;
                    WebView webView2 = new WebView(context);
                    C4315t c4315t = new C4315t(new P());
                    webView2.setWebChromeClient(c4315t);
                    f132 = c4315t == webView2.getWebChromeClient();
                }
                if (f132) {
                    return webView.getWebChromeClient();
                }
            }
        }
        m5329(webView.getContext());
        InterfaceC0388 m5327 = m5327(webView, new T(), f130);
        if (m5327 != null) {
            return (WebChromeClient) ((C1303) m5327).m5943();
        }
        throw new RuntimeException(StringFog.decrypt("mIFbRQz3JKr7iEdHDLlUu7mtRlsH9Gadt4dLRxy5Zbe+gko=\n", "2+4uKWiZA94=\n"));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5329(Context context) {
        if (f136) {
            f136 = false;
            try {
                WebView webView = new WebView(context);
                B b = new B(null, new M());
                webView.setWebViewClient(b);
                C4315t c4315t = new C4315t(new N());
                webView.setWebChromeClient(c4315t);
                f131 = m5326(webView, b, new S());
                f130 = m5326(webView, c4315t, new T());
            } catch (Throwable th) {
                AbstractC0480.m5464(f137, StringFog.decrypt("L+NiU7rTmV4P8ntVppTaUAXjMFWmnZ9ESvJ8Va2djkU=\n", "apEQPMjz+jY=\n"), th, false);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static U m5326(WebView webView, InterfaceC0947 interfaceC0947, InterfaceC0372 interfaceC0372) {
        U u = new U();
        C1161 c1161 = m5325().f3223;
        JSONObject jSONObject = c1161.f3327;
        String str = c1161.f3333;
        List list = c1161.f3335;
        String str2 = AbstractC0647.f1786;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            list = AbstractC0647.m5604(optJSONArray);
        }
        C1161 c11612 = m5325().f3223;
        InterfaceC0388 m5328 = m5328(webView, interfaceC0372, list, c11612.f3327.optInt(c11612.f3332, 7));
        if (m5328 != null) {
            Object m5943 = ((C1303) m5328).m5943();
            if (m5943 == interfaceC0947) {
                u.f129 = true;
            } else {
                C1161 c11613 = m5325().f3223;
                JSONObject jSONObject2 = c11613.f3327;
                String str3 = c11613.f3331;
                List list2 = c11613.f3334;
                JSONArray optJSONArray2 = jSONObject2.optJSONArray(str3);
                if (optJSONArray2 != null) {
                    list2 = AbstractC0647.m5604(optJSONArray2);
                }
                C1161 c11614 = m5325().f3223;
                InterfaceC0388 m53282 = m5328(m5943, interfaceC0372, list2, c11614.f3327.optInt(c11614.f3330, 2));
                if (m53282 != null && ((C1303) m53282).m5943() == interfaceC0947) {
                    u.f128 = true;
                }
            }
        }
        return u;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static InterfaceC0388 m5328(Object obj, InterfaceC0372 interfaceC0372, List list, int i) {
        C1174 c1174 = C0391.m5393().f502;
        Q q = new Q(list);
        c1174.getClass();
        C1215 c1215 = new C1215();
        c1215.f3419.f3490 = -1;
        c1215.f3418 = interfaceC0372;
        c1215.f3417 = q;
        C1227 c1227 = c1215.f3419;
        c1227.f3495 = list;
        c1227.f3494 = i;
        c1227.f3497 = interfaceC0372.getClass();
        c1215.f3419.f3496 = Q.class;
        return c1174.m5904(obj, c1215);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static InterfaceC0388 m5327(WebView webView, InterfaceC0372 interfaceC0372, U u) {
        Object m5943;
        try {
            if (!u.f129 && !u.f128) {
                return null;
            }
            C1161 c1161 = m5325().f3223;
            JSONObject jSONObject = c1161.f3327;
            String str = c1161.f3333;
            List list = c1161.f3335;
            String str2 = AbstractC0647.f1786;
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray != null) {
                list = AbstractC0647.m5604(optJSONArray);
            }
            C1161 c11612 = m5325().f3223;
            InterfaceC0388 m5328 = m5328(webView, interfaceC0372, list, c11612.f3327.optInt(c11612.f3332, 7));
            if (u.f128 && m5328 != null && (m5943 = ((C1303) m5328).m5943()) != null && !m5943.getClass().equals(((C1303) m5328).f3730.getType())) {
                C1161 c11613 = m5325().f3223;
                JSONObject jSONObject2 = c11613.f3327;
                String str3 = c11613.f3331;
                List list2 = c11613.f3334;
                JSONArray optJSONArray2 = jSONObject2.optJSONArray(str3);
                if (optJSONArray2 != null) {
                    list2 = AbstractC0647.m5604(optJSONArray2);
                }
                C1161 c11614 = m5325().f3223;
                return m5328(m5943, interfaceC0372, list2, c11614.f3327.optInt(c11614.f3330, 2));
            }
            return m5328;
        } catch (Throwable th) {
            AbstractC0480.m5464(f137, StringFog.decrypt("b6MGlvB7MkJepR2X5Xs2S0O0Go2iPTxCRrU=\n", "KtF0+YJbVSc=\n"), th, false);
            return null;
        }
    }
}
