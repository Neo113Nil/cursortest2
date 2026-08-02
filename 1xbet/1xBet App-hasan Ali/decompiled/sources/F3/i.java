package F3;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f1540d = new i("", "", false);

    /* renamed from: a, reason: collision with root package name */
    public final String f1541a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1542b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1543c;

    static {
        new i("\n", "  ", true);
    }

    public i(String str, String str2, boolean z3) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f1541a = str;
        this.f1542b = str2;
        this.f1543c = z3;
    }
}
