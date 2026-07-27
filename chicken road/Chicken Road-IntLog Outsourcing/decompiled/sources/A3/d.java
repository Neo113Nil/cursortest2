package A3;

import java.util.List;
import java.util.function.Function;
import y3.AbstractC1571e;

/* loaded from: classes.dex */
public final class d extends y3.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f53b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f54c;

    public d(k[] kVarArr) {
        super(y3.h.e(E3.a.f651a, kVarArr));
        this.f54c = kVarArr;
    }

    public static d d(List list, Function function) {
        int size = list.size();
        AbstractC1571e[] abstractC1571eArr = new AbstractC1571e[size];
        for (int i2 = 0; i2 < size; i2++) {
            abstractC1571eArr[i2] = (AbstractC1571e) function.apply(list.get(i2));
        }
        return new d(new c(abstractC1571eArr));
    }

    @Override // y3.AbstractC1571e
    public final void c(y3.m mVar) {
        switch (this.f53b) {
            case 0:
                mVar.a(F3.a.f681e, (c) this.f54c);
                break;
            case 1:
                mVar.a(F3.a.f682f, (c) this.f54c);
                break;
            case 2:
                mVar.o(H3.a.f1155a, (n[]) this.f54c);
                break;
            default:
                mVar.o(E3.a.f651a, (k[]) this.f54c);
                break;
        }
    }

    public d(c cVar, byte b6) {
        super(y3.h.d(F3.a.f682f, cVar));
        this.f54c = cVar;
    }

    public d(c cVar) {
        super(y3.h.d(F3.a.f681e, cVar));
        this.f54c = cVar;
    }

    public d(n[] nVarArr) {
        super(y3.h.e(H3.a.f1155a, nVarArr));
        this.f54c = nVarArr;
    }
}
