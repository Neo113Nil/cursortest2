package sg.bigo.ads.C;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.iab.omid.library.bigosg.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.e.AbstractC5081e;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.C5168g1;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public class t extends l {
    public sg.bigo.ads.n1.o k0;
    public sg.bigo.ads.z1.p l0;
    public Pair m0;
    public final AtomicBoolean n0;
    public boolean o0;
    public final s p0;
    public C5168g1 q0;
    public B r0;
    public boolean s0;
    public final m t0;

    public t(sg.bigo.ads.P.j jVar) {
        super(jVar);
        this.n0 = new AtomicBoolean(false);
        this.p0 = new s(this);
        this.t0 = new m(this);
    }

    public static void a(t tVar, String str, Object obj, int[] iArr) {
        InterfaceC5087a interfaceC5087a;
        interfaceC5087a = (InterfaceC5087a) tVar.k.f12482a;
        str.hashCode();
        switch (str) {
            case "AdLoaded":
                if (tVar.r0 != null) {
                    if (sg.bigo.ads.O.g.f12472a.B.a(29)) {
                        sg.bigo.ads.n1.n nVar = sg.bigo.ads.n1.n.n;
                        InterfaceC5087a interfaceC5087a2 = (InterfaceC5087a) tVar.k.f12482a;
                        String d = ((sg.bigo.ads.U0.k) interfaceC5087a2).d();
                        nVar.getClass();
                        if (interfaceC5087a2 != null && !TextUtils.isEmpty(d)) {
                            nVar.l.put(interfaceC5087a2, d);
                        }
                    }
                    B b = tVar.r0;
                    sg.bigo.ads.Q.c cVar = b.e;
                    if (cVar != null) {
                        cVar.a(b.f12222a);
                        break;
                    }
                }
                break;
            case "AdVideoThirdQuartile":
                sg.bigo.ads.n1.o oVar = tVar.k0;
                if (oVar != null) {
                    Iterator it = oVar.k.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        if (75 >= intValue) {
                            if (intValue == 75) {
                                sg.bigo.ads.m1.c cVar2 = oVar.g;
                                if (cVar2 != null) {
                                    cVar2.b(3);
                                }
                                intValue = 5;
                            }
                            sg.bigo.ads.n1.o.a(interfaceC5087a, intValue);
                            it.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVideoMidpoint":
                sg.bigo.ads.n1.o oVar2 = tVar.k0;
                if (oVar2 != null) {
                    Iterator it2 = oVar2.k.iterator();
                    while (it2.hasNext()) {
                        int intValue2 = ((Integer) it2.next()).intValue();
                        if (50 >= intValue2) {
                            if (intValue2 == 50) {
                                sg.bigo.ads.m1.c cVar3 = oVar2.g;
                                if (cVar3 != null) {
                                    cVar3.b(2);
                                }
                                intValue2 = 4;
                            }
                            sg.bigo.ads.n1.o.a(interfaceC5087a, intValue2);
                            it2.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVideoFirstQuartile":
                sg.bigo.ads.n1.o oVar3 = tVar.k0;
                if (oVar3 != null) {
                    Iterator it3 = oVar3.k.iterator();
                    while (it3.hasNext()) {
                        int intValue3 = ((Integer) it3.next()).intValue();
                        if (25 >= intValue3) {
                            if (intValue3 == 25) {
                                sg.bigo.ads.m1.c cVar4 = oVar3.g;
                                if (cVar4 != null) {
                                    cVar4.b(1);
                                }
                                intValue3 = 3;
                            }
                            sg.bigo.ads.n1.o.a(interfaceC5087a, intValue3);
                            it3.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVPAIDClickThru":
                if (iArr != null && iArr.length > 0) {
                    tVar.a(obj instanceof sg.bigo.ads.U.j ? (sg.bigo.ads.U.j) obj : null, 12, 5);
                    break;
                }
                break;
            case "AdError":
                B b2 = tVar.r0;
                if (b2 != null) {
                    String str2 = obj instanceof String ? (String) obj : "VPAID error";
                    sg.bigo.ads.Q.c cVar5 = b2.e;
                    if (cVar5 != null) {
                        cVar5.a(b2.f12222a, 1006, 10222, str2);
                        break;
                    }
                }
                break;
            case "AdVPAIDImpression":
                B b3 = tVar.r0;
                if (b3 != null && ((sg.bigo.ads.U0.b) b3.c).v0 == 1) {
                    super.q();
                    break;
                }
                break;
            case "AdVideoStart":
                sg.bigo.ads.n1.o oVar4 = tVar.k0;
                if (oVar4 != null) {
                    Iterator it4 = oVar4.k.iterator();
                    while (it4.hasNext()) {
                        int intValue4 = ((Integer) it4.next()).intValue();
                        if (intValue4 <= 0) {
                            if (intValue4 == 0) {
                                sg.bigo.ads.m1.c cVar6 = oVar4.g;
                                if (cVar6 != null) {
                                    float f = oVar4.f13215a.s;
                                    float f2 = oVar4.h ? 0.0f : 1.0f;
                                    MediaEvents mediaEvents = cVar6.c;
                                    if (mediaEvents != null) {
                                        mediaEvents.start(f, f2);
                                        cVar6.d = true;
                                        cVar6.f13123a.getAdSessionId();
                                    }
                                }
                                intValue4 = 2;
                            }
                            sg.bigo.ads.n1.o.a(interfaceC5087a, intValue4);
                            it4.remove();
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // sg.bigo.ads.C.l
    public final boolean A() {
        return ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.k.f12482a)).p();
    }

    public final Pair D() {
        boolean z;
        InterfaceC5087a interfaceC5087a = (InterfaceC5087a) this.k.f12482a;
        Pair pair = this.m0;
        if (pair != null) {
            return pair;
        }
        sg.bigo.ads.z1.p pVar = this.l0;
        boolean z2 = false;
        if (pVar != null) {
            Iterator it = pVar.y.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                sg.bigo.ads.z1.b bVar = (sg.bigo.ads.z1.b) it.next();
                if (bVar != null) {
                    sg.bigo.ads.z1.a a2 = sg.bigo.ads.z1.b.a(bVar.b);
                    if (!z2 && a2 != null && a2.a()) {
                        ((sg.bigo.ads.U0.k) interfaceC5087a).M0 = a2;
                        z2 = true;
                    }
                    sg.bigo.ads.z1.a a3 = sg.bigo.ads.z1.b.a(bVar.f13438a);
                    if (!z3 && a3 != null && a3.a()) {
                        ((sg.bigo.ads.U0.k) interfaceC5087a).N0 = a3;
                        z3 = true;
                    }
                }
            }
            z = z2;
            z2 = z3;
        } else {
            z = false;
        }
        Pair pair2 = new Pair(Boolean.valueOf(z), Boolean.valueOf(z2));
        this.m0 = pair2;
        return pair2;
    }

    public sg.bigo.ads.z1.l E() {
        sg.bigo.ads.T0.e eVar;
        int i = this.k.b.g;
        sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
        return new sg.bigo.ads.z1.l(i, (gVar == null || (eVar = gVar.J) == null) ? 0 : eVar.f12551a);
    }

    @Override // sg.bigo.ads.C.l, sg.bigo.ads.e.h
    public final void b(Point point, int i, int i2, sg.bigo.ads.P.f fVar) {
        super.b(point, i, i2, fVar);
        sg.bigo.ads.n1.o oVar = this.k0;
        if (oVar != null) {
            sg.bigo.ads.P.c cVar = this.k.f12482a;
            if (oVar.e) {
                return;
            }
            Iterator it = oVar.f13215a.j.iterator();
            while (it.hasNext()) {
                oVar.a((sg.bigo.ads.z1.n) it.next(), "va_cli", cVar, i2, i);
                it.remove();
            }
        }
    }

    public boolean c(int i) {
        SparseArray sparseArray = sg.bigo.ads.P.a.f12475a;
        return (i != 4 && this.k.b.h) || (this instanceof sg.bigo.ads.D.g) || this.o0;
    }

    @Override // sg.bigo.ads.C.l, sg.bigo.ads.e.h
    public void destroyInMainThread() {
        VideoController videoController = getVideoController();
        if (videoController != null) {
            videoController.setVideoLifeCallback(null);
        }
        sg.bigo.ads.n1.n nVar = sg.bigo.ads.n1.n.n;
        nVar.l.remove((InterfaceC5087a) this.k.f12482a);
        super.destroyInMainThread();
        sg.bigo.ads.n1.o oVar = this.k0;
        if (oVar != null) {
            if (oVar.c && !oVar.b) {
                oVar.b = true;
            }
            sg.bigo.ads.z1.p pVar = oVar.f13215a;
            if (pVar != null) {
                Iterator it = pVar.m.iterator();
                while (it.hasNext()) {
                    oVar.a((sg.bigo.ads.z1.n) it.next(), "va_des");
                }
            }
            oVar.f.getClass();
            oVar.g = null;
        }
        B b = this.r0;
        if (b != null) {
            sg.bigo.ads.r1.j jVar = b.g;
            if (jVar != null) {
                X.c(jVar);
                b.g.a(false);
                b.g = null;
            }
            b.f12222a = null;
            b.c = null;
            b.d = null;
            this.r0 = null;
        }
    }

    @Override // sg.bigo.ads.C.l, sg.bigo.ads.api.NativeAd
    public final NativeAd.CreativeType getCreativeType() {
        return NativeAd.CreativeType.VIDEO;
    }

    @Override // sg.bigo.ads.C.l, sg.bigo.ads.api.NativeAd
    public final VideoController getVideoController() {
        MediaView mediaView = this.c0;
        if (mediaView != null) {
            return mediaView.getVideoController();
        }
        return null;
    }

    @Override // sg.bigo.ads.e.h
    public final void q() {
        B b = this.r0;
        if (b == null || ((sg.bigo.ads.U0.b) b.c).v0 != 1) {
            super.q();
        }
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.api.Ad
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        s sVar = this.p0;
        this.j = sVar;
        sVar.f12239a = adInteractionListener;
    }

    @Override // sg.bigo.ads.C.l, sg.bigo.ads.e.h
    public void u() {
        super.u();
        InterfaceC5087a interfaceC5087a = (InterfaceC5087a) this.k.f12482a;
        sg.bigo.ads.n1.o oVar = this.k0;
        if (oVar != null) {
            if (!oVar.b) {
                oVar.b = true;
            }
            sg.bigo.ads.n1.o.a(interfaceC5087a, 1);
            Iterator it = oVar.f13215a.f13449a.iterator();
            while (it.hasNext()) {
                oVar.a((sg.bigo.ads.z1.n) it.next(), "va_show", interfaceC5087a, -1, -1);
            }
        }
    }

    @Override // sg.bigo.ads.C.l
    public final List z() {
        List list;
        sg.bigo.ads.z1.p pVar = this.l0;
        return (pVar == null || (list = pVar.A) == null || list.size() <= 0) ? super.z() : list;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a2 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(t tVar, String str) {
        sg.bigo.ads.z1.p pVar;
        sg.bigo.ads.z1.f fVar;
        tVar.getClass();
        if (I.a((CharSequence) str)) {
            return 10074;
        }
        InterfaceC5087a interfaceC5087a = (InterfaceC5087a) tVar.k.f12482a;
        sg.bigo.ads.z1.l E = tVar.E();
        Context context = tVar.k.e;
        E.d = null;
        E.f13446a = 0;
        if (I.a((CharSequence) str)) {
            E.d = new sg.bigo.ads.z1.f(10060, "invalidate delivery params");
            pVar = null;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                pVar = E.a(context, str, E.g, new ArrayList());
                if (pVar != null) {
                    try {
                        E.a(pVar);
                    } catch (Throwable th) {
                        th = th;
                        AbstractC5496a.a(1, 6, "VASTParser", "Parse vast xml failed: " + th.getCause());
                        E.d = new sg.bigo.ads.z1.f(10061, th.getMessage());
                        int i = E.f13446a;
                        String str2 = E.c;
                        long j = E.b;
                        if (!sg.bigo.ads.O.g.f12472a.B.a(9)) {
                        }
                        if (pVar == null) {
                        }
                        fVar = E.d;
                        List list = E.e;
                        if (fVar != null) {
                        }
                    }
                }
                E.b = SystemClock.elapsedRealtime() - elapsedRealtime;
            } catch (Throwable th2) {
                th = th2;
                pVar = null;
            }
        }
        int i2 = E.f13446a;
        String str22 = E.c;
        long j2 = E.b;
        if (!sg.bigo.ads.O.g.f12472a.B.a(9) && URLUtil.isHttpUrl(str22)) {
            sg.bigo.ads.s1.b.a(interfaceC5087a, i2, str22, j2, 10076, "Invalid http url");
            return 10076;
        }
        if (pVar == null && pVar.o != null) {
            pVar.p = "" + pVar.o.c.hashCode();
            tVar.s0 = false;
            tVar.k0 = new sg.bigo.ads.n1.o(tVar.k.e, pVar, tVar.m);
            sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) interfaceC5087a;
            kVar.D0 = pVar;
            if (!I.a((CharSequence) pVar.n)) {
                kVar.z.f12574a = kVar.D0.n;
            }
            sg.bigo.ads.U0.t tVar2 = kVar.C0;
            if (tVar2 != null) {
                tVar2.f = kVar.i();
            }
            tVar.l0 = pVar;
            tVar.D();
            HashMap a2 = sg.bigo.ads.s1.b.a((sg.bigo.ads.P.c) interfaceC5087a, (sg.bigo.ads.Q.b) null, false);
            AbstractC5081e.a(a2, "rslt", "1", i2, "wrap");
            a2.put("cost", String.valueOf(j2));
            a2.put("video_duration", String.valueOf(kVar.i()));
            a2.put("video_type", kVar.f());
            a2.put("has_video", String.valueOf(kVar.A0 == null ? 0 : 1));
            a2.put("companion_type", sg.bigo.ads.s1.b.f13304a[kVar.m() ? 1 : 0][kVar.l() ? 1 : 0]);
            a2.put("cur_in_fg", String.valueOf(sg.bigo.ads.a0.o.b()));
            a2.remove("cache_ad");
            a2.remove("cache_ad_source");
            a2.remove("cache_req_status");
            a2.remove("session_id2");
            sg.bigo.ads.s1.b.c(a2, interfaceC5087a);
            sg.bigo.ads.s1.b.a("06002016", a2);
            return 0;
        }
        fVar = E.d;
        List list2 = E.e;
        if (fVar != null) {
            return 10075;
        }
        int i3 = fVar.f13441a;
        if (i3 == 10062) {
            sg.bigo.ads.n1.o.a(tVar.k.e, 3, list2);
        } else if (i3 == 10073) {
            sg.bigo.ads.n1.o.a(tVar.k.e, 2, list2);
        } else {
            sg.bigo.ads.n1.o.a(tVar.k.e, 1, list2);
        }
        sg.bigo.ads.s1.b.a(interfaceC5087a, i2, str22, j2, i3, fVar.b);
        return i3;
    }

    @Override // sg.bigo.ads.e.h
    public final void a(Point point, int i, int i2, sg.bigo.ads.P.f fVar) {
        super.a(point, i, i2, fVar);
        sg.bigo.ads.n1.o oVar = this.k0;
        if (oVar != null) {
            sg.bigo.ads.P.c cVar = this.k.f12482a;
            if (oVar.e) {
                return;
            }
            Iterator it = oVar.f13215a.j.iterator();
            while (it.hasNext()) {
                oVar.a((sg.bigo.ads.z1.n) it.next(), "va_cli", cVar, i2, i);
                it.remove();
            }
        }
    }

    @Override // sg.bigo.ads.C.l
    public void a(sg.bigo.ads.Q.c cVar, int i) {
        sg.bigo.ads.P.q qVar;
        int i2;
        boolean z;
        sg.bigo.ads.P.c cVar2 = this.k.f12482a;
        if (!(cVar2 instanceof InterfaceC5087a)) {
            cVar.a(this, 1030, 1400, "NativeVideo with invalid AdData class type.");
            return;
        }
        InterfaceC5087a interfaceC5087a = (InterfaceC5087a) cVar2;
        sg.bigo.ads.U0.s sVar = ((sg.bigo.ads.U0.k) interfaceC5087a).A0;
        if (sVar == null) {
            cVar.a(this, 1031, 1401, "Missing media video.");
            return;
        }
        String str = sVar.c;
        sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
        if (gVar != null && (qVar = gVar.B) != null && qVar.a(14)) {
            sg.bigo.ads.R0.j jVar = AbstractRunnableC5522h.e;
            if (jVar != null) {
                i2 = jVar.e;
                z = jVar.a(12);
            } else {
                i2 = 3;
                z = false;
            }
            AbstractRunnableC5522h.a("VastNet", i2, z).execute(new n(this, str, cVar, interfaceC5087a));
            return;
        }
        AbstractC5446j.a(1, null, new o(this, str, cVar, interfaceC5087a), 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r0 != 20) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (6 == (r0 != null ? r0.intValue() : 1)) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(sg.bigo.ads.Q.c cVar, sg.bigo.ads.P.c cVar2, int i, boolean z) {
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) ((InterfaceC5087a) this.k.f12482a);
        if (kVar.o()) {
            sg.bigo.ads.P.s sVar = this.i;
            if (kVar.Z0 == null) {
                kVar.Z0 = new sg.bigo.ads.P.x(kVar.v0);
            }
            sVar.f12491a = kVar.Z0;
            B b = new B(this.k.e, this.t0, kVar, this.l0, cVar, this);
            this.r0 = b;
            int i2 = kVar.l;
            if (i2 != 3 && i2 != 4) {
                if (i2 == 12) {
                    sg.bigo.ads.T0.q qVar = kVar.I;
                    if (qVar != null) {
                        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.ad_component_layout"));
                    }
                    cVar.a(b.f12222a, 1006, 10066, "Failed to support VPAID.");
                    return;
                }
            }
            A a3 = new A(b, i);
            if (z) {
                AbstractC5446j.a(1, null, a3, 0L);
                return;
            } else {
                a3.run();
                return;
            }
        }
        r rVar = new r(this, i, cVar, kVar, cVar2);
        if (z) {
            AbstractC5446j.a(1, null, rVar, 0L);
        } else {
            rVar.run();
        }
    }

    @Override // sg.bigo.ads.C.l
    public final void a(ViewGroup viewGroup, MediaView mediaView, ImageView imageView, AdOptionsView adOptionsView, ArrayList arrayList, int i, View... viewArr) {
        a(viewGroup, mediaView, (View) imageView, adOptionsView, (List) arrayList, i, viewArr);
        sg.bigo.ads.n1.o oVar = this.k0;
        if (oVar == null || this.s0) {
            return;
        }
        this.s0 = true;
        oVar.g = this.a0;
    }

    @Override // sg.bigo.ads.C.l
    public void a(MediaView mediaView) {
        int i;
        B b;
        if (this.l0 == null || mediaView == null) {
            return;
        }
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) ((InterfaceC5087a) this.k.f12482a);
        if (kVar.o() && (b = this.r0) != null) {
            boolean z = this.k.b.i;
            if (b.d == null) {
                return;
            }
            sg.bigo.ads.r1.j jVar = b.g;
            sg.bigo.ads.d1.s sVar = (sg.bigo.ads.d1.s) mediaView.getViewImpl();
            jVar.setVPAIDClickable(sVar.g);
            sVar.a(jVar);
            sVar.f = new sg.bigo.ads.d1.q(jVar);
            sVar.b = jVar;
            VideoController videoController = mediaView.getVideoController();
            if (videoController != null) {
                videoController.mute(z);
                return;
            }
            return;
        }
        sg.bigo.ads.z1.p pVar = this.l0;
        m mVar = this.t0;
        sg.bigo.ads.d1.s sVar2 = (sg.bigo.ads.d1.s) mediaView.getViewImpl();
        sVar2.getClass();
        sg.bigo.ads.R.b a2 = sg.bigo.ads.R.b.a(kVar.l);
        sg.bigo.ads.P.r rVar = kVar.E0;
        int i2 = pVar.v;
        int i3 = pVar.u;
        if (rVar != null && rVar.c > 0) {
            int i4 = rVar.f12490a;
            if (i4 > 0) {
                i2 = i4;
            }
            int i5 = rVar.b;
            if (i5 > 0) {
                i = i5;
                sg.bigo.ads.r1.n nVar = new sg.bigo.ads.r1.n(sVar2.f12728a.getContext(), i2, i, a2, kVar);
                nVar.setClickable(sVar2.g);
                sVar2.a(nVar);
                nVar.o = kVar.a(sVar2.f12728a.getContext());
                nVar.s = 0;
                nVar.setOnEventListener(mVar);
                sVar2.f = new sg.bigo.ads.d1.q(nVar);
                sVar2.b = nVar;
                a(mediaView.getVideoController(), this.k.b.i);
            }
        }
        i = i3;
        sg.bigo.ads.r1.n nVar2 = new sg.bigo.ads.r1.n(sVar2.f12728a.getContext(), i2, i, a2, kVar);
        nVar2.setClickable(sVar2.g);
        sVar2.a(nVar2);
        nVar2.o = kVar.a(sVar2.f12728a.getContext());
        nVar2.s = 0;
        nVar2.setOnEventListener(mVar);
        sVar2.f = new sg.bigo.ads.d1.q(nVar2);
        sVar2.b = nVar2;
        a(mediaView.getVideoController(), this.k.b.i);
    }

    public void a(VideoController videoController, boolean z) {
        if (videoController != null) {
            videoController.mute(z);
        }
    }
}
