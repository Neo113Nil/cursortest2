package G6;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* loaded from: classes2.dex */
public final class d extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3077b;

    /* renamed from: c, reason: collision with root package name */
    public int f3078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f3077b = eVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f3076a = obj;
        this.f3078c |= Integer.MIN_VALUE;
        return this.f3077b.c(null, this);
    }
}
