package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class Y4 {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f6848a = new CopyOnWriteArrayList();

    public final void a(InterfaceC0665m4 interfaceC0665m4) {
        this.f6848a.add(interfaceC0665m4);
    }

    public final void b(InterfaceC0665m4 interfaceC0665m4) {
        this.f6848a.remove(interfaceC0665m4);
    }

    public final List<InterfaceC0665m4> a() {
        return this.f6848a;
    }
}
