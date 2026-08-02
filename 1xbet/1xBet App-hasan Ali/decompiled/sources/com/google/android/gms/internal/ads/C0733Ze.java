package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import game.betting133.sports1xbet.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ze, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733Ze extends FrameLayout implements InterfaceC0677Re {

    /* renamed from: k, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0805bf f12501k;

    /* renamed from: l, reason: collision with root package name */
    public final C1071hd f12502l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f12503m;

    public C0733Ze(ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf) {
        super(viewTreeObserverOnGlobalLayoutListenerC0805bf.getContext());
        this.f12503m = new AtomicBoolean();
        this.f12501k = viewTreeObserverOnGlobalLayoutListenerC0805bf;
        this.f12502l = new C1071hd(viewTreeObserverOnGlobalLayoutListenerC0805bf.f12880k.f14254c, this, this);
        addView(viewTreeObserverOnGlobalLayoutListenerC0805bf);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void A(boolean z3) {
        this.f12501k.A(z3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void A0(String str, U4 u42) {
        this.f12501k.A0(str, u42);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final Z5 B() {
        return this.f12501k.B();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void C0() {
        this.f12501k.f12881k0 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void D0(Z5 z5) {
        this.f12501k.D0(z5);
    }

    @Override // com.google.android.gms.internal.ads.Vi
    public final void E() {
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = this.f12501k;
        if (viewTreeObserverOnGlobalLayoutListenerC0805bf != null) {
            viewTreeObserverOnGlobalLayoutListenerC0805bf.E();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void E0(S2.e eVar, boolean z3, boolean z5, String str) {
        this.f12501k.E0(eVar, z3, z5, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void F() {
        this.f12501k.F();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final boolean F0() {
        return this.f12503m.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final S2.d G() {
        return this.f12501k.G();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final String G0() {
        return this.f12501k.G0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void H0(int i) {
        this.f12501k.H0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final C1028gf I() {
        return this.f12501k.f12894x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void I0(S2.d dVar) {
        this.f12501k.I0(dVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void J(boolean z3) {
        this.f12501k.J(z3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void J0(boolean z3) {
        this.f12501k.J0(z3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final View K() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void K0(C1586t c1586t) {
        this.f12501k.K0(c1586t);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void L(int i, boolean z3, boolean z5) {
        this.f12501k.L(i, z3, z5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final C1586t M() {
        return this.f12501k.M();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void M0(String str, String str2) {
        this.f12501k.M0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void N(int i) {
        this.f12501k.N(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void N0() {
        this.f12501k.N0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void O(ViewTreeObserverOnGlobalLayoutListenerC1840yk viewTreeObserverOnGlobalLayoutListenerC1840yk) {
        this.f12501k.O(viewTreeObserverOnGlobalLayoutListenerC1840yk);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void O0() {
        this.f12501k.O0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final A8 P() {
        return this.f12501k.P();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final ArrayList P0() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f12501k) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void Q0(boolean z3) {
        this.f12501k.Q0(z3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final E3.a R() {
        return this.f12501k.R();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void R0(BinderC0894df binderC0894df) {
        this.f12501k.R0(binderC0894df);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final boolean S() {
        return this.f12501k.S();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void S0(String str, String str2) {
        this.f12501k.S0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void T(boolean z3, int i, String str, boolean z5, boolean z6) {
        this.f12501k.T(z3, i, str, z5, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final C1125in U() {
        return this.f12501k.U();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void U0(C1169jn c1169jn) {
        this.f12501k.U0(c1169jn);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final S2.d V() {
        return this.f12501k.V();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final boolean V0() {
        return this.f12501k.V0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void W(boolean z3) {
        this.f12501k.f12894x.f13609N = z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void X() {
        this.f12501k.X();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final Xq Y() {
        return this.f12501k.f12883m;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final C1169jn Z() {
        return this.f12501k.Z();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0889da
    public final void a(String str, Map map) {
        this.f12501k.a(str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void a0(A8 a8) {
        this.f12501k.a0(a8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final Q4 b0() {
        return this.f12501k.f12882l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final int c() {
        return this.f12501k.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final Context c0() {
        return this.f12501k.f12880k.f14254c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final boolean canGoBack() {
        return this.f12501k.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1113ia
    public final void d(String str) {
        this.f12501k.H(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final Nq d0() {
        return this.f12501k.f12891u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void destroy() {
        C1125in U4;
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = this.f12501k;
        C1169jn Z4 = viewTreeObserverOnGlobalLayoutListenerC0805bf.Z();
        if (Z4 != null) {
            T2.H h3 = T2.L.f5672l;
            h3.post(new K4(17, Z4));
            h3.postDelayed(new RunnableC0726Ye(viewTreeObserverOnGlobalLayoutListenerC0805bf, 0), ((Integer) Q2.r.f5053d.f5056c.a(F7.R4)).intValue());
        } else if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.T4)).booleanValue() || (U4 = viewTreeObserverOnGlobalLayoutListenerC0805bf.U()) == null) {
            viewTreeObserverOnGlobalLayoutListenerC0805bf.destroy();
        } else {
            T2.L.f5672l.post(new Kw(15, this, U4));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final Activity e() {
        return this.f12501k.f12880k.f14252a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void e0() {
        setBackgroundColor(0);
        this.f12501k.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final int f() {
        return ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8731N3)).booleanValue() ? this.f12501k.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void f0(C1125in c1125in) {
        this.f12501k.f0(c1125in);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final int g() {
        return ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8731N3)).booleanValue() ? this.f12501k.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void g0(long j5, boolean z3) {
        this.f12501k.g0(j5, z3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void goBack() {
        this.f12501k.goBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final G.v h() {
        return this.f12501k.f12887q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void h0(Context context) {
        this.f12501k.h0(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void i0(Lq lq, Nq nq) {
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = this.f12501k;
        viewTreeObserverOnGlobalLayoutListenerC0805bf.f12890t = lq;
        viewTreeObserverOnGlobalLayoutListenerC0805bf.f12891u = nq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1113ia
    public final void j(String str, String str2) {
        this.f12501k.j("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0889da
    public final void k(String str, JSONObject jSONObject) {
        this.f12501k.k(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final boolean k0() {
        return this.f12501k.k0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final C1390oj l() {
        return this.f12501k.f12868V;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void loadData(String str, String str2, String str3) {
        this.f12501k.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f12501k.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void loadUrl(String str) {
        this.f12501k.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final U2.a m() {
        return this.f12501k.f12885o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final WebView m0() {
        return this.f12501k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final C1071hd n() {
        return this.f12502l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1113ia
    public final void o(String str, JSONObject jSONObject) {
        this.f12501k.j(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void onPause() {
        AbstractC0690Td abstractC0690Td;
        C1071hd c1071hd = this.f12502l;
        c1071hd.getClass();
        m3.v.c("onPause must be called from the UI thread.");
        C0711Wd c0711Wd = (C0711Wd) c1071hd.f13764o;
        if (c0711Wd != null && (abstractC0690Td = c0711Wd.f12050q) != null) {
            abstractC0690Td.s();
        }
        this.f12501k.onPause();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void onResume() {
        this.f12501k.onResume();
    }

    public final void p() {
        C1071hd c1071hd = this.f12502l;
        c1071hd.getClass();
        m3.v.c("onDestroy must be called from the UI thread.");
        C0711Wd c0711Wd = (C0711Wd) c1071hd.f13764o;
        if (c0711Wd != null) {
            c0711Wd.f12048o.a();
            AbstractC0690Td abstractC0690Td = c0711Wd.f12050q;
            if (abstractC0690Td != null) {
                abstractC0690Td.x();
            }
            c0711Wd.b();
            ((C0733Ze) c1071hd.f13763n).removeView((C0711Wd) c1071hd.f13764o);
            c1071hd.f13764o = null;
        }
        this.f12501k.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void p0(boolean z3) {
        this.f12501k.p0(z3);
    }

    @Override // P2.i
    public final void q() {
        this.f12501k.q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void q0(S2.d dVar) {
        this.f12501k.q0(dVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void r(String str, InterfaceC1821y9 interfaceC1821y9) {
        this.f12501k.r(str, interfaceC1821y9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final boolean r0() {
        return this.f12501k.r0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final BinderC0894df s() {
        return this.f12501k.s();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void s0(String str, InterfaceC1821y9 interfaceC1821y9) {
        this.f12501k.s0(str, interfaceC1821y9);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12501k.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f12501k.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f12501k.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f12501k.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final String t() {
        return this.f12501k.t();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void t0() {
        C1169jn Z4;
        C1125in U4;
        TextView textView = new TextView(getContext());
        P2.o oVar = P2.o.f4767B;
        T2.L l5 = oVar.f4771c;
        Resources b3 = oVar.f4774g.b();
        textView.setText(b3 != null ? b3.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        A7 a7 = F7.T4;
        Q2.r rVar = Q2.r.f5053d;
        boolean booleanValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = this.f12501k;
        if (booleanValue && (U4 = viewTreeObserverOnGlobalLayoutListenerC0805bf.U()) != null) {
            synchronized (U4) {
                C0375o c0375o = U4.f;
                if (c0375o != null) {
                    oVar.f4789w.getClass();
                    Oi.p(new RunnableC1081hn(0, c0375o, textView));
                    return;
                }
                return;
            }
        }
        if (((Boolean) rVar.f5056c.a(F7.S4)).booleanValue() && (Z4 = viewTreeObserverOnGlobalLayoutListenerC0805bf.Z()) != null && ((EnumC1848ys) Z4.f14143b.f12444q) == EnumC1848ys.f16493l) {
            Oi oi = oVar.f4789w;
            C1893zs c1893zs = Z4.f14142a;
            oi.getClass();
            Oi.p(new RunnableC0902dn(c1893zs, textView, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.Vi
    public final void u() {
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = this.f12501k;
        if (viewTreeObserverOnGlobalLayoutListenerC0805bf != null) {
            viewTreeObserverOnGlobalLayoutListenerC0805bf.u();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void u0(String str, AbstractC1744we abstractC1744we) {
        this.f12501k.u0(str, abstractC1744we);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final Lq v() {
        return this.f12501k.f12890t;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void w0(boolean z3, int i, String str, String str2, boolean z5) {
        this.f12501k.w0(z3, i, str, str2, z5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void x(int i) {
        C0711Wd c0711Wd = (C0711Wd) this.f12502l.f13764o;
        if (c0711Wd != null) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.J)).booleanValue()) {
                c0711Wd.f12045l.setBackgroundColor(i);
                c0711Wd.f12046m.setBackgroundColor(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void x0(int i) {
        this.f12501k.x0(i);
    }

    @Override // P2.i
    public final void y() {
        this.f12501k.y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final boolean y0() {
        return this.f12501k.y0();
    }

    @Override // Q2.InterfaceC0347a
    public final void z() {
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = this.f12501k;
        if (viewTreeObserverOnGlobalLayoutListenerC0805bf != null) {
            viewTreeObserverOnGlobalLayoutListenerC0805bf.z();
        }
    }

    @Override // com.google.android.gms.internal.ads.L5
    public final void z0(K5 k5) {
        this.f12501k.z0(k5);
    }
}
