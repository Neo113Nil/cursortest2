package U;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends X3.h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5825k;

    /* renamed from: l, reason: collision with root package name */
    public final e f5826l;

    public /* synthetic */ g(int i, e eVar) {
        this.f5825k = i;
        this.f5826l = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f5825k) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // X3.h
    public final int c() {
        switch (this.f5825k) {
            case 0:
                e eVar = this.f5826l;
                eVar.getClass();
                return eVar.f5820o;
            default:
                e eVar2 = this.f5826l;
                eVar2.getClass();
                return eVar2.f5820o;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f5825k) {
            case 0:
                this.f5826l.clear();
                break;
            default:
                this.f5826l.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f5825k) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                Object key = entry.getKey();
                e eVar = this.f5826l;
                Object obj2 = eVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && eVar.containsKey(entry.getKey());
            default:
                return this.f5826l.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5825k) {
            case 0:
                return new h(this.f5826l);
            default:
                o[] oVarArr = new o[8];
                for (int i = 0; i < 8; i++) {
                    oVarArr[i] = new p(1);
                }
                return new i(this.f5826l, oVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f5825k) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) != null) {
                    return this.f5826l.remove(entry.getKey(), entry.getValue());
                }
                return false;
            default:
                e eVar = this.f5826l;
                if (!eVar.containsKey(obj)) {
                    return false;
                }
                eVar.remove(obj);
                return true;
        }
    }
}
