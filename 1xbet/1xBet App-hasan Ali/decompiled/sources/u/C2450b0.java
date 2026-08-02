package u;

import c4.AbstractC0542c;

/* renamed from: u.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2450b0 extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public C2452c0 f19755k;

    /* renamed from: l, reason: collision with root package name */
    public Object f19756l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f19757m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2452c0 f19758n;

    /* renamed from: o, reason: collision with root package name */
    public int f19759o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2450b0(C2452c0 c2452c0, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f19758n = c2452c0;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19757m = obj;
        this.f19759o |= Integer.MIN_VALUE;
        return C2452c0.q(this.f19758n, this);
    }
}
