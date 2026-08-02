package H6;

import D6.E;
import f6.C1116i;
import g6.AbstractC1159h;
import i6.C1293j;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1292i f3434a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3435b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3436c;

    public f(InterfaceC1292i interfaceC1292i, int i7, int i8) {
        this.f3434a = interfaceC1292i;
        this.f3435b = i7;
        this.f3436c = i8;
    }

    public abstract Object a(F6.p pVar, InterfaceC1287d interfaceC1287d);

    public abstract f b(InterfaceC1292i interfaceC1292i, int i7, int i8);

    @Override // G6.g
    public Object r(G6.h hVar, InterfaceC1287d interfaceC1287d) {
        Object e7 = E.e(new d(hVar, this, null), interfaceC1287d);
        return e7 == j6.a.f14642a ? e7 : C1116i.f13008a;
    }

    @Override // H6.j
    public final G6.g t(InterfaceC1292i interfaceC1292i, int i7, int i8) {
        InterfaceC1292i interfaceC1292i2 = this.f3434a;
        InterfaceC1292i plus = interfaceC1292i.plus(interfaceC1292i2);
        int i9 = this.f3436c;
        int i10 = this.f3435b;
        if (i8 == 1) {
            if (i10 != -3) {
                if (i7 != -3) {
                    if (i10 != -2) {
                        if (i7 != -2) {
                            i7 += i10;
                            if (i7 < 0) {
                                i7 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                            }
                        }
                    }
                }
                i7 = i10;
            }
            i8 = i9;
        }
        return (t6.h.a(plus, interfaceC1292i2) && i7 == i10 && i8 == i9) ? this : b(plus, i7, i8);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        C1293j c1293j = C1293j.f14068a;
        InterfaceC1292i interfaceC1292i = this.f3434a;
        if (interfaceC1292i != c1293j) {
            arrayList.add("context=" + interfaceC1292i);
        }
        int i7 = this.f3435b;
        if (i7 != -3) {
            arrayList.add("capacity=" + i7);
        }
        int i8 = this.f3436c;
        if (i8 != 1) {
            arrayList.add("onBufferOverflow=".concat(i8 != 1 ? i8 != 2 ? i8 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + AbstractC1159h.T0(arrayList, ", ", null, null, null, 62) + ']';
    }
}
