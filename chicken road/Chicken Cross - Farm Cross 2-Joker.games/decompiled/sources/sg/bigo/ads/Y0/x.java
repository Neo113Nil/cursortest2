package sg.bigo.ads.Y0;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.URLUtil;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.adjust.sdk.Constants;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.c0.C5053d;
import sg.bigo.ads.e.AbstractC5081e;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.x0.AbstractC5507g;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public class x extends sg.bigo.ads.j1.h implements sg.bigo.ads.Q.g {
    public sg.bigo.ads.e.h A;
    public final sg.bigo.ads.P.c B;
    public final int C;
    public final long D;
    public g E;
    public boolean F;
    public final int G;
    public final ArrayList H;
    public int I;
    public int J;
    public int K;
    public final String L;
    public WebHistoryItem M;
    public final boolean N;
    public final boolean O;
    public int P;
    public final HashMap Q;
    public boolean R;
    public String S;
    public volatile C5053d T;
    public Handler U;
    public boolean V;
    public ArrayList W;
    public ArrayList X;
    public ArrayList Y;
    public int Z;
    public int a0;
    public long b0;
    public boolean c0;
    public boolean d0;
    public int e0;
    public int f0;
    public final boolean g0;
    public JSONObject h0;
    public final m i0;
    public final r j0;
    public final s k0;
    public final String v;
    public long w;
    public int x;
    public final int y;
    public boolean z;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f0, code lost:
    
        if (android.text.TextUtils.equals(r2, r13) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x(Activity activity) {
        super(activity);
        int i;
        int i2;
        int i3;
        String str;
        this.w = -1L;
        this.x = 0;
        this.z = false;
        this.H = new ArrayList();
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.Q = new HashMap();
        this.R = false;
        this.V = false;
        this.d0 = false;
        this.i0 = new m(this);
        this.j0 = new r(this);
        this.k0 = new s(this);
        Intent intent = this.f12687a.getIntent();
        if (intent != null) {
            i2 = intent.getIntExtra("ad_identifier", -1);
            this.G = intent.getIntExtra("land_way", -1);
            i = intent.getIntExtra("webview_force_time", -1);
        } else {
            this.G = -1;
            i = -1;
            i2 = -1;
        }
        sg.bigo.ads.e.h a2 = D.a(i2);
        this.A = a2;
        if (a2 != null) {
            sg.bigo.ads.P.c e = a2.e();
            this.B = e;
            sg.bigo.ads.e.h hVar = this.A;
            this.C = hVar.M == ((sg.bigo.ads.U0.b) hVar.e()).m ? hVar.K : -1;
            sg.bigo.ads.e.h hVar2 = this.A;
            this.D = hVar2.M != ((sg.bigo.ads.U0.b) hVar2.e()).m ? 0L : hVar2.L;
            this.E = this.A.z;
            sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) e;
            this.v = bVar.z.e;
            this.y = bVar.c.f;
        } else {
            this.C = 0;
            this.D = System.currentTimeMillis();
        }
        try {
            if (i >= 9) {
                this.N = true;
                this.O = false;
                i3 = i - 9;
            } else {
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        this.N = false;
                        this.O = true;
                        i3 = i + 1;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        this.N = true;
                        this.O = false;
                        i3 = i - 3;
                        break;
                    default:
                        this.N = true;
                        this.O = false;
                        this.P = 0;
                        break;
                }
                String packageName = activity.getPackageName();
                str = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).taskAffinity;
            }
            String packageName2 = activity.getPackageName();
            str = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).taskAffinity;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        this.P = i3;
        str = null;
        this.L = str;
        boolean a3 = sg.bigo.ads.O.g.f12472a.B.a(31);
        this.g0 = a3;
        if (a3) {
            this.T = L();
            C5053d c5053d = this.T;
            if (c5053d == null) {
                return;
            }
            AbstractC5446j.a(1, null, new t(c5053d), 0L);
        }
    }

    @Override // sg.bigo.ads.j1.h
    public void C() {
        ImageView imageView;
        super.C();
        if ((this.N || this.O) && (imageView = this.f) != null) {
            imageView.setVisibility(4);
            this.f.setEnabled(false);
        }
    }

    @Override // sg.bigo.ads.j1.h
    public final void D() {
        super.D();
        if (this.g0) {
            WebView webView = this.h;
            if (webView instanceof sg.bigo.ads.E1.k) {
                ((sg.bigo.ads.E1.k) webView).setOnWebViewScrollListener(this.j0);
            }
        }
        WebView webView2 = this.h;
        if (webView2 != null) {
            webView2.setDownloadListener(new n(this));
        }
    }

    @Override // sg.bigo.ads.j1.h
    public final void E() {
        if (this.h == null) {
            return;
        }
        g gVar = this.E;
        if (gVar != null) {
            if (gVar.c == 2 && !I.a((CharSequence) "")) {
                WebView webView = this.h;
                String str = this.i;
                this.E.getClass();
                webView.loadDataWithBaseURL(str, "", "text/html", "UTF-8", null);
                i(3);
                return;
            }
            int i = this.E.c;
            if (i == 3 && this.F) {
                this.j = SystemClock.elapsedRealtime();
                e(this.h.getTitle());
                if (this.E.d) {
                    ProgressBar progressBar = this.e;
                    if (progressBar != null) {
                        progressBar.setAlpha(0.0f);
                    }
                    b(this.i);
                    return;
                }
                return;
            }
            if (i == 4 && this.F) {
                this.M = this.h.copyBackForwardList().getCurrentItem();
            }
        }
        sg.bigo.ads.P.c cVar = this.B;
        if (cVar != null) {
            sg.bigo.ads.U0.j jVar = ((sg.bigo.ads.U0.b) cVar).z;
            this.i = sg.bigo.ads.j1.b.a(jVar.h, jVar.i, this.i);
        }
        super.E();
        f(this.i);
        i(3);
    }

    @Override // sg.bigo.ads.j1.h
    public final sg.bigo.ads.E1.k G() {
        int i;
        sg.bigo.ads.E1.k kVar;
        g gVar = this.E;
        sg.bigo.ads.E1.k kVar2 = null;
        if (gVar != null && (((i = gVar.c) == 3 || i == 4) && (kVar = gVar.e) != null)) {
            X.c(kVar);
            sg.bigo.ads.E1.k kVar3 = gVar.e;
            gVar.e = null;
            kVar2 = kVar3;
        }
        if (kVar2 == null) {
            return sg.bigo.ads.E1.k.a(this.f12687a);
        }
        this.F = true;
        return kVar2;
    }

    @Override // sg.bigo.ads.j1.h
    public final void H() {
        String str = this.v;
        if (!TextUtils.isEmpty(str)) {
            sg.bigo.ads.B0.a aVar = new sg.bigo.ads.B0.a(sg.bigo.ads.G0.a.f12309a.incrementAndGet(), new sg.bigo.ads.B0.d(str), this.f12687a);
            aVar.c = AbstractRunnableC5522h.b();
            AbstractC5507g.a(aVar, null);
        }
        this.R = true;
        if (this.B != null) {
            sg.bigo.ads.s1.b.a("06002062", sg.bigo.ads.s1.b.a(this, this.H.isEmpty() ? null : (sg.bigo.ads.Q.f) this.H.get(0), System.currentTimeMillis() - this.D, this.x, this.B, this.A, this.L, c(true)));
            sg.bigo.ads.F0.b.b("sp_ads", "landing_webview_close_info", "", 3);
        }
        if (this.g0) {
            if (this.d0) {
                M().removeCallbacks(this.k0);
                this.k0.run();
            }
            if (this.T != null) {
                this.T.l = System.currentTimeMillis() - this.D;
                C5053d c5053d = this.T;
                String str2 = this.S;
                if (str2 == null) {
                    str2 = this.i;
                }
                c5053d.g = str2;
                AbstractC5446j.a(1, null, new p(this.T), 0L);
            }
            if (this.g0) {
                AbstractC5446j.a(1, null, new l(this, 2), 0L);
            }
        }
    }

    @Override // sg.bigo.ads.j1.h
    public final void I() {
        i(2);
    }

    @Override // sg.bigo.ads.j1.h
    public void J() {
        super.J();
        AbstractC5446j.a(1, new o(this));
    }

    @Override // sg.bigo.ads.j1.h
    public void K() {
        super.K();
        if (this.N) {
            P();
        }
        if (!this.g0 || this.V) {
            return;
        }
        this.V = true;
        long[] jArr = {2000, 5000, 10000, 60000};
        for (int i = 0; i < 4; i++) {
            M().postDelayed(new j(this), jArr[i]);
        }
    }

    public final C5053d L() {
        String str;
        if (!this.g0) {
            return null;
        }
        Activity activity = this.f12687a;
        if (activity != null) {
            Point a2 = AbstractC4963u.a(activity);
            str = a2.x + "x" + a2.y;
        } else {
            str = "";
        }
        String jSONArray = this.W != null ? new JSONArray((Collection) this.W).toString() : "";
        String jSONArray2 = this.X != null ? new JSONArray((Collection) this.X).toString() : "";
        String jSONArray3 = this.Y != null ? new JSONArray((Collection) this.Y).toString() : "";
        sg.bigo.ads.P.c cVar = this.B;
        String str2 = cVar != null ? ((sg.bigo.ads.U0.b) cVar).C.b : "";
        String valueOf = cVar != null ? String.valueOf(((sg.bigo.ads.U0.b) cVar).m) : "";
        sg.bigo.ads.P.c cVar2 = this.B;
        String str3 = cVar2 != null ? ((sg.bigo.ads.U0.b) cVar2).j : "";
        String str4 = cVar2 != null ? ((sg.bigo.ads.U0.b) cVar2).f : "";
        String str5 = cVar2 != null ? ((sg.bigo.ads.U0.b) cVar2).n : "";
        String str6 = this.S;
        if (str6 == null) {
            str6 = this.i;
        }
        return new C5053d(str2, valueOf, str3, str4, str5, str6, cVar2 != null ? ((sg.bigo.ads.U0.b) cVar2).l : 0, cVar2 != null ? ((sg.bigo.ads.U0.b) cVar2).k : 0, this.C, str, System.currentTimeMillis() - this.D, jSONArray, jSONArray2, jSONArray3);
    }

    public final Handler M() {
        if (this.U == null) {
            this.U = new Handler(Looper.getMainLooper());
        }
        return this.U;
    }

    public final boolean N() {
        int i;
        if (this.N || this.O) {
            ImageView imageView = this.f;
            return (imageView == null || imageView.isEnabled()) ? false : true;
        }
        if (this.z || (i = this.y) <= 0 || i > 10000) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.w;
        return elapsedRealtime > 0 && elapsedRealtime < ((long) i);
    }

    public final void O() {
        if (this.T == null) {
            return;
        }
        this.T.n = this.W != null ? new JSONArray((Collection) this.W).toString() : "";
        this.T.o = this.X != null ? new JSONArray((Collection) this.X).toString() : "";
        ArrayList arrayList = this.Y;
        if (arrayList != null && !arrayList.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.Y.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                if (jSONObject.has("e_x") && jSONObject.has("s_x")) {
                    jSONArray.put(jSONObject);
                }
            }
            if (jSONArray.length() > 0) {
                this.T.p = jSONArray.toString();
            }
        }
        if (TextUtils.isEmpty(this.T.n) && TextUtils.isEmpty(this.T.o) && TextUtils.isEmpty(this.T.p)) {
            return;
        }
        AbstractC5446j.a(1, null, new u(this.T), 0L);
    }

    public final void P() {
        int i = this.P;
        if (i <= 0) {
            this.i0.onReceiveValue(Boolean.TRUE);
            return;
        }
        WebView webView = this.h;
        if (webView != null) {
            webView.postDelayed(new q(this), i * 1000);
        }
    }

    @Override // sg.bigo.ads.Q.g
    public final String a() {
        return this.i;
    }

    @Override // sg.bigo.ads.j1.h
    public void b(String str) {
        a(1, str);
        if (!this.z) {
            this.J = 100;
            i(5);
            if (this.O) {
                P();
            }
        }
        this.z = true;
    }

    @Override // sg.bigo.ads.Q.g
    public int c() {
        return 0;
    }

    public final String c(boolean z) {
        JSONArray jSONArray = new JSONArray();
        long currentTimeMillis = System.currentTimeMillis();
        for (v vVar : this.Q.values()) {
            int i = vVar.d;
            long j = vVar.c;
            if (i == -1) {
                i = 1;
                if (z) {
                    vVar.c = currentTimeMillis;
                    vVar.d = 1;
                }
                j = currentTimeMillis;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", URLEncoder.encode(vVar.f12648a, "UTF-8"));
                jSONObject.put("s_ts", vVar.b);
                jSONObject.put("e_ts", j);
                jSONObject.put("type", i);
                jSONArray.put(jSONObject);
            } catch (Exception unused) {
            }
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.j1.h
    public final String d(String str) {
        sg.bigo.ads.P.c cVar = this.B;
        if (cVar == null) {
            return str;
        }
        sg.bigo.ads.U0.j jVar = ((sg.bigo.ads.U0.b) cVar).z;
        return sg.bigo.ads.j1.b.a(jVar.h, jVar.i, str);
    }

    @Override // sg.bigo.ads.j1.h
    public final void f(int i) {
        if (N()) {
            return;
        }
        g(i);
    }

    @Override // sg.bigo.ads.Q.g
    public final boolean g() {
        g gVar = this.E;
        return gVar != null && gVar.d;
    }

    @Override // sg.bigo.ads.Q.g
    public final int h() {
        return this.C;
    }

    public final void i(int i) {
        w wVar = new w(i, this.D);
        this.H.add(0, wVar);
        sg.bigo.ads.P.c cVar = this.B;
        if (cVar != null) {
            sg.bigo.ads.s1.b.a(this, wVar, cVar, this.A, this.L);
        }
    }

    @Override // sg.bigo.ads.Q.g
    public final int k() {
        return this.K;
    }

    @Override // sg.bigo.ads.Q.g
    public final Map l() {
        return null;
    }

    @Override // sg.bigo.ads.Q.g
    public final int m() {
        return this.I;
    }

    @Override // sg.bigo.ads.Q.g
    public final int n() {
        return this.J;
    }

    @Override // sg.bigo.ads.j1.h, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void t() {
        if (this.A != null) {
            WeakHashMap weakHashMap = D.f12627a;
            this.A = null;
        }
    }

    @Override // sg.bigo.ads.j1.h, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void v() {
        this.w = SystemClock.elapsedRealtime();
        this.S = this.i;
        i(1);
        super.v();
    }

    @Override // sg.bigo.ads.j1.h, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void w() {
        Handler handler = this.U;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        WebView webView = this.h;
        if (webView instanceof sg.bigo.ads.E1.k) {
            ((sg.bigo.ads.E1.k) webView).setOnWebViewScrollListener(null);
        }
        super.w();
        g gVar = this.E;
        if (gVar != null) {
            gVar.d = false;
            this.E = null;
        }
    }

    @Override // sg.bigo.ads.j1.h
    public final boolean z() {
        WebView webView = this.h;
        if (webView == null) {
            return false;
        }
        if (this.M != null) {
            WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
            int currentIndex = copyBackForwardList.getCurrentIndex();
            if (currentIndex < 1) {
                return super.z();
            }
            WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(currentIndex - 1);
            if (itemAtIndex != null) {
                return (TextUtils.equals(this.M.getOriginalUrl(), itemAtIndex.getOriginalUrl()) || TextUtils.equals(this.M.getUrl(), itemAtIndex.getUrl())) ? false : true;
            }
        }
        return super.z();
    }

    @Override // sg.bigo.ads.j1.h
    public final void a(String str) {
        this.K++;
        this.I = !URLUtil.isNetworkUrl(str) ? 1 : 0;
    }

    @Override // sg.bigo.ads.j1.h
    public boolean b(MotionEvent motionEvent) {
        if (this.g0) {
            int actionMasked = motionEvent.getActionMasked();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            long currentTimeMillis = System.currentTimeMillis();
            if (actionMasked == 0) {
                if (this.d0) {
                    M().removeCallbacks(this.k0);
                    this.k0.run();
                }
                this.Z = x;
                this.a0 = y;
                this.b0 = currentTimeMillis;
                this.c0 = false;
            } else if (actionMasked == 1) {
                try {
                    if (this.c0) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("s_x", this.Z);
                        jSONObject.put("s_y", this.a0);
                        jSONObject.put("s_ts", this.b0);
                        jSONObject.put("e_x", x);
                        jSONObject.put("e_y", y);
                        jSONObject.put("e_ts", currentTimeMillis);
                        if (this.X == null) {
                            this.X = new ArrayList();
                        }
                        this.X.add(jSONObject);
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ts", currentTimeMillis);
                        jSONObject2.put("x", x);
                        jSONObject2.put("y", y);
                        if (this.W == null) {
                            this.W = new ArrayList();
                        }
                        this.W.add(jSONObject2);
                    }
                    O();
                } catch (Exception unused) {
                }
            } else if (actionMasked == 2) {
                this.c0 = true;
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.Q.g
    public final int f() {
        return this.G;
    }

    @Override // sg.bigo.ads.j1.h
    public void h(int i) {
        this.J = Math.max(this.J, i);
    }

    @Override // sg.bigo.ads.j1.h
    public final void a(sg.bigo.ads.P.f fVar) {
        sg.bigo.ads.P.e eVar;
        sg.bigo.ads.P.c cVar = this.B;
        if (cVar != null) {
            sg.bigo.ads.s1.b.a(cVar, 2, fVar, this.A);
            sg.bigo.ads.P.f fVar2 = this.p;
            if (fVar2 == null || this.A == null || fVar2.a() <= -1) {
                return;
            }
            int a2 = this.p.a();
            sg.bigo.ads.P.f fVar3 = this.p;
            if (!fVar3.e && a2 == 1) {
                sg.bigo.ads.P.e eVar2 = fVar3.d;
                if (eVar2 != null) {
                    eVar2.f12477a = 4;
                }
                this.A.a(eVar2);
            }
            if ((a2 == 1 || a2 == 4) && !this.p.e) {
                return;
            }
            if (a2 == 1 && (eVar = this.p.d) != null) {
                eVar.f12477a = 4;
            }
            sg.bigo.ads.P.c e = this.A.e();
            int a3 = this.p.a();
            sg.bigo.ads.P.e eVar3 = this.p.d;
            String str = eVar3 != null ? eVar3.b : "";
            String str2 = eVar3 != null ? eVar3.c : "";
            HashMap a4 = sg.bigo.ads.s1.b.a(e, (sg.bigo.ads.Q.b) null, false);
            AbstractC5081e.a(a4, "ad_pkg_name", str, a3, "open_rslt");
            a4.put("open_type", String.valueOf(2));
            a4.put("ori_ad_bundle", ((sg.bigo.ads.U0.b) e).U);
            a4.put(Constants.REFERRER, str2);
            sg.bigo.ads.s1.b.a("06002070", a4);
        }
    }

    @Override // sg.bigo.ads.j1.h
    public final void c(String str) {
        a(0, str);
        if (this.z) {
            return;
        }
        i(6);
    }

    @Override // sg.bigo.ads.j1.h
    public final void f(String str) {
        if (!TextUtils.isEmpty(str) && ((v) this.Q.get(str)) == null) {
            v vVar = new v();
            vVar.f12648a = str;
            vVar.b = System.currentTimeMillis();
            vVar.d = -1;
            this.Q.put(str, vVar);
        }
    }

    @Override // sg.bigo.ads.j1.h, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void b(boolean z) {
        if (z) {
            q();
        }
    }

    @Override // sg.bigo.ads.j1.h
    public void a(String str, boolean z) {
        if (z) {
            i(4);
        }
        int i = this.x;
        if (i == 0) {
            this.i = str;
        }
        this.x = i + 1;
        f(str);
        this.S = str;
        if (this.g0) {
            AbstractC5446j.a(1, null, new l(this, 3), 0L);
        }
    }

    @Override // sg.bigo.ads.j1.h
    public final void a(int i, String str) {
        v vVar;
        if (TextUtils.isEmpty(str) || (vVar = (v) this.Q.get(str)) == null || vVar.d != -1) {
            return;
        }
        vVar.c = System.currentTimeMillis();
        vVar.d = i;
    }
}
