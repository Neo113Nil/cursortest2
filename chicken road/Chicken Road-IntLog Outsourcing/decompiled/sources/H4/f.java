package H4;

import a.AbstractC0169a;
import g4.AbstractC0465j;
import java.util.ArrayList;
import k4.C1224j;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public abstract class f implements q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1223i f1172a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1173b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1174c;

    public f(InterfaceC1223i interfaceC1223i, int i2, int i3) {
        this.f1172a = interfaceC1223i;
        this.f1173b = i2;
        this.f1174c = i3;
    }

    @Override // H4.q
    public final G4.d a(InterfaceC1223i interfaceC1223i, int i2, int i3) {
        InterfaceC1223i interfaceC1223i2 = this.f1172a;
        InterfaceC1223i A5 = interfaceC1223i.A(interfaceC1223i2);
        int i6 = this.f1174c;
        int i7 = this.f1173b;
        if (i3 == 1) {
            if (i7 != -3) {
                if (i2 != -3) {
                    if (i7 != -2) {
                        if (i2 != -2) {
                            i2 += i7;
                            if (i2 < 0) {
                                i2 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i2 = i7;
            }
            i3 = i6;
        }
        return (kotlin.jvm.internal.i.a(A5, interfaceC1223i2) && i2 == i7 && i3 == i6) ? this : c(A5, i2, i3);
    }

    public abstract Object b(F4.q qVar, InterfaceC1218d interfaceC1218d);

    public abstract f c(InterfaceC1223i interfaceC1223i, int i2, int i3);

    @Override // G4.d
    public Object i(G4.e eVar, InterfaceC1218d interfaceC1218d) {
        d dVar = new d(eVar, this, null);
        I4.t tVar = new I4.t(interfaceC1218d, interfaceC1218d.getContext());
        Object G5 = AbstractC0169a.G(tVar, tVar, dVar);
        return G5 == EnumC1260a.f11058a ? G5 : f4.v.f5689a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        C1224j c1224j = C1224j.f10720a;
        InterfaceC1223i interfaceC1223i = this.f1172a;
        if (interfaceC1223i != c1224j) {
            arrayList.add("context=" + interfaceC1223i);
        }
        int i2 = this.f1173b;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f1174c;
        if (i3 != 1) {
            arrayList.add("onBufferOverflow=".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return B0.o.l(sb, AbstractC0465j.K0(arrayList, ", ", null, null, null, 62), ']');
    }
}
