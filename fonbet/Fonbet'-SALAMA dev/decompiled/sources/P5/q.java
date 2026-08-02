package P5;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* loaded from: classes2.dex */
public final class q extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5679a;

    /* renamed from: b, reason: collision with root package name */
    public int f5680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G6.e f5681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(G6.e eVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f5681c = eVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f5679a = obj;
        this.f5680b |= Integer.MIN_VALUE;
        return this.f5681c.c(null, this);
    }
}
