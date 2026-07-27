package K;

import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class B extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public O f731d;

    /* renamed from: e, reason: collision with root package name */
    public int f732e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O f733g;

    /* renamed from: h, reason: collision with root package name */
    public int f734h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(O o3, AbstractC0343b abstractC0343b) {
        super(abstractC0343b);
        this.f733g = o3;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f = obj;
        this.f734h |= Integer.MIN_VALUE;
        return this.f733g.h(this);
    }
}
