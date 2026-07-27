package com.mbridge.msdk.config.component.common.metrics;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.f;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: ComponentMetrics.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    m f8949a;
    x b;
    JSONObject c;

    /* compiled from: ComponentMetrics.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final a f8950a = new a();
    }

    public static a a() {
        return b.f8950a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) throws Exception {
        return true;
    }

    private m c() {
        try {
            m mVar = this.f8949a;
            if (mVar == null) {
                m a2 = m.a("metrics_component", c.n().d(), b());
                this.f8949a = a2;
                if (a2 != null) {
                    JSONObject jSONObject = this.c;
                    if (jSONObject != null) {
                        a2.a(jSONObject);
                    }
                    this.f8949a.h();
                }
            } else {
                JSONObject jSONObject2 = this.c;
                if (jSONObject2 != null) {
                    mVar.a(jSONObject2);
                }
            }
        } catch (Exception e) {
            q0.b("ComponentMetrics", e.getMessage());
        }
        return this.f8949a;
    }

    public void b(Map<String, Object> map) {
        if (map != null) {
            try {
                this.c = new JSONObject(map);
            } catch (Exception e) {
                q0.b("ComponentMetrics", e.getMessage());
            }
        }
    }

    public void d() {
        if (this.f8949a == null) {
            this.f8949a = c();
        }
        this.f8949a.a();
    }

    private a() {
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                String valueOf = String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.c("key")));
                JSONObject jSONObject = new JSONObject(map);
                if (jSONObject.length() > 0) {
                    e eVar = new e(valueOf);
                    eVar.a(jSONObject);
                    eVar.b(0);
                    eVar.a(0);
                    c().d(eVar);
                }
            } catch (Throwable th) {
                q0.b("ComponentMetrics", th.getMessage(), th);
            }
        }
    }

    private x b() {
        if (this.b == null) {
            this.b = new x.b().a(604800000).b(50).d(50).c(15000).e(2).a(new d()).a(new f() { // from class: com.mbridge.msdk.config.component.common.metrics.a$$ExternalSyntheticLambda0
                @Override // com.mbridge.msdk.tracker.f
                public final boolean a(e eVar) {
                    boolean a2;
                    a2 = a.a(eVar);
                    return a2;
                }
            }).a(new n()).a(0, new p(new h(), com.mbridge.msdk.foundation.same.net.utils.d.h().d, 0)).a();
        }
        return this.b;
    }

    public void a(x xVar) {
        if (xVar != null) {
            this.b = xVar;
            m mVar = this.f8949a;
            if (mVar != null) {
                mVar.i();
                m.b("metrics_component");
                this.f8949a = null;
            }
            c();
        }
    }
}
