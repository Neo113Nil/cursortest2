package v4;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17174f;

    public b(String str, int i7) {
        super(str);
        this.f17174f = i7;
    }

    @Override // v4.c
    public final int c() {
        return this.f17174f;
    }

    @Override // v4.c, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((c) obj);
    }

    @Override // v4.c
    public final String toString() {
        return p031e1.k.i(new StringBuilder("IntegerChildName(\""), this.f17179a, "\")");
    }
}
