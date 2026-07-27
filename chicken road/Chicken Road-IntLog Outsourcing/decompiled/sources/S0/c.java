package S0;

import b2.AbstractC0279e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2740a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f2740a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f2740a.equals(((c) obj).f2740a);
    }

    public final int hashCode() {
        return this.f2740a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0279e.h(new StringBuilder("Encoding{name=\""), this.f2740a, "\"}");
    }
}
