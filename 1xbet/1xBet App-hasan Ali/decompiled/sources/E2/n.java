package E2;

import X3.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class n implements Iterable, j4.a {

    /* renamed from: l, reason: collision with root package name */
    public static final n f1475l = new n(w.f6091k);

    /* renamed from: k, reason: collision with root package name */
    public final Map f1476k;

    public n(Map map) {
        this.f1476k = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return kotlin.jvm.internal.l.a(this.f1476k, ((n) obj).f1476k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1476k.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f1476k;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            arrayList.add(new W3.h(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f1476k + ')';
    }
}
