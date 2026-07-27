package R0;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1207b;

    public k(l lVar, int i3) {
        this.f1207b = lVar;
        this.f1206a = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1207b.i(this.f1206a);
    }
}
