package P2;

import Q2.A;
import Q2.InterfaceC0374n0;
import Q2.InterfaceC0383s0;
import Q2.InterfaceC0386u;
import Q2.InterfaceC0391w0;
import Q2.InterfaceC0392x;
import Q2.J;
import Q2.Q;
import Q2.U;
import Q2.V0;
import Q2.W;
import Q2.X0;
import Q2.a1;
import Q2.d1;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.C1832yc;
import com.google.android.gms.internal.ads.InterfaceC1101i6;
import com.google.android.gms.internal.ads.N7;
import com.google.android.gms.internal.ads.Q4;
import com.google.android.gms.internal.ads.V7;
import java.util.Iterator;
import java.util.TreeMap;
import m3.v;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class n extends J {

    /* renamed from: k, reason: collision with root package name */
    public final U2.a f4758k;

    /* renamed from: l, reason: collision with root package name */
    public final a1 f4759l;

    /* renamed from: m, reason: collision with root package name */
    public final E3.a f4760m = AbstractC0613Id.f9539a.d(new l(0, this));

    /* renamed from: n, reason: collision with root package name */
    public final Context f4761n;

    /* renamed from: o, reason: collision with root package name */
    public final C0.c f4762o;

    /* renamed from: p, reason: collision with root package name */
    public WebView f4763p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0392x f4764q;

    /* renamed from: r, reason: collision with root package name */
    public Q4 f4765r;

    /* renamed from: s, reason: collision with root package name */
    public AsyncTask f4766s;

    public n(Context context, a1 a1Var, String str, U2.a aVar) {
        this.f4761n = context;
        this.f4758k = aVar;
        this.f4759l = a1Var;
        this.f4763p = new WebView(context);
        this.f4762o = new C0.c(context, str);
        u3(0);
        this.f4763p.setVerticalScrollBarEnabled(false);
        this.f4763p.getSettings().setJavaScriptEnabled(true);
        this.f4763p.setWebViewClient(new j(0, this));
        this.f4763p.setOnTouchListener(new k(0, this));
    }

    @Override // Q2.K
    public final String A() {
        return null;
    }

    @Override // Q2.K
    public final void D() {
        v.c("resume must be called on the main UI thread.");
    }

    @Override // Q2.K
    public final void F1(V0 v02) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final void G() {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final void H2(InterfaceC0386u interfaceC0386u) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final void K1(d1 d1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final void N0(N7 n7) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final void O0(InterfaceC0392x interfaceC0392x) {
        this.f4764q = interfaceC0392x;
    }

    @Override // Q2.K
    public final void P() {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final void P0(U u5) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final void P2(InterfaceC1101i6 interfaceC1101i6) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final void R() {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final boolean S2() {
        return false;
    }

    @Override // Q2.K
    public final void U1(boolean z3) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final boolean X() {
        return false;
    }

    @Override // Q2.K
    public final void Z() {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final void b3(C1832yc c1832yc) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final void c0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final void d0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final InterfaceC0392x e() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // Q2.K
    public final void e0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final a1 f() {
        return this.f4759l;
    }

    @Override // Q2.K
    public final Q h() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // Q2.K
    public final void h3(Q q5) {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final Bundle j() {
        throw new IllegalStateException("Unused method");
    }

    @Override // Q2.K
    public final void j1() {
        v.c("pause must be called on the main UI thread.");
    }

    @Override // Q2.K
    public final InterfaceC0383s0 k() {
        return null;
    }

    @Override // Q2.K
    public final InterfaceC2360a m() {
        v.c("getAdFrame must be called on the main UI thread.");
        return new BinderC2361b(this.f4763p);
    }

    @Override // Q2.K
    public final InterfaceC0391w0 o() {
        return null;
    }

    @Override // Q2.K
    public final boolean o2() {
        return false;
    }

    public final String s() {
        String str = (String) this.f4762o.f;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        return L1.a.n("https://", str, (String) V7.f11869d.s());
    }

    @Override // Q2.K
    public final String t() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // Q2.K
    public final void u1() {
        throw new IllegalStateException("Unused method");
    }

    public final void u3(int i) {
        if (this.f4763p == null) {
            return;
        }
        this.f4763p.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // Q2.K
    public final void v() {
        v.c("destroy must be called on the main UI thread.");
        this.f4766s.cancel(true);
        this.f4760m.cancel(false);
        this.f4763p.destroy();
        this.f4763p = null;
    }

    @Override // Q2.K
    public final boolean v0(X0 x02) {
        TreeMap treeMap;
        v.f("This Search Ad has already been torn down", this.f4763p);
        C0.c cVar = this.f4762o;
        cVar.getClass();
        cVar.f814e = x02.f4966t.f4941k;
        Bundle bundle = x02.f4969w;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) V7.f11868c.s();
            Iterator<String> it = bundle2.keySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                treeMap = (TreeMap) cVar.f813d;
                if (!hasNext) {
                    break;
                }
                String next = it.next();
                if (str.equals(next)) {
                    cVar.f = bundle2.getString(next);
                } else if (next.startsWith("csa_")) {
                    treeMap.put(next.substring(4), bundle2.getString(next));
                }
            }
            treeMap.put("SDKVersion", this.f4758k.f5852k);
            if (((Boolean) V7.f11866a.s()).booleanValue()) {
                Bundle Q5 = G4.l.Q((Context) cVar.f811b, (String) V7.f11867b.s());
                for (String str2 : Q5.keySet()) {
                    treeMap.put(str2, Q5.get(str2).toString());
                }
            }
        }
        this.f4766s = new m(this).execute(new Void[0]);
        return true;
    }

    @Override // Q2.K
    public final String w() {
        return null;
    }

    @Override // Q2.K
    public final void w0(a1 a1Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // Q2.K
    public final void G1(InterfaceC0374n0 interfaceC0374n0) {
    }

    @Override // Q2.K
    public final void X0(W w5) {
    }

    @Override // Q2.K
    public final void m3(boolean z3) {
    }

    @Override // Q2.K
    public final void n3(InterfaceC2360a interfaceC2360a) {
    }

    @Override // Q2.K
    public final void b2(X0 x02, A a5) {
    }
}
