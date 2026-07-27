package a2;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;

/* renamed from: a2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119o implements z2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2.d f1857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N.d f1858c;

    public /* synthetic */ C0119o(z2.d dVar, N.d dVar2, int i3) {
        this.f1856a = i3;
        this.f1857b = dVar;
        this.f1858c = dVar2;
    }

    @Override // z2.d
    public final Object l(z2.e eVar, InterfaceC0319c interfaceC0319c) {
        switch (this.f1856a) {
            case 0:
                Object l3 = this.f1857b.l(new C0118n(eVar, this.f1858c, 0), interfaceC0319c);
                if (l3 != EnumC0326a.f4994a) {
                    break;
                }
                break;
            case 1:
                Object l4 = this.f1857b.l(new C0118n(eVar, this.f1858c, 1), interfaceC0319c);
                if (l4 != EnumC0326a.f4994a) {
                    break;
                }
                break;
            case 2:
                Object l5 = this.f1857b.l(new C0118n(eVar, this.f1858c, 2), interfaceC0319c);
                if (l5 != EnumC0326a.f4994a) {
                    break;
                }
                break;
            default:
                Object l6 = this.f1857b.l(new C0118n(eVar, this.f1858c, 3), interfaceC0319c);
                if (l6 != EnumC0326a.f4994a) {
                    break;
                }
                break;
        }
        return C0279i.f4852a;
    }
}
