package O4;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class B extends Z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z f4116e;

    public /* synthetic */ B(Z z3, int i) {
        this.f4115d = i;
        this.f4116e = z3;
    }

    @Override // O4.Z
    public final void a(O o5, Object obj) {
        switch (this.f4115d) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f4116e.a(o5, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        this.f4116e.a(o5, Array.get(obj, i));
                    }
                    break;
                }
                break;
        }
    }
}
