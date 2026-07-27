package sg.bigo.ads.n;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.E1;
import sg.bigo.ads.h.Q1;
import sg.bigo.ads.m.C5329h;
import sg.bigo.ads.u.AbstractC5486g;
import sg.bigo.ads.u.AbstractC5487h;
import sg.bigo.ads.u.AbstractC5488i;
import sg.bigo.ads.u.C5481b;
import sg.bigo.ads.u.C5485f;
import sg.bigo.ads.u.C5491l;

/* loaded from: classes3.dex */
public abstract class U0 extends AbstractC5391n {
    public ViewFlow C;
    public Indicator D;
    public RoundedFrameLayout E;
    public LinearLayout F;
    public sg.bigo.ads.v.k G;
    public sg.bigo.ads.v.k H;
    public C5481b I;
    public sg.bigo.ads.v.f J;
    public C5485f K;
    public final HashSet L;
    public final Z M;
    public final AtomicBoolean N;
    public final ArrayList O;

    public U0(sg.bigo.ads.C.l lVar) {
        super(lVar);
        this.L = new HashSet();
        this.M = new Z(this);
        this.N = new AtomicBoolean(false);
        this.O = new ArrayList();
    }

    public static void a(U0 u0, long j, long j2, long j3) {
        if (j > 0) {
            ViewFlow viewFlow = u0.C;
            if (!viewFlow.r && !viewFlow.b()) {
                u0.C.setScrollEnabled(false);
                int a2 = AbstractC4963u.a(u0.u.getContext(), 40);
                int scrollX = u0.C.getScrollX();
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(0, a2, 0);
                ofInt.setDuration(2 * j3);
                ofInt.setStartDelay(j2);
                ofInt.setInterpolator(new LinearInterpolator());
                C5376f0 c5376f0 = new C5376f0(u0, j, j3);
                ofInt.addListener(c5376f0);
                ofInt.addUpdateListener(new C5380h0(u0, atomicBoolean, c5376f0, j, j3, scrollX));
                ofInt.start();
                return;
            }
        }
        u0.C.setScrollEnabled(true);
    }

    public void A() {
        Integer a2;
        if (C()) {
        }
        C5485f c5485f = this.K;
        int intValue = (c5485f == null || (a2 = sg.bigo.ads.K0.z.a(c5485f.f13330a.a("video_play_page.multi_guide"))) == null) ? 0 : a2.intValue();
        switch (intValue) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                a(intValue, new U(this));
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.C.setFlipInterval((intValue - 5) * 1000);
                this.C.a();
                break;
        }
    }

    public boolean B() {
        return false;
    }

    public boolean C() {
        return y() == 1;
    }

    public abstract void a(AbstractC5144a1 abstractC5144a1);

    public abstract void b(int i);

    @Override // sg.bigo.ads.n.AbstractC5391n, sg.bigo.ads.h.F1
    public final void e() {
        sg.bigo.ads.v.f fVar = this.J;
        if (fVar != null) {
            ((MediaView) fVar.g).destroy();
        }
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final MediaView k() {
        sg.bigo.ads.v.f fVar = this.J;
        if (fVar != null) {
            return (MediaView) fVar.g;
        }
        return null;
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final ViewGroup m() {
        sg.bigo.ads.v.f fVar = this.J;
        if (fVar != null) {
            return fVar.f;
        }
        return null;
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final Button n() {
        sg.bigo.ads.v.f fVar = this.J;
        if (fVar != null) {
            return fVar.s;
        }
        return null;
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public void q() {
        int i;
        Context context = this.u.getContext();
        C5485f c5485f = this.K;
        ArrayList a2 = c5485f != null ? c5485f.a() : null;
        C5485f c5485f2 = this.K;
        boolean z = c5485f2 != null && c5485f2.d;
        int y = y();
        int x = x();
        sg.bigo.ads.U.r a3 = AbstractC5164f1.a(this.d);
        this.C = (ViewFlow) this.u.findViewById(R.id.inter_media_ad_view_flow);
        this.D = (Indicator) this.u.findViewById(R.id.inter_vf_indicator);
        int h = h();
        if (h == 3 || h == 4) {
            this.I = new C5481b(this.u, this.C, this.s, h);
        }
        sg.bigo.ads.v.f fVar = new sg.bigo.ads.v.f(context, x, B(), l(), h);
        this.J = fVar;
        this.E = fVar.e;
        ((MediaView) fVar.g).setImageBlurBorder(false);
        this.J.a(a3.f12567a, a3.b);
        sg.bigo.ads.v.f fVar2 = this.J;
        int i2 = fVar2.d;
        if (i2 == 4 || i2 == 3 || (i = fVar2.c) == 4 || i == 3) {
            boolean p = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.d.e())).p();
            if (p) {
                synchronized (this.L) {
                    this.L.add(this.J);
                }
            }
            if (this.I != null) {
                this.J.m = new C5368b0(this);
            }
            a(new C5370c0(this, p));
        }
        this.F = (LinearLayout) this.u.findViewById(R.id.inter_media_bottom_layout);
        if (sg.bigo.ads.K0.I.a((CharSequence) this.d.getWarning())) {
            ((ViewGroup.MarginLayoutParams) this.F.getLayoutParams()).topMargin = AbstractC4963u.a(context, 8);
        }
        a(this.t);
        a(context, a3, a2, z, y, x, h);
        b(g());
        A();
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final void r() {
        super.r();
        synchronized (this.L) {
            if (this.L.isEmpty()) {
                return;
            }
            HashSet hashSet = new HashSet(this.L);
            this.L.clear();
            a(new C5374e0(this, hashSet));
        }
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final void s() {
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final void t() {
    }

    public final void w() {
        View a2;
        ViewFlow viewFlow = this.C;
        if (viewFlow == null) {
            return;
        }
        List<View> items = viewFlow.getItems();
        if (sg.bigo.ads.K0.A.a(items) || items.size() != 1 || (a2 = this.C.a(0)) == null) {
            return;
        }
        Object tag = a2.getTag(-188383023);
        if (tag instanceof sg.bigo.ads.v.u) {
            sg.bigo.ads.v.u uVar = (sg.bigo.ads.v.u) tag;
            uVar.d(3);
            uVar.c = 4;
            this.C.setViewStyle(3);
            ((sg.bigo.ads.L0.z) a2.getLayoutParams()).d = 3;
        }
    }

    public int x() {
        C5485f c5485f = this.K;
        if (c5485f != null) {
            return c5485f.c;
        }
        return 1;
    }

    public int y() {
        C5485f c5485f = this.K;
        if (c5485f != null) {
            return c5485f.b;
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z() {
        View view;
        int i;
        boolean z;
        Iterator<View> it;
        int i2;
        View view2;
        Q1 q1 = this.w;
        int i3 = q1 != null ? q1.i : 0;
        View findViewById = this.u.findViewById(R.id.inter_media_container);
        sg.bigo.ads.C.f.a(findViewById, 9);
        sg.bigo.ads.C.f.a(this.C, 9);
        Q1 q12 = this.w;
        if (q12 == null || !q12.g) {
            sg.bigo.ads.v.f fVar = this.J;
            if (fVar != null && (view = fVar.g) != null) {
                ((MediaView) view).setOtherClickAreaClick(false);
            }
            ViewGroup viewGroup = this.u;
            sg.bigo.ads.h.Z0 z0 = AbstractC5144a1.p;
            sg.bigo.ads.C.f.a(viewGroup, findViewById, 8, z0, 0);
            sg.bigo.ads.C.f.a(this.u, this.C, 8, z0, 0);
        } else {
            sg.bigo.ads.v.f fVar2 = this.J;
            if (fVar2 != null && (view2 = fVar2.g) != null) {
                ((MediaView) view2).setOtherClickAreaClick(true);
            }
            sg.bigo.ads.C.f.a(this.u, findViewById, 8, this.d, i3);
            sg.bigo.ads.C.f.a(this.u, this.C, 8, this.d, i3);
        }
        if (!C()) {
            C5485f c5485f = this.K;
            if (c5485f != null) {
                Integer a2 = sg.bigo.ads.K0.z.a(c5485f.f13330a.a("video_play_page.multi_click_type"));
                i2 = a2 != null ? a2.intValue() : 0;
            } else {
                i2 = 1;
            }
            i = 3;
            if (i2 != 2) {
                if (i2 == 3) {
                    if (i3 == 1 || i3 == 2) {
                        z = true;
                        Q1 q13 = this.w;
                        boolean z2 = q13 == null && q13.f;
                        a(i3, z2, i, z);
                        it = this.C.getItems().iterator();
                        while (it.hasNext()) {
                            Object tag = it.next().getTag(-188383023);
                            if (tag instanceof sg.bigo.ads.v.u) {
                                sg.bigo.ads.v.u uVar = (sg.bigo.ads.v.u) tag;
                                sg.bigo.ads.C.f.a(uVar.e, 5);
                                if (!z2) {
                                    sg.bigo.ads.C.f.a(this.u, uVar.e, 8, AbstractC5144a1.p, 0);
                                } else if (z) {
                                    sg.bigo.ads.C.f.a(this.u, uVar.e, 8, this.d, this.M);
                                } else {
                                    sg.bigo.ads.C.f.a(this.u, uVar.e, 8, this.d, i);
                                }
                            }
                        }
                    }
                }
            }
            z = false;
            Q1 q132 = this.w;
            if (q132 == null) {
            }
            a(i3, z2, i, z);
            it = this.C.getItems().iterator();
            while (it.hasNext()) {
            }
        }
        i = i3;
        z = false;
        Q1 q1322 = this.w;
        if (q1322 == null) {
        }
        a(i3, z2, i, z);
        it = this.C.getItems().iterator();
        while (it.hasNext()) {
        }
    }

    public final sg.bigo.ads.v.d a(Context context, int i, int i2, String str, boolean z) {
        sg.bigo.ads.v.d dVar = new sg.bigo.ads.v.d(context, this.K, i, j(), i2, str, z, new X(this));
        sg.bigo.ads.L0.z zVar = new sg.bigo.ads.L0.z();
        zVar.f12421a = -1;
        zVar.b = -1;
        zVar.c = false;
        zVar.d = AbstractC5486g.a(i);
        this.C.addView(dVar.e, zVar);
        if (this.I != null) {
            dVar.m = new Y(this, dVar);
        }
        return dVar;
    }

    @Override // sg.bigo.ads.h.F1
    public final void a(ViewGroup viewGroup, View view, E1 e1, int i, int i2, int i3, View... viewArr) {
        super.a(viewGroup, view, new C5366a0(this, (C5329h) e1), i, i2, i3, viewArr);
        z();
    }

    public final void a(Context context, sg.bigo.ads.U.r rVar, ArrayList arrayList, boolean z, int i, int i2, int i3) {
        if (this.K == null) {
            return;
        }
        this.C.setDividerWidth(AbstractC4963u.a(context, AbstractC5488i.c(i)));
        this.C.setContentMaxWidthSpace(AbstractC4963u.a(context, AbstractC5488i.b(i)));
        this.C.setViewStyle(AbstractC5488i.f(i));
        this.C.setOnItemChangeListener(new C5491l(i, this.D, this.I));
        int i4 = 0;
        for (int i5 = 0; arrayList != null && i5 < arrayList.size(); i5++) {
            String str = (String) arrayList.get(i5);
            if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
                a(context, i2, i3, str, ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.d.e())).T);
                i4++;
            }
        }
        int max = Math.max(i == 3 ? 2 - i4 : 0, 0);
        if (z) {
            max = Math.max(max, 1);
        }
        int i6 = max;
        int i7 = 0;
        while (i7 < i6) {
            int i8 = i4 + 1;
            sg.bigo.ads.v.d a2 = a(context, i2, i3, (String) null, false);
            boolean p = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.d.e())).p();
            if (p) {
                synchronized (this.L) {
                    this.L.add(a2);
                }
            }
            a(new C5372d0(this, p, a2));
            i7++;
            i4 = i8;
        }
        int i9 = i == 3 ? i4 >> 1 : 0;
        sg.bigo.ads.L0.z zVar = new sg.bigo.ads.L0.z();
        zVar.f12421a = rVar.f12567a;
        zVar.b = rVar.b;
        zVar.c = true;
        zVar.d = AbstractC5486g.a(i2);
        this.C.addView(this.E, Math.max(0, i9), zVar);
        int a3 = AbstractC5487h.a(i);
        if (a3 == 1 || a3 == 2 || a3 == 3 || a3 == 4) {
            V v = new V(this);
            sg.bigo.ads.v.k kVar = new sg.bigo.ads.v.k(context, true);
            this.G = kVar;
            this.C.setStartView(kVar.f13348a);
            this.C.setOnStartViewShowListener(v);
            sg.bigo.ads.v.k kVar2 = new sg.bigo.ads.v.k(context, false);
            this.H = kVar2;
            this.C.setEndView(kVar2.f13348a);
            this.C.setOnEndViewShowListener(v);
        }
        int a4 = i == 3 ? this.C.a(this.E) : 0;
        ViewFlow viewFlow = this.C;
        viewFlow.e = a4;
        if (viewFlow.K) {
            viewFlow.requestLayout();
        } else {
            viewFlow.a(a4, -20, true);
        }
        C5481b c5481b = this.I;
        if (c5481b != null) {
            c5481b.a(a4);
        }
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public void a(double d) {
        boolean z;
        sg.bigo.ads.v.k kVar;
        if (d <= 3.0d) {
            sg.bigo.ads.v.k kVar2 = this.G;
            z = false;
            if (kVar2 != null) {
                kVar2.a(false);
            }
            kVar = this.H;
            if (kVar == null) {
                return;
            }
        } else {
            sg.bigo.ads.v.k kVar3 = this.G;
            z = true;
            if (kVar3 != null) {
                kVar3.a(true);
            }
            kVar = this.H;
            if (kVar == null) {
                return;
            }
        }
        kVar.a(z);
    }

    public void a(int i, boolean z, int i2, boolean z2) {
        View view;
        sg.bigo.ads.v.f fVar = this.J;
        if (fVar == null || (view = fVar.g) == null) {
            return;
        }
        if (z2) {
            sg.bigo.ads.C.f.a(this.u, view, 8, this.d, this.M);
        } else {
            sg.bigo.ads.C.f.a(this.u, view, 8, this.d, i2);
        }
        if (z) {
            ((MediaView) this.J.g).setMediaAreaClickable(true);
            ((sg.bigo.ads.d1.s) ((sg.bigo.ads.N.g) ((MediaView) this.J.g).getViewImpl())).a(false);
        } else {
            ((MediaView) this.J.g).setMediaAreaClickable(false);
            ((sg.bigo.ads.d1.s) ((sg.bigo.ads.N.g) ((MediaView) this.J.g).getViewImpl())).a(true);
        }
    }
}
