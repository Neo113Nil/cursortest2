package P5;

import f6.C1116i;
import i6.InterfaceC1287d;

/* renamed from: P5.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0403o implements G6.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G6.g f5672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0.e f5673c;

    public /* synthetic */ C0403o(G6.g gVar, e0.e eVar, int i7) {
        this.f5671a = i7;
        this.f5672b = gVar;
        this.f5673c = eVar;
    }

    @Override // G6.g
    public final Object r(G6.h hVar, InterfaceC1287d interfaceC1287d) {
        switch (this.f5671a) {
            case 0:
                Object r7 = this.f5672b.r(new C0402n(hVar, this.f5673c, 0), interfaceC1287d);
                if (r7 != j6.a.f14642a) {
                    break;
                }
                break;
            default:
                Object r8 = this.f5672b.r(new C0402n(hVar, this.f5673c, 2), interfaceC1287d);
                if (r8 != j6.a.f14642a) {
                    break;
                }
                break;
        }
        return C1116i.f13008a;
    }
}
