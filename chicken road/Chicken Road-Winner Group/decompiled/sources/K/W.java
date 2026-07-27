package K;

import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class W extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public X f808d;

    /* renamed from: e, reason: collision with root package name */
    public Object f809e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public Z f810g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f811h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X f812i;

    /* renamed from: j, reason: collision with root package name */
    public int f813j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x3, AbstractC0343b abstractC0343b) {
        super(abstractC0343b);
        this.f812i = x3;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f811h = obj;
        this.f813j |= Integer.MIN_VALUE;
        return this.f812i.b(null, this);
    }
}
