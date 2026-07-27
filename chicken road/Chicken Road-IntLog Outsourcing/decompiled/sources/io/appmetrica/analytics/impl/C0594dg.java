package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.dg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594dg implements InterfaceC0542bg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0748jg f8044a;

    public C0594dg(C0748jg c0748jg) {
        this.f8044a = c0748jg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0542bg
    public final void a() {
        C0748jg c0748jg = this.f8044a;
        Ga ga = c0748jg.f8541b;
        C0568cg c0568cg = new C0568cg(c0748jg);
        ga.getClass();
        try {
            FutureTask futureTask = new FutureTask(new Fa(ga));
            C1027ua.f9366H.f9377d.f8949a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + Gd.f6832a.incrementAndGet()).start();
            C0981sg c0981sg = (C0981sg) futureTask.get(5L, TimeUnit.SECONDS);
            AbstractC0860no.a(ga.f6831b);
            C0748jg.a(c0748jg, c0981sg, C0748jg.a(c0748jg));
        } catch (Throwable th) {
            try {
                c0568cg.a(th);
            } finally {
                AbstractC0860no.a(ga.f6831b);
            }
        }
    }
}
