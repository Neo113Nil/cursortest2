package W;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f5998a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f5998a == ((a) obj).f5998a;
    }

    public final int hashCode() {
        return this.f5998a;
    }

    public final String toString() {
        return AbstractC2107A.t(new StringBuilder("DeltaCounter(count="), this.f5998a, ')');
    }
}
