package s0;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: e, reason: collision with root package name */
    public static final d f1230e;

    static {
        int i2 = j.f1238c;
        int i3 = j.f1239d;
        long j2 = j.f1240e;
        String str = j.f1236a;
        d dVar = new d();
        dVar.f1232d = new b(i2, i3, j2, str);
        f1230e = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // m0.AbstractC0059p
    public final String toString() {
        return "Dispatchers.Default";
    }
}
