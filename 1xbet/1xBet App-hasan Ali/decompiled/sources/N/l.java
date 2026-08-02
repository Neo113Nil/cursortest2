package N;

import P.C0315s;
import u.AbstractC2453d;
import u.AbstractC2478z;
import u.p0;
import u.z0;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public static final l f3706l = new l(3);

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        p0 p0Var = (p0) obj;
        C0315s c0315s = (C0315s) obj2;
        ((Number) obj3).intValue();
        c0315s.X(-1154662212);
        c cVar = c.f3668k;
        c cVar2 = c.f3669l;
        Object m5 = p0Var.a(cVar, cVar2) ? AbstractC2453d.m(67, 2, AbstractC2478z.f19971b) : (p0Var.a(cVar2, cVar) || p0Var.a(c.f3670m, cVar2)) ? new z0(83, 67, AbstractC2478z.f19971b) : AbstractC2453d.l(7, null);
        c0315s.q(false);
        return m5;
    }
}
