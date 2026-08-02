package codec.language;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuilder f2812a = new java.lang.StringBuilder();
    public java.lang.String c = null;
    public java.lang.String b = null;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof codec.language.d) {
            return toString().equals(((codec.language.d) obj).toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final java.lang.String toString() {
        if (this.b == null) {
            this.b = this.f2812a.toString();
        }
        return this.b;
    }
}
