package s4;

import c4.AbstractC0542c;

/* renamed from: s4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2372i extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f19271k;

    /* renamed from: l, reason: collision with root package name */
    public int f19272l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2373j f19273m;

    /* renamed from: n, reason: collision with root package name */
    public Object f19274n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC2369f f19275o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2372i(C2373j c2373j, a4.c cVar) {
        super(cVar);
        this.f19273m = c2373j;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19271k = obj;
        this.f19272l |= Integer.MIN_VALUE;
        return this.f19273m.a(null, this);
    }
}
