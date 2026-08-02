package x;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class S extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public T f20714k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20715l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T f20716m;

    /* renamed from: n, reason: collision with root package name */
    public int f20717n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t5, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f20716m = t5;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f20715l = obj;
        this.f20717n |= Integer.MIN_VALUE;
        return this.f20716m.b(this);
    }
}
