package androidx.compose.ui.platform;

/* renamed from: androidx.compose.ui.platform.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5296x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41043b;

    public /* synthetic */ RunnableC5296x(Object obj, int i11) {
        this.f41042a = i11;
        this.f41043b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41042a) {
            case 0:
                C5299y.b((C5299y) this.f41043b);
                break;
            default:
                io.sentry.cache.l.v((io.sentry.cache.l) this.f41043b);
                break;
        }
    }
}
