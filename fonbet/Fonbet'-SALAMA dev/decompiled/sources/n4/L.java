package n4;

import a.AbstractC0603a;

/* loaded from: classes2.dex */
public final class L extends AbstractC0603a {

    /* renamed from: e, reason: collision with root package name */
    public final v4.r f15381e;

    public L(v4.r rVar) {
        this.f15381e = rVar;
    }

    @Override // a.AbstractC0603a
    public final AbstractC0603a Y(v4.c cVar) {
        return new L(this.f15381e.o(cVar));
    }

    @Override // a.AbstractC0603a
    public final v4.r f0() {
        return this.f15381e;
    }
}
