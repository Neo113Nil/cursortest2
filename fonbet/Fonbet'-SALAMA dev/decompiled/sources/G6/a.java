package G6;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;
import w1.C1761y0;

/* loaded from: classes2.dex */
public final class a extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public H6.n f3066a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1761y0 f3068c;

    /* renamed from: d, reason: collision with root package name */
    public int f3069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C1761y0 c1761y0, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f3068c = c1761y0;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f3067b = obj;
        this.f3069d |= Integer.MIN_VALUE;
        return this.f3068c.r(null, this);
    }
}
