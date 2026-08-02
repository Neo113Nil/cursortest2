package androidx.core.util;

/* loaded from: classes7.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F f, S s) {
        this.first = f;
        this.second = s;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.core.util.Pair)) {
            return false;
        }
        androidx.core.util.Pair pair = (androidx.core.util.Pair) obj;
        return androidx.core.util.ObjectsCompat.equals(pair.first, this.first) && androidx.core.util.ObjectsCompat.equals(pair.second, this.second);
    }

    public int hashCode() {
        F f = this.first;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.second;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Pair{");
        sb.append(this.first);
        sb.append(" ");
        sb.append(this.second);
        sb.append("}");
        return sb.toString();
    }

    public static <A, B> androidx.core.util.Pair<A, B> create(A a2, B b) {
        return new androidx.core.util.Pair<>(a2, b);
    }
}
