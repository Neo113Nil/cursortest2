package M;

import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class X extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public Y f1645a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1646b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1647c;

    /* renamed from: d, reason: collision with root package name */
    public a0 f1648d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y f1650f;

    /* renamed from: g, reason: collision with root package name */
    public int f1651g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y5, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f1650f = y5;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1649e = obj;
        this.f1651g |= Integer.MIN_VALUE;
        return this.f1650f.b(null, this);
    }
}
