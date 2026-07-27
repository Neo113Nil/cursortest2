package com.moloco.sdk.acm.services;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final i f10426a;
    public final AtomicLong b;

    public h(i timeProviderService) {
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f10426a = timeProviderService;
        this.b = new AtomicLong(0L);
    }

    public final long a() {
        return this.f10426a.invoke() - this.b.get();
    }

    public final AtomicLong b() {
        return this.b;
    }

    public final void c() {
        this.b.set(this.f10426a.invoke());
    }
}
