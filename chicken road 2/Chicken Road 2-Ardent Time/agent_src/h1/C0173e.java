package h1;

/* renamed from: h1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173e implements java.io.Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Throwable f3297a;

    public C0173e(java.lang.Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f3297a = exception;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof h1.C0173e) {
            if (kotlin.jvm.internal.i.a(this.f3297a, ((h1.C0173e) obj).f3297a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3297a.hashCode();
    }

    public final java.lang.String toString() {
        return "Failure(" + this.f3297a + ')';
    }
}
