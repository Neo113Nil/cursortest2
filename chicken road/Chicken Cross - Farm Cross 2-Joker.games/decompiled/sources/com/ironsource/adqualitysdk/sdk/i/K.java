package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public final class K implements InterfaceC0829 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final WeakHashMap f123;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final HashSet f124 = new HashSet();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final D f125;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f126;

    static {
        StringFog.decrypt("85xW92oSIjHNikDEbRIn\n", "pPk0oQN3VX0=\n");
        f123 = new WeakHashMap();
    }

    public K(WebView webView, String str) {
        this.f126 = str;
        D d = new D(webView);
        this.f125 = d;
        m5317();
        new J(this);
        WebView webView2 = (WebView) d.f103.get();
        if (webView2 != null) {
            try {
                V.m5324(webView2);
            } catch (Exception e) {
                AbstractC0480.m5464(D.f100, StringFog.decrypt("2JMy8aT8EvbplSnwsfwi9v+iKOy5sRDQ8Ygl8KI=\n", "neFAntbcdZM=\n"), (Throwable) e, false);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5317() {
        D d = this.f125;
        I i = new I(this);
        WebView webView = (WebView) d.f103.get();
        if (webView != null) {
            try {
                B b = new B(V.m5323(webView), i);
                d.f102 = new WeakReference(b);
                webView.setWebViewClient(b);
                d.f101 = true;
                return;
            } catch (Exception e) {
                AbstractC0480.m5464(D.f100, StringFog.decrypt("TAEFVbur4I99Bx5UrqvQj2slHl++yOuDbB0D\n", "CXN3OsmLh+o=\n"), (Throwable) e, false);
            }
        }
        d.f101 = false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0829
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo5318(WebView webView) {
        Iterator it = new HashSet(this.f124).iterator();
        while (it.hasNext()) {
            InterfaceC0829 interfaceC0829 = (InterfaceC0829) it.next();
            if (interfaceC0829 != null) {
                interfaceC0829.mo5318(webView);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0829
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo5320(WebView webView, String str, String str2) {
        Iterator it = new HashSet(this.f124).iterator();
        while (it.hasNext()) {
            InterfaceC0829 interfaceC0829 = (InterfaceC0829) it.next();
            if (interfaceC0829 != null) {
                interfaceC0829.mo5320(webView, str, str2);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0829
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo5321(WebView webView, String str, boolean z) {
        Iterator it = new HashSet(this.f124).iterator();
        while (it.hasNext()) {
            InterfaceC0829 interfaceC0829 = (InterfaceC0829) it.next();
            if (interfaceC0829 != null) {
                interfaceC0829.mo5321(webView, str, z);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0829
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo5319(WebView webView, String str) {
        Iterator it = new HashSet(this.f124).iterator();
        while (it.hasNext()) {
            InterfaceC0829 interfaceC0829 = (InterfaceC0829) it.next();
            if (interfaceC0829 != null) {
                interfaceC0829.mo5319(webView, str);
            }
        }
    }
}
