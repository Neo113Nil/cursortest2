package H1;

import G1.AbstractC0136g;
import G1.C0140k;
import P.InterfaceC0289e0;
import r3.AbstractC2349a;
import t.C2383E;
import t.C2384F;
import t.C2400l;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2203l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f2204m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f2205n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f2206o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f2207p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public B(i iVar, i4.c cVar, i4.c cVar2, InterfaceC0289e0 interfaceC0289e0, int i) {
        super(1);
        this.f2203l = i;
        switch (i) {
            case 1:
                this.f2204m = iVar;
                this.f2205n = (kotlin.jvm.internal.m) cVar;
                this.f2206o = (kotlin.jvm.internal.m) cVar2;
                this.f2207p = interfaceC0289e0;
                super(1);
                break;
            default:
                this.f2204m = iVar;
                this.f2205n = (kotlin.jvm.internal.m) cVar;
                this.f2206o = (kotlin.jvm.internal.m) cVar2;
                this.f2207p = interfaceC0289e0;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i4.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v0, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // i4.c
    public final Object c(Object obj) {
        ?? r02 = this.f2205n;
        ?? r1 = this.f2206o;
        InterfaceC0289e0 interfaceC0289e0 = this.f2207p;
        i iVar = this.f2204m;
        switch (this.f2203l) {
            case 0:
                C2400l c2400l = (C2400l) obj;
                G1.y yVar = ((C0140k) c2400l.c()).f1899l;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination", yVar);
                h hVar = (h) yVar;
                if (((Boolean) iVar.f2216c.getValue()).booleanValue() || AbstractC2349a.g(interfaceC0289e0)) {
                    int i = G1.y.f1963s;
                    for (G1.y yVar2 : AbstractC0136g.b(hVar)) {
                        if (yVar2 instanceof h) {
                            ((h) yVar2).getClass();
                        } else if (yVar2 instanceof f) {
                            ((f) yVar2).getClass();
                        }
                    }
                    return (C2383E) r02.c(c2400l);
                }
                int i5 = G1.y.f1963s;
                for (G1.y yVar3 : AbstractC0136g.b(hVar)) {
                    if (yVar3 instanceof h) {
                        ((h) yVar3).getClass();
                    } else if (yVar3 instanceof f) {
                        ((f) yVar3).getClass();
                    }
                }
                return (C2383E) r1.c(c2400l);
            default:
                C2400l c2400l2 = (C2400l) obj;
                G1.y yVar4 = ((C0140k) c2400l2.b()).f1899l;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination", yVar4);
                h hVar2 = (h) yVar4;
                if (((Boolean) iVar.f2216c.getValue()).booleanValue() || AbstractC2349a.g(interfaceC0289e0)) {
                    int i6 = G1.y.f1963s;
                    for (G1.y yVar5 : AbstractC0136g.b(hVar2)) {
                        if (yVar5 instanceof h) {
                            ((h) yVar5).getClass();
                        } else if (yVar5 instanceof f) {
                            ((f) yVar5).getClass();
                        }
                    }
                    return (C2384F) r02.c(c2400l2);
                }
                int i7 = G1.y.f1963s;
                for (G1.y yVar6 : AbstractC0136g.b(hVar2)) {
                    if (yVar6 instanceof h) {
                        ((h) yVar6).getClass();
                    } else if (yVar6 instanceof f) {
                        ((f) yVar6).getClass();
                    }
                }
                return (C2384F) r1.c(c2400l2);
        }
    }
}
