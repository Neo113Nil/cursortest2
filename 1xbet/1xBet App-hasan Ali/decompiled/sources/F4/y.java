package F4;

import P.AbstractC0317t;
import P.InterfaceC0284c;
import u.AbstractC2470q;
import u.C2433D;
import u.D0;
import u.InterfaceC2477y;

/* loaded from: classes.dex */
public final class y implements InterfaceC0284c, D0 {

    /* renamed from: k, reason: collision with root package name */
    public final int f1681k;

    /* renamed from: l, reason: collision with root package name */
    public int f1682l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f1683m;

    public y() {
        this.f1683m = new y[256];
        this.f1681k = 0;
        this.f1682l = 0;
    }

    @Override // P.InterfaceC0284c
    public void a(int i, Object obj) {
        ((InterfaceC0284c) this.f1683m).a(i + (this.f1682l == 0 ? this.f1681k : 0), obj);
    }

    @Override // u.C0
    public /* synthetic */ boolean b() {
        return false;
    }

    @Override // P.InterfaceC0284c
    public void c(Object obj) {
        this.f1682l++;
        ((InterfaceC0284c) this.f1683m).c(obj);
    }

    @Override // P.InterfaceC0284c
    public void e(i4.e eVar, Object obj) {
        ((InterfaceC0284c) this.f1683m).e(eVar, obj);
    }

    @Override // P.InterfaceC0284c
    public void f() {
        ((InterfaceC0284c) this.f1683m).f();
    }

    @Override // u.C0
    public AbstractC2470q g(long j5, AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        return ((m2.g) this.f1683m).g(j5, abstractC2470q, abstractC2470q2, abstractC2470q3);
    }

    @Override // P.InterfaceC0284c
    public void h(int i, Object obj) {
        ((InterfaceC0284c) this.f1683m).h(i + (this.f1682l == 0 ? this.f1681k : 0), obj);
    }

    @Override // P.InterfaceC0284c
    public /* synthetic */ void i() {
    }

    @Override // P.InterfaceC0284c
    public void j(int i, int i5, int i6) {
        int i7 = this.f1682l == 0 ? this.f1681k : 0;
        ((InterfaceC0284c) this.f1683m).j(i + i7, i5 + i7, i6);
    }

    @Override // P.InterfaceC0284c
    public void k(int i, int i5) {
        ((InterfaceC0284c) this.f1683m).k(i + (this.f1682l == 0 ? this.f1681k : 0), i5);
    }

    @Override // u.D0
    public int l() {
        return this.f1682l;
    }

    @Override // u.C0
    public long m(AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        return (n() + l()) * 1000000;
    }

    @Override // u.D0
    public int n() {
        return this.f1681k;
    }

    @Override // P.InterfaceC0284c
    public void o() {
        if (!(this.f1682l > 0)) {
            AbstractC0317t.c("OffsetApplier up called with no corresponding down");
        }
        this.f1682l--;
        ((InterfaceC0284c) this.f1683m).o();
    }

    @Override // u.C0
    public AbstractC2470q p(long j5, AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        return ((m2.g) this.f1683m).p(j5, abstractC2470q, abstractC2470q2, abstractC2470q3);
    }

    @Override // u.C0
    public AbstractC2470q r(AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        return ((m2.g) this.f1683m).p(m(abstractC2470q, abstractC2470q2, abstractC2470q3), abstractC2470q, abstractC2470q2, abstractC2470q3);
    }

    public y(int i, int i5) {
        this.f1683m = null;
        this.f1681k = i;
        int i6 = i5 & 7;
        this.f1682l = i6 == 0 ? 8 : i6;
    }

    public y(InterfaceC0284c interfaceC0284c, int i) {
        this.f1683m = interfaceC0284c;
        this.f1681k = i;
    }

    public y(int i, int i5, InterfaceC2477y interfaceC2477y) {
        this.f1681k = i;
        this.f1682l = i5;
        this.f1683m = new m2.g(new C2433D(i, i5, interfaceC2477y));
    }
}
