package com.applovin.impl;

import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.c4;
import com.applovin.impl.e0;
import com.applovin.impl.i6;
import com.applovin.impl.q5;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class r5 extends q5 {
    private final com.applovin.impl.sdk.ad.a r;
    private final long s;
    private boolean t;
    private boolean u;

    class a implements e0.a {
        a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                r5.this.r.q1();
                r5.this.r.a(uri);
            }
        }
    }

    class b implements q5.c {
        b() {
        }

        @Override // com.applovin.impl.q5.c
        public void a(String str) {
            r5.this.r.d(r5.this.c(str));
            r5.this.r.b(true);
            com.applovin.impl.sdk.p pVar = r5.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                r5 r5Var = r5.this;
                r5Var.c.a(r5Var.b, "Finish caching non-video resources for ad #" + r5.this.r.getAdIdNumber());
            }
            r5 r5Var2 = r5.this;
            r5Var2.c.f(r5Var2.b, "Ad updated with cachedHTML = " + r5.this.r.h1());
        }
    }

    public r5(com.applovin.impl.sdk.ad.a aVar, long j, com.applovin.impl.sdk.l lVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, lVar, appLovinAdLoadListener);
        this.r = aVar;
        this.s = j;
    }

    private void j() {
        if (i()) {
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Caching non-optional HTML resources...");
        }
        this.r.d(c(a(this.r.h1(), this.r.V(), this.r)));
        this.r.b(true);
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Finish caching non-optional HTML resources for ad #" + this.r.getAdIdNumber());
        }
        this.c.f(this.b, "Ad HTML updated to reference locally cached non-optional resources = " + this.r.h1());
    }

    private void k() {
        Uri b2;
        if (i() || (b2 = b(this.r.o1())) == null) {
            return;
        }
        this.r.q1();
        this.r.a(b2);
    }

    private d0 l() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Caching HTML resources...");
        }
        return a(this.r.h1(), this.r.V(), new b());
    }

    private e0 m() {
        return a(this.r.o1(), new a());
    }

    private void n() {
        if (i()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.r.J());
        arrayList.addAll(this.r.c0());
        if (CollectionUtils.isEmpty(arrayList)) {
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Caching optional HTML resources...");
        }
        String h1 = this.r.h1();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Caching optional resource: " + str);
            }
            int a2 = this.f4351a.I().a(str, this.g);
            Map a3 = j2.a((AppLovinAdImpl) this.g);
            String a4 = this.f4351a.I().a(com.applovin.impl.sdk.l.p(), str, this.r.getCachePrefix(), this.r.V(), true, true, a2, this.i, a3);
            if (StringUtils.isValidString(a4)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a(this.b, "Updating HTML with cached optional resource: " + a4);
                }
                this.r.a(a4, str);
                h1 = h1.replace(str, a4);
                this.r.d(h1);
            } else {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.b(this.b, "Failed to cache optional resource: " + str);
                }
                a(str, "cacheOptionalHtmlResource", a3);
            }
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Finish caching optional HTML resources for ad #" + this.r.getAdIdNumber());
        }
    }

    private void o() {
        Long l = (Long) this.f4351a.a(c5.a1);
        if (l.longValue() <= 0) {
            e();
            return;
        }
        long e1 = (this.r.e1() - l.longValue()) - (SystemClock.elapsedRealtime() - this.s);
        if (e1 > 0) {
            this.f4351a.s0().a(new x6(this.f4351a, "delayAdLoadSuccessCallback", new Runnable() { // from class: com.applovin.impl.r5$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    r5.this.e();
                }
            }), i6.b.CACHING, e1);
        } else {
            e();
        }
    }

    public void b(boolean z) {
        this.u = z;
    }

    public void c(boolean z) {
        this.t = z;
    }

    @Override // com.applovin.impl.q5, java.lang.Runnable
    public void run() {
        super.run();
        boolean D0 = this.r.D0();
        boolean z = this.u;
        if (D0 || z) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Begin caching for streaming ad #" + this.r.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f4351a.a(c5.J0)).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                if (!D0) {
                    e();
                    d0 l = l();
                    if (l != null) {
                        arrayList.add(l);
                    }
                } else if (this.t) {
                    e();
                    d0 l2 = l();
                    if (l2 != null) {
                        arrayList.add(l2);
                    }
                    e0 m = m();
                    if (m != null) {
                        arrayList.add(m);
                    }
                } else {
                    d0 l3 = l();
                    if (l3 != null) {
                        a(Arrays.asList(l3));
                    }
                    e();
                    e0 m2 = m();
                    if (m2 != null) {
                        arrayList.add(m2);
                    }
                }
                a(arrayList);
                e();
            } else if (D0) {
                if (this.t) {
                    e();
                }
                j();
                if (!this.t) {
                    e();
                }
                k();
            } else {
                e();
                j();
            }
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Begin processing for non-streaming ad #" + this.r.getAdIdNumber() + "...");
            }
            if (this.r.i1() != null) {
                this.r.i1().c(this.i, new c4.a() { // from class: com.applovin.impl.r5$$ExternalSyntheticLambda1
                    @Override // com.applovin.impl.c4.a
                    public final void a(int i) {
                        r5.this.a(i);
                    }
                });
                this.r.i1().b();
            }
            if (((Boolean) this.f4351a.a(c5.J0)).booleanValue()) {
                ArrayList arrayList2 = new ArrayList();
                d0 l4 = l();
                if (l4 != null) {
                    arrayList2.add(l4);
                }
                e0 m3 = m();
                if (m3 != null) {
                    arrayList2.add(m3);
                }
                a(arrayList2);
                o();
                if (this.r.i1() != null) {
                    this.r.i1().a();
                }
                n();
                e();
            } else {
                j();
                k();
                o();
                if (this.r.i1() != null) {
                    this.r.i1().a();
                }
                n();
                e();
            }
        }
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        if (t7.j(com.applovin.impl.sdk.l.p())) {
            str = t7.c(str);
        }
        if (!this.r.isOpenMeasurementEnabled()) {
            return str;
        }
        return this.f4351a.g0().a(str, j2.a((AppLovinAdImpl) this.g));
    }
}
