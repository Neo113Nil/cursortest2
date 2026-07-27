package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.appmetrica.analytics.impl.ze, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1159ze implements X8, Ae {

    /* renamed from: a, reason: collision with root package name */
    public final S6 f9645a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f9646b;

    public C1159ze(S6 s6) {
        this.f9645a = s6;
        this.f9646b = new AtomicLong(s6.b());
        s6.a(this);
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void a(List<Integer> list) {
        this.f9646b.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void b(List<Integer> list) {
        this.f9646b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void a() {
        this.f9646b.set(this.f9645a.b());
    }

    public final long b() {
        return this.f9646b.get();
    }
}
