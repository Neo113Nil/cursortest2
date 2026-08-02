package B;

import A.C0005e;
import a3.AbstractC0467k;
import e2.C1930k;
import x.P;
import x0.AbstractC2620f;

/* renamed from: B.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083l implements y0.e {

    /* renamed from: o, reason: collision with root package name */
    public static final C0081j f683o = new C0081j();

    /* renamed from: k, reason: collision with root package name */
    public final C0005e f684k;

    /* renamed from: l, reason: collision with root package name */
    public final C1930k f685l;

    /* renamed from: m, reason: collision with root package name */
    public final W0.m f686m;

    /* renamed from: n, reason: collision with root package name */
    public final P f687n;

    public C0083l(C0005e c0005e, C1930k c1930k, W0.m mVar, P p5) {
        this.f684k = c0005e;
        this.f685l = c1930k;
        this.f686m = mVar;
        this.f687n = p5;
    }

    @Override // b0.p
    public final /* synthetic */ b0.p c(b0.p pVar) {
        return AbstractC0467k.d(this, pVar);
    }

    @Override // b0.p
    public final Object d(i4.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    @Override // y0.e
    public final y0.g getKey() {
        return AbstractC2620f.f20994a;
    }

    public final boolean i(C0080i c0080i, int i) {
        P p5 = this.f687n;
        if (i == 5 || i == 6) {
            if (p5 == P.f20696l) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (p5 == P.f20695k) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (k(i)) {
            if (c0080i.f679b >= this.f684k.f46a.g().f114m - 1) {
                return false;
            }
        } else if (c0080i.f678a <= 0) {
            return false;
        }
        return true;
    }

    @Override // b0.p
    public final boolean j(i4.c cVar) {
        return ((Boolean) cVar.c(this)).booleanValue();
    }

    public final boolean k(int i) {
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i != 5) {
                if (i != 6) {
                    W0.m mVar = this.f686m;
                    if (i == 3) {
                        int ordinal = mVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw new D2.e();
                            }
                        }
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                        }
                        int ordinal2 = mVar.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new D2.e();
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // y0.e
    public final Object getValue() {
        return this;
    }
}
