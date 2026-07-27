package M;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class B extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public P f1551a;

    /* renamed from: b, reason: collision with root package name */
    public k0 f1552b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1553c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P f1555e;

    /* renamed from: f, reason: collision with root package name */
    public int f1556f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(P p5, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.f1555e = p5;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1554d = obj;
        this.f1556f |= Integer.MIN_VALUE;
        return P.e(this.f1555e, false, this);
    }
}
