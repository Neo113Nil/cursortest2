package sg.bigo.ads.e;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Point;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.webkit.ProxyConfig;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.C4761z5;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.P.r;
import sg.bigo.ads.P.s;
import sg.bigo.ads.P.u;
import sg.bigo.ads.P.x;
import sg.bigo.ads.Y0.C5014d;
import sg.bigo.ads.Y0.D;
import sg.bigo.ads.a0.RunnableC5019c;
import sg.bigo.ads.a0.o;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.l0.C5290a;
import sg.bigo.ads.l0.C5292c;
import sg.bigo.ads.l0.C5294e;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x1.q;

/* loaded from: classes3.dex */
public abstract class h extends sg.bigo.ads.Q.b implements sg.bigo.ads.a0.m {
    public long A;
    public C5077a B;
    public int C;
    public int D;
    public int E;
    public final HashSet F;
    public final HashSet G;
    public boolean H;
    public sg.bigo.ads.P.e I;
    public int J;
    public int K;
    public long L;
    public long M;
    public final HashMap N;
    public WeakReference O;
    public boolean P;
    public AdInteractionListener j;
    public sg.bigo.ads.P.j k;
    public View l;
    public sg.bigo.ads.x1.f m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public long w;
    public long x;
    public final AtomicBoolean y;
    public sg.bigo.ads.Y0.g z;

    public h(sg.bigo.ads.P.j jVar) {
        super(jVar.c);
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.y = new AtomicBoolean(false);
        this.F = new HashSet();
        this.G = new HashSet();
        this.H = false;
        this.K = -1;
        this.L = 0L;
        this.M = 0L;
        this.N = new HashMap();
        this.P = true;
        this.k = jVar;
        s();
        r();
        this.e = new sg.bigo.ads.D0.a();
    }

    public final synchronized void a(String str, Integer num) {
        this.N.put(str, num);
    }

    @Override // sg.bigo.ads.Q.b
    public void a(sg.bigo.ads.Q.c cVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(sg.bigo.ads.U.j jVar, int i, int i2, sg.bigo.ads.P.f fVar) {
        h hVar;
        boolean z;
        int i3;
        this.E = i;
        boolean z2 = (i2 == 13 || i2 == 14) && (this instanceof sg.bigo.ads.Q.d);
        if (!this.r && (!this.u || z2)) {
            this.r = true;
            b(jVar != null ? jVar.b : null, i, i2, fVar);
        }
        long elapsedRealtime = this.w > 0 ? SystemClock.elapsedRealtime() - this.w : 0L;
        String str = "";
        String str2 = (jVar == null || jVar.b == null) ? "" : jVar.b.x + "," + jVar.b.y;
        if (jVar != null && jVar.f12564a != null) {
            str = jVar.f12564a.x + "," + jVar.f12564a.y;
        }
        if (this.G.contains("06002011")) {
            hVar = this;
            z = z2;
        } else {
            String str3 = !TextUtils.isEmpty(fVar.f) ? fVar.f : ((sg.bigo.ads.U0.b) e()).z.f12574a;
            sg.bigo.ads.P.j jVar2 = this.k;
            Context context = jVar2.e;
            sg.bigo.ads.P.c cVar = jVar2.f12482a;
            String o = o();
            int i4 = this.C + 1;
            this.C = i4;
            z = z2;
            int i5 = this.D + 1;
            this.D = i5;
            HashMap a2 = sg.bigo.ads.s1.b.a(cVar, (sg.bigo.ads.Q.b) null, false);
            sg.bigo.ads.Q.b bVar = this.g;
            String str4 = str3;
            if (bVar instanceof sg.bigo.ads.Q.e) {
                sg.bigo.ads.Q.e eVar = (sg.bigo.ads.Q.e) bVar;
                a2.put("icon_show_num", String.valueOf(eVar.n()));
                a2.put("scene_page", String.valueOf(eVar.j));
                a2.put("word_icon_style", String.valueOf(eVar.k ? 1 : 0));
            }
            a2.put("ad_size", o);
            a2.put("click_area", str2);
            AbstractC5081e.a(a2, "down_click_area", str, i, "click_module");
            a2.put("click_source", String.valueOf(i2));
            sg.bigo.ads.U0.b bVar2 = (sg.bigo.ads.U0.b) cVar;
            a2.put("open_way", String.valueOf(bVar2.z.c));
            a2.put("url_t", String.valueOf(fVar.f12478a));
            a2.put("land_success", fVar.b() ? "1" : "0");
            a2.put("open_way_form", String.valueOf(fVar.m));
            a2.put("auto_clk_out_mode", String.valueOf(fVar.o));
            a2.put("cost", String.valueOf(elapsedRealtime));
            boolean z3 = cVar instanceof InterfaceC5087a;
            if (z3) {
                InterfaceC5087a interfaceC5087a = (InterfaceC5087a) cVar;
                sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) interfaceC5087a;
                r rVar = kVar.E0;
                if (rVar != null) {
                    Object[] objArr = {Integer.valueOf(rVar.f12490a), Integer.valueOf(rVar.b)};
                    Pattern pattern = I.f12345a;
                    a2.put("creative_size", String.format(Locale.ENGLISH, "%1$d*%2$d", objArr));
                }
                int i6 = kVar.J0;
                if (i6 != 0) {
                    a2.put("show_method", String.valueOf(i6));
                }
                long j = kVar.L0;
                if (j > 0) {
                    a2.put("page_cost", String.valueOf(SystemClock.elapsedRealtime() - j));
                }
                int i7 = kVar.K0;
                if (i2 == 11 && i7 > 0) {
                    a2.put("render_method", String.valueOf(i7));
                }
                if (((sg.bigo.ads.U0.b) interfaceC5087a).k == 2) {
                    a2.put("backup_creative", String.valueOf(kVar.T0));
                }
                sg.bigo.ads.s1.b.c(a2, cVar);
                sg.bigo.ads.s1.b.b(a2, cVar);
                if (z3 && (i3 = kVar.c1.get()) > 0) {
                    a2.put("ad_click_indx", String.valueOf(i3));
                }
                sg.bigo.ads.s1.b.a(a2, cVar);
            }
            sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
            if (gVar != null && gVar.B.a(15)) {
                boolean z4 = sg.bigo.ads.I0.f.j;
                if (!z4 && context != null && !z4) {
                    context.registerReceiver(sg.bigo.ads.I0.f.k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    sg.bigo.ads.I0.f.j = true;
                }
                sg.bigo.ads.U.b bVar3 = sg.bigo.ads.I0.f.i;
                if (bVar3 != null) {
                    a2.put("bat_stat", String.valueOf(bVar3.c));
                    a2.put("bat_num", String.valueOf(bVar3.f12560a));
                    a2.put("bat_scale", String.valueOf(bVar3.b));
                }
            }
            a2.put("total_num", String.valueOf(i4));
            a2.put("current_num", String.valueOf(i5));
            a2.put("cur_in_fg", String.valueOf(o.b()));
            hVar = this;
            a2.put("out_ad", String.valueOf(hVar.f));
            int i8 = hVar.f12498a;
            if (i8 != 0) {
                a2.put("show_method_source", String.valueOf(i8));
            }
            a2.put("click_acty_source", String.valueOf(hVar.c));
            sg.bigo.ads.s1.b.e(a2, cVar);
            sg.bigo.ads.s1.b.a(a2, (sg.bigo.ads.Q.b) hVar, true);
            if (!TextUtils.isEmpty(str4)) {
                a2.put("land_u", str4);
            }
            if (!TextUtils.isEmpty(bVar2.z.b)) {
                a2.put("dp_u", bVar2.z.b);
            }
            if (!TextUtils.isEmpty(bVar2.z.l)) {
                a2.put("sub_u", bVar2.z.l);
            }
            if (!TextUtils.isEmpty(bVar2.U)) {
                a2.put("ori_ad_bundle", bVar2.U);
            }
            s i9 = i();
            x xVar = i9 != null ? i9.f12491a : null;
            if (xVar != null) {
                a2.put("is_vpaid", "1");
                a2.put("vpaid_click_url", xVar.g);
                a2.put("vpaid_click_handle", xVar.h ? "1" : "0");
                a2.put("vpaid_click_id", xVar.i);
            }
            sg.bigo.ads.s1.b.a("06002011", a2);
        }
        sg.bigo.ads.s1.b.a(hVar.k.f12482a, 1, fVar, hVar);
        AdInteractionListener adInteractionListener = hVar.j;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClicked();
        }
        if (z) {
            ((sg.bigo.ads.Q.d) hVar).d();
        }
    }

    @Override // sg.bigo.ads.api.Ad
    public final void destroy() {
        sg.bigo.ads.E1.k kVar;
        this.u = true;
        if (AbstractC5446j.e()) {
            try {
                sg.bigo.ads.Y0.g gVar = this.z;
                if (gVar != null && (kVar = gVar.e) != null) {
                    kVar.destroy();
                    gVar.e = null;
                }
            } catch (Throwable unused) {
            }
            destroyInMainThread();
        } else {
            AbstractC5446j.a(2, null, new RunnableC5082f(this), 0L);
        }
        if (this.v) {
            int hashCode = e().hashCode();
            C5294e c5294e = C5294e.c;
            c5294e.getClass();
            ConcurrentHashMap concurrentHashMap = C5294e.d;
            Map map = concurrentHashMap.containsKey(Integer.valueOf(hashCode)) ? (Map) concurrentHashMap.get(Integer.valueOf(hashCode)) : null;
            C5290a c5290a = new C5290a(hashCode);
            if (c5294e.b != null && map != null) {
                sg.bigo.ads.s1.b.a(1, 4, "");
                c5294e.b.a(map, new C5292c(c5290a, map, 4));
            }
        }
        int hashCode2 = e().hashCode();
        C5294e.c.getClass();
        C5294e.d.remove(Integer.valueOf(hashCode2));
        setAdInteractionListener(null);
        AbstractC5446j.b(new sg.bigo.ads.a0.d(this));
    }

    public abstract void destroyInMainThread();

    @Override // sg.bigo.ads.Q.b
    public sg.bigo.ads.P.c e() {
        return this.k.f12482a;
    }

    @Override // sg.bigo.ads.Q.b
    public final long f() {
        ((sg.bigo.ads.U0.b) e()).getClass();
        return sg.bigo.ads.O.g.f12472a.k;
    }

    @Override // sg.bigo.ads.api.Ad
    public AdBid getBid() {
        if (this.B == null) {
            sg.bigo.ads.P.j jVar = this.k;
            sg.bigo.ads.P.c cVar = jVar.f12482a;
            this.B = ((sg.bigo.ads.U0.b) cVar).c.v == 2 ? new C5077a(jVar, cVar, this.m) : null;
        }
        return this.B;
    }

    @Override // sg.bigo.ads.api.Ad
    public String getExtraInfo(String str) {
        sg.bigo.ads.P.j jVar = this.k;
        sg.bigo.ads.P.c cVar = jVar != null ? jVar.f12482a : null;
        if (cVar == null) {
            return "";
        }
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
        if (str == null) {
            return "";
        }
        HashMap hashMap = bVar.j0;
        String str2 = hashMap != null ? (String) hashMap.get(str) : "";
        return str2 == null ? "" : str2;
    }

    @Override // sg.bigo.ads.Q.b
    public final String h() {
        return ((sg.bigo.ads.U0.b) e()).v;
    }

    @Override // sg.bigo.ads.api.Ad
    public boolean isExpired() {
        return ((sg.bigo.ads.U0.b) this.k.f12482a).a();
    }

    @Override // sg.bigo.ads.Q.b
    public final void j() {
        if (this.n) {
            return;
        }
        this.n = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.x = elapsedRealtime;
        sg.bigo.ads.Q.b bVar = this.g;
        if (bVar instanceof h) {
            ((h) bVar).x = elapsedRealtime;
        }
        if (((sg.bigo.ads.U0.b) this.k.f12482a).G) {
            return;
        }
        a("filled");
        if (((sg.bigo.ads.U0.b) this.k.f12482a).z.k == 1) {
            v();
        }
        sg.bigo.ads.P.j jVar = this.k;
        if (((sg.bigo.ads.U0.b) jVar.f12482a).z.c == 2) {
            Context context = jVar.e;
            sg.bigo.ads.S.j.a(context, "", null, new sg.bigo.ads.S.i(context));
        }
        AbstractC5446j.b(new RunnableC5019c(this));
    }

    @Override // sg.bigo.ads.Q.b
    public final void k() {
        if (this.o) {
            return;
        }
        this.o = true;
        sg.bigo.ads.N.c cVar = this.k.c.h;
        if (cVar.m == 0) {
            cVar.m = System.currentTimeMillis();
        }
        if (this.G.contains("06002008")) {
            return;
        }
        sg.bigo.ads.s1.b.a(this, ((Boolean) a(Boolean.FALSE, "is_cache")).booleanValue());
    }

    public int m() {
        return 0;
    }

    public int n() {
        return 0;
    }

    public String o() {
        return this.l == null ? "" : this.l.getWidth() + "x" + this.l.getHeight();
    }

    public sg.bigo.ads.P.e p() {
        return this.I;
    }

    public void q() {
        if (isExpired() || this.u) {
            b(2000, 2, this.u ? "The ad is destroyed" : "The ad is expired");
            return;
        }
        if (this.s) {
            return;
        }
        this.s = true;
        this.w = SystemClock.elapsedRealtime();
        u();
        AdInteractionListener adInteractionListener = this.j;
        if (adInteractionListener != null) {
            adInteractionListener.onAdImpression();
        }
    }

    public final void r() {
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.w = 0L;
        this.x = 0L;
        this.B = null;
        this.v = false;
        this.h = 0;
        this.y.set(false);
    }

    public final void s() {
        sg.bigo.ads.P.c cVar = this.k.f12482a;
        u uVar = sg.bigo.ads.O.g.f12472a.X;
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
        sg.bigo.ads.U0.r[] rVarArr = bVar.q;
        q[] qVarArr = new q[0];
        if (rVarArr != null && rVarArr.length > 0) {
            qVarArr = new q[rVarArr.length];
            for (int i = 0; i < rVarArr.length; i++) {
                qVarArr[i] = new q(rVarArr[i].f12580a, this.k.d);
            }
        }
        sg.bigo.ads.U0.r[] rVarArr2 = bVar.r;
        q[] qVarArr2 = new q[0];
        if (rVarArr2 != null && rVarArr2.length > 0) {
            qVarArr2 = new q[rVarArr2.length];
            for (int i2 = 0; i2 < rVarArr2.length; i2++) {
                qVarArr2[i2] = new q(rVarArr2[i2].f12580a, this.k.d);
            }
        }
        sg.bigo.ads.U0.r[] rVarArr3 = bVar.s;
        q[] qVarArr3 = new q[0];
        if (rVarArr3 != null && rVarArr3.length > 0) {
            qVarArr3 = new q[rVarArr3.length];
            for (int i3 = 0; i3 < rVarArr3.length; i3++) {
                qVarArr3[i3] = new q(rVarArr3[i3].f12580a, this.k.d);
            }
        }
        sg.bigo.ads.U0.r[] rVarArr4 = bVar.t;
        q[] qVarArr4 = new q[0];
        if (rVarArr4 != null && rVarArr4.length > 0) {
            qVarArr4 = new q[rVarArr4.length];
            for (int i4 = 0; i4 < rVarArr4.length; i4++) {
                qVarArr4[i4] = new q(rVarArr4[i4].f12580a, this.k.d);
            }
        }
        sg.bigo.ads.x1.f a2 = a(uVar, qVarArr, qVarArr2, qVarArr3, qVarArr4);
        this.m = a2;
        a2.a("express_id", !I.a((CharSequence) bVar.K) ? bVar.K : bVar.c.q);
    }

    @Override // sg.bigo.ads.api.Ad
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        this.j = adInteractionListener;
    }

    public boolean t() {
        return this.s;
    }

    public void u() {
        x();
        if (this.f != 4) {
            this.f = this.e.a(this.l);
        }
        sg.bigo.ads.x1.f fVar = this.m;
        int i = this.f;
        fVar.h = i;
        sg.bigo.ads.x1.s sVar = fVar.f;
        if (sVar != null) {
            sVar.q = i;
        }
        Pair pair = null;
        AbstractC5446j.a(1, null, new sg.bigo.ads.x1.c(fVar, this.k.e, n()), 0L);
        if (!this.G.contains("06002010")) {
            if (e() != null && ((sg.bigo.ads.U0.b) e()).a(64) && ((sg.bigo.ads.U0.b) e()).z != null) {
                pair = D.a(this.k.e, ((sg.bigo.ads.U0.b) e()).z.g, ((sg.bigo.ads.U0.b) e()).U);
            }
            sg.bigo.ads.s1.b.a(this.k.e, this, (String) a("", "show_proportion"), o(), ((Integer) a((Object) 0, "render_style")).intValue(), this.A != 0 ? SystemClock.elapsedRealtime() - this.A : 0L, ((Long) a((Object) (-1L), "attach_render_cost")).longValue(), SystemClock.elapsedRealtime() - this.x, ((Integer) a((Object) (-1), "icon_sta")).intValue(), ((Integer) a((Object) (-1), "img_sta")).intValue(), ((Integer) a((Object) (-1), "vid_sta")).intValue(), pair == null ? -1 : ((Integer) pair.first).intValue(), pair == null ? -1 : ((Integer) pair.second).intValue());
        }
        if (((sg.bigo.ads.U0.b) this.k.f12482a).z.k == 0) {
            v();
        }
    }

    public void v() {
        sg.bigo.ads.P.c cVar = this.k.f12482a;
        if (((sg.bigo.ads.U0.b) cVar).z.f > 0) {
            sg.bigo.ads.Y0.g gVar = new sg.bigo.ads.Y0.g(cVar);
            this.z = gVar;
            Context context = this.k.e;
            sg.bigo.ads.U0.j jVar = gVar.b;
            String str = jVar.f12574a;
            String str2 = jVar.j;
            int i = jVar.c;
            int i2 = gVar.c;
            if (((i2 == 4 || i2 == 5) && TextUtils.isEmpty(str2)) || sg.bigo.ads.j1.b.a(str) || TextUtils.isEmpty(str) || !str.startsWith(ProxyConfig.MATCH_HTTP)) {
                return;
            }
            if (i == 0 || i == 2) {
                AbstractC5446j.a(2, null, new sg.bigo.ads.Y0.e(gVar, str, context, i, new C5014d(gVar), str2), 0L);
            }
        }
    }

    public void w() {
        a("clicked");
    }

    public void x() {
        a("impression");
    }

    public void a(Point point, int i, int i2, sg.bigo.ads.P.f fVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z = false;
        if (this.y.compareAndSet(false, true)) {
            this.m.a(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, String.valueOf(fVar.f12478a));
            sg.bigo.ads.x1.f fVar2 = this.m;
            if (point != null) {
                i4 = point.x;
                i3 = point.y;
            } else {
                i3 = 0;
                i4 = 0;
            }
            View view = this.l;
            if (view != null) {
                i5 = view.getWidth();
                i6 = this.l.getHeight();
            } else {
                i5 = 0;
                i6 = 0;
            }
            float floatValue = i5 > 0 ? new BigDecimal(i4 / i5).setScale(3, 4).floatValue() : 0.0f;
            float floatValue2 = i6 > 0 ? new BigDecimal(i3 / i6).setScale(3, 4).floatValue() : 0.0f;
            String str = (i2 == 1 || i2 == 2) ? "direct" : i2 == 3 ? "confirm" : "unknown";
            Pattern pattern = I.f12345a;
            Locale locale = Locale.ENGLISH;
            String str2 = "{'x':" + i4 + ",'y':" + i3 + ",'ad_w':" + i5 + ",'ad_h':" + i6 + ",'x_r':" + floatValue + ",'y_r':" + floatValue2 + ",'mode':'" + str + "'}";
            try {
                str2 = URLEncoder.encode(str2, C4761z5.O);
            } catch (UnsupportedEncodingException e) {
                AbstractC5496a.a("StringUtils", "Error encoding url, error message is : " + e.toString());
            }
            fVar2.a("click_prop", str2);
            this.m.a("click_source", String.valueOf(i2));
            this.m.a("click_module", String.valueOf(i));
            int i7 = fVar.f12478a;
            if (i7 == 1) {
                z = ((sg.bigo.ads.U0.b) this.k.f12482a).a(4);
            } else if (i7 == 4) {
                z = ((sg.bigo.ads.U0.b) this.k.f12482a).a(8);
            }
            sg.bigo.ads.x1.f fVar3 = this.m;
            Context context = this.k.e;
            int m = m();
            int n = n();
            fVar3.getClass();
            AbstractC5446j.a(1, null, new sg.bigo.ads.x1.b(fVar3, context, z, m, n), 0L);
        }
    }

    public sg.bigo.ads.x1.f a(u uVar, q[] qVarArr, q[] qVarArr2, q[] qVarArr3, q[] qVarArr4) {
        return new sg.bigo.ads.x1.f(uVar, qVarArr, qVarArr2, qVarArr3, qVarArr4, sg.bigo.ads.s1.b.a(this.k.f12482a, (sg.bigo.ads.Q.b) this, true));
    }

    public Object a(Object obj, String str) {
        Object obj2 = this.N.get(str);
        return obj2 != null ? obj2 : obj;
    }

    public final void a(sg.bigo.ads.U.j jVar, int i, int i2, sg.bigo.ads.P.f fVar) {
        if (isExpired()) {
            sg.bigo.ads.s1.b.a(this.k.f12482a, new AdError(2000, 3, "The ad is expired"), t(), false);
            return;
        }
        boolean z = (i2 == 13 || i2 == 14) && (this instanceof sg.bigo.ads.Q.d);
        if (this.u && !z) {
            sg.bigo.ads.s1.b.a(this.k.f12482a, new AdError(2000, 3, "The ad is destroyed"), t(), false);
            return;
        }
        sg.bigo.ads.U0.e eVar = ((sg.bigo.ads.U0.b) this.k.f12482a).A;
        if ((eVar != null ? eVar.f12570a : 0) == 2) {
            if (!t()) {
                return;
            }
            if (SystemClock.elapsedRealtime() - this.w < (((sg.bigo.ads.U0.b) this.k.f12482a).A != null ? r2.b : 0L)) {
                return;
            }
        }
        b(jVar, i, i2, fVar);
    }

    public static boolean a(h hVar) {
        return hVar == null || hVar.u;
    }

    @Override // sg.bigo.ads.Q.b
    public final void a(int i, int i2, String str) {
        if (this.p) {
            return;
        }
        this.p = true;
        sg.bigo.ads.N.c cVar = this.k.c.h;
        if (cVar.m == 0) {
            cVar.m = System.currentTimeMillis();
        }
        if (((sg.bigo.ads.U0.b) this.k.f12482a).G || this.G.contains("06002008")) {
            return;
        }
        sg.bigo.ads.s1.b.a(this, i, i2, str);
    }

    public final void a(String str) {
        if (this.F.contains(str)) {
            return;
        }
        sg.bigo.ads.P.c e = e();
        HashMap a2 = sg.bigo.ads.f1.a.a(str, this.k.b, this.d, e, Integer.valueOf(((sg.bigo.ads.U0.b) e).c.v), null, null, this);
        if (str.equals("impression") || str.equals("clicked")) {
            a2.put("ad_size", o());
            a2.put("show_proportion", a("", "show_proportion"));
            a2.put("render_style", a((Object) 0, "render_style"));
        }
        sg.bigo.ads.f1.b.i.a(str, a2);
    }

    public final void a(sg.bigo.ads.Q.b bVar) {
        this.g = bVar;
        if (bVar != null) {
            HashMap hashMap = new HashMap();
            sg.bigo.ads.s1.b.a(hashMap, (sg.bigo.ads.Q.b) this, false);
            sg.bigo.ads.x1.f fVar = this.m;
            fVar.getClass();
            if (A.a(hashMap)) {
                return;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str != null && str2 != null) {
                    fVar.g.put(str, str2);
                }
            }
        }
    }

    public void a(sg.bigo.ads.P.e eVar) {
        this.I = eVar;
    }

    public void b(Point point, int i, int i2, sg.bigo.ads.P.f fVar) {
        w();
        a(point, i, i2, fVar);
    }

    public final void b(int i, int i2, String str) {
        AdError adError = new AdError(i, i2, str);
        sg.bigo.ads.s1.b.a(this.k.f12482a, new AdError(i, i2, str), t(), true);
        AdInteractionListener adInteractionListener = this.j;
        if (adInteractionListener != null) {
            adInteractionListener.onAdError(adError);
        }
    }
}
