package G0;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class c extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public Object f1782k;

    /* renamed from: l, reason: collision with root package name */
    public W0.k f1783l;

    /* renamed from: m, reason: collision with root package name */
    public int f1784m;

    /* renamed from: n, reason: collision with root package name */
    public int f1785n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1786o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f f1787p;

    /* renamed from: q, reason: collision with root package name */
    public int f1788q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f1787p = fVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f1786o = obj;
        this.f1788q |= Integer.MIN_VALUE;
        return f.a(this.f1787p, null, null, this);
    }
}
