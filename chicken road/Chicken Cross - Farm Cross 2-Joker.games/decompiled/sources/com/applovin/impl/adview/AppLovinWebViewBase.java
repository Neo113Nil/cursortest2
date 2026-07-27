package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.p0;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* loaded from: classes5.dex */
public class AppLovinWebViewBase extends WebView {
    public AppLovinWebViewBase(Context context) {
        super(context);
    }

    protected void applySettings(com.applovin.impl.sdk.ad.b bVar) {
        Boolean m;
        loadUrl(AndroidWebViewClient.BLANK_PAGE);
        int o0 = bVar.o0();
        if (o0 >= 0) {
            setLayerType(o0, null);
        }
        getSettings().setMediaPlaybackRequiresUserGesture(bVar.E());
        if (bVar.E0()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        l p0 = bVar.p0();
        if (p0 != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState b = p0.b();
            if (b != null) {
                settings.setPluginState(b);
            }
            Boolean e = p0.e();
            if (e != null) {
                settings.setAllowFileAccess(e.booleanValue());
            }
            Boolean i = p0.i();
            if (i != null) {
                settings.setLoadWithOverviewMode(i.booleanValue());
            }
            Boolean q = p0.q();
            if (q != null) {
                settings.setUseWideViewPort(q.booleanValue());
            }
            Boolean d = p0.d();
            if (d != null) {
                settings.setAllowContentAccess(d.booleanValue());
            }
            Boolean p = p0.p();
            if (p != null) {
                settings.setBuiltInZoomControls(p.booleanValue());
            }
            Boolean h = p0.h();
            if (h != null) {
                settings.setDisplayZoomControls(h.booleanValue());
            }
            Boolean l = p0.l();
            if (l != null) {
                settings.setSaveFormData(l.booleanValue());
            }
            Boolean c = p0.c();
            if (c != null) {
                settings.setGeolocationEnabled(c.booleanValue());
            }
            Boolean j = p0.j();
            if (j != null) {
                settings.setNeedInitialFocus(j.booleanValue());
            }
            Boolean f = p0.f();
            if (f != null) {
                settings.setAllowFileAccessFromFileURLs(f.booleanValue());
            }
            Boolean g = p0.g();
            if (g != null) {
                settings.setAllowUniversalAccessFromFileURLs(g.booleanValue());
            }
            Boolean o = p0.o();
            if (o != null) {
                settings.setLoadsImagesAutomatically(o.booleanValue());
            }
            Boolean n = p0.n();
            if (n != null) {
                settings.setBlockNetworkImage(n.booleanValue());
            }
            Integer a2 = p0.a();
            if (a2 != null) {
                settings.setMixedContentMode(a2.intValue());
            }
            Boolean k = p0.k();
            if (k != null) {
                settings.setOffscreenPreRaster(k.booleanValue());
            }
            if (!p0.g() || (m = p0.m()) == null) {
                return;
            }
            settings.setAlgorithmicDarkeningAllowed(m.booleanValue());
        }
    }
}
