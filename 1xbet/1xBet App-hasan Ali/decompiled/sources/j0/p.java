package j0;

import a.AbstractC0444a;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17460l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f17461m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i) {
        super(1);
        this.f17460l = i;
        this.f17461m = qVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f17460l) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f17461m.f17471n.b(AbstractC0444a.r(doubleValue, r10.f17464e, r10.f)));
            default:
                return Double.valueOf(AbstractC0444a.r(this.f17461m.f17468k.b(((Number) obj).doubleValue()), r10.f17464e, r10.f));
        }
    }
}
