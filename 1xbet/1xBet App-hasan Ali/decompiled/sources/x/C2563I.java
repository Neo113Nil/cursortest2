package x;

import c4.AbstractC0542c;

/* renamed from: x.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2563I extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public C2589k0 f20642k;

    /* renamed from: l, reason: collision with root package name */
    public C2606u f20643l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f20644m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2589k0 f20645n;

    /* renamed from: o, reason: collision with root package name */
    public int f20646o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2563I(C2589k0 c2589k0, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f20645n = c2589k0;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f20644m = obj;
        this.f20646o |= Integer.MIN_VALUE;
        return C2589k0.D0(this.f20645n, null, this);
    }
}
