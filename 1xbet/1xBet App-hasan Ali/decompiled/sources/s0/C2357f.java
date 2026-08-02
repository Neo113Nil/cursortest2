package s0;

import c4.AbstractC0542c;

/* renamed from: s0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2357f extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public long f19167k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f19168l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2358g f19169m;

    /* renamed from: n, reason: collision with root package name */
    public int f19170n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2357f(C2358g c2358g, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f19169m = c2358g;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19168l = obj;
        this.f19170n |= Integer.MIN_VALUE;
        return this.f19169m.L(0L, this);
    }
}
