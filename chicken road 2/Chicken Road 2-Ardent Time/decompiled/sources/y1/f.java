package y1;

/* loaded from: classes.dex */
public final class f implements java.io.Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.regex.Pattern f8503a;

    public f(java.lang.String str) {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(str);
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        this.f8503a = compile;
    }

    public final java.lang.String toString() {
        java.lang.String pattern = this.f8503a.toString();
        kotlin.jvm.internal.i.d(pattern, "toString(...)");
        return pattern;
    }
}
