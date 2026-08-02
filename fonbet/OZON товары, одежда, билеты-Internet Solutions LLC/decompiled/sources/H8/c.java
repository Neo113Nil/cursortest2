package H8;

import java.util.Iterator;
import java.util.Set;
import n8.C8451a;
import n8.n;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    private final String f10695a;

    /* renamed from: b, reason: collision with root package name */
    private final d f10696b;

    c(Set<e> set, d dVar) {
        this.f10695a = b(set);
        this.f10696b = dVar;
    }

    public static C8451a<h> a() {
        C8451a.C1292a a11 = C8451a.a(h.class);
        a11.b(n.l(e.class));
        a11.f(new b());
        return a11.d();
    }

    private static String b(Set<e> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<e> it = set.iterator();
        while (it.hasNext()) {
            e next = it.next();
            sb2.append(next.a());
            sb2.append('/');
            sb2.append(next.b());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // H8.h
    public final String getUserAgent() {
        d dVar = this.f10696b;
        boolean isEmpty = dVar.b().isEmpty();
        String str = this.f10695a;
        if (isEmpty) {
            return str;
        }
        return str + ' ' + b(dVar.b());
    }
}
