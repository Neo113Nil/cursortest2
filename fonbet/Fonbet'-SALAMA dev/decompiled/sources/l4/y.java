package l4;

import A1.C0011c;
import W5.AbstractC0486a1;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m4.C1438b;
import w4.C1777c;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: k, reason: collision with root package name */
    public static long f15019k;

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.gms.common.internal.w f15020a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15021b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15022c = false;

    /* renamed from: d, reason: collision with root package name */
    public long f15023d = 0;

    /* renamed from: e, reason: collision with root package name */
    public C1438b f15024e;

    /* renamed from: f, reason: collision with root package name */
    public final O1.k f15025f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledFuture f15026g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f15027h;

    /* renamed from: i, reason: collision with root package name */
    public final L4.b f15028i;
    public final android.support.v4.media.session.t j;

    public y(A0.b bVar, C0011c c0011c, String str, String str2, O1.k kVar, String str3) {
        this.f15028i = (L4.b) bVar.f21c;
        this.f15025f = kVar;
        long j = f15019k;
        f15019k = 1 + j;
        this.j = new android.support.v4.media.session.t((B.v) bVar.f24f, "WebSocket", AbstractC0486a1.g("ws_", j), 24);
        str = str == null ? (String) c0011c.f333c : str;
        String str4 = c0011c.f332b ? "wss" : "ws";
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append("://");
        sb.append(str);
        sb.append("/.ws?ns=");
        String i7 = e1.k.i(sb, (String) c0011c.f334d, "&v=5");
        URI create = URI.create(str3 != null ? e1.k.f(i7, "&ls=", str3) : i7);
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", bVar.f20b);
        hashMap.put("X-Firebase-GMPID", (String) bVar.f25g);
        hashMap.put("X-Firebase-AppCheck", str2);
        this.f15020a = new com.google.android.gms.common.internal.w(this, new C1777c(bVar, create, hashMap));
    }

    public static void a(y yVar) {
        if (!yVar.f15022c) {
            android.support.v4.media.session.t tVar = yVar.j;
            if (tVar.r0()) {
                tVar.W(null, "closing itself", new Object[0]);
            }
            yVar.f();
        }
        yVar.f15020a = null;
        ScheduledFuture scheduledFuture = yVar.f15026g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void b(String str) {
        android.support.v4.media.session.t tVar = this.j;
        C1438b c1438b = this.f15024e;
        if (c1438b.f15275x) {
            throw new IllegalStateException("Trying to add string after reading");
        }
        if (str.length() > 0) {
            c1438b.f15269a.add(str);
        }
        long j = this.f15023d - 1;
        this.f15023d = j;
        if (j == 0) {
            try {
                C1438b c1438b2 = this.f15024e;
                if (c1438b2.f15275x) {
                    throw new IllegalStateException("Trying to freeze frozen StringListReader");
                }
                c1438b2.f15275x = true;
                HashMap c3 = q6.a.c(c1438b2.toString());
                this.f15024e = null;
                if (tVar.r0()) {
                    tVar.W(null, "handleIncomingFrame complete frame: " + c3, new Object[0]);
                }
                this.f15025f.j(c3);
            } catch (IOException e7) {
                tVar.a0("Error parsing frame: " + this.f15024e.toString(), e7);
                c();
                f();
            } catch (ClassCastException e8) {
                tVar.a0("Error parsing frame (cast error): " + this.f15024e.toString(), e8);
                c();
                f();
            }
        }
    }

    public final void c() {
        android.support.v4.media.session.t tVar = this.j;
        if (tVar.r0()) {
            tVar.W(null, "websocket is being closed", new Object[0]);
        }
        this.f15022c = true;
        ((C1777c) this.f15020a.f11335b).a();
        ScheduledFuture scheduledFuture = this.f15027h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture scheduledFuture2 = this.f15026g;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
    }

    public final void d(int i7) {
        this.f15023d = i7;
        this.f15024e = new C1438b();
        android.support.v4.media.session.t tVar = this.j;
        if (tVar.r0()) {
            tVar.W(null, "HandleNewFrameCount: " + this.f15023d, new Object[0]);
        }
    }

    public final void e() {
        if (this.f15022c) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f15026g;
        android.support.v4.media.session.t tVar = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            if (tVar.r0()) {
                tVar.W(null, "Reset keepAlive. Remaining: " + this.f15026g.getDelay(TimeUnit.MILLISECONDS), new Object[0]);
            }
        } else if (tVar.r0()) {
            tVar.W(null, "Reset keepAlive", new Object[0]);
        }
        this.f15026g = this.f15028i.schedule(new v(this, 1), 45000L, TimeUnit.MILLISECONDS);
    }

    public final void f() {
        this.f15022c = true;
        boolean z4 = this.f15021b;
        O1.k kVar = this.f15025f;
        kVar.f4972c = null;
        android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) kVar.f4974e;
        if (z4 || kVar.f4970a != 1) {
            if (tVar.r0()) {
                tVar.W(null, "Realtime connection lost", new Object[0]);
            }
        } else if (tVar.r0()) {
            tVar.W(null, "Realtime connection failed", new Object[0]);
        }
        kVar.d(2);
    }
}
