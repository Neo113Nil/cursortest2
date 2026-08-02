package n;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1442b extends P6.b {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C1442b f15279d;

    /* renamed from: e, reason: collision with root package name */
    public static final ExecutorC1441a f15280e = new ExecutorC1441a(0);

    /* renamed from: c, reason: collision with root package name */
    public final C1444d f15281c = new C1444d();

    public static C1442b Y() {
        if (f15279d != null) {
            return f15279d;
        }
        synchronized (C1442b.class) {
            try {
                if (f15279d == null) {
                    f15279d = new C1442b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f15279d;
    }
}
