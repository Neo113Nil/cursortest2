package u;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class V extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public C2452c0 f19717k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f19718l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2452c0 f19719m;

    /* renamed from: n, reason: collision with root package name */
    public int f19720n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C2452c0 c2452c0, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f19719m = c2452c0;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19718l = obj;
        this.f19720n |= Integer.MIN_VALUE;
        return C2452c0.o(this.f19719m, this);
    }
}
