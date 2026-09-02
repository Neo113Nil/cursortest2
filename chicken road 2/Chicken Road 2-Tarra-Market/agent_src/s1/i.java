package s1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class i extends u {

    /* renamed from: e, reason: collision with root package name */
    public u f6624e;

    public i(u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f6624e = uVar;
    }

    @Override // s1.u
    public final u a() {
        return this.f6624e.a();
    }

    @Override // s1.u
    public final u b() {
        return this.f6624e.b();
    }

    @Override // s1.u
    public final long c() {
        return this.f6624e.c();
    }

    @Override // s1.u
    public final u d(long j2) {
        return this.f6624e.d(j2);
    }

    @Override // s1.u
    public final boolean e() {
        return this.f6624e.e();
    }

    @Override // s1.u
    public final void f() {
        this.f6624e.f();
    }

    @Override // s1.u
    public final u g(long j2, TimeUnit timeUnit) {
        return this.f6624e.g(j2, timeUnit);
    }
}
