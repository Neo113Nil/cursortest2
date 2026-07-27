package K;

import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class f0 extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public Object f842d;

    /* renamed from: e, reason: collision with root package name */
    public E2.d f843e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i0 f844g;

    /* renamed from: h, reason: collision with root package name */
    public int f845h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, AbstractC0343b abstractC0343b) {
        super(abstractC0343b);
        this.f844g = i0Var;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f = obj;
        this.f845h |= Integer.MIN_VALUE;
        return this.f844g.b(null, this);
    }
}
