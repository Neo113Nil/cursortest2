package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.dg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445dg implements InterfaceC0393bg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0599jg f7154a;

    public C0445dg(C0599jg c0599jg) {
        this.f7154a = c0599jg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0393bg
    public final void a() {
        C0599jg c0599jg = this.f7154a;
        Ga ga = c0599jg.f7625b;
        C0419cg c0419cg = new C0419cg(c0599jg);
        ga.getClass();
        try {
            FutureTask futureTask = new FutureTask(new Fa(ga));
            C0878ua.f8414H.f8425d.f8016a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + Gd.f5987a.incrementAndGet()).start();
            C0832sg c0832sg = (C0832sg) futureTask.get(5L, TimeUnit.SECONDS);
            AbstractC0711no.a(ga.f5986b);
            C0599jg.a(c0599jg, c0832sg, C0599jg.a(c0599jg));
        } catch (Throwable th) {
            try {
                c0419cg.a(th);
            } finally {
                AbstractC0711no.a(ga.f5986b);
            }
        }
    }
}
