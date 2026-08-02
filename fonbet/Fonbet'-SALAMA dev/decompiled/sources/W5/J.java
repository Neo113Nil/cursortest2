package W5;

import e3.C1023h;

/* loaded from: classes2.dex */
public final class J implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1023h f6826b;

    public /* synthetic */ J(C1023h c1023h, int i7) {
        this.f6825a = i7;
        this.f6826b = c1023h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6825a) {
            case 0:
                this.f6826b.c0(true);
                break;
            case 1:
                this.f6826b.c0(false);
                break;
            default:
                Q0 q02 = (Q0) this.f6826b.f12667a;
                p3.f.q("Channel must have been shut down", q02.f6939J.get());
                q02.f6941L = true;
                q02.G(false);
                Q0.z(q02);
                Q0.A(q02);
                break;
        }
    }
}
