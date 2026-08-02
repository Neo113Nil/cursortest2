package E;

import P.AbstractC0329z;
import P.C0315s;

/* loaded from: classes.dex */
public final class F extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I.O f1026l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1027m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1028n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(I.O o5, boolean z3, int i) {
        super(2);
        this.f1026l = o5;
        this.f1027m = z3;
        this.f1028n = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int B5 = AbstractC0329z.B(this.f1028n | 1);
        W.f(this.f1026l, this.f1027m, (C0315s) obj, B5);
        return W3.o.f6046a;
    }
}
