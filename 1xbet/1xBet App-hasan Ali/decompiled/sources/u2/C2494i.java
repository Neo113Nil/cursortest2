package u2;

import c4.AbstractC0542c;

/* renamed from: u2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2494i extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f19999k;

    /* renamed from: l, reason: collision with root package name */
    public int f20000l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2495j f20001m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2494i(C2495j c2495j, a4.c cVar) {
        super(cVar);
        this.f20001m = c2495j;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19999k = obj;
        this.f20000l |= Integer.MIN_VALUE;
        return this.f20001m.d(null, this);
    }
}
