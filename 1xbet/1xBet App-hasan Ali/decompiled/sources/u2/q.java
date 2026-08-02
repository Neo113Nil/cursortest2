package u2;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class q extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f20028k;

    /* renamed from: l, reason: collision with root package name */
    public int f20029l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2495j f20030m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C2495j c2495j, a4.c cVar) {
        super(cVar);
        this.f20030m = c2495j;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f20028k = obj;
        this.f20029l |= Integer.MIN_VALUE;
        return this.f20030m.d(null, this);
    }
}
