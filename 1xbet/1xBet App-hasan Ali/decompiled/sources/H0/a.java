package H0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2062a;

    /* renamed from: b, reason: collision with root package name */
    public final W3.c f2063b;

    public a(String str, W3.c cVar) {
        this.f2062a = str;
        this.f2063b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.l.a(this.f2062a, aVar.f2062a) && kotlin.jvm.internal.l.a(this.f2063b, aVar.f2063b);
    }

    public final int hashCode() {
        String str = this.f2062a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        W3.c cVar = this.f2063b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f2062a + ", action=" + this.f2063b + ')';
    }
}
