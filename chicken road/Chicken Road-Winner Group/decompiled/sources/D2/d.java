package D2;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final d f312d;

    static {
        int i3 = k.f321c;
        int i4 = k.f322d;
        long j3 = k.f323e;
        String str = k.f319a;
        d dVar = new d();
        dVar.f314c = new b(i3, i4, j3, str);
        f312d = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // w2.AbstractC1239s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
