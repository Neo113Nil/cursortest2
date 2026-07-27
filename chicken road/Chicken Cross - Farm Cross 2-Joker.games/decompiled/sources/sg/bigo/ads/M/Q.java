package sg.bigo.ads.M;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.webkit.URLUtil;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.Q1;
import sg.bigo.ads.h.Z0;
import sg.bigo.ads.u.AbstractC5486g;
import sg.bigo.ads.u.AbstractC5487h;
import sg.bigo.ads.u.AbstractC5488i;
import sg.bigo.ads.u.AbstractC5490k;
import sg.bigo.ads.u.C5481b;
import sg.bigo.ads.u.C5485f;
import sg.bigo.ads.u.C5491l;

/* loaded from: classes3.dex */
public final class Q extends sg.bigo.ads.h.W {
    public static final HashSet r = new HashSet();
    public ViewFlow d;
    public Indicator e;
    public RoundedFrameLayout f;
    public C5481b g;
    public sg.bigo.ads.v.f h;
    public final C5485f i;
    public final Q1 j;
    public final sg.bigo.ads.C.l l;
    public final ViewGroup m;
    public sg.bigo.ads.v.k o;
    public sg.bigo.ads.v.k p;
    public final G k = new G(this);
    public H q = new H(this);
    public final sg.bigo.ads.h.T n = new sg.bigo.ads.h.T();

    public Q(sg.bigo.ads.C.l lVar, ViewGroup viewGroup, Q1 q1, C5485f c5485f) {
        this.l = lVar;
        this.m = viewGroup;
        this.i = c5485f;
        this.j = q1;
    }

    public static void a(Q q, long j, long j2, long j3) {
        if (j > 0) {
            ViewFlow viewFlow = q.d;
            if (!viewFlow.r && !viewFlow.b()) {
                q.d.setScrollEnabled(false);
                int a2 = AbstractC4963u.a(q.m.getContext(), 40);
                int scrollX = q.d.getScrollX();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, a2, 0);
                ofInt.setDuration(2 * j3);
                ofInt.setStartDelay(j2);
                ofInt.setInterpolator(new LinearInterpolator());
                ofInt.addListener(new K(q, j, j3));
                ofInt.addUpdateListener(new L(q, scrollX));
                ofInt.start();
                return;
            }
        }
        q.d.setScrollEnabled(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0365  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        int a2;
        int a3;
        boolean z;
        boolean z2;
        sg.bigo.ads.v.f fVar;
        Iterator<View> it;
        C5485f c5485f;
        View view;
        int i;
        int i2;
        int i3;
        Context context = this.m.getContext();
        ArrayList a4 = this.i.a();
        C5485f c5485f2 = this.i;
        boolean z3 = c5485f2.d;
        int i4 = c5485f2.b;
        int i5 = c5485f2.c;
        sg.bigo.ads.U.r a5 = AbstractC5164f1.a(this.l);
        this.d = (ViewFlow) this.m.findViewById(R.id.inter_media_ad_view_flow);
        this.e = (Indicator) this.m.findViewById(R.id.vf_indicator);
        sg.bigo.ads.T0.q qVar = this.i.f13330a;
        if (qVar == null) {
            a2 = 1;
        } else {
            Integer a6 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.background_colour"));
            a2 = AbstractC5490k.a(a6 != null ? a6.intValue() : 0);
        }
        if (a2 == 4 || a2 == 5) {
            this.g = new C5481b(this.m, this.d, this.n, a2);
        }
        sg.bigo.ads.T0.q qVar2 = this.i.f13330a;
        if (qVar2 == null) {
            a3 = 1;
        } else {
            Integer a7 = sg.bigo.ads.K0.z.a(qVar2.a("video_play_page.mediaview_colour"));
            a3 = AbstractC5490k.a(a7 != null ? a7.intValue() : 0);
        }
        sg.bigo.ads.v.f fVar2 = new sg.bigo.ads.v.f(context, i5, false, a3, a2);
        this.h = fVar2;
        this.f = fVar2.e;
        ((MediaView) fVar2.g).setImageBlurBorder(false);
        this.h.a(a5.f12567a, a5.b);
        sg.bigo.ads.v.f fVar3 = this.h;
        fVar3.r = true;
        int i6 = fVar3.d;
        int i7 = 4;
        if (i6 == 5 || i6 == 4 || (i3 = fVar3.c) == 5 || i3 == 4) {
            if (((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.l.e())).p()) {
                HashSet hashSet = r;
                synchronized (hashSet) {
                    hashSet.add(this.h);
                }
            }
            if (this.g != null) {
                this.h.m = new I(this);
            }
        }
        this.d.setDividerWidth(AbstractC4963u.a(context, AbstractC5488i.c(i4)));
        this.d.setContentMaxWidthSpace(AbstractC4963u.a(context, AbstractC5488i.b(i4)));
        this.d.setViewStyle(AbstractC5488i.f(i4));
        this.d.setOnItemChangeListener(new C5491l(i4, this.e, this.g));
        int i8 = 0;
        int i9 = 0;
        while (i9 < a4.size()) {
            String str = (String) a4.get(i9);
            if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
                i = i9;
                i2 = i7;
            } else {
                i = i9;
                i2 = i7;
                a(context, i5, a2, str, ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.l.e())).T);
                i8++;
            }
            i9 = i + 1;
            i7 = i2;
        }
        int i10 = i7;
        if (z3) {
            sg.bigo.ads.L.r.a(this.l, new J(a(context, i5, a2, null, false)));
            i8++;
        }
        int i11 = 3;
        int i12 = i4 == 3 ? i8 >> 1 : 0;
        sg.bigo.ads.L0.z zVar = new sg.bigo.ads.L0.z();
        zVar.f12421a = a5.f12567a;
        zVar.b = a5.b;
        zVar.c = true;
        zVar.d = AbstractC5486g.a(i5);
        this.d.addView(this.f, Math.max(0, i12), zVar);
        int a8 = AbstractC5487h.a(i4);
        if (a8 == 1 || a8 == 2 || a8 == 3 || a8 == i10) {
            O o = new O(this);
            sg.bigo.ads.v.k kVar = new sg.bigo.ads.v.k(context, true);
            this.o = kVar;
            this.d.setStartView(kVar.f13348a);
            this.d.setOnStartViewShowListener(o);
            sg.bigo.ads.v.k kVar2 = new sg.bigo.ads.v.k(context, false);
            this.p = kVar2;
            this.d.setEndView(kVar2.f13348a);
            this.d.setOnEndViewShowListener(o);
        }
        int a9 = i4 == 3 ? this.d.a(this.f) : 0;
        ViewFlow viewFlow = this.d;
        viewFlow.e = a9;
        if (viewFlow.K) {
            viewFlow.requestLayout();
        } else {
            viewFlow.a(a9, -20, true);
        }
        C5481b c5481b = this.g;
        if (c5481b != null) {
            c5481b.a(a9);
        }
        MediaView mediaView = (MediaView) this.h.g;
        sg.bigo.ads.C.l lVar = this.l;
        lVar.f0 = this.j.i;
        lVar.a(this.m, mediaView, (ImageView) null, (AdOptionsView) null, (ArrayList) null, 8, null);
        int i13 = this.j.i;
        View findViewById = this.m.findViewById(R.id.inter_media_container);
        sg.bigo.ads.C.f.a(findViewById, 9);
        sg.bigo.ads.C.f.a(this.d, 9);
        if (this.j.g) {
            sg.bigo.ads.v.f fVar4 = this.h;
            if (fVar4 != null) {
                ((MediaView) fVar4.g).setOtherClickAreaClick(true);
            }
            sg.bigo.ads.C.f.a(this.m, findViewById, 8, this.l, i13);
            sg.bigo.ads.C.f.a(this.m, this.d, 8, this.l, i13);
        } else {
            sg.bigo.ads.v.f fVar5 = this.h;
            if (fVar5 != null) {
                ((MediaView) fVar5.g).setOtherClickAreaClick(false);
            }
            ViewGroup viewGroup = this.m;
            Z0 z0 = AbstractC5144a1.p;
            sg.bigo.ads.C.f.a(viewGroup, findViewById, 8, z0, 0);
            sg.bigo.ads.C.f.a(this.m, this.d, 8, z0, 0);
        }
        C5485f c5485f3 = this.i;
        if (c5485f3.b != 1) {
            Integer a10 = sg.bigo.ads.K0.z.a(c5485f3.f13330a.a("video_play_page.multi_click_type"));
            int intValue = a10 != null ? a10.intValue() : 0;
            if (intValue != 2) {
                if (intValue == 3) {
                    if (i13 == 1 || i13 == 2) {
                        z = true;
                        z2 = this.j.f;
                        fVar = this.h;
                        if (fVar != null && (view = fVar.g) != null) {
                            if (z) {
                                sg.bigo.ads.C.f.a(this.m, view, 8, this.l, i11);
                            } else {
                                sg.bigo.ads.C.f.a(this.m, view, 8, this.l, this.k);
                            }
                            if (z2) {
                                ((MediaView) this.h.g).setMediaAreaClickable(false);
                                ((sg.bigo.ads.d1.s) ((sg.bigo.ads.N.g) ((MediaView) this.h.g).getViewImpl())).a(true);
                            } else {
                                ((MediaView) this.h.g).setMediaAreaClickable(true);
                                ((sg.bigo.ads.d1.s) ((sg.bigo.ads.N.g) ((MediaView) this.h.g).getViewImpl())).a(false);
                            }
                        }
                        it = this.d.getItems().iterator();
                        while (it.hasNext()) {
                            Object tag = it.next().getTag(-188383023);
                            if (tag instanceof sg.bigo.ads.v.u) {
                                sg.bigo.ads.v.u uVar = (sg.bigo.ads.v.u) tag;
                                sg.bigo.ads.C.f.a(uVar.e, 5);
                                if (!z2) {
                                    sg.bigo.ads.C.f.a(this.m, uVar.e, 8, AbstractC5144a1.p, 0);
                                } else if (z) {
                                    sg.bigo.ads.C.f.a(this.m, uVar.e, 8, this.l, this.k);
                                } else {
                                    sg.bigo.ads.C.f.a(this.m, uVar.e, 8, this.l, i11);
                                }
                            }
                        }
                        c5485f = this.i;
                        if (c5485f.b == 1) {
                            return;
                        }
                        Integer a11 = sg.bigo.ads.K0.z.a(c5485f.f13330a.a("video_play_page.multi_guide"));
                        int intValue2 = a11 != null ? a11.intValue() : 0;
                        switch (intValue2) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                a(intValue2, new N(this));
                                return;
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                this.d.setFlipInterval((intValue2 - 5) * 1000);
                                this.d.a();
                                return;
                            default:
                                return;
                        }
                    }
                }
            }
            z = false;
            z2 = this.j.f;
            fVar = this.h;
            if (fVar != null) {
                if (z) {
                }
                if (z2) {
                }
            }
            it = this.d.getItems().iterator();
            while (it.hasNext()) {
            }
            c5485f = this.i;
            if (c5485f.b == 1) {
            }
        }
        i11 = i13;
        z = false;
        z2 = this.j.f;
        fVar = this.h;
        if (fVar != null) {
        }
        it = this.d.getItems().iterator();
        while (it.hasNext()) {
        }
        c5485f = this.i;
        if (c5485f.b == 1) {
        }
    }

    public final sg.bigo.ads.v.d a(Context context, int i, int i2, String str, boolean z) {
        int a2;
        C5485f c5485f = this.i;
        sg.bigo.ads.T0.q qVar = c5485f.f13330a;
        if (qVar == null) {
            a2 = 1;
        } else {
            Integer a3 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.mediaview_colour"));
            a2 = AbstractC5490k.a(a3 != null ? a3.intValue() : 0);
        }
        sg.bigo.ads.v.d dVar = new sg.bigo.ads.v.d(context, c5485f, i, a2, i2, str, z, null);
        dVar.r = true;
        sg.bigo.ads.L0.z zVar = new sg.bigo.ads.L0.z();
        zVar.f12421a = -1;
        zVar.b = -1;
        zVar.c = false;
        zVar.d = AbstractC5486g.a(i);
        this.d.addView(dVar.e, zVar);
        if (this.g != null) {
            dVar.m = new P(this, dVar);
        }
        return dVar;
    }
}
