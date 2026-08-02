package s0;

import c4.AbstractC0542c;

/* renamed from: s0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2356e extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public long f19162k;

    /* renamed from: l, reason: collision with root package name */
    public long f19163l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f19164m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2358g f19165n;

    /* renamed from: o, reason: collision with root package name */
    public int f19166o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2356e(C2358g c2358g, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f19165n = c2358g;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19164m = obj;
        this.f19166o |= Integer.MIN_VALUE;
        return this.f19165n.G(0L, 0L, this);
    }
}
