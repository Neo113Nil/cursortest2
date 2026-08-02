package z2;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class f extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public h f21949k;

    /* renamed from: l, reason: collision with root package name */
    public j f21950l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f21951m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f21952n;

    /* renamed from: o, reason: collision with root package name */
    public int f21953o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f21952n = hVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f21951m = obj;
        this.f21953o |= Integer.MIN_VALUE;
        return this.f21952n.d(null, this);
    }
}
