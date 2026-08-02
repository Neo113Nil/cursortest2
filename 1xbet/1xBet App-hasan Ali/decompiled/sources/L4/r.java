package L4;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r extends K {

    /* renamed from: e, reason: collision with root package name */
    public K f3109e;

    public r(K k5) {
        kotlin.jvm.internal.l.f("delegate", k5);
        this.f3109e = k5;
    }

    @Override // L4.K
    public final K a() {
        return this.f3109e.a();
    }

    @Override // L4.K
    public final K b() {
        return this.f3109e.b();
    }

    @Override // L4.K
    public final long c() {
        return this.f3109e.c();
    }

    @Override // L4.K
    public final K d(long j5) {
        return this.f3109e.d(j5);
    }

    @Override // L4.K
    public final boolean e() {
        return this.f3109e.e();
    }

    @Override // L4.K
    public final void f() {
        this.f3109e.f();
    }

    @Override // L4.K
    public final K g(long j5) {
        kotlin.jvm.internal.l.f("unit", TimeUnit.MILLISECONDS);
        return this.f3109e.g(j5);
    }
}
