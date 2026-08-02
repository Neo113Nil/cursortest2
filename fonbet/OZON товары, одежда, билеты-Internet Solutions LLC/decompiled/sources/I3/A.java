package I3;

import j3.C7253I;
import j3.C7272n;
import java.util.List;

/* loaded from: classes8.dex */
public class A implements y {

    /* renamed from: a, reason: collision with root package name */
    private final y f11812a;

    public A(y yVar) {
        this.f11812a = yVar;
    }

    @Override // I3.y
    public final void a() {
        this.f11812a.a();
    }

    @Override // I3.y
    public final boolean b(int i11, long j11) {
        return this.f11812a.b(i11, j11);
    }

    @Override // I3.C
    public final int c(int i11) {
        return this.f11812a.c(i11);
    }

    @Override // I3.y
    public final boolean d(int i11, long j11) {
        return this.f11812a.d(i11, j11);
    }

    @Override // I3.y
    public final void disable() {
        this.f11812a.disable();
    }

    @Override // I3.y
    public final void e() {
        this.f11812a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A) {
            return this.f11812a.equals(((A) obj).f11812a);
        }
        return false;
    }

    @Override // I3.C
    public final int f(int i11) {
        return this.f11812a.f(i11);
    }

    @Override // I3.C
    public C7253I g() {
        return this.f11812a.g();
    }

    @Override // I3.y
    public final int getSelectedIndex() {
        return this.f11812a.getSelectedIndex();
    }

    @Override // I3.y
    public final int h(long j11, List<? extends G3.d> list) {
        return this.f11812a.h(j11, list);
    }

    public int hashCode() {
        return this.f11812a.hashCode();
    }

    @Override // I3.y
    public final int i() {
        return this.f11812a.i();
    }

    @Override // I3.y
    public C7272n j() {
        return this.f11812a.j();
    }

    @Override // I3.y
    public final void k() {
        this.f11812a.k();
    }

    @Override // I3.y
    public final boolean l(long j11, G3.b bVar, List<? extends G3.d> list) {
        return this.f11812a.l(j11, bVar, list);
    }

    @Override // I3.C
    public final int length() {
        return this.f11812a.length();
    }

    @Override // I3.C
    public C7272n m(int i11) {
        return this.f11812a.m(i11);
    }

    @Override // I3.y
    public final void n(long j11, long j12, long j13, List<? extends G3.d> list, G3.e[] eVarArr) {
        this.f11812a.n(j11, j12, j13, list, eVarArr);
    }

    @Override // I3.y
    public final void o(float f7) {
        this.f11812a.o(f7);
    }

    @Override // I3.y
    public final Object p() {
        return this.f11812a.p();
    }

    @Override // I3.y
    public final void q(boolean z11) {
        this.f11812a.q(z11);
    }

    @Override // I3.y
    public final int r() {
        return this.f11812a.r();
    }

    public final y s() {
        return this.f11812a;
    }
}
