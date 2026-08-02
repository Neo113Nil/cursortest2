package W5;

/* loaded from: classes2.dex */
public final class N implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f6882b;

    public /* synthetic */ N(P p5, int i7) {
        this.f6881a = i7;
        this.f6882b = p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6881a) {
            case 0:
                this.f6882b.f6903c.m();
                break;
            case 1:
                this.f6882b.o();
                break;
            case 2:
                this.f6882b.f6903c.flush();
                break;
            default:
                this.f6882b.f6903c.h();
                break;
        }
    }
}
