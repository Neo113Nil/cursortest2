package y;

/* renamed from: y.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1017e {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.DisplayCutout f8464a;

    public C1017e(android.view.DisplayCutout displayCutout) {
        this.f8464a = displayCutout;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.C1017e.class != obj.getClass()) {
            return false;
        }
        return java.util.Objects.equals(this.f8464a, ((y.C1017e) obj).f8464a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f8464a.hashCode();
        return hashCode;
    }

    public final java.lang.String toString() {
        return "DisplayCutoutCompat{" + this.f8464a + "}";
    }
}
