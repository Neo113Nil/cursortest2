package G6;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;
import w1.V0;

/* loaded from: classes2.dex */
public final class p extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3112a;

    /* renamed from: b, reason: collision with root package name */
    public int f3113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V0 f3114c;

    /* renamed from: d, reason: collision with root package name */
    public r f3115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(V0 v02, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f3114c = v02;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f3112a = obj;
        this.f3113b |= Integer.MIN_VALUE;
        return this.f3114c.r(null, this);
    }
}
