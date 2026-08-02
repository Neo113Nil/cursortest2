package E;

import P.AbstractC0329z;
import P.C0315s;

/* renamed from: E.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089b extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b0.p f1118l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1119m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1120n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0089b(b0.p pVar, int i, int i5) {
        super(2);
        this.f1118l = pVar;
        this.f1119m = i;
        this.f1120n = i5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int B5 = AbstractC0329z.B(this.f1119m | 1);
        int i = this.f1120n;
        AbstractC0097f.b(this.f1118l, (C0315s) obj, B5, i);
        return W3.o.f6046a;
    }
}
