package w4;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: n, reason: collision with root package name */
    public static final e f20561n;

    static {
        int i = k.f20569c;
        int i5 = k.f20570d;
        long j5 = k.f20571e;
        String str = k.f20567a;
        e eVar = new e();
        eVar.f20563m = new c(i, i5, j5, str);
        f20561n = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p4.AbstractC2277q
    public final String toString() {
        return "Dispatchers.Default";
    }
}
