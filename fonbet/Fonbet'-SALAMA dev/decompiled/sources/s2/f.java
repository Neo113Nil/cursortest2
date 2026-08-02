package s2;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f16126a;

    /* renamed from: b, reason: collision with root package name */
    public final C1588b f16127b;

    public f(int i7, C1588b c1588b) {
        this.f16126a = i7;
        this.f16127b = c1588b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f16126a, ((f) obj).f16126a);
    }
}
