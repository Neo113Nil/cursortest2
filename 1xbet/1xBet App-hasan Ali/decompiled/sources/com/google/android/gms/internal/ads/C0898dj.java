package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.dj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0898dj extends AbstractC0762ah {

    /* renamed from: j, reason: collision with root package name */
    public final Context f13141j;

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f13142k;

    /* renamed from: l, reason: collision with root package name */
    public final Fr f13143l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC1165jj f13144m;

    /* renamed from: n, reason: collision with root package name */
    public final C1163jh f13145n;

    /* renamed from: o, reason: collision with root package name */
    public final C0997ft f13146o;

    /* renamed from: p, reason: collision with root package name */
    public final Sh f13147p;

    /* renamed from: q, reason: collision with root package name */
    public final C0584Ed f13148q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13149r;

    public C0898dj(G7 g7, Context context, InterfaceC0677Re interfaceC0677Re, Fr fr, InterfaceC1165jj interfaceC1165jj, C1163jh c1163jh, C0997ft c0997ft, Sh sh, C0584Ed c0584Ed) {
        super(g7);
        this.f13149r = false;
        this.f13141j = context;
        this.f13142k = new WeakReference(interfaceC0677Re);
        this.f13143l = fr;
        this.f13144m = interfaceC1165jj;
        this.f13145n = c1163jh;
        this.f13146o = c0997ft;
        this.f13147p = sh;
        this.f13148q = c0584Ed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Activity activity, boolean z3) {
        Lq v4;
        int a5;
        Fr fr = this.f13143l;
        fr.n1(new Jh(27));
        A7 a7 = F7.f8672D0;
        Q2.r rVar = Q2.r.f5053d;
        boolean booleanValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
        Context context = this.f13141j;
        Sh sh = this.f13147p;
        if (booleanValue) {
            T2.L l5 = P2.o.f4767B.f4771c;
            if (T2.L.f(context)) {
                U2.j.i("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                sh.a();
                if (((Boolean) rVar.f5056c.a(F7.E0)).booleanValue()) {
                    this.f13146o.a(((Nq) this.f12692a.f11596b.f13762m).f10823b);
                    return;
                }
                return;
            }
        }
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f13142k.get();
        if (((Boolean) rVar.f5056c.a(F7.wb)).booleanValue() && interfaceC0677Re != null && (v4 = interfaceC0677Re.v()) != null && v4.f10522r0) {
            C0584Ed c0584Ed = this.f13148q;
            synchronized (c0584Ed.f8513a) {
                a5 = c0584Ed.f8516d.a();
            }
            if (v4.f10524s0 != a5) {
                U2.j.i("The interstitial consent form has been shown.");
                sh.q(AbstractC1803xs.I(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f13149r) {
            U2.j.i("The interstitial ad has been shown.");
            sh.q(AbstractC1803xs.I(10, null, null));
        }
        if (this.f13149r) {
            return;
        }
        if (activity == null) {
            activity = context;
        }
        try {
            this.f13144m.z(z3, activity, sh);
            fr.n1(new Jh(28));
            this.f13149r = true;
        } catch (C1121ij e3) {
            sh.n0(e3);
        }
    }

    public final void finalize() {
        try {
            InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f13142k.get();
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.o6)).booleanValue()) {
                if (!this.f13149r && interfaceC0677Re != null) {
                    AbstractC0613Id.f.execute(new RunnableC0658Og(interfaceC0677Re, 2));
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
