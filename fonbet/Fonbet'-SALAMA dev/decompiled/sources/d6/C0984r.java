package d6;

import U5.AbstractC0440g;
import U5.AbstractC0442i;
import U5.C0441h;
import U5.b0;

/* renamed from: d6.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0984r extends AbstractC0440g {

    /* renamed from: a, reason: collision with root package name */
    public final C0978l f12464a;

    /* renamed from: b, reason: collision with root package name */
    public final C0984r f12465b;

    public C0984r(C0978l c0978l, C0984r c0984r) {
        this.f12464a = c0978l;
        this.f12465b = c0984r;
    }

    @Override // U5.AbstractC0440g
    public final AbstractC0442i a(C0441h c0441h, b0 b0Var) {
        C0984r c0984r = this.f12465b;
        return c0984r != null ? new C0982p(this, c0984r.a(c0441h, b0Var)) : new C0983q(this);
    }
}
