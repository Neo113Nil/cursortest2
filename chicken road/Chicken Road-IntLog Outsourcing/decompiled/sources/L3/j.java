package L3;

import T4.o;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1503a;

    public j(int i2) {
        switch (i2) {
            case 1:
                this.f1503a = new ArrayList();
                break;
            case 2:
                this.f1503a = new ArrayList();
                break;
            case 3:
                this.f1503a = new ArrayList(20);
                break;
            default:
                this.f1503a = new ArrayList();
                break;
        }
    }

    public i a() {
        return new i(this.f1503a);
    }

    public Q2.a b() {
        ArrayList arrayList = this.f1503a;
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new Q2.a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = Q2.a.f2474c;
        for (int i2 = 0; i2 < array.length; i2 += 2) {
            V2.e eVar = (V2.e) array[i2];
            if (eVar != null && eVar.f3237b.isEmpty()) {
                array[i2] = null;
            }
        }
        return new Q2.a(array, Q2.a.f2474c);
    }

    public R2.a c() {
        ArrayList arrayList = this.f1503a;
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new R2.a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = R2.a.f2619d;
        for (int i2 = 0; i2 < array.length; i2 += 2) {
            S2.a aVar = (S2.a) array[i2];
            if (aVar != null && aVar.f2746b.isEmpty()) {
                array[i2] = null;
            }
        }
        return new R2.a(array, R2.a.f2619d);
    }

    public o d() {
        return new o((String[]) this.f1503a.toArray(new String[0]));
    }

    public void e(V2.e eVar, Object obj) {
        if (eVar == null || eVar.f3237b.isEmpty() || obj == null) {
            return;
        }
        ArrayList arrayList = this.f1503a;
        arrayList.add(eVar);
        arrayList.add(obj);
    }

    public void f(String str, String str2) {
        e(V2.e.a(Q2.b.f2476a, str), str2);
    }

    public void g(Q2.c cVar) {
        if (cVar == null) {
            return;
        }
        cVar.forEach(new D3.a(1, this));
    }

    public void h(String str) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1503a;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i2))) {
                arrayList.remove(i2);
                arrayList.remove(i2);
                i2 -= 2;
            }
            i2 += 2;
        }
    }
}
