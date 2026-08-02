package x;

import c4.AbstractC0542c;

/* renamed from: x.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2561G extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public C2589k0 f20630k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20631l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2589k0 f20632m;

    /* renamed from: n, reason: collision with root package name */
    public int f20633n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2561G(C2589k0 c2589k0, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f20632m = c2589k0;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f20631l = obj;
        this.f20633n |= Integer.MIN_VALUE;
        return C2589k0.B0(this.f20632m, this);
    }
}
