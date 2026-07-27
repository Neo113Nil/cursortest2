package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0739p0 {

    /* renamed from: j, reason: collision with root package name */
    public static final long f8029j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    public final Context f8030a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f8031b;

    /* renamed from: e, reason: collision with root package name */
    public CountDownLatch f8034e;

    /* renamed from: g, reason: collision with root package name */
    public final Q1 f8035g;

    /* renamed from: d, reason: collision with root package name */
    public IAppMetricaService f8033d = null;
    public final Object f = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final RunnableC0687n0 f8036h = new RunnableC0687n0(this);

    /* renamed from: i, reason: collision with root package name */
    public final ServiceConnectionC0713o0 f8037i = new ServiceConnectionC0713o0(this);

    /* renamed from: c, reason: collision with root package name */
    public boolean f8032c = false;

    public C0739p0(Context context, ICommonExecutor iCommonExecutor, Q1 q12) {
        this.f8030a = context.getApplicationContext();
        this.f8031b = iCommonExecutor;
        this.f8035g = q12;
    }

    public final synchronized boolean a() {
        return this.f8033d != null;
    }

    public final void b() {
        synchronized (this.f) {
            this.f8031b.remove(this.f8036h);
        }
    }

    public final void c() {
        ICommonExecutor iCommonExecutor = this.f8031b;
        synchronized (this.f) {
            try {
                iCommonExecutor.remove(this.f8036h);
                if (!this.f8032c) {
                    iCommonExecutor.executeDelayed(this.f8036h, f8029j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Long l3) {
        try {
            synchronized (this) {
                try {
                    CountDownLatch countDownLatch = this.f8034e;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.await(l3.longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException unused) {
        }
    }
}
