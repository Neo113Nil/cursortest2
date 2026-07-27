package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.lm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657lm implements InterfaceC0735om {

    /* renamed from: a, reason: collision with root package name */
    public volatile C0605jm f7822a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f7823b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC0735om
    public final void a(C0605jm c0605jm) {
        this.f7822a = c0605jm;
        Iterator it = this.f7823b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0735om) it.next()).a(c0605jm);
        }
    }

    public final C0605jm b() {
        C0605jm c0605jm = this.f7822a;
        if (c0605jm != null) {
            return c0605jm;
        }
        kotlin.jvm.internal.j.g("startupState");
        throw null;
    }

    public final void b(InterfaceC0735om interfaceC0735om) {
        this.f7823b.remove(interfaceC0735om);
    }

    public final void a(InterfaceC0735om interfaceC0735om) {
        this.f7823b.add(interfaceC0735om);
        if (this.f7822a != null) {
            C0605jm c0605jm = this.f7822a;
            if (c0605jm != null) {
                interfaceC0735om.a(c0605jm);
            } else {
                kotlin.jvm.internal.j.g("startupState");
                throw null;
            }
        }
    }

    public final void a(Context context) {
        String optStringOrNull;
        ProtobufStateStorage<Object> create = ((Vm) Tm.a(C0709nm.class)).create(context);
        yo a3 = C0878ua.k().D().a();
        synchronized (a3) {
            optStringOrNull = JsonUtils.optStringOrNull(a3.f8651a.a(), "device_id");
        }
        a(new C0605jm(optStringOrNull, a3.a(), (C0709nm) create.read()));
    }
}
