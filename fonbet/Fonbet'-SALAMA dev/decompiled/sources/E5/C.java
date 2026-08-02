package E5;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public int f2259a;

    /* renamed from: b, reason: collision with root package name */
    public D f2260b;

    public static C a(ArrayList arrayList) {
        C c3 = new C();
        int i7 = t.e.f(7)[((Integer) arrayList.get(0)).intValue()];
        if (i7 == 0) {
            throw new IllegalStateException("Nonnull field \"operation\" is null.");
        }
        c3.f2259a = i7;
        D d7 = (D) arrayList.get(1);
        if (d7 == null) {
            throw new IllegalStateException("Nonnull field \"data\" is null.");
        }
        c3.f2260b = d7;
        return c3;
    }
}
