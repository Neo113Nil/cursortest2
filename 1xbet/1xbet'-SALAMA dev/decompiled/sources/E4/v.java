package E4;

import Y4.I0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends C0177j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2241e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(H4.j jVar, EnumC0176i enumC0176i, I0 i7) {
        super(jVar, enumC0176i, i7);
        this.f2240d = 2;
        p113p3.f.O("KeyFieldFilter expects a ReferenceValue", H4.o.i(i7), new Object[0]);
        this.f2241e = H4.h.c(i7.O());
    }

    public static ArrayList h(EnumC0176i enumC0176i, I0 i7) {
        p113p3.f.O("extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", enumC0176i == EnumC0176i.IN || enumC0176i == EnumC0176i.NOT_IN, new Object[0]);
        p113p3.f.O("KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", H4.o.f(i7), new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (I0 i8 : i7.G().a()) {
            p113p3.f.O(p031e1.k.i(new StringBuilder("Comparing on key with "), enumC0176i.f2198a, ", but an array value was not a ReferenceValue"), H4.o.i(i8), new Object[0]);
            arrayList.add(H4.h.c(i8.O()));
        }
        return arrayList;
    }

    @Override // E4.C0177j, E4.AbstractC0178k
    public final boolean d(H4.k kVar) {
        switch (this.f2240d) {
            case 0:
                return ((ArrayList) this.f2241e).contains(kVar.f3323a);
            case 1:
                return !((ArrayList) this.f2241e).contains(kVar.f3323a);
            default:
                return g(kVar.f3323a.compareTo((H4.h) this.f2241e));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public v(H4.j jVar, I0 i7, int i8) {
        this.f2240d = i8;
        switch (i8) {
            case 1:
                EnumC0176i enumC0176i = EnumC0176i.NOT_IN;
                super(jVar, enumC0176i, i7);
                ArrayList arrayList = new ArrayList();
                this.f2241e = arrayList;
                arrayList.addAll(h(enumC0176i, i7));
                break;
            default:
                EnumC0176i enumC0176i2 = EnumC0176i.IN;
                super(jVar, enumC0176i2, i7);
                ArrayList arrayList2 = new ArrayList();
                this.f2241e = arrayList2;
                arrayList2.addAll(h(enumC0176i2, i7));
                break;
        }
    }
}
