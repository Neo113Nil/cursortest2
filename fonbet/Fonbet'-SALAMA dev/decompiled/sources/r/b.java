package r;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends l implements Map {

    /* renamed from: y, reason: collision with root package name */
    public C1566a f15967y;

    public b(int i7) {
        if (i7 == 0) {
            this.f16005a = e.f15982a;
            this.f16006b = e.f15983b;
        } else {
            a(i7);
        }
        this.f16007c = 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f15967y == null) {
            this.f15967y = new C1566a(this, 0);
        }
        C1566a c1566a = this.f15967y;
        if (((i) c1566a.f5804a) == null) {
            c1566a.f5804a = new i(c1566a, 0);
        }
        return (i) c1566a.f5804a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f15967y == null) {
            this.f15967y = new C1566a(this, 0);
        }
        C1566a c1566a = this.f15967y;
        if (((i) c1566a.f5805b) == null) {
            c1566a.f5805b = new i(c1566a, 1);
        }
        return (i) c1566a.f5805b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f16007c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f15967y == null) {
            this.f15967y = new C1566a(this, 0);
        }
        C1566a c1566a = this.f15967y;
        if (((k) c1566a.f5806c) == null) {
            c1566a.f5806c = new k(c1566a);
        }
        return (k) c1566a.f5806c;
    }
}
