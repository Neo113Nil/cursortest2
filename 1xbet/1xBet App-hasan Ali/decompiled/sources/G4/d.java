package G4;

import A.C0002b;
import A.E;
import A.G;
import A.H;
import A0.C0028g0;
import A0.I0;
import H0.s;
import K0.C0203h;
import K0.C0204i;
import K0.K;
import K0.L;
import K0.N;
import M.AbstractC0251w;
import M.C0249u;
import M.p0;
import M.u0;
import M.v0;
import M.w0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.C0328y0;
import P.InterfaceC0314r0;
import P.e1;
import Q2.M;
import Q2.X0;
import Q2.r;
import R3.q;
import W3.p;
import X3.v;
import X3.w;
import a.AbstractC0444a;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import androidx.lifecycle.InterfaceC0482k;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import b1.C0508i;
import c.InterfaceC0520G;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.C1616tl;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Wq;
import d.C1901a;
import d.C1902b;
import d.C1905e;
import e.C1919b;
import e2.AbstractC1925f;
import g1.C1969c;
import game.betting133.sports1xbet.R;
import h0.C1988b;
import i0.C2003h;
import i4.InterfaceC2015a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.C2023c;
import n.AbstractC2107A;
import o0.AbstractC2194A;
import o0.C2196C;
import o0.C2198b;
import o0.C2200d;
import o0.C2201e;
import o0.C2202f;
import o0.C2204h;
import o0.C2205i;
import o0.C2208l;
import o0.C2209m;
import o0.C2213q;
import o0.y;
import o0.z;
import o1.C2218e;
import p4.C2285z;
import u.C2475w;
import v.AbstractC2527w;
import x.C2592m;
import x0.O;
import z.AbstractC2701c;
import z.AbstractC2706h;
import z.AbstractC2710l;
import z.AbstractC2716r;
import z.C2681E;
import z.C2717s;
import z.InterfaceC2704f;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static C2201e f1991a;

    /* renamed from: b, reason: collision with root package name */
    public static C2201e f1992b;

    /* renamed from: c, reason: collision with root package name */
    public static C2201e f1993c;

    /* renamed from: d, reason: collision with root package name */
    public static C2201e f1994d;

    /* renamed from: e, reason: collision with root package name */
    public static C2201e f1995e;

    public static final V0.j A(L l5, int i) {
        K k5 = l5.f2792a;
        if (k5.f2784a.f2829l.length() != 0) {
            int e3 = l5.e(i);
            if ((i != 0 && e3 == l5.e(i - 1)) || (i != k5.f2784a.f2829l.length() && e3 == l5.e(i + 1))) {
                return l5.a(i);
            }
        }
        return l5.i(i);
    }

    public static final int B(int i, int i5) {
        return (i >> i5) & 31;
    }

    public static final boolean C(long j5) {
        return (j5 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static W3.e D(W3.f fVar, InterfaceC2015a interfaceC2015a) {
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            return new W3.m(interfaceC2015a);
        }
        W3.n nVar = W3.n.f6045a;
        if (ordinal == 1) {
            W3.l lVar = new W3.l();
            lVar.f6040k = interfaceC2015a;
            lVar.f6041l = nVar;
            return lVar;
        }
        if (ordinal != 2) {
            throw new D2.e();
        }
        p pVar = new p();
        pVar.f6047k = interfaceC2015a;
        pVar.f6048l = nVar;
        return pVar;
    }

    public static W3.m E(InterfaceC2015a interfaceC2015a) {
        kotlin.jvm.internal.l.f("initializer", interfaceC2015a);
        return new W3.m(interfaceC2015a);
    }

    public static final float F(float f, float f5, float f6) {
        return (f6 * f5) + ((1 - f6) * f);
    }

    public static final int G(float f, int i, int i5) {
        return i + ((int) Math.round((i5 - i) * f));
    }

    public static final void H(b0.p pVar, C0315s c0315s, int i) {
        b0.p pVar2;
        C0315s c0315s2 = c0315s;
        c0315s2.Z(986742279);
        if (((i | 6) & 3) == 2 && c0315s2.B()) {
            c0315s2.S();
            pVar2 = pVar;
        } else {
            b0.m mVar = b0.m.f7161k;
            b0.p a5 = androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.f6868c, R3.j.a());
            float f = 28;
            b0.p h3 = androidx.compose.foundation.layout.b.h(mVar, f, 0.0f, 2);
            D.d a6 = D.e.a(4);
            kotlin.jvm.internal.l.f("<this>", h3);
            b0.p g5 = androidx.compose.foundation.layout.b.g(androidx.compose.foundation.a.b(AbstractC0444a.n(h3, a6), V3.a.f5990u, a6), f, 32);
            O e3 = AbstractC2710l.e(b0.c.f7141o, false);
            int p5 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l5 = c0315s2.l();
            b0.p c5 = b0.a.c(c0315s2, a5);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s2.b0();
            if (c0315s2.f4530S) {
                c0315s2.k(c2768z);
            } else {
                c0315s2.l0();
            }
            C2751h c2751h = C2752i.f21833e;
            AbstractC0329z.y(c0315s2, c2751h, e3);
            C2751h c2751h2 = C2752i.f21832d;
            AbstractC0329z.y(c0315s2, c2751h2, l5);
            C2751h c2751h3 = C2752i.f;
            if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s2, p5, c2751h3);
            }
            C2751h c2751h4 = C2752i.f21831c;
            AbstractC0329z.y(c0315s2, c2751h4, c5);
            C2717s a7 = AbstractC2716r.a(AbstractC2706h.f21536c, b0.c.f7149w, c0315s2, 54);
            int p6 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l6 = c0315s2.l();
            b0.p c6 = b0.a.c(c0315s2, g5);
            c0315s2.b0();
            if (c0315s2.f4530S) {
                c0315s2.k(c2768z);
            } else {
                c0315s2.l0();
            }
            AbstractC0329z.y(c0315s2, c2751h, a7);
            AbstractC0329z.y(c0315s2, c2751h2, l6);
            if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p6))) {
                AbstractC2107A.y(p6, c0315s2, p6, c2751h3);
            }
            AbstractC0329z.y(c0315s2, c2751h4, c6);
            float f5 = 16;
            D.d a8 = D.e.a(f5);
            long j5 = V3.a.f;
            b0.p f6 = androidx.compose.foundation.layout.c.f(mVar, 64);
            long j6 = V3.a.f5975d;
            p0.a(f6, a8, j5, 0.0f, 0.0f, AbstractC2527w.a(1, i0.p.b(0.5f, j6)), q.f5243a, c0315s, 14156166, 56);
            AbstractC2701c.b(c0315s, androidx.compose.foundation.layout.c.c(mVar, f5));
            c0315s.X(2027420818);
            Object M5 = c0315s.M();
            if (M5 == C0302l.f4480a) {
                M5 = new C0204i(28);
                c0315s.i0(M5);
            }
            c0315s.q(false);
            androidx.compose.ui.viewinterop.a.b((i4.c) M5, androidx.compose.foundation.layout.c.f(mVar, 72), null, c0315s, 54, 4);
            AbstractC2701c.b(c0315s, androidx.compose.foundation.layout.c.c(mVar, 20));
            R3.j.g("OFFLINE", null, j5, j6, null, c0315s, 3462, 18);
            float f7 = 12;
            AbstractC2701c.b(c0315s, androidx.compose.foundation.layout.c.c(mVar, f7));
            R3.j.f(androidx.compose.foundation.layout.b.h(mVar, 40, 0.0f, 2), c0315s, 6, 0);
            AbstractC2701c.b(c0315s, androidx.compose.foundation.layout.c.c(mVar, f7));
            e1 e1Var = w0.f3580a;
            u0.b("Internet connection required", null, ((C0249u) c0315s.j(AbstractC0251w.f3578a)).f3541q, 0L, O0.l.f4030p, 0L, new V0.k(3), 0L, 0, false, 0, 0, ((v0) c0315s.j(e1Var)).f3571h, c0315s, 196614, 0, 64986);
            AbstractC2701c.b(c0315s, androidx.compose.foundation.layout.c.c(mVar, 8));
            u0.b("Please connect to the internet and reopen the app.", null, V3.a.f5987r, 0L, null, 0L, new V0.k(3), 0L, 0, false, 0, 0, ((v0) c0315s.j(e1Var)).f3573k, c0315s, 390, 0, 65018);
            c0315s2 = c0315s;
            c0315s2.q(true);
            c0315s2.q(true);
            pVar2 = mVar;
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new R3.k(pVar2, i, 0);
        }
    }

    public static final void I(H0.n nVar, C2218e c2218e) {
        Object g5 = nVar.k().f2103k.g(s.f);
        if (g5 == null) {
            g5 = null;
        }
        H0.b bVar = (H0.b) g5;
        AccessibilityNodeInfo accessibilityNodeInfo = c2218e.f18616a;
        if (bVar != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bVar.f2064a, bVar.f2065b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object g6 = nVar.k().f2103k.g(s.f2161e);
        if ((g6 != null ? g6 : null) != null) {
            List j5 = H0.n.j(4, nVar);
            int size = j5.size();
            for (int i = 0; i < size; i++) {
                H0.n nVar2 = (H0.n) j5.get(i);
                if (nVar2.k().f2103k.c(s.f2151H)) {
                    arrayList.add(nVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean i5 = i(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i5 ? 1 : arrayList.size(), i5 ? arrayList.size() : 1, false, 0));
    }

    public static final void J(H0.n nVar, C2218e c2218e) {
        Object g5 = nVar.k().f2103k.g(s.f2162g);
        if (g5 == null) {
            g5 = null;
        }
        if (g5 != null) {
            throw new ClassCastException();
        }
        H0.n l5 = nVar.l();
        if (l5 == null) {
            return;
        }
        Object g6 = l5.k().f2103k.g(s.f2161e);
        if (g6 == null) {
            g6 = null;
        }
        if (g6 != null) {
            Object g7 = l5.k().f2103k.g(s.f);
            H0.b bVar = (H0.b) (g7 != null ? g7 : null);
            if (bVar == null || (bVar.f2064a >= 0 && bVar.f2065b >= 0)) {
                if (nVar.k().f2103k.c(s.f2151H)) {
                    ArrayList arrayList = new ArrayList();
                    List j5 = H0.n.j(4, l5);
                    int size = j5.size();
                    int i = 0;
                    for (int i5 = 0; i5 < size; i5++) {
                        H0.n nVar2 = (H0.n) j5.get(i5);
                        if (nVar2.k().f2103k.c(s.f2151H)) {
                            arrayList.add(nVar2);
                            if (nVar2.f2113c.v() < nVar.f2113c.v()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean i6 = i(arrayList);
                    int i7 = i6 ? 0 : i;
                    int i8 = i6 ? i : 0;
                    Object g8 = nVar.k().f2103k.g(s.f2151H);
                    if (g8 == null) {
                        g8 = Boolean.FALSE;
                    }
                    c2218e.f18616a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, 1, i8, 1, false, ((Boolean) g8).booleanValue()));
                }
            }
        }
    }

    public static void K(Window window, boolean z3) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            D0.d.f(window, z3);
        } else {
            if (i >= 30) {
                D0.d.e(window, z3);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final List L(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(X3.m.Y(arrayList)) : v.f6090k;
    }

    public static final Map M(Map map) {
        int size = map.size();
        if (size == 0) {
            return w.f6091k;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) X3.m.X(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final S N(kotlin.jvm.internal.e eVar, Y y5, U u5, D1.b bVar, C0315s c0315s) {
        W e3;
        if (u5 != null) {
            X f = y5.f();
            kotlin.jvm.internal.l.f("store", f);
            kotlin.jvm.internal.l.f("extras", bVar);
            e3 = new W(f, u5, bVar);
        } else if (y5 instanceof InterfaceC0482k) {
            X f5 = y5.f();
            U d5 = ((InterfaceC0482k) y5).d();
            kotlin.jvm.internal.l.f("store", f5);
            kotlin.jvm.internal.l.f("factory", d5);
            kotlin.jvm.internal.l.f("extras", bVar);
            e3 = new W(f5, d5, bVar);
        } else {
            e3 = Q1.j.e(y5, null, 6);
        }
        return e3.a(eVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int O(Bundle bundle) {
        char c5;
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (!TextUtils.isEmpty(string)) {
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        c5 = 7;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        c5 = '\b';
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                    return 1;
                case 1:
                    return 3;
                case 2:
                    return 4;
                case 3:
                    return 5;
                case 4:
                    return 6;
                case 5:
                    return 7;
                case 6:
                    return 8;
                case 7:
                    return 9;
                case '\b':
                    return 10;
            }
        }
        return 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String P(String str) {
        char c5;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c5 = 6;
                    break;
                }
                c5 = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c5 = 7;
                    break;
                }
                c5 = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c5 = '\b';
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        switch (c5) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    public static String Q(X0 x02) {
        Bundle bundle;
        return (x02 == null || (bundle = x02.f4959m) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void R(C1616tl c1616tl, String str, Pair... pairArr) {
        if (((Boolean) r.f5053d.f5056c.a(F7.A6)).booleanValue()) {
            AbstractC0613Id.f9539a.execute(new S2.q(c1616tl, str, pairArr, 3));
        }
    }

    public static int S(Wq wq) {
        if (wq.f12110r) {
            return 2;
        }
        X0 x02 = wq.f12098d;
        M m5 = x02.f4950C;
        String str = x02.f4955H;
        if (m5 == null && str == null) {
            return 1;
        }
        if (m5 == null || str == null) {
            return m5 != null ? 3 : 4;
        }
        return 5;
    }

    public static final void a(boolean z3, InterfaceC2015a interfaceC2015a, C0315s c0315s, int i) {
        c0315s.Z(-361453782);
        int i5 = i | 6 | (c0315s.h(interfaceC2015a) ? 32 : 16);
        if (c0315s.P(i5 & 1, (i5 & 19) != 18)) {
            Object a5 = J1.a.a(c0315s);
            if (a5 == null) {
                c0315s.X(535274673);
                a5 = d.j.a(c0315s);
            } else {
                c0315s.X(535271790);
            }
            c0315s.q(false);
            if (a5 == null) {
                throw new IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            boolean f = c0315s.f(a5);
            Object M5 = c0315s.M();
            Object obj = C0302l.f4480a;
            if (f || M5 == obj) {
                I1.c cVar = a5 instanceof I1.c ? (I1.c) a5 : null;
                m2.g c5 = cVar != null ? cVar.c() : null;
                InterfaceC0520G interfaceC0520G = a5 instanceof InterfaceC0520G ? (InterfaceC0520G) a5 : null;
                M5 = new C1919b(c5, interfaceC0520G != null ? interfaceC0520G.a() : null);
                c0315s.i0(M5);
            }
            Object obj2 = (C1919b) M5;
            long j5 = c0315s.f4531T;
            boolean f5 = c0315s.f(obj2) | c0315s.e(j5);
            Object M6 = c0315s.M();
            Object obj3 = M6;
            if (f5 || M6 == obj) {
                C1905e c1905e = new C1905e(new C1901a(a5, j5));
                c1905e.f16812c = new B1.h(13);
                c0315s.i0(c1905e);
                obj3 = c1905e;
            }
            C1905e c1905e2 = (C1905e) obj3;
            c0315s.X(-585307852);
            boolean h3 = c0315s.h(c1905e2) | ((i5 & 112) == 32);
            Object M7 = c0315s.M();
            if (h3 || M7 == obj) {
                M7 = new C0328y0(5, c1905e2, interfaceC2015a);
                c0315s.i0(M7);
            }
            AbstractC0329z.g((InterfaceC2015a) M7, c0315s);
            boolean h4 = c0315s.h(c1905e2);
            Object M8 = c0315s.M();
            if (h4 || M8 == obj) {
                M8 = new O0.e(13, c1905e2);
                c0315s.i0(M8);
            }
            l.c(true, c1905e2, null, (i4.c) M8, c0315s, 6);
            boolean h5 = c0315s.h(obj2) | c0315s.h(c1905e2);
            Object M9 = c0315s.M();
            if (h5 || M9 == obj) {
                M9 = new O3.f(8, obj2, c1905e2);
                c0315s.i0(M9);
            }
            AbstractC0329z.d(obj2, c1905e2, (i4.c) M9, c0315s);
            c0315s.q(false);
            z3 = true;
        } else {
            c0315s.S();
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C1902b(z3, interfaceC2015a, i, 0);
        }
    }

    public static final long b(float f, float f5) {
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void c(b0.p pVar, E e3, C2681E c2681e, InterfaceC2704f interfaceC2704f, b0.f fVar, C2592m c2592m, boolean z3, i4.c cVar, C0315s c0315s, int i) {
        int i5;
        b0.f fVar2;
        boolean z5;
        E e5;
        int i6;
        C2592m c2592m2;
        E e6;
        C2592m c2592m3;
        boolean z6;
        b0.f fVar3;
        c0315s.Z(-740714857);
        if ((i & 6) == 0) {
            i5 = i | (c0315s.f(pVar) ? 4 : 2);
        } else {
            i5 = i;
        }
        int i7 = i5 | 13306896 | (c0315s.h(cVar) ? 67108864 : 33554432);
        if ((38347923 & i7) == 38347922 && c0315s.B()) {
            c0315s.S();
            e6 = e3;
            fVar3 = fVar;
            c2592m3 = c2592m;
            z6 = z3;
        } else {
            c0315s.U();
            if ((i & 1) == 0 || c0315s.z()) {
                Object obj = C0302l.f4480a;
                float f = H.f29a;
                Object[] objArr = new Object[0];
                v3.g gVar = E.f8w;
                boolean d5 = c0315s.d(0) | c0315s.d(0);
                Object M5 = c0315s.M();
                if (d5 || M5 == obj) {
                    M5 = new G(0);
                    c0315s.i0(M5);
                }
                E e7 = (E) Y.k.b(objArr, gVar, (InterfaceC2015a) M5, c0315s, 0, 4);
                b0.f fVar4 = b0.c.f7148v;
                float f5 = t.M.f19352a;
                W0.c cVar2 = (W0.c) c0315s.j(I0.f287h);
                boolean c5 = c0315s.c(cVar2.c());
                Object M6 = c0315s.M();
                if (c5 || M6 == obj) {
                    M6 = new C2475w(new C2023c(cVar2));
                    c0315s.i0(M6);
                }
                C2475w c2475w = (C2475w) M6;
                boolean f6 = c0315s.f(c2475w);
                Object M7 = c0315s.M();
                if (f6 || M7 == obj) {
                    M7 = new C2592m(c2475w);
                    c0315s.i0(M7);
                }
                fVar2 = fVar4;
                z5 = true;
                e5 = e7;
                i6 = i7 & (-3670129);
                c2592m2 = (C2592m) M7;
            } else {
                c0315s.S();
                i6 = i7 & (-3670129);
                e5 = e3;
                fVar2 = fVar;
                c2592m2 = c2592m;
                z5 = z3;
            }
            c0315s.r();
            l.b(pVar, e5, c2681e, c2592m2, z5, fVar2, interfaceC2704f, cVar, c0315s, (i6 & 14) | 907570560, (i6 >> 18) & 896);
            e6 = e5;
            c2592m3 = c2592m2;
            z6 = z5;
            fVar3 = fVar2;
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0002b(pVar, e6, c2681e, interfaceC2704f, fVar3, c2592m3, z6, cVar, i);
        }
    }

    public static final long d(float f, float f5) {
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final Object[] e(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        X3.l.y0(0, i, 6, objArr, objArr2);
        X3.l.t0(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] f(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        X3.l.y0(0, i, 6, objArr, objArr2);
        X3.l.t0(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] g(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        X3.l.y0(0, i, 6, objArr, objArr2);
        X3.l.t0(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static b1.k h(C2285z c2285z) {
        C0508i c0508i = new C0508i();
        c0508i.f7209c = new b1.l();
        b1.k kVar = new b1.k(c0508i);
        c0508i.f7208b = kVar;
        c0508i.f7207a = L1.a.class;
        try {
            c2285z.p(new C0028g0(17, c0508i, c2285z));
            c0508i.f7207a = "Deferred.asListenableFuture";
            return kVar;
        } catch (Exception e3) {
            kVar.f7213l.i(e3);
            return kVar;
        }
    }

    public static final boolean i(ArrayList arrayList) {
        List list;
        long j5;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = v.f6090k;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int N5 = X3.n.N(arrayList);
                int i = 0;
                while (i < N5) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    H0.n nVar = (H0.n) obj2;
                    H0.n nVar2 = (H0.n) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (nVar2.g().a() >> 32)) - Float.intBitsToFloat((int) (nVar.g().a() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (nVar2.g().a() & 4294967295L)) - Float.intBitsToFloat((int) (nVar.g().a() & 4294967295L)));
                    arrayList2.add(new C1988b((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j5 = ((C1988b) X3.m.Y(list)).f17191a;
            } else {
                if (list.isEmpty()) {
                    Y0.a.b("Empty collection can't be reduced.");
                }
                Object Y4 = X3.m.Y(list);
                int N6 = X3.n.N(list);
                if (1 <= N6) {
                    int i5 = 1;
                    while (true) {
                        Y4 = new C1988b(C1988b.h(((C1988b) Y4).f17191a, ((C1988b) list.get(i5)).f17191a));
                        if (i5 == N6) {
                            break;
                        }
                        i5++;
                    }
                }
                j5 = ((C1988b) Y4).f17191a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j5)) >= Float.intBitsToFloat((int) (j5 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static boolean j(C1969c[] c1969cArr, C1969c[] c1969cArr2) {
        if (c1969cArr == null || c1969cArr2 == null || c1969cArr.length != c1969cArr2.length) {
            return false;
        }
        for (int i = 0; i < c1969cArr.length; i++) {
            C1969c c1969c = c1969cArr[i];
            char c5 = c1969c.f17077a;
            C1969c c1969c2 = c1969cArr2[i];
            if (c5 != c1969c2.f17077a || c1969c.f17078b.length != c1969c2.f17078b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] k(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static Handler l(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d1.i.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e5) {
            e = e5;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e6) {
            e = e6;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final O0.f m(Context context) {
        j3.i iVar = new j3.i(23);
        context.getApplicationContext();
        return new O0.f(iVar, new O0.a(Build.VERSION.SDK_INT >= 31 ? O0.m.f4034a.a(context) : 0));
    }

    public static final void n(C2198b c2198b, y yVar) {
        int size = yVar.f18602l.size();
        for (int i = 0; i < size; i++) {
            AbstractC2194A abstractC2194A = (AbstractC2194A) yVar.f18602l.get(i);
            if (abstractC2194A instanceof C2196C) {
                C2204h c2204h = new C2204h();
                C2196C c2196c = (C2196C) abstractC2194A;
                c2204h.f18553c = c2196c.f18509k;
                c2204h.f18555e = true;
                c2204h.c();
                C2003h c2003h = c2204h.f18557h;
                c2003h.getClass();
                c2003h.f17279a.setFillType(Path.FillType.WINDING);
                c2204h.c();
                c2204h.c();
                c2204h.f18552b = c2196c.f18510l;
                c2204h.c();
                c2204h.c();
                c2204h.c();
                c2204h.c();
                c2204h.c();
                c2204h.c();
                c2204h.c();
                c2204h.c();
                c2204h.f = true;
                c2204h.c();
                c2204h.f18554d = 1.0f;
                c2204h.f = true;
                c2204h.c();
                c2204h.f = true;
                c2204h.c();
                c2198b.e(i, c2204h);
            } else if (abstractC2194A instanceof y) {
                C2198b c2198b2 = new C2198b();
                y yVar2 = (y) abstractC2194A;
                yVar2.getClass();
                c2198b2.f18523k = "";
                c2198b2.c();
                c2198b2.f18526n = true;
                c2198b2.c();
                c2198b2.f18524l = 1.0f;
                c2198b2.f18526n = true;
                c2198b2.c();
                c2198b2.f18525m = 1.0f;
                c2198b2.f18526n = true;
                c2198b2.c();
                c2198b2.f18526n = true;
                c2198b2.c();
                c2198b2.f18526n = true;
                c2198b2.c();
                c2198b2.f18526n = true;
                c2198b2.c();
                c2198b2.f18526n = true;
                c2198b2.c();
                c2198b2.f = yVar2.f18601k;
                c2198b2.f18520g = true;
                c2198b2.c();
                n(c2198b2, yVar2);
                c2198b.e(i, c2198b2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1969c[] o(String str) {
        int i;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (i7 < str.length()) {
            while (i7 < str.length()) {
                char charAt = str.charAt(i7);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i7++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i6, i7).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i5) == 'z' || trim.charAt(i5) == 'Z') {
                            fArr = new float[i5];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i8 = i5;
                                int i9 = 1;
                                while (i9 < length) {
                                    int i10 = i5;
                                    int i11 = i10;
                                    int i12 = i11;
                                    int i13 = i12;
                                    for (int i14 = i9; i14 < trim.length(); i14++) {
                                        char charAt2 = trim.charAt(i14);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i14 != i9 && i10 == 0) {
                                                            i10 = 0;
                                                            i12 = 1;
                                                            i13 = 1;
                                                            break;
                                                        }
                                                        i10 = 0;
                                                        break;
                                                    case '.':
                                                        if (i11 == 0) {
                                                            i10 = 0;
                                                            i11 = 1;
                                                            break;
                                                        }
                                                        i10 = 0;
                                                        i12 = 1;
                                                        i13 = 1;
                                                        break;
                                                    default:
                                                        i10 = 0;
                                                        break;
                                                }
                                            } else {
                                                i10 = 1;
                                            }
                                            if (i12 == 0) {
                                                if (i9 < i14) {
                                                    fArr2[i8] = Float.parseFloat(trim.substring(i9, i14));
                                                    i8++;
                                                }
                                                i9 = i13 == 0 ? i14 : i14 + 1;
                                                i5 = 0;
                                            }
                                        }
                                        i10 = 0;
                                        i12 = 1;
                                        if (i12 == 0) {
                                        }
                                    }
                                    if (i9 < i14) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    i5 = 0;
                                }
                                fArr = k(fArr2, i8);
                                i5 = 0;
                            } catch (NumberFormatException e3) {
                                throw new RuntimeException(L1.a.n("error in parsing \"", trim, "\""), e3);
                            }
                        }
                        arrayList.add(new C1969c(trim.charAt(i5), fArr));
                    }
                    i6 = i7;
                    i7++;
                    i5 = 0;
                }
                i7++;
            }
            trim = str.substring(i6, i7).trim();
            if (!trim.isEmpty()) {
            }
            i6 = i7;
            i7++;
            i5 = 0;
        }
        if (i7 - i6 != 1 || i6 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new C1969c(str.charAt(i6), new float[0]));
        }
        return (C1969c[]) arrayList.toArray(new C1969c[i]);
    }

    public static C1969c[] p(C1969c[] c1969cArr) {
        C1969c[] c1969cArr2 = new C1969c[c1969cArr.length];
        for (int i = 0; i < c1969cArr.length; i++) {
            c1969cArr2[i] = new C1969c(c1969cArr[i]);
        }
        return c1969cArr2;
    }

    public static final float q(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f5 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f5 - ((f5 - (f / (f5 * f5))) * 0.33333334f);
    }

    public static InvocationHandler r() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = AbstractC1925f.b();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException(e5);
            } catch (InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static final C2201e s() {
        C2201e c2201e = f1992b;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.ChevronRight", false);
        int i = z.f18603a;
        i0.M m5 = new i0.M(i0.p.f17289b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C2209m(10.0f, 6.0f));
        arrayList.add(new C2208l(8.59f, 7.41f));
        arrayList.add(new C2208l(13.17f, 12.0f));
        arrayList.add(new C2213q(-4.58f, 4.59f));
        arrayList.add(new C2208l(10.0f, 18.0f));
        arrayList.add(new C2213q(6.0f, -6.0f));
        arrayList.add(C2205i.f18558b);
        C2200d.a(c2200d, arrayList, m5);
        C2201e b3 = c2200d.b();
        f1992b = b3;
        return b3;
    }

    public static int t(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static final C2201e u() {
        C2201e c2201e = f1993c;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.Groups", false);
        int i = z.f18603a;
        i0.M m5 = new i0.M(i0.p.f17289b);
        C2202f c2202f = new C2202f(0);
        c2202f.m(12.0f, 12.75f);
        c2202f.g(1.63f, 0.0f, 3.07f, 0.39f, 4.24f, 0.9f);
        c2202f.g(1.08f, 0.48f, 1.76f, 1.56f, 1.76f, 2.73f);
        c2202f.k(18.0f, 18.0f);
        c2202f.i(6.0f);
        c2202f.l(0.0f, -1.61f);
        c2202f.g(0.0f, -1.18f, 0.68f, -2.26f, 1.76f, -2.73f);
        c2202f.f(8.93f, 13.14f, 10.37f, 12.75f, 12.0f, 12.75f);
        c2202f.e();
        c2202f.m(4.0f, 13.0f);
        c2202f.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c2202f.g(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        c2202f.o(-2.0f, 0.9f, -2.0f, 2.0f);
        c2202f.f(2.0f, 12.1f, 2.9f, 13.0f, 4.0f, 13.0f);
        c2202f.e();
        c2202f.m(5.13f, 14.1f);
        c2202f.f(4.76f, 14.04f, 4.39f, 14.0f, 4.0f, 14.0f);
        c2202f.g(-0.99f, 0.0f, -1.93f, 0.21f, -2.78f, 0.58f);
        c2202f.f(0.48f, 14.9f, 0.0f, 15.62f, 0.0f, 16.43f);
        c2202f.q(18.0f);
        c2202f.l(4.5f, 0.0f);
        c2202f.r(-1.61f);
        c2202f.f(4.5f, 15.56f, 4.73f, 14.78f, 5.13f, 14.1f);
        c2202f.e();
        c2202f.m(20.0f, 13.0f);
        c2202f.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c2202f.g(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        c2202f.o(-2.0f, 0.9f, -2.0f, 2.0f);
        c2202f.f(18.0f, 12.1f, 18.9f, 13.0f, 20.0f, 13.0f);
        c2202f.e();
        c2202f.m(24.0f, 16.43f);
        c2202f.g(0.0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f);
        c2202f.f(21.93f, 14.21f, 20.99f, 14.0f, 20.0f, 14.0f);
        c2202f.g(-0.39f, 0.0f, -0.76f, 0.04f, -1.13f, 0.1f);
        c2202f.g(0.4f, 0.68f, 0.63f, 1.46f, 0.63f, 2.29f);
        c2202f.q(18.0f);
        c2202f.l(4.5f, 0.0f);
        c2202f.q(16.43f);
        c2202f.e();
        c2202f.m(12.0f, 6.0f);
        c2202f.g(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        c2202f.g(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        c2202f.o(-3.0f, -1.34f, -3.0f, -3.0f);
        c2202f.f(9.0f, 7.34f, 10.34f, 6.0f, 12.0f, 6.0f);
        c2202f.e();
        C2200d.a(c2200d, c2202f.f18548a, m5);
        C2201e b3 = c2200d.b();
        f1993c = b3;
        return b3;
    }

    public static final ViewParent v(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final C0203h w(P0.w wVar) {
        C0203h c0203h = wVar.f4679a;
        c0203h.getClass();
        long j5 = wVar.f4680b;
        return c0203h.subSequence(N.e(j5), N.d(j5));
    }

    public static final C2201e x() {
        C2201e c2201e = f1995e;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.SportsSoccer", false);
        int i = z.f18603a;
        i0.M m5 = new i0.M(i0.p.f17289b);
        C2202f c2202f = new C2202f(0);
        c2202f.m(12.0f, 2.0f);
        c2202f.f(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        c2202f.g(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        c2202f.o(10.0f, -4.48f, 10.0f, -10.0f);
        c2202f.f(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        c2202f.e();
        c2202f.m(13.0f, 5.3f);
        c2202f.l(1.35f, -0.95f);
        c2202f.g(1.82f, 0.56f, 3.37f, 1.76f, 4.38f, 3.34f);
        c2202f.l(-0.39f, 1.34f);
        c2202f.l(-1.35f, 0.46f);
        c2202f.k(13.0f, 6.7f);
        c2202f.q(5.3f);
        c2202f.e();
        c2202f.m(9.65f, 4.35f);
        c2202f.k(11.0f, 5.3f);
        c2202f.r(1.4f);
        c2202f.k(7.01f, 9.49f);
        c2202f.k(5.66f, 9.03f);
        c2202f.k(5.27f, 7.69f);
        c2202f.f(6.28f, 6.12f, 7.83f, 4.92f, 9.65f, 4.35f);
        c2202f.e();
        c2202f.m(7.08f, 17.11f);
        c2202f.l(-1.14f, 0.1f);
        c2202f.f(4.73f, 15.81f, 4.0f, 13.99f, 4.0f, 12.0f);
        c2202f.g(0.0f, -0.12f, 0.01f, -0.23f, 0.02f, -0.35f);
        c2202f.l(1.0f, -0.73f);
        c2202f.k(6.4f, 11.4f);
        c2202f.l(1.46f, 4.34f);
        c2202f.k(7.08f, 17.11f);
        c2202f.e();
        c2202f.m(14.5f, 19.59f);
        c2202f.f(13.71f, 19.85f, 12.87f, 20.0f, 12.0f, 20.0f);
        c2202f.o(-1.71f, -0.15f, -2.5f, -0.41f);
        c2202f.l(-0.69f, -1.49f);
        c2202f.k(9.45f, 17.0f);
        c2202f.j(5.11f);
        c2202f.l(0.64f, 1.11f);
        c2202f.k(14.5f, 19.59f);
        c2202f.e();
        c2202f.m(14.27f, 15.0f);
        c2202f.i(9.73f);
        c2202f.l(-1.35f, -4.02f);
        c2202f.k(12.0f, 8.44f);
        c2202f.l(3.63f, 2.54f);
        c2202f.k(14.27f, 15.0f);
        c2202f.e();
        c2202f.m(18.06f, 17.21f);
        c2202f.l(-1.14f, -0.1f);
        c2202f.l(-0.79f, -1.37f);
        c2202f.l(1.46f, -4.34f);
        c2202f.l(1.39f, -0.47f);
        c2202f.l(1.0f, 0.73f);
        c2202f.f(19.99f, 11.77f, 20.0f, 11.88f, 20.0f, 12.0f);
        c2202f.f(20.0f, 13.99f, 19.27f, 15.81f, 18.06f, 17.21f);
        c2202f.e();
        C2200d.a(c2200d, c2202f.f18548a, m5);
        C2201e b3 = c2200d.b();
        f1995e = b3;
        return b3;
    }

    public static final C0203h y(P0.w wVar, int i) {
        C0203h c0203h = wVar.f4679a;
        long j5 = wVar.f4680b;
        return c0203h.subSequence(N.d(j5), Math.min(N.d(j5) + i, wVar.f4679a.f2829l.length()));
    }

    public static final C0203h z(P0.w wVar, int i) {
        C0203h c0203h = wVar.f4679a;
        long j5 = wVar.f4680b;
        return c0203h.subSequence(Math.max(0, N.e(j5) - i), N.e(j5));
    }
}
