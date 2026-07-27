package N;

import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f983a;

    public d(String name) {
        j.e(name, "name");
        this.f983a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return j.a(this.f983a, ((d) obj).f983a);
    }

    public final int hashCode() {
        return this.f983a.hashCode();
    }

    public final String toString() {
        return this.f983a;
    }
}
