package sg.bigo.ads.h;

import android.app.Activity;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.i.C5231c;
import sg.bigo.ads.i.C5241m;
import sg.bigo.ads.j.C5252f;
import sg.bigo.ads.u.C5485f;

/* renamed from: sg.bigo.ads.h.l1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5185l1 extends AbstractC5163f0 {
    public final sg.bigo.ads.C.l W;
    public C5241m X;
    public C5231c Y;
    public C5182k1 Z;
    public C5167g0 a0;
    public final C5179j1 b0;
    public final HashMap c0;
    public final HashMap d0;
    public boolean e0;

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5185l1(sg.bigo.ads.P.j jVar) {
        super(jVar);
        sg.bigo.ads.C.l lVar;
        sg.bigo.ads.T0.q qVar;
        C5179j1 c5179j1 = new C5179j1(this);
        this.b0 = c5179j1;
        this.c0 = new HashMap();
        this.d0 = new HashMap();
        this.e0 = false;
        sg.bigo.ads.P.c cVar = jVar.f12482a;
        if (cVar != null && (qVar = ((sg.bigo.ads.U0.b) cVar).I) != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.ad_component_layout"));
            int intValue = a2 != null ? a2.intValue() : 0;
            if ((33 == intValue && !((sg.bigo.ads.U0.b) jVar.f12482a).b()) || (6 == intValue && ((sg.bigo.ads.U0.b) jVar.f12482a).b())) {
                int i = ((sg.bigo.ads.U0.b) jVar.f12482a).k;
                if (i == 1) {
                    lVar = new sg.bigo.ads.D.l(jVar);
                } else if (i == 2) {
                    lVar = new sg.bigo.ads.D.m(jVar);
                }
                lVar = lVar == null ? sg.bigo.ads.C.f.a(jVar) : lVar;
                if (lVar != null) {
                    throw new IllegalArgumentException("Illegal adx type.");
                }
                this.W = lVar;
                lVar.C();
                if (lVar instanceof sg.bigo.ads.E.d) {
                    C5182k1 c5182k1 = new C5182k1(this);
                    this.Z = c5182k1;
                    ((sg.bigo.ads.E.d) lVar).r0 = c5182k1;
                }
                if (lVar instanceof sg.bigo.ads.C.t) {
                    ((sg.bigo.ads.C.t) lVar).q0 = new C5168g1(this);
                }
                lVar.setAdInteractionListener(c5179j1);
                a((sg.bigo.ads.Q.b) lVar);
                return;
            }
        }
        lVar = null;
        if (lVar == null) {
        }
        if (lVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (((r15 != null ? r15.intValue() : 0) == 5) != false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair a(C5185l1 c5185l1, boolean z, NativeAd nativeAd, sg.bigo.ads.T0.p pVar, sg.bigo.ads.P.c cVar, boolean z2) {
        c5185l1.getClass();
        if (z) {
            c5185l1 = nativeAd;
        }
        boolean z3 = nativeAd instanceof sg.bigo.ads.C.t;
        C5241m c5241m = new C5241m(c5185l1, pVar, cVar, z3 ? ((sg.bigo.ads.C.t) nativeAd).k0 : null, z3 ? ((sg.bigo.ads.C.t) nativeAd).l0 : null);
        if (c5241m.f12988a) {
            c5241m.o = 2;
        }
        C5231c c5231c = new C5231c(c5241m.f12988a, c5185l1, pVar, cVar, z3 ? ((sg.bigo.ads.C.t) nativeAd).k0 : null, z3 ? ((sg.bigo.ads.C.t) nativeAd).l0 : null);
        int i = 0;
        int i2 = c5241m.f12988a ? 1 : c5231c.f12978a ? 2 : 0;
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
        sg.bigo.ads.T0.q qVar = bVar.I;
        if (qVar != null && z2) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.ad_component_layout"));
        }
        i = i2;
        bVar.E = i;
        bVar.F = (c5241m.f12988a || (c5231c.b instanceof C5252f)) ? 1 : 2;
        return new Pair(c5241m, c5231c);
    }

    @Override // sg.bigo.ads.h.AbstractC5163f0
    public final boolean A() {
        return ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.W.e())).p();
    }

    @Override // sg.bigo.ads.h.AbstractC5163f0
    public Class B() {
        if (F()) {
            return sg.bigo.ads.z.g.class;
        }
        sg.bigo.ads.C.l lVar = this.W;
        boolean z = lVar instanceof sg.bigo.ads.E.d;
        return z ? (z && ((sg.bigo.ads.E.d) lVar).y0 == 3) ? sg.bigo.ads.w.i.class : sg.bigo.ads.x.k.class : A() ? ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.W.e())).o() ? sg.bigo.ads.B.b.class : H2.class : C5149b2.class;
    }

    public final C5485f C() {
        sg.bigo.ads.C.l lVar = this.W;
        if (lVar instanceof sg.bigo.ads.E.d) {
            return null;
        }
        C5485f c5485f = (C5485f) this.d0.get(lVar);
        if (c5485f == null) {
            sg.bigo.ads.P.c cVar = (InterfaceC5087a) this.W.e();
            if (cVar != null) {
                c5485f = C5485f.b(this.W, ((sg.bigo.ads.U0.b) cVar).I);
            }
            if (c5485f != null) {
                this.d0.put(this.W, c5485f);
            }
        }
        return c5485f;
    }

    public final sg.bigo.ads.C.l D() {
        sg.bigo.ads.C.l lVar;
        sg.bigo.ads.C.l lVar2 = this.W;
        return (!(lVar2 instanceof sg.bigo.ads.E.d) || (lVar = ((sg.bigo.ads.E.d) lVar2).k0) == null) ? lVar2 : lVar;
    }

    public final C5485f E() {
        sg.bigo.ads.C.l lVar = this.W;
        if (lVar instanceof sg.bigo.ads.E.d) {
            return null;
        }
        C5485f c5485f = (C5485f) this.c0.get(lVar);
        if (c5485f == null) {
            sg.bigo.ads.P.c cVar = (InterfaceC5087a) this.W.e();
            if (cVar != null) {
                c5485f = C5485f.a(this.W, ((sg.bigo.ads.U0.b) cVar).I);
            }
            if (c5485f != null) {
                this.c0.put(this.W, c5485f);
            }
        }
        return c5485f;
    }

    public boolean F() {
        sg.bigo.ads.C.l lVar = this.W;
        return (lVar instanceof sg.bigo.ads.D.l) || (lVar instanceof sg.bigo.ads.D.m);
    }

    @Override // sg.bigo.ads.Q.b
    public final void b(int i) {
        this.b = i;
        sg.bigo.ads.C.l lVar = this.W;
        if (lVar != null) {
            lVar.b(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r8 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        r8 = r8.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003a, code lost:
    
        if (r8 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0049, code lost:
    
        if (r8 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0056, code lost:
    
        if (r8 != null) goto L24;
     */
    @Override // sg.bigo.ads.h.AbstractC5163f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i) {
        sg.bigo.ads.T0.q qVar;
        Integer a2;
        int intValue;
        boolean z;
        boolean z2 = true;
        if (this.e0 || (qVar = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.W.e())).I) == null) {
            return true;
        }
        int i2 = 9;
        boolean z3 = false;
        if (i == 2) {
            a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.x_area_behavior"));
        } else if (i == 6) {
            a2 = sg.bigo.ads.K0.z.a(qVar.a("play_page.x_area_behavior"));
            i2 = 16;
        } else if (i != 9) {
            a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.x_area_behavior"));
            i2 = 1;
        } else {
            a2 = sg.bigo.ads.K0.z.a(qVar.a("layer.x_area_behavior"));
            i2 = 10;
        }
        if (intValue <= 0) {
            return true;
        }
        this.e0 = true;
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue == 3) {
                    boolean z4 = D().r;
                    z = !z4;
                    z3 = z4;
                } else if (intValue != 4) {
                    z3 = true;
                    z2 = false;
                } else {
                    z = !D().r;
                    this.T = true;
                }
                z2 = z;
            } else {
                this.T = true;
            }
        }
        if (z2) {
            D().a((sg.bigo.ads.U.j) null, i2, 36);
        }
        return z3;
    }

    @Override // sg.bigo.ads.h.AbstractC5163f0
    public final void d(int i) {
        super.d(i);
        C5167g0 c5167g0 = this.a0;
        if (c5167g0 != null) {
            c5167g0.h = true;
            SystemClock.elapsedRealtime();
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5163f0, sg.bigo.ads.e.h
    public void destroyInMainThread() {
        super.destroyInMainThread();
        this.W.destroy();
        C5182k1 c5182k1 = this.Z;
        if (c5182k1 != null) {
            c5182k1.a();
            this.Z = null;
        }
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.Q.b
    public final sg.bigo.ads.P.c e() {
        return (InterfaceC5087a) this.W.e();
    }

    @Override // sg.bigo.ads.api.Ad
    public final String getCreativeId() {
        sg.bigo.ads.C.l lVar = this.W;
        return lVar != null ? lVar.getCreativeId() : "";
    }

    @Override // sg.bigo.ads.Q.b
    public final sg.bigo.ads.P.s i() {
        sg.bigo.ads.C.l lVar = this.W;
        return lVar != null ? lVar.i : this.i;
    }

    @Override // sg.bigo.ads.e.h
    public final sg.bigo.ads.P.e p() {
        sg.bigo.ads.C.l lVar = this.W;
        return lVar != null ? lVar.I : this.I;
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.api.Ad
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        this.j = adInteractionListener;
        this.b0.f12896a = adInteractionListener;
    }

    @Override // sg.bigo.ads.e.h
    public final boolean t() {
        sg.bigo.ads.C.l lVar = this.W;
        return (lVar != null && lVar.t()) || this.s;
    }

    @Override // sg.bigo.ads.e.h
    public final void v() {
        this.W.v();
    }

    public final C5241m a(C5202r0 c5202r0) {
        sg.bigo.ads.C.l lVar = this.W;
        if (lVar instanceof sg.bigo.ads.C.t) {
            sg.bigo.ads.C.t tVar = (sg.bigo.ads.C.t) lVar;
            sg.bigo.ads.P.j jVar = this.k;
            this.X = new C5241m(this, jVar.b, ((sg.bigo.ads.U0.k) ((InterfaceC5087a) tVar.k.f12482a)).N0, jVar.f12482a, tVar.k0, tVar.l0, c5202r0);
        }
        return this.X;
    }

    public final Pair a(sg.bigo.ads.C.l lVar) {
        C5182k1 c5182k1 = this.Z;
        if (c5182k1 != null) {
            return c5182k1.a(lVar);
        }
        return null;
    }

    @Override // sg.bigo.ads.e.h
    public final Object a(Object obj, String str) {
        return this.W.a(obj, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if ((r1 != null ? r1.intValue() : 0) == 3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
    
        if ((r1 != null ? r1.intValue() : 0) == 3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010d, code lost:
    
        if ((r1 != null ? r1.intValue() : 0) == 3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0148, code lost:
    
        if ((r1 != null ? r1.intValue() : 0) == 1) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0150  */
    @Override // sg.bigo.ads.h.AbstractC5163f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(sg.bigo.ads.Z0.g gVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        sg.bigo.ads.C.l lVar = this.W;
        sg.bigo.ads.T0.q qVar = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar.e())).I;
        boolean z5 = true;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.cta_color"));
            if ((a2 != null ? a2.intValue() : 0) != 3) {
                Integer a3 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.background_colour"));
                if ((a3 != null ? a3.intValue() : 0) != 3) {
                    Integer a4 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.mediaview_colour"));
                    if ((a4 != null ? a4.intValue() : 0) != 3) {
                        Integer a5 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.ad_component_colour"));
                    }
                }
            }
            lVar.a(z5);
            this.W.a(new C5172h1(this, gVar), 0);
        }
        sg.bigo.ads.T0.q qVar2 = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.W.e())).I;
        if (qVar2 != null) {
            Integer a6 = sg.bigo.ads.K0.z.a(qVar2.a("mid_page.cta_color"));
            if ((a6 != null ? a6.intValue() : 0) == 3) {
                z = true;
                if (!z) {
                    sg.bigo.ads.T0.q qVar3 = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.W.e())).I;
                    if (qVar3 != null) {
                        Integer a7 = sg.bigo.ads.K0.z.a(qVar3.a("endpage.cta_color"));
                        if ((a7 != null ? a7.intValue() : 0) != 3) {
                            Integer a8 = sg.bigo.ads.K0.z.a(qVar3.a("endpage.background_colour"));
                            if ((a8 != null ? a8.intValue() : 0) != 3) {
                                Integer a9 = sg.bigo.ads.K0.z.a(qVar3.a("endpage.mediaview_colour"));
                            }
                        }
                        z2 = true;
                        if (!z2) {
                            sg.bigo.ads.T0.q qVar4 = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.W.e())).I;
                            if (qVar4 != null) {
                                Integer a10 = sg.bigo.ads.K0.z.a(qVar4.a("layer.cta_color"));
                                if ((a10 != null ? a10.intValue() : 0) != 3) {
                                    Integer a11 = sg.bigo.ads.K0.z.a(qVar4.a("layer.mediaview_colour"));
                                }
                                z3 = true;
                                if (!z3) {
                                    sg.bigo.ads.T0.q qVar5 = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.W.e())).I;
                                    if (qVar5 != null) {
                                        Integer a12 = sg.bigo.ads.K0.z.a(qVar5.a("video_play_page.is_widget"));
                                        if ((a12 != null ? a12.intValue() : 0) != 1) {
                                            Integer a13 = sg.bigo.ads.K0.z.a(qVar5.a("endpage.is_widget"));
                                        }
                                        z4 = true;
                                        if (!z4) {
                                            z5 = false;
                                        }
                                    }
                                    z4 = false;
                                    if (!z4) {
                                    }
                                }
                            }
                            z3 = false;
                            if (!z3) {
                            }
                        }
                    }
                    z2 = false;
                    if (!z2) {
                    }
                }
                lVar.a(z5);
                this.W.a(new C5172h1(this, gVar), 0);
            }
        }
        z = false;
        if (!z) {
        }
        lVar.a(z5);
        this.W.a(new C5172h1(this, gVar), 0);
    }

    @Override // sg.bigo.ads.h.AbstractC5163f0
    public final void a(Activity activity) {
        sg.bigo.ads.C.l lVar = this.W;
        if (lVar != null) {
            lVar.a(activity);
        }
    }

    @Override // sg.bigo.ads.Q.b
    public final void a(int i) {
        this.c = i;
        sg.bigo.ads.C.l lVar = this.W;
        if (lVar != null) {
            lVar.a(i);
        }
    }

    @Override // sg.bigo.ads.e.h
    public final void a(sg.bigo.ads.P.e eVar) {
        this.I = eVar;
        sg.bigo.ads.C.l lVar = this.W;
        if (lVar != null) {
            lVar.I = eVar;
        }
    }

    @Override // sg.bigo.ads.Q.b
    public final void a(boolean z, boolean z2) {
        super.a(z, z2);
        sg.bigo.ads.C.l lVar = this.W;
        if (lVar != null) {
            lVar.a(z, z2);
        }
    }
}
