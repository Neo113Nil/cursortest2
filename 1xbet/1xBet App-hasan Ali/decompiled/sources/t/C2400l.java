package t;

import P.AbstractC0329z;
import P.C0305m0;
import r.C2321G;
import r.O;
import u.p0;
import u.t0;

/* renamed from: t.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2400l implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f19385a;

    /* renamed from: b, reason: collision with root package name */
    public b0.h f19386b;

    /* renamed from: c, reason: collision with root package name */
    public final C0305m0 f19387c = AbstractC0329z.t(new W0.l(0));

    /* renamed from: d, reason: collision with root package name */
    public final C2321G f19388d;

    public C2400l(t0 t0Var, b0.h hVar) {
        this.f19385a = t0Var;
        this.f19386b = hVar;
        long[] jArr = O.f18957a;
        this.f19388d = new C2321G();
    }

    @Override // u.p0
    public final boolean a(Enum r22, Enum r32) {
        return r22.equals(b()) && r32.equals(c());
    }

    @Override // u.p0
    public final Object b() {
        return this.f19385a.f().b();
    }

    @Override // u.p0
    public final Object c() {
        return this.f19385a.f().c();
    }
}
