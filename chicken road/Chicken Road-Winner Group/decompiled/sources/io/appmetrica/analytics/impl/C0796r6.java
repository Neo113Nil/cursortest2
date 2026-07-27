package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.r6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0796r6 implements Ma {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f8200a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.Ma
    public final void a(Throwable th, V v3) {
        Iterator it = this.f8200a.iterator();
        while (it.hasNext()) {
            ((Ma) it.next()).a(th, v3);
        }
    }

    public final void a(Ma... maArr) {
        e2.m.W(this.f8200a, maArr);
    }

    public final void a(List<? extends Ma> list) {
        this.f8200a.addAll(list);
    }

    public final void a() {
        this.f8200a.clear();
    }
}
