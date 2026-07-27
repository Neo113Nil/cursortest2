package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0946x0 f7018a;

    /* renamed from: b, reason: collision with root package name */
    public final C0398bl f7019b;

    /* renamed from: c, reason: collision with root package name */
    public final Z3 f7020c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7021d = TimeUnit.SECONDS.toMillis(10);

    public C0377b0(C0946x0 c0946x0, C0398bl c0398bl, Z3 z3) {
        this.f7018a = c0946x0;
        this.f7019b = c0398bl;
        this.f7020c = z3;
    }

    public final synchronized void a(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.f7018a.getClass();
        if (C0946x0.a()) {
            return;
        }
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        this.f7019b.a();
        this.f7018a.getClass();
        C0920w0 a3 = C0920w0.a(context);
        a3.f8539d.a(null, a3);
        IHandlerExecutor a4 = this.f7020c.a();
        ((G9) a4).f5983b.post(new F0.a(this, context, appMetricaLibraryAdapterConfig, 7));
        this.f7018a.getClass();
        C0946x0.b();
    }

    public static final void a(C0377b0 c0377b0, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        c0377b0.f7018a.getClass();
        C0920w0 a3 = C0920w0.a(context);
        a3.f().a(appMetricaLibraryAdapterConfig);
        C0587j4.l().f7572c.a().execute(new RunnableC0895v1(a3.f8536a));
    }
}
