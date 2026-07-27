package B4;

import y4.C1574c;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f303a;

    /* renamed from: b, reason: collision with root package name */
    public final C1574c f304b;

    public e(String str, C1574c c1574c) {
        this.f303a = str;
        this.f304b = c1574c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.i.a(this.f303a, eVar.f303a) && kotlin.jvm.internal.i.a(this.f304b, eVar.f304b);
    }

    public final int hashCode() {
        return this.f304b.hashCode() + (this.f303a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f303a + ", range=" + this.f304b + ')';
    }
}
