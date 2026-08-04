package Q3;

import A1.AbstractC0021h;
import V3.X;
import com.google.crypto.tink.shaded.protobuf.AbstractC0821a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5806c;

    public d(Class cls, K3.f... fVarArr) {
        this.f5804a = cls;
        HashMap map = new HashMap();
        for (K3.f fVar : fVarArr) {
            boolean zContainsKey = map.containsKey(fVar.f3906a);
            Class cls2 = fVar.f3906a;
            if (zContainsKey) {
                throw new IllegalArgumentException(p031e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls2));
            }
            map.put(cls2, fVar);
        }
        if (fVarArr.length > 0) {
            this.f5805b = fVarArr[0].f3906a;
        } else {
            this.f5805b = Void.class;
        }
        this.f5806c = Collections.unmodifiableMap(map);
    }

    public static boolean j(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public abstract void a();

    public abstract Object b(int i7, int i8);

    public abstract Map c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(Object obj, Object obj2);

    public abstract void h(int i7);

    public abstract Object i(int i7, Object obj);

    public int k() {
        return 1;
    }

    public abstract String l();

    public Object m(AbstractC0821a abstractC0821a, Class cls) {
        K3.f fVar = (K3.f) ((Map) this.f5806c).get(cls);
        if (fVar != null) {
            return fVar.a(abstractC0821a);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract AbstractC0021h n();

    public abstract X o();

    public abstract AbstractC0821a p(AbstractC0829i abstractC0829i);

    public Object[] q(int i7, Object[] objArr) {
        int iD = d();
        if (objArr.length < iD) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iD);
        }
        for (int i8 = 0; i8 < iD; i8++) {
            objArr[i8] = b(i8, i7);
        }
        if (objArr.length > iD) {
            objArr[iD] = null;
        }
        return objArr;
    }

    public abstract void r(AbstractC0821a abstractC0821a);
}
