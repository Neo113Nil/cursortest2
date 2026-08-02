package I;

import P.AbstractC0329z;
import P.C0315s;
import a.AbstractC0444a;
import i4.InterfaceC2015a;
import k4.AbstractC2036a;

/* renamed from: I.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153f extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2480l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2481m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2482n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2483o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2484p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153f(b0.p pVar, InterfaceC2015a interfaceC2015a, boolean z3, int i) {
        super(2);
        this.f2483o = pVar;
        this.f2484p = interfaceC2015a;
        this.f2481m = z3;
        this.f2482n = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2480l;
        C0315s c0315s = (C0315s) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                int B5 = AbstractC0329z.B(this.f2482n | 1);
                AbstractC2036a.c((b0.p) this.f2483o, (InterfaceC2015a) this.f2484p, this.f2481m, c0315s, B5);
                break;
            default:
                int B6 = AbstractC0329z.B(this.f2482n | 1);
                AbstractC0444a.e(this.f2481m, (V0.j) this.f2483o, (O) this.f2484p, c0315s, B6);
                break;
        }
        return W3.o.f6046a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153f(boolean z3, V0.j jVar, O o5, int i) {
        super(2);
        this.f2481m = z3;
        this.f2483o = jVar;
        this.f2484p = o5;
        this.f2482n = i;
    }
}
