package v;

/* loaded from: classes.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public v.c f8383a;

    /* renamed from: b, reason: collision with root package name */
    public v.d f8384b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Handler f8385c;

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        try {
            obj = this.f8383a.call();
        } catch (java.lang.Exception unused) {
            obj = null;
        }
        this.f8385c.post(new D0.f(this.f8384b, obj, 9, false));
    }
}
