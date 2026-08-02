package u;

import P.d1;

/* loaded from: classes.dex */
public final class n0 implements d1 {

    /* renamed from: k, reason: collision with root package name */
    public final r0 f19883k;

    /* renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.m f19884l;

    /* renamed from: m, reason: collision with root package name */
    public kotlin.jvm.internal.m f19885m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o0 f19886n;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(o0 o0Var, r0 r0Var, i4.c cVar, i4.c cVar2) {
        this.f19886n = o0Var;
        this.f19883k = r0Var;
        this.f19884l = (kotlin.jvm.internal.m) cVar;
        this.f19885m = (kotlin.jvm.internal.m) cVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i4.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v4, types: [i4.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v5, types: [i4.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v1, types: [i4.c, kotlin.jvm.internal.m] */
    public final void b(p0 p0Var) {
        Object c5 = this.f19885m.c(p0Var.c());
        boolean g5 = this.f19886n.f19892c.g();
        r0 r0Var = this.f19883k;
        if (g5) {
            r0Var.g(this.f19885m.c(p0Var.b()), c5, (InterfaceC2430A) this.f19884l.c(p0Var));
        } else {
            r0Var.h(c5, (InterfaceC2430A) this.f19884l.c(p0Var));
        }
    }

    @Override // P.d1
    public final Object getValue() {
        b(this.f19886n.f19892c.f());
        return this.f19883k.f19908t.getValue();
    }
}
