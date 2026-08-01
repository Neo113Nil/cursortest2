package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.applovin.impl.c5;
import com.applovin.impl.c8;
import com.applovin.impl.j2;
import com.applovin.impl.l0;
import com.applovin.impl.p0;
import com.applovin.impl.s8;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t;
import com.applovin.impl.t7;
import com.applovin.impl.u7;
import com.applovin.impl.x7;
import com.applovin.impl.y4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public class b extends l0 {
    private static final Set j = Collections.newSetFromMap(new WeakHashMap());
    private static final Object k = new Object();
    private final p c;
    private final com.applovin.impl.sdk.l d;
    private com.applovin.impl.sdk.ad.b e;
    private boolean f;
    private boolean g;
    private final List h;
    private final Object i;

    class a extends y4 {
        a() {
        }

        @Override // com.applovin.impl.y4
        protected Map a() {
            return CollectionUtils.hashMap("name", "AdWebView");
        }
    }

    public b(c cVar, com.applovin.impl.sdk.l lVar, Context context) {
        super(context);
        this.h = new ArrayList();
        this.i = new Object();
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.d = lVar;
        this.c = lVar.Q();
        Integer num = (Integer) lVar.a(c5.N6);
        if (num.intValue() > 0) {
            synchronized (k) {
                Set set = j;
                set.add(this);
                t7.a("AdWebView", set.size(), num.intValue(), lVar.E());
            }
        }
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(cVar != null ? cVar : new a());
        setWebChromeClient(new t(cVar != null ? cVar.d() : null, lVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (p0.f() && ((Boolean) lVar.a(c5.j6)).booleanValue()) {
            setWebViewRenderProcessClient(new d(lVar).a());
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.b$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean a2;
                a2 = b.a(view, motionEvent);
                return a2;
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.b$$ExternalSyntheticLambda1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean a2;
                a2 = b.this.a(view);
                return a2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    private void b() {
        synchronized (this.i) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                s8.a(this, (String) it.next(), "AdWebView", this.d);
            }
            this.h.clear();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f = true;
        this.g = false;
        super.destroy();
    }

    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.e;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void setAdHtmlLoaded(boolean z) {
        this.g = z;
        if (z && ((Boolean) this.d.a(c5.F6)).booleanValue()) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        if (!p.a()) {
            return true;
        }
        this.c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String str;
        if (!this.f) {
            this.e = bVar;
            try {
                applySettings(bVar);
                if (t7.a(bVar.getSize())) {
                    setVisibility(0);
                }
                bVar.a(SystemClock.elapsedRealtime());
                if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                    loadDataWithBaseURL(bVar.l(), ((com.applovin.impl.sdk.ad.a) bVar).h1(), "text/html", null, "");
                    if (p.a()) {
                        this.c.a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (bVar instanceof u7) {
                    u7 u7Var = (u7) bVar;
                    x7 g1 = u7Var.g1();
                    if (g1 != null) {
                        c8 e = g1.e();
                        Uri c = e.c();
                        if (c != null) {
                            str = c.toString();
                        } else {
                            str = "";
                        }
                        String str2 = str;
                        String b = e.b();
                        String i1 = u7Var.i1();
                        if (!StringUtils.isValidString(str2) && !StringUtils.isValidString(b)) {
                            if (p.a()) {
                                this.c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (e.d() == c8.a.STATIC) {
                            if (p.a()) {
                                this.c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String a2 = a((String) this.d.a(c5.X4), str2);
                            if (u7Var.x1() && u7Var.isOpenMeasurementEnabled() && u7Var.y1()) {
                                a2 = this.d.g0().a(a2, j2.a((AppLovinAdImpl) bVar));
                            }
                            loadDataWithBaseURL(bVar.l(), a2, "text/html", null, "");
                            return;
                        }
                        if (e.d() == c8.a.HTML) {
                            if (StringUtils.isValidString(b)) {
                                String a3 = a(i1, b);
                                String str3 = StringUtils.isValidString(a3) ? a3 : b;
                                if (p.a()) {
                                    this.c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str3);
                                }
                                loadDataWithBaseURL(bVar.l(), str3, "text/html", null, "");
                                return;
                            }
                            if (StringUtils.isValidString(str2)) {
                                if (p.a()) {
                                    this.c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(str2, bVar.l(), i1, this.d, u7Var);
                                return;
                            }
                            return;
                        }
                        if (e.d() == c8.a.IFRAME) {
                            if (StringUtils.isValidString(str2)) {
                                if (p.a()) {
                                    this.c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(str2, bVar.l(), i1, this.d, u7Var);
                                return;
                            } else {
                                if (StringUtils.isValidString(b)) {
                                    String a4 = a(i1, b);
                                    String str4 = StringUtils.isValidString(a4) ? a4 : b;
                                    if (p.a()) {
                                        this.c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str4);
                                    }
                                    loadDataWithBaseURL(bVar.l(), str4, "text/html", null, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (p.a()) {
                            this.c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (p.a()) {
                        this.c.a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null") + ") - " + th);
            }
        }
        p.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    public void a(String str) {
        if (((Boolean) this.d.a(c5.F6)).booleanValue()) {
            if (this.g) {
                s8.a(this, str, "AdWebView", this.d);
                return;
            }
            synchronized (this.h) {
                this.h.add(str);
            }
            return;
        }
        s8.a(this, str, "AdWebView", this.d);
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.l lVar, u7 u7Var) {
        String a2 = a(str3, str);
        if (StringUtils.isValidString(a2)) {
            if (p.a()) {
                this.c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a2);
            }
            loadDataWithBaseURL(str2, a2, "text/html", null, "");
            return;
        }
        String a3 = a((String) lVar.a(c5.Y4), str);
        if (StringUtils.isValidString(a3)) {
            if (u7Var.x1() && u7Var.isOpenMeasurementEnabled()) {
                a3 = lVar.g0().a(a3, j2.a((AppLovinAdImpl) u7Var));
            }
            String str4 = a3;
            if (p.a()) {
                this.c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + str4);
            }
            loadDataWithBaseURL(str2, str4, "text/html", null, "");
            return;
        }
        if (p.a()) {
            this.c.a("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        loadUrl(str);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }
}
