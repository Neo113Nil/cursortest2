package sg.bigo.ads.C;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.iab.omid.library.bigosg.adsession.AdSession;
import com.iab.omid.library.bigosg.adsession.AdSessionConfiguration;
import com.iab.omid.library.bigosg.adsession.AdSessionContext;
import com.iab.omid.library.bigosg.adsession.CreativeType;
import com.iab.omid.library.bigosg.adsession.ImpressionType;
import com.iab.omid.library.bigosg.adsession.Owner;
import com.iab.omid.library.bigosg.adsession.Partner;
import com.iab.omid.library.bigosg.adsession.VerificationScriptResource;
import com.iab.omid.library.bigosg.adsession.media.InteractionType;
import com.iab.omid.library.bigosg.adsession.media.MediaEvents;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import sg.bigo.ads.K0.AbstractC4956m;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.L0.C;
import sg.bigo.ads.R;
import sg.bigo.ads.Y0.D;
import sg.bigo.ads.api.AdIconView;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.NativeAdView;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.d1.C5065a;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5204s;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public class l extends w implements NativeAd, sg.bigo.ads.d1.u {
    public long W;
    public sg.bigo.ads.F.r X;
    public C Y;
    public final g Z;
    public sg.bigo.ads.m1.c a0;
    public ViewGroup b0;
    public MediaView c0;
    public j d0;
    public sg.bigo.ads.F.l e0;
    public int f0;
    public int g0;
    public final HashMap h0;
    public WeakReference i0;
    public boolean j0;

    public l(sg.bigo.ads.P.j jVar) {
        super(jVar);
        this.W = -1L;
        this.Z = new g(this);
        this.d0 = null;
        this.e0 = null;
        this.f0 = 0;
        this.h0 = new HashMap();
        this.j0 = false;
    }

    public static boolean a(ViewGroup viewGroup, View view) {
        Object tag = view.getTag();
        return (tag == null || viewGroup.findViewWithTag(tag) == null) ? false : true;
    }

    public boolean A() {
        return false;
    }

    public void B() {
        sg.bigo.ads.F.r rVar = this.X;
        if (rVar != null) {
            rVar.a();
        }
    }

    public void C() {
        this.j0 = true;
    }

    @Override // sg.bigo.ads.e.h
    public void b(Point point, int i, int i2, sg.bigo.ads.P.f fVar) {
        sg.bigo.ads.G.h hVar;
        FrameLayout frameLayout;
        View findViewById;
        a("clicked");
        a(point, i, i2, fVar);
        sg.bigo.ads.F.l lVar = this.e0;
        if (lVar == null || (hVar = lVar.f12292a.e) == null || (frameLayout = hVar.b) == null || (findViewById = frameLayout.findViewById(R.id.inter_banner_click_guide_contain)) == null) {
            return;
        }
        findViewById.clearAnimation();
        X.c(findViewById);
    }

    @Override // sg.bigo.ads.e.h
    public void destroyInMainThread() {
        sg.bigo.ads.e.l lVar = this.R;
        AbstractC5446j.a(lVar.k);
        lVar.j = false;
        sg.bigo.ads.m1.c cVar = this.a0;
        if (cVar != null) {
            if (AbstractC5446j.e()) {
                try {
                    cVar.f13123a.finish();
                } catch (Throwable unused) {
                }
            } else {
                AbstractC5446j.a(2, null, new sg.bigo.ads.m1.b(cVar), 0L);
            }
            cVar.c = null;
        }
        this.l = null;
        this.b0 = null;
        MediaView mediaView = this.c0;
        if (mediaView != null) {
            mediaView.destroy();
            this.c0 = null;
        }
        C c = this.Y;
        if (c != null) {
            X.c(c);
            this.Y = null;
        }
        this.d0 = null;
        this.e0 = null;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public final String getAdvertiser() {
        return ((sg.bigo.ads.U0.b) ((InterfaceC5087a) e())).L;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public final String getCallToAction() {
        return ((sg.bigo.ads.U0.b) ((InterfaceC5087a) e())).i;
    }

    @Override // sg.bigo.ads.api.Ad
    public String getCreativeId() {
        sg.bigo.ads.P.c cVar = (InterfaceC5087a) e();
        return cVar != null ? ((sg.bigo.ads.U0.b) cVar).n : "";
    }

    @Override // sg.bigo.ads.api.NativeAd
    public NativeAd.CreativeType getCreativeType() {
        return NativeAd.CreativeType.IMAGE;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public final String getDescription() {
        return ((sg.bigo.ads.U0.k) ((InterfaceC5087a) e())).c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r1.a() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r1.a() != false) goto L18;
     */
    @Override // sg.bigo.ads.api.NativeAd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float getMediaContentAspectRatio() {
        sg.bigo.ads.U.r rVar;
        sg.bigo.ads.P.r rVar2 = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) e())).E0;
        if (rVar2 != null) {
            rVar = new sg.bigo.ads.U.r(rVar2.f12490a, rVar2.b);
        }
        if (this instanceof t) {
            sg.bigo.ads.z1.p pVar = ((t) this).l0;
            if (pVar != null) {
                rVar = new sg.bigo.ads.U.r(pVar.v, pVar.u);
            }
            rVar = new sg.bigo.ads.U.r(-1, -1);
        } else {
            sg.bigo.ads.U0.h[] hVarArr = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) e())).z0;
            if (!sg.bigo.ads.K0.A.c(hVarArr)) {
                sg.bigo.ads.U0.h hVar = hVarArr[0];
                rVar = new sg.bigo.ads.U.r(hVar.f12572a, hVar.b);
            }
            rVar = new sg.bigo.ads.U.r(-1, -1);
        }
        if (rVar.a()) {
            return (rVar.getWidth() * 1.0f) / rVar.getHeight();
        }
        return 0.0f;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public final sg.bigo.ads.P.b getPopPage() {
        return ((sg.bigo.ads.U0.b) ((InterfaceC5087a) e())).X;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public final String getSponsored() {
        return ((sg.bigo.ads.U0.b) ((InterfaceC5087a) e())).w0;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public final String getTitle() {
        return ((sg.bigo.ads.U0.k) ((InterfaceC5087a) e())).g();
    }

    @Override // sg.bigo.ads.api.NativeAd
    public VideoController getVideoController() {
        return null;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public final String getWarning() {
        sg.bigo.ads.U0.n nVar = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) e())).p;
        return nVar != null ? nVar.c : "";
    }

    public final C getWatermarkView() {
        C c = this.Y;
        if (c != null) {
            return c;
        }
        String str = this.d.g;
        if (I.a((CharSequence) str)) {
            return null;
        }
        C c2 = new C(str, this.k.f);
        this.Y = c2;
        return c2;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public final boolean hasIcon() {
        if (((sg.bigo.ads.U0.k) ((InterfaceC5087a) e())).y0 == null) {
            return false;
        }
        return !I.a((CharSequence) r0.c);
    }

    @Override // sg.bigo.ads.api.NativeAd
    public final void registerViewForInteraction(ViewGroup viewGroup, MediaView mediaView, ImageView imageView, AdOptionsView adOptionsView, List list) {
        if (a(viewGroup)) {
            a(viewGroup, mediaView, imageView, adOptionsView, list, 1, null);
        }
    }

    @Override // sg.bigo.ads.e.h
    public void u() {
        super.u();
        sg.bigo.ads.m1.c cVar = this.a0;
        if (cVar != null) {
            cVar.a();
        }
    }

    public List z() {
        ArrayList arrayList = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) e())).u;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sg.bigo.ads.U0.l lVar = (sg.bigo.ads.U0.l) it.next();
                if (lVar != null) {
                    sg.bigo.ads.m1.a aVar = new sg.bigo.ads.m1.a();
                    aVar.b = lVar.b;
                    aVar.f13121a = lVar.f12575a;
                    aVar.c = lVar.c;
                    arrayList2.add(aVar);
                }
            }
        }
        return arrayList2;
    }

    public final boolean a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            b(2001, 0, "NativeAdView cannot be null.");
            return false;
        }
        if (((sg.bigo.ads.U0.b) this.k.f12482a).a()) {
            b(2000, 1, "The ad is expired.");
            return false;
        }
        if (!this.u) {
            return true;
        }
        b(2000, 1, "The ad is destroyed.");
        return false;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public final void registerViewForInteraction(NativeAdView nativeAdView, MediaView mediaView, AdIconView adIconView, AdOptionsView adOptionsView, List list) {
        if (a(nativeAdView)) {
            a(nativeAdView, mediaView, adIconView, adOptionsView, list, 1, null);
        }
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.Q.b
    public final void a(sg.bigo.ads.Q.c cVar) {
        a(cVar, this.k.b.e);
    }

    public void a(sg.bigo.ads.Q.c cVar, int i) {
        B();
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) ((InterfaceC5087a) e());
        String e = kVar.e();
        if (I.a((CharSequence) e)) {
            cVar.a(this, 1027, 1300, "Missing media image.");
            return;
        }
        if (sg.bigo.ads.O.g.f12472a.B.a(9) && URLUtil.isHttpUrl(e)) {
            cVar.a(this, 1028, 1305, "Invalid http url");
            sg.bigo.ads.s1.b.a(kVar, e, "Invalid http url", 0L, 0L, 1, "", false, null, null, null, 0);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (i == 0) {
            sg.bigo.ads.s0.x.a(this.k.e, null, e, kVar.T, new h(this, kVar, cVar, e, elapsedRealtime));
            return;
        }
        if (i == 1) {
            sg.bigo.ads.s0.x.a(this.k.e, null, e, kVar.T, new i(this, kVar, e, elapsedRealtime));
        }
        cVar.a(this);
    }

    @Override // sg.bigo.ads.d1.u
    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        sg.bigo.ads.U.j jVar = new sg.bigo.ads.U.j();
        jVar.b = new Point(i, i2);
        jVar.f12564a = new Point(i3, i4);
        a(jVar, i5, i6);
    }

    @Override // sg.bigo.ads.d1.u
    public final void a(sg.bigo.ads.U.j jVar) {
        a(jVar, 1, 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x019f, code lost:
    
        if (r34 == 36) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sg.bigo.ads.U.j jVar, int i, int i2) {
        Context context;
        ArrayList arrayList;
        sg.bigo.ads.T0.q qVar;
        JSONArray jSONArray;
        int i3;
        int i4;
        Activity activity;
        Context context2;
        JSONArray jSONArray2;
        int i5;
        sg.bigo.ads.U0.b bVar;
        sg.bigo.ads.P.f a2;
        boolean z;
        sg.bigo.ads.U0.b bVar2;
        sg.bigo.ads.P.c cVar;
        l lVar;
        sg.bigo.ads.U.j jVar2;
        int i6;
        int i7;
        WeakReference weakReference = this.O;
        if (weakReference != null && weakReference.get() != null && ((AbstractC5204s) ((sg.bigo.ads.e.g) this.O.get())).V) {
            AbstractC5496a.a("NativeStaticAdImpl", "Styleable landing page is opened, ignore the click action.");
            return;
        }
        if (!this.P) {
            AbstractC5496a.a("NativeStaticAdImpl", "ignore the click action.");
            return;
        }
        sg.bigo.ads.P.c cVar2 = (InterfaceC5087a) e();
        WeakReference weakReference2 = this.i0;
        if (weakReference2 == null || (context = (Activity) weakReference2.get()) == null) {
            context = null;
        } else {
            a(1);
        }
        if (context == null) {
            sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
            if (this.j0) {
                if (gVar != null && gVar.B.a(16)) {
                    context = sg.bigo.ads.a0.o.a();
                    if (context == null) {
                        AbstractC5496a.a("NativeStaticAdImpl", "Interstitial/Reward Video/Splash native ad failed to get activity context.");
                    }
                    a(2);
                }
            } else if (gVar != null && gVar.B.a(17)) {
                try {
                    Activity a3 = AbstractC4956m.a(this.b0);
                    if (a3 != null) {
                        try {
                            a(3);
                        } catch (Exception unused) {
                        }
                        context = a3;
                    }
                } catch (Exception unused2) {
                }
                if (context == null) {
                    context = sg.bigo.ads.a0.o.a();
                    if (context == null) {
                        AbstractC5496a.a("NativeStaticAdImpl", "Native ad failed to get activity context.");
                    }
                    a(2);
                }
            }
        }
        if (context == null) {
            context = this.k.e;
        }
        Context context3 = context;
        boolean z2 = this instanceof sg.bigo.ads.Q.d;
        boolean z3 = !z2 && ((sg.bigo.ads.U0.b) cVar2).a(16);
        ViewGroup viewGroup = this.b0;
        Activity a4 = viewGroup != null ? AbstractC4956m.a(viewGroup) : null;
        sg.bigo.ads.U0.b bVar3 = (sg.bigo.ads.U0.b) cVar2;
        sg.bigo.ads.P.n nVar = bVar3.u0;
        sg.bigo.ads.P.f fVar = new sg.bigo.ads.P.f();
        if (nVar.f12486a != 0) {
            D.a(context3, this);
            fVar.m = 1;
            jVar2 = jVar;
            bVar2 = bVar3;
            activity = a4;
            cVar = cVar2;
            i6 = i2;
            lVar = this;
        } else {
            sg.bigo.ads.U0.j jVar3 = bVar3.z;
            String str = jVar3.f12574a;
            if (z2) {
                ((sg.bigo.ads.Q.d) this).a();
            }
            sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) cVar2;
            String a5 = D.a(str, kVar.b1.get(), kVar.c1.get(), i, i2);
            String str2 = jVar3.l;
            String str3 = jVar3.b;
            String str4 = jVar3.g;
            boolean a6 = bVar3.a(2);
            int i8 = jVar3.c;
            JSONArray jSONArray3 = jVar3.d;
            boolean b = bVar3.b();
            boolean a7 = bVar3.a(64);
            if (str3 != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str3);
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            boolean z4 = i2 == 22 || i2 == 36;
            sg.bigo.ads.P.f fVar2 = new sg.bigo.ads.P.f();
            sg.bigo.ads.U0.b bVar4 = (sg.bigo.ads.U0.b) e();
            int i9 = bVar4.l;
            if ((i9 == 3 || i9 == 4) && ((i2 == 22 || i2 == 36) && (qVar = bVar4.J) != null)) {
                Integer a8 = sg.bigo.ads.K0.z.a(qVar.a("clk_flow_attr.auto_clk_def"));
                int intValue = a8 != null ? a8.intValue() : 0;
                Integer a9 = sg.bigo.ads.K0.z.a(qVar.a("clk_flow_attr.auto_clk_urltype"));
                if (a9 != null) {
                    i3 = a9.intValue();
                    jSONArray = jSONArray3;
                } else {
                    jSONArray = jSONArray3;
                    i3 = 0;
                }
                Integer a10 = sg.bigo.ads.K0.z.a(qVar.a("clk_flow_attr.ac_gp_format"));
                int intValue2 = a10 != null ? a10.intValue() : 1;
                if (intValue == 0 || (intValue == 1 && i2 == 22)) {
                    i4 = 2;
                } else {
                    i4 = 2;
                    if (intValue == 2) {
                    }
                }
                if (i3 == 1) {
                    activity = a4;
                    context2 = context3;
                    jSONArray2 = jSONArray;
                    i5 = 0;
                    bVar = bVar3;
                    a2 = D.a(context2, activity, str2, this, fVar2, intValue2, z3, z4);
                    z = true;
                    a2.g = true;
                } else if (i3 != i4) {
                    fVar2.h = intValue2;
                } else {
                    int i10 = intValue2;
                    jSONArray2 = jSONArray;
                    activity = a4;
                    bVar = bVar3;
                    i5 = 0;
                    context2 = context3;
                    a2 = D.a(context3, a4, str2, this, fVar2, i10, z3, z4);
                    a2.h = i10;
                    z = true;
                }
                if (!a2.b() || a2.g) {
                    bVar2 = bVar;
                    cVar = cVar2;
                } else {
                    int i11 = a2.h;
                    if (i11 < 0) {
                        i11 = D.a(this);
                    }
                    bVar2 = bVar;
                    cVar = cVar2;
                    a2 = D.a(context2, activity, arrayList, a5, str4, a6, i8, jSONArray2, this, b, i11, z3, z4, a7);
                }
                fVar = a2;
                fVar.m = i5;
                lVar = this;
                jVar2 = jVar;
                i6 = i2;
            } else {
                jSONArray = jSONArray3;
            }
            activity = a4;
            context2 = context3;
            a2 = fVar2;
            jSONArray2 = jSONArray;
            z = true;
            i5 = 0;
            bVar = bVar3;
            if (a2.b()) {
            }
            bVar2 = bVar;
            cVar = cVar2;
            fVar = a2;
            fVar.m = i5;
            lVar = this;
            jVar2 = jVar;
            i6 = i2;
        }
        lVar.a(jVar2, i6, i, fVar);
        sg.bigo.ads.m1.c cVar3 = lVar.a0;
        if (cVar3 != null) {
            InteractionType interactionType = InteractionType.CLICK;
            MediaEvents mediaEvents = cVar3.c;
            if (mediaEvents != null) {
                mediaEvents.adUserInteraction(interactionType);
                interactionType.toString();
                cVar3.f13123a.getAdSessionId();
            }
        }
        if (fVar.a() > -1) {
            int i12 = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) e())).l;
            i7 = 1;
            if (i12 == 1 || i12 == 15 || i12 == 16 || i12 == 17 || i12 == 18 || lVar.J == 2) {
                lVar.I = fVar.d;
                D.a(activity, (sg.bigo.ads.e.h) lVar);
            }
        } else {
            i7 = 1;
        }
        if (fVar.f12478a == 6) {
            fVar.l = bVar2.z.g;
            Activity a11 = AbstractC4956m.a(lVar.b0);
            if (a11 == null) {
                return;
            }
            WeakReference weakReference3 = new WeakReference(a11);
            if (D.c == null) {
                D.c = new sg.bigo.ads.Y0.C(weakReference3, fVar, cVar, lVar);
            }
            AbstractC5446j.a(D.c);
            AbstractC5446j.a(i7, null, D.c, 5000L);
        }
    }

    public void a(ViewGroup viewGroup, MediaView mediaView, ImageView imageView, AdOptionsView adOptionsView, ArrayList arrayList, int i, View... viewArr) {
        a(viewGroup, mediaView, (View) imageView, adOptionsView, (List) arrayList, i, viewArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(ViewGroup viewGroup, MediaView mediaView, View view, AdOptionsView adOptionsView, List list, int i, View... viewArr) {
        AdSession adSession;
        Partner createPartner;
        ArrayList arrayList;
        sg.bigo.ads.m1.c cVar;
        int intValue;
        this.b0 = viewGroup;
        viewGroup.setTag(11);
        sg.bigo.ads.P.c cVar2 = (InterfaceC5087a) e();
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar2;
        if (bVar.l != 2) {
            C c = this.Y;
            if (c != null) {
                c.bringToFront();
            } else {
                C.a(this.k.e, viewGroup, getWatermarkView());
            }
        }
        View[] a2 = getWatermarkView() != null ? X.a(viewArr, this.Y) : viewArr;
        int i2 = a(i, view, viewGroup) ? 5 : 1;
        if (adOptionsView != null) {
            adOptionsView.setTag(4);
            if (a(viewGroup, adOptionsView)) {
                adOptionsView.a(cVar2, bVar.O);
                i2 |= 8;
            }
        }
        if (mediaView != null) {
            mediaView.setTag(5);
            if (a(viewGroup, mediaView)) {
                a(mediaView);
                f.a(viewGroup, mediaView, i, this, this.f0);
                i2 |= 2;
                this.c0 = mediaView;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                if (view2 != null) {
                    Object tag = view2.getTag();
                    if ((tag instanceof Integer) && ((intValue = ((Integer) tag).intValue()) == 7 || intValue == 2 || intValue == 6 || intValue == 10 || intValue == 26 || intValue == 8 || intValue == 5 || intValue == 9)) {
                        arrayList2.add(view2);
                    }
                }
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            View view3 = (View) it2.next();
            if (view3 != null) {
                f.a(viewGroup, view3, i, this, this.f0);
            }
        }
        sg.bigo.ads.m1.g gVar = sg.bigo.ads.m1.f.f13126a;
        List<sg.bigo.ads.m1.a> z = z();
        boolean A = A();
        ViewGroup viewGroup2 = this.b0;
        if (gVar.b) {
            try {
                createPartner = Partner.createPartner("Bigosg", "5.10.1");
                arrayList = new ArrayList();
                for (sg.bigo.ads.m1.a aVar : z) {
                    if (!TextUtils.isEmpty(aVar.f13121a)) {
                        arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(aVar.b, new URL(aVar.f13121a), aVar.c));
                    }
                }
            } catch (Exception e) {
                e = e;
                adSession = null;
            }
            if (arrayList.size() != 0) {
                AdSessionContext createNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(createPartner, gVar.f12790a, arrayList, "");
                CreativeType creativeType = A ? CreativeType.VIDEO : CreativeType.NATIVE_DISPLAY;
                ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                Owner owner = Owner.NATIVE;
                adSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, A ? owner : Owner.NONE, false), createNativeAdSessionContext);
                try {
                    adSession.registerAdView(viewGroup2);
                    if (a2 != null) {
                        for (View view4 : a2) {
                            if (view4 != null) {
                                adSession.addFriendlyObstruction(view4);
                            }
                        }
                    }
                    MediaEvents createMediaEvents = A ? MediaEvents.createMediaEvents(adSession) : null;
                    adSession.start();
                    adSession.getAdSessionId();
                    cVar = new sg.bigo.ads.m1.c(adSession, createMediaEvents);
                } catch (Exception e2) {
                    e = e2;
                    AbstractC5496a.b("OMSDK", "Fail to create native OM Session: : " + e.getMessage());
                    if (adSession != null) {
                        adSession.finish();
                    }
                    cVar = null;
                    this.a0 = cVar;
                    Integer valueOf = Integer.valueOf(i2);
                    synchronized (this) {
                    }
                }
                this.a0 = cVar;
                Integer valueOf2 = Integer.valueOf(i2);
                synchronized (this) {
                    this.N.put("render_style", valueOf2);
                }
                if (!this.q) {
                    this.q = true;
                    this.A = SystemClock.elapsedRealtime();
                }
                this.l = viewGroup;
                sg.bigo.ads.e.l.a(this.R);
                return;
            }
            AbstractC5496a.b("OMSDK", "Fail to create native OM AdSession: no verification script resources");
        } else {
            AbstractC5496a.b("OMSDK", "Fail to create native OM AdSession: OMSDK is not ready");
        }
        cVar = null;
        this.a0 = cVar;
        Integer valueOf22 = Integer.valueOf(i2);
        synchronized (this) {
        }
    }

    public boolean a(int i, View view, ViewGroup viewGroup) {
        sg.bigo.ads.P.c cVar = (InterfaceC5087a) e();
        if (view != null && cVar != null) {
            view.setTag(1);
            if (a(viewGroup, view)) {
                sg.bigo.ads.U0.h hVar = ((sg.bigo.ads.U0.k) cVar).y0;
                if (hVar != null) {
                    String str = hVar.c;
                    if (sg.bigo.ads.O.g.f12472a.B.a(9) && URLUtil.isHttpUrl(str)) {
                        sg.bigo.ads.s1.b.a(3000, 10220, "Invalid http url: " + str, cVar);
                    } else if (view instanceof ImageView) {
                        new sg.bigo.ads.s0.p((ImageView) view, 0).a(null, hVar.c, ((sg.bigo.ads.U0.b) cVar).T);
                    } else if (view instanceof AdIconView) {
                        String str2 = hVar.c;
                        boolean z = ((sg.bigo.ads.U0.b) cVar).T;
                        C5065a c5065a = (C5065a) ((AdIconView) view).getViewImpl();
                        c5065a.f12728a.removeAllViews();
                        AdImageView adImageView = new AdImageView(c5065a.f12728a.getContext());
                        adImageView.setIconTag(true);
                        X.a(adImageView, c5065a.f12728a, null, -1);
                        adImageView.c.a(null, str2, z);
                    }
                }
                f.a(viewGroup, view, i, this, this.f0);
                return true;
            }
        }
        return false;
    }

    public void a(Activity activity) {
        this.i0 = new WeakReference(activity);
    }

    public void a(MediaView mediaView) {
        if (mediaView == null) {
            return;
        }
        InterfaceC5087a interfaceC5087a = (InterfaceC5087a) e();
        if (this.k.b.e == 2) {
            this.d0 = new j(interfaceC5087a, SystemClock.elapsedRealtime());
        }
        ((sg.bigo.ads.d1.s) mediaView.getViewImpl()).a(interfaceC5087a, this.d0);
        if (sg.bigo.ads.O.g.f12472a.B.a(28)) {
            mediaView.setOnAdClickListener(new k(this));
        }
    }
}
