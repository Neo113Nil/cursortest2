package com.ironsource;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.AbstractC4419g3;
import com.ironsource.C4598q3;
import com.ironsource.E0;
import com.ironsource.J7;
import com.ironsource.J8;
import com.ironsource.M0;
import com.ironsource.Z1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.f3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4401f3<Smash extends AbstractC4419g3<?>, Listener extends AdapterAdListener> implements P0, S1, D0, Db, Bc, InterfaceC4558o, Og, InterfaceC4562o3, InterfaceC4590pd {
    private AdInfo A;
    private C4515la B;
    final J8 C;
    final J8.a D;
    protected final J7 E;
    private final J7.a F;
    private boolean G;
    private Rf H;
    private AtomicBoolean I;
    private R9 J;

    /* renamed from: a, reason: collision with root package name */
    protected Ng<Smash> f8185a;
    protected ConcurrentHashMap<String, Z1.a> b;
    protected com.ironsource.mediationsdk.e c;
    protected Z1 d;
    protected int e;
    protected String f;
    protected JSONObject g;
    protected C4561o2 h;
    protected C4411fd i;
    protected boolean j;
    private NetworkStateReceiver k;
    protected Ze l;
    protected C4385e5 m;
    protected C4385e5 n;
    protected W o;
    protected f p;
    protected O0 q;
    protected L5 r;
    protected E0 s;
    protected K0 t;
    protected C4629s u;
    protected C4293aa v;
    protected UUID w;
    protected final Object x;
    private long y;
    private Boolean z;

    /* renamed from: com.ironsource.f3$a */
    class a extends com.ironsource.environment.thread.a {
        a() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            AbstractC4401f3.this.y();
        }
    }

    /* renamed from: com.ironsource.f3$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f8186a;

        b(NetworkSettings networkSettings) {
            this.f8186a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4401f3.this.c(this.f8186a);
        }
    }

    /* renamed from: com.ironsource.f3$c */
    class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC4401f3.this.A();
        }
    }

    /* renamed from: com.ironsource.f3$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4401f3.this.g = new JSONObject();
            AbstractC4401f3.this.s.h.a((Double) null);
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            AbstractC4401f3.this.b(hashMap, arrayList, sb, arrayList2);
            AbstractC4401f3.this.a(hashMap, arrayList, sb, arrayList2);
        }
    }

    /* renamed from: com.ironsource.f3$e */
    class e implements C4598q3.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f8189a;
        final /* synthetic */ StringBuilder b;
        final /* synthetic */ List c;

        e(Map map, StringBuilder sb, List list) {
            this.f8189a = map;
            this.b = sb;
            this.c = list;
        }

        @Override // com.ironsource.C4598q3.b
        public void a(List<C4615r3> list, long j, List<String> list2) {
            AbstractC4401f3.this.s.g.b(j);
            for (C4615r3 c4615r3 : list) {
                NetworkSettings a2 = AbstractC4401f3.this.o.a(c4615r3.c());
                Map<String, Object> b = AbstractC4401f3.this.b(a2, com.ironsource.mediationsdk.c.d().b(a2, AbstractC4401f3.this.o.b(), AbstractC4401f3.this.h()));
                if (c4615r3.a() != null) {
                    this.f8189a.put(c4615r3.c(), c4615r3.a());
                    this.b.append(c4615r3.d()).append(c4615r3.c()).append(",");
                    AbstractC4401f3.this.s.g.a(b, c4615r3.e());
                } else {
                    AbstractC4401f3.this.s.g.a(b, c4615r3.e(), c4615r3.b());
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                NetworkSettings a3 = AbstractC4401f3.this.o.a(it.next());
                AbstractC4401f3.this.s.g.b(AbstractC4401f3.this.b(a3, com.ironsource.mediationsdk.c.d().b(a3, AbstractC4401f3.this.o.b(), AbstractC4401f3.this.h())), j);
            }
            AbstractC4401f3.this.a((Map<String, Object>) this.f8189a, (List<String>) this.c, this.b.toString());
        }

        @Override // com.ironsource.C4598q3.b
        public void onFailure(String str) {
            AbstractC4401f3.this.s.g.a(str);
            AbstractC4401f3.this.a((Map<String, Object>) this.f8189a, (List<String>) this.c, this.b.toString());
        }
    }

    /* renamed from: com.ironsource.f3$f */
    protected enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public AbstractC4401f3(W w, C4515la c4515la, C4293aa c4293aa) {
        this(Ib.a0(), Ib.R(), w, c4515la, c4293aa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        IronLog.INTERNAL.verbose(f());
        AsyncTask.execute(new d());
    }

    private Ug<Smash> B() {
        IronLog.INTERNAL.verbose();
        return new Tg(this.o).d(this.f8185a.b());
    }

    private void C() {
        this.u.a(this.o.b(), false);
    }

    private void H() {
        IronLog.INTERNAL.verbose(f());
        synchronized (this.x) {
            f fVar = this.p;
            f fVar2 = f.AUCTION;
            if (fVar == fVar2) {
                return;
            }
            a(fVar2);
            this.I.set(false);
            long k = this.o.d().k() - C4385e5.a(this.m);
            if (k > 0) {
                new Timer().schedule(new c(), k);
            } else {
                A();
            }
        }
    }

    private void I() {
        IronLog.INTERNAL.verbose(f());
        a(g(), j());
    }

    private R9 a(W w) {
        return null;
    }

    private boolean c(boolean z) {
        Boolean bool = this.z;
        if (bool == null) {
            return false;
        }
        return (z && !bool.booleanValue() && r()) || (!z && this.z.booleanValue());
    }

    private boolean d(NetworkSettings networkSettings) {
        AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.d().b(networkSettings, this.o.b(), h());
        if (b2 instanceof AdapterSettingsInterface) {
            return this.f8185a.a(this.o.h().a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), a(networkSettings, b2), b2, this.o.b());
        }
        return false;
    }

    private List<C4561o2> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            if (!networkSettings.isBidder(this.o.b()) && d(networkSettings)) {
                Ye ye = new Ye(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b()));
                if (!this.l.b(ye)) {
                    copyOnWriteArrayList.add(new C4561o2(ye.c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private int m() {
        return 1;
    }

    private void o() {
        IronLog.INTERNAL.verbose(f());
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            if (c(networkSettings, com.ironsource.mediationsdk.c.d().b(networkSettings, this.o.b(), h()))) {
                arrayList.add(new b(networkSettings));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.o.k(), this.o.p(), arrayList);
    }

    private void p() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            arrayList.add(new Ye(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b())));
        }
        Ze ze = new Ze();
        this.l = ze;
        ze.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        f fVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        synchronized (this.x) {
            if (this.o.h().e() && this.l.a()) {
                ironLog.verbose(b("all smashes are capped"));
                a(A0.a(this.o.b()), "all smashes are capped", false);
                return;
            }
            if (!q() && this.p == f.SHOWING) {
                IronLog.API.error(b("load cannot be invoked while showing an ad"));
                a(new IronSourceError(A0.d(this.o.b()), "load cannot be invoked while showing an ad"));
                return;
            }
            if (this.o.h().a() != M0.a.AUTOMATIC_LOAD_WHILE_SHOW && this.o.h().a() != M0.a.MANUAL_WITH_LOAD_ON_SHOW && (((fVar = this.p) != f.READY_TO_LOAD && fVar != f.READY_TO_SHOW) || com.ironsource.mediationsdk.l.a().b(this.o.b()))) {
                IronLog.API.error(b("load is already in progress"));
                return;
            }
            this.g = new JSONObject();
            C();
            if (s()) {
                this.s.f.d();
            } else {
                this.s.f.a(n());
            }
            this.n = new C4385e5();
            if (this.o.q()) {
                if (!this.b.isEmpty()) {
                    this.d.a(this.b);
                    this.b.clear();
                }
                H();
            } else {
                a(f.LOADING);
            }
            if (this.o.q()) {
                return;
            }
            ironLog.verbose(b("auction disabled"));
            I();
            z();
        }
    }

    private void z() {
        Ug<Smash> B = B();
        if (B.c()) {
            a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
        }
        Iterator<Smash> it = B.a().iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    protected void D() {
        com.ironsource.mediationsdk.l.a().a(this.o.b(), this.o.f());
    }

    protected boolean E() {
        return true;
    }

    protected boolean F() {
        return true;
    }

    public void G() {
        Iterator<NetworkSettings> it = this.o.j().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.c.d().b(it.next(), this.o.b(), h());
        }
    }

    protected abstract Smash a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i, String str, C4561o2 c4561o2);

    public void a(Context context, boolean z) {
        IronLog.INTERNAL.verbose(b("track = " + z));
        try {
            this.j = z;
            if (z) {
                if (this.k == null) {
                    this.k = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.k != null) {
                context.getApplicationContext().unregisterReceiver(this.k);
            }
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    protected abstract JSONObject b(NetworkSettings networkSettings);

    protected void b(boolean z) {
        a(false, z, (AbstractC4419g3<?>) null);
    }

    protected abstract K0 d();

    protected O0 e() {
        return new O0(this.o.h(), this);
    }

    protected String f() {
        return b((String) null);
    }

    protected void h(AbstractC4419g3<?> abstractC4419g3) {
        if (this.o.h().f()) {
            a(abstractC4419g3, abstractC4419g3.f());
        } else {
            a(true, false, abstractC4419g3);
        }
    }

    protected abstract String i();

    protected void i(AbstractC4419g3<?> abstractC4419g3) {
        if (this.o.q() && this.I.compareAndSet(false, true)) {
            C4561o2 i = abstractC4419g3.i();
            this.c.a(i, abstractC4419g3.l(), this.h);
            ArrayList<String> arrayList = new ArrayList<>();
            ConcurrentHashMap<String, C4561o2> concurrentHashMap = new ConcurrentHashMap<>();
            for (Smash smash : this.f8185a.b()) {
                arrayList.add(smash.c());
                concurrentHashMap.put(smash.c(), smash.i());
            }
            this.c.a(arrayList, concurrentHashMap, abstractC4419g3.l(), this.h, i);
        }
    }

    protected String j() {
        return "fallback_" + System.currentTimeMillis();
    }

    protected String k() {
        C4411fd c4411fd = this.i;
        return c4411fd == null ? "" : c4411fd.c();
    }

    abstract String l();

    protected boolean n() {
        return false;
    }

    protected boolean q() {
        return false;
    }

    protected boolean r() {
        return false;
    }

    protected abstract boolean s();

    protected boolean t() {
        boolean z;
        synchronized (this.x) {
            f fVar = this.p;
            z = fVar == f.LOADING || fVar == f.READY_TO_SHOW;
        }
        return z;
    }

    protected boolean u() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.READY_TO_SHOW;
        }
        return z;
    }

    protected boolean v() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.AUCTION;
        }
        return z;
    }

    protected boolean w() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.LOADING;
        }
        return z;
    }

    public void x() {
        if (c()) {
            a(new a());
        } else {
            y();
        }
    }

    @Override // com.ironsource.Db
    public void b() {
        IronLog.INTERNAL.verbose(f());
        x();
    }

    @Override // com.ironsource.P0
    public void e(AbstractC4419g3<?> abstractC4419g3) {
        IronLog.INTERNAL.verbose(b(abstractC4419g3.k()));
        this.s.i.a(k());
        this.t.a(this.i, abstractC4419g3.f());
    }

    AbstractC4401f3(F7 f7, E7 e7, W w, C4515la c4515la, C4293aa c4293aa) {
        this.f = "";
        this.j = false;
        this.x = new Object();
        this.y = 0L;
        this.I = new AtomicBoolean(false);
        this.w = UUID.randomUUID();
        this.C = f7.s();
        this.D = e7.i();
        this.E = f7.w();
        this.F = e7.x();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + w.b() + ", loading mode = " + w.h().a());
        IronSourceUtils.i(w.b() + " initiated object per waterfall mode");
        C4385e5 c4385e5 = new C4385e5();
        this.J = a(w);
        this.v = c4293aa;
        this.o = w;
        this.s = new E0(w.b(), E0.b.MEDIATION, this);
        this.t = d();
        this.q = e();
        a(f.NONE);
        this.B = c4515la;
        this.f8185a = new Ng<>(this.o.d().f(), this.o.d().i(), this);
        this.s.e.a(l(), this.o.h().a().toString());
        this.b = new ConcurrentHashMap<>();
        this.i = null;
        D();
        this.g = new JSONObject();
        if (this.o.q()) {
            this.c = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(this.o.d(), IronSourceUtils.d()));
        }
        this.d = new Z1(this.o.j(), this.o.d().c());
        p();
        o();
        this.m = new C4385e5();
        a(f.READY_TO_LOAD);
        this.r = new L5(w.a(), this);
        this.u = new C4629s();
        this.s.e.a(C4385e5.a(c4385e5));
        if (this.o.h().e()) {
            ironLog.verbose("first automatic load");
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC4544n3> list2) {
        String str;
        for (NetworkSettings networkSettings : this.o.j()) {
            Rf rf = this.H;
            if (rf == null || rf.a(networkSettings, this.o.b())) {
                if (!this.l.b(new Ye(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b()))) && d(networkSettings)) {
                    AdData a2 = a(networkSettings, (String) null);
                    if (networkSettings.isBidder(this.o.b())) {
                        AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.d().b(networkSettings, this.o.b(), h());
                        if (b2 instanceof InterfaceC4580p3) {
                            list2.add(new CallableC4544n3(networkSettings.getInstanceType(this.o.b()), networkSettings.getProviderInstanceName(), a2, (InterfaceC4580p3) b2, this, networkSettings));
                        } else {
                            if (b2 == null) {
                                str = "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName();
                            } else {
                                str = "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface";
                            }
                            this.s.j.g(str);
                        }
                    } else {
                        list.add(networkSettings.getProviderInstanceName());
                        sb.append(networkSettings.getInstanceType(this.o.b())).append(networkSettings.getProviderInstanceName()).append(",");
                    }
                }
            }
        }
    }

    public UUID h() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(b(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
        AdData a2 = a(networkSettings, this.o.o());
        AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.d().b(networkSettings, this.o.b(), h());
        if (b2 != null) {
            try {
                b2.init(a2, ContextProvider.getInstance().getApplicationContext(), null);
            } catch (Exception e2) {
                C4491k4.d().a(e2);
                this.s.j.g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e2);
            }
        }
        IronLog.INTERNAL.verbose(b(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
    }

    @Override // com.ironsource.P0
    public void d(AbstractC4419g3<?> abstractC4419g3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC4419g3.k()));
        if (!abstractC4419g3.h().equals(this.f8185a.c())) {
            ironLog.error(b("invoked from " + abstractC4419g3.c() + " with state = " + this.p + " auctionId: " + abstractC4419g3.h() + " and the current id is " + this.f8185a.c()));
            this.s.j.p("onAdLoadSuccess invoked with state = " + this.p);
            return;
        }
        if (this.o.m()) {
            List<Smash> b2 = this.f8185a.b();
            Tg tg = new Tg(this.o);
            boolean a2 = tg.a(abstractC4419g3, b2);
            synchronized (this.x) {
                if (a2) {
                    if (t()) {
                        i(abstractC4419g3);
                    }
                }
                if (tg.a(b2)) {
                    i(tg.c(b2));
                }
            }
        }
        this.b.put(abstractC4419g3.c(), Z1.a.ISAuctionPerformanceLoadedSuccessfully);
        if (a(f.LOADING, f.READY_TO_SHOW)) {
            long a3 = C4385e5.a(this.n);
            if (s()) {
                this.s.f.a(a3);
            } else {
                this.s.f.a(a3, n());
            }
            if (this.o.h().e()) {
                this.r.a(0L);
            }
            if (!this.o.m()) {
                i(abstractC4419g3);
            }
            h(abstractC4419g3);
        }
    }

    protected void a(f fVar) {
        synchronized (this.x) {
            IronLog.INTERNAL.verbose("set current state to = " + fVar);
            this.p = fVar;
        }
    }

    protected void g(AbstractC4419g3<?> abstractC4419g3) {
        this.t.d(abstractC4419g3.f());
    }

    protected boolean a(f fVar, f fVar2) {
        boolean z;
        synchronized (this.x) {
            if (this.p == fVar) {
                IronLog.INTERNAL.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                this.p = fVar2;
                z = true;
            } else {
                IronLog.INTERNAL.verbose("wrong state, current state = " + this.p + ", expected state = " + fVar);
                z = false;
            }
        }
        return z;
    }

    protected void a(K0 k0) {
        this.t = k0;
    }

    protected BaseAdAdapter<?, Listener> a(NetworkSettings networkSettings, IronSource.a aVar) {
        BaseAdAdapter<?, Listener> baseAdAdapter = (BaseAdAdapter<?, Listener>) com.ironsource.mediationsdk.c.d().a(networkSettings, aVar, h());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    protected void a(boolean z, boolean z2, AbstractC4419g3<?> abstractC4419g3) {
        synchronized (this.x) {
            Boolean bool = this.z;
            if (bool == null || bool.booleanValue() != z) {
                this.z = Boolean.valueOf(z);
                long j = 0;
                if (this.y != 0) {
                    j = new Date().getTime() - this.y;
                }
                this.y = new Date().getTime();
                this.s.f.a(z, j, z2);
                AdInfo f2 = abstractC4419g3 != null ? abstractC4419g3.f() : this.A;
                this.A = f2;
                K0 k0 = this.t;
                if (!z) {
                    f2 = null;
                }
                k0.a(z, f2);
            }
        }
    }

    private boolean c(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (this.f8185a.a(adapterBaseInterface, this.o.b(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit(networkSettings.isBidder(this.o.b()));
    }

    private boolean b(B0 b0) {
        return !new ArrayList(Arrays.asList(B0.INIT_STARTED, B0.LOAD_AD, B0.AUCTION_REQUEST, B0.AUCTION_REQUEST_WATERFALL, B0.AUCTION_FAILED_NO_CANDIDATES, B0.COLLECT_TOKEN, B0.COLLECT_TOKENS_COMPLETED, B0.COLLECT_TOKENS_FAILED, B0.INSTANCE_COLLECT_TOKEN, B0.INSTANCE_COLLECT_TOKEN_SUCCESS, B0.INSTANCE_COLLECT_TOKEN_FAILED, B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(b0);
    }

    private boolean c(B0 b0) {
        return new ArrayList(Arrays.asList(B0.LOAD_AD_SUCCESS, B0.LOAD_AD_FAILED, B0.LOAD_AD_FAILED_WITH_REASON, B0.AUCTION_SUCCESS, B0.AUCTION_FAILED, B0.AUCTION_FAILED_NO_CANDIDATES, B0.AD_FORMAT_CAPPED, B0.AD_OPENED, B0.SHOW_AD, B0.SHOW_AD_FAILED, B0.AD_CLICKED, B0.RELOAD_AD_FAILED_WITH_REASON, B0.RELOAD_AD_SUCCESS, B0.AD_LEFT_APPLICATION)).contains(b0);
    }

    @Override // com.ironsource.InterfaceC4558o
    public void a() {
        if (this.o.h().e()) {
            a(f.READY_TO_LOAD);
            b(true);
            x();
        }
    }

    protected void b(C4561o2 c4561o2, String str) {
        if (c4561o2 != null) {
            V8 a2 = c4561o2.a(str);
            if (a2 != null) {
                for (ImpressionDataListener impressionDataListener : new HashSet(this.B.a())) {
                    IronLog.CALLBACK.info(b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + a2));
                    impressionDataListener.onImpressionSuccess(a2);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.error(b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
        E0 e0 = this.s;
        if (e0 != null) {
            e0.j.g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
        }
    }

    @Override // com.ironsource.Bc
    public void a(boolean z) {
        if (!this.j || this.o.h().f()) {
            return;
        }
        IronLog.INTERNAL.verbose("network availability changed to - " + z);
        if (c(z)) {
            a(z, false, (AbstractC4419g3<?>) null);
        }
    }

    @Override // com.ironsource.InterfaceC4590pd
    public boolean c() {
        R9 r9 = this.J;
        if (r9 == null || r9 == Thread.currentThread()) {
            return false;
        }
        return this.o.l();
    }

    protected LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.NONE;
    }

    private String a(List<C4561o2> list, String str) {
        IronLog.INTERNAL.verbose(b("waterfall.size() = " + list.size()));
        this.b.clear();
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            C4561o2 c4561o2 = list.get(i);
            Smash a2 = a(c4561o2, str);
            if (a2 != null) {
                copyOnWriteArrayList.add(a2);
                sb.append(a(c4561o2, a2.l()));
            }
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        this.f8185a.a(this.o.h().a(), copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + ((Object) sb)));
        return sb.toString();
    }

    private void b(JSONObject jSONObject) {
        int i;
        try {
            if (jSONObject == null) {
                this.o.b(false);
                IronLog.INTERNAL.verbose(b("loading configuration from auction response is null, using the following: " + this.o.r()));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.x) && (i = jSONObject.getInt(com.ironsource.mediationsdk.d.x)) > 0) {
                    this.o.a(i);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.y)) {
                    this.o.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.y));
                }
                this.o.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.z, false));
            } catch (JSONException e2) {
                C4491k4.d().a(e2);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.o.b() + " Error: " + e2.getMessage());
                ironLog.verbose(b(this.o.r()));
            }
        } finally {
            IronLog.INTERNAL.verbose(b(this.o.r()));
        }
    }

    @Override // com.ironsource.Og
    public void a(int i) {
        this.s.j.v("waterfalls hold too many with size = " + i);
    }

    private Smash a(C4561o2 c4561o2, String str) {
        NetworkSettings a2 = this.o.a(c4561o2.c());
        if (a2 != null) {
            com.ironsource.mediationsdk.c.d().b(a2, this.o.b(), h());
            BaseAdAdapter<?, Listener> a3 = a(a2, this.o.b());
            if (a3 != null) {
                Smash a4 = a(a2, a3, this.C.a(this.o.b()), str, c4561o2);
                this.b.put(c4561o2.c(), Z1.a.ISAuctionPerformanceDidntAttemptToLoad);
                return a4;
            }
            IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + a2.getProviderInstanceName()));
        } else {
            String str2 = "could not find matching provider settings for auction response item - item = " + c4561o2.c() + " state = " + this.p;
            IronLog.INTERNAL.error(b(str2));
            this.s.j.i(str2);
        }
        return null;
    }

    protected String b(String str) {
        String str2 = this.o.b().name() + " state:" + this.p;
        return TextUtils.isEmpty(str) ? str2 : str2 + " - " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            hashMap.put("spId", networkSettings.getSubProviderId());
            hashMap.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.o.b())));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(m()));
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e2);
        }
        return hashMap;
    }

    protected void a(int i, String str, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(f.READY_TO_LOAD);
        ironLog.verbose(b("errorCode = " + i + ", errorReason = " + str));
        if (this.o.h().f()) {
            if (!z) {
                this.s.f.a(C4385e5.a(this.n), i, str, n());
            }
            a(new IronSourceError(i, str));
        } else {
            if (!z) {
                this.s.j.b(i, str);
            }
            b(false);
        }
        this.q.e();
    }

    protected void a(AbstractC4419g3<?> abstractC4419g3, AdInfo adInfo) {
        this.t.c(adInfo);
    }

    protected void a(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.l.a().b(this.o.b(), ironSourceError);
    }

    protected AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.o.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC4544n3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        C4598q3 c4598q3 = new C4598q3();
        e eVar = new e(map, sb, list);
        this.s.g.a();
        c4598q3.a(list2, eVar, this.o.e(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.s.h.a(1005, "No candidates available for auctioning");
            a(A0.e(this.o.b()), "no available ad to load", false);
            return;
        }
        this.s.h.b(str);
        if (this.c != null) {
            int a2 = this.C.a(this.o.b());
            com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.o.b());
            hVar.b(IronSourceUtils.g());
            hVar.a(map);
            hVar.a(list);
            hVar.a(this.d);
            hVar.a(a2);
            hVar.a(this.v);
            hVar.d(this.G);
            Rf rf = this.H;
            if (rf != null && rf.c()) {
                z = true;
            }
            hVar.e(z);
            a(ContextProvider.getInstance().getApplicationContext(), hVar, this);
            return;
        }
        ironLog.error(b("mAuctionHandler is null"));
    }

    protected void a(Context context, com.ironsource.mediationsdk.h hVar, S1 s1) {
        com.ironsource.mediationsdk.e eVar = this.c;
        if (eVar != null) {
            eVar.a(context, hVar, s1);
        } else {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    @Override // com.ironsource.S1
    public void a(List<C4561o2> list, String str, C4561o2 c4561o2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (v()) {
            this.f = "";
            this.e = i;
            this.h = c4561o2;
            this.g = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                this.s.j.a(i2, str2);
            }
            a(jSONObject2);
            if (this.u.a(this.o.b())) {
                this.s.h.a(str);
                a(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
                return;
            }
            String a2 = a(list, str);
            this.s.h.a(j, this.o.r() + ";wtf=" + list.size());
            this.s.h.c(a2);
            a(f.LOADING);
            z();
            return;
        }
        ironLog.error(b("unexpected auction success for auctionId - " + str + " state = " + this.p));
        this.s.j.k("unexpected auction success, state = " + this.p);
    }

    @Override // com.ironsource.S1
    public void a(int i, String str, int i2, String str2, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (v()) {
            String str3 = "Auction failed (error " + i + " - " + str + ")";
            ironLog.verbose(b(str3));
            IronSourceUtils.i(i() + ": " + str3);
            this.e = i2;
            this.f = str2;
            this.g = new JSONObject();
            if (this.o.d().n()) {
                ironLog.verbose(b("Moving to fallback waterfall"));
                I();
            }
            this.s.h.a(j, i, str);
            a(f.LOADING);
            z();
            return;
        }
        String str4 = "unexpected auction fail - error = " + i + ", " + str + " state = " + this.p;
        ironLog.error(b(str4));
        this.s.j.j(str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    @Override // com.ironsource.P0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(IronSourceError ironSourceError, AbstractC4419g3<?> abstractC4419g3) {
        Ug<Smash> B;
        AbstractC4419g3<?> c2;
        synchronized (this.x) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(b(abstractC4419g3.k() + " - error = " + ironSourceError));
            if (abstractC4419g3.h().equals(this.f8185a.c()) && this.p != f.AUCTION) {
                this.b.put(abstractC4419g3.c(), Z1.a.ISAuctionPerformanceFailedToLoad);
                if (!w() && !u()) {
                    B = null;
                    if (B != null) {
                        return;
                    }
                    if (this.o.m()) {
                        synchronized (this.x) {
                            if (B.b() && t() && (c2 = new Tg(this.o).c(this.f8185a.b())) != null) {
                                i(c2);
                            }
                        }
                    }
                    Iterator<Smash> it = B.a().iterator();
                    while (it.hasNext()) {
                        it.next().E();
                    }
                    return;
                }
                B = B();
                if (B.c()) {
                    a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
                    return;
                }
                if (B != null) {
                }
            }
            ironLog.error(b("onAdLoadFailed was invoked from " + abstractC4419g3.c() + " with state =" + this.p + " auctionId: " + abstractC4419g3.h() + " and the current id is " + this.f8185a.c()));
            this.s.j.o("onAdLoadFailed was invoked with state =" + this.p);
        }
    }

    @Override // com.ironsource.P0
    public void a(AbstractC4419g3<?> abstractC4419g3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC4419g3.k()));
        this.s.i.g(k());
        this.f8185a.a(abstractC4419g3);
        this.f8185a.b(abstractC4419g3);
        this.l.a(abstractC4419g3);
        if (this.l.b(abstractC4419g3)) {
            ironLog.verbose(b(abstractC4419g3.c() + " was session capped"));
            abstractC4419g3.N();
            IronSourceUtils.i(abstractC4419g3.c() + " was session capped");
        }
        this.F.a(ContextProvider.getInstance().getApplicationContext(), k(), this.o.b());
        if (this.E.c(ContextProvider.getInstance().getApplicationContext(), this.i, this.o.b())) {
            ironLog.verbose(b("placement " + k() + " is capped"));
            this.s.i.b(k(), null);
        }
        this.D.b(this.o.b());
        if (this.o.q()) {
            C4561o2 i = abstractC4419g3.i();
            this.c.a(i, abstractC4419g3.l(), this.h, k());
            this.b.put(abstractC4419g3.c(), Z1.a.ISAuctionPerformanceShowedSuccessfully);
            if (E()) {
                b(i, k());
            }
        }
        g(abstractC4419g3);
        if (this.o.h().e()) {
            b(false);
        }
        this.q.h();
    }

    public Map<String, Object> a(B0 b0) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.g;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put("genericParams", this.g);
        }
        hashMap.put("sessionDepth", Integer.valueOf(this.C.a(this.o.b())));
        if (c(b0)) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.e));
            if (!TextUtils.isEmpty(this.f)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f);
            }
        }
        if (b(b0) && !TextUtils.isEmpty(this.f8185a.c())) {
            hashMap.put("auctionId", this.f8185a.c());
        }
        return hashMap;
    }

    public void a(C4293aa c4293aa) {
        this.v = c4293aa;
    }

    private void a(JSONObject jSONObject) {
        this.u.a(this.o.b(), jSONObject != null ? jSONObject.optBoolean(com.ironsource.mediationsdk.d.f, false) : false);
        b(jSONObject);
    }

    protected String a(C4561o2 c4561o2, int i) {
        return String.format("%s%s", Integer.valueOf(i), c4561o2.c());
    }

    public void a(Rf rf) {
        this.H = rf;
        if (rf != null) {
            this.G = true;
        } else {
            this.G = false;
        }
        this.z = null;
    }

    @Override // com.ironsource.InterfaceC4562o3
    public void a(NetworkSettings networkSettings) {
        AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.d().b(networkSettings, this.o.b(), h());
        if (b2 != null) {
            this.s.g.b(b(networkSettings, b2));
        }
    }

    @Override // com.ironsource.InterfaceC4562o3
    public void a(String str) {
        this.s.j.g(str);
    }

    @Override // com.ironsource.InterfaceC4590pd
    public void a(Runnable runnable) {
        R9 r9 = this.J;
        if (r9 != null) {
            r9.a(runnable);
        }
    }
}
