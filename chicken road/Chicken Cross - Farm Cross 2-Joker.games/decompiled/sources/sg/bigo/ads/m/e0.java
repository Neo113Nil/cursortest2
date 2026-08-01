package sg.bigo.ads.m;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.webkit.URLUtil;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.E1;
import sg.bigo.ads.h.O1;
import sg.bigo.ads.h.Z0;
import sg.bigo.ads.u.AbstractC5486g;
import sg.bigo.ads.u.AbstractC5487h;
import sg.bigo.ads.u.AbstractC5488i;
import sg.bigo.ads.u.AbstractC5490k;
import sg.bigo.ads.u.C5481b;
import sg.bigo.ads.u.C5485f;
import sg.bigo.ads.u.C5491l;

/* loaded from: classes3.dex */
public abstract class e0 extends AbstractC5325d {
    public final sg.bigo.ads.h.T o;
    public final C5485f p;
    public ViewFlow q;
    public Indicator r;
    public LinearLayout s;
    public sg.bigo.ads.v.k t;
    public sg.bigo.ads.v.k u;
    public final C5328g v;
    public C5481b w;
    public final AtomicBoolean x;
    public final ArrayList y;

    public e0(sg.bigo.ads.C.l lVar, int i, sg.bigo.ads.T0.q qVar, C5485f c5485f, sg.bigo.ads.q.o oVar) {
        super(lVar, qVar, oVar);
        this.v = new C5328g(this);
        this.x = new AtomicBoolean(false);
        this.y = new ArrayList();
        this.p = c5485f;
        this.o = new sg.bigo.ads.h.T();
    }

    public static void a(e0 e0Var, long j, long j2, long j3) {
        if (j > 0) {
            ViewFlow viewFlow = e0Var.q;
            if (!viewFlow.r && !viewFlow.b()) {
                e0Var.q.setScrollEnabled(false);
                int a2 = AbstractC4963u.a(e0Var.j.getContext(), 40);
                int scrollX = e0Var.q.getScrollX();
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(0, a2, 0);
                ofInt.setDuration(2 * j3);
                ofInt.setStartDelay(j2);
                ofInt.setInterpolator(new LinearInterpolator());
                C5331j c5331j = new C5331j(e0Var, j, j3);
                ofInt.addListener(c5331j);
                ofInt.addUpdateListener(new C5333l(e0Var, atomicBoolean, c5331j, j, j3, scrollX));
                ofInt.start();
                return;
            }
        }
        e0Var.q.setScrollEnabled(true);
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final void a(double d) {
    }

    public void b(double d) {
        boolean z;
        sg.bigo.ads.v.k kVar;
        if (d <= 3.0d) {
            sg.bigo.ads.v.k kVar2 = this.t;
            z = false;
            if (kVar2 != null) {
                kVar2.a(false);
            }
            kVar = this.u;
            if (kVar == null) {
                return;
            }
        } else {
            sg.bigo.ads.v.k kVar3 = this.t;
            z = true;
            if (kVar3 != null) {
                kVar3.a(true);
            }
            kVar = this.u;
            if (kVar == null) {
                return;
            }
        }
        kVar.a(z);
    }

    @Override // sg.bigo.ads.h.O1
    public final boolean d() {
        return false;
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final void f(AbstractC5144a1 abstractC5144a1) {
        int i;
        Integer a2;
        int i2;
        Context context;
        Context context2 = this.j.getContext();
        C5485f c5485f = this.p;
        ArrayList a3 = c5485f != null ? c5485f.a() : null;
        C5485f c5485f2 = this.p;
        int i3 = 0;
        boolean z = c5485f2 != null && c5485f2.d;
        int i4 = c5485f2 != null ? c5485f2.b : 1;
        int i5 = c5485f2 != null ? c5485f2.c : 1;
        sg.bigo.ads.U.r a4 = AbstractC5164f1.a(this.d);
        this.q = (ViewFlow) this.k.findViewById(R.id.inter_media_ad_view_flow);
        this.r = (Indicator) this.k.findViewById(R.id.inter_vf_indicator);
        sg.bigo.ads.T0.q qVar = this.e;
        if (qVar != null) {
            Integer a5 = sg.bigo.ads.K0.z.a(qVar.a("endpage.background_colour"));
            i = a5 != null ? a5.intValue() : 0;
        } else {
            i = 1;
        }
        int a6 = AbstractC5490k.a(i);
        if (a6 == 2) {
            this.k.setBackgroundColor(this.o.a(ViewCompat.MEASURED_STATE_MASK));
        } else if (a6 == 3 || a6 == 4) {
            this.k.setBackgroundColor(this.o.a(ViewCompat.MEASURED_STATE_MASK));
            this.w = new C5481b(this.k, this.q, this.o, a6);
        } else {
            this.k.setBackgroundColor(this.o.a(-1));
        }
        this.s = (LinearLayout) this.k.findViewById(R.id.inter_media_bottom_layout);
        if (sg.bigo.ads.K0.I.a((CharSequence) this.d.getWarning())) {
            ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).topMargin = AbstractC4963u.a(context2, 8);
        }
        g(abstractC5144a1);
        this.o.a(this.v);
        if (this.p != null) {
            Context context3 = this.j.getContext();
            this.q.setDividerWidth(AbstractC4963u.a(context3, AbstractC5488i.c(i4)));
            this.q.setContentMaxWidthSpace(AbstractC4963u.a(context3, AbstractC5488i.b(i4)));
            this.q.setViewStyle(AbstractC5488i.f(i4));
            this.q.setOnItemChangeListener(new C5491l(i4, this.r, this.w));
            int i6 = 0;
            int i7 = 0;
            while (a3 != null && i7 < a3.size()) {
                String str = (String) a3.get(i7);
                if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
                    i2 = i7;
                    context = context3;
                } else {
                    i2 = i7;
                    context = context3;
                    a(abstractC5144a1, i5, a6, str, ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.d.e())).T);
                    i6++;
                }
                i7 = i2 + 1;
                context3 = context;
            }
            Context context4 = context3;
            int max = Math.max(i4 == 3 ? 3 - i6 : 0, 0);
            if (z) {
                max = Math.max(max, 1);
            }
            int i8 = max;
            for (int i9 = 0; i9 < i8; i9++) {
                O1.a(abstractC5144a1, new C5330i(a(abstractC5144a1, i5, a6, (String) null, false)));
            }
            this.q.setMainChildSize(a4);
            int a7 = AbstractC5487h.a(i4);
            if (a7 == 1 || a7 == 2 || a7 == 3 || a7 == 4) {
                C5337p c5337p = new C5337p(this);
                sg.bigo.ads.v.k kVar = new sg.bigo.ads.v.k(context4, true);
                this.t = kVar;
                this.q.setStartView(kVar.f13348a);
                this.q.setOnStartViewShowListener(c5337p);
                sg.bigo.ads.v.k kVar2 = new sg.bigo.ads.v.k(context4, false);
                this.u = kVar2;
                this.q.setEndView(kVar2.f13348a);
                this.q.setOnEndViewShowListener(c5337p);
            }
            int itemCount = i4 == 3 ? this.q.getItemCount() >> 1 : 0;
            ViewFlow viewFlow = this.q;
            viewFlow.e = itemCount;
            if (viewFlow.K) {
                viewFlow.requestLayout();
            } else {
                viewFlow.a(itemCount, -20, true);
            }
            C5481b c5481b = this.w;
            if (c5481b != null) {
                c5481b.a(itemCount);
            }
        }
        if (k()) {
            return;
        }
        C5485f c5485f3 = this.p;
        if (c5485f3 != null && (a2 = sg.bigo.ads.K0.z.a(c5485f3.f13330a.a("endpage.multi_guide"))) != null) {
            i3 = a2.intValue();
        }
        switch (i3) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                a(i3, new RunnableC5336o(this));
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.q.setFlipInterval((i3 - 5) * 1000);
                this.q.a();
                break;
        }
    }

    public abstract void g(AbstractC5144a1 abstractC5144a1);

    public final boolean k() {
        C5485f c5485f = this.p;
        return c5485f == null || c5485f.b == 1;
    }

    public final sg.bigo.ads.v.d a(AbstractC5144a1 abstractC5144a1, int i, int i2, String str, boolean z) {
        sg.bigo.ads.v.d dVar = new sg.bigo.ads.v.d(this.j.getContext(), this.p, i, c(), i2, str, z, new C5339r(this, abstractC5144a1));
        sg.bigo.ads.L0.z zVar = new sg.bigo.ads.L0.z();
        zVar.f12421a = -1;
        zVar.b = -1;
        zVar.c = false;
        zVar.d = AbstractC5486g.a(i);
        this.q.addView(dVar.e, zVar);
        if (this.w != null) {
            dVar.m = new C5326e(this, dVar);
        }
        return dVar;
    }

    @Override // sg.bigo.ads.h.O1
    public final boolean a(AbstractC5144a1 abstractC5144a1, ViewGroup viewGroup, ViewGroup viewGroup2, E1 e1, int i, int i2, int i3, View... viewArr) {
        return super.a(abstractC5144a1, viewGroup, viewGroup2, new C5329h(this), i, 4, i3, viewArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (r8 != 2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    @Override // sg.bigo.ads.m.AbstractC5325d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i, boolean z, boolean z2) {
        boolean z3;
        Iterator<View> it;
        int i2;
        List<View> items = this.q.getItems();
        sg.bigo.ads.C.f.a(this.k, 9);
        sg.bigo.ads.C.f.a(this.q, 9);
        if (z2) {
            sg.bigo.ads.C.f.a(this.j, this.k, 4, this.d, i);
            sg.bigo.ads.C.f.a(this.j, this.q, 4, this.d, i);
        } else {
            ViewGroup viewGroup = this.j;
            ViewGroup viewGroup2 = this.k;
            Z0 z0 = AbstractC5144a1.p;
            sg.bigo.ads.C.f.a(viewGroup, viewGroup2, 4, z0, 0);
            sg.bigo.ads.C.f.a(this.j, this.q, 4, z0, 0);
        }
        if (!k()) {
            C5485f c5485f = this.p;
            z3 = true;
            if (c5485f != null) {
                Integer a2 = sg.bigo.ads.K0.z.a(c5485f.f13330a.a("endpage.multi_click_type"));
                i2 = a2 != null ? a2.intValue() : 0;
            } else {
                i2 = 1;
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    if (i != 1) {
                    }
                    i = 3;
                    it = items.iterator();
                    while (it.hasNext()) {
                        Object tag = it.next().getTag(-188383023);
                        if (tag instanceof sg.bigo.ads.v.u) {
                            sg.bigo.ads.v.u uVar = (sg.bigo.ads.v.u) tag;
                            sg.bigo.ads.C.f.a(uVar.e, 5);
                            if (!z) {
                                sg.bigo.ads.C.f.a(this.j, uVar.e, 4, AbstractC5144a1.p, 0);
                            } else if (z3) {
                                sg.bigo.ads.C.f.a(this.j, uVar.e, 4, this.d, new C5327f(this));
                            } else {
                                sg.bigo.ads.C.f.a(this.j, uVar.e, 4, this.d, i);
                            }
                        }
                    }
                }
            }
            z3 = false;
            i = 3;
            it = items.iterator();
            while (it.hasNext()) {
            }
        }
        z3 = false;
        it = items.iterator();
        while (it.hasNext()) {
        }
    }
}
