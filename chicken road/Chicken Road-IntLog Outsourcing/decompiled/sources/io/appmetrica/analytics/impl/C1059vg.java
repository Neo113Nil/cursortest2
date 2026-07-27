package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.vg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1059vg implements InterfaceC0904pg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f9474a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9475b;

    /* renamed from: c, reason: collision with root package name */
    public C0981sg f9476c;

    public C1059vg() {
        this(C1027ua.k().u());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0904pg
    public final synchronized void a(C0981sg c0981sg) {
        if (c0981sg != null) {
            try {
                LoggerStorage.getMainPublicOrAnonymousLogger().info("Received referrer from source %s: %s", c0981sg.f9259d.f9177a, c0981sg.f9256a);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9476c = c0981sg;
        this.f9475b = true;
        Iterator it = this.f9474a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0774kg) it.next()).a(this.f9476c);
        }
        this.f9474a.clear();
    }

    public C1059vg(C0930qg c0930qg) {
        this.f9474a = new HashSet();
        c0930qg.a(new Bl(this));
        c0930qg.a();
    }

    public final synchronized void a(InterfaceC0774kg interfaceC0774kg) {
        this.f9474a.add(interfaceC0774kg);
        if (this.f9475b) {
            interfaceC0774kg.a(this.f9476c);
            this.f9474a.remove(interfaceC0774kg);
        }
    }
}
