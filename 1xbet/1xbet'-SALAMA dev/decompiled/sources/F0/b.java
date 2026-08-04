package F0;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f2488e;

    public b(String str, String str2, String str3, List list, List list2) {
        this.f2484a = str;
        this.f2485b = str2;
        this.f2486c = str3;
        this.f2487d = Collections.unmodifiableList(list);
        this.f2488e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2484a.equals(bVar.f2484a) && this.f2485b.equals(bVar.f2485b) && this.f2486c.equals(bVar.f2486c) && this.f2487d.equals(bVar.f2487d)) {
            return this.f2488e.equals(bVar.f2488e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2488e.hashCode() + ((this.f2487d.hashCode() + p150v0.a.d(p150v0.a.d(this.f2484a.hashCode() * 31, 31, this.f2485b), 31, this.f2486c)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f2484a + "', onDelete='" + this.f2485b + "', onUpdate='" + this.f2486c + "', columnNames=" + this.f2487d + ", referenceColumnNames=" + this.f2488e + '}';
    }
}
