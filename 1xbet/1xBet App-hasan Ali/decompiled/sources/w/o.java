package w;

import P.AbstractC0329z;
import P.C0315s;
import i4.InterfaceC2015a;
import z.AbstractC2701c;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20481l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f20482m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f20483n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f20484o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f20485p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ W3.c f20486q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b0.p pVar, b0.d dVar, boolean z3, X.d dVar2, int i) {
        super(2);
        this.f20484o = pVar;
        this.f20485p = dVar;
        this.f20482m = z3;
        this.f20486q = dVar2;
        this.f20483n = i;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [i4.a, kotlin.jvm.internal.m] */
    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20481l) {
            case 0:
                ((Number) obj2).intValue();
                int B5 = AbstractC0329z.B(this.f20483n | 1);
                ?? r32 = (kotlin.jvm.internal.m) this.f20486q;
                boolean z3 = this.f20482m;
                C2539b c2539b = (C2539b) this.f20485p;
                p.b((String) this.f20484o, z3, c2539b, r32, (C0315s) obj, B5);
                break;
            default:
                ((Number) obj2).intValue();
                int B6 = AbstractC0329z.B(this.f20483n | 1);
                X.d dVar = (X.d) this.f20486q;
                AbstractC2701c.a((b0.p) this.f20484o, (b0.d) this.f20485p, this.f20482m, dVar, (C0315s) obj, B6);
                break;
        }
        return W3.o.f6046a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(String str, boolean z3, C2539b c2539b, InterfaceC2015a interfaceC2015a, int i) {
        super(2);
        this.f20484o = str;
        this.f20482m = z3;
        this.f20485p = c2539b;
        this.f20486q = (kotlin.jvm.internal.m) interfaceC2015a;
        this.f20483n = i;
    }
}
