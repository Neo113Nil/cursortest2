package B;

import P.AbstractC0329z;
import P.C0315s;
import a.AbstractC0444a;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f701l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f702m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f703n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f704o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f705p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f706q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(A.k kVar, Object obj, int i, Object obj2, int i5) {
        super(2);
        this.f705p = kVar;
        this.f702m = obj;
        this.f703n = i;
        this.f706q = obj2;
        this.f704o = i5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f701l;
        C0315s c0315s = (C0315s) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                int B5 = AbstractC0329z.B(this.f704o | 1);
                AbstractC0444a.h((A.k) this.f705p, this.f702m, this.f703n, this.f706q, c0315s, B5);
                break;
            case 1:
                int B6 = AbstractC0329z.B(this.f704o | 1);
                AbstractC2349a.d(this.f702m, this.f703n, (x) this.f705p, (X.d) this.f706q, c0315s, B6);
                break;
            default:
                int B7 = AbstractC0329z.B(this.f703n | 1);
                androidx.compose.ui.viewinterop.a.b((i4.c) this.f705p, (b0.p) this.f702m, (i4.c) this.f706q, c0315s, B7, this.f704o);
                break;
        }
        return W3.o.f6046a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(i4.c cVar, b0.p pVar, i4.c cVar2, int i, int i5) {
        super(2);
        this.f705p = cVar;
        this.f702m = pVar;
        this.f706q = cVar2;
        this.f703n = i;
        this.f704o = i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Object obj, int i, x xVar, X.d dVar, int i5) {
        super(2);
        this.f702m = obj;
        this.f703n = i;
        this.f705p = xVar;
        this.f706q = dVar;
        this.f704o = i5;
    }
}
