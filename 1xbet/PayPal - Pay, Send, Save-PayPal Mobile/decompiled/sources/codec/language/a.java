package codec.language;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final char[] f2790a;
    public int b;

    public a(int i) {
        this.b = 0;
        this.f2790a = new char[i];
        this.b = 0;
    }

    public final java.lang.String toString() {
        int i = this.b;
        char[] cArr = new char[i];
        java.lang.System.arraycopy(((codec.language.b) this).f2790a, 0, cArr, 0, i);
        return new java.lang.String(cArr);
    }
}
