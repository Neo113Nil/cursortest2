package N1;

import java.util.Set;

/* loaded from: classes.dex */
public interface b {
    default Object a(Class cls) {
        return f(q.a(cls));
    }

    Y1.a b(q qVar);

    Y1.a c(q qVar);

    default Set d(q qVar) {
        return (Set) c(qVar).get();
    }

    default Y1.a e(Class cls) {
        return b(q.a(cls));
    }

    default Object f(q qVar) {
        Y1.a b6 = b(qVar);
        if (b6 == null) {
            return null;
        }
        return b6.get();
    }
}
