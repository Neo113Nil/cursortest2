package com.google.android.gms.internal.ads;

import Q2.InterfaceC0347a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.gf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1028gf extends WebViewClient implements InterfaceC0347a, Vi {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f13597R = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f13598A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f13599B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f13600C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f13601D;

    /* renamed from: E, reason: collision with root package name */
    public S2.c f13602E;

    /* renamed from: F, reason: collision with root package name */
    public C0566Cb f13603F;

    /* renamed from: G, reason: collision with root package name */
    public P2.a f13604G;

    /* renamed from: I, reason: collision with root package name */
    public InterfaceC0758ad f13606I;
    public C1482ql J;
    public boolean K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f13607L;

    /* renamed from: M, reason: collision with root package name */
    public int f13608M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f13609N;

    /* renamed from: P, reason: collision with root package name */
    public final BinderC0857cn f13611P;

    /* renamed from: Q, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC0691Te f13612Q;

    /* renamed from: k, reason: collision with root package name */
    public final C0733Ze f13613k;

    /* renamed from: l, reason: collision with root package name */
    public final C1773x6 f13614l;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0347a f13617o;

    /* renamed from: p, reason: collision with root package name */
    public S2.m f13618p;

    /* renamed from: q, reason: collision with root package name */
    public Cif f13619q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC1161jf f13620r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC1462q9 f13621s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1506r9 f13622t;

    /* renamed from: u, reason: collision with root package name */
    public Vi f13623u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13624v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13625w;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f13615m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final Object f13616n = new Object();

    /* renamed from: x, reason: collision with root package name */
    public int f13626x = 0;

    /* renamed from: y, reason: collision with root package name */
    public String f13627y = "";

    /* renamed from: z, reason: collision with root package name */
    public String f13628z = "";

    /* renamed from: H, reason: collision with root package name */
    public C1876zb f13605H = null;

    /* renamed from: O, reason: collision with root package name */
    public final HashSet f13610O = new HashSet(Arrays.asList(((String) Q2.r.f5053d.f5056c.a(F7.q5)).split(",")));

    public C1028gf(C0733Ze c0733Ze, C1773x6 c1773x6, boolean z3, C0566Cb c0566Cb, BinderC0857cn binderC0857cn) {
        this.f13614l = c1773x6;
        this.f13613k = c0733Ze;
        this.f13598A = z3;
        this.f13603F = c0566Cb;
        this.f13611P = binderC0857cn;
    }

    public static final boolean j0(C0733Ze c0733Ze) {
        Lq lq = c0733Ze.f12501k.f12890t;
        return lq != null && lq.b();
    }

    public static final boolean l0(boolean z3, C0733Ze c0733Ze) {
        return (!z3 || c0733Ze.f12501k.M().b() || c0733Ze.f12501k.G0().equals("interstitial_mb")) ? false : true;
    }

    public static WebResourceResponse y() {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8716L0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public final void B0(Uri uri) {
        T2.G.m("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.f13615m;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            T2.G.m("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.p6)).booleanValue() || P2.o.f4767B.f4774g.c() == null) {
                return;
            }
            AbstractC0613Id.f9539a.execute(new K4(16, (path == null || path.length() < 2) ? "null" : path.substring(1)));
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        A7 a7 = F7.p5;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && this.f13610O.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) rVar.f5056c.a(F7.r5)).intValue()) {
                T2.G.m("Parsing gmsg query params on BG thread: ".concat(path));
                T2.L l5 = P2.o.f4767B.f4771c;
                l5.getClass();
                RunnableFutureC0823bx runnableFutureC0823bx = new RunnableFutureC0823bx(new P2.l(1, uri));
                l5.f5681k.execute(runnableFutureC0823bx);
                runnableFutureC0823bx.a(new Kw(0, runnableFutureC0823bx, new m2.g(this, list, path, uri, 6)), AbstractC0613Id.f);
                return;
            }
        }
        T2.L l6 = P2.o.f4767B.f4771c;
        D(T2.L.l(uri), list, path);
    }

    public final WebResourceResponse C(String str, Map map) {
        HttpURLConnection httpURLConnection;
        WebResourceResponse webResourceResponse;
        C0733Ze c0733Ze = this.f13613k;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                P2.o.f4767B.f4771c.z(c0733Ze.getContext(), c0733Ze.f12501k.f12885o.f5852k, httpURLConnection, 60000);
                U2.g gVar = new U2.g();
                webResourceResponse = null;
                gVar.a(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                gVar.b(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (!headerField.startsWith("tel:")) {
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (protocol == null) {
                        U2.j.i("Protocol is null");
                        webResourceResponse = y();
                        break;
                    }
                    if (!protocol.equals("http") && !protocol.equals("https")) {
                        U2.j.i("Unsupported scheme: " + protocol);
                        webResourceResponse = y();
                        break;
                    }
                    U2.j.d("Redirecting to " + headerField);
                    httpURLConnection.disconnect();
                    url = url2;
                }
            }
            String contentType = httpURLConnection.getContentType();
            String str2 = "";
            String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i5 = 1;
                    while (true) {
                        if (i5 >= split.length) {
                            break;
                        }
                        if (split[i5].trim().startsWith("charset")) {
                            String[] split2 = split[i5].trim().split("=");
                            if (split2.length > 1) {
                                str2 = split2[1].trim();
                                break;
                            }
                        }
                        i5++;
                    }
                }
            }
            String str3 = str2;
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                    hashMap.put(entry2.getKey(), entry2.getValue().get(0));
                }
            }
            Q1.j jVar = P2.o.f4767B.f4773e;
            int responseCode2 = httpURLConnection.getResponseCode();
            String responseMessage = httpURLConnection.getResponseMessage();
            InputStream inputStream = httpURLConnection.getInputStream();
            jVar.getClass();
            webResourceResponse = new WebResourceResponse(trim, str3, responseCode2, responseMessage, hashMap, inputStream);
            return webResourceResponse;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final void D(Map map, List list, String str) {
        if (T2.G.o()) {
            T2.G.m("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                T2.G.m("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC1821y9) it.next()).b(this.f13613k, map);
        }
    }

    @Override // com.google.android.gms.internal.ads.Vi
    public final void E() {
        Vi vi = this.f13623u;
        if (vi != null) {
            vi.E();
        }
    }

    public final void H() {
        synchronized (this.f13616n) {
        }
    }

    public final void L0(int i, int i5) {
        C0566Cb c0566Cb = this.f13603F;
        if (c0566Cb != null) {
            c0566Cb.A(i, i5);
        }
        C1876zb c1876zb = this.f13605H;
        if (c1876zb != null) {
            synchronized (c1876zb.f16604w) {
                c1876zb.f16598q = i;
                c1876zb.f16599r = i5;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(View view, InterfaceC0758ad interfaceC0758ad, int i) {
        boolean z3;
        Bitmap bitmap;
        C0724Yc c0724Yc = (C0724Yc) interfaceC0758ad;
        boolean z5 = c0724Yc.f12342g.f12488m;
        if (!z5 || (z3 = c0724Yc.f12344j) || i <= 0) {
            return;
        }
        if (z5 && !z3) {
            T2.L l5 = P2.o.f4767B.f4771c;
            Bitmap bitmap2 = null;
            if (view != null) {
                try {
                    boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                    } catch (RuntimeException e3) {
                        e = e3;
                        U2.j.g("Fail to capture the web view", e);
                        if (bitmap != null) {
                        }
                        if (bitmap2 != null) {
                        }
                        if (c0724Yc.f12342g.f12488m) {
                            return;
                        } else {
                            return;
                        }
                    }
                } catch (RuntimeException e5) {
                    e = e5;
                    bitmap = null;
                }
                if (bitmap != null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width != 0 && height != 0) {
                            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(createBitmap);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap2 = createBitmap;
                        }
                        U2.j.i("Width or height of view is zero");
                    } catch (RuntimeException e6) {
                        U2.j.g("Fail to capture the webview", e6);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                AbstractC1803xs.n("Failed to capture the webview bitmap.");
            } else {
                c0724Yc.f12344j = true;
                Kw kw = new Kw(11, c0724Yc, bitmap2);
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    kw.run();
                } else {
                    AbstractC0613Id.f9539a.execute(kw);
                }
            }
        }
        if (c0724Yc.f12342g.f12488m || c0724Yc.f12344j) {
            return;
        }
        T2.L.f5672l.postDelayed(new RunnableC1609te(this, view, c0724Yc, i), 100L);
    }

    public final void T0() {
        InterfaceC0758ad interfaceC0758ad = this.f13606I;
        if (interfaceC0758ad != null) {
            C0733Ze c0733Ze = this.f13613k;
            ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = c0733Ze.f12501k;
            Field field = n1.C.f18360a;
            if (viewTreeObserverOnGlobalLayoutListenerC0805bf.isAttachedToWindow()) {
                Q(viewTreeObserverOnGlobalLayoutListenerC0805bf, interfaceC0758ad, 10);
                return;
            }
            ViewOnAttachStateChangeListenerC0691Te viewOnAttachStateChangeListenerC0691Te = this.f13612Q;
            if (viewOnAttachStateChangeListenerC0691Te != null) {
                c0733Ze.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0691Te);
            }
            ViewOnAttachStateChangeListenerC0691Te viewOnAttachStateChangeListenerC0691Te2 = new ViewOnAttachStateChangeListenerC0691Te(this, interfaceC0758ad);
            this.f13612Q = viewOnAttachStateChangeListenerC0691Te2;
            c0733Ze.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0691Te2);
        }
    }

    public final void W0(S2.e eVar, boolean z3, boolean z5, String str) {
        boolean z6;
        C0733Ze c0733Ze = this.f13613k;
        boolean r02 = c0733Ze.f12501k.r0();
        boolean z7 = false;
        boolean z8 = l0(r02, c0733Ze) || z5;
        if (z8 || !z3) {
            z6 = r02;
            z7 = true;
        } else {
            z6 = r02;
        }
        X0(new AdOverlayInfoParcel(eVar, z8 ? null : this.f13617o, z6 ? null : this.f13618p, this.f13602E, c0733Ze.f12501k.f12885o, c0733Ze, z7 ? null : this.f13623u, str));
    }

    public final void X0(AdOverlayInfoParcel adOverlayInfoParcel) {
        S2.e eVar;
        C1876zb c1876zb = this.f13605H;
        if (c1876zb != null) {
            synchronized (c1876zb.f16604w) {
                r1 = c1876zb.f16593D != null;
            }
        }
        Q1.j jVar = P2.o.f4767B.f4770b;
        Q1.j.g(this.f13613k.getContext(), adOverlayInfoParcel, !r1, this.J);
        InterfaceC0758ad interfaceC0758ad = this.f13606I;
        if (interfaceC0758ad != null) {
            String str = adOverlayInfoParcel.f7457v;
            if (str == null && (eVar = adOverlayInfoParcel.f7446k) != null) {
                str = eVar.f5314l;
            }
            ((C0724Yc) interfaceC0758ad).c(str);
        }
    }

    public final void a(String str, InterfaceC1821y9 interfaceC1821y9) {
        synchronized (this.f13616n) {
            try {
                List list = (List) this.f13615m.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    this.f13615m.put(str, list);
                }
                list.add(interfaceC1821y9);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z3) {
        synchronized (this.f13616n) {
            this.f13601D = z3;
        }
    }

    public final void d(C1074hg c1074hg, Xm xm, C1041gs c1041gs) {
        j("/click");
        if (xm != null && c1041gs != null) {
            a("/click", new Jk(this.f13623u, c1074hg, c1041gs, xm));
        } else {
            a("/click", new C1641u9(0, this.f13623u, c1074hg));
        }
    }

    public final void i(C1074hg c1074hg, Xm xm, C1482ql c1482ql) {
        j("/open");
        a("/open", new E9(this.f13604G, this.f13605H, xm, c1482ql, c1074hg));
    }

    public final void j(String str) {
        synchronized (this.f13616n) {
            try {
                List list = (List) this.f13615m.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k() {
        boolean z3;
        synchronized (this.f13616n) {
            z3 = this.f13600C;
        }
        return z3;
    }

    public final void n0() {
        synchronized (this.f13616n) {
        }
    }

    public final boolean o() {
        boolean z3;
        synchronized (this.f13616n) {
            z3 = this.f13601D;
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0267 A[Catch: NoClassDefFoundError -> 0x001e, Exception -> 0x0021, TryCatch #14 {Exception -> 0x0021, NoClassDefFoundError -> 0x001e, blocks: (B:3:0x000e, B:5:0x0017, B:7:0x001b, B:8:0x0024, B:10:0x0034, B:13:0x003b, B:15:0x0047, B:17:0x0066, B:19:0x0080, B:21:0x0097, B:22:0x009a, B:23:0x009d, B:26:0x00b7, B:29:0x00bf, B:32:0x00cd, B:33:0x00de, B:44:0x0144, B:45:0x016c, B:48:0x02b9, B:50:0x02cb, B:52:0x02d1, B:54:0x02df, B:79:0x020e, B:70:0x023a, B:71:0x0266, B:65:0x01c1, B:105:0x00d6, B:106:0x0267, B:108:0x0271, B:110:0x0277, B:112:0x02aa), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7 A[Catch: NoClassDefFoundError -> 0x001e, Exception -> 0x0021, TRY_ENTER, TryCatch #14 {Exception -> 0x0021, NoClassDefFoundError -> 0x001e, blocks: (B:3:0x000e, B:5:0x0017, B:7:0x001b, B:8:0x0024, B:10:0x0034, B:13:0x003b, B:15:0x0047, B:17:0x0066, B:19:0x0080, B:21:0x0097, B:22:0x009a, B:23:0x009d, B:26:0x00b7, B:29:0x00bf, B:32:0x00cd, B:33:0x00de, B:44:0x0144, B:45:0x016c, B:48:0x02b9, B:50:0x02cb, B:52:0x02d1, B:54:0x02df, B:79:0x020e, B:70:0x023a, B:71:0x0266, B:65:0x01c1, B:105:0x00d6, B:106:0x0267, B:108:0x0271, B:110:0x0277, B:112:0x02aa), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02b9 A[Catch: NoClassDefFoundError -> 0x001e, Exception -> 0x0021, TryCatch #14 {Exception -> 0x0021, NoClassDefFoundError -> 0x001e, blocks: (B:3:0x000e, B:5:0x0017, B:7:0x001b, B:8:0x0024, B:10:0x0034, B:13:0x003b, B:15:0x0047, B:17:0x0066, B:19:0x0080, B:21:0x0097, B:22:0x009a, B:23:0x009d, B:26:0x00b7, B:29:0x00bf, B:32:0x00cd, B:33:0x00de, B:44:0x0144, B:45:0x016c, B:48:0x02b9, B:50:0x02cb, B:52:0x02d1, B:54:0x02df, B:79:0x020e, B:70:0x023a, B:71:0x0266, B:65:0x01c1, B:105:0x00d6, B:106:0x0267, B:108:0x0271, B:110:0x0277, B:112:0x02aa), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02d1 A[Catch: NoClassDefFoundError -> 0x001e, Exception -> 0x0021, TryCatch #14 {Exception -> 0x0021, NoClassDefFoundError -> 0x001e, blocks: (B:3:0x000e, B:5:0x0017, B:7:0x001b, B:8:0x0024, B:10:0x0034, B:13:0x003b, B:15:0x0047, B:17:0x0066, B:19:0x0080, B:21:0x0097, B:22:0x009a, B:23:0x009d, B:26:0x00b7, B:29:0x00bf, B:32:0x00cd, B:33:0x00de, B:44:0x0144, B:45:0x016c, B:48:0x02b9, B:50:0x02cb, B:52:0x02d1, B:54:0x02df, B:79:0x020e, B:70:0x023a, B:71:0x0266, B:65:0x01c1, B:105:0x00d6, B:106:0x0267, B:108:0x0271, B:110:0x0277, B:112:0x02aa), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0201 A[Catch: all -> 0x0209, TryCatch #2 {all -> 0x0209, blocks: (B:75:0x01ef, B:77:0x0201, B:78:0x020b), top: B:74:0x01ef }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse o0(String str, Map map) {
        WebResourceResponse webResourceResponse;
        int i;
        A7 a7;
        Q2.r rVar;
        InputStream inputStream;
        InputStream b3;
        Throwable th;
        boolean z3;
        boolean z5;
        boolean z6;
        boolean z7;
        String str2;
        C0733Ze c0733Ze = this.f13613k;
        try {
            HashMap hashMap = new HashMap();
            ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = c0733Ze.f12501k;
            ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf2 = c0733Ze.f12501k;
            Lq lq = viewTreeObserverOnGlobalLayoutListenerC0805bf.f12890t;
            if (lq != null) {
                hashMap = lq.f10532w0;
            }
            String M5 = AbstractC1668us.M(str, c0733Ze.getContext(), this.f13609N, hashMap);
            if (!M5.equals(str)) {
                return C(M5, map);
            }
            C1459q6 a5 = C1459q6.a(Uri.parse(str));
            if (a5 != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("Access-Control-Allow-Origin", "*");
                Uri parse = Uri.parse(str);
                webResourceResponse = null;
                if (parse.getQueryParameterNames().contains("range")) {
                    List i5 = Hq.e(new C1221ku('-')).i(parse.getQueryParameter("range"));
                    if (i5.size() == 2) {
                        int parseInt = Integer.parseInt((String) i5.get(0));
                        int parseInt2 = Integer.parseInt((String) i5.get(1)) + 1;
                        if (parseInt > 0) {
                            a5.f15102r = parseInt;
                        }
                        i = parseInt2 - parseInt;
                        a7 = F7.h4;
                        rVar = Q2.r.f5053d;
                        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                            C1369o6 f = P2.o.f4767B.i.f(a5);
                            if (f == null || !f.e()) {
                                inputStream = null;
                            } else {
                                hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(f.c()));
                                hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(f.g()));
                                hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(f.f()));
                                hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(f.a()));
                                b3 = f.b();
                                if (i != -1) {
                                    int i6 = Sv.f11600a;
                                    inputStream = new I3(b3, i);
                                }
                            }
                            if (inputStream != null) {
                                return new WebResourceResponse("", "", 200, "OK", hashMap2, inputStream);
                            }
                        } else {
                            String t5 = viewTreeObserverOnGlobalLayoutListenerC0805bf2.t();
                            if (t5 == null) {
                                t5 = "";
                            }
                            a5.f15103s = t5;
                            a5.f15104t = viewTreeObserverOnGlobalLayoutListenerC0805bf2.c();
                            boolean z8 = a5.f15101q;
                            D7 d7 = rVar.f5056c;
                            long longValue = (z8 ? (Long) d7.a(F7.f8846j4) : (Long) d7.a(F7.f8840i4)).longValue();
                            P2.o oVar = P2.o.f4767B;
                            oVar.f4776j.getClass();
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            C1548s6 p5 = C1543s1.p(c0733Ze.getContext(), a5);
                            try {
                                C1683v6 c1683v6 = (C1683v6) p5.f10334k.get(longValue, TimeUnit.MILLISECONDS);
                                try {
                                    try {
                                        hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(c1683v6.f15961b));
                                        hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(c1683v6.f15962c));
                                        hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(c1683v6.f15964e));
                                        hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(c1683v6.f15963d));
                                        InputStream inputStream2 = c1683v6.f15960a;
                                        if (i != -1) {
                                            long j5 = i;
                                            try {
                                                int i7 = Sv.f11600a;
                                                b3 = new I3(inputStream2, j5);
                                            } catch (InterruptedException e3) {
                                                e = e3;
                                                b3 = inputStream2;
                                                z7 = true;
                                                z6 = true;
                                                try {
                                                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8864m4)).booleanValue()) {
                                                        P2.o.f4767B.f4774g.i("AdWebViewClient.interceptRequest.gcache", e);
                                                    }
                                                    p5.cancel(z7);
                                                    Thread.currentThread().interrupt();
                                                    P2.o.f4767B.f4776j.getClass();
                                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    T2.L.f5672l.post(new RunnableC1027ge(this, z6, elapsedRealtime2, 2));
                                                    str2 = "Cache connection took " + elapsedRealtime2 + "ms";
                                                    T2.G.m(str2);
                                                    inputStream = b3;
                                                    if (inputStream != null) {
                                                    }
                                                    if (U2.g.c()) {
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    z3 = z6;
                                                    th = th;
                                                    P2.o.f4767B.f4776j.getClass();
                                                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    T2.L.f5672l.post(new RunnableC1027ge(this, z3, elapsedRealtime3, 2));
                                                    T2.G.m("Cache connection took " + elapsedRealtime3 + "ms");
                                                    throw th;
                                                }
                                            } catch (ExecutionException e5) {
                                                e = e5;
                                                b3 = inputStream2;
                                                z5 = true;
                                                z6 = true;
                                                try {
                                                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8864m4)).booleanValue()) {
                                                    }
                                                    p5.cancel(z5);
                                                    P2.o.f4767B.f4776j.getClass();
                                                    long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    T2.L.f5672l.post(new RunnableC1027ge(this, z6, elapsedRealtime4, 2));
                                                    str2 = "Cache connection took " + elapsedRealtime4 + "ms";
                                                    T2.G.m(str2);
                                                    inputStream = b3;
                                                    if (inputStream != null) {
                                                    }
                                                    if (U2.g.c()) {
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    z3 = z6;
                                                    th = th;
                                                    P2.o.f4767B.f4776j.getClass();
                                                    long elapsedRealtime32 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    T2.L.f5672l.post(new RunnableC1027ge(this, z3, elapsedRealtime32, 2));
                                                    T2.G.m("Cache connection took " + elapsedRealtime32 + "ms");
                                                    throw th;
                                                }
                                            } catch (TimeoutException e6) {
                                                e = e6;
                                                b3 = inputStream2;
                                                z5 = true;
                                                z6 = true;
                                                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8864m4)).booleanValue()) {
                                                }
                                                p5.cancel(z5);
                                                P2.o.f4767B.f4776j.getClass();
                                                long elapsedRealtime42 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                T2.L.f5672l.post(new RunnableC1027ge(this, z6, elapsedRealtime42, 2));
                                                str2 = "Cache connection took " + elapsedRealtime42 + "ms";
                                                T2.G.m(str2);
                                                inputStream = b3;
                                                if (inputStream != null) {
                                                }
                                                if (U2.g.c()) {
                                                }
                                            }
                                        } else {
                                            b3 = inputStream2;
                                        }
                                        oVar.f4776j.getClass();
                                        long elapsedRealtime5 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                        T2.L.f5672l.post(new RunnableC1027ge(this, true, elapsedRealtime5, 2));
                                        str2 = "Cache connection took " + elapsedRealtime5 + "ms";
                                    } catch (Throwable th4) {
                                        th = th4;
                                        z3 = true;
                                        th = th;
                                        P2.o.f4767B.f4776j.getClass();
                                        long elapsedRealtime322 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                        T2.L.f5672l.post(new RunnableC1027ge(this, z3, elapsedRealtime322, 2));
                                        T2.G.m("Cache connection took " + elapsedRealtime322 + "ms");
                                        throw th;
                                    }
                                } catch (InterruptedException e7) {
                                    e = e7;
                                    z7 = true;
                                    z6 = true;
                                    b3 = null;
                                } catch (ExecutionException e8) {
                                    e = e8;
                                    z5 = true;
                                    z6 = true;
                                    b3 = null;
                                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8864m4)).booleanValue()) {
                                        P2.o.f4767B.f4774g.i("AdWebViewClient.interceptRequest.gcache", e);
                                    }
                                    p5.cancel(z5);
                                    P2.o.f4767B.f4776j.getClass();
                                    long elapsedRealtime422 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    T2.L.f5672l.post(new RunnableC1027ge(this, z6, elapsedRealtime422, 2));
                                    str2 = "Cache connection took " + elapsedRealtime422 + "ms";
                                    T2.G.m(str2);
                                    inputStream = b3;
                                    if (inputStream != null) {
                                    }
                                    if (U2.g.c()) {
                                    }
                                } catch (TimeoutException e9) {
                                    e = e9;
                                    z5 = true;
                                    z6 = true;
                                    b3 = null;
                                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8864m4)).booleanValue()) {
                                    }
                                    p5.cancel(z5);
                                    P2.o.f4767B.f4776j.getClass();
                                    long elapsedRealtime4222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    T2.L.f5672l.post(new RunnableC1027ge(this, z6, elapsedRealtime4222, 2));
                                    str2 = "Cache connection took " + elapsedRealtime4222 + "ms";
                                    T2.G.m(str2);
                                    inputStream = b3;
                                    if (inputStream != null) {
                                    }
                                    if (U2.g.c()) {
                                    }
                                }
                            } catch (InterruptedException e10) {
                                e = e10;
                                z7 = true;
                                b3 = null;
                                z6 = false;
                            } catch (ExecutionException e11) {
                                e = e11;
                                z5 = true;
                                b3 = null;
                                z6 = false;
                                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8864m4)).booleanValue()) {
                                }
                                p5.cancel(z5);
                                P2.o.f4767B.f4776j.getClass();
                                long elapsedRealtime42222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                T2.L.f5672l.post(new RunnableC1027ge(this, z6, elapsedRealtime42222, 2));
                                str2 = "Cache connection took " + elapsedRealtime42222 + "ms";
                                T2.G.m(str2);
                                inputStream = b3;
                                if (inputStream != null) {
                                }
                                if (U2.g.c()) {
                                }
                            } catch (TimeoutException e12) {
                                e = e12;
                                z5 = true;
                                b3 = null;
                                z6 = false;
                                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8864m4)).booleanValue()) {
                                }
                                p5.cancel(z5);
                                P2.o.f4767B.f4776j.getClass();
                                long elapsedRealtime422222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                T2.L.f5672l.post(new RunnableC1027ge(this, z6, elapsedRealtime422222, 2));
                                str2 = "Cache connection took " + elapsedRealtime422222 + "ms";
                                T2.G.m(str2);
                                inputStream = b3;
                                if (inputStream != null) {
                                }
                                if (U2.g.c()) {
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                z3 = false;
                                P2.o.f4767B.f4776j.getClass();
                                long elapsedRealtime3222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                T2.L.f5672l.post(new RunnableC1027ge(this, z3, elapsedRealtime3222, 2));
                                T2.G.m("Cache connection took " + elapsedRealtime3222 + "ms");
                                throw th;
                            }
                            T2.G.m(str2);
                        }
                        inputStream = b3;
                        if (inputStream != null) {
                        }
                    }
                }
                i = -1;
                a7 = F7.h4;
                rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                }
                inputStream = b3;
                if (inputStream != null) {
                }
            } else {
                webResourceResponse = null;
            }
            return (U2.g.c() || !((Boolean) AbstractC0923e8.f13238b.s()).booleanValue()) ? webResourceResponse : C(str, map);
        } catch (Exception e13) {
            e = e13;
            P2.o.f4767B.f4774g.i("AdWebViewClient.interceptRequest", e);
            return y();
        } catch (NoClassDefFoundError e14) {
            e = e14;
            P2.o.f4767B.f4774g.i("AdWebViewClient.interceptRequest", e);
            return y();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        T2.G.m("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            B0(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Toolbar toolbar;
        synchronized (this.f13616n) {
            try {
                if (this.f13613k.f12501k.S()) {
                    T2.G.m("Blank page loaded, 1...");
                    this.f13613k.p();
                    return;
                }
                this.K = true;
                InterfaceC1161jf interfaceC1161jf = this.f13620r;
                if (interfaceC1161jf != null) {
                    interfaceC1161jf.mo10a();
                    this.f13620r = null;
                }
                v0();
                if (this.f13613k.f12501k.V() != null) {
                    if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.xb)).booleanValue() || (toolbar = this.f13613k.f12501k.V().f5295F) == null) {
                        return;
                    }
                    toolbar.setSubtitle(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f13625w = true;
        this.f13626x = i;
        this.f13627y = str;
        this.f13628z = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        final boolean didCrash;
        final int rendererPriorityAtExit;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        C0733Ze c0733Ze = this.f13613k;
        if (c0733Ze.f12503m.compareAndSet(false, true)) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8728N0)).booleanValue()) {
                return false;
            }
            ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = c0733Ze.f12501k;
            if (viewTreeObserverOnGlobalLayoutListenerC0805bf.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC0805bf.getParent()).removeView(viewTreeObserverOnGlobalLayoutListenerC0805bf);
            }
            viewTreeObserverOnGlobalLayoutListenerC0805bf.destroy();
            InterfaceC1728w6 interfaceC1728w6 = new InterfaceC1728w6() { // from class: com.google.android.gms.internal.ads.af
                @Override // com.google.android.gms.internal.ads.InterfaceC1728w6
                public final void c(C1594t7 c1594t7) {
                    int i = ViewTreeObserverOnGlobalLayoutListenerC0805bf.f12848l0;
                    C1057h7 w5 = C1102i7.w();
                    boolean x5 = ((C1102i7) w5.f10141l).x();
                    boolean z3 = didCrash;
                    if (x5 != z3) {
                        w5.e();
                        C1102i7.y((C1102i7) w5.f10141l, z3);
                    }
                    w5.e();
                    C1102i7.z((C1102i7) w5.f10141l, rendererPriorityAtExit);
                    C1102i7 c1102i7 = (C1102i7) w5.b();
                    c1594t7.e();
                    C1639u7.C((C1639u7) c1594t7.f10141l, c1102i7);
                }
            };
            C1773x6 c1773x6 = viewTreeObserverOnGlobalLayoutListenerC0805bf.f12879j0;
            c1773x6.a(interfaceC1728w6);
            c1773x6.b(10003);
        }
        return true;
    }

    public final boolean p() {
        boolean z3;
        synchronized (this.f13616n) {
            z3 = this.f13598A;
        }
        return z3;
    }

    public final boolean q() {
        boolean z3;
        synchronized (this.f13616n) {
            z3 = this.f13599B;
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            String uri = webResourceRequest.getUrl().toString();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (!(webView instanceof InterfaceC0677Re)) {
                U2.j.i("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return null;
            }
            InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) webView;
            InterfaceC0758ad interfaceC0758ad = this.f13606I;
            if (interfaceC0758ad != null) {
                ((C0724Yc) interfaceC0758ad).a(uri, requestHeaders, 1);
            }
            if (!"mraid.js".equalsIgnoreCase(new File(uri).getName())) {
                if (requestHeaders == null) {
                    requestHeaders = Collections.EMPTY_MAP;
                }
                return o0(uri, requestHeaders);
            }
            if (interfaceC0677Re.I() != null) {
                C1028gf I5 = interfaceC0677Re.I();
                synchronized (I5.f13616n) {
                    I5.f13624v = false;
                    I5.f13598A = true;
                    AbstractC0613Id.f.execute(new K4(15, I5));
                }
            }
            if (interfaceC0677Re.M().b()) {
                str = (String) Q2.r.f5053d.f5056c.a(F7.f8751R);
            } else if (interfaceC0677Re.r0()) {
                str = (String) Q2.r.f5053d.f5056c.a(F7.f8745Q);
            } else {
                str = (String) Q2.r.f5053d.f5056c.a(F7.f8739P);
            }
            P2.o oVar = P2.o.f4767B;
            T2.L l5 = oVar.f4771c;
            Context context = interfaceC0677Re.getContext();
            String str2 = interfaceC0677Re.m().f5852k;
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", oVar.f4771c.x(context, str2));
                hashMap.put("Cache-Control", "max-stale=3600");
                new T2.v(context);
                T2.t a5 = T2.v.a(0, str, hashMap, null);
                String str3 = (String) a5.f10334k.get(60L, TimeUnit.SECONDS);
                if (str3 != null) {
                    return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
                }
            } catch (IOException | InterruptedException | ExecutionException | TimeoutException e3) {
                U2.j.j("Could not fetch MRAID JS.", e3);
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        T2.G.m("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            B0(parse);
            return true;
        }
        boolean z3 = this.f13624v;
        C0733Ze c0733Ze = this.f13613k;
        if (z3 && webView == c0733Ze.f12501k) {
            String scheme = parse.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                InterfaceC0347a interfaceC0347a = this.f13617o;
                if (interfaceC0347a != null) {
                    interfaceC0347a.z();
                    InterfaceC0758ad interfaceC0758ad = this.f13606I;
                    if (interfaceC0758ad != null) {
                        ((C0724Yc) interfaceC0758ad).c(str);
                    }
                    this.f13617o = null;
                }
                Vi vi = this.f13623u;
                if (vi != null) {
                    vi.E();
                    this.f13623u = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = c0733Ze.f12501k;
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf2 = c0733Ze.f12501k;
        if (viewTreeObserverOnGlobalLayoutListenerC0805bf.willNotDraw()) {
            U2.j.i("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            return true;
        }
        try {
            Q4 q42 = viewTreeObserverOnGlobalLayoutListenerC0805bf2.f12882l;
            Xq xq = viewTreeObserverOnGlobalLayoutListenerC0805bf2.f12883m;
            if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.Cb)).booleanValue() || xq == null) {
                if (q42 != null && q42.c(parse)) {
                    parse = q42.a(parse, c0733Ze.getContext(), c0733Ze, c0733Ze.e());
                }
            } else if (q42 != null && q42.c(parse)) {
                parse = xq.a(parse, c0733Ze.getContext(), c0733Ze, c0733Ze.e());
            }
        } catch (R4 unused) {
            U2.j.i("Unable to append parameter to URL: ".concat(String.valueOf(str)));
        }
        P2.a aVar = this.f13604G;
        if (aVar == null || aVar.b()) {
            W0(new S2.e("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true, false, viewTreeObserverOnGlobalLayoutListenerC0805bf2.t());
        } else {
            aVar.a(str);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Vi
    public final void u() {
        Vi vi = this.f13623u;
        if (vi != null) {
            vi.u();
        }
    }

    public final void v0() {
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf;
        C1390oj c1390oj;
        Cif cif = this.f13619q;
        C0733Ze c0733Ze = this.f13613k;
        if (cif != null && ((this.K && this.f13608M <= 0) || this.f13607L || this.f13625w)) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8741P1)).booleanValue() && (c1390oj = (viewTreeObserverOnGlobalLayoutListenerC0805bf = c0733Ze.f12501k).f12868V) != null) {
                AbstractC1803xs.m((L7) c1390oj.f14828m, viewTreeObserverOnGlobalLayoutListenerC0805bf.f12866T, "awfllc");
            }
            Cif cif2 = this.f13619q;
            boolean z3 = false;
            if (!this.f13607L && !this.f13625w) {
                z3 = true;
            }
            cif2.n(this.f13627y, this.f13626x, this.f13628z, z3);
            this.f13619q = null;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf2 = c0733Ze.f12501k;
        if (viewTreeObserverOnGlobalLayoutListenerC0805bf2.f12867U == null) {
            C1390oj c1390oj2 = viewTreeObserverOnGlobalLayoutListenerC0805bf2.f12868V;
            c1390oj2.getClass();
            I7 d5 = L7.d();
            viewTreeObserverOnGlobalLayoutListenerC0805bf2.f12867U = d5;
            ((HashMap) c1390oj2.f14827l).put("native:view_load", d5);
        }
    }

    public final void w(InterfaceC0347a interfaceC0347a, InterfaceC1462q9 interfaceC1462q9, S2.m mVar, InterfaceC1506r9 interfaceC1506r9, S2.c cVar, boolean z3, A9 a9, P2.a aVar, Qt qt, InterfaceC0758ad interfaceC0758ad, Xm xm, C1041gs c1041gs, C1482ql c1482ql, C1866z9 c1866z9, Vi vi, C1417p9 c1417p9, C1417p9 c1417p92, C1866z9 c1866z92, C1074hg c1074hg) {
        Lq lq;
        C0733Ze c0733Ze = this.f13613k;
        P2.a aVar2 = aVar == null ? new P2.a(c0733Ze.getContext(), interfaceC0758ad) : aVar;
        this.f13605H = new C1876zb(c0733Ze, qt);
        this.f13606I = interfaceC0758ad;
        A7 a7 = F7.f8757S0;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            a("/adMetadata", new C1417p9(0, interfaceC1462q9));
        }
        if (interfaceC1506r9 != null) {
            a("/appEvent", new C1417p9(1, interfaceC1506r9));
        }
        a("/backButton", AbstractC1776x9.f16249j);
        a("/refresh", AbstractC1776x9.f16250k);
        a("/canOpenApp", AbstractC1776x9.f16243b);
        a("/canOpenURLs", AbstractC1776x9.f16242a);
        a("/canOpenIntents", AbstractC1776x9.f16244c);
        a("/close", AbstractC1776x9.f16245d);
        a("/customClose", AbstractC1776x9.f16246e);
        a("/instrument", AbstractC1776x9.f16253n);
        a("/delayPageLoaded", AbstractC1776x9.f16255p);
        a("/delayPageClosed", AbstractC1776x9.f16256q);
        a("/getLocationInfo", AbstractC1776x9.f16257r);
        a("/log", AbstractC1776x9.f16247g);
        a("/mraid", new B9(aVar2, this.f13605H, qt));
        C0566Cb c0566Cb = this.f13603F;
        if (c0566Cb != null) {
            a("/mraidLoaded", c0566Cb);
        }
        P2.a aVar3 = aVar2;
        a("/open", new E9(aVar3, this.f13605H, xm, c1482ql, c1074hg));
        a("/precache", new C1551s9(27));
        a("/touch", AbstractC1776x9.i);
        a("/video", AbstractC1776x9.f16251l);
        a("/videoMeta", AbstractC1776x9.f16252m);
        if (xm == null || c1041gs == null) {
            a("/click", new C1641u9(0, vi, c1074hg));
            a("/httpTrack", AbstractC1776x9.f);
        } else {
            a("/click", new Jk(vi, c1074hg, c1041gs, xm));
            a("/httpTrack", new C1641u9(6, c1041gs, xm));
        }
        boolean e3 = P2.o.f4767B.f4790x.e(c0733Ze.getContext());
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = c0733Ze.f12501k;
        if (e3) {
            HashMap hashMap = new HashMap();
            Lq lq2 = viewTreeObserverOnGlobalLayoutListenerC0805bf.f12890t;
            if (lq2 != null) {
                hashMap = lq2.f10532w0;
            }
            a("/logScionEvent", new C1641u9(1, c0733Ze.getContext(), hashMap));
        }
        if (a9 != null) {
            a("/setInterstitialProperties", new C1417p9(2, a9));
        }
        D7 d7 = rVar.f5056c;
        if (c1866z9 != null && ((Boolean) d7.a(F7.z8)).booleanValue()) {
            a("/inspectorNetworkExtras", c1866z9);
        }
        if (((Boolean) d7.a(F7.S8)).booleanValue() && c1417p9 != null) {
            a("/shareSheet", c1417p9);
        }
        if (((Boolean) d7.a(F7.X8)).booleanValue() && c1417p92 != null) {
            a("/inspectorOutOfContextTest", c1417p92);
        }
        if (((Boolean) d7.a(F7.b9)).booleanValue() && c1866z92 != null) {
            a("/inspectorStorage", c1866z92);
        }
        if (((Boolean) d7.a(F7.cb)).booleanValue()) {
            a("/bindPlayStoreOverlay", AbstractC1776x9.f16260u);
            a("/presentPlayStoreOverlay", AbstractC1776x9.f16261v);
            a("/expandPlayStoreOverlay", AbstractC1776x9.f16262w);
            a("/collapsePlayStoreOverlay", AbstractC1776x9.f16263x);
            a("/closePlayStoreOverlay", AbstractC1776x9.f16264y);
        }
        if (((Boolean) d7.a(F7.f8839i3)).booleanValue()) {
            a("/setPAIDPersonalizationEnabled", AbstractC1776x9.f16239A);
            a("/resetPAID", AbstractC1776x9.f16265z);
        }
        if (((Boolean) d7.a(F7.wb)).booleanValue() && (lq = viewTreeObserverOnGlobalLayoutListenerC0805bf.f12890t) != null && lq.f10522r0) {
            a("/writeToLocalStorage", AbstractC1776x9.f16240B);
            a("/clearLocalStorageKeys", AbstractC1776x9.f16241C);
        }
        this.f13617o = interfaceC0347a;
        this.f13618p = mVar;
        this.f13621s = interfaceC1462q9;
        this.f13622t = interfaceC1506r9;
        this.f13602E = cVar;
        this.f13604G = aVar3;
        this.f13623u = vi;
        this.J = c1482ql;
        this.f13624v = z3;
    }

    @Override // Q2.InterfaceC0347a
    public final void z() {
        InterfaceC0347a interfaceC0347a = this.f13617o;
        if (interfaceC0347a != null) {
            interfaceC0347a.z();
        }
    }

    public final void z0() {
        InterfaceC0758ad interfaceC0758ad = this.f13606I;
        if (interfaceC0758ad != null) {
            ((C0724Yc) interfaceC0758ad).b();
            this.f13606I = null;
        }
        ViewOnAttachStateChangeListenerC0691Te viewOnAttachStateChangeListenerC0691Te = this.f13612Q;
        if (viewOnAttachStateChangeListenerC0691Te != null) {
            this.f13613k.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0691Te);
        }
        synchronized (this.f13616n) {
            try {
                this.f13615m.clear();
                this.f13617o = null;
                this.f13618p = null;
                this.f13619q = null;
                this.f13620r = null;
                this.f13621s = null;
                this.f13622t = null;
                this.f13624v = false;
                this.f13598A = false;
                this.f13599B = false;
                this.f13600C = false;
                this.f13602E = null;
                this.f13604G = null;
                this.f13603F = null;
                C1876zb c1876zb = this.f13605H;
                if (c1876zb != null) {
                    c1876zb.A(true);
                    this.f13605H = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return o0(str, Collections.EMPTY_MAP);
    }
}
