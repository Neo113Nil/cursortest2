package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.a6;
import com.applovin.impl.c3;
import com.applovin.impl.c5;
import com.applovin.impl.e3;
import com.applovin.impl.i;
import com.applovin.impl.i6;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.n5;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t7;
import com.applovin.impl.u5;
import com.applovin.impl.v3;
import com.applovin.impl.w3;
import com.applovin.impl.x2;
import com.applovin.impl.x3;
import com.applovin.impl.y3;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final l f4325a;
    private final Map b = new HashMap(4);
    private final Object c = new Object();
    private final Map d = new HashMap(4);
    private final Object e = new Object();
    private final Map f = new HashMap();
    private final Object g = new Object();

    class a implements u5.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f4326a;
        final /* synthetic */ Map b;
        final /* synthetic */ String c;
        final /* synthetic */ e3 d;
        final /* synthetic */ Context e;
        final /* synthetic */ a.InterfaceC0077a f;

        a(long j, Map map, String str, e3 e3Var, Context context, a.InterfaceC0077a interfaceC0077a) {
            this.f4326a = j;
            this.b = map;
            this.c = str;
            this.d = e3Var;
            this.e = context;
            this.f = interfaceC0077a;
        }

        @Override // com.applovin.impl.u5.b
        public void a(JSONArray jSONArray) {
            this.b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f4326a));
            this.b.put("calfc", Integer.valueOf(d.this.b(this.c)));
            a6 a6Var = new a6(this.d, jSONArray, this.e, d.this.f4325a, this.f);
            if (((Boolean) d.this.f4325a.a(v3.B8)).booleanValue()) {
                d.this.f4325a.s0().a((n5) a6Var, i6.b.MEDIATION);
            } else {
                d.this.f4325a.s0().a(a6Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements a.InterfaceC0077a {

        /* renamed from: a, reason: collision with root package name */
        private final l f4327a;
        private final WeakReference b;
        private final d c;
        private final c d;
        private final MaxAdFormat e;
        private final Map f;
        private final Map g;
        private final Map h;
        private final int i;
        private long j;
        private long k;

        /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j2, d dVar, l lVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j, j2, dVar, lVar, context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i, String str) {
            this.g.put("retry_delay_sec", Integer.valueOf(i));
            this.g.put("retry_attempt", Integer.valueOf(this.d.c));
            Context context = (Context) this.b.get();
            if (context == null) {
                context = l.p();
            }
            this.h.put("art", i.EXPONENTIAL_RETRY.b());
            this.h.put("era", Integer.valueOf(this.d.c));
            this.k = System.currentTimeMillis();
            this.c.a(str, this.e, this.f, this.g, this.h, context, this);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            this.c.c(str);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f4327a.Z().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError, this.k, elapsedRealtime);
            }
            boolean z = maxError.getCode() == -5603 && t7.c(this.f4327a) && ((Boolean) this.f4327a.a(c5.H6)).booleanValue();
            if (this.f4327a.a(v3.v8, this.e) && this.d.c < this.i && !z) {
                c.e(this.d);
                final int pow = (int) Math.pow(2.0d, this.d.c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.d$b$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.b.this.a(pow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(pow));
                return;
            }
            this.d.c = 0;
            this.d.b.set(false);
            if (this.d.d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                maxErrorImpl.setLoadTag(this.d.f4328a);
                maxErrorImpl.setRequestLatencyMillis(elapsedRealtime);
                x2.a(this.d.d, str, maxError);
                this.d.d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            c3 c3Var = (c3) maxAd;
            c3Var.i(this.d.f4328a);
            c3Var.a(SystemClock.elapsedRealtime() - this.j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) c3Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f4327a.Z().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.k, c3Var.getRequestLatencyMillis());
            }
            this.c.a(maxAd.getAdUnitId());
            this.d.c = 0;
            if (this.d.d == null) {
                this.c.a(c3Var);
                this.d.b.set(false);
                return;
            }
            c3Var.B().c().a(this.d.d);
            this.d.d.onAdLoaded(c3Var);
            if (c3Var.R().endsWith("load")) {
                this.d.d.onAdRevenuePaid(c3Var);
            }
            this.d.d = null;
            if (((Boolean) this.f4327a.a(v3.r8)).booleanValue() || !this.c.a(maxAd)) {
                this.d.b.set(false);
                return;
            }
            Context context = (Context) this.b.get();
            if (context == null) {
                context = l.p();
            }
            this.j = SystemClock.elapsedRealtime();
            this.k = System.currentTimeMillis();
            this.h.put("art", i.SEQUENTIAL_OR_PRECACHE.b());
            this.c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f, this.g, this.h, context, this);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j2, d dVar, l lVar, Context context) {
            this.f4327a = lVar;
            this.b = new WeakReference(context);
            this.c = dVar;
            this.d = cVar;
            this.e = maxAdFormat;
            this.g = map2;
            this.f = map;
            this.h = map3;
            this.j = j;
            this.k = j2;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.i = Math.min(2, ((Integer) lVar.a(v3.u8)).intValue());
            } else {
                this.i = ((Integer) lVar.a(v3.u8)).intValue();
            }
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f4328a;
        private final AtomicBoolean b;
        private int c;
        private volatile a.InterfaceC0077a d;

        /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        static /* synthetic */ int e(c cVar) {
            int i = cVar.c;
            cVar.c = i + 1;
            return i;
        }

        private c(String str) {
            this.b = new AtomicBoolean();
            this.f4328a = str;
        }
    }

    public d(l lVar) {
        this.f4325a = lVar;
    }

    private c3 e(String str) {
        c3 c3Var;
        synchronized (this.e) {
            c3Var = (c3) this.d.get(str);
            this.d.remove(str);
        }
        return c3Var;
    }

    public void c(String str, String str2) {
        synchronized (this.c) {
            this.b.remove(b(str, str2));
        }
    }

    public boolean d(String str) {
        boolean z;
        synchronized (this.e) {
            z = this.d.get(str) != null;
        }
        return z;
    }

    private String b(String str, String str2) {
        return str + (str2 != null ? "-" + str2 : "");
    }

    public int b(String str) {
        int intValue;
        synchronized (this.g) {
            Integer num = (Integer) this.f.get(str);
            intValue = num != null ? num.intValue() : 0;
        }
        return intValue;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, i iVar, Map map, Map map2, Context context, a.InterfaceC0077a interfaceC0077a) {
        c3 c3Var;
        if (this.f4325a.u0().d() || t7.h(l.p())) {
            c3Var = null;
        } else if (interfaceC0077a == null && d(str)) {
            return;
        } else {
            c3Var = e(str);
        }
        if (c3Var != null) {
            c3Var.i(str2);
            c3Var.B().c().a(interfaceC0077a);
            interfaceC0077a.onAdLoaded(c3Var);
            if (c3Var.R().endsWith("load")) {
                interfaceC0077a.onAdRevenuePaid(c3Var);
            }
            if (((Boolean) this.f4325a.a(v3.r8)).booleanValue() && a((MaxAd) c3Var)) {
                return;
            }
        }
        c a2 = a(str, str2);
        if (!a2.b.compareAndSet(false, true)) {
            if (a2.d != null && a2.d != interfaceC0077a) {
                p.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            a2.d = interfaceC0077a;
            return;
        }
        if (c3Var == null) {
            a2.d = interfaceC0077a;
        }
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        synchronizedMap.put("art", iVar.b());
        if (StringUtils.isValidString(str2)) {
            synchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, synchronizedMap, context, new b(map, map2, synchronizedMap, a2, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f4325a, context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        synchronized (this.g) {
            this.f4325a.Q();
            if (p.a()) {
                this.f4325a.Q().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
            }
            Integer num = (Integer) this.f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0077a interfaceC0077a) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        e3 e3Var = new e3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f4325a.s0().a((n5) new u5(e3Var, context, this.f4325a, new a(elapsedRealtime, map3, str, e3Var, context, interfaceC0077a)), i6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f4325a.a(c5.W4)).booleanValue()) {
            y3 a0 = this.f4325a.a0();
            w3 w3Var = w3.e;
            Map a2 = a0.a(w3Var, x3.a(str));
            w3.a aVar = w3.a.SESSION;
            int a3 = a(a2, aVar);
            w3.a aVar2 = w3.a.INSTALL;
            int a4 = a(a2, aVar2);
            Map a5 = this.f4325a.a0().a(w3Var, x3.a(maxAdFormat));
            return new com.applovin.impl.h(a3, a4, a(a5, aVar), a(a5, aVar2));
        }
        return new com.applovin.impl.h(-1, -1, -1, -1);
    }

    private int a(Map map, w3.a aVar) {
        Long l;
        if (map == null || (l = (Long) map.get(aVar.b())) == null) {
            return -1;
        }
        return l.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c3 c3Var) {
        synchronized (this.e) {
            if (this.d.containsKey(c3Var.getAdUnitId())) {
                p.h("AppLovinSdk", "Ad in cache already: " + c3Var.getAdUnitId());
            }
            this.d.put(c3Var.getAdUnitId(), c3Var);
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.c) {
            String b2 = b(str, str2);
            cVar = (c) this.b.get(b2);
            if (cVar == null) {
                cVar = new c(str2, null);
                this.b.put(b2, cVar);
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.g) {
            this.f4325a.Q();
            if (p.a()) {
                this.f4325a.Q().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
            }
            this.f.remove(str);
        }
    }

    public boolean a(MaxAd maxAd) {
        return ((!this.f4325a.c(v3.p8).contains(maxAd.getAdUnitId()) && !this.f4325a.a(v3.o8, maxAd.getFormat())) || this.f4325a.u0().c() || this.f4325a.u0().d()) ? false : true;
    }
}
