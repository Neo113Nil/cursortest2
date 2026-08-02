package I;

import P.C0302l;
import P.C0315s;
import i4.InterfaceC2015a;

/* renamed from: I.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156i extends kotlin.jvm.internal.m implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f2492l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2493m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0156i(InterfaceC2015a interfaceC2015a, boolean z3) {
        super(3);
        this.f2492l = interfaceC2015a;
        this.f2493m = z3;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        b0.p pVar = (b0.p) obj;
        C0315s c0315s = (C0315s) obj2;
        ((Number) obj3).intValue();
        c0315s.X(-196777734);
        long j5 = ((W) c0315s.j(X.f2457a)).f2455a;
        boolean e3 = c0315s.e(j5);
        InterfaceC2015a interfaceC2015a = this.f2492l;
        boolean f = e3 | c0315s.f(interfaceC2015a);
        boolean z3 = this.f2493m;
        boolean g5 = f | c0315s.g(z3);
        Object M5 = c0315s.M();
        if (g5 || M5 == C0302l.f4480a) {
            M5 = new C0155h(j5, interfaceC2015a, z3);
            c0315s.i0(M5);
        }
        b0.p b3 = androidx.compose.ui.draw.a.b(pVar, (i4.c) M5);
        c0315s.q(false);
        return b3;
    }
}
