package A;

import d1.q;
import d1.r;
import m.InterfaceC0785a;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC0785a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24b;

    public /* synthetic */ i(int i2, Object obj) {
        this.f23a = i2;
        this.f24b = obj;
    }

    @Override // m.InterfaceC0785a
    public final void accept(Object obj) {
        switch (this.f23a) {
            case 0:
                ((q) ((r) this.f24b)).d((l) obj);
                break;
            default:
                ((s0.o) this.f24b).setWindowInfoListenerDisplayFeatures((l) obj);
                break;
        }
    }
}
