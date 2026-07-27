package Z;

import B0.o;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3731a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3732b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3733c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3734d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3735e;

    public b(String str, String str2, String str3, List columnNames, List referenceColumnNames) {
        i.e(columnNames, "columnNames");
        i.e(referenceColumnNames, "referenceColumnNames");
        this.f3731a = str;
        this.f3732b = str2;
        this.f3733c = str3;
        this.f3734d = columnNames;
        this.f3735e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (i.a(this.f3731a, bVar.f3731a) && i.a(this.f3732b, bVar.f3732b) && i.a(this.f3733c, bVar.f3733c) && i.a(this.f3734d, bVar.f3734d)) {
            return i.a(this.f3735e, bVar.f3735e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3735e.hashCode() + ((this.f3734d.hashCode() + o.f(this.f3733c, o.f(this.f3732b, this.f3731a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f3731a + "', onDelete='" + this.f3732b + " +', onUpdate='" + this.f3733c + "', columnNames=" + this.f3734d + ", referenceColumnNames=" + this.f3735e + '}';
    }
}
