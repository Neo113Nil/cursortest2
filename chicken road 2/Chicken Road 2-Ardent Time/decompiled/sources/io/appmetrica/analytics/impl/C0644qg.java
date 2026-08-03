package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644qg implements io.appmetrica.analytics.impl.InterfaceC0488kg {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f6692a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6693b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0566ng f6694c;

    public C0644qg() {
        this(io.appmetrica.analytics.impl.C0560na.k().u());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0488kg
    public final synchronized void a(io.appmetrica.analytics.impl.C0566ng c0566ng) {
        if (c0566ng != null) {
            try {
                io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getMainPublicOrAnonymousLogger().info("Received referrer from source %s: %s", c0566ng.f6536d.f6432a, c0566ng.f6533a);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        this.f6694c = c0566ng;
        this.f6693b = true;
        java.util.Iterator it = this.f6692a.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.impl.InterfaceC0359fg) it.next()).a(this.f6694c);
        }
        this.f6692a.clear();
    }

    public C0644qg(io.appmetrica.analytics.impl.C0514lg c0514lg) {
        this.f6692a = new java.util.HashSet();
        c0514lg.a(new io.appmetrica.analytics.impl.C0830xl(this));
        c0514lg.a();
    }

    public final synchronized void a(io.appmetrica.analytics.impl.InterfaceC0359fg interfaceC0359fg) {
        this.f6692a.add(interfaceC0359fg);
        if (this.f6693b) {
            interfaceC0359fg.a(this.f6694c);
            this.f6692a.remove(interfaceC0359fg);
        }
    }
}
