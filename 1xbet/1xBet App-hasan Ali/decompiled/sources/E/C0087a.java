package E;

import A0.C0022e0;
import I.InterfaceC0159l;
import P.AbstractC0329z;
import P.C0315s;
import z.C2681E;

/* renamed from: E.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087a extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1111l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f1112m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1113n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1114o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0087a(long j5, C2681E c2681e, X.d dVar) {
        super(2);
        this.f1112m = j5;
        this.f1113n = c2681e;
        this.f1114o = dVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1111l) {
            case 0:
                ((Number) obj2).intValue();
                int B5 = AbstractC0329z.B(1);
                long j5 = this.f1112m;
                AbstractC0097f.a((InterfaceC0159l) this.f1113n, (b0.p) this.f1114o, j5, (C0315s) obj, B5);
                break;
            default:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
                    c0315s.S();
                } else {
                    int i = 9;
                    N.a.a(this.f1112m, ((M.v0) c0315s.j(M.w0.f3580a)).f3575m, X.e.d(1327513942, new C0022e0(i, (C2681E) this.f1113n, (X.d) this.f1114o), c0315s), c0315s, 384);
                }
                break;
        }
        return W3.o.f6046a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0087a(InterfaceC0159l interfaceC0159l, b0.p pVar, long j5, int i) {
        super(2);
        this.f1113n = interfaceC0159l;
        this.f1114o = pVar;
        this.f1112m = j5;
    }
}
