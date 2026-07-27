package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454e0 implements En {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0480f0 f7176a;

    public C0454e0(C0480f0 c0480f0) {
        this.f7176a = c0480f0;
    }

    @Override // io.appmetrica.analytics.impl.En
    public final Thread a() {
        return this.f7176a.f7267b;
    }

    @Override // io.appmetrica.analytics.impl.En
    public final StackTraceElement[] b() {
        C0480f0 c0480f0 = this.f7176a;
        return (StackTraceElement[]) c0480f0.f7266a.get(c0480f0.f7267b);
    }

    @Override // io.appmetrica.analytics.impl.En
    public final Map<Thread, StackTraceElement[]> c() {
        return this.f7176a.f7266a;
    }
}
