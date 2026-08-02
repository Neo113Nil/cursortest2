package F2;

import a.AbstractC0444a;

/* loaded from: classes.dex */
public final class a extends AbstractC0444a {
    public final int f;

    public a(int i) {
        this.f = i;
        if (i <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f == ((a) obj).f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f;
    }

    public final String toString() {
        return String.valueOf(this.f);
    }
}
