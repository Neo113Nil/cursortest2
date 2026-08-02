package U3;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class f extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public Object f5907k;

    /* renamed from: l, reason: collision with root package name */
    public int f5908l;

    /* renamed from: m, reason: collision with root package name */
    public int f5909m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f5910n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f5911o;

    /* renamed from: p, reason: collision with root package name */
    public int f5912p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f5911o = gVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f5910n = obj;
        this.f5912p |= Integer.MIN_VALUE;
        return this.f5911o.f(0, 0, this);
    }
}
