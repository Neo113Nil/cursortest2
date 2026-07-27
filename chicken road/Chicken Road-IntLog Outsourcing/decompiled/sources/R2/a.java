package R2;

import L3.j;
import V2.c;
import V2.e;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class a extends c implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final Comparator f2619d = Comparator.comparing(new A3.b(16));

    /* renamed from: e, reason: collision with root package name */
    public static final a f2620e;

    /* renamed from: c, reason: collision with root package name */
    public Q2.a f2621c;

    static {
        a aVar;
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() != 2 || arrayList.get(0) == null) {
            Object[] array = arrayList.toArray();
            for (int i2 = 0; i2 < array.length; i2 += 2) {
                S2.a aVar2 = (S2.a) array[i2];
                if (aVar2 != null && aVar2.f2746b.isEmpty()) {
                    array[i2] = null;
                }
            }
            aVar = new a(array, f2619d);
        } else {
            aVar = new a(arrayList.toArray());
        }
        f2620e = aVar;
    }

    @Override // R2.b
    public final Q2.c c() {
        if (this.f2621c == null) {
            j jVar = new j(1);
            int i2 = 0;
            while (true) {
                Object[] objArr = this.f3233a;
                if (i2 >= objArr.length) {
                    break;
                }
                Object obj = objArr[i2];
                Object obj2 = objArr[i2 + 1];
                e a6 = ((S2.a) obj).a();
                if (a6 != null) {
                    jVar.e(a6, obj2);
                }
                i2 += 2;
            }
            this.f2621c = jVar.b();
        }
        return this.f2621c;
    }
}
