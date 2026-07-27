package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1095x0 f7902a;

    /* renamed from: b, reason: collision with root package name */
    public final C0547bl f7903b;

    /* renamed from: c, reason: collision with root package name */
    public final Z3 f7904c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7905d = TimeUnit.SECONDS.toMillis(10);

    public C0526b0(C1095x0 c1095x0, C0547bl c0547bl, Z3 z32) {
        this.f7902a = c1095x0;
        this.f7903b = c0547bl;
        this.f7904c = z32;
    }

    public final synchronized void a(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.f7902a.getClass();
        if (C1095x0.a()) {
            return;
        }
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        this.f7903b.a();
        this.f7902a.getClass();
        C1069w0 a6 = C1069w0.a(context);
        a6.f9496d.a(null, a6);
        IHandlerExecutor a7 = this.f7904c.a();
        ((G9) a7).f6828b.post(new J0.a(this, context, appMetricaLibraryAdapterConfig, 6));
        this.f7902a.getClass();
        C1095x0.b();
    }

    public static final void a(C0526b0 c0526b0, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        c0526b0.f7902a.getClass();
        C1069w0 a6 = C1069w0.a(context);
        a6.f().a(appMetricaLibraryAdapterConfig);
        C0736j4.l().f8484c.a().execute(new RunnableC1044v1(a6.f9493a));
    }
}
