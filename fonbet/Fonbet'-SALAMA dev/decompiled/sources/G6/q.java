package G6;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* loaded from: classes2.dex */
public final class q extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public r f3116a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3117b;

    /* renamed from: c, reason: collision with root package name */
    public int f3118c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f3119d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3120e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f3119d = rVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f3117b = obj;
        this.f3118c |= Integer.MIN_VALUE;
        return this.f3119d.c(null, this);
    }
}
