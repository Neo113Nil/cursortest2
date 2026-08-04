package P2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f5575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5576c;

    public /* synthetic */ x(y yVar, String str, int i7) {
        this.f5574a = i7;
        this.f5575b = yVar;
        this.f5576c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5574a) {
            case 0:
                this.f5575b.f5578b.f5461b.evaluateJavascript(this.f5576c, null);
                break;
            default:
                this.f5575b.f5578b.f5461b.evaluateJavascript(this.f5576c, null);
                break;
        }
    }
}
