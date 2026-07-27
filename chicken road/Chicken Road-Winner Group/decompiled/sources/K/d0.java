package K;

import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class d0 extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public D0.a f831d;

    /* renamed from: e, reason: collision with root package name */
    public E2.a f832e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D0.a f833g;

    /* renamed from: h, reason: collision with root package name */
    public int f834h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(D0.a aVar, AbstractC0343b abstractC0343b) {
        super(abstractC0343b);
        this.f833g = aVar;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f = obj;
        this.f834h |= Integer.MIN_VALUE;
        return this.f833g.e(this);
    }
}
