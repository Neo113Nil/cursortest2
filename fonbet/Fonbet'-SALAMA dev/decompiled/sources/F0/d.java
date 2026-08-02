package F0;

import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2493a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2494b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2495c;

    public d(String str, List list, boolean z4) {
        this.f2493a = str;
        this.f2494b = z4;
        this.f2495c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f2494b != dVar.f2494b || !this.f2495c.equals(dVar.f2495c)) {
            return false;
        }
        String str = this.f2493a;
        boolean startsWith = str.startsWith("index_");
        String str2 = dVar.f2493a;
        return startsWith ? str2.startsWith("index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f2493a;
        return this.f2495c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f2494b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f2493a + "', unique=" + this.f2494b + ", columns=" + this.f2495c + '}';
    }
}
