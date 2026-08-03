package o0;

/* loaded from: classes.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0.m f8152b;

    public l(o0.m mVar, int i2) {
        this.f8152b = mVar;
        this.f8151a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8152b.i(this.f8151a);
    }
}
