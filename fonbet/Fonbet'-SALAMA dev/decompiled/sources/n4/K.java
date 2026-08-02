package n4;

import a.AbstractC0603a;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class K extends AbstractC0603a {

    /* renamed from: e, reason: collision with root package name */
    public final D f15379e;

    /* renamed from: f, reason: collision with root package name */
    public final C1473g f15380f;

    public K(D d7, C1473g c1473g) {
        this.f15379e = d7;
        this.f15380f = c1473g;
    }

    @Override // a.AbstractC0603a
    public final AbstractC0603a Y(v4.c cVar) {
        return new K(this.f15379e, this.f15380f.t(cVar));
    }

    @Override // a.AbstractC0603a
    public final v4.r f0() {
        return this.f15379e.i(this.f15380f, new ArrayList());
    }
}
