package p030e0;

import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12508a;

    public e(String str) {
        h.e(str, "name");
        this.f12508a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return h.a(this.f12508a, ((e) obj).f12508a);
    }

    public final int hashCode() {
        return this.f12508a.hashCode();
    }

    public final String toString() {
        return this.f12508a;
    }
}
