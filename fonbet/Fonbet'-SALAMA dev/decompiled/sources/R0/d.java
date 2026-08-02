package R0;

import S0.AbstractC0432c;
import S0.C0431b;
import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import w1.L;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.j f5856a = new S0.j();

    public static boolean a(String str) {
        C0431b c0431b = S0.w.f6286a;
        Set<S0.f> unmodifiableSet = Collections.unmodifiableSet(AbstractC0432c.f6236c);
        HashSet hashSet = new HashSet();
        for (S0.f fVar : unmodifiableSet) {
            if (((AbstractC0432c) fVar).f6237a.equals(str)) {
                hashSet.add(fVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException(L.i("Unknown feature ", str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC0432c abstractC0432c = (AbstractC0432c) ((S0.f) it.next());
            if (abstractC0432c.a() || abstractC0432c.b()) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Context context, String str) {
        C0431b c0431b = S0.w.f6286a;
        Set<S0.n> unmodifiableSet = Collections.unmodifiableSet(S0.n.f6250d);
        HashSet hashSet = new HashSet();
        for (S0.n nVar : unmodifiableSet) {
            if (nVar.f6251a.equals(str)) {
                hashSet.add(nVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException(L.i("Unknown feature ", str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((S0.n) it.next()).a(context)) {
                return true;
            }
        }
        return false;
    }

    public abstract void onMessage(o oVar, n nVar);
}
