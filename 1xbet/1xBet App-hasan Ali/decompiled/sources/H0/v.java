package H0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f2184a;

    /* renamed from: b, reason: collision with root package name */
    public final i4.e f2185b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2186c;

    public v(String str, i4.e eVar) {
        this.f2184a = str;
        this.f2185b = eVar;
    }

    public final void a(j jVar, Object obj) {
        jVar.f(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f2184a;
    }

    public /* synthetic */ v(String str) {
        this(str, r.f2127D);
    }

    public v(String str, int i) {
        this(str);
        this.f2186c = true;
    }

    public v(String str, boolean z3, i4.e eVar) {
        this(str, eVar);
        this.f2186c = z3;
    }
}
