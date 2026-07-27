package K;

import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class V extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public X f803d;

    /* renamed from: e, reason: collision with root package name */
    public Q f804e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f805g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ X f806h;

    /* renamed from: i, reason: collision with root package name */
    public int f807i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(X x3, AbstractC0343b abstractC0343b) {
        super(abstractC0343b);
        this.f806h = x3;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f805g = obj;
        this.f807i |= Integer.MIN_VALUE;
        return this.f806h.a(null, this);
    }
}
