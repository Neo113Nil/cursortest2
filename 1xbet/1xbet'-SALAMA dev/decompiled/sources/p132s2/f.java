package p132s2;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f16133b;

    public f(int i7, b bVar) {
        this.f16132a = i7;
        this.f16133b = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f16132a, ((f) obj).f16132a);
    }
}
