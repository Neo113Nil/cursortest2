package T1;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5611a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5612b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5613c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5614d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5615e;

    public b(String str, String str2, String str3, List list, List list2) {
        this.f5611a = str;
        this.f5612b = str2;
        this.f5613c = str3;
        this.f5614d = Collections.unmodifiableList(list);
        this.f5615e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f5611a.equals(bVar.f5611a) && this.f5612b.equals(bVar.f5612b) && this.f5613c.equals(bVar.f5613c) && this.f5614d.equals(bVar.f5614d)) {
            return this.f5615e.equals(bVar.f5615e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5615e.hashCode() + ((this.f5614d.hashCode() + L1.a.i(L1.a.i(this.f5611a.hashCode() * 31, 31, this.f5612b), 31, this.f5613c)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f5611a + "', onDelete='" + this.f5612b + "', onUpdate='" + this.f5613c + "', columnNames=" + this.f5614d + ", referenceColumnNames=" + this.f5615e + '}';
    }
}
