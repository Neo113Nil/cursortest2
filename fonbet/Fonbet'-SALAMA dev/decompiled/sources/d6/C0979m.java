package d6;

import E3.AbstractC0158p;
import E3.W;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u2.C1644v;

/* renamed from: d6.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0979m implements Map {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12449a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f12450b;

    public C0979m() {
        this.f12449a = 0;
        this.f12450b = new HashMap();
    }

    public final boolean a(Object obj) {
        return c().containsKey(obj);
    }

    public final boolean b(Object obj) {
        return c().containsValue(obj);
    }

    public final Map c() {
        switch (this.f12449a) {
            case 0:
                return (HashMap) this.f12450b;
            default:
                return this.f12450b;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        switch (this.f12449a) {
            case 1:
                return obj != null && a(obj);
            default:
                return a(obj);
        }
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        switch (this.f12449a) {
            case 1:
                Iterator it = ((W) entrySet()).iterator();
                it.getClass();
                Iterator it2 = it;
                if (obj == null) {
                    while (it2.hasNext()) {
                        if (((Map.Entry) it2.next()).getValue() == null) {
                            return true;
                        }
                    }
                } else {
                    while (it2.hasNext()) {
                        if (obj.equals(((Map.Entry) it2.next()).getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return b(obj);
        }
    }

    public double d() {
        HashMap hashMap = (HashMap) this.f12450b;
        if (hashMap.isEmpty()) {
            return 0.0d;
        }
        Iterator it = hashMap.values().iterator();
        int i7 = 0;
        int i8 = 0;
        while (it.hasNext()) {
            i8++;
            if (((C0978l) it.next()).d()) {
                i7++;
            }
        }
        return (i7 / i8) * 100.0d;
    }

    public final Set e() {
        return c().entrySet();
    }

    @Override // java.util.Map
    public Set entrySet() {
        switch (this.f12449a) {
            case 1:
                return AbstractC0158p.d(e(), new C1644v(1));
            default:
                return e();
        }
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        switch (this.f12449a) {
            case 1:
                return obj != null && AbstractC0158p.b(this, obj);
            default:
                return f(obj);
        }
    }

    public final boolean f(Object obj) {
        return obj == this || c().equals(obj);
    }

    public final Object g(Object obj) {
        return c().get(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        switch (this.f12449a) {
            case 1:
                if (obj == null) {
                    return null;
                }
                return (List) g(obj);
            default:
                return g(obj);
        }
    }

    public final int h() {
        return c().hashCode();
    }

    @Override // java.util.Map
    public int hashCode() {
        switch (this.f12449a) {
            case 1:
                return AbstractC0158p.g(entrySet());
            default:
                return h();
        }
    }

    public final boolean i() {
        return c().isEmpty();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        switch (this.f12449a) {
            case 1:
                if (i()) {
                    return true;
                }
                return k() == 1 && a(null);
            default:
                return i();
        }
    }

    public final Set j() {
        return c().keySet();
    }

    public final int k() {
        return c().size();
    }

    @Override // java.util.Map
    public Set keySet() {
        switch (this.f12449a) {
            case 1:
                return AbstractC0158p.d(j(), new C1644v(0));
            default:
                return j();
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return c().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        c().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return c().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        switch (this.f12449a) {
            case 1:
                return k() - (a(null) ? 1 : 0);
            default:
                return k();
        }
    }

    public final String toString() {
        Object obj;
        switch (this.f12449a) {
            case 0:
                obj = (HashMap) this.f12450b;
                break;
            default:
                obj = this.f12450b;
                break;
        }
        return obj.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return c().values();
    }

    public C0979m(Map map) {
        this.f12449a = 1;
        this.f12450b = map;
    }
}
