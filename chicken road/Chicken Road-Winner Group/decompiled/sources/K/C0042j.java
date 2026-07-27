package K;

import i2.AbstractC0343b;

/* renamed from: K.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042j extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public D0.a f859d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f860e;
    public final /* synthetic */ D0.a f;

    /* renamed from: g, reason: collision with root package name */
    public int f861g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0042j(D0.a aVar, AbstractC0343b abstractC0343b) {
        super(abstractC0343b);
        this.f = aVar;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f860e = obj;
        this.f861g |= Integer.MIN_VALUE;
        return this.f.b(this);
    }
}
