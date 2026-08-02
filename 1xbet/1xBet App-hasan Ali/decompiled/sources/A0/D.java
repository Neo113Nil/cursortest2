package A0;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f168k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f169l;

    public /* synthetic */ D(InterfaceC2015a interfaceC2015a, int i) {
        this.f168k = i;
        this.f169l = interfaceC2015a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f168k) {
            case 0:
                this.f169l.invoke();
                break;
            default:
                this.f169l.invoke();
                break;
        }
    }
}
