package v4;

/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: f, reason: collision with root package name */
    public final int f17168f;

    public b(String str, int i7) {
        super(str);
        this.f17168f = i7;
    }

    @Override // v4.c
    public final int c() {
        return this.f17168f;
    }

    @Override // v4.c, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((c) obj);
    }

    @Override // v4.c
    public final String toString() {
        return e1.k.i(new StringBuilder("IntegerChildName(\""), this.f17173a, "\")");
    }
}
