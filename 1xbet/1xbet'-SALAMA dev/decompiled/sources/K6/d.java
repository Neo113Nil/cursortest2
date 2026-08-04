package K6;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f4160d;

    static {
        int i7 = j.f4168c;
        int i8 = j.f4169d;
        long j = j.f4170e;
        String str = j.f4166a;
        d dVar = new d();
        dVar.f4162c = new b(i7, i8, j, str);
        f4160d = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // D6.A
    public final String toString() {
        return "Dispatchers.Default";
    }
}
