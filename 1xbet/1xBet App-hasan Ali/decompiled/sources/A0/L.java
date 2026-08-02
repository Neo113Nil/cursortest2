package A0;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class L extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public r.w f320k;

    /* renamed from: l, reason: collision with root package name */
    public r4.b f321l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f322m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f323n;

    /* renamed from: o, reason: collision with root package name */
    public int f324o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(N n5, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f323n = n5;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f322m = obj;
        this.f324o |= Integer.MIN_VALUE;
        return this.f323n.g(this);
    }
}
