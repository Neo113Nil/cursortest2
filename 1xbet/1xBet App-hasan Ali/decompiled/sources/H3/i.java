package H3;

import F3.y;
import F3.z;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class i implements z, Cloneable {

    /* renamed from: m, reason: collision with root package name */
    public static final i f2328m = new i();

    /* renamed from: k, reason: collision with root package name */
    public final List f2329k;

    /* renamed from: l, reason: collision with root package name */
    public final List f2330l;

    public i() {
        List list = Collections.EMPTY_LIST;
        this.f2329k = list;
        this.f2330l = list;
    }

    @Override // F3.z
    public final y a(F3.m mVar, M3.a aVar) {
        Class cls = aVar.f3616a;
        boolean b3 = b(cls, true);
        boolean b5 = b(cls, false);
        if (b3 || b5) {
            return new h(this, b5, b3, mVar, aVar);
        }
        return null;
    }

    public final boolean b(Class cls, boolean z3) {
        if (!z3 && !Enum.class.isAssignableFrom(cls)) {
            AbstractC2349a abstractC2349a = K3.c.f2892a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z3 ? this.f2329k : this.f2330l).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public final Object clone() {
        try {
            return (i) super.clone();
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }
}
