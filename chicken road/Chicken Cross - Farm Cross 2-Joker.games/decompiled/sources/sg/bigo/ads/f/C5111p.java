package sg.bigo.ads.f;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.iab.omid.library.bigosg.ScriptInjector;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4956m;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.AdSize;
import sg.bigo.ads.api.BannerAdRequest;
import sg.bigo.ads.e0.C5085c;
import sg.bigo.ads.k1.C5270k;
import sg.bigo.ads.k1.C5271l;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.f.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5111p implements InterfaceC5097b {
    public final int A;

    /* renamed from: a, reason: collision with root package name */
    public sg.bigo.ads.k1.A f12773a;
    public C5270k b;
    public FrameLayout c;
    public C5110o e;
    public sg.bigo.ads.m1.c h;
    public final z i;
    public final Context k;
    public final Ad l;
    public final sg.bigo.ads.U0.c m;
    public final boolean n;
    public WeakReference p;
    public InterfaceC5108m q;
    public final BannerAdRequest r;
    public AdSize s;
    public sg.bigo.ads.A.e t;
    public AdOptionsView u;
    public LinearLayout v;
    public boolean w;
    public final sg.bigo.ads.L0.C x;
    public C5085c y;
    public int d = 1;
    public boolean f = false;
    public boolean g = false;
    public boolean j = false;
    public final ViewOnAttachStateChangeListenerC5101f z = new ViewOnAttachStateChangeListenerC5101f(this);
    public final AtomicBoolean o = new AtomicBoolean(false);

    public C5111p(Context context, sg.bigo.ads.P.j jVar, Ad ad, sg.bigo.ads.U0.c cVar, int i, z zVar, boolean z) {
        this.k = context;
        this.l = ad;
        this.m = cVar;
        this.A = i;
        this.i = zVar;
        this.n = z;
        if (jVar != null) {
            sg.bigo.ads.N.d dVar = jVar.c;
            if (dVar instanceof BannerAdRequest) {
                this.r = (BannerAdRequest) dVar;
            }
        }
        if (jVar == null || I.a((CharSequence) jVar.c.g)) {
            return;
        }
        this.x = new sg.bigo.ads.L0.C(jVar.c.g, context);
    }

    public static TextView a(C5111p c5111p, Context context, boolean z) {
        c5111p.getClass();
        if (!z) {
            return null;
        }
        TextView textView = new TextView(context);
        textView.setText(AbstractC4944a.a(context, R.string.bigo_ad_tag, new Object[0]));
        textView.setBackgroundResource(R.drawable.bigo_ad_bg_ad_tag_white_border);
        textView.setTextColor(I.a(-1, "#B2FFFFFF"));
        textView.setTextSize(9.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AbstractC4963u.a(context, 3), AbstractC4963u.a(context, 1), AbstractC4963u.a(context, 3), AbstractC4963u.a(context, 1));
        return textView;
    }

    public final void b() {
        try {
            sg.bigo.ads.m1.c cVar = this.h;
            if (cVar != null) {
                if (AbstractC5446j.e()) {
                    try {
                        cVar.f13123a.finish();
                    } catch (Throwable unused) {
                    }
                } else {
                    AbstractC5446j.a(2, null, new sg.bigo.ads.m1.b(cVar), 0L);
                }
                cVar.c = null;
            }
            C5110o c5110o = this.e;
            if (c5110o != null) {
                c5110o.a(new sg.bigo.ads.P.d(3001, 10102, "Adx media load error because of destroying before loaded"));
            }
            sg.bigo.ads.k1.A a2 = this.f12773a;
            if (a2 != null) {
                a2.a();
                this.f12773a = null;
            }
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                frameLayout.removeOnAttachStateChangeListener(this.z);
                this.c = null;
            }
            C5270k c5270k = this.b;
            if (c5270k != null) {
                X.c(c5270k);
                this.b = null;
            }
        } catch (Throwable unused2) {
        }
    }

    public final AdSize c() {
        ArrayList arrayList;
        if (this.s == null) {
            BannerAdRequest bannerAdRequest = this.r;
            if (bannerAdRequest != null && (arrayList = bannerAdRequest.i) != null) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AdSize adSize = (AdSize) it.next();
                    if (!adSize.c.equals(AdSize.ADAPTIVE)) {
                        this.s = adSize;
                        break;
                    }
                }
            }
            if (this.s == null) {
                Context context = this.k;
                this.s = AbstractC4963u.b(context, AbstractC4963u.c(context)) > 720 ? AdSize.LEADERBOARD : AdSize.BANNER;
            }
        }
        return this.s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if ((r1 instanceof sg.bigo.ads.e.h) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        ((sg.bigo.ads.e.h) r1).a(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r1 instanceof sg.bigo.ads.e.h) != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Context d() {
        Activity activity;
        Ad ad;
        WeakReference weakReference = this.p;
        if (weakReference == null || (activity = (Activity) weakReference.get()) == null) {
            activity = null;
        } else {
            Ad ad2 = this.l;
            if (ad2 instanceof sg.bigo.ads.e.h) {
                ((sg.bigo.ads.e.h) ad2).a(1);
            }
        }
        if (activity == null) {
            sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
            if (this.A == 2) {
                if (gVar != null && gVar.B.a(16)) {
                    activity = sg.bigo.ads.a0.o.a();
                    if (activity == null) {
                        AbstractC5496a.a("BannerAd", "Interstitial/Reward Video banner ad failed to get activity context.");
                    } else {
                        ad = this.l;
                    }
                }
            } else if (gVar != null && gVar.B.a(17)) {
                try {
                    Activity a2 = AbstractC4956m.a(this.c);
                    if (a2 != null) {
                        try {
                            Ad ad3 = this.l;
                            if (ad3 instanceof sg.bigo.ads.e.h) {
                                ((sg.bigo.ads.e.h) ad3).a(3);
                            }
                        } catch (Exception unused) {
                        }
                        activity = a2;
                    }
                } catch (Exception unused2) {
                }
                if (activity == null) {
                    activity = sg.bigo.ads.a0.o.a();
                    if (activity == null) {
                        AbstractC5496a.a("BannerAd", "Banner ad failed to get activity context.");
                    } else {
                        ad = this.l;
                    }
                }
            }
        }
        return activity == null ? this.k : activity;
    }

    public final void e() {
        AbstractC5098c.a(this, 6);
        Ad ad = this.l;
        if (ad instanceof v) {
            v vVar = (v) ad;
            WeakHashMap weakHashMap = AbstractC5098c.f12761a;
            C5096a c5096a = (C5096a) weakHashMap.get(this);
            if (c5096a == null) {
                c5096a = new C5096a();
                weakHashMap.put(this, c5096a);
            }
            long[] jArr = c5096a.f12760a;
            Long valueOf = Long.valueOf(jArr[6] - jArr[4]);
            synchronized (vVar) {
                vVar.N.put("attach_render_cost", valueOf);
            }
        }
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.g) {
            C5270k c5270k = this.b;
            if (!this.j && (c5270k instanceof sg.bigo.ads.E1.f)) {
                this.j = true;
                AbstractC5446j.a(1, null, new RunnableC5100e(this, c5270k), 0L);
            }
            C5270k c5270k2 = this.b;
            if (c5270k2 != null) {
                c5270k2.loadUrl("javascript:onViewImpression()");
            }
            sg.bigo.ads.m1.c cVar = this.h;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    public static TextView a(C5111p c5111p, Context context, boolean z, String str) {
        c5111p.getClass();
        if (!z || I.a((CharSequence) str)) {
            return null;
        }
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setBackgroundResource(R.drawable.bigo_ad_banner_advertiser_background);
        textView.setTextColor(-1);
        textView.setTextSize(9.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxWidth(AbstractC4963u.a(context, 240));
        textView.setBackgroundColor(I.a(-7829368, "#FFD6D9DB"));
        textView.setPadding(AbstractC4963u.a(context, 4), AbstractC4963u.a(context, 1), AbstractC4963u.a(context, 4), AbstractC4963u.a(context, 1));
        return textView;
    }

    public static LinearLayout a(C5111p c5111p, TextView textView) {
        c5111p.getClass();
        LinearLayout linearLayout = new LinearLayout(c5111p.k);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        if (textView != null) {
            linearLayout.addView(textView);
        }
        if (c5111p.u == null) {
            c5111p.u = new AdOptionsView(c5111p.k);
        }
        AdOptionsView adOptionsView = c5111p.u;
        sg.bigo.ads.U0.c cVar = c5111p.m;
        adOptionsView.a(cVar, cVar.O);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC4963u.a(c5111p.k, 16), AbstractC4963u.a(c5111p.k, 16), 8388659);
        layoutParams.leftMargin = AbstractC4963u.a(c5111p.k, 10);
        c5111p.u.setLayoutParams(layoutParams);
        linearLayout.addView(c5111p.u);
        return linearLayout;
    }

    public final View a() {
        if (this.c == null) {
            AbstractC5496a.a(2, 6, "BannerAd", "The banner ad is not ready, an empty view will be retrieved.");
            this.c = new FrameLayout(this.k);
        }
        AbstractC5098c.a(this, 3);
        this.c.addOnAttachStateChangeListener(this.z);
        return this.c;
    }

    public final boolean a(sg.bigo.ads.Q.a aVar) {
        FrameLayout frameLayout;
        boolean z = true;
        if (this.w) {
            return true;
        }
        sg.bigo.ads.U0.c cVar = this.m;
        if (cVar != null) {
            sg.bigo.ads.U0.g gVar = cVar.x0;
            if (gVar != null && !TextUtils.isEmpty(gVar.c)) {
                sg.bigo.ads.O.g.f12472a.getClass();
                if (this.f12773a == null) {
                    try {
                        this.f12773a = new sg.bigo.ads.k1.A(this.k, this.A);
                    } catch (NoClassDefFoundError unused) {
                        AbstractC5496a.a("BannerAd", "Server Banner is not support");
                    }
                    if (this.f12773a != null) {
                        if (this.u == null) {
                            this.u = new AdOptionsView(this.k);
                        }
                        sg.bigo.ads.k1.A a2 = this.f12773a;
                        a2.h = new C5105j(this, aVar);
                        sg.bigo.ads.U0.c cVar2 = this.m;
                        a2.k.g = !cVar2.c.u;
                        String str = cVar2.x0.c;
                        if (URLUtil.isNetworkUrl(str)) {
                            sg.bigo.ads.k1.A a3 = this.f12773a;
                            C5270k a4 = C5271l.a(a3.b);
                            a3.i = a4;
                            if (a4 != null) {
                                a3.k.a(a3.i);
                                a3.c.addView(a3.i, new FrameLayout.LayoutParams(-1, -1));
                            }
                            C5271l c5271l = a3.k;
                            C5270k c5270k = c5271l.d;
                            if (c5270k == null) {
                                AbstractC5496a.a("MraidBridge", "MRAID bridge called setContentHtml while WebView was not attached");
                            } else {
                                c5271l.f = false;
                                c5270k.loadUrl(str);
                            }
                        } else {
                            sg.bigo.ads.m1.g gVar2 = sg.bigo.ads.m1.f.f13126a;
                            if (gVar2.b) {
                                try {
                                    str = ScriptInjector.injectScriptContentIntoHtml(gVar2.f12790a, str);
                                } catch (Exception unused2) {
                                }
                            }
                            sg.bigo.ads.E1.b bVar = sg.bigo.ads.E1.b.g;
                            Context context = this.k;
                            if (!bVar.f.get()) {
                                boolean a5 = sg.bigo.ads.O.g.f12472a.B.a(0);
                                bVar.e = sg.bigo.ads.O.g.f12472a.A;
                                if (a5) {
                                    AbstractC5446j.a(1, null, new sg.bigo.ads.E1.a(bVar, context), 0L);
                                }
                            }
                            if (sg.bigo.ads.O.g.f12472a.B.a(0)) {
                                String str2 = bVar.f12790a;
                                String[] strArr = TextUtils.isEmpty(str2) ? new String[]{"insertFromHead\n<script>(function () {\n        //add listener error\n        window.addEventListener('error', function (e) {\n            if (e) {\n                var target = e.target || e.srcElement;\n                var isElementTarget = target instanceof HTMLElement;\n                if (isElementTarget) {\n                    var url = target.href || target.src;\n                    var width = parseInt(window.getComputedStyle(target).width);\n                    var height = parseInt(window.getComputedStyle(target).height);\n                    var errorInfo = { \"url\": url, \"w\": width, \"h\": height };\n                    //object格式 { \"act\": \"error\", \"type\": e.type, \"target\": e.target.nodeName, \"url\": \"http://testhehe.com/test\", \"w\": 20, \"h\": 20}\n                    var object = { \"act\": \"error\", \"type\": e.type, \"target\": e.target.nodeName, \"url\": url };\n                    if (width) object[\"w\"] = width;\n                    if (height) object[\"h\"] = height;\n                    window.bigossp.webCollect(JSON.stringify(object));\n                }\n            }\n        }, true);\n    }());\n</script>\n", "insertFromHead\n<script>\n    window.addEventListener('load', function (d) {\n        let backgroundDivs = Array.from(document.querySelectorAll('div'));\n        var backgroundImags = [];\n        backgroundDivs.forEach(div => {\n            let imgUrl = window.getComputedStyle(div).backgroundImage.match(/url\\([\"']?(.*)[\"']?\\)/)\n            if (!imgUrl) imgUrl = window.getComputedStyle(div, ':before').backgroundImage.match(/url\\([\"']?(.*)[\"']?\\)/);\n            if (!imgUrl) imgUrl = window.getComputedStyle(div, ':after').backgroundImage.match(/url\\([\"']?(.*)[\"']?\\)/);\n            if (imgUrl) {\n                var object = { \"act\": \"stash\", \"type\": \"mayError\", \"target\": \"background-image\", \"url\": imgUrl[1]};\n                backgroundImags.push(object);\n            }\n        });\n        // console.log('webCollect: ' + JSON.stringify(backgroundImags));\n        window.bigossp.webCollect(JSON.stringify(backgroundImags));\n    });\n</script>", "\n<script type=\"text/javascript\">\n    var object = { \"act\": \"notify\", \"type\": \"render_start\" };\n    window.bigossp.webCollect(JSON.stringify(object));\n    var imgs = document.images;\n    for (i = 0; i < imgs.length; i++) {\n        var img = imgs[i];\n        if (!checkImgForBigo(img)) {\n            img.addEventListener(\"load\", function () {\n                checkImgForBigo(img)\n            })\n        }\n    }\n    function checkImgForBigo(img) {\n        if (img.naturalWidth * img.naturalHeight >= 900 && img.offsetWidth * img.offsetHeight >= 900) {\n            var object = { \"act\": \"notify\", \"type\": \"render\", \"target\": \"IMG\", \"url\": img.src, \"w\": img.width, \"h\": img.height };\n            // console.log(\"notify render result: \" + JSON.stringify(object));\n            window.bigossp.webCollect(JSON.stringify(object));\n            return true;\n        }\n        return false;\n    }\n</script>"} : str2.startsWith("keepOldJs") ? new String[]{"insertFromHead\n<script>(function () {\n        //add listener error\n        window.addEventListener('error', function (e) {\n            if (e) {\n                var target = e.target || e.srcElement;\n                var isElementTarget = target instanceof HTMLElement;\n                if (isElementTarget) {\n                    var url = target.href || target.src;\n                    var width = parseInt(window.getComputedStyle(target).width);\n                    var height = parseInt(window.getComputedStyle(target).height);\n                    var errorInfo = { \"url\": url, \"w\": width, \"h\": height };\n                    //object格式 { \"act\": \"error\", \"type\": e.type, \"target\": e.target.nodeName, \"url\": \"http://testhehe.com/test\", \"w\": 20, \"h\": 20}\n                    var object = { \"act\": \"error\", \"type\": e.type, \"target\": e.target.nodeName, \"url\": url };\n                    if (width) object[\"w\"] = width;\n                    if (height) object[\"h\"] = height;\n                    window.bigossp.webCollect(JSON.stringify(object));\n                }\n            }\n        }, true);\n    }());\n</script>\n", "insertFromHead\n<script>\n    window.addEventListener('load', function (d) {\n        let backgroundDivs = Array.from(document.querySelectorAll('div'));\n        var backgroundImags = [];\n        backgroundDivs.forEach(div => {\n            let imgUrl = window.getComputedStyle(div).backgroundImage.match(/url\\([\"']?(.*)[\"']?\\)/)\n            if (!imgUrl) imgUrl = window.getComputedStyle(div, ':before').backgroundImage.match(/url\\([\"']?(.*)[\"']?\\)/);\n            if (!imgUrl) imgUrl = window.getComputedStyle(div, ':after').backgroundImage.match(/url\\([\"']?(.*)[\"']?\\)/);\n            if (imgUrl) {\n                var object = { \"act\": \"stash\", \"type\": \"mayError\", \"target\": \"background-image\", \"url\": imgUrl[1]};\n                backgroundImags.push(object);\n            }\n        });\n        // console.log('webCollect: ' + JSON.stringify(backgroundImags));\n        window.bigossp.webCollect(JSON.stringify(backgroundImags));\n    });\n</script>", "\n<script type=\"text/javascript\">\n    var object = { \"act\": \"notify\", \"type\": \"render_start\" };\n    window.bigossp.webCollect(JSON.stringify(object));\n    var imgs = document.images;\n    for (i = 0; i < imgs.length; i++) {\n        var img = imgs[i];\n        if (!checkImgForBigo(img)) {\n            img.addEventListener(\"load\", function () {\n                checkImgForBigo(img)\n            })\n        }\n    }\n    function checkImgForBigo(img) {\n        if (img.naturalWidth * img.naturalHeight >= 900 && img.offsetWidth * img.offsetHeight >= 900) {\n            var object = { \"act\": \"notify\", \"type\": \"render\", \"target\": \"IMG\", \"url\": img.src, \"w\": img.width, \"h\": img.height };\n            // console.log(\"notify render result: \" + JSON.stringify(object));\n            window.bigossp.webCollect(JSON.stringify(object));\n            return true;\n        }\n        return false;\n    }\n</script>", str2.substring(9)} : new String[]{str2};
                                if (strArr.length != 0) {
                                    StringBuilder sb = new StringBuilder(str);
                                    for (String str3 : strArr) {
                                        if (!TextUtils.isEmpty(str3)) {
                                            if (str3.startsWith("insertFromHead")) {
                                                sb.insert(0, str3.substring(14) + "\n");
                                            } else {
                                                sb.append("\n").append(str3);
                                            }
                                        }
                                    }
                                    str = sb.toString();
                                }
                            }
                            String str4 = str;
                            sg.bigo.ads.k1.A a6 = this.f12773a;
                            C5270k a7 = C5271l.a(a6.b);
                            a6.i = a7;
                            if (a7 != null) {
                                a6.k.a(a6.i);
                                a6.c.addView(a6.i, new FrameLayout.LayoutParams(-1, -1));
                            }
                            C5271l c5271l2 = a6.k;
                            C5270k c5270k2 = c5271l2.d;
                            if (c5270k2 == null) {
                                AbstractC5496a.a("MraidBridge", "MRAID bridge called setContentHtml before WebView was attached");
                            } else {
                                c5271l2.f = false;
                                c5270k2.loadDataWithBaseURL("https://mraid.bigo.sg", str4, "text/html", null, null);
                            }
                        }
                    }
                }
                sg.bigo.ads.k1.A a8 = this.f12773a;
                C5270k c5270k3 = a8.l.d != null ? a8.j : a8.i;
                this.b = c5270k3;
                if (c5270k3 != null) {
                    c5270k3.setOverScrollMode(2);
                    this.b.setHorizontalScrollBarEnabled(false);
                    this.b.setHorizontalScrollbarOverlay(false);
                    this.b.setVerticalScrollBarEnabled(false);
                    this.b.setVerticalScrollbarOverlay(false);
                    this.b.getSettings().setSupportZoom(false);
                    Object parent = this.b.getParent();
                    if (parent instanceof ViewGroup) {
                        View view = (View) parent;
                        Context context2 = this.k;
                        FrameLayout frameLayout2 = this.c;
                        if ((frameLayout2 instanceof FrameLayout) && frameLayout2.getChildCount() == 0) {
                            frameLayout = this.c;
                        } else {
                            if (this.c != null) {
                                AbstractC5496a.a("BannerAd", "bind banner view in abnormal situation.");
                            }
                            frameLayout = null;
                        }
                        sg.bigo.ads.U0.c cVar3 = this.m;
                        String str5 = cVar3 == null ? "" : cVar3.L;
                        boolean z2 = cVar3 != null && cVar3.N;
                        boolean z3 = cVar3 != null && cVar3.M;
                        FrameLayout frameLayout3 = frameLayout == null ? new FrameLayout(context2) : frameLayout;
                        frameLayout3.addView(view);
                        int i = this.A;
                        if (i == 3) {
                            X.a(this.b, new ViewTreeObserverOnGlobalLayoutListenerC5099d(this, frameLayout3, z3, z2, str5));
                        } else if (i == 1) {
                            X.a(this.b, new ViewTreeObserverOnGlobalLayoutListenerC5106k(this, frameLayout3, z3, z2, str5));
                        } else {
                            X.a(this.b, new ViewTreeObserverOnGlobalLayoutListenerC5107l(this, frameLayout3, z3, z2, str5));
                        }
                        this.c = frameLayout3;
                        AbstractC5098c.a(this, 0);
                        sg.bigo.ads.U0.g gVar3 = this.m.x0;
                        sg.bigo.ads.A.e eVar = this.t;
                        if (eVar != null) {
                            eVar.a(this.b, this.c, gVar3);
                        } else if (parent instanceof FrameLayout) {
                            int i2 = gVar3 != null ? gVar3.f12571a : 0;
                            int i3 = gVar3 != null ? gVar3.b : 0;
                            Context context3 = this.k;
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                            int i4 = this.A;
                            if (i4 == 3) {
                                int c = AbstractC4963u.c(this.k) - (AbstractC4963u.a(this.k, 40) * 2);
                                int a9 = this.k.getResources().getDisplayMetrics().heightPixels - (AbstractC4963u.a(this.k, 100) * 2);
                                int a10 = AbstractC4963u.a(this.k, i2);
                                int a11 = AbstractC4963u.a(this.k, i3);
                                int a12 = AbstractC4963u.a(this.k, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
                                int a13 = AbstractC4963u.a(this.k, 480);
                                boolean z4 = i2 <= 0 || a10 > c;
                                boolean z5 = i3 <= 0 || a11 > a9;
                                if (!z4 && !z5) {
                                    layoutParams.width = a10;
                                    layoutParams.height = a11;
                                    layoutParams.gravity = 17;
                                    this.c.setMinimumHeight(a11);
                                } else {
                                    int min = Math.min(a12, c);
                                    int min2 = Math.min(a13, a9);
                                    layoutParams.width = min;
                                    layoutParams.height = min2;
                                    layoutParams.gravity = 17;
                                    this.c.setMinimumHeight(min2);
                                }
                            } else if (i2 > 0 && i3 > 0) {
                                layoutParams.width = AbstractC4963u.a(context3, i2);
                                layoutParams.height = AbstractC4963u.a(context3, i3);
                                layoutParams.gravity = 17;
                                this.c.setMinimumHeight(AbstractC4963u.a(context3, i3));
                            } else if (i4 == 2) {
                                layoutParams.width = -1;
                                layoutParams.height = -1;
                            } else {
                                AdSize c2 = c();
                                this.s = c2;
                                layoutParams.width = AbstractC4963u.a(context3, c2.getWidth());
                                layoutParams.height = AbstractC4963u.a(context3, this.s.getHeight());
                                layoutParams.gravity = 17;
                            }
                        }
                    }
                    this.w = z;
                    return z;
                }
            } else {
                sg.bigo.ads.s1.b.a(3001, 10104, "Banner with no data", this.m);
            }
        }
        z = false;
        this.w = z;
        return z;
    }

    public final void a(String str, JSONObject jSONObject) {
        if (this.o.get()) {
            return;
        }
        if (this.i == null) {
            Objects.toString(jSONObject);
            return;
        }
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("adView");
        if (optJSONObject == null) {
            jSONObject.toString();
            return;
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("onScreenGeometry");
        if (optJSONObject2 == null) {
            jSONObject.toString();
        } else if (optJSONObject2.optDouble("pixels", 0.0d) > 0.0d) {
            this.o.set(true);
            this.i.b();
        }
    }
}
