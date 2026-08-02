package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class Qk extends AbstractC0762ah {

    /* renamed from: j, reason: collision with root package name */
    public final Context f11233j;

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f11234k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1165jj f11235l;

    /* renamed from: m, reason: collision with root package name */
    public final Fr f11236m;

    /* renamed from: n, reason: collision with root package name */
    public final Sh f11237n;

    /* renamed from: o, reason: collision with root package name */
    public final C0941ei f11238o;

    /* renamed from: p, reason: collision with root package name */
    public final C1163jh f11239p;

    /* renamed from: q, reason: collision with root package name */
    public final BinderC0703Vc f11240q;

    /* renamed from: r, reason: collision with root package name */
    public final C0997ft f11241r;

    /* renamed from: s, reason: collision with root package name */
    public final Uq f11242s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11243t;

    public Qk(G7 g7, Context context, InterfaceC0677Re interfaceC0677Re, InterfaceC1165jj interfaceC1165jj, Fr fr, Sh sh, C0941ei c0941ei, C1163jh c1163jh, Lq lq, C0997ft c0997ft, Uq uq) {
        super(g7);
        this.f11243t = false;
        this.f11233j = context;
        this.f11235l = interfaceC1165jj;
        this.f11234k = new WeakReference(interfaceC0677Re);
        this.f11236m = fr;
        this.f11237n = sh;
        this.f11238o = c0941ei;
        this.f11239p = c1163jh;
        this.f11241r = c0997ft;
        C0575Dc c0575Dc = lq.f10509l;
        this.f11240q = new BinderC0703Vc(c0575Dc != null ? c0575Dc.f8197k : "", c0575Dc != null ? c0575Dc.f8198l : 1);
        this.f11242s = uq;
    }

    public final Bundle b() {
        Bundle bundle;
        C0941ei c0941ei = this.f11238o;
        synchronized (c0941ei) {
            bundle = new Bundle(c0941ei.f13325m);
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z3) {
        A7 a7 = F7.f8672D0;
        Q2.r rVar = Q2.r.f5053d;
        boolean booleanValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
        Context context = this.f11233j;
        Sh sh = this.f11237n;
        if (booleanValue) {
            T2.L l5 = P2.o.f4767B.f4771c;
            if (T2.L.f(context)) {
                U2.j.i("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                sh.a();
                if (((Boolean) rVar.f5056c.a(F7.E0)).booleanValue()) {
                    this.f11241r.a(((Nq) this.f12692a.f11596b.f13762m).f10823b);
                    return;
                }
                return;
            }
        }
        if (this.f11243t) {
            U2.j.i("The rewarded ad have been showed.");
            sh.q(AbstractC1803xs.I(10, null, null));
            return;
        }
        this.f11243t = true;
        Jh jh = new Jh(27);
        Fr fr = this.f11236m;
        fr.n1(jh);
        if (activity == null) {
            activity = context;
        }
        try {
            this.f11235l.z(z3, activity, sh);
            fr.n1(new Jh(28));
        } catch (C1121ij e3) {
            sh.n0(e3);
        }
    }

    public final void finalize() {
        try {
            InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f11234k.get();
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.o6)).booleanValue()) {
                if (!this.f11243t && interfaceC0677Re != null) {
                    AbstractC0613Id.f.execute(new RunnableC0658Og(interfaceC0677Re, 4));
                }
            } else if (interfaceC0677Re != null) {
                interfaceC0677Re.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
