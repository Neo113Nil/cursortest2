package codec.language;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f2813a;
    public final java.lang.String[] b;
    public final java.lang.String[] c;
    public final java.lang.String[] d;

    public e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f2813a = str;
        this.b = str2.split("\\|");
        this.c = str3.split("\\|");
        this.d = str4.split("\\|");
    }

    public final java.lang.String toString() {
        return java.lang.String.format("%s=(%s,%s,%s)", this.f2813a, java.util.Arrays.asList(this.b), java.util.Arrays.asList(this.c), java.util.Arrays.asList(this.d));
    }
}
