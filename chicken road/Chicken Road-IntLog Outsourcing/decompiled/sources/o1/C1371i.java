package o1;

/* renamed from: o1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1371i {

    /* renamed from: b, reason: collision with root package name */
    public static C1371i f11560b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1372j f11561c = new C1372j(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public Object f11562a;

    public static synchronized C1371i a() {
        C1371i c1371i;
        synchronized (C1371i.class) {
            try {
                if (f11560b == null) {
                    f11560b = new C1371i();
                }
                c1371i = f11560b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1371i;
    }
}
