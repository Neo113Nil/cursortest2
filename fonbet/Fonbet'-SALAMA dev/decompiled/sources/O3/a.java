package O3;

import J3.n;
import K3.f;
import K3.h;
import V3.F;
import V3.s0;
import e1.k;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4998a = 0;

    static {
        f[] fVarArr = {new f(J3.c.class, 9)};
        HashMap hashMap = new HashMap();
        f fVar = fVarArr[0];
        boolean containsKey = hashMap.containsKey(fVar.f3906a);
        Class cls = fVar.f3906a;
        if (containsKey) {
            throw new IllegalArgumentException(k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls));
        }
        hashMap.put(cls, fVar);
        Class cls2 = fVarArr[0].f3906a;
        Collections.unmodifiableMap(hashMap);
        int i7 = s0.CONFIG_NAME_FIELD_NUMBER;
        try {
            n.h(c.f5003b);
            if (N3.a.f4779b.get()) {
                return;
            }
            n.f(new h(F.class, new f[]{new f(J3.c.class, 9)}, 8), true);
        } catch (GeneralSecurityException e7) {
            throw new ExceptionInInitializerError(e7);
        }
    }
}
