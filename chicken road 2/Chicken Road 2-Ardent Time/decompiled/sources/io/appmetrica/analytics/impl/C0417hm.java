package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417hm implements io.appmetrica.analytics.impl.InterfaceC0494km {

    /* renamed from: a, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0365fm f6060a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f6061b = new java.util.concurrent.CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC0494km
    public final void a(io.appmetrica.analytics.impl.C0365fm c0365fm) {
        this.f6060a = c0365fm;
        java.util.Iterator it = this.f6061b.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.impl.InterfaceC0494km) it.next()).a(c0365fm);
        }
    }

    public final io.appmetrica.analytics.impl.C0365fm b() {
        io.appmetrica.analytics.impl.C0365fm c0365fm = this.f6060a;
        if (c0365fm != null) {
            return c0365fm;
        }
        kotlin.jvm.internal.i.i("startupState");
        throw null;
    }

    public final void b(io.appmetrica.analytics.impl.InterfaceC0494km interfaceC0494km) {
        this.f6061b.remove(interfaceC0494km);
    }

    public final void a(io.appmetrica.analytics.impl.InterfaceC0494km interfaceC0494km) {
        this.f6061b.add(interfaceC0494km);
        if (this.f6060a != null) {
            io.appmetrica.analytics.impl.C0365fm c0365fm = this.f6060a;
            if (c0365fm != null) {
                interfaceC0494km.a(c0365fm);
            } else {
                kotlin.jvm.internal.i.i("startupState");
                throw null;
            }
        }
    }

    public final void a(android.content.Context context) {
        java.lang.String optStringOrNull;
        io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage<java.lang.Object> create = ((io.appmetrica.analytics.impl.Rm) io.appmetrica.analytics.impl.Pm.a(io.appmetrica.analytics.impl.C0468jm.class)).create(context);
        io.appmetrica.analytics.impl.C0807wo a2 = io.appmetrica.analytics.impl.C0560na.k().D().a();
        synchronized (a2) {
            optStringOrNull = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(a2.f7070a.a(), "device_id");
        }
        a(new io.appmetrica.analytics.impl.C0365fm(optStringOrNull, a2.a(), (io.appmetrica.analytics.impl.C0468jm) create.read()));
    }
}
