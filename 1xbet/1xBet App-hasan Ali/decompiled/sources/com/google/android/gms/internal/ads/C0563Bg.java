package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Bg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563Bg extends AbstractC0762ah {

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0677Re f7855j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7856k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f7857l;

    /* renamed from: m, reason: collision with root package name */
    public final C0709Wb f7858m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC1165jj f7859n;

    /* renamed from: o, reason: collision with root package name */
    public final Fr f7860o;

    /* renamed from: p, reason: collision with root package name */
    public final Sh f7861p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7862q;

    /* renamed from: r, reason: collision with root package name */
    public final C0584Ed f7863r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7864s;

    public C0563Bg(G7 g7, Context context, InterfaceC0677Re interfaceC0677Re, int i, C0709Wb c0709Wb, InterfaceC1165jj interfaceC1165jj, Fr fr, Sh sh, C0584Ed c0584Ed) {
        super(g7);
        this.f7864s = false;
        this.f7855j = interfaceC0677Re;
        this.f7857l = context;
        this.f7856k = i;
        this.f7858m = c0709Wb;
        this.f7859n = interfaceC1165jj;
        this.f7860o = fr;
        this.f7861p = sh;
        this.f7862q = ((Boolean) Q2.r.f5053d.f5056c.a(F7.e5)).booleanValue();
        this.f7863r = c0584Ed;
    }

    public final void b() {
        Xh xh = this.f12694c;
        xh.getClass();
        xh.n1(new E7(null, 1));
        InterfaceC0677Re interfaceC0677Re = this.f7855j;
        if (interfaceC0677Re != null) {
            interfaceC0677Re.destroy();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v15, types: [android.content.Context] */
    public final void c(Activity activity, boolean z3) {
        InterfaceC0677Re interfaceC0677Re;
        Lq v4;
        int a5;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f7857l;
        }
        Fr fr = this.f7860o;
        boolean z5 = this.f7862q;
        if (z5) {
            fr.n1(new Jh(27));
        }
        A7 a7 = F7.f8672D0;
        Q2.r rVar = Q2.r.f5053d;
        boolean booleanValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
        Sh sh = this.f7861p;
        if (booleanValue) {
            P2.o oVar = P2.o.f4767B;
            T2.L l5 = oVar.f4771c;
            if (T2.L.f(activity2)) {
                U2.j.i("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                sh.a();
                if (((Boolean) rVar.f5056c.a(F7.E0)).booleanValue()) {
                    new C0997ft(activity2.getApplicationContext(), oVar.f4785s.n()).a(((Nq) this.f12692a.f11596b.f13762m).f10823b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) rVar.f5056c.a(F7.wb)).booleanValue() && (interfaceC0677Re = this.f7855j) != null && (v4 = interfaceC0677Re.v()) != null && v4.f10522r0) {
            C0584Ed c0584Ed = this.f7863r;
            synchronized (c0584Ed.f8513a) {
                a5 = c0584Ed.f8516d.a();
            }
            if (v4.f10524s0 != a5) {
                U2.j.i("The app open consent form has been shown.");
                sh.q(AbstractC1803xs.I(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f7864s) {
            U2.j.i("App open interstitial ad is already visible.");
            sh.q(AbstractC1803xs.I(10, null, null));
        }
        if (this.f7864s) {
            return;
        }
        try {
            this.f7859n.z(z3, activity2, sh);
            if (z5) {
                fr.n1(new Jh(28));
            }
            this.f7864s = true;
        } catch (C1121ij e3) {
            sh.n0(e3);
        }
    }

    public final void d(int i, long j5) {
        C0709Wb c0709Wb = this.f7858m;
        C1390oj a5 = ((C1482ql) c0709Wb.f12040l).a();
        a5.k("gqi", ((Nq) ((Sq) c0709Wb.f12041m).f11596b.f13762m).f10823b);
        a5.k("action", "ad_closed");
        a5.k("show_time", String.valueOf(j5));
        a5.k("ad_format", "app_open_ad");
        int i5 = i - 1;
        a5.k("acr", i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        a5.q();
    }
}
