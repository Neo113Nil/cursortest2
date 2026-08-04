package p040f2;

import p032e2.b;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f12869d;

    public i(h hVar, long j, long j3) {
        super(j, j3);
        this.f12869d = hVar;
    }

    @Override // p032e2.k
    public final long c() {
        a();
        return this.f12869d.d(this.f12582c);
    }

    @Override // p032e2.k
    public final long f() {
        a();
        return this.f12869d.c(this.f12582c);
    }
}
