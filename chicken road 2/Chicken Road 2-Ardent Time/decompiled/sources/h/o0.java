package h;

/* loaded from: classes.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.p0 f3223b;

    public /* synthetic */ o0(h.p0 p0Var, int i2) {
        this.f3222a = i2;
        this.f3223b = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3222a) {
            case 0:
                this.f3223b.c(false);
                break;
            default:
                this.f3223b.a();
                break;
        }
    }
}
