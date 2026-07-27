package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class Y4 {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f7724a = new CopyOnWriteArrayList();

    public final void a(InterfaceC0814m4 interfaceC0814m4) {
        this.f7724a.add(interfaceC0814m4);
    }

    public final void b(InterfaceC0814m4 interfaceC0814m4) {
        this.f7724a.remove(interfaceC0814m4);
    }

    public final List<InterfaceC0814m4> a() {
        return this.f7724a;
    }
}
