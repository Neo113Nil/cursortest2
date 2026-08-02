package Gc;

import Kc.C3493a;

/* loaded from: classes9.dex */
public final class g {
    public static void a(Class cls) {
        String name = cls.getName();
        C3493a.f(new oc.d(V.e.a("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
    }
}
