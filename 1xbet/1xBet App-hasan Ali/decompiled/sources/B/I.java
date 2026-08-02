package B;

import A0.C0028g0;
import I.InterfaceC0159l;
import P.AbstractC0329z;
import P.C0315s;
import i4.InterfaceC2015a;
import k4.AbstractC2036a;
import v.w0;
import x0.f0;
import x0.i0;

/* loaded from: classes.dex */
public final class I extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f628l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W3.c f629m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f630n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f631o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f632p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(Object obj, Object obj2, W3.c cVar, int i, int i5) {
        super(2);
        this.f628l = i5;
        this.f631o = obj;
        this.f632p = obj2;
        this.f629m = cVar;
        this.f630n = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f628l) {
            case 0:
                ((Number) obj2).intValue();
                int B5 = AbstractC0329z.B(this.f630n | 1);
                X.d dVar = (X.d) this.f629m;
                ((J) this.f631o).b(this.f632p, dVar, (C0315s) obj, B5);
                break;
            case 1:
                ((Number) obj2).intValue();
                int B6 = AbstractC0329z.B(this.f630n | 1);
                b0.d dVar2 = (b0.d) this.f632p;
                X.d dVar3 = (X.d) this.f629m;
                AbstractC2036a.a((InterfaceC0159l) this.f631o, dVar2, dVar3, (C0315s) obj, B6);
                break;
            case 2:
                ((Number) obj2).intValue();
                int B7 = AbstractC0329z.B(this.f630n | 1);
                androidx.compose.ui.viewinterop.a.a((i4.c) this.f631o, (b0.p) this.f632p, (i4.c) this.f629m, (C0315s) obj, B7);
                break;
            case 3:
                ((Number) obj2).intValue();
                int B8 = AbstractC0329z.B(this.f630n | 1);
                b0.m mVar = b0.m.f7161k;
                C0028g0 c0028g0 = (C0028g0) this.f629m;
                w0.a((w.m) this.f631o, (InterfaceC2015a) this.f632p, mVar, c0028g0, (C0315s) obj, B8);
                break;
            case 4:
                ((Number) obj2).intValue();
                int B9 = AbstractC0329z.B(this.f630n | 1);
                C0028g0 c0028g02 = (C0028g0) this.f629m;
                w.p.c((w.g) this.f631o, (InterfaceC2015a) this.f632p, c0028g02, (C0315s) obj, B9);
                break;
            default:
                ((Number) obj2).intValue();
                int B10 = AbstractC0329z.B(this.f630n | 1);
                i4.e eVar = (i4.e) this.f629m;
                f0.b((i0) this.f631o, (b0.p) this.f632p, eVar, (C0315s) obj, B10);
                break;
        }
        return W3.o.f6046a;
    }
}
