package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public final class f1 extends t0 {
    public final String q;
    public final com.fyber.inneractive.sdk.bidder.adm.y r;
    public int s;
    public final com.fyber.inneractive.sdk.response.e t;
    public final com.fyber.inneractive.sdk.config.global.r u;
    public final com.fyber.inneractive.sdk.network.timeouts.request.a v;

    public f1(com.fyber.inneractive.sdk.bidder.adm.v vVar, String str, com.fyber.inneractive.sdk.bidder.adm.y yVar, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.e eVar) {
        super(vVar, g0.c.a(), rVar);
        UnitDisplayType unitDisplayType;
        this.s = 0;
        this.o = true;
        this.q = str;
        this.r = yVar;
        this.t = eVar;
        this.u = rVar;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.BANNER;
        String name = unitDisplayType2.name();
        Locale locale = Locale.US;
        String lowerCase = name.toLowerCase(locale);
        if (eVar == null || (unitDisplayType = eVar.n) == null) {
            AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = yVar.f5191a;
            if (admParametersOuterClass$AdmParameters != null) {
                lowerCase = com.fyber.inneractive.sdk.util.o1.a(String.valueOf(admParametersOuterClass$AdmParameters.getSpotId()));
            }
        } else {
            lowerCase = (unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.NATIVE) ? unitDisplayType.name().toLowerCase(locale) : unitDisplayType2.name().toLowerCase(locale);
        }
        String str2 = IAConfigManager.R.m;
        com.fyber.inneractive.sdk.config.global.features.k kVar = (com.fyber.inneractive.sdk.config.global.features.k) rVar.a(com.fyber.inneractive.sdk.config.global.features.k.class);
        this.v = TextUtils.isEmpty(str2) ? new com.fyber.inneractive.sdk.network.timeouts.request.b(kVar, lowerCase) : new com.fyber.inneractive.sdk.network.timeouts.request.c(lowerCase, kVar, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i) {
        o0 o0Var = new o0();
        try {
            InputStream inputStream = lVar.c;
            if (inputStream != null) {
                d(System.currentTimeMillis());
                StringBuffer b = com.fyber.inneractive.sdk.util.v.b(inputStream);
                b(System.currentTimeMillis());
                String stringBuffer = b.toString();
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.r.f5191a;
                int a2 = admParametersOuterClass$AdmParameters != null ? admParametersOuterClass$AdmParameters.getAdType().a() : com.fyber.inneractive.sdk.bidder.adm.c.OTHER.a();
                com.fyber.inneractive.sdk.bidder.adm.y yVar = this.r;
                yVar.c = stringBuffer;
                com.fyber.inneractive.sdk.response.e a3 = a(a2, (o) null, yVar);
                a3.h = stringBuffer;
                o0Var.f5505a = a3;
            }
            return o0Var;
        } catch (b e) {
            e = e;
            IAlog.a("failed parse adm network request but will re-try url: %s msg: %s", this.q, e.getMessage());
            b(System.currentTimeMillis());
            throw new t1(e);
        } catch (com.fyber.inneractive.sdk.response.nativead.a e2) {
            b(System.currentTimeMillis());
            throw new n0(e2.getMessage(), e2);
        } catch (SocketTimeoutException e3) {
            e = e3;
            IAlog.a("failed parse adm network request but will re-try url: %s msg: %s", this.q, e.getMessage());
            b(System.currentTimeMillis());
            throw new t1(e);
        } catch (UnknownHostException e4) {
            e = e4;
            IAlog.a("failed parse adm network request but will re-try url: %s msg: %s", this.q, e.getMessage());
            b(System.currentTimeMillis());
            throw new t1(e);
        } catch (Exception e5) {
            b(System.currentTimeMillis());
            IAlog.a("failed parse adm network request url: %s msg: %s", this.q, e5.getMessage());
            throw new n0(e5);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void b(long j) {
        super.b(j);
        IAlog.a("%s : NetworkRequestMarkup : set end read timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(super.q()));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c(long j) {
        super.c(j);
        IAlog.a("%s : NetworkRequestMarkup : set start connection timestamp", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d() {
        super.d();
        IAlog.a("%s : NetworkRequestMarkup cancel by timeout at retry: %d", IAlog.a(this), Integer.valueOf(this.s));
        l0 l0Var = IAConfigManager.R.s;
        this.f5511a = true;
        f1 f1Var = new f1(this);
        if ((l0Var instanceof l0) && l0Var.c(f1Var)) {
            return;
        }
        IAlog.a("%s : NetworkRequestMarkup won't retry - resolve request with `Bidding ad request passed allowed time` at retry: %d", IAlog.a(this), Integer.valueOf(this.s));
        a(null, new Exception("Bidding ad request passed allowed time"), false, null);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return this.v.c();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int j() {
        int q = super.q();
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.v;
        return ((aVar.c() + aVar.f) * this.s) + q;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.config.global.r k() {
        return this.u;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l1 p() {
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.v;
        return new l1(aVar.i, aVar.h);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int q() {
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.q;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int s() {
        return this.v.f;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        if (this.f5511a) {
            return false;
        }
        int i = this.s + 1;
        this.s = i;
        if (i > this.v.b()) {
            IAlog.a("%s : NetworkRequestMarkup Should enable retry - FALSE, current retry: %d total retries: %d, request id: %s", IAlog.a(this), Integer.valueOf(this.s - 1), Integer.valueOf(this.v.b()), this.g);
            return false;
        }
        IAlog.a("%s : NetworkRequestMarkup Should enable retry - TRUE, current retry: %d total retries: %d, request id: %s", IAlog.a(this), Integer.valueOf(this.s - 1), Integer.valueOf(this.v.b()), this.g);
        this.v.a(this.s);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d(long j) {
        super.d(j);
        IAlog.a("%s : NetworkRequestMarkup : set start read timestamp", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l a(String str) {
        IAlog.a("%s : NetworkRequestMarkup Ad request execution started, retry number: %d, timeouts(connection: %d read: %d)", IAlog.a(this), Integer.valueOf(this.s), Integer.valueOf(p().f5501a), Integer.valueOf(p().b));
        return super.a(str);
    }

    public f1(f1 f1Var) {
        super(f1Var);
        this.s = 0;
        this.o = true;
        this.q = f1Var.q;
        this.r = f1Var.r;
        this.t = f1Var.t;
        this.u = f1Var.u;
        this.v = f1Var.v;
        this.s = f1Var.s;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void a(long j) {
        super.a(j);
        IAlog.a("%s : NetworkRequestMarkup : set end connection timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(super.q()));
    }
}
