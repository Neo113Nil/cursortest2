package y2;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class j extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f21202k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f21203l;

    /* renamed from: m, reason: collision with root package name */
    public int f21204m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f21203l = lVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f21202k = obj;
        this.f21204m |= Integer.MIN_VALUE;
        return this.f21203l.b(null, this);
    }
}
