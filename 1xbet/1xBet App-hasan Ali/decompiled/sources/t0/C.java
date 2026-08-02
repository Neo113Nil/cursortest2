package t0;

import c4.AbstractC0540a;
import c4.AbstractC0542c;
import p4.C2285z;

/* loaded from: classes.dex */
public final class C extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public C2285z f19432k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f19433l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E f19434m;

    /* renamed from: n, reason: collision with root package name */
    public int f19435n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(E e3, AbstractC0540a abstractC0540a) {
        super(abstractC0540a);
        this.f19434m = e3;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19433l = obj;
        this.f19435n |= Integer.MIN_VALUE;
        return this.f19434m.h(0L, null, this);
    }
}
