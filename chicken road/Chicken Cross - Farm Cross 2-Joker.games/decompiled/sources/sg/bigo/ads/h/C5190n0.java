package sg.bigo.ads.h;

import android.app.Activity;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.f.AbstractC5098c;
import sg.bigo.ads.f.C5096a;
import sg.bigo.ads.f.C5111p;
import sg.bigo.ads.f.RunnableC5100e;
import sg.bigo.ads.f.RunnableC5103h;
import sg.bigo.ads.f.RunnableC5104i;
import sg.bigo.ads.k1.C5270k;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.h.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5190n0 extends AbstractC5163f0 {
    public final C5111p W;
    public sg.bigo.ads.f.z X;
    public final boolean Y;
    public boolean Z;
    public final AtomicBoolean a0;
    public final sg.bigo.ads.A.e b0;

    public C5190n0(sg.bigo.ads.P.j jVar) {
        super(jVar);
        sg.bigo.ads.A.e eVar;
        sg.bigo.ads.T0.q qVar;
        try {
            sg.bigo.ads.U0.c cVar = (sg.bigo.ads.U0.c) this.k.f12482a;
            if (cVar == null || (qVar = cVar.I) == null) {
                eVar = null;
            } else {
                C5181k0 c5181k0 = new C5181k0();
                Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.ad_component_layout"));
                c5181k0.f12899a = a2 != null ? a2.intValue() : 0;
                Integer a3 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.force_staying_time"));
                c5181k0.b = a3 != null ? a3.intValue() : 0;
                Integer a4 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.close_button_style"));
                c5181k0.c = a4 != null ? a4.intValue() : 0;
                Integer a5 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.x_area"));
                c5181k0.d = a5 != null ? a5.intValue() : 0;
                Integer a6 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.duration"));
                c5181k0.e = a6 != null ? a6.intValue() : 0;
                int i = c5181k0.f12899a;
                eVar = i != 1 ? i != 2 ? new sg.bigo.ads.A.e(this, this.k.e, c5181k0) : new sg.bigo.ads.A.d(this, this.k.e, c5181k0) : new sg.bigo.ads.A.c(this, this.k.e, c5181k0);
            }
            sg.bigo.ads.A.e eVar2 = eVar;
            this.b0 = eVar2;
            this.a0 = new AtomicBoolean(false);
            boolean a7 = cVar.a(32);
            this.Y = a7;
            C5111p c5111p = new C5111p(this.k.e, jVar, this, cVar, C(), new C5184l0(this), a7);
            this.W = c5111p;
            c5111p.d = 0;
            c5111p.t = eVar2;
        } catch (Exception unused) {
            throw new IllegalArgumentException("Error data type for ad!");
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5163f0
    public final boolean A() {
        return false;
    }

    @Override // sg.bigo.ads.h.AbstractC5163f0
    public Class B() {
        return C5178j0.class;
    }

    public int C() {
        return 2;
    }

    public final void D() {
        if (this.a0.compareAndSet(false, true)) {
            a("impression");
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5163f0
    public void a(sg.bigo.ads.Z0.g gVar) {
        sg.bigo.ads.P.c cVar = this.k.f12482a;
        if (!(cVar instanceof sg.bigo.ads.U0.c)) {
            gVar.a(this, 1021, 1250, "InterstitialBannerAd with invalid AdData class type.");
            return;
        }
        sg.bigo.ads.U0.g gVar2 = ((sg.bigo.ads.U0.c) cVar).x0;
        if (gVar2 == null || TextUtils.isEmpty(gVar2.c)) {
            gVar.a(this, 1022, 1252, "Empty content.");
            return;
        }
        C5111p c5111p = this.W;
        C5187m0 c5187m0 = new C5187m0();
        c5111p.getClass();
        AbstractC5446j.a(2, null, new RunnableC5103h(c5111p, c5187m0), 0L);
        gVar.a(this);
    }

    @Override // sg.bigo.ads.h.AbstractC5163f0
    public final boolean c(int i) {
        return true;
    }

    @Override // sg.bigo.ads.h.AbstractC5163f0, sg.bigo.ads.e.h
    public void destroyInMainThread() {
        this.X = null;
        super.destroyInMainThread();
        C5111p c5111p = this.W;
        c5111p.getClass();
        if (AbstractC5446j.e()) {
            c5111p.b();
        } else {
            AbstractC5446j.a(2, null, new RunnableC5104i(c5111p), 0L);
        }
    }

    @Override // sg.bigo.ads.api.Ad
    public final String getCreativeId() {
        sg.bigo.ads.U0.c cVar;
        C5111p c5111p = this.W;
        return (c5111p == null || (cVar = c5111p.m) == null) ? "" : cVar.n;
    }

    @Override // sg.bigo.ads.e.h
    public final void u() {
        super.u();
        C5111p c5111p = this.W;
        if (c5111p != null) {
            AbstractC5098c.a(c5111p, 6);
            Ad ad = c5111p.l;
            if (ad instanceof sg.bigo.ads.f.v) {
                sg.bigo.ads.f.v vVar = (sg.bigo.ads.f.v) ad;
                WeakHashMap weakHashMap = AbstractC5098c.f12761a;
                C5096a c5096a = (C5096a) weakHashMap.get(c5111p);
                if (c5096a == null) {
                    c5096a = new C5096a();
                    weakHashMap.put(c5111p, c5096a);
                }
                long[] jArr = c5096a.f12760a;
                Long valueOf = Long.valueOf(jArr[6] - jArr[4]);
                synchronized (vVar) {
                    vVar.N.put("attach_render_cost", valueOf);
                }
            }
            if (c5111p.f) {
                return;
            }
            c5111p.f = true;
            if (c5111p.g) {
                C5270k c5270k = c5111p.b;
                if (!c5111p.j && (c5270k instanceof sg.bigo.ads.E1.f)) {
                    c5111p.j = true;
                    AbstractC5446j.a(1, null, new RunnableC5100e(c5111p, c5270k), 0L);
                }
                C5270k c5270k2 = c5111p.b;
                if (c5270k2 != null) {
                    c5270k2.loadUrl("javascript:onViewImpression()");
                }
                sg.bigo.ads.m1.c cVar = c5111p.h;
                if (cVar != null) {
                    cVar.a();
                }
            }
        }
    }

    @Override // sg.bigo.ads.e.h
    public final void w() {
        a("clicked");
        D();
    }

    @Override // sg.bigo.ads.e.h
    public final void x() {
        if (!this.Y || this.Z) {
            D();
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5163f0
    public final void a(Activity activity) {
        C5111p c5111p = this.W;
        if (c5111p != null) {
            c5111p.getClass();
            c5111p.p = new WeakReference(activity);
        }
    }
}
