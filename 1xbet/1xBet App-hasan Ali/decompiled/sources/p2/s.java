package p2;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final String f18733e = f2.m.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f18734a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18735b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18736c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18737d;

    public s() {
        p pVar = new p();
        pVar.f18730a = 0;
        this.f18735b = new HashMap();
        this.f18736c = new HashMap();
        this.f18737d = new Object();
        this.f18734a = Executors.newSingleThreadScheduledExecutor(pVar);
    }

    public final void a(String str, i2.e eVar) {
        synchronized (this.f18737d) {
            f2.m.d().a(f18733e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            r rVar = new r(this, str);
            this.f18735b.put(str, rVar);
            this.f18736c.put(str, eVar);
            this.f18734a.schedule(rVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f18737d) {
            try {
                if (((r) this.f18735b.remove(str)) != null) {
                    f2.m.d().a(f18733e, "Stopping timer for " + str, new Throwable[0]);
                    this.f18736c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
