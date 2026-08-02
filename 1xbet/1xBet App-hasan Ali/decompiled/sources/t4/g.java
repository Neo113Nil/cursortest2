package t4;

import java.util.ArrayList;
import p4.AbstractC2282w;
import p4.EnumC2281v;
import p4.InterfaceC2280u;
import s4.InterfaceC2368e;

/* loaded from: classes.dex */
public abstract class g implements q {

    /* renamed from: k, reason: collision with root package name */
    public final a4.h f19604k;

    /* renamed from: l, reason: collision with root package name */
    public final int f19605l;

    /* renamed from: m, reason: collision with root package name */
    public final r4.a f19606m;

    public g(a4.h hVar, int i, r4.a aVar) {
        this.f19604k = hVar;
        this.f19605l = i;
        this.f19606m = aVar;
    }

    @Override // t4.q
    public final InterfaceC2368e b(a4.h hVar, int i, r4.a aVar) {
        a4.h hVar2 = this.f19604k;
        a4.h m5 = hVar.m(hVar2);
        r4.a aVar2 = r4.a.f19106k;
        r4.a aVar3 = this.f19606m;
        int i5 = this.f19605l;
        if (aVar == aVar2) {
            if (i5 != -3) {
                if (i != -3) {
                    if (i5 != -2) {
                        if (i != -2) {
                            i += i5;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i5;
            }
            aVar = aVar3;
        }
        return (kotlin.jvm.internal.l.a(m5, hVar2) && i == i5 && aVar == aVar3) ? this : e(m5, i, aVar);
    }

    public String c() {
        return null;
    }

    public abstract Object d(r4.o oVar, f fVar);

    public abstract g e(a4.h hVar, int i, r4.a aVar);

    public InterfaceC2368e f() {
        return null;
    }

    public r4.p g(InterfaceC2280u interfaceC2280u) {
        int i = this.f19605l;
        if (i == -3) {
            i = -2;
        }
        EnumC2281v enumC2281v = EnumC2281v.f18823m;
        i4.e fVar = new f(this, null);
        r4.n nVar = new r4.n(AbstractC2282w.q(interfaceC2280u, this.f19604k), r4.j.a(i, 4, this.f19606m));
        nVar.e0(enumC2281v, nVar, fVar);
        return nVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String c5 = c();
        if (c5 != null) {
            arrayList.add(c5);
        }
        a4.i iVar = a4.i.f6649k;
        a4.h hVar = this.f19604k;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i = this.f19605l;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        r4.a aVar = r4.a.f19106k;
        r4.a aVar2 = this.f19606m;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return L1.a.p(sb, X3.m.d0(arrayList, ", ", null, null, null, 62), ']');
    }
}
