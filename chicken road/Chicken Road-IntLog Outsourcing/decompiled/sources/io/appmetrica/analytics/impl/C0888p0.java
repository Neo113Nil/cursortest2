package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0888p0 {

    /* renamed from: j, reason: collision with root package name */
    public static final long f8963j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    public final Context f8964a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f8965b;

    /* renamed from: e, reason: collision with root package name */
    public CountDownLatch f8968e;

    /* renamed from: g, reason: collision with root package name */
    public final Q1 f8970g;

    /* renamed from: d, reason: collision with root package name */
    public IAppMetricaService f8967d = null;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8969f = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final RunnableC0836n0 f8971h = new RunnableC0836n0(this);

    /* renamed from: i, reason: collision with root package name */
    public final ServiceConnectionC0862o0 f8972i = new ServiceConnectionC0862o0(this);

    /* renamed from: c, reason: collision with root package name */
    public boolean f8966c = false;

    public C0888p0(Context context, ICommonExecutor iCommonExecutor, Q1 q12) {
        this.f8964a = context.getApplicationContext();
        this.f8965b = iCommonExecutor;
        this.f8970g = q12;
    }

    public final synchronized boolean a() {
        return this.f8967d != null;
    }

    public final void b() {
        synchronized (this.f8969f) {
            this.f8965b.remove(this.f8971h);
        }
    }

    public final void c() {
        ICommonExecutor iCommonExecutor = this.f8965b;
        synchronized (this.f8969f) {
            try {
                iCommonExecutor.remove(this.f8971h);
                if (!this.f8966c) {
                    iCommonExecutor.executeDelayed(this.f8971h, f8963j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Long l2) {
        try {
            synchronized (this) {
                try {
                    CountDownLatch countDownLatch = this.f8968e;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.await(l2.longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException unused) {
        }
    }
}
