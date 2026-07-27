package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class P5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final List f6407a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f6408b = C0878ua.k().x().a();

    /* renamed from: c, reason: collision with root package name */
    public final WaitForActivationDelayBarrier f6409c = C0878ua.k().a();

    public P5(List list) {
        this.f6407a = list;
    }

    public static final void a(P5 p5) {
        Iterator it = p5.f6407a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6409c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.f6408b, new F1.b(26, this));
    }
}
