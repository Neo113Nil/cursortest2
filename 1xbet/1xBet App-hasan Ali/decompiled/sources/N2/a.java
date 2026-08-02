package N2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3749a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3750b;

    public a(String str, boolean z3) {
        this.f3749a = str;
        this.f3750b = z3;
    }

    public final String toString() {
        String str = this.f3749a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(this.f3750b);
        return sb.toString();
    }
}
