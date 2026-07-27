package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class F9 implements ExecutorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C0733ok f5937a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f5938b;

    public F9() {
        C0733ok x3 = C0878ua.k().x();
        this.f5937a = x3;
        this.f5938b = x3.c();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f5937a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final InterruptionSafeThread getInterruptionThread(String str, String str2, Runnable runnable) {
        return new InterruptionSafeThread(runnable, (str + '-' + str2) + TokenBuilder.TOKEN_DELIMITER + Gd.f5987a.incrementAndGet());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getModuleExecutor() {
        return this.f5938b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getReportRunnableExecutor() {
        return this.f5937a.e();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getSupportIOExecutor() {
        C0733ok c0733ok = this.f5937a;
        if (c0733ok.f == null) {
            synchronized (c0733ok) {
                try {
                    if (c0733ok.f == null) {
                        c0733ok.f8016a.getClass();
                        HandlerThreadC0594jb a3 = G9.a("IAA-SIO");
                        c0733ok.f = new G9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c0733ok.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getUiExecutor() {
        C0733ok c0733ok = this.f5937a;
        if (c0733ok.f8022h == null) {
            synchronized (c0733ok) {
                try {
                    if (c0733ok.f8022h == null) {
                        c0733ok.f8016a.getClass();
                        c0733ok.f8022h = new ExecutorC0681mk(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return c0733ok.f8022h;
    }
}
