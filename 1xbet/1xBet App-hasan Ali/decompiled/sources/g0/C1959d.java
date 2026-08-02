package g0;

/* renamed from: g0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1959d {

    /* renamed from: a, reason: collision with root package name */
    public final int f17021a;

    public static String a(int i) {
        return i == 1 ? "Next" : i == 2 ? "Previous" : i == 3 ? "Left" : i == 4 ? "Right" : i == 5 ? "Up" : i == 6 ? "Down" : i == 7 ? "Enter" : i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1959d) {
            return this.f17021a == ((C1959d) obj).f17021a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17021a;
    }

    public final String toString() {
        return a(this.f17021a);
    }
}
