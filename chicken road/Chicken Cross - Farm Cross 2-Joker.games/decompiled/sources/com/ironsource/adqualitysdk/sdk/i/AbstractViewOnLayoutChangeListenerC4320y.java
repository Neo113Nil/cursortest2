package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractViewOnLayoutChangeListenerC4320y extends AbstractC1108 implements View.OnLayoutChangeListener {

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f297 = StringFog.decrypt("vV9n2lbZzJyOcmTiW9Derw==\n", "6joFjD+8u90=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public H f299;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public K f301;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public boolean f302;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public boolean f303;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public String f304;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public List f305;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final WeakHashMap f300 = new WeakHashMap();

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final ArrayList f298 = new ArrayList();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m5376(AbstractViewOnLayoutChangeListenerC4320y abstractViewOnLayoutChangeListenerC4320y, String str) {
        abstractViewOnLayoutChangeListenerC4320y.getClass();
        try {
            String decode = URLDecoder.decode(str, StringFog.decrypt("Y1sSdfw=\n", "Ng9UWMTQRB0=\n"));
            if (!TextUtils.isEmpty(decode)) {
                return new JSONObject(decode);
            }
        } catch (Exception e) {
            String str2 = f297;
            AbstractC0544.m5511(str2, str2, StringFog.decrypt("pHIfWwj5KHqVdARaHfkrfpVh\n", "4QBtNHrZTx8=\n"), e, null, false);
        }
        return new JSONObject();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                if (this.f300.containsKey(webView)) {
                    m5377(webView);
                }
            }
        } catch (Throwable th) {
            AbstractC0480.m5464(f297, StringFog.decrypt("qbXXq0yJcKLMqMuIX9B2uZiEzaVQznw=\n", "7MelxD6pGcw=\n"), th, false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1108, com.ironsource.adqualitysdk.sdk.i.InterfaceC1005
    /* renamed from: ﻛ */
    public final void mo5349(JSONObject jSONObject, View view, Object obj) {
        jSONObject.remove(AbstractC0739.f2061);
        super.mo5349(jSONObject, (WebView) view, obj);
    }

    /* renamed from: ﾇ */
    public abstract Object mo5312(WebView webView);

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m5377(WebView webView) {
        K k = (K) this.f300.get(webView);
        if (this.f303 && k.f125.f101) {
            if (!(V.m5323(webView) instanceof B)) {
                k.m5317();
            }
            H h = this.f299;
            h.getClass();
            try {
                AbstractC1145.m5892(new G(h, webView));
            } catch (Exception e) {
                AbstractC0544.m5502(H.f114, StringFog.decrypt("rq/Tu5YqQCSBuMKgjWROaoGugaCLKl4viYvIsZMwCQ==\n", "692h1OQKKUo=\n") + e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5379(WebView webView) {
        if (webView == null || this.f300.containsKey(webView)) {
            return;
        }
        String decrypt = StringFog.decrypt("+Ewk4dzDCvG2\n", "mShHjb6oMN4=\n");
        WeakHashMap weakHashMap = K.f123;
        K k = (K) weakHashMap.get(webView);
        if (k == null) {
            k = new K(webView, decrypt);
            weakHashMap.put(webView, k);
        }
        if (this.f301 == null) {
            this.f301 = k;
        }
        this.f300.put(webView, k);
        C4319x c4319x = new C4319x(this);
        this.f298.add(c4319x);
        k.f124.add(c4319x);
        m5377(webView);
        webView.addOnLayoutChangeListener(this);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1108
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String mo5378(Object obj) {
        return this.f304;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1108, com.ironsource.adqualitysdk.sdk.i.InterfaceC1005
    /* renamed from: ﾒ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo5351(JSONObject jSONObject, WebView webView, Object obj) {
        if (webView != null) {
            try {
                jSONObject.put(AbstractC0739.f2018, webView.getWindowToken() != null);
            } catch (JSONException unused) {
            }
        }
        super.mo5351(jSONObject, webView, obj);
    }
}
