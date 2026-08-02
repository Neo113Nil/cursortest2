package U;

import X3.AbstractC0441a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m extends AbstractC0441a {

    /* renamed from: k, reason: collision with root package name */
    public final c f5833k;

    public m(c cVar) {
        this.f5833k = cVar;
    }

    @Override // X3.AbstractC0441a
    public final int c() {
        c cVar = this.f5833k;
        cVar.getClass();
        return cVar.f5812l;
    }

    @Override // X3.AbstractC0441a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f5833k.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c cVar = this.f5833k;
        o[] oVarArr = new o[8];
        for (int i = 0; i < 8; i++) {
            oVarArr[i] = new p(2);
        }
        return new l(cVar.f5811k, oVarArr);
    }
}
