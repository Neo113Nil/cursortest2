package i6;

import kotlin.jvm.functions.Function2;

/* renamed from: i6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1285b implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14064a;

    public /* synthetic */ C1285b(int i7) {
        this.f14064a = i7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1286c c1286c;
        switch (this.f14064a) {
            case 0:
                String str = (String) obj;
                InterfaceC1290g interfaceC1290g = (InterfaceC1290g) obj2;
                t6.h.e(str, "acc");
                t6.h.e(interfaceC1290g, "element");
                if (str.length() == 0) {
                    return interfaceC1290g.toString();
                }
                return str + ", " + interfaceC1290g;
            default:
                InterfaceC1292i interfaceC1292i = (InterfaceC1292i) obj;
                InterfaceC1290g interfaceC1290g2 = (InterfaceC1290g) obj2;
                t6.h.e(interfaceC1292i, "acc");
                t6.h.e(interfaceC1290g2, "element");
                InterfaceC1292i minusKey = interfaceC1292i.minusKey(interfaceC1290g2.getKey());
                C1293j c1293j = C1293j.f14068a;
                if (minusKey == c1293j) {
                    return interfaceC1290g2;
                }
                C1288e c1288e = C1288e.f14067a;
                InterfaceC1289f interfaceC1289f = (InterfaceC1289f) minusKey.get(c1288e);
                if (interfaceC1289f == null) {
                    c1286c = new C1286c(interfaceC1290g2, minusKey);
                } else {
                    InterfaceC1292i minusKey2 = minusKey.minusKey(c1288e);
                    if (minusKey2 == c1293j) {
                        return new C1286c(interfaceC1289f, interfaceC1290g2);
                    }
                    c1286c = new C1286c(interfaceC1289f, new C1286c(interfaceC1290g2, minusKey2));
                }
                return c1286c;
        }
    }
}
