package s4;

import b4.EnumC0510a;
import c4.AbstractC0542c;
import p4.U;

/* loaded from: classes.dex */
public final class L extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public M f19239k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC2369f f19240l;

    /* renamed from: m, reason: collision with root package name */
    public N f19241m;

    /* renamed from: n, reason: collision with root package name */
    public U f19242n;

    /* renamed from: o, reason: collision with root package name */
    public Object f19243o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f19244p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ M f19245q;

    /* renamed from: r, reason: collision with root package name */
    public int f19246r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(M m5, a4.c cVar) {
        super(cVar);
        this.f19245q = m5;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19244p = obj;
        this.f19246r |= Integer.MIN_VALUE;
        this.f19245q.a(null, this);
        return EnumC0510a.f7289k;
    }
}
