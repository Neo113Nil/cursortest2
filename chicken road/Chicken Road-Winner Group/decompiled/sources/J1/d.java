package J1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f703a;

    /* renamed from: b, reason: collision with root package name */
    public final String f704b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f705c;

    public d(String str, String str2, int i3) {
        this(str, false, str2, "io.flutter.embedding.android.");
    }

    public d(String str, String str2) {
        this(str, true, str2, "io.flutter.embedding.android.");
    }

    public d(String str, boolean z3, String str2, String str3) {
        this.f703a = str;
        this.f704b = str3.concat(str2);
        this.f705c = z3;
    }
}
