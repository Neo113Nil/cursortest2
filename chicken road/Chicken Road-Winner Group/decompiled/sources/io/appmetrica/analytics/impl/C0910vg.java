package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.vg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0910vg implements InterfaceC0755pg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f8519a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8520b;

    /* renamed from: c, reason: collision with root package name */
    public C0832sg f8521c;

    public C0910vg() {
        this(C0878ua.k().u());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0755pg
    public final synchronized void a(C0832sg c0832sg) {
        if (c0832sg != null) {
            try {
                LoggerStorage.getMainPublicOrAnonymousLogger().info("Received referrer from source %s: %s", c0832sg.f8311d.f8233a, c0832sg.f8308a);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8521c = c0832sg;
        this.f8520b = true;
        Iterator it = this.f8519a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0625kg) it.next()).a(this.f8521c);
        }
        this.f8519a.clear();
    }

    public C0910vg(C0781qg c0781qg) {
        this.f8519a = new HashSet();
        c0781qg.a(new Bl(this));
        c0781qg.a();
    }

    public final synchronized void a(InterfaceC0625kg interfaceC0625kg) {
        this.f8519a.add(interfaceC0625kg);
        if (this.f8520b) {
            interfaceC0625kg.a(this.f8521c);
            this.f8519a.remove(interfaceC0625kg);
        }
    }
}
