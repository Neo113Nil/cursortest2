package u;

import c4.AbstractC0542c;

/* renamed from: u.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2448a0 extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public C2452c0 f19748k;

    /* renamed from: l, reason: collision with root package name */
    public Object f19749l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f19750m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2452c0 f19751n;

    /* renamed from: o, reason: collision with root package name */
    public int f19752o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2448a0(C2452c0 c2452c0, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f19751n = c2452c0;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19750m = obj;
        this.f19752o |= Integer.MIN_VALUE;
        return C2452c0.p(this.f19751n, this);
    }
}
