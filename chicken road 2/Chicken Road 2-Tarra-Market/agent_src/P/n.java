package P;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f327b;

    public n(o oVar, int i2) {
        this.f327b = oVar;
        this.f326a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f327b.i(this.f326a);
    }
}
