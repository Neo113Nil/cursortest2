package Ve;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class T1 implements InterfaceC2395h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2395h f30005b;

    public /* synthetic */ T1(InterfaceC2395h interfaceC2395h, int i11) {
        this.f30004a = i11;
        this.f30005b = interfaceC2395h;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i interfaceC2397i, kotlin.coroutines.d dVar) {
        switch (this.f30004a) {
            case 0:
                Object collect = ((C2406m0) this.f30005b).collect(new C4430m1(interfaceC2397i, 0), dVar);
                if (collect != Wc.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = ((Ae.M0) this.f30005b).collect(new C4389ki(interfaceC2397i, 1), dVar);
                if (collect2 != Wc.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f71690a;
    }
}
