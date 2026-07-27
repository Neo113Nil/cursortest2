package A2;

import a.AbstractC0086a;
import d2.C0279i;
import e2.AbstractC0292g;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final g2.h f99a;

    /* renamed from: b, reason: collision with root package name */
    public final int f100b;

    /* renamed from: c, reason: collision with root package name */
    public final int f101c;

    public f(g2.h hVar, int i3, int i4) {
        this.f99a = hVar;
        this.f100b = i3;
        this.f101c = i4;
    }

    public abstract Object a(y2.o oVar, InterfaceC0319c interfaceC0319c);

    public abstract f b(g2.h hVar, int i3, int i4);

    @Override // z2.d
    public Object l(z2.e eVar, InterfaceC0319c interfaceC0319c) {
        d dVar = new d(eVar, this, null);
        B2.s sVar = new B2.s(interfaceC0319c, interfaceC0319c.getContext());
        Object Z2 = AbstractC0086a.Z(sVar, sVar, dVar);
        return Z2 == EnumC0326a.f4994a ? Z2 : C0279i.f4852a;
    }

    @Override // A2.j
    public final z2.d p(g2.h hVar, int i3, int i4) {
        g2.h hVar2 = this.f99a;
        g2.h h3 = hVar.h(hVar2);
        int i5 = this.f101c;
        int i6 = this.f100b;
        if (i4 == 1) {
            if (i6 != -3) {
                if (i3 != -3) {
                    if (i6 != -2) {
                        if (i3 != -2) {
                            i3 += i6;
                            if (i3 < 0) {
                                i3 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i3 = i6;
            }
            i4 = i5;
        }
        return (kotlin.jvm.internal.j.a(h3, hVar2) && i3 == i6 && i4 == i5) ? this : b(h3, i3, i4);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        g2.i iVar = g2.i.f4981a;
        g2.h hVar = this.f99a;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i3 = this.f100b;
        if (i3 != -3) {
            arrayList.add("capacity=" + i3);
        }
        int i4 = this.f101c;
        if (i4 != 1) {
            arrayList.add("onBufferOverflow=".concat(i4 != 1 ? i4 != 2 ? i4 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + AbstractC0292g.Z(arrayList, ", ", null, null, null, 62) + ']';
    }
}
