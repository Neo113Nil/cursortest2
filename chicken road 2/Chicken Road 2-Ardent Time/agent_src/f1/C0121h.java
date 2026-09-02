package f1;

/* renamed from: f1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f2839a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2840b;

    public C0121h(java.lang.String str, boolean z2) {
        this.f2839a = str;
        this.f2840b = z2;
    }

    public final java.util.List a() {
        return i1.AbstractC0191j.H(this.f2839a, java.lang.Boolean.valueOf(this.f2840b));
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof f1.C0121h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Q1.l.i(a(), ((f1.C0121h) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final java.lang.String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f2839a + ", useDataStore=" + this.f2840b + ")";
    }
}
