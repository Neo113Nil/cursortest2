package s4;

import c4.AbstractC0542c;

/* renamed from: s4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2366c extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f19258k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H1.q f19259l;

    /* renamed from: m, reason: collision with root package name */
    public int f19260m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2366c(H1.q qVar, a4.c cVar) {
        super(cVar);
        this.f19259l = qVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19258k = obj;
        this.f19260m |= Integer.MIN_VALUE;
        return this.f19259l.d(null, this);
    }
}
