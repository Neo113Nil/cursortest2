package P;

/* loaded from: classes.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0315s f4329a;

    public /* synthetic */ K0(C0315s c0315s) {
        this.f4329a = c0315s;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof K0) {
            return kotlin.jvm.internal.l.a(this.f4329a, ((K0) obj).f4329a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4329a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f4329a + ')';
    }
}
