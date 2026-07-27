package h2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0481b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5779a;

    /* renamed from: b, reason: collision with root package name */
    public final C0482c f5780b;

    public C0481b(Set set, C0482c c0482c) {
        this.f5779a = b(set);
        this.f5780b = c0482c;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0480a c0480a = (C0480a) it.next();
            sb.append(c0480a.f5777a);
            sb.append('/');
            sb.append(c0480a.f5778b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        C0482c c0482c = this.f5780b;
        synchronized (((HashSet) c0482c.f5783b)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) c0482c.f5783b);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f5779a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) c0482c.f5783b)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) c0482c.f5783b);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
