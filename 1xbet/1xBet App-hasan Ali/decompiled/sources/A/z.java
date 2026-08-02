package A;

import c4.AbstractC0542c;
import v.d0;

/* loaded from: classes.dex */
public final class z extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public E f142k;

    /* renamed from: l, reason: collision with root package name */
    public d0 f143l;

    /* renamed from: m, reason: collision with root package name */
    public i4.e f144m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f145n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ E f146o;

    /* renamed from: p, reason: collision with root package name */
    public int f147p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(E e3, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f146o = e3;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f145n = obj;
        this.f147p |= Integer.MIN_VALUE;
        return this.f146o.e(null, null, this);
    }
}
