package X5;

import W5.C0496e;
import W5.b2;
import W5.c2;
import W5.f2;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0496e f7506A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f7507B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f7508C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f7509D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f7510E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1052y0 f7511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f7512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1052y0 f7513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f7514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f2 f7515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SSLSocketFactory f7516f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Y5.b f7517x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f7518y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f7519z;

    public f(C1052y0 c1052y0, C1052y0 c1052y1, SSLSocketFactory sSLSocketFactory, Y5.b bVar, int i7, boolean z4, long j, long j3, int i8, int i9, f2 f2Var) {
        this.f7511a = c1052y0;
        this.f7512b = (Executor) c2.a((b2) c1052y0.f17938b);
        this.f7513c = c1052y1;
        this.f7514d = (ScheduledExecutorService) c2.a((b2) c1052y1.f17938b);
        this.f7516f = sSLSocketFactory;
        this.f7517x = bVar;
        this.f7518y = i7;
        this.f7519z = z4;
        this.f7506A = new C0496e(j);
        this.f7507B = j3;
        this.f7508C = i8;
        this.f7509D = i9;
        p113p3.f.k(f2Var, "transportTracerFactory");
        this.f7515e = f2Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7510E) {
            return;
        }
        this.f7510E = true;
        c2.b((b2) this.f7511a.f17938b, this.f7512b);
        c2.b((b2) this.f7513c.f17938b, this.f7514d);
    }
}
