package M;

import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class A extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public P f1546a;

    /* renamed from: b, reason: collision with root package name */
    public int f1547b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1548c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f1549d;

    /* renamed from: e, reason: collision with root package name */
    public int f1550e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(P p5, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f1549d = p5;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1548c = obj;
        this.f1550e |= Integer.MIN_VALUE;
        return this.f1549d.h(this);
    }
}
