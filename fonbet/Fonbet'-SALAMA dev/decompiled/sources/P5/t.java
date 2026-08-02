package P5;

import f6.C1116i;
import i6.InterfaceC1287d;

/* loaded from: classes2.dex */
public final class t implements G6.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G6.g f5691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0.e f5692c;

    public /* synthetic */ t(G6.g gVar, e0.e eVar, int i7) {
        this.f5690a = i7;
        this.f5691b = gVar;
        this.f5692c = eVar;
    }

    @Override // G6.g
    public final Object r(G6.h hVar, InterfaceC1287d interfaceC1287d) {
        switch (this.f5690a) {
            case 0:
                Object r7 = this.f5691b.r(new C0402n(hVar, this.f5692c, 1), interfaceC1287d);
                if (r7 != j6.a.f14642a) {
                    break;
                }
                break;
            default:
                Object r8 = this.f5691b.r(new C0402n(hVar, this.f5692c, 3), interfaceC1287d);
                if (r8 != j6.a.f14642a) {
                    break;
                }
                break;
        }
        return C1116i.f13008a;
    }
}
