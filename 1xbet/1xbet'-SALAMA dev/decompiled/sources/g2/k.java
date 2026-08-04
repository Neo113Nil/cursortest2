package g2;

import A1.X;
import E3.AbstractC0167z;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends m implements p040f2.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f13161f;

    public k(long j, X x4, AbstractC0167z abstractC0167z, n nVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(x4, abstractC0167z, nVar, arrayList, arrayList2, arrayList3);
        this.f13161f = nVar;
    }

    @Override // g2.m
    public final String a() {
        return null;
    }

    @Override // p040f2.g
    public final long b(long j) {
        return this.f13161f.g(j);
    }

    @Override // g2.m
    public final j d() {
        return null;
    }

    @Override // p040f2.g
    public final long e(long j, long j3) {
        return this.f13161f.e(j, j3);
    }

    @Override // p040f2.g
    public final long f(long j, long j3) {
        return this.f13161f.c(j, j3);
    }

    @Override // p040f2.g
    public final long g(long j, long j3) {
        n nVar = this.f13161f;
        if (nVar.f13171f != null) {
            return -9223372036854775807L;
        }
        long jB = nVar.b(j, j3) + nVar.c(j, j3);
        return (nVar.e(jB, j) + nVar.g(jB)) - nVar.f13174i;
    }

    @Override // p040f2.g
    public final j i(long j) {
        return this.f13161f.h(this, j);
    }

    @Override // p040f2.g
    public final long l(long j, long j3) {
        return this.f13161f.f(j, j3);
    }

    @Override // p040f2.g
    public final boolean s() {
        return this.f13161f.i();
    }

    @Override // p040f2.g
    public final long u() {
        return this.f13161f.f13169d;
    }

    @Override // p040f2.g
    public final long v(long j) {
        return this.f13161f.d(j);
    }

    @Override // p040f2.g
    public final long w(long j, long j3) {
        return this.f13161f.b(j, j3);
    }

    @Override // g2.m
    public final p040f2.g c() {
        return this;
    }
}
