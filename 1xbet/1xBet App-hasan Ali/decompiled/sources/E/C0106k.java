package E;

import P.AbstractC0329z;
import P.C0315s;
import a.AbstractC0444a;

/* renamed from: E.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106k extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1213l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1214m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1215n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1216o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0106k(int i, int i5, Object obj, Object obj2) {
        super(2);
        this.f1213l = i5;
        this.f1216o = obj;
        this.f1214m = obj2;
        this.f1215n = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1213l;
        C0315s c0315s = (C0315s) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                W.b((I.O) this.f1216o, (X.d) this.f1214m, c0315s, AbstractC0329z.B(this.f1215n | 1));
                break;
            case 1:
                int B5 = AbstractC0329z.B(this.f1215n | 1);
                AbstractC0444a.g((Y.d) this.f1216o, (X.d) this.f1214m, c0315s, B5);
                break;
            default:
                ((u.t0) this.f1216o).a(this.f1214m, c0315s, AbstractC0329z.B(this.f1215n | 1));
                break;
        }
        return W3.o.f6046a;
    }
}
