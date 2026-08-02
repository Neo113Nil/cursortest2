package L;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class i extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public p f2940k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2941l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f2942m;

    /* renamed from: n, reason: collision with root package name */
    public int f2943n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f2942m = pVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f2941l = obj;
        this.f2943n |= Integer.MIN_VALUE;
        return this.f2942m.a(this);
    }
}
