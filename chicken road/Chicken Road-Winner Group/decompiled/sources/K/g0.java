package K;

import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class g0 extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public E2.d f847d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f848e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i0 f849g;

    /* renamed from: h, reason: collision with root package name */
    public int f850h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, AbstractC0343b abstractC0343b) {
        super(abstractC0343b);
        this.f849g = i0Var;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f = obj;
        this.f850h |= Integer.MIN_VALUE;
        return this.f849g.c(null, this);
    }
}
