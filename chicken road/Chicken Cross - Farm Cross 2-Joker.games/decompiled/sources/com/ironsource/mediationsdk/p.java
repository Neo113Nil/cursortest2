package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.AbstractC4455i3;
import com.ironsource.Be;
import com.ironsource.Bf;
import com.ironsource.C4293aa;
import com.ironsource.C4295ac;
import com.ironsource.C4333b7;
import com.ironsource.C4347c3;
import com.ironsource.C4357cd;
import com.ironsource.C4375dd;
import com.ironsource.C4376de;
import com.ironsource.C4407f9;
import com.ironsource.C4411fd;
import com.ironsource.C4412fe;
import com.ironsource.C4443h9;
import com.ironsource.C4457i5;
import com.ironsource.C4469j0;
import com.ironsource.C4482jd;
import com.ironsource.C4491k4;
import com.ironsource.C4505l0;
import com.ironsource.C4515la;
import com.ironsource.C4521lg;
import com.ironsource.C4539mg;
import com.ironsource.C4669u3;
import com.ironsource.C4689v5;
import com.ironsource.C4713wb;
import com.ironsource.Cc;
import com.ironsource.Ce;
import com.ironsource.D9;
import com.ironsource.EnumC4707w5;
import com.ironsource.F9;
import com.ironsource.G8;
import com.ironsource.H1;
import com.ironsource.I9;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4441h7;
import com.ironsource.InterfaceC4673u7;
import com.ironsource.J3;
import com.ironsource.J6;
import com.ironsource.J7;
import com.ironsource.Jb;
import com.ironsource.K1;
import com.ironsource.K3;
import com.ironsource.Kc;
import com.ironsource.L4;
import com.ironsource.Ld;
import com.ironsource.Lf;
import com.ironsource.M4;
import com.ironsource.M5;
import com.ironsource.M7;
import com.ironsource.Mf;
import com.ironsource.Pb;
import com.ironsource.Q6;
import com.ironsource.S2;
import com.ironsource.S3;
import com.ironsource.S9;
import com.ironsource.T4;
import com.ironsource.T9;
import com.ironsource.Te;
import com.ironsource.U7;
import com.ironsource.Ve;
import com.ironsource.Y9;
import com.ironsource.Yb;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.q;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class p implements S9, Kc, L4, L4.b, L4.c, L4.a {
    private static boolean Z = false;
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private Boolean H;
    private Cc I;
    private boolean J;
    private boolean K;
    private boolean L;
    private final ConcurrentHashMap<String, h.d> M;
    private final ConcurrentHashMap<String, h.b> N;
    private final ConcurrentHashMap<String, h.d> O;
    private com.ironsource.mediationsdk.demandOnly.f P;
    private com.ironsource.mediationsdk.demandOnly.k Q;
    private com.ironsource.mediationsdk.demandOnly.c R;
    private M5 S;
    private T9 T;
    private Q6 U;
    private boolean V;
    private AdQualityBridge W;
    U7<ISDemandOnlyInterstitialListener> X;
    U7<ISDemandOnlyRewardedVideoListener> Y;

    /* renamed from: a, reason: collision with root package name */
    private final String f8427a;
    private final String b;
    private final InterfaceC4673u7 c;
    private final InterfaceC4673u7.a d;
    private final J7 e;
    private final InterfaceC4441h7 f;
    private final G8.a g;
    private IronSourceLoggerManager h;
    private C4713wb i;
    private AtomicBoolean j;
    private final Object k;
    private Te l;
    private String m;
    private String n;
    private String o;
    private Map<String, String> p;
    private String q;
    private AtomicBoolean r;
    private boolean s;
    private List<IronSource.a> t;
    private String u;
    private Set<IronSource.a> v;
    private Set<IronSource.a> w;
    private boolean x;
    private C4293aa y;
    private final String z;

    class a extends com.ironsource.environment.thread.a {
        final /* synthetic */ Context b;

        /* renamed from: com.ironsource.mediationsdk.p$a$a, reason: collision with other inner class name */
        class C1334a extends com.ironsource.environment.thread.a {
            final /* synthetic */ Boolean b;
            final /* synthetic */ Boolean c;

            C1334a(Boolean bool, Boolean bool2) {
                this.b = bool;
                this.c = bool2;
            }

            @Override // com.ironsource.environment.thread.a
            public void a() {
                Mf mf = new Mf();
                a aVar = a.this;
                mf.a(aVar.b, p.this.h(), p.this.l.j(), LevelPlay.getSdkVersion(), p.this.l.c().g().b(), this.b, this.c, p.this.J);
                p.this.V = true;
                Lf.f7755a.c();
            }
        }

        a(Context context) {
            this.b = context;
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new C1334a(com.ironsource.mediationsdk.c.d().b(), com.ironsource.mediationsdk.c.d().c()));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8428a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[q.d.values().length];
            b = iArr;
            try {
                iArr[q.d.NOT_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[q.d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[q.d.INIT_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[q.d.INITIATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.a.values().length];
            f8428a = iArr2;
            try {
                iArr2[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8428a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8428a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8428a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface c {
        void a(String str);
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        static volatile p f8429a = new p();

        private d() {
        }
    }

    private p() {
        this(Ib.a0().a(), Ib.R().c(), Ib.a0().w(), Ib.a0().k(), Ib.R().E());
    }

    private boolean A() {
        return z() && B();
    }

    private boolean B() {
        Te te = this.l;
        return (te == null || te.k() == null || this.l.k().c() == null || this.l.k().c().isEmpty()) ? false : true;
    }

    private boolean C() {
        Te te = this.l;
        return (te == null || te.c() == null || this.l.c().f() == null) ? false : true;
    }

    private boolean D() {
        return C() && E();
    }

    private boolean E() {
        Te te = this.l;
        return (te == null || te.k() == null || this.l.k().d() == null || this.l.k().d().size() <= 0) ? false : true;
    }

    private void I() {
        ConcurrentHashMap<String, List<String>> c2 = C4515la.b().c();
        if (c2.containsKey(com.ironsource.mediationsdk.metadata.a.c)) {
            if (TextUtils.isEmpty(c2.get(com.ironsource.mediationsdk.metadata.a.c).get(0))) {
                return;
            }
            T4.f7904a.b(!MetaDataUtils.getMetaDataBooleanValue(r0));
        }
    }

    private void J() {
        if (this.D) {
            K();
        }
    }

    private void K() {
        this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.l.k().a().size(); i++) {
            String str = this.l.k().a().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject a2 = IronSourceUtils.a(false, false, 1);
            a(a2, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(EnumC4707w5.TROUBLESHOOTING_BN_INIT_FAILED, a2);
            a(IronSource.a.BANNER, false);
            return;
        }
        synchronized (this.N) {
            S2 c2 = this.l.c().c();
            M4.a aVar = new M4.a("Mediation");
            if (c2.k()) {
                aVar.a("isOneFlow", 1);
            }
            this.R = new com.ironsource.mediationsdk.demandOnly.c(arrayList, c2, h(), i(), new M4.b(F9.i(), aVar));
        }
        for (h.b bVar : this.N.values()) {
            this.R.a(bVar.g(), bVar.e());
        }
        this.N.clear();
    }

    private void L() {
        this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.l.k().b().size(); i++) {
            String str = this.l.k().b().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject a2 = IronSourceUtils.a(false, false, 1);
            a(a2, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(EnumC4707w5.TROUBLESHOOTING_IS_INIT_FAILED, a2);
            a(IronSource.a.INTERSTITIAL, false);
            return;
        }
        synchronized (this.M) {
            this.P = a((List<NetworkSettings>) arrayList);
        }
        Iterator<h.d> it = this.M.values().iterator();
        while (it.hasNext()) {
            this.P.a(it.next());
        }
        this.M.clear();
    }

    private void M() {
        this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.l.k().d().size(); i++) {
            String str = this.l.k().d().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.O) {
            this.Q = b(arrayList);
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        Iterator<h.d> it = this.O.values().iterator();
        while (it.hasNext()) {
            this.Q.a(it.next());
        }
        this.O.clear();
    }

    private void N() {
        if (this.C) {
            L();
        }
    }

    private void O() {
        if (this.B) {
            M();
        }
    }

    private boolean b(List<IronSource.a> list, boolean z, K3 k3) {
        IronLog.INTERNAL.verbose();
        try {
            this.t = list;
            c(true);
            this.h.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.i("init success");
            if (z) {
                JSONObject b2 = IronSourceUtils.b(false);
                try {
                    b2.put("revived", true);
                } catch (JSONException e) {
                    C4491k4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
                Ib.a0().q().a(new C4689v5(EnumC4707w5.FIRST_INSTANCE_RESULT, b2));
            }
            int b3 = k3.b().f().b();
            if (b3 >= 0) {
                S3 s3 = new S3();
                s3.a(b3);
                s3.a(b3, this.l.l().d());
            }
            F9.i().h();
            C4412fe.i().h();
            Ib.a0().q().h();
            com.ironsource.mediationsdk.c.d().b(h(), i());
            for (IronSource.a aVar : IronSource.a.values()) {
                if (this.v.contains(aVar)) {
                    if (list.contains(aVar)) {
                        b(aVar);
                    } else {
                        a(aVar, false);
                    }
                }
            }
            Cc k = k();
            if (k != null) {
                k.a(this.l);
            }
            return true;
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Cc k2 = k();
            if (k2 != null) {
                k2.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "onInitSuccess() had failed"));
            }
            return false;
        }
    }

    private synchronized void c(boolean z) {
        this.s = z;
    }

    private void d(Context context) {
        AtomicBoolean atomicBoolean = this.j;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        Bf.a().a(new J6(context));
        Ib.a0().q().a(context, this.y);
        F9.i().a(context, this.y);
        C4412fe.i().a(context, this.y);
        C4357cd.P.a(context, this.y);
    }

    public static p g() {
        return d.f8429a;
    }

    private synchronized Cc k() {
        return this.I;
    }

    private void o() {
        this.h = IronSourceLoggerManager.getLogger(0);
        this.i = new C4713wb();
    }

    private boolean p() {
        try {
            IronLog.INTERNAL.verbose("AdQuality SDK exist: " + Class.forName("com.ironsource.adqualitysdk.sdk.IronSourceAdQuality").getName());
            return true;
        } catch (Throwable th) {
            C4491k4.d().a(th);
            IronLog.INTERNAL.verbose("No AdQuality SDK found");
            return false;
        }
    }

    private boolean q() {
        Te te = this.l;
        return (te == null || te.c() == null || this.l.c().b() == null || this.l.c().b().b() == null) ? false : true;
    }

    private boolean r() {
        Te te = this.l;
        return (te == null || te.c() == null || this.l.c().c() == null) ? false : true;
    }

    private boolean s() {
        return r() && t();
    }

    private boolean t() {
        Te te = this.l;
        return (te == null || te.k() == null || this.l.k().a() == null || this.l.k().a().size() <= 0) ? false : true;
    }

    private synchronized boolean v() {
        return this.s;
    }

    private boolean w() {
        Te te = this.l;
        return (te == null || te.c() == null || this.l.c().d() == null) ? false : true;
    }

    private boolean x() {
        return w() && y();
    }

    private boolean y() {
        Te te = this.l;
        return (te == null || te.k() == null || this.l.k().b() == null || this.l.k().b().size() <= 0) ? false : true;
    }

    private boolean z() {
        Te te = this.l;
        return (te == null || te.c() == null || this.l.c().e() == null) ? false : true;
    }

    public boolean F() {
        return v();
    }

    public void G() {
        this.V = false;
    }

    public void H() {
        if (Z) {
            return;
        }
        Z = true;
        JSONObject b2 = IronSourceUtils.b(false);
        try {
            b2.put("status", "false");
            b2.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Ib.a0().q().a(new C4689v5(EnumC4707w5.FIRST_INSTANCE_RESULT, b2));
    }

    public void a(long j, Te.a aVar) {
        JSONObject b2 = IronSourceUtils.b(u());
        try {
            b2.put(IronSourceConstants.EVENTS_DURATION, j);
            b2.put("sessionDepth", this.A);
            b2.put(IronSourceConstants.EVENTS_EXT1, aVar.b());
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Ib.a0().q().a(new C4689v5(EnumC4707w5.INIT_COMPLETE, b2));
    }

    @Override // com.ironsource.L4.a
    public void e(String str) {
        this.h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            com.ironsource.mediationsdk.demandOnly.c cVar = this.R;
            if (cVar != null) {
                cVar.a(str);
            }
        } catch (Throwable th) {
            C4491k4.d().a(th);
            this.h.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    @Override // com.ironsource.S9
    public void f(String str) {
        try {
            String str2 = this.f8427a + ":setMediationType(mediationType:" + str + ")";
            IronSourceLoggerManager ironSourceLoggerManager = this.h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            if (a(str, 1, 64) && k(str)) {
                this.q = str;
                this.T.f(str);
            } else {
                this.h.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
            this.h.logException(IronSourceLogger.IronSourceTag.API, this.f8427a + ":setMediationType(mediationType:" + str + ")", e);
        }
    }

    @Override // com.ironsource.L4.c
    public synchronized boolean h(String str) {
        boolean z;
        com.ironsource.mediationsdk.demandOnly.k kVar = this.Q;
        if (kVar != null) {
            z = kVar.a(str);
        }
        return z;
    }

    public String i() {
        return this.n;
    }

    public String j() {
        return this.q;
    }

    public Map<String, String> l() {
        return this.p;
    }

    public C4293aa m() {
        return this.y;
    }

    public String n() {
        return this.u;
    }

    boolean u() {
        return this.B || this.C || this.D;
    }

    private boolean k(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private J3 l(String str) {
        J3 j3 = new J3();
        if (str == null) {
            j3.a(new IronSourceError(506, "Init Fail - appKey is missing"));
        } else if (!a(str, 5, 10)) {
            j3.a(ErrorBuilder.buildInvalidCredentialsError("appKey", str, "length should be between 5-10 characters"));
        } else if (!k(str)) {
            j3.a(ErrorBuilder.buildInvalidCredentialsError("appKey", str, "should contain only english characters and numbers"));
        }
        return j3;
    }

    public Yb c() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> a2 = a(this.l.k().c());
        if (a2.size() > 0) {
            return new Yb(a2, this.l.c().e(), IronSourceUtils.f(), C4515la.b(), this.y);
        }
        JSONObject a3 = IronSourceUtils.a(false, true, 1);
        a(a3, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        a(EnumC4707w5.TROUBLESHOOTING_NT_INIT_FAILED, a3);
        return null;
    }

    @Override // com.ironsource.Kc
    public void g(String str) {
        try {
            this.h.log(IronSourceLogger.IronSourceTag.API, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.i("Mediation init failed");
            if (this.i != null) {
                Iterator<IronSource.a> it = this.v.iterator();
                while (it.hasNext()) {
                    a(it.next(), true);
                }
            }
            Cc k = k();
            if (k != null) {
                k.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed"));
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public String h() {
        return this.m;
    }

    public C4295ac i(String str) {
        Pb e = this.l.c().e();
        if (e == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return e.e();
        }
        C4295ac a2 = e.a(str);
        return a2 != null ? a2 : e.e();
    }

    public void j(String str) {
        IronLog.API.verbose("userId = " + str);
        this.n = str;
        Ib.a0().q().a(new C4689v5(EnumC4707w5.SET_USER_ID, IronSourceUtils.a(false)));
        AdQualityBridge adQualityBridge = this.W;
        if (adQualityBridge != null) {
            adQualityBridge.changeUserId(str);
        }
    }

    p(InterfaceC4673u7 interfaceC4673u7, InterfaceC4673u7.a aVar, J7 j7, InterfaceC4441h7 interfaceC4441h7, G8.a aVar2) {
        this.f8427a = getClass().getName();
        this.b = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b9.5.0";
        this.k = new Object();
        this.l = null;
        this.m = null;
        this.n = "";
        this.o = null;
        this.p = null;
        this.q = null;
        this.s = false;
        this.x = true;
        this.z = "sessionDepth";
        this.V = false;
        this.c = interfaceC4673u7;
        this.d = aVar;
        this.e = j7;
        this.f = interfaceC4441h7;
        this.g = aVar2;
        o();
        this.j = new AtomicBoolean();
        this.v = new HashSet();
        this.w = new HashSet();
        this.C = false;
        this.B = false;
        this.D = false;
        this.r = new AtomicBoolean(true);
        this.A = 0;
        this.E = false;
        this.F = false;
        this.G = false;
        this.u = IronSourceUtils.d();
        this.H = Boolean.FALSE;
        this.L = false;
        this.I = null;
        this.J = true;
        this.M = new ConcurrentHashMap<>();
        this.O = new ConcurrentHashMap<>();
        this.N = new ConcurrentHashMap<>();
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = new M5();
        T9 t9 = new T9();
        this.T = t9;
        this.U = new Q6(t9);
        this.W = null;
        this.X = new U7.a();
        this.Y = new U7.b();
    }

    @Override // com.ironsource.L4.b
    public synchronized boolean d(String str) {
        boolean z;
        com.ironsource.mediationsdk.demandOnly.f fVar = this.P;
        if (fVar != null) {
            z = fVar.b(str);
        }
        return z;
    }

    private M4 e() {
        return new M4.b(Ib.a0().q(), new M4.a("IronSource"));
    }

    public Te d() {
        return this.l;
    }

    private boolean d(Te te) {
        com.ironsource.mediationsdk.adquality.a a2 = te.c().a();
        return this.W == null && a2 != null && a2.b() && AdQualityBridge.adQualityAvailable();
    }

    public synchronized IronSourceError a(Context context, String str, boolean z, Cc cc, IronSource.a... aVarArr) {
        IronLog.INTERNAL.verbose("GitHash: afa1d92");
        if (!Y9.a((Object) context, "Init Failed - provided context is null")) {
            g("Provided context is null");
            return new IronSourceError(2000, "Provided context is null");
        }
        this.g.a(context);
        boolean z2 = context instanceof Activity;
        if (z2) {
            a((Activity) context);
        }
        AtomicBoolean atomicBoolean = this.r;
        if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
            Ce.f7585a.a(cc == null);
            if ((aVarArr == null || aVarArr.length == 0) && cc == null) {
                for (IronSource.a aVar : IronSource.a.values()) {
                    this.v.add(aVar);
                }
                this.E = true;
                this.F = true;
                this.G = true;
            } else {
                for (IronSource.a aVar2 : aVarArr) {
                    this.v.add(aVar2);
                    this.w.add(aVar2);
                    if (aVar2.equals(IronSource.a.INTERSTITIAL)) {
                        this.F = true;
                    }
                    if (aVar2.equals(IronSource.a.BANNER)) {
                        this.G = true;
                    }
                    if (aVar2.equals(IronSource.a.REWARDED_VIDEO)) {
                        this.E = true;
                    }
                }
            }
            IronLog.API.info("init(appKey:" + str + ")");
            J3 l = l(str);
            if (l.b()) {
                this.m = str;
            }
            Te a2 = a(context, this.m);
            if (a2 != null) {
                IronLog.INTERNAL.verbose("init cache exists");
                a(a2.c().b().f());
            } else {
                IronLog.INTERNAL.verbose("init cache does not exist");
            }
            ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
            this.d.a(context.getApplicationContext(), TimeUnit.HOURS.toMillis(T4.f7904a.d()));
            this.T.g(LevelPlay.getSdkVersion());
            this.T.a(M7.a());
            this.T.a(C4505l0.a());
            I();
            d(context);
            if (this.m == null) {
                q.c().e();
                if (this.v.contains(IronSource.a.REWARDED_VIDEO)) {
                    Ld.a().a(false, (AdInfo) null);
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, l.a().toString(), 1);
                return new IronSourceError(2010, "App key is null");
            }
            this.T.a(context);
            this.T.c(this.m);
            this.T.h(this.u);
            if (this.x) {
                JSONObject b2 = IronSourceUtils.b(z);
                if (aVarArr != null) {
                    for (IronSource.a aVar3 : aVarArr) {
                        try {
                            b2.put(aVar3.toString(), true);
                        } catch (Exception e) {
                            C4491k4.d().a(e);
                        }
                    }
                }
                int i = this.A + 1;
                this.A = i;
                a(z2, z, i, b2, cc != null);
                this.x = false;
            }
            return null;
        }
        if (aVarArr != null) {
            a(z2, z, cc != null, aVarArr);
        } else {
            this.h.log(IronSourceLogger.IronSourceTag.API, "Multiple calls to init without ad units are not allowed", 3);
        }
        Be b3 = Ce.f7585a.b();
        if (v()) {
            a(this.l);
            return new IronSourceError(IronSourceError.ERROR_INIT_ALREADY_FINISHED, "Already finished init");
        }
        if (b3 == Be.INIT_FAILED) {
            return new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed");
        }
        if (b3 != Be.NOT_INIT) {
            if (cc != null) {
                a(cc);
            }
            return new IronSourceError(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, "Old Api init in progress");
        }
        return new IronSourceError(IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, "Already called new init");
    }

    public String f() {
        return this.o;
    }

    @Override // com.ironsource.L4.b
    public void c(String str) {
        this.h.log(IronSourceLogger.IronSourceTag.API, "showDemandOnlyInterstitial() instanceId=" + str, 1);
        ISDemandOnlyInterstitialListener a2 = this.X.a(str);
        try {
            if (!this.C) {
                IronLog.API.error("Interstitial was initialized in mediation mode. Use showInterstitial instead");
                a2.onInterstitialAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial was initialized in mediation mode. Use showInterstitial instead"));
                return;
            }
            com.ironsource.mediationsdk.demandOnly.f fVar = this.P;
            if (fVar == null) {
                IronLog.API.error("Interstitial was not initiated");
                a2.onInterstitialAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial was not initiated"));
            } else {
                fVar.a(str);
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.API.error(e.getMessage());
            if (a2 != null) {
                a2.onInterstitialAdShowFailed(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            }
        }
    }

    public void c(Context context) {
        Lf lf = Lf.f7755a;
        lf.b();
        if (!v()) {
            lf.a(IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED);
            IronLog.API.error("TestSuite cannot be launched, SDK not initialized");
        } else if (!c(this.l)) {
            lf.a(IronSourceConstants.errorCode_TEST_SUITE_DISABLED);
            IronLog.API.error(IronSourceConstants.errorMessage_TEST_SUITE_DISABLED);
        } else if (!IronSourceUtils.f(context)) {
            lf.a(IronSourceConstants.errorCode_TEST_SUITE_NO_NETWORK_CONNECTIVITY);
            IronLog.API.error("TestSuite cannot be launched, No network connectivity");
        } else {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(context));
        }
    }

    private void b(IronSource.a aVar) {
        int i = b.f8428a[aVar.ordinal()];
        if (i == 1) {
            O();
        } else if (i == 2) {
            N();
        } else {
            if (i != 3) {
                return;
            }
            J();
        }
    }

    private boolean c(Te te) {
        return te != null && te.p();
    }

    private com.ironsource.mediationsdk.demandOnly.k b(List<NetworkSettings> list) {
        C4376de f = this.l.c().f();
        M4.a aVar = new M4.a("Mediation");
        if (f.d()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.k(list, f, com.ironsource.mediationsdk.c.d(), this.Y, h(), i(), new M4.b(C4412fe.i(), aVar));
    }

    @Override // com.ironsource.S9
    public boolean b(String str) {
        try {
            J3 j3 = new J3();
            a(str, j3);
            if (j3.b()) {
                this.o = str;
                Ib.a0().q().a(new C4689v5(EnumC4707w5.SET_USER_ID, IronSourceUtils.a(true)));
                return true;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, j3.a().toString(), 2);
            return false;
        } catch (Exception e) {
            C4491k4.d().a(e);
            this.h.logException(IronSourceLogger.IronSourceTag.API, this.f8427a + ":setDynamicUserId(dynamicUserId:" + str + ")", e);
            return false;
        }
    }

    @Override // com.ironsource.L4.c
    public synchronized void b(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.REWARDED_VIDEO).b(), this.Y.a(str));
    }

    @Override // com.ironsource.L4.b
    public synchronized void b(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.INTERSTITIAL).a(true).a(str2).b(), this.X.a(str));
    }

    public o b(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            this.h.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new o(activity, iSBannerSize);
    }

    private boolean b(h.b bVar) {
        synchronized (this.N) {
            if (this.R != null) {
                return false;
            }
            this.N.put(bVar.e(), bVar);
            return true;
        }
    }

    private void a(K1 k1) {
        T4 t4 = T4.f7904a;
        t4.c(k1.h());
        t4.a(k1.g());
        t4.a(k1.k());
        this.f.a(k1);
    }

    public String b() {
        q c2 = q.c();
        int i = b.b[c2.a().ordinal()];
        if (i != 1) {
            return i != 2 ? i != 3 ? (i == 4 && !A()) ? "No Native Ad configurations found" : "" : c2.d() ? "init() had failed" : "init() not finished yet" : "init() had failed";
        }
        return "init() must be called first";
    }

    public synchronized List<IronSource.a> a(Context context, String str, boolean z, IronSource.a... aVarArr) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if ((aVarArr == null || aVarArr.length == 0) && z) {
            if (this.E) {
                a(IronSource.a.REWARDED_VIDEO);
            } else {
                this.B = true;
                arrayList.add(IronSource.a.REWARDED_VIDEO);
            }
            if (this.F) {
                a(IronSource.a.INTERSTITIAL);
            } else {
                this.C = true;
                arrayList.add(IronSource.a.INTERSTITIAL);
            }
            if (this.G) {
                a(IronSource.a.BANNER);
            } else {
                this.D = true;
                arrayList.add(IronSource.a.BANNER);
            }
        } else {
            for (IronSource.a aVar : aVarArr) {
                if (aVar.equals(IronSource.a.INTERSTITIAL)) {
                    if (this.F) {
                        a(aVar);
                    } else {
                        this.C = true;
                        if (!arrayList.contains(aVar)) {
                            arrayList.add(aVar);
                        }
                    }
                }
                if (aVar.equals(IronSource.a.REWARDED_VIDEO)) {
                    if (this.E) {
                        a(aVar);
                    } else {
                        this.B = true;
                        if (!arrayList.contains(aVar)) {
                            arrayList.add(aVar);
                        }
                    }
                }
                if (aVar.equals(IronSource.a.BANNER)) {
                    if (this.G) {
                        a(aVar);
                    } else {
                        this.D = true;
                        if (!arrayList.contains(aVar)) {
                            arrayList.add(aVar);
                        }
                    }
                }
            }
        }
        if (context != null) {
            if (context instanceof Activity) {
                a((Activity) context);
            }
            ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
        }
        return arrayList;
    }

    Te b(Context context, String str, c cVar) {
        synchronized (this.k) {
            Te te = this.l;
            if (te != null) {
                return new Te(te);
            }
            Te a2 = a(context, str, cVar);
            if (a2 == null || !a2.q()) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
                a2 = a(context, h());
                if (a2 != null) {
                    this.h.log(ironSourceTag, ErrorBuilder.buildUsingCachedConfigurationError(h(), str).toString() + ": " + a2.toString(), 1);
                    Ib.a0().q().a(new C4689v5(EnumC4707w5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
                }
            }
            if (a2 != null) {
                this.l = a2;
                IronSourceUtils.e(context, a2.toString());
                b(this.l, context);
                F9.i().c(true);
                C4412fe.i().c(true);
                C4357cd.P.c(true);
                Ib.a0().q().c(true);
            }
            return a2;
        }
    }

    private void a(IronSource.a aVar) {
        String str = aVar + " ad unit has already been initialized";
        this.h.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.i(str);
    }

    private synchronized void a(boolean z, boolean z2, boolean z3, IronSource.a... aVarArr) {
        int i = 0;
        for (IronSource.a aVar : aVarArr) {
            if (aVar.equals(IronSource.a.INTERSTITIAL)) {
                this.F = true;
            } else if (aVar.equals(IronSource.a.BANNER)) {
                this.G = true;
            } else if (aVar.equals(IronSource.a.REWARDED_VIDEO)) {
                this.E = true;
            }
        }
        if (q.c().a() == q.d.INIT_FAILED) {
            try {
                if (this.i != null) {
                    int length = aVarArr.length;
                    while (i < length) {
                        IronSource.a aVar2 = aVarArr[i];
                        if (!this.v.contains(aVar2)) {
                            a(aVar2, true);
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                C4491k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            return;
        }
        if (!v()) {
            JSONObject b2 = IronSourceUtils.b(z2);
            int length2 = aVarArr.length;
            while (i < length2) {
                IronSource.a aVar3 = aVarArr[i];
                if (!this.v.contains(aVar3)) {
                    this.v.add(aVar3);
                    this.w.add(aVar3);
                    try {
                        b2.put(aVar3.toString(), true);
                    } catch (Exception e2) {
                        C4491k4.d().a(e2);
                        IronLog.INTERNAL.error(e2.toString());
                    }
                } else {
                    this.h.log(IronSourceLogger.IronSourceTag.API, aVar3 + " ad unit has started initializing.", 3);
                }
                i++;
            }
            int i2 = this.A + 1;
            this.A = i2;
            a(z, z2, i2, b2, z3);
            return;
        }
        if (this.t == null) {
            return;
        }
        try {
            new Jb().a(this.l.c().b().e().b(), u());
        } catch (Exception e3) {
            C4491k4.d().a(e3);
            IronLog.INTERNAL.error(e3.toString());
        }
        JSONObject b3 = IronSourceUtils.b(z2);
        for (IronSource.a aVar4 : aVarArr) {
            if (!this.v.contains(aVar4)) {
                this.v.add(aVar4);
                this.w.add(aVar4);
                try {
                    b3.put(aVar4.toString(), true);
                } catch (Exception e4) {
                    C4491k4.d().a(e4);
                    IronLog.INTERNAL.error(e4.toString());
                }
                List<IronSource.a> list = this.t;
                if (list != null && list.contains(aVar4)) {
                    b(aVar4);
                } else {
                    a(aVar4, false);
                }
            } else {
                a(aVar4);
            }
        }
        int i3 = this.A + 1;
        this.A = i3;
        a(z, z2, i3, b3, z3);
        return;
    }

    public void b(Te te, Context context) {
        b(te);
        a(te, context);
    }

    private void b(Te te) {
        this.h.setLoggerDebugLevel("console", te.c().b().h().a());
    }

    @Override // com.ironsource.S9
    public String b(Context context) {
        String I = this.c.I(context);
        Ib.a0().q().a(new C4689v5(EnumC4707w5.GET_ADVERTISING_ID, IronSourceUtils.b(false)));
        return !TextUtils.isEmpty(I) ? I : "";
    }

    private void b(EnumC4707w5 enumC4707w5, JSONObject jSONObject) {
        C4412fe.i().a(new C4689v5(enumC4707w5, jSONObject));
    }

    public void b(boolean z) {
        com.ironsource.mediationsdk.c.d().b(z);
        this.T.a(z);
        Ib.a0().q().a(new C4689v5(z ? EnumC4707w5.CONSENT_TRUE_CODE : EnumC4707w5.CONSENT_FALSE_CODE, IronSourceUtils.b(false)));
    }

    public void b(String str, JSONObject jSONObject) {
        com.ironsource.mediationsdk.c.d().b(new t(str, jSONObject));
    }

    @Override // com.ironsource.U8
    public void b(ImpressionDataListener impressionDataListener) {
        if (Y9.a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            C4515la.b().a(impressionDataListener);
            IronLog.API.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    private void a(boolean z, boolean z2, int i, JSONObject jSONObject, boolean z3) {
        try {
            StringBuilder sb = new StringBuilder();
            if (z2) {
                sb.append(String.format(",Activity=%s", Boolean.valueOf(ContextProvider.getInstance().getCurrentActiveActivity() != null)));
            } else if (!z) {
                sb.append(",init_context_flow");
            }
            sb.append(String.format(",cachedUserAgent=%s", Boolean.valueOf(this.c.n())));
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
            jSONObject.put("sessionDepth", i);
            if (z3) {
                if (z2) {
                    jSONObject.put("isMultipleAdObjects", 1);
                } else {
                    jSONObject.put("isMultipleAdUnits", 1);
                }
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Ib.a0().q().a(new C4689v5(EnumC4707w5.FIRST_INSTANCE, jSONObject));
    }

    private synchronized void a(Cc cc) {
        this.I = cc;
    }

    public boolean a(boolean z, Te te) {
        a(te);
        if (v()) {
            return true;
        }
        synchronized (this.k) {
            this.l = te;
        }
        return b(te.h(), z, te.c());
    }

    @Override // com.ironsource.Kc
    public void a(List<IronSource.a> list, boolean z, K3 k3) {
        a(this.l);
        b(list, z, k3);
    }

    private void a(Te te) {
        if (p() && d(te)) {
            AdQualityBridge adQualityBridge = new AdQualityBridge(ContextProvider.getInstance().getApplicationContext(), h(), i(), new C4469j0(), te.c().b().h().a());
            this.W = adQualityBridge;
            C4293aa c4293aa = this.y;
            if (c4293aa != null) {
                adQualityBridge.setSegment(c4293aa);
            }
        }
    }

    private com.ironsource.mediationsdk.demandOnly.f a(List<NetworkSettings> list) {
        D9 d2 = this.l.c().d();
        M4.a aVar = new M4.a("Mediation");
        if (d2.j()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.f(list, d2, com.ironsource.mediationsdk.c.d(), this.X, h(), i(), new M4.b(F9.i(), aVar));
    }

    private List<NetworkSettings> a(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(this.l.l().b(str));
            }
        }
        return arrayList2;
    }

    @Override // com.ironsource.Kc
    public void a() {
        if (this.H.booleanValue()) {
            this.H = Boolean.FALSE;
            l.a().b(IronSource.a.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION, "init() had failed"));
        }
        if (this.L) {
            this.L = false;
            l.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.K) {
            this.K = false;
            l.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.M) {
            Iterator<h.d> it = this.M.values().iterator();
            while (it.hasNext()) {
                String e = it.next().e();
                this.X.a(e).onInterstitialAdLoadFailed(e, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            }
            this.M.clear();
        }
        synchronized (this.O) {
            Iterator<h.d> it2 = this.O.values().iterator();
            while (it2.hasNext()) {
                String e2 = it2.next().e();
                this.Y.a(e2).onRewardedVideoAdLoadFailed(e2, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.O.clear();
        }
        synchronized (this.N) {
            for (h.b bVar : this.N.values()) {
                ISDemandOnlyBannerLayout g = bVar.g();
                if (g != null) {
                    g.getListener().a(bVar.e(), ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
                }
            }
            this.N.clear();
        }
    }

    private void a(IronSource.a aVar, boolean z) {
        int i = b.f8428a[aVar.ordinal()];
        if (i == 1) {
            if (this.B) {
                Iterator<h.d> it = this.O.values().iterator();
                while (it.hasNext()) {
                    String e = it.next().e();
                    this.Y.a(e).onRewardedVideoAdLoadFailed(e, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.O.clear();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && this.D) {
                for (h.b bVar : this.N.values()) {
                    ISDemandOnlyBannerLayout g = bVar.g();
                    if (g != null) {
                        g.getListener().a(bVar.e(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
                    }
                }
                this.N.clear();
                return;
            }
            return;
        }
        if (this.C) {
            Iterator<h.d> it2 = this.M.values().iterator();
            while (it2.hasNext()) {
                String e2 = it2.next().e();
                this.X.a(e2).onInterstitialAdLoadFailed(e2, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
            }
            this.M.clear();
        }
    }

    public void a(C4293aa c4293aa) {
        this.y = c4293aa;
        AdQualityBridge adQualityBridge = this.W;
        if (adQualityBridge != null) {
            adQualityBridge.setSegment(c4293aa);
        }
        F9.i().a(this.y);
        C4412fe.i().a(this.y);
        C4357cd.P.a(this.y);
        Ib.a0().q().a(this.y);
    }

    @Override // com.ironsource.S9
    public void a(boolean z) {
        com.ironsource.mediationsdk.c.d().a(z);
    }

    @Override // com.ironsource.L4.c
    public synchronized void a(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(str2).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(true).a(IronSource.a.REWARDED_VIDEO).b(), this.Y.a(str));
    }

    void a(h.d dVar, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        String e = dVar.e();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + e);
        try {
        } catch (Throwable th) {
            C4491k4.d().a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, new IronSourceError(510, th.getMessage()));
        }
        if (!this.E) {
            ironLog.error("initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, new IronSourceError(510, "initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()"));
            return;
        }
        if (!this.B) {
            ironLog.error("Rewarded video was initialized in mediation mode");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, new IronSourceError(510, "Rewarded video was initialized in mediation mode"));
            return;
        }
        q.d a2 = q.c().a();
        if (a2 == q.d.INIT_FAILED) {
            ironLog.error("init() had failed");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronSourceError a3 = dVar.a();
        if (a3 != null) {
            if (a3.getErrorCode() == 1060) {
                b(EnumC4707w5.TROUBLESHOOTING_DO_CALLED_RV_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
            }
            ironLog.error(a3.toString());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, a3);
            return;
        }
        a(dVar.d());
        if (a2 == q.d.INIT_IN_PROGRESS) {
            if (q.c().d()) {
                ironLog.error("init() had failed");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            synchronized (this.O) {
                this.O.put(e, dVar);
            }
            if (TextUtils.isEmpty(dVar.b())) {
                return;
            }
            b(EnumC4707w5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
            return;
        }
        if (!D()) {
            ironLog.error("No rewarded video configurations found");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        synchronized (this.O) {
            com.ironsource.mediationsdk.demandOnly.k kVar = this.Q;
            if (kVar == null) {
                this.O.put(e, dVar);
                if (!TextUtils.isEmpty(dVar.b())) {
                    b(EnumC4707w5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                }
                return;
            }
            kVar.a(dVar);
            return;
        }
        C4491k4.d().a(th);
        IronLog.API.error(th.getMessage());
        iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, new IronSourceError(510, th.getMessage()));
    }

    @Override // com.ironsource.L4.c
    public synchronized void a(String str) {
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + str);
        ISDemandOnlyRewardedVideoListener a2 = this.Y.a(str);
        try {
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.API.error(e.getMessage());
            if (a2 != null) {
                a2.onRewardedVideoAdShowFailed(str, new IronSourceError(510, e.getMessage()));
            }
        }
        if (!this.B) {
            ironLog.error("Rewarded video was initialized in mediation mode. Use showRewardedVideo instead");
            a2.onRewardedVideoAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
            return;
        }
        com.ironsource.mediationsdk.demandOnly.k kVar = this.Q;
        if (kVar == null) {
            ironLog.error("Rewarded video was not initiated");
            a2.onRewardedVideoAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was not initiated"));
        } else {
            kVar.b(str);
        }
    }

    @Override // com.ironsource.L4.c
    public void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        this.Y.a((U7<ISDemandOnlyRewardedVideoListener>) iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.L4.b
    public synchronized void a(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.INTERSTITIAL).b(), this.X.a(str));
    }

    private synchronized void a(h.d dVar, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        String e = dVar.e();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + e);
        try {
        } catch (Throwable th) {
            C4491k4.d().a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, new IronSourceError(510, th.getMessage()));
        }
        if (!this.F) {
            ironLog.error("initISDemandOnly() must be called before loadISDemandOnlyInterstitial()");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, new IronSourceError(510, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
            return;
        }
        if (!this.C) {
            ironLog.error("Interstitial was initialized in mediation mode. Use loadInterstitial instead");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, new IronSourceError(510, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
            return;
        }
        q.d a2 = q.c().a();
        if (a2 == q.d.INIT_FAILED) {
            ironLog.error("init() had failed");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            return;
        }
        IronSourceError a3 = dVar.a();
        if (a3 != null) {
            if (a3.getErrorCode() == 1060) {
                b(EnumC4707w5.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
            }
            ironLog.error(a3.toString());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, a3);
            return;
        }
        a(dVar.d());
        if (a2 == q.d.INIT_IN_PROGRESS) {
            if (q.c().d()) {
                ironLog.error("init() had failed");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            } else {
                synchronized (this.M) {
                    this.M.put(dVar.e(), dVar);
                }
                if (!TextUtils.isEmpty(dVar.e())) {
                    a(EnumC4707w5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                }
            }
            return;
        }
        if (!x()) {
            ironLog.error("No interstitial configurations found");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
            return;
        }
        synchronized (this.M) {
            com.ironsource.mediationsdk.demandOnly.f fVar = this.P;
            if (fVar == null) {
                this.M.put(dVar.e(), dVar);
                if (!TextUtils.isEmpty(dVar.b())) {
                    a(EnumC4707w5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                }
                return;
            }
            fVar.a(dVar);
        }
    }

    @Override // com.ironsource.L4.b
    public void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        this.X.a((U7<ISDemandOnlyInterstitialListener>) iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.L4.a
    public ISDemandOnlyBannerLayout a(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            this.h.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    @Override // com.ironsource.L4.a
    public synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        h.b a2 = new h.c().b(str).a(activity).a(iSDemandOnlyBannerLayout).a(IronSource.a.BANNER).a();
        IronSourceError a3 = a2.a();
        if (a3 != null) {
            this.h.log(IronSourceLogger.IronSourceTag.API, a3.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, a3);
            }
            return;
        }
        IronSourceError a4 = a(q.c().a());
        if (a4 != null) {
            this.h.log(IronSourceLogger.IronSourceTag.API, a4.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, a4);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (a(a2)) {
            return;
        }
        if (!s()) {
            this.h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(a2)) {
                return;
            }
            this.R.a(iSDemandOnlyBannerLayout, str);
        }
    }

    private boolean a(h.b bVar) {
        if (q.c().a() != q.d.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.N) {
            this.N.put(bVar.e(), bVar);
        }
        return true;
    }

    private IronSourceError a(q.d dVar) {
        if (!this.G) {
            return new IronSourceError(510, "ironSource SDK was not initialized");
        }
        if (!this.D) {
            return new IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (dVar == q.d.INIT_FAILED) {
            return new IronSourceError(510, "ironSource initialization failed");
        }
        if (dVar == q.d.INIT_IN_PROGRESS && q.c().d()) {
            return new IronSourceError(510, "ironSource initialization in progress");
        }
        return null;
    }

    public Te a(Context context, String str) {
        if (C4443h9.a(context)) {
            C4669u3 c2 = C4443h9.c(context);
            String d2 = c2.d();
            String f = c2.f();
            String e = c2.e();
            if (d2.equals(str)) {
                Te te = new Te(context, d2, f, e);
                te.a(Te.a.CACHE);
                return te;
            }
        }
        return null;
    }

    private Te a(Context context, String str, c cVar) {
        Te te = null;
        if (!IronSourceUtils.f(context)) {
            return null;
        }
        try {
            String b2 = b(context);
            if (TextUtils.isEmpty(b2)) {
                b2 = this.c.a(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = b2;
            C4293aa c4293aa = this.y;
            String a2 = C4333b7.a(Ve.a(context, h(), str, str2, j(), this.J, c4293aa != null ? c4293aa.f() : null, u()), C4407f9.a().toString(), cVar);
            if (a2 == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.g()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject = new JSONObject(a2);
                String optString = jSONObject.optString(Te.n, null);
                if (TextUtils.isEmpty(optString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                a2 = a(optString, Boolean.valueOf(jSONObject.optBoolean("compression", false)));
                if (TextUtils.isEmpty(a2)) {
                    ironLog.warning("encoded response invalid - return null");
                    H();
                    return null;
                }
            }
            Te te2 = new Te(context, h(), str, a2);
            try {
                te2.a(Te.a.SERVER);
                if (te2.q()) {
                    return te2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e) {
                e = e;
                te = te2;
                C4491k4.d().a(e);
                IronLog.INTERNAL.warning("exception = " + e);
                return te;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private String a(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return I9.d(C4457i5.b().c(), str);
        }
        return I9.b(C4457i5.b().c(), str);
    }

    private void a(Te te, Context context) {
        boolean l = q() ? te.c().b().b().l() : false;
        boolean l2 = C() ? te.c().f().m().l() : false;
        boolean l3 = w() ? te.c().d().i().l() : false;
        boolean l4 = r() ? te.c().c().g().l() : false;
        boolean l5 = z() ? te.c().e().g().l() : false;
        C4375dd i = te.c().b().i();
        boolean i2 = i.i();
        if (l) {
            a((AbstractC4455i3) Ib.a0().q(), te.c().b().b(), context, te, true);
        }
        if (l2) {
            a((AbstractC4455i3) C4412fe.i(), te.c().f().m(), context, te, true);
        } else {
            C4412fe.i().a(false);
        }
        if (l3) {
            a((AbstractC4455i3) F9.i(), te.c().d().i(), context, te, true);
        } else if (l4) {
            a((AbstractC4455i3) F9.i(), te.c().c().g(), context, te, true);
        } else if (l5) {
            a((AbstractC4455i3) F9.i(), te.c().e().g(), context, te, true);
        } else {
            F9.i().a(false);
        }
        C4357cd c4357cd = C4357cd.P;
        c4357cd.a(i2);
        if (i2) {
            c4357cd.b(i.j(), context);
            c4357cd.b(i.l(), context);
            c4357cd.c(i.k(), context);
            c4357cd.b(i.g());
            c4357cd.c(i.h());
        }
    }

    private void a(AbstractC4455i3 abstractC4455i3, H1 h1, Context context, Te te, boolean z) {
        abstractC4455i3.a(z);
        abstractC4455i3.a(h1.c(), context);
        abstractC4455i3.b(h1.d(), context);
        abstractC4455i3.a(h1.f());
        abstractC4455i3.d(h1.e());
        abstractC4455i3.b(h1.a());
        abstractC4455i3.b(h1.i(), context);
        abstractC4455i3.c(h1.h(), context);
        abstractC4455i3.a(h1.j(), context);
        abstractC4455i3.d(h1.g(), context);
        abstractC4455i3.a(te.c().b().j());
        abstractC4455i3.b(h1.k());
        abstractC4455i3.c(h1.b());
    }

    private void a(String str, J3 j3) {
        if (a(str, 1, 128)) {
            return;
        }
        j3.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, "dynamicUserId is invalid, should be between 1-128 chars in length."));
    }

    private boolean a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    boolean a(C4347c3 c4347c3) {
        return this.e.c(ContextProvider.getInstance().getApplicationContext(), c4347c3, IronSource.a.BANNER);
    }

    C4482jd.b a(C4411fd c4411fd) {
        return this.e.a(ContextProvider.getInstance().getApplicationContext(), c4411fd, IronSource.a.REWARDED_VIDEO);
    }

    private void a(EnumC4707w5 enumC4707w5, JSONObject jSONObject) {
        F9.i().a(new C4689v5(enumC4707w5, jSONObject));
    }

    private void a(JSONObject jSONObject, Object[][] objArr) {
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    jSONObject.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C4491k4.d().a(e);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e), 3);
            }
        }
    }

    public void a(String str, List<String> list) {
        String checkMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String checkMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (checkMetaDataKeyValidity.length() > 0) {
            IronLog.API.verbose(checkMetaDataKeyValidity);
            return;
        }
        if (checkMetaDataValueValidity.length() > 0) {
            IronLog.API.verbose(checkMetaDataValueValidity);
            return;
        }
        MetaData formatMetaData = MetaDataUtils.formatMetaData(str, list);
        String metaDataKey = formatMetaData.getMetaDataKey();
        List<String> metaDataValue = formatMetaData.getMetaDataValue();
        if (MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
            if (v() && MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
                IronLog.API.error("setMetaData with key = " + metaDataKey + " must to be called before init");
            } else {
                C4515la.b().a(metaDataKey, metaDataValue);
            }
        } else {
            com.ironsource.mediationsdk.c.d().c(metaDataKey, metaDataValue);
        }
        try {
            ConcurrentHashMap<String, List<String>> f = com.ironsource.mediationsdk.c.d().f();
            f.putAll(C4515la.b().c());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, List<String>> entry : f.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            this.U.a(jSONObject);
            this.T.a(jSONObject);
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error("got the following error " + e.getMessage());
        }
        Ib.a0().q().a(new C4689v5(v() ? EnumC4707w5.SET_META_DATA_AFTER_INIT : EnumC4707w5.SET_META_DATA, IronSourceUtils.a(str, list, metaDataValue)));
    }

    @Override // com.ironsource.L4
    public String a(Context context) {
        String str;
        Be be;
        String str2;
        C4539mg k;
        M4 e = e();
        Be be2 = null;
        try {
            be = Ce.f7585a.a();
        } catch (Exception unused) {
            str = null;
        }
        try {
            e.a(EnumC4707w5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_IN_INIT_STATUS, be);
        } catch (Exception unused2) {
            str = null;
            be2 = be;
            e.a(EnumC4707w5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, be2);
            be = be2;
            str2 = str;
            e.a(EnumC4707w5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, be);
            return str2;
        }
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            e.a(EnumC4707w5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_WITHOUT_CONTEXT, (Be) null);
            return null;
        }
        if (be == Be.NOT_INIT) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            e.a(EnumC4707w5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_NO_INIT_RETURNED_NULL, (Be) null);
            return null;
        }
        q.c().f();
        Te te = this.l;
        boolean e2 = (te == null || (k = te.c().b().k()) == null) ? true : k.e();
        this.T.b(context);
        JSONObject a2 = new C4521lg().a(context);
        com.ironsource.mediationsdk.d.b().a(a2, true);
        if (e2) {
            str2 = I9.a(a2.toString());
        } else {
            str2 = I9.c(a2.toString());
        }
        if (be == Be.INITIATED) {
            IronLog.INTERNAL.verbose("external token parameters: " + a2);
        }
        if (TextUtils.isEmpty(str2)) {
            e.a(EnumC4707w5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, be);
        }
        e.a(EnumC4707w5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, be);
        return str2;
    }

    @Override // com.ironsource.U8
    public void a(ImpressionDataListener impressionDataListener) {
        if (Y9.a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            C4515la.b().b(impressionDataListener);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (Y9.a((Object) jSONObject, "setAdRevenueData - impressionData is null") && Y9.a((Object) str, "setAdRevenueData - dataSource is null")) {
            this.S.a(str, jSONObject);
        }
    }

    private void a(Activity activity) {
        ContextProvider.getInstance().updateActivity(activity);
        IronLog.INTERNAL.verbose("activity is updated to: " + activity.hashCode());
    }
}
