package androidx.work;

import d1.AbstractC0956i;
import d1.C0953f;
import d1.C0954g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC0956i {
    @Override // d1.AbstractC0956i
    public final C0954g a(ArrayList arrayList) {
        C0953f c0953f = new C0953f();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((C0954g) it.next()).f12357a));
        }
        c0953f.b(hashMap);
        C0954g c0954g = new C0954g(c0953f.f12354a);
        C0954g.c(c0954g);
        return c0954g;
    }
}
