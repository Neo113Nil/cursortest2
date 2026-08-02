package R3;

import V3.C0460b;
import V3.s0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class m {
    static {
        K3.f[] fVarArr = {new K3.f(J3.j.class, 11)};
        HashMap hashMap = new HashMap();
        K3.f fVar = fVarArr[0];
        boolean containsKey = hashMap.containsKey(fVar.f3906a);
        Class cls = fVar.f3906a;
        if (containsKey) {
            throw new IllegalArgumentException(e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls));
        }
        hashMap.put(cls, fVar);
        Class cls2 = fVarArr[0].f3906a;
        Collections.unmodifiableMap(hashMap);
        int i7 = s0.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e7) {
            throw new ExceptionInInitializerError(e7);
        }
    }

    public static void a() {
        J3.n.h(p.f6057c);
        J3.n.h(i.f6041a);
        J3.n.f(new c(), true);
        Q3.k kVar = l.f6048a;
        Q3.i iVar = Q3.i.f5812b;
        iVar.e(l.f6048a);
        iVar.d(l.f6049b);
        iVar.c(l.f6050c);
        iVar.b(l.f6051d);
        Q3.h hVar = Q3.h.f5810b;
        hVar.b(c.f6018f);
        if (N3.a.f4779b.get()) {
            return;
        }
        J3.n.f(new c(C0460b.class, new K3.f[]{new K3.f(J3.j.class, 10)}), true);
        iVar.e(f.f6037a);
        iVar.d(f.f6038b);
        iVar.c(f.f6039c);
        iVar.b(f.f6040d);
        hVar.b(c.f6017e);
    }
}
