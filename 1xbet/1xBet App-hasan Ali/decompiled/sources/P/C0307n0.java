package P;

import A0.C0059t0;
import c4.AbstractC0542c;

/* renamed from: P.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307n0 extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public i4.c f4489k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4490l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0059t0 f4491m;

    /* renamed from: n, reason: collision with root package name */
    public int f4492n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0307n0(C0059t0 c0059t0, a4.c cVar) {
        super(cVar);
        this.f4491m = c0059t0;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f4490l = obj;
        this.f4492n |= Integer.MIN_VALUE;
        return this.f4491m.n(null, this);
    }
}
