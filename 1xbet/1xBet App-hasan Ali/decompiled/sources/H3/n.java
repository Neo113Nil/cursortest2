package H3;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import r.C2325c;
import r.C2327e;

/* loaded from: classes.dex */
public final class n extends AbstractSet {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2339k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map f2340l;

    public /* synthetic */ n(int i, Map map) {
        this.f2339k = i;
        this.f2340l = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f2339k) {
            case 0:
                ((p) this.f2340l).clear();
                break;
            case 1:
                ((p) this.f2340l).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean contains(Object obj) {
        o a5;
        switch (this.f2339k) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                p pVar = (p) this.f2340l;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                o oVar = null;
                if (key != null) {
                    try {
                        a5 = pVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a5 != null && Objects.equals(a5.f2348r, entry.getValue())) {
                        oVar = a5;
                    }
                    return oVar == null;
                }
                a5 = null;
                if (a5 != null) {
                    oVar = a5;
                }
                if (oVar == null) {
                }
            case 1:
                return ((p) this.f2340l).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2339k) {
            case 0:
                return new m((p) this.f2340l, 0);
            case 1:
                return new m((p) this.f2340l, 1);
            default:
                return new C2325c((C2327e) this.f2340l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean remove(Object obj) {
        o a5;
        switch (this.f2339k) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                p pVar = (p) this.f2340l;
                Object key = entry.getKey();
                o oVar = null;
                if (key != null) {
                    try {
                        a5 = pVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a5 != null && Objects.equals(a5.f2348r, entry.getValue())) {
                        oVar = a5;
                    }
                    if (oVar != null) {
                        return false;
                    }
                    pVar.c(oVar, true);
                    return true;
                }
                a5 = null;
                if (a5 != null) {
                    oVar = a5;
                }
                if (oVar != null) {
                }
            case 1:
                p pVar2 = (p) this.f2340l;
                o oVar2 = null;
                if (obj != null) {
                    try {
                        oVar2 = pVar2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (oVar2 != null) {
                    pVar2.c(oVar2, true);
                }
                return oVar2 != null;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f2339k) {
            case 0:
                return ((p) this.f2340l).f2354n;
            case 1:
                return ((p) this.f2340l).f2354n;
            default:
                return ((C2327e) this.f2340l).f18961m;
        }
    }
}
