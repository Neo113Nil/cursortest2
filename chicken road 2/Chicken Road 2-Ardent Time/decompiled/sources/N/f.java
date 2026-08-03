package N;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f1130b;

    public /* synthetic */ f(android.content.Context context, int i2) {
        this.f1129a = i2;
        this.f1130b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1129a) {
            case 0:
                new java.util.concurrent.ThreadPoolExecutor(0, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue()).execute(new N.f(this.f1130b, 1));
                break;
            default:
                N.e.s(this.f1130b, new N.c(), N.e.f1119a, false);
                break;
        }
    }
}
