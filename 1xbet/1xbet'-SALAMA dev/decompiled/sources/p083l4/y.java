package p083l4;

import A1.C0011c;
import B.v;
import O1.k;
import W5.AbstractC0486a1;
import android.support.v4.media.session.t;
import com.google.android.gms.common.internal.w;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p091m4.b;
import p158w4.c;
import q6.a;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static long f15025k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f15026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15027b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15028c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15029d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f15030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f15031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScheduledFuture f15032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ScheduledFuture f15033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L4.b f15034i;
    public final t j;

    public y(A0.b bVar, C0011c c0011c, String str, String str2, k kVar, String str3) {
        this.f15034i = (L4.b) bVar.f21c;
        this.f15031f = kVar;
        long j = f15025k;
        f15025k = 1 + j;
        this.j = new t((v) bVar.f24f, "WebSocket", AbstractC0486a1.g("ws_", j), 24);
        str = str == null ? (String) c0011c.f333c : str;
        String str4 = c0011c.f332b ? "wss" : "ws";
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append("://");
        sb.append(str);
        sb.append("/.ws?ns=");
        String strI = p031e1.k.i(sb, (String) c0011c.f334d, "&v=5");
        URI uriCreate = URI.create(str3 != null ? p031e1.k.f(strI, "&ls=", str3) : strI);
        HashMap map = new HashMap();
        map.put("User-Agent", bVar.f20b);
        map.put("X-Firebase-GMPID", (String) bVar.f25g);
        map.put("X-Firebase-AppCheck", str2);
        this.f15026a = new w(this, new c(bVar, uriCreate, map));
    }

    public static void a(y yVar) {
        if (!yVar.f15028c) {
            t tVar = yVar.j;
            if (tVar.r0()) {
                tVar.W(null, "closing itself", new Object[0]);
            }
            yVar.f();
        }
        yVar.f15026a = null;
        ScheduledFuture scheduledFuture = yVar.f15032g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void b(String str) {
        t tVar = this.j;
        b bVar = this.f15030e;
        if (bVar.f15281x) {
            throw new IllegalStateException("Trying to add string after reading");
        }
        if (str.length() > 0) {
            bVar.f15275a.add(str);
        }
        long j = this.f15029d - 1;
        this.f15029d = j;
        if (j == 0) {
            try {
                b bVar2 = this.f15030e;
                if (bVar2.f15281x) {
                    throw new IllegalStateException("Trying to freeze frozen StringListReader");
                }
                bVar2.f15281x = true;
                HashMap mapC = a.c(bVar2.toString());
                this.f15030e = null;
                if (tVar.r0()) {
                    tVar.W(null, "handleIncomingFrame complete frame: " + mapC, new Object[0]);
                }
                this.f15031f.j(mapC);
            } catch (IOException e7) {
                tVar.a0("Error parsing frame: " + this.f15030e.toString(), e7);
                c();
                f();
            } catch (ClassCastException e8) {
                tVar.a0("Error parsing frame (cast error): " + this.f15030e.toString(), e8);
                c();
                f();
            }
        }
    }

    public final void c() {
        t tVar = this.j;
        if (tVar.r0()) {
            tVar.W(null, "websocket is being closed", new Object[0]);
        }
        this.f15028c = true;
        ((c) this.f15026a.f11335b).a();
        ScheduledFuture scheduledFuture = this.f15033h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture scheduledFuture2 = this.f15032g;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
    }

    public final void d(int i7) {
        this.f15029d = i7;
        this.f15030e = new b();
        t tVar = this.j;
        if (tVar.r0()) {
            tVar.W(null, "HandleNewFrameCount: " + this.f15029d, new Object[0]);
        }
    }

    public final void e() {
        if (this.f15028c) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f15032g;
        t tVar = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            if (tVar.r0()) {
                tVar.W(null, "Reset keepAlive. Remaining: " + this.f15032g.getDelay(TimeUnit.MILLISECONDS), new Object[0]);
            }
        } else if (tVar.r0()) {
            tVar.W(null, "Reset keepAlive", new Object[0]);
        }
        this.f15032g = this.f15034i.schedule(new v(this, 1), 45000L, TimeUnit.MILLISECONDS);
    }

    public final void f() {
        this.f15028c = true;
        boolean z4 = this.f15027b;
        k kVar = this.f15031f;
        kVar.f4972c = null;
        t tVar = (t) kVar.f4974e;
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
