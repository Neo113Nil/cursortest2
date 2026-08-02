package b0;

import k6.AbstractC1356c;

/* loaded from: classes.dex */
public final class M extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public t6.o f9953a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f9955c;

    /* renamed from: d, reason: collision with root package name */
    public int f9956d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O o7, AbstractC1356c abstractC1356c) {
        super(abstractC1356c);
        this.f9955c = o7;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f9954b = obj;
        this.f9956d |= Integer.MIN_VALUE;
        return this.f9955c.j(null, false, this);
    }
}
