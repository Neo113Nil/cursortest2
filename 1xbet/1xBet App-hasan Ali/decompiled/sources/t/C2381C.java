package t;

import u.C2456e0;
import u.p0;

/* renamed from: t.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2381C extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f19330l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2382D f19331m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2381C(C2382D c2382d, int i) {
        super(1);
        this.f19330l = i;
        this.f19331m = c2382d;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f19330l) {
            case 0:
                p0 p0Var = (p0) obj;
                v vVar = v.f19415k;
                v vVar2 = v.f19416l;
                boolean a5 = p0Var.a(vVar, vVar2);
                C2456e0 c2456e0 = null;
                C2382D c2382d = this.f19331m;
                if (a5) {
                    C2383E c2383e = c2382d.f19338z;
                } else if (p0Var.a(vVar2, v.f19417m)) {
                    N n5 = c2382d.f19332A.f19343a;
                } else {
                    c2456e0 = AbstractC2379A.f19324d;
                }
                return c2456e0 == null ? AbstractC2379A.f19324d : c2456e0;
            default:
                p0 p0Var2 = (p0) obj;
                v vVar3 = v.f19415k;
                v vVar4 = v.f19416l;
                boolean a6 = p0Var2.a(vVar3, vVar4);
                C2382D c2382d2 = this.f19331m;
                if (a6) {
                    C2383E c2383e2 = c2382d2.f19338z;
                    return AbstractC2379A.f19323c;
                }
                if (!p0Var2.a(vVar4, v.f19417m)) {
                    return AbstractC2379A.f19323c;
                }
                N n6 = c2382d2.f19332A.f19343a;
                return AbstractC2379A.f19323c;
        }
    }
}
