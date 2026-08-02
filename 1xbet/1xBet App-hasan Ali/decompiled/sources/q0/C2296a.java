package q0;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2296a {

    /* renamed from: a, reason: collision with root package name */
    public final int f18854a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2296a) {
            return this.f18854a == ((C2296a) obj).f18854a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18854a;
    }

    public final String toString() {
        int i = this.f18854a;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
