package s4;

import c4.AbstractC0542c;

/* renamed from: s4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2375l extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public H1.q f19280k;

    /* renamed from: l, reason: collision with root package name */
    public Object f19281l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f19282m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H1.q f19283n;

    /* renamed from: o, reason: collision with root package name */
    public int f19284o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2375l(H1.q qVar, a4.c cVar) {
        super(cVar);
        this.f19283n = qVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19282m = obj;
        this.f19284o |= Integer.MIN_VALUE;
        return this.f19283n.d(null, this);
    }
}
