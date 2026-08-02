package o2;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public String f18631a;

    /* renamed from: b, reason: collision with root package name */
    public int f18632b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f18632b != hVar.f18632b) {
            return false;
        }
        return this.f18631a.equals(hVar.f18631a);
    }

    public final int hashCode() {
        return AbstractC2462i.b(this.f18632b) + (this.f18631a.hashCode() * 31);
    }
}
