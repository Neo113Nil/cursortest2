package com.vungle.ads.internal.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f11912a;
    public final ThreadFactory b;
    public final AtomicInteger c;

    public c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f11912a = name;
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        Thread t = this.b.newThread(r);
        t.setName(this.f11912a + "-th-" + this.c.incrementAndGet());
        Intrinsics.checkNotNullExpressionValue(t, "t");
        return t;
    }
}
