package O4;

import L4.InterfaceC0228k;

/* renamed from: O4.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279z extends y4.B {

    /* renamed from: l, reason: collision with root package name */
    public final y4.q f4243l;

    /* renamed from: m, reason: collision with root package name */
    public final long f4244m;

    public C0279z(y4.q qVar, long j5) {
        this.f4243l = qVar;
        this.f4244m = j5;
    }

    @Override // y4.B
    public final long b() {
        return this.f4244m;
    }

    @Override // y4.B
    public final y4.q d() {
        return this.f4243l;
    }

    @Override // y4.B
    public final InterfaceC0228k f() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
