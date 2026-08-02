package U;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class k extends X3.i {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5831k;

    /* renamed from: l, reason: collision with root package name */
    public final c f5832l;

    public /* synthetic */ k(c cVar, int i) {
        this.f5831k = i;
        this.f5832l = cVar;
    }

    @Override // X3.AbstractC0441a
    public final int c() {
        switch (this.f5831k) {
            case 0:
                c cVar = this.f5832l;
                cVar.getClass();
                return cVar.f5812l;
            default:
                c cVar2 = this.f5832l;
                cVar2.getClass();
                return cVar2.f5812l;
        }
    }

    @Override // X3.AbstractC0441a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Map.Entry entry;
        switch (this.f5831k) {
            case 0:
                if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
                    return false;
                }
                Object key = entry.getKey();
                c cVar = this.f5832l;
                Object obj2 = cVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f5832l.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5831k) {
            case 0:
                c cVar = this.f5832l;
                o[] oVarArr = new o[8];
                for (int i = 0; i < 8; i++) {
                    oVarArr[i] = new p(0);
                }
                return new l(cVar.f5811k, oVarArr);
            default:
                c cVar2 = this.f5832l;
                o[] oVarArr2 = new o[8];
                for (int i5 = 0; i5 < 8; i5++) {
                    oVarArr2[i5] = new p(1);
                }
                return new l(cVar2.f5811k, oVarArr2);
        }
    }
}
