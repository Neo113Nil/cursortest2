package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import d2.C0279i;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public abstract class Ch implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public static final Bh f5801d = new Bh();

    /* renamed from: a, reason: collision with root package name */
    public final C0739p0 f5802a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0450dl f5803b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5804c;

    public Ch(C0739p0 c0739p0, InterfaceC0450dl interfaceC0450dl) {
        this.f5802a = c0739p0;
        this.f5803b = interfaceC0450dl;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(Throwable th) {
    }

    public final C0739p0 b() {
        return this.f5802a;
    }

    public boolean c() {
        C0739p0 c0739p0 = this.f5802a;
        synchronized (c0739p0) {
            try {
                if (c0739p0.f8033d == null) {
                    c0739p0.f8034e = new CountDownLatch(1);
                    Intent a3 = Ek.a(c0739p0.f8030a);
                    try {
                        c0739p0.f8035g.b(c0739p0.f8030a);
                        c0739p0.f8030a.bindService(a3, c0739p0.f8037i, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.f5802a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return C0279i.f4852a;
    }

    public final boolean d() {
        return this.f5804c;
    }

    public final void a(boolean z3) {
        this.f5804c = z3;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f5804c) {
                return;
            }
            this.f5804c = true;
            int i3 = 0;
            do {
                C0739p0 c0739p0 = this.f5802a;
                synchronized (c0739p0) {
                    iAppMetricaService = c0739p0.f8033d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        InterfaceC0450dl interfaceC0450dl = this.f5803b;
                        if (interfaceC0450dl != null && !((C0705ni) interfaceC0450dl).a()) {
                            return;
                        }
                        this.f5802a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i3++;
                if (!c() || X1.f6810e.get()) {
                    return;
                }
            } while (i3 < 3);
        } catch (Throwable th) {
            a(th);
        }
    }
}
