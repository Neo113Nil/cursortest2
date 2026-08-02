package I0;

import G6.r;
import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* loaded from: classes.dex */
public final class a extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3485a;

    /* renamed from: b, reason: collision with root package name */
    public int f3486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f3487c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r rVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f3487c = rVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f3485a = obj;
        this.f3486b |= Integer.MIN_VALUE;
        return this.f3487c.c(null, this);
    }
}
