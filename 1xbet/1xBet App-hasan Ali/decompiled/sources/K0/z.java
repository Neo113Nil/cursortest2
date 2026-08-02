package K0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final y f2881a;

    public z(F f, y yVar) {
        this.f2881a = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return kotlin.jvm.internal.l.a(this.f2881a, ((z) obj).f2881a) && kotlin.jvm.internal.l.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0 * 31;
        y yVar = this.f2881a;
        return i + (yVar != null ? yVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + ((Object) null) + ", paragraphSyle=" + this.f2881a + ')';
    }
}
