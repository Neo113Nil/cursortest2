package R4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f6060a;

    /* renamed from: b, reason: collision with root package name */
    public final c f6061b;

    public b(Set set, c cVar) {
        this.f6060a = b(set);
        this.f6061b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f6058a);
            sb.append('/');
            sb.append(aVar.f6059b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f6061b;
        synchronized (((HashSet) cVar.f6064b)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f6064b);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f6060a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) cVar.f6064b)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f6064b);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
