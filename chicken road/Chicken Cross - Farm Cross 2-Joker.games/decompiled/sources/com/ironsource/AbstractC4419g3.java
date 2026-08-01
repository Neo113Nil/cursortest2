package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C4753yf;
import com.ironsource.E0;
import com.ironsource.I8;
import com.ironsource.P0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.g3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4419g3<Listener extends P0> implements NetworkInitializationListener, C4753yf.a, D0, AdapterAdListener, I8.b {

    /* renamed from: a, reason: collision with root package name */
    protected C4541n0 f8200a;
    protected Listener b;
    protected BaseAdAdapter<?, AdapterAdListener> c;
    protected E0 d;
    protected h e;
    protected C4411fd g;
    protected C4345c1 h;
    protected JSONObject i;
    protected String j;
    protected AdData k;
    protected Long l;
    protected C4385e5 m;
    private final C4561o2 o;
    private final InterfaceC4590pd p;
    private AtomicBoolean f = new AtomicBoolean(false);
    private C4753yf n = new C4753yf(TimeUnit.SECONDS.toMillis(s()));
    protected final Object q = new Object();

    /* renamed from: com.ironsource.g3$a */
    class a extends com.ironsource.environment.thread.a {
        a() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4419g3.this.L();
        }
    }

    /* renamed from: com.ironsource.g3$b */
    class b extends com.ironsource.environment.thread.a {
        b() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4419g3.this.K();
        }
    }

    /* renamed from: com.ironsource.g3$c */
    class c extends com.ironsource.environment.thread.a {
        final /* synthetic */ int b;
        final /* synthetic */ String c;

        c(int i, String str) {
            this.b = i;
            this.c = str;
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4419g3.this.a(this.b, this.c);
        }
    }

    /* renamed from: com.ironsource.g3$d */
    class d extends com.ironsource.environment.thread.a {
        d() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4419g3.this.I();
        }
    }

    /* renamed from: com.ironsource.g3$e */
    class e extends com.ironsource.environment.thread.a {
        final /* synthetic */ AdapterErrorType b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;

        e(AdapterErrorType adapterErrorType, int i, String str) {
            this.b = adapterErrorType;
            this.c = i;
            this.d = str;
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4419g3.this.a(this.b, this.c, this.d);
        }
    }

    /* renamed from: com.ironsource.g3$f */
    class f extends com.ironsource.environment.thread.a {
        f() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4419g3.this.J();
        }
    }

    /* renamed from: com.ironsource.g3$g */
    class g extends com.ironsource.environment.thread.a {
        g() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4419g3.this.H();
        }
    }

    /* renamed from: com.ironsource.g3$h */
    protected enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC4419g3(InterfaceC4590pd interfaceC4590pd, C4541n0 c4541n0, BaseAdAdapter<?, ?> baseAdAdapter, C4345c1 c4345c1, C4561o2 c4561o2, Listener listener) {
        this.f8200a = c4541n0;
        this.b = listener;
        this.d = new E0(c4541n0.a(), E0.b.PROVIDER, this);
        this.h = c4345c1;
        this.i = c4345c1.c();
        this.c = baseAdAdapter;
        this.o = c4561o2;
        this.p = interfaceC4590pd;
        a(h.NONE);
    }

    private boolean D() {
        return this.e == h.INIT_IN_PROGRESS;
    }

    private void F() {
        IronLog.INTERNAL.verbose(d());
        a(h.LOADING);
        a(false);
        try {
            this.n.a((C4753yf.a) this);
            G();
        } catch (Throwable th) {
            C4491k4.d().a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage() + " - state = " + this.e;
            IronLog.INTERNAL.error(a(str));
            E0 e0 = this.d;
            if (e0 != null) {
                e0.j.g(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        IronLog.INTERNAL.verbose(d());
        E0 e0 = this.d;
        if (e0 != null) {
            e0.i.a(j());
        }
        this.b.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean z;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C4753yf c4753yf = this.n;
        if (c4753yf != null) {
            c4753yf.e();
        }
        synchronized (this.q) {
            h hVar = this.e;
            z = false;
            if (hVar == h.LOADING) {
                long a2 = C4385e5.a(this.m);
                ironLog.verbose(a("Load duration = " + a2));
                if (this.d != null) {
                    if (v()) {
                        this.d.f.a(a2);
                    } else {
                        this.d.f.a(a2, false);
                    }
                }
                a(h.LOADED);
                z = O();
            } else if (hVar != h.FAILED) {
                ironLog.error(a(String.format("unexpected load success for %s, state - %s", k(), this.e)));
                String format = String.format("unexpected load success, state - %s", this.e);
                if (this.d != null) {
                    if (v()) {
                        this.d.j.s(format);
                    } else {
                        this.d.j.p(format);
                    }
                }
            }
        }
        if (z) {
            this.b.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog.INTERNAL.verbose(d());
        a(h.SHOWING);
        E0 e0 = this.d;
        if (e0 != null) {
            e0.i.g(j());
        }
        this.b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            C4753yf c4753yf = this.n;
            if (c4753yf != null) {
                c4753yf.e();
            }
            a(h.READY_TO_LOAD);
            F();
            return;
        }
        if (this.e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init success for %s, state - %s", k(), this.e)));
        if (this.d != null) {
            this.d.j.n(String.format("unexpected init success, state - %s", this.e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        long a2 = C4385e5.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + a2 + ", state = " + this.e + ", isBidder = " + w()));
        synchronized (this.q) {
            if (!z()) {
                ironLog.error(a(String.format("unexpected timeout for %s, state - %s, error - %s", k(), this.e, 1025)));
                if (this.d != null) {
                    this.d.j.u(String.format("unexpected timeout, state - %s, error - %s", this.e, 1025));
                }
                return;
            }
            a(h.FAILED);
            E0 e0 = this.d;
            if (e0 != null) {
                e0.f.a(a2, 1025, false);
                this.d.f.a(a2, 1025, "time out", false);
            }
            this.b.a(ErrorBuilder.buildLoadFailedError("time out"), this);
        }
    }

    private int o() {
        return 1;
    }

    private int s() {
        C4561o2 c4561o2 = this.o;
        if (c4561o2 == null) {
            return this.f8200a.f();
        }
        Integer f2 = c4561o2.f();
        int f3 = (f2 == null || f2.intValue() <= 0) ? this.f8200a.f() : f2.intValue();
        IronLog.INTERNAL.verbose(a("Load timeout for " + this.o.c() + " - " + f3 + " seconds"));
        return f3;
    }

    public AtomicBoolean A() {
        return this.f;
    }

    public boolean B() {
        return y();
    }

    public boolean C() {
        return this.e == h.SHOWING;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public void E() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C4561o2 i = i();
        String k = i.k();
        Map<String, Object> a2 = C4444ha.a(i.a());
        a2.put("adUnit", this.f8200a.a());
        b(k);
        try {
            boolean z = false;
            if (v()) {
                this.d.f.d();
            } else {
                this.d.f.a(false);
            }
            this.l = null;
            this.m = new C4385e5();
            this.k = a(k, a2);
            synchronized (this.q) {
                if (this.e != h.NONE) {
                    z = true;
                } else {
                    a(h.INIT_IN_PROGRESS);
                }
            }
            if (z) {
                String str = "loadAd - incorrect state while loading, state = " + this.e;
                ironLog.error(a(str));
                this.d.j.g(str);
                onInitFailed(A0.c(this.f8200a.a()), str);
                return;
            }
            this.n.a((C4753yf.a) this);
            ?? networkAdapter = this.c.getNetworkAdapter();
            if (networkAdapter != 0) {
                networkAdapter.init(this.k, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + k();
            ironLog.error(a(str2));
            onInitFailed(A0.c(this.f8200a.a()), str2);
        } catch (Throwable th) {
            C4491k4.d().a(th);
            String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            E0 e0 = this.d;
            if (e0 != null) {
                e0.j.g(str3);
            }
            onInitFailed(A0.c(this.f8200a.a()), str3);
        }
    }

    protected void G() {
        Object obj = this.c;
        if (obj instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) obj).loadAd(this.k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    public void M() {
        synchronized (this) {
            if (this.c != null) {
                try {
                    this.c = null;
                } catch (Exception e2) {
                    C4491k4.d().a(e2);
                    String str = "Exception while calling adapter.releaseMemory() from " + this.h.f() + " - " + e2.getMessage() + " - state = " + this.e;
                    IronLog.INTERNAL.error(a(str));
                    if (this.d != null) {
                        this.d.j.g(str);
                    }
                }
            }
            E0 e0 = this.d;
            if (e0 != null) {
                e0.f();
                this.d = null;
            }
            C4753yf c4753yf = this.n;
            if (c4753yf != null) {
                c4753yf.d();
                this.n = null;
            }
        }
    }

    public void N() {
        IronLog.INTERNAL.verbose(d());
        E0 e0 = this.d;
        if (e0 != null) {
            e0.i.a();
        }
    }

    protected boolean O() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public Map<String, Object> a(B0 b0) {
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            IronLog.INTERNAL.error(a("could not get adapter version for event data" + k()));
        }
        hashMap.put("spId", this.h.i());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.h.a());
        hashMap.put("instanceType", Integer.valueOf(l()));
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(o()));
        if (!TextUtils.isEmpty(this.j)) {
            hashMap.put("dynamicDemandSource", this.j);
        }
        hashMap.put("sessionDepth", r());
        if (this.f8200a.e() != null && this.f8200a.e().length() > 0) {
            hashMap.put("genericParams", this.f8200a.e());
        }
        if (!TextUtils.isEmpty(this.f8200a.c())) {
            hashMap.put("auctionId", this.f8200a.c());
        }
        if (b(b0)) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f8200a.d()));
            if (!TextUtils.isEmpty(this.f8200a.b())) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f8200a.b());
            }
        }
        if (!TextUtils.isEmpty(this.f8200a.g().getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f8200a.g().getCustomNetwork());
        }
        return hashMap;
    }

    public void b(String str) {
        this.j = com.ironsource.mediationsdk.d.b().c(str);
    }

    @Override // com.ironsource.I8.b
    public String c() {
        return this.h.f();
    }

    protected String d() {
        return a((String) null);
    }

    public Long e() {
        return this.l;
    }

    public AdInfo f() {
        return new AdInfo(this.o.a(j()), this.o.d());
    }

    public IronSource.a g() {
        return this.f8200a.a();
    }

    public String h() {
        return this.f8200a.c();
    }

    public C4561o2 i() {
        return this.o;
    }

    protected String j() {
        C4411fd c4411fd = this.g;
        return c4411fd == null ? "" : c4411fd.c();
    }

    public String k() {
        return String.format("%s %s", c(), Integer.valueOf(hashCode()));
    }

    public int l() {
        return this.h.d();
    }

    public String m() {
        return this.h.h().isMultipleInstances() ? this.h.h().getProviderTypeForReflection() : this.h.f();
    }

    public String n() {
        return this.h.g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.p.c()) {
            this.p.a(new g());
        } else {
            H();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str) {
        if (this.p.c()) {
            this.p.a(new e(adapterErrorType, i, str));
        } else {
            a(adapterErrorType, i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.p.c()) {
            this.p.a(new d());
        } else {
            I();
        }
    }

    public void onAdOpened() {
        if (this.p.c()) {
            this.p.a(new f());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i, String str) {
        if (this.p.c()) {
            this.p.a(new c(i, str));
        } else {
            a(i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (this.p.c()) {
            this.p.a(new b());
        } else {
            K();
        }
    }

    public NetworkSettings p() {
        return this.f8200a.g();
    }

    protected Map<String, Object> q() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(C4444ha.a(this.i));
        return hashMap;
    }

    public Integer r() {
        C4541n0 c4541n0 = this.f8200a;
        if (c4541n0 != null) {
            return Integer.valueOf(c4541n0.h());
        }
        return null;
    }

    public h t() {
        return this.e;
    }

    protected InterfaceC4590pd u() {
        return this.p;
    }

    protected boolean v() {
        return false;
    }

    public boolean w() {
        return this.h.j();
    }

    public boolean x() {
        return this.e == h.FAILED;
    }

    public boolean y() {
        return this.e == h.LOADED;
    }

    public boolean z() {
        h hVar = this.e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }

    @Override // com.ironsource.I8.b
    public int b() {
        return this.h.e();
    }

    private boolean b(B0 b0) {
        return new ArrayList(Arrays.asList(B0.LOAD_AD, B0.LOAD_AD_SUCCESS, B0.LOAD_AD_FAILED, B0.LOAD_AD_FAILED_WITH_REASON, B0.LOAD_AD_NO_FILL, B0.RELOAD_AD, B0.RELOAD_AD_SUCCESS, B0.RELOAD_AD_FAILED_WITH_REASON, B0.RELOAD_AD_NO_FILL, B0.DESTROY_AD, B0.AD_PRESENT_SCREEN, B0.AD_DISMISS_SCREEN, B0.AD_LEFT_APPLICATION, B0.AD_OPENED, B0.AD_CLOSED, B0.SHOW_AD, B0.SHOW_AD_FAILED, B0.AD_CLICKED, B0.AD_REWARDED)).contains(b0);
    }

    protected void a(h hVar) {
        IronLog.INTERNAL.verbose(d());
        this.e = hVar;
    }

    public void a(boolean z) {
        this.f.set(z);
    }

    protected Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.f8200a.i());
        return map;
    }

    protected AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    protected String a(String str) {
        String str2 = this.f8200a.a().name() + " - " + k() + " - state = " + this.e;
        return TextUtils.isEmpty(str) ? str2 : str2 + " - " + str;
    }

    @Override // com.ironsource.C4753yf.a
    public void a() {
        if (!this.p.c()) {
            L();
        } else {
            this.p.a(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i + ", " + str));
        if (D()) {
            C4753yf c4753yf = this.n;
            if (c4753yf != null) {
                c4753yf.e();
            }
            a(h.FAILED);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C4385e5.a(this.m));
            this.b.a(new IronSourceError(i, str), this);
            return;
        }
        if (this.e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init failed for %s, state - %s, error - %s, %s", k(), this.e, Integer.valueOf(i), str)));
        if (this.d != null) {
            this.d.j.m(String.format("unexpected init failed, state - %s, error - %s, %s", this.e, Integer.valueOf(i), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdapterErrorType adapterErrorType, int i, String str) {
        long a2 = C4385e5.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + a2 + ", error = " + i + ", " + str));
        C4753yf c4753yf = this.n;
        if (c4753yf != null) {
            c4753yf.e();
        }
        synchronized (this.q) {
            h hVar = this.e;
            if (hVar == h.LOADING) {
                a(adapterErrorType, i, str, a2);
                a(h.FAILED);
                this.b.a(new IronSourceError(i, str), this);
                return;
            }
            if (hVar == h.FAILED) {
                a(adapterErrorType, i, str, a2);
                return;
            }
            if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.l = Long.valueOf(System.currentTimeMillis());
                ironLog.error(a(String.format("ad expired for %s, state = %s", this.h.f(), this.e)));
                E0 e0 = this.d;
                if (e0 != null) {
                    e0.j.a(String.format("ad expired, state = %s", this.e));
                }
                return;
            }
            ironLog.error(a(String.format("unexpected load failed for %s, state - %s, error - %s, %s", k(), this.e, Integer.valueOf(i), str)));
            String format = String.format("unexpected load failed, state - %s, error - %s, %s", this.e, Integer.valueOf(i), str);
            if (this.d != null) {
                if (v()) {
                    this.d.j.r(format);
                } else if (this.f8200a.a() != IronSource.a.REWARDED_VIDEO || this.e != h.SHOWING) {
                    this.d.j.o(format);
                }
            }
        }
    }

    private void a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (this.d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (v()) {
                    this.d.f.a(j, i);
                    return;
                } else {
                    this.d.f.b(j, i, false);
                    return;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (v()) {
                    this.d.f.a(j, i, str);
                    return;
                } else {
                    this.d.f.a(j, i, str, false);
                    return;
                }
            }
            this.d.f.a(j, i, false);
        }
    }
}
