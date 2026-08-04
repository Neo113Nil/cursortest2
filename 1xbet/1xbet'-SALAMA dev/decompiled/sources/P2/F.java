package P2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5419a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5422d;

    public /* synthetic */ F(G g3, boolean z4, boolean z7) {
        this.f5422d = g3;
        this.f5420b = z4;
        this.f5421c = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5419a) {
            case 0:
                ((G) this.f5422d).e(this.f5420b, this.f5421c);
                break;
            default:
                if (!this.f5420b) {
                    this.f5421c = true;
                    ((Runnable) this.f5422d).run();
                }
                break;
        }
    }

    public F(Runnable runnable) {
        this.f5422d = runnable;
    }
}
