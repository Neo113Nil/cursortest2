package x;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class Q extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public T f20702k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20703l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T f20704m;

    /* renamed from: n, reason: collision with root package name */
    public int f20705n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(T t5, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f20704m = t5;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f20703l = obj;
        this.f20705n |= Integer.MIN_VALUE;
        return this.f20704m.a(this);
    }
}
