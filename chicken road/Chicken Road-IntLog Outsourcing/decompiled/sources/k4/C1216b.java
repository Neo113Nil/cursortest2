package k4;

import t4.InterfaceC1445p;

/* renamed from: k4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1216b implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10716a;

    public /* synthetic */ C1216b(int i2) {
        this.f10716a = i2;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        C1217c c1217c;
        switch (this.f10716a) {
            case 0:
                String acc = (String) obj;
                InterfaceC1221g element = (InterfaceC1221g) obj2;
                kotlin.jvm.internal.i.e(acc, "acc");
                kotlin.jvm.internal.i.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                InterfaceC1223i acc2 = (InterfaceC1223i) obj;
                InterfaceC1221g element2 = (InterfaceC1221g) obj2;
                kotlin.jvm.internal.i.e(acc2, "acc");
                kotlin.jvm.internal.i.e(element2, "element");
                InterfaceC1223i c2 = acc2.c(element2.getKey());
                C1224j c1224j = C1224j.f10720a;
                if (c2 == c1224j) {
                    return element2;
                }
                C1219e c1219e = C1219e.f10719a;
                InterfaceC1220f interfaceC1220f = (InterfaceC1220f) c2.o(c1219e);
                if (interfaceC1220f == null) {
                    c1217c = new C1217c(element2, c2);
                } else {
                    InterfaceC1223i c6 = c2.c(c1219e);
                    if (c6 == c1224j) {
                        return new C1217c(interfaceC1220f, element2);
                    }
                    c1217c = new C1217c(interfaceC1220f, new C1217c(element2, c6));
                }
                return c1217c;
        }
    }
}
