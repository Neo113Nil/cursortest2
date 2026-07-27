package R3;

import E.C0028c;

/* loaded from: classes.dex */
public class o implements X2.i, X2.m, X2.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2640a;

    /* renamed from: b, reason: collision with root package name */
    public final m f2641b;

    public o(u uVar, String str, int i2) {
        this.f2640a = i2;
        switch (i2) {
            case 1:
                this.f2641b = new m(str, n.f2634a, 1, uVar);
                break;
            case 2:
                this.f2641b = new m(str, n.f2635b, 1, uVar);
                break;
            default:
                this.f2641b = new m(str, n.f2638e, 2, uVar);
                break;
        }
    }

    @Override // X2.m
    public X2.m a(String str) {
        this.f2641b.f2629d = str;
        return this;
    }

    @Override // X2.i
    public X2.n b() {
        m mVar = this.f2641b;
        return new p((u) mVar.f2631f, mVar.f2627b, mVar.f2629d, mVar.f2630e, (T4.k) mVar.f2633h);
    }

    @Override // X2.m
    public X2.m c(String str) {
        this.f2641b.f2630e = str;
        return this;
    }

    @Override // X2.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public r build() {
        return (r) this.f2641b.b(new C0028c(17));
    }

    public final String toString() {
        switch (this.f2640a) {
            case 0:
                return this.f2641b.d(getClass().getSimpleName());
            case 1:
                return this.f2641b.d(getClass().getSimpleName());
            default:
                return this.f2641b.d(getClass().getSimpleName());
        }
    }

    @Override // X2.p
    /* renamed from: a, reason: collision with other method in class */
    public X2.p mo0a(String str) {
        this.f2641b.f2629d = str;
        return this;
    }

    /* renamed from: build, reason: collision with other method in class */
    public X2.o mo1build() {
        return (X2.o) this.f2641b.b(new C0028c(18));
    }

    @Override // X2.p
    /* renamed from: c, reason: collision with other method in class */
    public X2.p mo2c(String str) {
        this.f2641b.f2630e = str;
        return this;
    }
}
