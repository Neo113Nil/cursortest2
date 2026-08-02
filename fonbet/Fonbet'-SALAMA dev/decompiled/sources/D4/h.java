package D4;

import E4.I;

/* loaded from: classes2.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final I f1764a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1765b;

    public h(I i7, int i8) {
        this.f1764a = i7;
        this.f1765b = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f1764a.equals(hVar.f1764a) && this.f1765b == hVar.f1765b;
    }

    public final int hashCode() {
        return t.e.e(this.f1765b) + (this.f1764a.hashCode() * 31);
    }
}
