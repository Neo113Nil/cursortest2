package X;

import P.AbstractC0320u0;
import P.g1;
import U.n;

/* loaded from: classes.dex */
public final class h extends U.e {

    /* renamed from: p, reason: collision with root package name */
    public i f6058p;

    public h(i iVar) {
        this.f5816k = new W.b();
        this.f5817l = iVar.f5811k;
        this.f5820o = iVar.f5812l;
        this.f6058p = iVar;
    }

    public final i b() {
        n nVar = this.f5817l;
        i iVar = this.f6058p;
        if (nVar != iVar.f5811k) {
            this.f5816k = new W.b();
            iVar = new i(this.f5817l, this.f5820o);
        }
        this.f6058p = iVar;
        return iVar;
    }

    @Override // U.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0320u0) {
            return super.containsKey((AbstractC0320u0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof g1) {
            return super.containsValue((g1) obj);
        }
        return false;
    }

    @Override // U.e, java.util.AbstractMap, java.util.Map
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

    @Override // U.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC0320u0) {
            return (g1) super.remove((AbstractC0320u0) obj);
        }
        return null;
    }
}
