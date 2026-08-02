package r;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: r.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2327e extends Q implements Map {

    /* renamed from: n, reason: collision with root package name */
    public H3.n f18991n;

    /* renamed from: o, reason: collision with root package name */
    public C2324b f18992o;

    /* renamed from: p, reason: collision with root package name */
    public C2326d f18993p;

    @Override // java.util.Map
    public final Set entrySet() {
        H3.n nVar = this.f18991n;
        if (nVar != null) {
            return nVar;
        }
        H3.n nVar2 = new H3.n(2, this);
        this.f18991n = nVar2;
        return nVar2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.f18961m;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f18961m;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2324b c2324b = this.f18992o;
        if (c2324b != null) {
            return c2324b;
        }
        C2324b c2324b2 = new C2324b(this);
        this.f18992o = c2324b2;
        return c2324b2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f18961m);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C2326d c2326d = this.f18993p;
        if (c2326d != null) {
            return c2326d;
        }
        C2326d c2326d2 = new C2326d(this);
        this.f18993p = c2326d2;
        return c2326d2;
    }
}
