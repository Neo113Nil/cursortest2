package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class d3 implements java.lang.AutoCloseable {
    public boolean c;
    public boolean h;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f6962a = new java.lang.Object();
    public final net.idrnd.face.iad.capture.internal.q b = net.idrnd.face.iad.capture.internal.e0.a();
    public final java.lang.Object d = new java.lang.Object();
    public final java.lang.Object e = new java.lang.Object();
    public final java.lang.Object f = new java.lang.Object();
    public final java.lang.Object g = new java.lang.Object();

    public final void a(final net.idrnd.face.iad.capture.internal.u2 u2Var, final net.idrnd.face.iad.capture.internal.u2 u2Var2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u2Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u2Var2, "");
        if (c()) {
            u2Var.close();
            u2Var2.close();
            return;
        }
        synchronized (this.f6962a) {
            if (this.b.isShutdown()) {
                u2Var.close();
                u2Var2.close();
            } else {
                this.b.execute(new java.lang.Runnable() { // from class: net.idrnd.face.iad.capture.internal.d3$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        net.idrnd.face.iad.capture.internal.d3.a(net.idrnd.face.iad.capture.internal.d3.this, u2Var, u2Var2);
                    }
                });
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    public final void b() {
        synchronized (this.f) {
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public static final void a(net.idrnd.face.iad.capture.internal.d3 d3Var, net.idrnd.face.iad.capture.internal.u2 u2Var, net.idrnd.face.iad.capture.internal.u2 u2Var2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d3Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u2Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u2Var2, "");
        if (d3Var.b.isShutdown()) {
            u2Var.close();
            u2Var2.close();
        } else {
            synchronized (d3Var.f) {
                u2Var.close();
                u2Var2.close();
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.e) {
            if (!this.h) {
                return true;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            synchronized (this.d) {
                if (this.c) {
                    return true;
                }
                synchronized (this.f6962a) {
                    z = this.b.getActiveCount() != 0;
                }
                if (z) {
                    return true;
                }
                synchronized (this.f) {
                }
                return true;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            if (this.c) {
                return;
            }
            synchronized (this.f6962a) {
                this.b.shutdown();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            a(null);
            b();
            this.c = true;
        }
    }

    public final void a() {
        synchronized (this.e) {
            this.h = false;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void a(net.idrnd.face.iad.capture.internal.y2 y2Var) {
        synchronized (this.g) {
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
