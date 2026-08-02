package D4;

import H4.n;

/* loaded from: classes2.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f1766a;

    /* renamed from: b, reason: collision with root package name */
    public final h f1767b;

    /* renamed from: c, reason: collision with root package name */
    public final n f1768c;

    public i(String str, h hVar, n nVar) {
        this.f1766a = str;
        this.f1767b = hVar;
        this.f1768c = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f1766a.equals(iVar.f1766a) && this.f1767b.equals(iVar.f1767b)) {
            return this.f1768c.equals(iVar.f1768c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1768c.f3333a.hashCode() + ((this.f1767b.hashCode() + (this.f1766a.hashCode() * 31)) * 31);
    }
}
