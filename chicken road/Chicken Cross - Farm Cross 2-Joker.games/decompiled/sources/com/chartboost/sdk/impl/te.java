package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.a3;
import com.chartboost.sdk.impl.g3;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.chartboost.sdk.tracking.g;
import io.ktor.http.LinkHeader;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class te implements g3.a {

    /* renamed from: a, reason: collision with root package name */
    public v6 f5016a;
    public final k8 b;
    public final e3 c;
    public final ag d;
    public final AtomicReference e;
    public final l7 f;
    public final EndpointRepository g;
    public final sg h;
    public int i = 1;
    public int j = 0;
    public long k = 0;
    public g3 l = null;
    public AtomicInteger m = null;

    public te(v6 v6Var, k8 k8Var, e3 e3Var, ag agVar, AtomicReference atomicReference, l7 l7Var, EndpointRepository endpointRepository, sg sgVar) {
        this.f5016a = v6Var;
        this.b = k8Var;
        this.c = e3Var;
        this.d = agVar;
        this.e = atomicReference;
        this.f = l7Var;
        this.g = endpointRepository;
        this.h = sgVar;
    }

    public final void a(com.chartboost.sdk.internal.Model.a aVar) {
        boolean z = aVar.r;
        if (this.j != 2 || z) {
            return;
        }
        mb.a("Change state to IDLE", null);
        this.i = 1;
        this.j = 0;
        this.k = 0L;
        this.l = null;
        AtomicInteger atomicInteger = this.m;
        this.m = null;
        if (atomicInteger != null) {
            this.f5016a.a(atomicInteger);
        }
    }

    public synchronized void b() {
        try {
            mb.c("Sdk Version = 9.13.0, Commit: 9f2614187dcec3c79c306d1d893a2402f08eb0be", null);
            com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) this.e.get();
            a(aVar);
            if (!aVar.g() && !aVar.f()) {
                if (this.i == 3) {
                    if (this.m.get() > 0) {
                        return;
                    }
                    mb.a("Change state to COOLDOWN", null);
                    this.i = 4;
                    this.m = null;
                }
                if (this.i == 4) {
                    if (this.k - System.nanoTime() > 0) {
                        mb.a("Prefetch session is still active. Won't be making any new prefetch until the prefetch session expires", null);
                        return;
                    }
                    mb.a("Change state to IDLE", null);
                    this.i = 1;
                    this.j = 0;
                    this.k = 0L;
                }
                if (this.i == 1) {
                    if (!aVar.k()) {
                        mb.b("Did not prefetch because neither native nor webview are enabled.", null);
                        return;
                    }
                    URL endPointUrl = this.g.getEndPointUrl(EndpointRepository.EndPoint.PREFETCH);
                    o3 o3Var = new o3(a3.c.c, com.chartboost.sdk.internal.Networking.b.a(endPointUrl), endPointUrl.getPath(), this.d.build(), ue.e, null, this, this.f.a(), this.h);
                    o3Var.b("cache_assets", this.b.e());
                    o3Var.s = true;
                    mb.a("Change state to AWAIT_PREFETCH_RESPONSE", null);
                    this.i = 2;
                    this.j = 2;
                    this.k = System.nanoTime() + TimeUnit.MINUTES.toNanos(aVar.w);
                    this.l = o3Var;
                    this.c.a(o3Var);
                    return;
                }
                return;
            }
            a();
        } catch (Exception e) {
            if (this.i == 2) {
                mb.a("Change state to COOLDOWN", null);
                this.i = 4;
                this.l = null;
            }
            mb.b(LinkHeader.Rel.Prefetch, e);
        }
    }

    public final synchronized void a() {
        int i = this.i;
        if (i == 2) {
            mb.a("Change state to COOLDOWN", null);
            this.i = 4;
            this.l = null;
            return;
        }
        if (i == 3) {
            mb.a("Change state to COOLDOWN", null);
            this.i = 4;
            AtomicInteger atomicInteger = this.m;
            this.m = null;
            if (atomicInteger != null) {
                this.f5016a.a(atomicInteger);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.g3.a
    public synchronized void a(g3 g3Var, JSONObject jSONObject) {
        try {
            if (this.i == 2 && g3Var == this.l) {
                mb.a("Change state to DOWNLOAD_ASSETS", null);
                this.i = 3;
                this.l = null;
                this.m = new AtomicInteger();
                if (jSONObject != null) {
                    mb.a("Got Asset list for Prefetch from server: " + jSONObject, null);
                    this.f5016a.a(ue.f, t1.b(jSONObject, ((com.chartboost.sdk.internal.Model.a) this.e.get()).o), this.m, null, "");
                }
            }
        } catch (Exception e) {
            mb.b("prefetch onSuccess", e);
        }
    }

    @Override // com.chartboost.sdk.impl.g3.a
    public synchronized void a(g3 g3Var, CBError cBError) {
        String str = "Prefetch failure";
        if (cBError != null) {
            str = cBError.getErrorDesc();
        }
        String str2 = str;
        h7 a2 = this.f.a();
        if (a2 != null) {
            a2.mo4759track(new com.chartboost.sdk.tracking.b(g.f.d, str2, "", "", null));
        }
        if (this.i == 2 && g3Var == this.l) {
            this.l = null;
            mb.a("Change state to COOLDOWN", null);
            this.i = 4;
        }
    }
}
