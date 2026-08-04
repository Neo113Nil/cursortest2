package R4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
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
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        c cVar = this.f6061b;
        synchronized (((HashSet) cVar.f6064b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f6064b);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f6060a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) cVar.f6064b)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f6064b);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
