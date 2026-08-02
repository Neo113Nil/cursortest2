package Gf0;

import rf0.AbstractC9267a;

/* loaded from: classes3.dex */
public final class F extends AbstractC9267a {

    /* renamed from: c, reason: collision with root package name */
    private final int f10129c;

    /* renamed from: d, reason: collision with root package name */
    private final qf0.b f10130d;

    /* renamed from: e, reason: collision with root package name */
    private final qf0.c f10131e;

    F(D d11) {
        qf0.c h11;
        this.f10129c = d11.h();
        this.f10130d = d11.e();
        int i11 = E.f10128a[d11.g().ordinal()];
        if (i11 == 1) {
            h11 = new H(d11);
        } else if (i11 == 2) {
            h11 = new I(d11);
        } else {
            if (i11 != 3) {
                throw new Sc.o();
            }
            h11 = new J(d11);
        }
        this.f10131e = h11;
    }

    @Override // rf0.AbstractC9267a
    public final qf0.b a() {
        return this.f10130d;
    }

    @Override // rf0.AbstractC9267a
    public final qf0.c b() {
        return this.f10131e;
    }

    @Override // rf0.AbstractC9267a
    public final int c() {
        return this.f10129c;
    }
}
