package a3;

import A0.J0;
import Q2.C0375o;
import Q2.X0;
import Q2.a1;
import a.AbstractC0444a;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.AbstractBinderC1518rd;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC0834c8;
import com.google.android.gms.internal.ads.AbstractC0952et;
import com.google.android.gms.internal.ads.AbstractC1044gv;
import com.google.android.gms.internal.ads.AbstractC1281m8;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.AbstractC1668us;
import com.google.android.gms.internal.ads.Aw;
import com.google.android.gms.internal.ads.C0554Af;
import com.google.android.gms.internal.ads.C0606Hd;
import com.google.android.gms.internal.ads.C0643Mf;
import com.google.android.gms.internal.ads.C0681Sb;
import com.google.android.gms.internal.ads.C0723Yb;
import com.google.android.gms.internal.ads.C0995fr;
import com.google.android.gms.internal.ads.C1041gs;
import com.google.android.gms.internal.ads.C1537rw;
import com.google.android.gms.internal.ads.C1582sw;
import com.google.android.gms.internal.ads.C1616tl;
import com.google.android.gms.internal.ads.C1743wd;
import com.google.android.gms.internal.ads.D7;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Gh;
import com.google.android.gms.internal.ads.Hw;
import com.google.android.gms.internal.ads.InterfaceC0695Ub;
import com.google.android.gms.internal.ads.InterfaceC1311mu;
import com.google.android.gms.internal.ads.InterfaceC1429pd;
import com.google.android.gms.internal.ads.InterfaceC1897zw;
import com.google.android.gms.internal.ads.Jr;
import com.google.android.gms.internal.ads.Kk;
import com.google.android.gms.internal.ads.Kw;
import com.google.android.gms.internal.ads.Lw;
import com.google.android.gms.internal.ads.Mr;
import com.google.android.gms.internal.ads.Mw;
import com.google.android.gms.internal.ads.Nr;
import com.google.android.gms.internal.ads.Q4;
import com.google.android.gms.internal.ads.S7;
import com.google.android.gms.internal.ads.Vq;
import com.google.android.gms.internal.ads.Xq;
import e2.C1930k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: a3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0468l extends AbstractBinderC1518rd {

    /* renamed from: R, reason: collision with root package name */
    public static final ArrayList f6549R = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: S, reason: collision with root package name */
    public static final ArrayList f6550S = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: T, reason: collision with root package name */
    public static final ArrayList f6551T = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: U, reason: collision with root package name */
    public static final ArrayList f6552U = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* renamed from: A, reason: collision with root package name */
    public final boolean f6553A;

    /* renamed from: B, reason: collision with root package name */
    public final String f6554B;

    /* renamed from: C, reason: collision with root package name */
    public final String f6555C;

    /* renamed from: D, reason: collision with root package name */
    public final AtomicInteger f6556D;

    /* renamed from: E, reason: collision with root package name */
    public final U2.a f6557E;

    /* renamed from: F, reason: collision with root package name */
    public String f6558F;

    /* renamed from: G, reason: collision with root package name */
    public final String f6559G;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayList f6560H;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f6561I;
    public final ArrayList J;
    public final ArrayList K;

    /* renamed from: L, reason: collision with root package name */
    public final AtomicBoolean f6562L;

    /* renamed from: M, reason: collision with root package name */
    public final AtomicBoolean f6563M;

    /* renamed from: N, reason: collision with root package name */
    public final AtomicInteger f6564N;

    /* renamed from: O, reason: collision with root package name */
    public final S7 f6565O;

    /* renamed from: P, reason: collision with root package name */
    public final F f6566P;

    /* renamed from: Q, reason: collision with root package name */
    public final A f6567Q;

    /* renamed from: l, reason: collision with root package name */
    public final C0554Af f6568l;

    /* renamed from: m, reason: collision with root package name */
    public Context f6569m;

    /* renamed from: n, reason: collision with root package name */
    public final Q4 f6570n;

    /* renamed from: o, reason: collision with root package name */
    public final Xq f6571o;

    /* renamed from: p, reason: collision with root package name */
    public final C0995fr f6572p;

    /* renamed from: q, reason: collision with root package name */
    public final C0606Hd f6573q;

    /* renamed from: r, reason: collision with root package name */
    public final ScheduledExecutorService f6574r;

    /* renamed from: s, reason: collision with root package name */
    public C0723Yb f6575s;

    /* renamed from: t, reason: collision with root package name */
    public Point f6576t;

    /* renamed from: u, reason: collision with root package name */
    public Point f6577u;

    /* renamed from: v, reason: collision with root package name */
    public final C1616tl f6578v;

    /* renamed from: w, reason: collision with root package name */
    public final C1041gs f6579w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f6580x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f6581y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f6582z;

    public BinderC0468l(C0554Af c0554Af, Context context, Q4 q42, C0995fr c0995fr, C0606Hd c0606Hd, ScheduledExecutorService scheduledExecutorService, C1616tl c1616tl, C1041gs c1041gs, U2.a aVar, S7 s7, Xq xq, F f, A a5) {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        ArrayList arrayList;
        this.f6576t = new Point();
        this.f6577u = new Point();
        this.f6556D = new AtomicInteger(0);
        this.f6562L = new AtomicBoolean(false);
        this.f6563M = new AtomicBoolean(false);
        this.f6564N = new AtomicInteger(0);
        this.f6568l = c0554Af;
        this.f6569m = context;
        this.f6570n = q42;
        this.f6571o = xq;
        this.f6572p = c0995fr;
        this.f6573q = c0606Hd;
        this.f6574r = scheduledExecutorService;
        this.f6578v = c1616tl;
        this.f6579w = c1041gs;
        this.f6557E = aVar;
        this.f6565O = s7;
        A7 a7 = F7.O6;
        Q2.r rVar = Q2.r.f5053d;
        this.f6580x = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
        A7 a72 = F7.N6;
        D7 d7 = rVar.f5056c;
        this.f6581y = ((Boolean) d7.a(a72)).booleanValue();
        this.f6582z = ((Boolean) d7.a(F7.Q6)).booleanValue();
        this.f6553A = ((Boolean) d7.a(F7.S6)).booleanValue();
        this.f6554B = (String) d7.a(F7.R6);
        this.f6555C = (String) d7.a(F7.T6);
        this.f6559G = (String) d7.a(F7.U6);
        this.f6566P = f;
        this.f6567Q = a5;
        if (((Boolean) d7.a(F7.V6)).booleanValue()) {
            this.f6560H = C3((String) d7.a(F7.W6));
            this.f6561I = C3((String) d7.a(F7.X6));
            this.J = C3((String) d7.a(F7.Y6));
            arrayList = C3((String) d7.a(F7.Z6));
        } else {
            this.f6560H = f6549R;
            this.f6561I = f6550S;
            this.J = f6551T;
            arrayList = f6552U;
        }
        this.K = arrayList;
    }

    public static boolean A3(Uri uri, ArrayList arrayList, ArrayList arrayList2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (path.contains((String) obj)) {
                    int size2 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        if (host.endsWith((String) obj2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final Uri B3(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
    }

    public static final ArrayList C3(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!AbstractC0952et.u(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static Mr D3(E3.a aVar, C1743wd c1743wd) {
        if (!Nr.a() || !((Boolean) AbstractC0834c8.f12979e.s()).booleanValue()) {
            return null;
        }
        try {
            Mr mr = (Mr) ((C0643Mf) AbstractC1400ot.m0(aVar)).f10660V.d();
            mr.d(new ArrayList(Collections.singletonList(c1743wd.f16118l)));
            X0 x02 = c1743wd.f16120n;
            mr.b(x02 == null ? "" : x02.f4972z);
            mr.f(x02.f4969w);
            return mr;
        } catch (ExecutionException e3) {
            P2.o.f4767B.f4774g.i("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1563sd
    public final void s3(InterfaceC2360a interfaceC2360a, C1743wd c1743wd, InterfaceC1429pd interfaceC1429pd) {
        E3.a aVar;
        E3.a aVar2;
        Bundle bundle = new Bundle();
        A7 a7 = F7.f8805b2;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            bundle.putLong("api-call", c1743wd.f16120n.J);
            AbstractC0467k.C(P2.o.f4767B.f4776j, bundle, "dynamite-enter");
        }
        Context context = (Context) BinderC2361b.t1(interfaceC2360a);
        this.f6569m = context;
        Jr j5 = AbstractC1668us.j(context, 22);
        j5.e();
        A7 a72 = F7.e7;
        D7 d7 = rVar.f5056c;
        int i = 0;
        if (((Boolean) d7.a(a72)).booleanValue() && c1743wd.f16120n.f4959m.getBoolean("optimize_for_app_start", false) && Objects.equals(G4.d.Q(c1743wd.f16120n), "requester_type_8")) {
            i = 2;
            if (c1743wd.f16121o != 2) {
                i = 1;
            }
        }
        int i5 = i;
        if ("UNKNOWN".equals(c1743wd.f16118l)) {
            List arrayList = new ArrayList();
            A7 a73 = F7.d7;
            if (!((String) d7.a(a73)).isEmpty()) {
                arrayList = Arrays.asList(((String) d7.a(a73)).split(","));
            }
            if (arrayList.contains(G4.d.Q(c1743wd.f16120n))) {
                Lw Z4 = AbstractC1400ot.Z(new IllegalArgumentException("Unknown format is no longer supported."));
                aVar = AbstractC1400ot.Z(new IllegalArgumentException("Unknown format is no longer supported."));
                aVar2 = Z4;
                C0375o c0375o = new C0375o(this, aVar2, c1743wd, interfaceC1429pd, j5, 5, false);
                aVar.a(new Kw(0, aVar, c0375o), this.f6568l.a());
            }
        }
        if (((Boolean) d7.a(F7.Ga)).booleanValue()) {
            C0606Hd c0606Hd = AbstractC0613Id.f9539a;
            aVar2 = c0606Hd.d(new CallableC0463g(this, c1743wd, i5, bundle));
            aVar = AbstractC1400ot.j0(aVar2, new C0464h(), c0606Hd);
        } else {
            C0643Mf u32 = u3(this.f6569m, c1743wd.f16117k, c1743wd.f16118l, c1743wd.f16119m, c1743wd.f16120n, i5, c1743wd.f16122p, bundle, c1743wd);
            Mw c02 = AbstractC1400ot.c0(u32);
            aVar = (E3.a) u32.f10661W.d();
            aVar2 = c02;
        }
        C0375o c0375o2 = new C0375o(this, aVar2, c1743wd, interfaceC1429pd, j5, 5, false);
        aVar.a(new Kw(0, aVar, c0375o2), this.f6568l.a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final C0643Mf u3(Context context, String str, String str2, a1 a1Var, X0 x02, int i, String str3, Bundle bundle, C1743wd c1743wd) {
        a1 a1Var2;
        char c5;
        Vq vq = new Vq();
        boolean equals = "REWARDED".equals(str2);
        f2.m mVar = vq.f11955o;
        if (equals) {
            mVar.f17003l = 2;
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            mVar.f17003l = 3;
        }
        C0554Af c0554Af = this.f6568l.f7646b;
        Gh gh = new Gh();
        gh.f9206a = context;
        vq.f11945c = str == null ? "adUnitId" : str;
        vq.f11943a = x02 == null ? new X0(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, 0L) : x02;
        if (a1Var == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            a1Var2 = c5 != 0 ? (c5 == 1 || c5 == 2) ? new a1("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false) : c5 != 3 ? c5 != 4 ? new a1() : a1.a() : a1.b() : new a1(context, J2.i.i);
        } else {
            a1Var2 = a1Var;
        }
        vq.f11944b = a1Var2;
        vq.f11959s = true;
        vq.f11960t = bundle;
        gh.f9207b = vq.a();
        gh.f9211g = i;
        Gh gh2 = new Gh(gh);
        n nVar = new n();
        nVar.f6594a = str2;
        nVar.f6595b = str3;
        nVar.f6596c = c1743wd;
        n nVar2 = new n();
        nVar2.f6594a = nVar.f6594a;
        nVar2.f6595b = nVar.f6595b;
        nVar2.f6596c = nVar.f6596c;
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        return new C0643Mf(c0554Af, nVar2, gh2);
    }

    public final Hw v3(final String str) {
        final Kk[] kkArr = new Kk[1];
        E3.a a5 = this.f6572p.a();
        InterfaceC1897zw interfaceC1897zw = new InterfaceC1897zw() { // from class: a3.c
            @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
            public final E3.a k(Object obj) {
                Kk kk = (Kk) obj;
                BinderC0468l binderC0468l = BinderC0468l.this;
                binderC0468l.getClass();
                kkArr[0] = kk;
                Context context = binderC0468l.f6569m;
                C0723Yb c0723Yb = binderC0468l.f6575s;
                Map map = c0723Yb.f12335l;
                JSONObject k02 = AbstractC0444a.k0(context, map, map, c0723Yb.f12334k, null);
                JSONObject n02 = AbstractC0444a.n0(binderC0468l.f6569m, binderC0468l.f6575s.f12334k);
                JSONObject m02 = AbstractC0444a.m0(binderC0468l.f6575s.f12334k);
                JSONObject l02 = AbstractC0444a.l0(binderC0468l.f6569m, binderC0468l.f6575s.f12334k);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", k02);
                jSONObject.put("ad_view_signal", n02);
                jSONObject.put("scroll_view_signal", m02);
                jSONObject.put("lock_screen_signal", l02);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", AbstractC0444a.j0(null, binderC0468l.f6569m, binderC0468l.f6577u, binderC0468l.f6576t));
                }
                return kk.a(str2, jSONObject);
            }
        };
        C0606Hd c0606Hd = this.f6573q;
        C1537rw j02 = AbstractC1400ot.j0(a5, interfaceC1897zw, c0606Hd);
        j02.a(new D3.h(13, this, kkArr, false), c0606Hd);
        final int i = 0;
        C1582sw h02 = AbstractC1400ot.h0((Hw) AbstractC1400ot.l0(Hw.r(j02), ((Integer) Q2.r.f5053d.f5056c.a(F7.m7)).intValue(), TimeUnit.MILLISECONDS, this.f6574r), new InterfaceC1311mu() { // from class: a3.i
            @Override // com.google.android.gms.internal.ads.InterfaceC1311mu
            public final Object apply(Object obj) {
                switch (i) {
                    case 0:
                        ArrayList arrayList = BinderC0468l.f6549R;
                        return ((JSONObject) obj).optString("nas");
                    default:
                        ArrayList arrayList2 = BinderC0468l.f6549R;
                        U2.j.g("", (Exception) obj);
                        return null;
                }
            }
        }, c0606Hd);
        final int i5 = 1;
        return AbstractC1400ot.U(h02, Exception.class, new InterfaceC1311mu() { // from class: a3.i
            @Override // com.google.android.gms.internal.ads.InterfaceC1311mu
            public final Object apply(Object obj) {
                switch (i5) {
                    case 0:
                        ArrayList arrayList = BinderC0468l.f6549R;
                        return ((JSONObject) obj).optString("nas");
                    default:
                        ArrayList arrayList2 = BinderC0468l.f6549R;
                        U2.j.g("", (Exception) obj);
                        return null;
                }
            }
        }, c0606Hd);
    }

    public final void w3() {
        BinderC0468l binderC0468l;
        E3.a aVar;
        if (((Boolean) AbstractC1281m8.f14476c.s()).booleanValue()) {
            F f = this.f6566P;
            synchronized (f) {
                f.c(true);
                f.c(false);
            }
            return;
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Ga)).booleanValue()) {
            aVar = AbstractC1400ot.f0(new C1930k(20, this), AbstractC0613Id.f9539a);
            binderC0468l = this;
        } else {
            binderC0468l = this;
            aVar = (E3.a) binderC0468l.u3(this.f6569m, null, "BANNER", null, null, 0, null, new Bundle(), null).f10661W.d();
        }
        J0 j02 = new J0(this);
        aVar.a(new Kw(0, aVar, j02), binderC0468l.f6568l.a());
    }

    public final void x3() {
        A7 a7 = F7.g9;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            A7 a72 = F7.j9;
            D7 d7 = rVar.f5056c;
            if (((Boolean) d7.a(a72)).booleanValue()) {
                return;
            }
            if (((Boolean) d7.a(F7.n9)).booleanValue() && this.f6562L.getAndSet(true)) {
                return;
            }
            w3();
        }
    }

    public final void y3(ArrayList arrayList, InterfaceC2360a interfaceC2360a, InterfaceC0695Ub interfaceC0695Ub, boolean z3) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        E3.a aVar;
        Map map;
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.l7)).booleanValue()) {
            U2.j.i("The updating URL feature is not enabled.");
            try {
                C0681Sb c0681Sb = (C0681Sb) interfaceC0695Ub;
                Parcel N5 = c0681Sb.N();
                N5.writeString("The updating URL feature is not enabled.");
                c0681Sb.d1(N5, 2);
                return;
            } catch (RemoteException e3) {
                U2.j.g("", e3);
                return;
            }
        }
        int size = arrayList.size();
        int i = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            arrayList2 = this.f6561I;
            arrayList3 = this.f6560H;
            if (i6 >= size) {
                break;
            }
            Object obj = arrayList.get(i6);
            i6++;
            if (A3((Uri) obj, arrayList3, arrayList2)) {
                i5++;
            }
        }
        if (i5 > 1) {
            U2.j.i("Multiple google urls found: ".concat(String.valueOf(arrayList)));
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            Uri uri = (Uri) obj2;
            if (A3(uri, arrayList3, arrayList2)) {
                CallableC0460d callableC0460d = new CallableC0460d(this, uri, interfaceC2360a, 0);
                C0606Hd c0606Hd = this.f6573q;
                E3.a d5 = c0606Hd.d(callableC0460d);
                C0723Yb c0723Yb = this.f6575s;
                if (c0723Yb == null || (map = c0723Yb.f12335l) == null || map.isEmpty()) {
                    U2.j.h("Asset view map is empty.");
                    aVar = d5;
                } else {
                    aVar = AbstractC1400ot.j0(d5, new C0461e(0, this), c0606Hd);
                }
            } else {
                U2.j.i("Not a Google URL: ".concat(String.valueOf(uri)));
                aVar = AbstractC1400ot.c0(uri);
            }
            arrayList4.add(aVar);
        }
        Aw aw = new Aw(AbstractC1044gv.l(arrayList4), true);
        aw.a(new Kw(0, aw, new C0466j(this, interfaceC0695Ub, z3, 1)), this.f6568l.a());
    }

    public final void z3(ArrayList arrayList, InterfaceC2360a interfaceC2360a, InterfaceC0695Ub interfaceC0695Ub, boolean z3) {
        Map map;
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.l7)).booleanValue()) {
            try {
                C0681Sb c0681Sb = (C0681Sb) interfaceC0695Ub;
                Parcel N5 = c0681Sb.N();
                N5.writeString("The updating URL feature is not enabled.");
                c0681Sb.d1(N5, 2);
                return;
            } catch (RemoteException e3) {
                U2.j.g("", e3);
                return;
            }
        }
        CallableC0460d callableC0460d = new CallableC0460d(this, arrayList, interfaceC2360a, 1);
        C0606Hd c0606Hd = this.f6573q;
        E3.a d5 = c0606Hd.d(callableC0460d);
        C0723Yb c0723Yb = this.f6575s;
        if (c0723Yb == null || (map = c0723Yb.f12335l) == null || map.isEmpty()) {
            U2.j.h("Asset view map is empty.");
        } else {
            d5 = AbstractC1400ot.j0(d5, new C0461e(1, this), c0606Hd);
        }
        d5.a(new Kw(0, d5, new C0466j(this, interfaceC0695Ub, z3, 0)), this.f6568l.a());
    }
}
