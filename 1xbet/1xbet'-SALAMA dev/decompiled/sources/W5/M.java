package W5;

/* JADX INFO: loaded from: classes2.dex */
public final class M implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P f6862c;

    public /* synthetic */ M(P p5, int i7, int i8) {
        this.f6860a = i8;
        this.f6862c = p5;
        this.f6861b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6860a) {
            case 0:
                this.f6862c.f6903c.i(this.f6861b);
                break;
            case 1:
                this.f6862c.f6903c.j(this.f6861b);
                break;
            default:
                this.f6862c.f6903c.c(this.f6861b);
                break;
        }
    }
}
