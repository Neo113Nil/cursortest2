package R0;

/* loaded from: classes.dex */
public final class k implements R0.e {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f1687a;

    public k() {
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.f1687a = android.os.Build.VERSION.SDK_INT >= 28 ? android.os.Handler.createAsync(mainLooper) : new android.os.Handler(mainLooper);
    }

    @Override // R0.e
    public final void a(R0.c cVar) {
        this.f1687a.post(cVar);
    }
}
