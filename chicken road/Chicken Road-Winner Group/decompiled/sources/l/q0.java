package l;

/* loaded from: classes.dex */
public final class q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f9864b;

    public /* synthetic */ q0(r0 r0Var, int i3) {
        this.f9863a = i3;
        this.f9864b = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9863a) {
            case 0:
                this.f9864b.c(false);
                break;
            default:
                this.f9864b.a();
                break;
        }
    }
}
