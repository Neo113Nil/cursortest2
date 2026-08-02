package T1;

import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f5620a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5621b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5622c;

    public d(boolean z3, String str, List list) {
        this.f5620a = str;
        this.f5621b = z3;
        this.f5622c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f5621b != dVar.f5621b || !this.f5622c.equals(dVar.f5622c)) {
            return false;
        }
        String str = this.f5620a;
        boolean startsWith = str.startsWith("index_");
        String str2 = dVar.f5620a;
        return startsWith ? str2.startsWith("index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f5620a;
        return this.f5622c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f5621b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f5620a + "', unique=" + this.f5621b + ", columns=" + this.f5622c + '}';
    }
}
