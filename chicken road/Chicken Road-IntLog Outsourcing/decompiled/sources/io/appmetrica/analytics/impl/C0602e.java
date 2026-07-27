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
public final class C0602e {

    /* renamed from: g, reason: collision with root package name */
    public static final long f8059g = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f8060h = "WatchDog-" + Gd.f6832a.incrementAndGet();

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f8061a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f8062b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f8063c;

    /* renamed from: d, reason: collision with root package name */
    public C0577d f8064d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f8065e;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f8066f;

    public C0602e(Kb kb) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f8061a = copyOnWriteArrayList;
        this.f8062b = new AtomicInteger();
        this.f8063c = new Handler(Looper.getMainLooper());
        this.f8065e = new AtomicBoolean();
        this.f8066f = new B2.b(13, this);
        copyOnWriteArrayList.add(kb);
    }

    public final /* synthetic */ void a() {
        this.f8065e.set(true);
    }

    public final synchronized void b() {
        C0577d c0577d = this.f8064d;
        if (c0577d != null) {
            c0577d.f8019a.set(false);
            this.f8064d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    public final synchronized void a(int i2) {
        AtomicInteger atomicInteger = this.f8062b;
        int i3 = 5;
        if (i2 >= 5) {
            i3 = i2;
        }
        atomicInteger.set(i3);
        if (this.f8064d == null) {
            C0577d c0577d = new C0577d(this);
            this.f8064d = c0577d;
            try {
                c0577d.setName(f8060h);
            } catch (SecurityException unused) {
            }
            this.f8064d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i2));
        }
    }
}
