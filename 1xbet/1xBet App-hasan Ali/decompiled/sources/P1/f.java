package P1;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class f extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public g f4707k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4708l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f4709m;

    /* renamed from: n, reason: collision with root package name */
    public int f4710n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, a4.c cVar) {
        super(cVar);
        this.f4709m = gVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f4708l = obj;
        this.f4710n |= Integer.MIN_VALUE;
        return g.c(this.f4709m, null, this);
    }
}
