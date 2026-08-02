package Qf;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class c extends i<Pf.h> {
    @Override // Qf.i
    public final Pf.h a(int i11) {
        return (Pf.h) super.a(i11);
    }

    @Override // Qf.i
    public final Pf.h b(int i11, Pf.h hVar) {
        return (Pf.h) super.b(i11, hVar);
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        c cVar = new c(size());
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            cVar.add(((Pf.h) it.next()).k());
        }
        return cVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        return (Pf.h) super.a(i11);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        return (Pf.h) super.b(i11, (Pf.h) obj);
    }
}
