package b0;

import k6.AbstractC1356c;

/* loaded from: classes.dex */
public final class e0 extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public Object f10029a;

    /* renamed from: b, reason: collision with root package name */
    public M6.d f10030b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f10032d;

    /* renamed from: e, reason: collision with root package name */
    public int f10033e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, AbstractC1356c abstractC1356c) {
        super(abstractC1356c);
        this.f10032d = h0Var;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f10031c = obj;
        this.f10033e |= Integer.MIN_VALUE;
        return this.f10032d.b(null, this);
    }
}
