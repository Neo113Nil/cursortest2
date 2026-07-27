package z2;

import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class b extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public y2.o f10703d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10704e;
    public final /* synthetic */ c f;

    /* renamed from: g, reason: collision with root package name */
    public int f10705g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AbstractC0343b abstractC0343b) {
        super(abstractC0343b);
        this.f = cVar;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f10704e = obj;
        this.f10705g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
