package w1;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class D1 extends H1 {

    /* renamed from: D, reason: collision with root package name */
    public ArrayList f17320D;

    public static void m(D1 d12, C2 c22) {
        Iterator it = d12.f17320D.iterator();
        while (it.hasNext()) {
            P1 p12 = (P1) it.next();
            p12.getClass();
            if (c22.a().equals(D2.FLUSH_FRAME)) {
                r2 r2Var = (r2) c22.f17316c;
                if (!"Session Finalized".equals(r2Var.f17843d)) {
                    if (!"Sticky set is complete".equals(r2Var.f17843d)) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        P1.b(p12.f17503h, elapsedRealtime, "Flush In Middle");
                        p12.f(w2.c(p12.f17502g, p12.j, p12.f17503h, elapsedRealtime));
                    }
                    C2 c23 = (C2) p12.f17496a.get(D2.SESSION_ID);
                    if (c23 != null) {
                        p12.i(c23);
                    }
                }
            } else {
                if (c22.a().equals(D2.REPORTING)) {
                    C1692e2 c1692e2 = (C1692e2) c22.f17316c;
                    int i7 = O1.f17482a[t.e.e(p12.f17505k)];
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    if (i7 == 5) {
                                        if (P1.g(c1692e2)) {
                                            p12.f17499d = c1692e2.f17699y;
                                            p12.a(2);
                                            p12.c(c1692e2);
                                        } else if (t.e.b(c1692e2.f17694c, 3) && t.e.b(c1692e2.f17698x, 1)) {
                                            p12.a(4);
                                            p12.c(c1692e2);
                                        }
                                    }
                                } else if (P1.g(c1692e2)) {
                                    p12.j();
                                    p12.a(2);
                                    p12.c(c1692e2);
                                } else if (t.e.b(c1692e2.f17694c, 3) && t.e.b(c1692e2.f17698x, 1)) {
                                    p12.d();
                                    p12.f17504i = Long.MIN_VALUE;
                                    p12.a(4);
                                }
                            } else if (P1.g(c1692e2)) {
                                p12.j();
                                p12.a(2);
                                p12.c(c1692e2);
                            } else if (t.e.b(c1692e2.f17694c, 3) && t.e.b(c1692e2.f17698x, 2)) {
                                p12.e(c1692e2.f17697f);
                                p12.a(5);
                            }
                        } else if (P1.g(c1692e2)) {
                            p12.d();
                            p12.f17504i = Long.MIN_VALUE;
                            p12.a(2);
                        }
                    } else if (t.e.b(c1692e2.f17694c, 2)) {
                        if (p12.f17499d && !c1692e2.f17699y) {
                            p12.f17499d = false;
                        }
                        if (t.e.b(c1692e2.f17694c, 2) && t.e.b(c1692e2.f17698x, 2) && (p12.f17499d || !c1692e2.f17699y)) {
                            p12.e(c1692e2.f17697f);
                            p12.a(3);
                        }
                    }
                }
                if (c22.a().equals(D2.ANALYTICS_ERROR) && ((X1) c22.f17316c).f17597z == 3) {
                    p12.d();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    p12.f17504i = elapsedRealtime2;
                    if (p12.f17502g > 0) {
                        P1.b(p12.f17503h, elapsedRealtime2, "Process Crash");
                        p12.f(w2.c(p12.f17502g, p12.j, p12.f17503h, p12.f17504i));
                    }
                }
                if (c22.a().equals(D2.CCPA_DELETION)) {
                    p12.i(R1.d(9));
                }
                D2 a2 = c22.a();
                if (p12.f17496a.containsKey(a2)) {
                    c22.b();
                    p12.f17496a.put(a2, c22);
                }
                if (!p12.f17497b.get()) {
                    Iterator it2 = p12.f17496a.entrySet().iterator();
                    boolean z4 = true;
                    while (it2.hasNext()) {
                        if (((Map.Entry) it2.next()).getValue() == null) {
                            z4 = false;
                        }
                    }
                    if (z4) {
                        p12.f17497b.set(true);
                        p12.i(R1.d(2));
                        int h6 = AbstractC1707i1.h(Integer.MIN_VALUE, "last_streaming_http_error_code");
                        String k7 = AbstractC1707i1.k("last_streaming_http_error_message", "");
                        String k8 = AbstractC1707i1.k("last_streaming_http_report_identifier", "");
                        if (h6 != Integer.MIN_VALUE) {
                            AbstractC1706i0.i(k7, h6, k8, false);
                            AbstractC1707i1.l("last_streaming_http_error_code");
                            AbstractC1707i1.l("last_streaming_http_error_message");
                            AbstractC1707i1.l("last_streaming_http_report_identifier");
                        }
                        int h7 = AbstractC1707i1.h(Integer.MIN_VALUE, "last_legacy_http_error_code");
                        String k9 = AbstractC1707i1.k("last_legacy_http_error_message", "");
                        String k10 = AbstractC1707i1.k("last_legacy_http_report_identifier", "");
                        if (h7 != Integer.MIN_VALUE) {
                            AbstractC1706i0.i(k9, h7, k10, false);
                            AbstractC1707i1.l("last_legacy_http_error_code");
                            AbstractC1707i1.l("last_legacy_http_error_message");
                            AbstractC1707i1.l("last_legacy_http_report_identifier");
                        }
                        AbstractC1707i1.f("last_streaming_session_id", p12.f17502g);
                        new HashMap().put("streaming.session.id", String.valueOf(p12.f17502g));
                        synchronized (AbstractC1706i0.class) {
                        }
                    }
                }
                if (p12.f17497b.get() && c22.a().equals(D2.NOTIFICATION)) {
                    Collections.emptyMap();
                    p12.i(R1.d(8));
                }
            }
        }
    }

    @Override // w1.H1, w1.C1
    public final int a(W1 w12) {
        d(new com.flurry.android.marketing.messaging.notification.b(18, this, w12));
        return super.a(w12);
    }

    @Override // w1.H1
    public final void i(C2 c22) {
        d(new com.flurry.android.marketing.messaging.notification.b(17, this, c22));
    }
}
