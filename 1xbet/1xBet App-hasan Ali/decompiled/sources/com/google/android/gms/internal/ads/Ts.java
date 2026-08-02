package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Ts extends Rs {

    /* renamed from: e, reason: collision with root package name */
    public WebView f11695e;
    public Long f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f11696g;

    public Ts(String str, Map map) {
        super(str);
        this.f = null;
        this.f11696g = map;
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final void b() {
        super.b();
        new Handler().postDelayed(new RunnableC1303mm(this), Math.max(4000 - (this.f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f11695e = null;
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final void d(C1893zs c1893zs, Z1 z12) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap((HashMap) z12.f12441n);
        Iterator it = unmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            unmodifiableMap.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        e(c1893zs, z12, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final void f() {
        WebView webView = new WebView(Ms.f10735m.f10737l);
        this.f11695e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f11695e.getSettings().setAllowContentAccess(false);
        this.f11695e.getSettings().setAllowFileAccess(false);
        this.f11695e.setWebViewClient(new P2.j(1, this));
        this.f11461b = new X.m(this.f11695e);
        AbstractC1668us.k0(this.f11695e, null);
        Map map = this.f11696g;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            map.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        this.f = Long.valueOf(System.nanoTime());
    }
}
