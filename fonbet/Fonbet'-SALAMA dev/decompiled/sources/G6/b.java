package G6;

import k6.AbstractC1356c;

/* loaded from: classes2.dex */
public final class b extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public F6.p f3070a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f3072c;

    /* renamed from: d, reason: collision with root package name */
    public int f3073d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AbstractC1356c abstractC1356c) {
        super(abstractC1356c);
        this.f3072c = cVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f3071b = obj;
        this.f3073d |= Integer.MIN_VALUE;
        return this.f3072c.a(null, this);
    }
}
