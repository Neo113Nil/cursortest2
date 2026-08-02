package y4;

/* loaded from: classes.dex */
public enum v {
    f21427l("http/1.0"),
    f21428m("http/1.1"),
    f21429n("spdy/3.1"),
    f21430o("h2"),
    f21431p("h2_prior_knowledge"),
    f21432q("quic");


    /* renamed from: k, reason: collision with root package name */
    public final String f21434k;

    v(String str) {
        this.f21434k = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f21434k;
    }
}
