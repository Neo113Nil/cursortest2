package com.mbridge.msdk.tracker.network.toolbox;

import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: OKHttpStack.java */
/* loaded from: classes6.dex */
public class m extends a {

    /* renamed from: a, reason: collision with root package name */
    private final v f10020a = a();

    private static z a(t tVar) {
        byte[] b;
        if (tVar == null || (b = tVar.b()) == null) {
            return null;
        }
        return z.a(null, b);
    }

    @Override // com.mbridge.msdk.tracker.network.toolbox.a
    public g a(t<?> tVar, Map<String, String> map) throws IOException {
        p h = tVar.h();
        if (this.f10020a != null) {
            int q = tVar.q() <= 0 ? 30000 : tVar.q();
            long r = tVar.r();
            String a2 = tVar.g() == 0 ? d.a(tVar.t(), tVar) : tVar.t();
            if (h != null) {
                h.f(a2);
                long j = q;
                h.e(j);
                h.f(j);
                h.j(j);
                h.a(tVar.n());
            }
            a(tVar, h);
            ArrayList arrayList = new ArrayList();
            arrayList.add(w.HTTP_1_1);
            arrayList.add(w.HTTP_2);
            v.b a3 = this.f10020a.s().a(arrayList).a(new MBridgeHostnameVerifier(a2));
            long j2 = q;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            v.b a4 = a3.d(j2, timeUnit).b(j2, timeUnit).a(h == null ? com.mbridge.msdk.thrid.okhttp.n.f9941a : new j(h.H(), h.b(), h)).e(j2, timeUnit).a(Math.max(r, 0L), timeUnit);
            a(h, a4);
            y.a aVar = new y.a();
            for (Map.Entry<String, String> entry : tVar.f().entrySet()) {
                aVar.a(entry.getKey(), entry.getValue());
            }
            aVar.a(HttpHeaders.CONNECTION, "close");
            a(aVar, tVar);
            a0 d = a4.a().a(aVar.b(a2).a()).d();
            r m = d.m();
            ArrayList arrayList2 = new ArrayList();
            int b = m.b();
            for (int i = 0; i < b; i++) {
                String a5 = m.a(i);
                String b2 = m.b(i);
                if (a5 != null) {
                    arrayList2.add(new com.mbridge.msdk.tracker.network.g(a5, b2));
                }
            }
            b0 d2 = d.d();
            if (d2 == null) {
                return new g(d.k(), arrayList2);
            }
            return new g(d.k(), arrayList2, a(d2), d2.d());
        }
        throw new IOException("okhttp client is null");
    }

    private static void a(p pVar, v.b bVar) {
        if (pVar == null || bVar == null) {
            return;
        }
        try {
            bVar.a(new OKHTTPEventListener(pVar));
        } catch (Exception unused) {
        }
    }

    private static void a(t<?> tVar, p pVar) {
        if (pVar == null || tVar == null) {
            return;
        }
        try {
            pVar.g(tVar.m());
        } catch (Exception unused) {
        }
    }

    private int a(b0 b0Var) {
        if (b0Var == null) {
            return 0;
        }
        if (b0Var.k() > 2147483647L) {
            return -1;
        }
        return (int) b0Var.k();
    }

    private v a() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        com.mbridge.msdk.thrid.okhttp.m mVar = new com.mbridge.msdk.thrid.okhttp.m(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false)));
        mVar.b(50);
        mVar.a(256);
        v.b bVar = new v.b();
        bVar.d(30L, timeUnit);
        bVar.b(30L, timeUnit);
        bVar.e(30L, timeUnit);
        bVar.b(true);
        bVar.a(new com.mbridge.msdk.thrid.okhttp.i(32, 5L, TimeUnit.MINUTES));
        bVar.a(mVar);
        return bVar.a();
    }

    private static void a(y.a aVar, t<?> tVar) throws IOException {
        switch (tVar.g()) {
            case 0:
                aVar.c();
                return;
            case 1:
                z a2 = a(tVar);
                if (a2 != null) {
                    aVar.c(a2);
                    return;
                }
                throw new IOException("can't create request body for post");
            case 2:
                z a3 = a(tVar);
                if (a3 != null) {
                    aVar.d(a3);
                    return;
                }
                throw new IOException("can't create request body for put");
            case 3:
                aVar.b();
                return;
            case 4:
                aVar.d();
                return;
            case 5:
                aVar.a("OPTIONS", (z) null);
                return;
            case 6:
                aVar.a("TRACE", (z) null);
                return;
            case 7:
                z a4 = a(tVar);
                if (a4 != null) {
                    aVar.b(a4);
                    return;
                }
                throw new IOException("can't create request body for patch");
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }
}
