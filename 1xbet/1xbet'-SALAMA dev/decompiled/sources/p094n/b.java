package p094n;

/* JADX INFO: loaded from: classes.dex */
public final class b extends P6.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile b f15285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15286e = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f15287c = new d();

    public static b Y() {
        if (f15285d != null) {
            return f15285d;
        }
        synchronized (b.class) {
            try {
                if (f15285d == null) {
                    f15285d = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f15285d;
    }
}
