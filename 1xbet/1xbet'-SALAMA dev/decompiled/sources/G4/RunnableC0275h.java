package G4;

/* JADX INFO: renamed from: G4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0275h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0279l f2978b;

    public /* synthetic */ RunnableC0275h(C0279l c0279l, int i7) {
        this.f2977a = i7;
        this.f2978b = c0279l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2977a) {
            case 0:
                this.f2978b.f2992b.start();
                break;
            case 1:
                this.f2978b.f2993c.start();
                break;
            default:
                this.f2978b.f2992b.G();
                break;
        }
    }
}
