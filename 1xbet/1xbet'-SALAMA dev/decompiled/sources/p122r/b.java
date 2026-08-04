package p122r;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l implements Map {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a f15973y;

    public b(int i7) {
        if (i7 == 0) {
            this.f16011a = e.f15988a;
            this.f16012b = e.f15989b;
        } else {
            a(i7);
        }
        this.f16013c = 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f15973y == null) {
            this.f15973y = new a(this, 0);
        }
        a aVar = this.f15973y;
        if (((i) aVar.f5804a) == null) {
            aVar.f5804a = new i(aVar, 0);
        }
        return (i) aVar.f5804a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f15973y == null) {
            this.f15973y = new a(this, 0);
        }
        a aVar = this.f15973y;
        if (((i) aVar.f5805b) == null) {
            aVar.f5805b = new i(aVar, 1);
        }
        return (i) aVar.f5805b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f16013c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f15973y == null) {
            this.f15973y = new a(this, 0);
        }
        a aVar = this.f15973y;
        if (((k) aVar.f5806c) == null) {
            aVar.f5806c = new k(aVar);
        }
        return (k) aVar.f5806c;
    }
}
