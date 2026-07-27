package sg.bigo.ads.w;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.R;
import sg.bigo.ads.T0.q;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5163f0;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.AbstractC5204s;
import sg.bigo.ads.h.C5182k1;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.h.Q1;
import sg.bigo.ads.i.C5231c;
import sg.bigo.ads.i.C5236h;
import sg.bigo.ads.i.C5241m;
import sg.bigo.ads.j.C5252f;
import sg.bigo.ads.k.InterfaceC5257b;
import sg.bigo.ads.m.AbstractC5325d;
import sg.bigo.ads.t.InterfaceC5475e;

/* loaded from: classes3.dex */
public class i extends AbstractC5204s implements InterfaceC5495a {
    public AbstractC5204s a0;
    public sg.bigo.ads.E.d b0;
    public int c0;
    public int d0;
    public AbstractC5325d e0;
    public c f0;
    public TextView g0;
    public boolean h0;
    public int i0;
    public int j0;
    public boolean k0;
    public int l0;
    public ViewGroup m0;
    public sg.bigo.ads.C.l n0;
    public q o0;
    public boolean p0;
    public C5236h q0;
    public final d r0;
    public final e s0;

    public i(Activity activity) {
        super(activity);
        this.c0 = 0;
        this.d0 = 1;
        this.h0 = false;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = false;
        this.l0 = 0;
        this.r0 = new d(this);
        this.s0 = new e(this);
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final int D() {
        return R.layout.bigo_ad_one2n_activity_interstitial;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v8 java.lang.Integer, still in use, count: 2, list:
          (r0v8 java.lang.Integer) from 0x005d: IF  (r0v8 java.lang.Integer) != (null java.lang.Integer)  -> B:15:0x005f A[HIDDEN]
          (r0v8 java.lang.Integer) from 0x005f: PHI (r0v15 java.lang.Integer) = (r0v8 java.lang.Integer), (r0v14 java.lang.Integer), (r0v17 java.lang.Integer) binds: [B:21:0x005d, B:19:0x0050, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void E0() {
        /*
            r4 = this;
            sg.bigo.ads.ad.interstitial.AdCountDownButton r0 = r4.g
            if (r0 == 0) goto L89
            sg.bigo.ads.T0.q r1 = r4.t
            if (r1 != 0) goto La
            goto L89
        La:
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L1b
            sg.bigo.ads.ad.interstitial.AdCountDownButton r0 = r4.g
            r1 = 0
            r0.setVisibility(r1)
            sg.bigo.ads.ad.interstitial.AdCountDownButton r0 = r4.g
            sg.bigo.ads.h.AbstractC5140Q.b(r0)
        L1b:
            r4.v0()
            sg.bigo.ads.T0.q r0 = r4.t
            r1 = 15
            if (r0 == 0) goto L63
            boolean r2 = r4.h0
            r3 = 3
            if (r2 == 0) goto L38
            java.lang.String r1 = "multi_ads_endpage.force_staying_time"
            java.lang.Object r0 = r0.a(r1)
            java.lang.Integer r0 = sg.bigo.ads.K0.z.a(r0)
            if (r0 == 0) goto L36
            goto L5f
        L36:
            r1 = r3
            goto L63
        L38:
            sg.bigo.ads.C.l r2 = r4.n0
            if (r2 == 0) goto L53
            sg.bigo.ads.P.c r0 = r2.e()
            sg.bigo.ads.e1.a r0 = (sg.bigo.ads.e1.InterfaceC5087a) r0
            sg.bigo.ads.U0.b r0 = (sg.bigo.ads.U0.b) r0
            sg.bigo.ads.T0.q r0 = r0.I
            java.lang.String r1 = "endpage.force_staying_time"
            java.lang.Object r0 = r0.a(r1)
            java.lang.Integer r0 = sg.bigo.ads.K0.z.a(r0)
            if (r0 == 0) goto L36
            goto L5f
        L53:
            java.lang.String r2 = "multi_ads.force_staying_time"
            java.lang.Object r0 = r0.a(r2)
            java.lang.Integer r0 = sg.bigo.ads.K0.z.a(r0)
            if (r0 == 0) goto L63
        L5f:
            int r1 = r0.intValue()
        L63:
            if (r1 > 0) goto L67
            r1 = 10
        L67:
            boolean r0 = r4.h0
            if (r0 != 0) goto L78
            sg.bigo.ads.C.l r0 = r4.n0
            if (r0 == 0) goto L70
            goto L78
        L70:
            sg.bigo.ads.ad.interstitial.AdCountDownButton r0 = r4.g
            sg.bigo.ads.w.e r2 = r4.s0
            r0.a(r1, r2)
            goto L89
        L78:
            sg.bigo.ads.ad.interstitial.AdCountDownButton r0 = r4.g
            sg.bigo.ads.w.e r2 = r4.s0
            sg.bigo.ads.h.v r3 = r0.b
            if (r3 == 0) goto L89
            r3.a()
            r3 = 0
            r0.b = r3
            r0.a(r1, r2)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.w.i.E0():void");
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final int G() {
        return 0;
    }

    public final void H0() {
        sg.bigo.ads.C.l lVar;
        AbstractC5204s abstractC5204s = this.a0;
        if (abstractC5204s != null) {
            abstractC5204s.w();
            this.a0 = null;
        }
        sg.bigo.ads.E.d dVar = this.b0;
        if (dVar == null || (lVar = dVar.k0) == null || lVar.u) {
            return;
        }
        lVar.destroy();
    }

    public Pair I0() {
        sg.bigo.ads.C.l D = this.b0.D();
        if (D == null) {
            return null;
        }
        Object lVar = D instanceof sg.bigo.ads.D.i ? new l(this.f12687a, this) : D instanceof sg.bigo.ads.D.k ? new o(this.f12687a, this) : null;
        if (lVar == null) {
            return null;
        }
        return new Pair(D, lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bd, code lost:
    
        if (r11.h0 == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J0() {
        sg.bigo.ads.E.c cVar;
        AbstractC5163f0 abstractC5163f0;
        C5182k1 c5182k1;
        sg.bigo.ads.C.l lVar = this.n0;
        if (lVar != null && (abstractC5163f0 = this.e) != null && (c5182k1 = ((C5185l1) abstractC5163f0).Z) != null) {
            c5182k1.b(lVar);
        }
        sg.bigo.ads.E.d dVar = this.b0;
        Iterator it = dVar.o0.entrySet().iterator();
        int i = Integer.MAX_VALUE;
        sg.bigo.ads.C.l lVar2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            sg.bigo.ads.C.l lVar3 = (sg.bigo.ads.C.l) entry.getKey();
            q qVar = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar3.e())).I;
            if (qVar != null && !((sg.bigo.ads.E.c) entry.getValue()).e && ((sg.bigo.ads.E.c) entry.getValue()).f12263a) {
                Integer a2 = z.a(qVar.a("endpage.is_endpage"));
                if (1 == (a2 != null ? a2.intValue() : 0)) {
                    Integer a3 = z.a(qVar.a("endpage.ep_sprt"));
                    if (1 == (a3 != null ? a3.intValue() : 0) && ((sg.bigo.ads.E.c) entry.getValue()).c < i) {
                        i = ((sg.bigo.ads.E.c) entry.getValue()).c;
                        lVar2 = lVar3;
                    }
                }
            }
        }
        if (lVar2 != null && (cVar = (sg.bigo.ads.E.c) dVar.o0.get(lVar2)) != null) {
            cVar.e = true;
        }
        this.n0 = lVar2;
        if (lVar2 == null) {
            q qVar2 = this.t;
            if (qVar2 != null) {
                Integer a4 = z.a(qVar2.a("multi_ads_endpage.is_endpage"));
                if (1 == (a4 != null ? a4.intValue() : 1)) {
                }
            }
            return false;
        }
        sg.bigo.ads.C.l lVar4 = this.n0;
        if (lVar4 != null) {
            AbstractC5325d a5 = AbstractC5325d.a(lVar4, ((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar4.e())).I, null, null, false);
            this.e0 = a5;
            if (a5 != null) {
                a5.f = this.c;
                if (this.m0 == null) {
                    ViewStub viewStub = (ViewStub) this.f12687a.findViewById(R.id.bigo_ad_native_ad_view_stub);
                    if (viewStub != null) {
                        viewStub.setLayoutResource(R.layout.bigo_ad_activity_interstitial_multi_owner_native);
                        this.m0 = (ViewGroup) viewStub.inflate();
                    }
                }
                if (this.m0 != null) {
                    H0();
                    E0();
                    this.e0.a(this, this.m0, 1);
                    L0();
                    return true;
                }
            }
        } else {
            sg.bigo.ads.E.d dVar2 = this.b0;
            if (dVar2.u0 > 0 && dVar2.q0.get() == dVar2.u0) {
                AbstractC5325d a6 = AbstractC5325d.a(this.b0, this.t, null, null, false);
                this.e0 = a6;
                if (a6 != null) {
                    a6.f = this.c;
                    if (this.m0 == null) {
                        ViewStub viewStub2 = (ViewStub) this.f12687a.findViewById(R.id.bigo_ad_native_ad_view_stub);
                        if (viewStub2 != null) {
                            viewStub2.setLayoutResource(R.layout.bigo_ad_activity_interstitial_multi_owner_native);
                            this.m0 = (ViewGroup) viewStub2.inflate();
                        }
                    }
                    if (this.m0 != null) {
                        this.h0 = true;
                        this.k0 = false;
                        E0();
                        this.e0.a(this, this.m0, 1);
                        H0();
                        L0();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void K0() {
    }

    public void L0() {
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final boolean M() {
        return false;
    }

    public final boolean M0() {
        Pair I0 = I0();
        if (I0 == null) {
            return false;
        }
        sg.bigo.ads.C.l lVar = (sg.bigo.ads.C.l) I0.first;
        AbstractC5204s abstractC5204s = (AbstractC5204s) I0.second;
        if (lVar == null || abstractC5204s == null) {
            return false;
        }
        H0();
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.o0 = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar.e())).I;
        sg.bigo.ads.C.l lVar2 = ((C5185l1) this.e).W;
        if (lVar2 instanceof sg.bigo.ads.E.d) {
            ((sg.bigo.ads.E.d) lVar2).k0 = lVar;
        }
        abstractC5204s.l = lVar;
        this.c0++;
        abstractC5204s.v();
        this.a0 = abstractC5204s;
        if (1 == this.c0) {
            E0();
        }
        return true;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final boolean N() {
        sg.bigo.ads.E.d dVar = this.b0;
        if (dVar == null) {
            return true;
        }
        sg.bigo.ads.C.l lVar = dVar.k0;
        if (lVar instanceof sg.bigo.ads.E.f) {
            return ((sg.bigo.ads.E.f) lVar).x0;
        }
        return true;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final void P() {
        l(0);
        w0();
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void R() {
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.a();
        }
        AbstractC5204s abstractC5204s = this.a0;
        if (abstractC5204s instanceof o) {
            ((o) abstractC5204s).R();
        } else if (abstractC5204s instanceof l) {
            ((l) abstractC5204s).R();
        } else {
            super.R();
        }
        AbstractC5325d abstractC5325d = this.e0;
        if (abstractC5325d != null) {
            abstractC5325d.a();
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void S() {
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.b();
        }
        AbstractC5204s abstractC5204s = this.a0;
        if (abstractC5204s instanceof o) {
            ((o) abstractC5204s).S();
        } else if (abstractC5204s instanceof l) {
            ((l) abstractC5204s).S();
        } else {
            super.S();
        }
        AbstractC5325d abstractC5325d = this.e0;
        if (abstractC5325d != null) {
            abstractC5325d.b();
        }
    }

    @Override // sg.bigo.ads.w.InterfaceC5495a
    public final void a(int i, int i2) {
        AbstractC5204s abstractC5204s;
        AdCountDownButton adCountDownButton;
        AdCountDownButton adCountDownButton2;
        if (this.h0) {
            return;
        }
        AdCountDownButton adCountDownButton3 = this.g;
        if (adCountDownButton3 != null && !this.k0) {
            adCountDownButton3.a(true);
        }
        if (this.d0 == 2 && i2 == 2 && 1 == this.c0 && (adCountDownButton2 = this.g) != null && !adCountDownButton2.c) {
            if (i == 11) {
                adCountDownButton2.a();
            } else if (!(this.b0.k0 instanceof sg.bigo.ads.E.f) && (!this.a0.k0() || this.a0.l0())) {
                this.g.a();
            }
        }
        if (this.d0 == 2 && i2 == 1 && (abstractC5204s = this.a0) != null && (!abstractC5204s.k0() || this.a0.l0())) {
            sg.bigo.ads.C.l lVar = this.b0.k0;
            if ((lVar instanceof sg.bigo.ads.E.f) && (adCountDownButton = this.g) != null && !adCountDownButton.c) {
                ((sg.bigo.ads.E.f) lVar).x0 = false;
                if (1 == this.c0) {
                    adCountDownButton.a();
                }
            }
        }
        if (this.d0 == 1) {
            if (i != 11) {
                if (i != 0) {
                    return;
                }
                AbstractC5204s abstractC5204s2 = this.a0;
                if (abstractC5204s2 != null && abstractC5204s2.k0() && !this.a0.l0()) {
                    return;
                }
                boolean z = this.b0.k0 instanceof sg.bigo.ads.E.f;
                if ((!z || i2 != 1) && (z || i2 != 2)) {
                    return;
                }
            }
            b(true, true);
        }
    }

    @Override // sg.bigo.ads.w.InterfaceC5495a
    public final void a(boolean z, int i, int i2, int i3, sg.bigo.ads.U.j jVar, sg.bigo.ads.C.l lVar, sg.bigo.ads.x.q qVar) {
    }

    @Override // sg.bigo.ads.w.InterfaceC5495a
    public final View b() {
        sg.bigo.ads.C.l lVar;
        Pair a2;
        FrameLayout frameLayout;
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 != null && (lVar = this.n0) != null && (a2 = ((C5185l1) abstractC5163f0).a(lVar)) != null) {
            C5241m c5241m = (C5241m) a2.first;
            if (c5241m.f12988a && c5241m.c() && !c5241m.b) {
                c5241m.a(1);
                g gVar = new g(this, this.n0, 13);
                C5252f c5252f = c5241m.p;
                c5252f.l = gVar;
                return c5252f.o;
            }
            if (c5241m.f12988a && !c5241m.b && c5241m.h()) {
                c5241m.p.l = new g(this, this.n0, 13);
                Activity activity = this.f12687a;
                if (activity == null) {
                    frameLayout = null;
                } else {
                    C5236h c5236h = this.q0;
                    if (c5236h != null) {
                        c5236h.a();
                    }
                    frameLayout = new FrameLayout(activity);
                    frameLayout.setTag(19);
                    C5236h c5236h2 = new C5236h(c5241m);
                    this.q0 = c5236h2;
                    c5236h2.a(activity, frameLayout);
                }
                if (frameLayout != null) {
                    return frameLayout;
                }
            } else if (!c5241m.c()) {
                c5241m.p.b();
            }
            C5231c c5231c = (C5231c) a2.second;
            if (c5231c.f12978a && c5231c.c()) {
                c5231c.a(1);
                sg.bigo.ads.C.l lVar2 = this.n0;
                g gVar2 = new g(this, lVar2, 15);
                InterfaceC5257b interfaceC5257b = c5231c.b;
                if (interfaceC5257b instanceof C5252f) {
                    ((C5252f) interfaceC5257b).l = gVar2;
                }
                h hVar = new h(lVar2);
                if (interfaceC5257b instanceof sg.bigo.ads.j.l) {
                    ((sg.bigo.ads.j.l) interfaceC5257b).k = hVar;
                }
                return c5231c.e();
            }
            if (!c5231c.c()) {
                c5231c.b();
            }
        }
        return null;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final Q1 b0() {
        Q1 q1 = new Q1();
        q1.b = 0;
        return q1;
    }

    @Override // sg.bigo.ads.w.InterfaceC5495a
    public final void c(int i) {
        sg.bigo.ads.C.l lVar;
        this.l0 = i;
        if (i == 11) {
            this.r0.onReceiveValue(Double.valueOf(1.0d));
        }
        sg.bigo.ads.E.d dVar = this.b0;
        int incrementAndGet = dVar.x0.incrementAndGet();
        Iterator it = dVar.o0.keySet().iterator();
        while (it.hasNext()) {
            ((sg.bigo.ads.U0.k) ((InterfaceC5087a) ((sg.bigo.ads.C.l) it.next()).e())).d1 = incrementAndGet;
        }
        if (i == 12 || i == 13) {
            c cVar = this.f0;
            if (cVar != null) {
                cVar.setVisibility(8);
            }
            TextView textView = this.g0;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            c cVar2 = this.f0;
            if (cVar2 != null && (lVar = this.b0.k0) != null) {
                this.j0++;
                String str = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar.e())).f;
                int i2 = this.j0;
                if (cVar2.f13362a.containsKey(str)) {
                    if (cVar2.d == null) {
                        cVar2.d = str;
                        cVar2.c.remove(str);
                        cVar2.c.add(0, str);
                    }
                    Iterator it2 = cVar2.c.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        Integer num = (Integer) cVar2.f13362a.get(str2);
                        int min = Math.min(i2, num == null ? 0 : num.intValue());
                        cVar2.b.put(str2, Integer.valueOf(min));
                        i2 -= min;
                    }
                    cVar2.invalidate();
                }
            } else if (this.g0 != null) {
                Locale locale = Locale.US;
                this.g0.setText("Ad " + this.c0 + " of " + this.b0.u0);
            }
        }
        v0();
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton == null || adCountDownButton.c) {
            return;
        }
        if (adCountDownButton != null && !this.k0) {
            adCountDownButton.a(false);
        }
        if (this.c0 <= 1 || i != 0) {
            return;
        }
        this.g.b();
    }

    @Override // sg.bigo.ads.w.InterfaceC5495a
    public final boolean d() {
        return this.p0;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final boolean f(boolean z) {
        return b(z, false);
    }

    @Override // sg.bigo.ads.w.InterfaceC5495a
    public final void i() {
        this.p0 = true;
    }

    @Override // sg.bigo.ads.w.InterfaceC5495a
    public final ValueCallback j() {
        return this.r0;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void u0() {
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void v() {
        super.v();
        sg.bigo.ads.C.l D = ((C5185l1) this.e).D();
        if (!(D instanceof sg.bigo.ads.E.d)) {
            this.f12687a.finish();
            return;
        }
        this.b0 = (sg.bigo.ads.E.d) D;
        q qVar = this.t;
        if (qVar != null) {
            Integer a2 = z.a(qVar.a("multi_ads.n_tips"));
            this.i0 = a2 != null ? a2.intValue() : 0;
            Integer a3 = z.a(this.t.a("multi_ads.switch_type"));
            this.d0 = a3 != null ? a3.intValue() : 1;
        }
        int i = this.i0;
        if (i == 2) {
            FrameLayout frameLayout = (FrameLayout) this.f12687a.findViewById(R.id.inter_container);
            if (frameLayout != null && this.i0 != 0) {
                this.f0 = new c(this.f12687a);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AbstractC4963u.a(frameLayout.getContext(), 2));
                int a4 = AbstractC4963u.a(frameLayout.getContext(), 12);
                layoutParams.topMargin = AbstractC4963u.a(frameLayout.getContext(), 7);
                layoutParams.leftMargin = a4;
                layoutParams.rightMargin = a4;
                layoutParams.gravity = 48;
                frameLayout.addView(this.f0, layoutParams);
                HashMap hashMap = new HashMap();
                for (sg.bigo.ads.C.l lVar : this.b0.o0.keySet()) {
                    hashMap.put(((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar.e())).f, 1);
                    if (((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar.e())).I != null) {
                        Integer a5 = z.a(((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar.e())).I.a("endpage.is_endpage"));
                        if (1 == (a5 != null ? a5.intValue() : 1)) {
                            Integer a6 = z.a(((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar.e())).I.a("endpage.ep_sprt"));
                            if ((a6 != null ? a6.intValue() : 0) == 0) {
                                hashMap.put(((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar.e())).f, 2);
                            }
                        }
                    }
                }
                this.f0.setTotalNum(hashMap);
            }
        } else if (i == 1) {
            TextView textView = new TextView(this.f12687a);
            this.g0 = textView;
            textView.setTextSize(12.0f);
            this.g0.setTextColor(I.a(-1, "#CCFFFFFF"));
            this.g0.setShadowLayer(2.0f, 0.0f, 2.0f, ViewCompat.MEASURED_STATE_MASK);
            ViewGroup viewGroup = (ViewGroup) this.f12687a.findViewById(R.id.bigo_ad_close_progress_container);
            if (viewGroup != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.rightMargin = AbstractC4963u.a(viewGroup.getContext(), 7);
                viewGroup.addView(this.g0, 0, marginLayoutParams);
            }
        }
        if (M0()) {
            return;
        }
        this.f12687a.finish();
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void v0() {
        int i;
        Integer a2;
        sg.bigo.ads.C.l lVar = this.n0;
        if (lVar != null) {
            this.o0 = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar.e())).I;
        }
        q qVar = this.o0;
        if (qVar == null || this.g == null) {
            super.v0();
            return;
        }
        int i2 = 1;
        if (!this.h0 ? !((i = this.l0) == 11 || i == 12 ? (a2 = z.a(qVar.a("endpage.close_button_style"))) == null : (a2 = z.a(qVar.a("video_play_page.close_button_style"))) == null) : (a2 = z.a(qVar.a("multi_ads_endpage.close_button_style"))) != null) {
            i2 = a2.intValue();
        }
        AbstractC5164f1.a(i2, this.g);
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void w() {
        this.b0 = null;
        this.n0 = null;
        C5236h c5236h = this.q0;
        if (c5236h != null) {
            c5236h.a();
            this.q0 = null;
        }
        super.w();
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void a(AdCountDownButton adCountDownButton) {
        X.a(adCountDownButton, new f(this));
    }

    public boolean b(boolean z, boolean z2) {
        boolean J0;
        if (this.h0) {
            return true;
        }
        if (!this.k0 || (z2 && this.c0 != this.b0.u0)) {
            InterfaceC5475e interfaceC5475e = this.a0;
            if ((interfaceC5475e instanceof b) && !((b) interfaceC5475e).e()) {
                return false;
            }
            if (this.c0 != this.b0.u0 && M0()) {
                return false;
            }
            J0 = J0();
        } else {
            J0 = J0();
        }
        return !J0;
    }
}
