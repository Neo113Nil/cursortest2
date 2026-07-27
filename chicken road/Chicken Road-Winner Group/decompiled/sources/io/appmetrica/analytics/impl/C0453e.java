package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.appmetrica.analytics.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453e {

    /* renamed from: g, reason: collision with root package name */
    public static final long f7169g = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f7170h = "WatchDog-" + Gd.f5987a.incrementAndGet();

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f7171a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f7172b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f7173c;

    /* renamed from: d, reason: collision with root package name */
    public C0428d f7174d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7175e;
    public final Runnable f;

    public C0453e(Kb kb) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f7171a = copyOnWriteArrayList;
        this.f7172b = new AtomicInteger();
        this.f7173c = new Handler(Looper.getMainLooper());
        this.f7175e = new AtomicBoolean();
        this.f = new G0.m(19, this);
        copyOnWriteArrayList.add(kb);
    }

    public final /* synthetic */ void a() {
        this.f7175e.set(true);
    }

    public final synchronized void b() {
        C0428d c0428d = this.f7174d;
        if (c0428d != null) {
            c0428d.f7130a.set(false);
            this.f7174d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    public final synchronized void a(int i3) {
        AtomicInteger atomicInteger = this.f7172b;
        int i4 = 5;
        if (i3 >= 5) {
            i4 = i3;
        }
        atomicInteger.set(i4);
        if (this.f7174d == null) {
            C0428d c0428d = new C0428d(this);
            this.f7174d = c0428d;
            try {
                c0428d.setName(f7170h);
            } catch (SecurityException unused) {
            }
            this.f7174d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i3));
        }
    }
}
