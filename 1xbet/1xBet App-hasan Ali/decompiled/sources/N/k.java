package N;

import P.AbstractC0329z;
import P.C0315s;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f3703l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i4.e f3704m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3705n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j5, i4.e eVar, int i) {
        super(2);
        this.f3703l = j5;
        this.f3704m = eVar;
        this.f3705n = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int B5 = AbstractC0329z.B(this.f3705n | 1);
        n.c(this.f3703l, this.f3704m, (C0315s) obj, B5);
        return W3.o.f6046a;
    }
}
