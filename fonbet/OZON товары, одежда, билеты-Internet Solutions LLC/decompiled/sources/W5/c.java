package W5;

import W5.k;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
abstract class c<T extends k> {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque f33254a;

    c() {
        int i11 = p6.l.f80283d;
        this.f33254a = new ArrayDeque(20);
    }

    abstract T a();

    final T b() {
        T t2 = (T) this.f33254a.poll();
        return t2 == null ? a() : t2;
    }

    public final void c(T t2) {
        ArrayDeque arrayDeque = this.f33254a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(t2);
        }
    }
}
