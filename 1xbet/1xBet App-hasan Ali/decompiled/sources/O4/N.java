package O4;

import L4.C0229l;
import L4.InterfaceC0227j;

/* loaded from: classes.dex */
public final class N extends y4.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4142a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final y4.q f4143b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4144c;

    public N(y4.q qVar, C0229l c0229l) {
        this.f4143b = qVar;
        this.f4144c = c0229l;
    }

    @Override // y4.x
    public final long a() {
        switch (this.f4142a) {
            case 0:
                return ((y4.x) this.f4144c).a();
            default:
                return ((C0229l) this.f4144c).c();
        }
    }

    @Override // y4.x
    public final y4.q b() {
        switch (this.f4142a) {
        }
        return this.f4143b;
    }

    @Override // y4.x
    public final void c(InterfaceC0227j interfaceC0227j) {
        switch (this.f4142a) {
            case 0:
                ((y4.x) this.f4144c).c(interfaceC0227j);
                break;
            default:
                interfaceC0227j.g((C0229l) this.f4144c);
                break;
        }
    }

    public N(y4.x xVar, y4.q qVar) {
        this.f4144c = xVar;
        this.f4143b = qVar;
    }
}
