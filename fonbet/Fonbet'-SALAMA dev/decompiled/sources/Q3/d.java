package Q3;

import A1.AbstractC0021h;
import V3.X;
import com.google.crypto.tink.shaded.protobuf.AbstractC0865a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public Object f5804a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5805b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5806c;

    public d(Class cls, K3.f... fVarArr) {
        this.f5804a = cls;
        HashMap hashMap = new HashMap();
        for (K3.f fVar : fVarArr) {
            boolean containsKey = hashMap.containsKey(fVar.f3906a);
            Class cls2 = fVar.f3906a;
            if (containsKey) {
                throw new IllegalArgumentException(e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls2));
            }
            hashMap.put(cls2, fVar);
        }
        if (fVarArr.length > 0) {
            this.f5805b = fVarArr[0].f3906a;
        } else {
            this.f5805b = Void.class;
        }
        this.f5806c = Collections.unmodifiableMap(hashMap);
    }

    public static boolean j(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
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

    public Object m(AbstractC0865a abstractC0865a, Class cls) {
        K3.f fVar = (K3.f) ((Map) this.f5806c).get(cls);
        if (fVar != null) {
            return fVar.a(abstractC0865a);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract AbstractC0021h n();

    public abstract X o();

    public abstract AbstractC0865a p(AbstractC0873i abstractC0873i);

    public Object[] q(int i7, Object[] objArr) {
        int d7 = d();
        if (objArr.length < d7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d7);
        }
        for (int i8 = 0; i8 < d7; i8++) {
            objArr[i8] = b(i8, i7);
        }
        if (objArr.length > d7) {
            objArr[d7] = null;
        }
        return objArr;
    }

    public abstract void r(AbstractC0865a abstractC0865a);
}
