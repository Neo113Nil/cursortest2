package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4319x implements InterfaceC0829 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractViewOnLayoutChangeListenerC4320y f296;

    public C4319x(AbstractViewOnLayoutChangeListenerC4320y abstractViewOnLayoutChangeListenerC4320y) {
        this.f296 = abstractViewOnLayoutChangeListenerC4320y;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0829
    /* renamed from: ﾒ */
    public final void mo5320(WebView webView, String str, String str2) {
        WeakReference weakReference;
        String substring = str2.substring(0, str2.indexOf(63));
        String substring2 = str2.substring(str2.indexOf(63) + 1);
        if (substring.equals(StringFog.decrypt("AkkD5mhP\n", "cT1hhQkqnQI=\n"))) {
            this.f296.m5377(webView);
            return;
        }
        if (substring.equals(StringFog.decrypt("R5sSrlVf\n", "NO9wzTQ9Pvg=\n"))) {
            JSONObject m5376 = AbstractViewOnLayoutChangeListenerC4320y.m5376(this.f296, substring2);
            AbstractViewOnLayoutChangeListenerC4320y abstractViewOnLayoutChangeListenerC4320y = this.f296;
            abstractViewOnLayoutChangeListenerC4320y.mo5351(m5376, webView, abstractViewOnLayoutChangeListenerC4320y.mo5312(webView));
            return;
        }
        if (substring.equals(StringFog.decrypt("uC/yk/2s\n", "y1uQ8JzNLqs=\n"))) {
            JSONObject m53762 = AbstractViewOnLayoutChangeListenerC4320y.m5376(this.f296, substring2);
            AbstractViewOnLayoutChangeListenerC4320y abstractViewOnLayoutChangeListenerC4320y2 = this.f296;
            K k = abstractViewOnLayoutChangeListenerC4320y2.f301;
            abstractViewOnLayoutChangeListenerC4320y2.mo5353(m53762, webView, (k == null || (weakReference = k.f125.f102) == null) ? null : (C) weakReference.get(), this.f296.mo5312(webView));
            return;
        }
        if (substring.equals(StringFog.decrypt("sZOaORJ7\n", "wuf4WnMYlNI=\n"))) {
            JSONObject m53763 = AbstractViewOnLayoutChangeListenerC4320y.m5376(this.f296, substring2);
            m53763.remove(AbstractC0739.f2061);
            AbstractViewOnLayoutChangeListenerC4320y abstractViewOnLayoutChangeListenerC4320y3 = this.f296;
            abstractViewOnLayoutChangeListenerC4320y3.mo5347(m53763, webView, abstractViewOnLayoutChangeListenerC4320y3.mo5312(webView));
            return;
        }
        if (substring.equals(StringFog.decrypt("h80ScZHB\n", "9LlwEvClVbw=\n"))) {
            JSONObject m53764 = AbstractViewOnLayoutChangeListenerC4320y.m5376(this.f296, substring2);
            try {
                AbstractC0480.m5462(m53764.optString(StringFog.decrypt("q6Gn\n", "38DAobNR0ps=\n")), m53764.optString(StringFog.decrypt("aKP506c=\n", "DdGUoMDpU/4=\n")), m53764.optString(StringFog.decrypt("2csHleSN\n", "vLlk+oDoNxg=\n")), m53764.optString(StringFog.decrypt("NXZvn/Y=\n", "UAQc650Dp9I=\n")));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0829
    /* renamed from: ﾒ */
    public final void mo5321(WebView webView, String str, boolean z) {
        AbstractC1145.m5895(new C4316u(this, webView, str, z));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0829
    /* renamed from: ﾒ */
    public final void mo5318(WebView webView) {
        this.f296.m5377(webView);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0829
    /* renamed from: ﾒ */
    public final void mo5319(WebView webView, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractC0739.f2057, str);
            jSONObject.put(AbstractC0739.f2056, AbstractC0739.f2055);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractC0739.f2058, jSONObject);
            AbstractViewOnLayoutChangeListenerC4320y abstractViewOnLayoutChangeListenerC4320y = this.f296;
            abstractViewOnLayoutChangeListenerC4320y.mo5358(jSONObject2, webView, this, abstractViewOnLayoutChangeListenerC4320y.mo5312(webView));
        } catch (Exception e) {
            AbstractC0480.m5464(StringFog.decrypt("TyxAtGi6cKR8AUOMZbNilw==\n", "GEki4gHfB+U=\n"), StringFog.decrypt("2QvE+EBSNeH5GML+XBV25P8alvJEFzjnvBPF+Fw=\n", "nHm2lzJyVpM=\n"), (Throwable) e, false);
        }
    }
}
