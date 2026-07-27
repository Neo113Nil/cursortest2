package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Di implements InterfaceC0577ik {

    /* renamed from: e, reason: collision with root package name */
    public static final Ci f5848e = new Ci();
    public static final long f = TimeUnit.SECONDS.toMillis(4);

    /* renamed from: a, reason: collision with root package name */
    public final C0739p0 f5849a;

    /* renamed from: b, reason: collision with root package name */
    public final C0449dk f5850b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeProvider f5851c;

    /* renamed from: d, reason: collision with root package name */
    public final ICommonExecutor f5852d;

    public Di(C0739p0 c0739p0, C0449dk c0449dk, TimeProvider timeProvider) {
        this.f5849a = c0739p0;
        this.f5850b = c0449dk;
        this.f5851c = timeProvider;
        this.f5852d = C0587j4.l().g().b();
    }

    public final void a(Ah ah) {
        Callable ug;
        ICommonExecutor iCommonExecutor = this.f5852d;
        if (ah.f5700b) {
            C0449dk c0449dk = this.f5850b;
            ug = new C0589j6(c0449dk.f7161a, c0449dk.f7162b, c0449dk.f7163c, ah);
        } else {
            C0449dk c0449dk2 = this.f5850b;
            ug = new Ug(c0449dk2.f7162b, c0449dk2.f7163c, ah);
        }
        iCommonExecutor.submit(ug);
    }

    public final void b(Ah ah) {
        long uptimeMillis = this.f5851c.uptimeMillis();
        C0449dk c0449dk = this.f5850b;
        C0589j6 c0589j6 = new C0589j6(c0449dk.f7161a, c0449dk.f7162b, c0449dk.f7163c, ah);
        if (this.f5849a.a()) {
            try {
                this.f5852d.submit(c0589j6).get(f, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (!c0589j6.f5804c) {
            try {
                c0589j6.a();
            } catch (Throwable unused2) {
            }
        }
        try {
            Thread.sleep(Math.max(0L, f - (this.f5851c.uptimeMillis() - uptimeMillis)));
        } catch (Throwable unused3) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0577ik
    public final void reportData(int i3, Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.f5852d;
        C0449dk c0449dk = this.f5850b;
        iCommonExecutor.submit(new Pn(c0449dk.f7162b, c0449dk.f7163c, i3, bundle));
    }

    public Di(C0739p0 c0739p0, C0449dk c0449dk) {
        this(c0739p0, c0449dk, new SystemTimeProvider());
    }

    public final void a(Gf gf) {
        ICommonExecutor iCommonExecutor = this.f5852d;
        C0449dk c0449dk = this.f5850b;
        iCommonExecutor.submit(new C0960xe(c0449dk.f7162b, c0449dk.f7163c, gf));
    }

    public final void b(Gf gf) {
        ICommonExecutor iCommonExecutor = this.f5852d;
        C0449dk c0449dk = this.f5850b;
        iCommonExecutor.submit(new Ji(c0449dk.f7162b, c0449dk.f7163c, gf));
    }
}
