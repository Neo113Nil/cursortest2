package p155w1;

import android.os.SystemClock;
import com.flurry.android.marketing.messaging.notification.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
public final class D1 extends H1 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList f17326D;

    public static void m(D1 d7, C2 c3) {
        for (P1 p5 : d7.f17326D) {
            p5.getClass();
            if (c3.a().equals(D2.FLUSH_FRAME)) {
                r2 r2Var = (r2) c3.f17322c;
                if (!"Session Finalized".equals(r2Var.f17849d)) {
                    if (!"Sticky set is complete".equals(r2Var.f17849d)) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        P1.b(p5.f17509h, jElapsedRealtime, "Flush In Middle");
                        p5.f(w2.c(p5.f17508g, p5.j, p5.f17509h, jElapsedRealtime));
                    }
                    C2 c4 = (C2) p5.f17502a.get(D2.SESSION_ID);
                    if (c4 != null) {
                        p5.i(c4);
                    }
                }
            } else {
                if (c3.a().equals(D2.REPORTING)) {
                    C0983e2 c0983e2 = (C0983e2) c3.f17322c;
                    int i7 = O1.f17488a[e.e(p5.f17511k)];
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    if (i7 == 5) {
                                        if (P1.g(c0983e2)) {
                                            p5.f17505d = c0983e2.f17705y;
                                            p5.a(2);
                                            p5.c(c0983e2);
                                        } else if (e.b(c0983e2.f17700c, 3) && e.b(c0983e2.f17704x, 1)) {
                                            p5.a(4);
                                            p5.c(c0983e2);
                                        }
                                    }
                                } else if (P1.g(c0983e2)) {
                                    p5.j();
                                    p5.a(2);
                                    p5.c(c0983e2);
                                } else if (e.b(c0983e2.f17700c, 3) && e.b(c0983e2.f17704x, 1)) {
                                    p5.d();
                                    p5.f17510i = Long.MIN_VALUE;
                                    p5.a(4);
                                }
                            } else if (P1.g(c0983e2)) {
                                p5.j();
                                p5.a(2);
                                p5.c(c0983e2);
                            } else if (e.b(c0983e2.f17700c, 3) && e.b(c0983e2.f17704x, 2)) {
                                p5.e(c0983e2.f17703f);
                                p5.a(5);
                            }
                        } else if (P1.g(c0983e2)) {
                            p5.d();
                            p5.f17510i = Long.MIN_VALUE;
                            p5.a(2);
                        }
                    } else if (e.b(c0983e2.f17700c, 2)) {
                        if (p5.f17505d && !c0983e2.f17705y) {
                            p5.f17505d = false;
                        }
                        if (e.b(c0983e2.f17700c, 2) && e.b(c0983e2.f17704x, 2) && (p5.f17505d || !c0983e2.f17705y)) {
                            p5.e(c0983e2.f17703f);
                            p5.a(3);
                        }
                    }
                }
                if (c3.a().equals(D2.ANALYTICS_ERROR) && ((X1) c3.f17322c).f17603z == 3) {
                    p5.d();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    p5.f17510i = jElapsedRealtime2;
                    if (p5.f17508g > 0) {
                        P1.b(p5.f17509h, jElapsedRealtime2, "Process Crash");
                        p5.f(w2.c(p5.f17508g, p5.j, p5.f17509h, p5.f17510i));
                    }
                }
                if (c3.a().equals(D2.CCPA_DELETION)) {
                    p5.i(R1.d(9));
                }
                D2 d2A = c3.a();
                if (p5.f17502a.containsKey(d2A)) {
                    c3.b();
                    p5.f17502a.put(d2A, c3);
                }
                if (!p5.f17503b.get()) {
                    Iterator it = p5.f17502a.entrySet().iterator();
                    boolean z4 = true;
                    while (it.hasNext()) {
                        if (((Map.Entry) it.next()).getValue() == null) {
                            z4 = false;
                        }
                    }
                    if (z4) {
                        p5.f17503b.set(true);
                        p5.i(R1.d(2));
                        int iH = AbstractC0998i1.h(Integer.MIN_VALUE, "last_streaming_http_error_code");
                        String strK = AbstractC0998i1.k("last_streaming_http_error_message", "");
                        String strK2 = AbstractC0998i1.k("last_streaming_http_report_identifier", "");
                        if (iH != Integer.MIN_VALUE) {
                            AbstractC0997i0.i(strK, iH, strK2, false);
                            AbstractC0998i1.l("last_streaming_http_error_code");
                            AbstractC0998i1.l("last_streaming_http_error_message");
                            AbstractC0998i1.l("last_streaming_http_report_identifier");
                        }
                        int iH2 = AbstractC0998i1.h(Integer.MIN_VALUE, "last_legacy_http_error_code");
                        String strK3 = AbstractC0998i1.k("last_legacy_http_error_message", "");
                        String strK4 = AbstractC0998i1.k("last_legacy_http_report_identifier", "");
                        if (iH2 != Integer.MIN_VALUE) {
                            AbstractC0997i0.i(strK3, iH2, strK4, false);
                            AbstractC0998i1.l("last_legacy_http_error_code");
                            AbstractC0998i1.l("last_legacy_http_error_message");
                            AbstractC0998i1.l("last_legacy_http_report_identifier");
                        }
                        AbstractC0998i1.f("last_streaming_session_id", p5.f17508g);
                        new HashMap().put("streaming.session.id", String.valueOf(p5.f17508g));
                        synchronized (AbstractC0997i0.class) {
                        }
                    }
                }
                if (p5.f17503b.get() && c3.a().equals(D2.NOTIFICATION)) {
                    Collections.emptyMap();
                    p5.i(R1.d(8));
                }
            }
        }
    }

    @Override // p155w1.H1, p155w1.C1
    public final int a(W1 w7) {
        d(new b(18, this, w7));
        return super.a(w7);
    }

    @Override // p155w1.H1
    public final void i(C2 c3) {
        d(new b(17, this, c3));
    }
}
