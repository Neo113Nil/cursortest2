package U3;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class c extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f5894k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f5895l;

    /* renamed from: m, reason: collision with root package name */
    public int f5896m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f5895l = gVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f5894k = obj;
        this.f5896m |= Integer.MIN_VALUE;
        return this.f5895l.c(0, this);
    }
}
