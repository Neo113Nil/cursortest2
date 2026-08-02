package g2;

import A1.X;
import E3.AbstractC0167z;
import f2.InterfaceC1075g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends m implements InterfaceC1075g {

    /* renamed from: f, reason: collision with root package name */
    public final n f13155f;

    public k(long j, X x4, AbstractC0167z abstractC0167z, n nVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(x4, abstractC0167z, nVar, arrayList, arrayList2, arrayList3);
        this.f13155f = nVar;
    }

    @Override // g2.m
    public final String a() {
        return null;
    }

    @Override // f2.InterfaceC1075g
    public final long b(long j) {
        return this.f13155f.g(j);
    }

    @Override // g2.m
    public final j d() {
        return null;
    }

    @Override // f2.InterfaceC1075g
    public final long e(long j, long j3) {
        return this.f13155f.e(j, j3);
    }

    @Override // f2.InterfaceC1075g
    public final long f(long j, long j3) {
        return this.f13155f.c(j, j3);
    }

    @Override // f2.InterfaceC1075g
    public final long g(long j, long j3) {
        n nVar = this.f13155f;
        if (nVar.f13165f != null) {
            return -9223372036854775807L;
        }
        long b7 = nVar.b(j, j3) + nVar.c(j, j3);
        return (nVar.e(b7, j) + nVar.g(b7)) - nVar.f13168i;
    }

    @Override // f2.InterfaceC1075g
    public final j i(long j) {
        return this.f13155f.h(this, j);
    }

    @Override // f2.InterfaceC1075g
    public final long l(long j, long j3) {
        return this.f13155f.f(j, j3);
    }

    @Override // f2.InterfaceC1075g
    public final boolean s() {
        return this.f13155f.i();
    }

    @Override // f2.InterfaceC1075g
    public final long u() {
        return this.f13155f.f13163d;
    }

    @Override // f2.InterfaceC1075g
    public final long v(long j) {
        return this.f13155f.d(j);
    }

    @Override // f2.InterfaceC1075g
    public final long w(long j, long j3) {
        return this.f13155f.b(j, j3);
    }

    @Override // g2.m
    public final InterfaceC1075g c() {
        return this;
    }
}
