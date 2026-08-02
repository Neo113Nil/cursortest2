package H4;

import L4.r;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class e implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final List f3312a;

    public e(List list) {
        this.f3312a = list;
    }

    public final e a(e eVar) {
        ArrayList arrayList = new ArrayList(this.f3312a);
        arrayList.addAll(eVar.f3312a);
        return f(arrayList);
    }

    public final e b(String str) {
        ArrayList arrayList = new ArrayList(this.f3312a);
        arrayList.add(str);
        return f(arrayList);
    }

    public abstract String c();

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        int size = this.f3312a.size();
        int size2 = eVar.f3312a.size();
        for (int i7 = 0; i7 < size && i7 < size2; i7++) {
            int compareTo = l(i7).compareTo(eVar.l(i7));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return r.d(size, size2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }

    public abstract e f(List list);

    public final String h() {
        return (String) this.f3312a.get(r0.size() - 1);
    }

    public final int hashCode() {
        return this.f3312a.hashCode() + ((getClass().hashCode() + 37) * 37);
    }

    public final boolean isEmpty() {
        return this.f3312a.size() == 0;
    }

    public final String l(int i7) {
        return (String) this.f3312a.get(i7);
    }

    public final boolean m(e eVar) {
        List list = this.f3312a;
        if (list.size() > eVar.f3312a.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!l(i7).equals(eVar.l(i7))) {
                return false;
            }
        }
        return true;
    }

    public final e p() {
        List list = this.f3312a;
        int size = list.size();
        p3.f.O("Can't call popFirst with count > length() (%d > %d)", size >= 5, 5, Integer.valueOf(size));
        return new m(list.subList(5, size));
    }

    public final e t() {
        return f(this.f3312a.subList(0, r0.size() - 1));
    }

    public final String toString() {
        return c();
    }
}
