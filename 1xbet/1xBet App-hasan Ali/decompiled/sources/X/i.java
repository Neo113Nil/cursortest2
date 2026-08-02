package X;

import P.AbstractC0320u0;
import P.InterfaceC0314r0;
import P.g1;
import U.n;

/* loaded from: classes.dex */
public final class i extends U.c implements InterfaceC0314r0 {

    /* renamed from: n, reason: collision with root package name */
    public static final i f6059n = new i(n.f5834e, 0);

    public final i b(AbstractC0320u0 abstractC0320u0, g1 g1Var) {
        C2.h u5 = this.f5811k.u(abstractC0320u0.hashCode(), 0, abstractC0320u0, g1Var);
        return u5 == null ? this : new i((n) u5.f834m, this.f5812l + u5.f833l);
    }

    @Override // U.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0320u0) {
            return super.containsKey((AbstractC0320u0) obj);
        }
        return false;
    }

    @Override // X3.f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof g1) {
            return super.containsValue((g1) obj);
        }
        return false;
    }

    @Override // U.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0320u0) {
            return (g1) super.get((AbstractC0320u0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0320u0) ? obj2 : (g1) super.getOrDefault((AbstractC0320u0) obj, (g1) obj2);
    }
}
