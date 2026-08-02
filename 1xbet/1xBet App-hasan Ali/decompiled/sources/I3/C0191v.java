package I3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: I3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0191v extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.n()) {
            try {
                arrayList.add(Integer.valueOf(aVar.v()));
            } catch (NumberFormatException e3) {
                throw new F3.p(e3);
            }
        }
        aVar.i();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        bVar.d();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            bVar.v(r6.get(i));
        }
        bVar.i();
    }
}
