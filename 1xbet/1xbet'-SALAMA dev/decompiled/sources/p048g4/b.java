package p048g4;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface b {
    default Object a(Class cls) {
        return f(q.a(cls));
    }

    default Set b(q qVar) {
        return (Set) g(qVar).get();
    }

    N4.b c(q qVar);

    default N4.b d(Class cls) {
        return c(q.a(cls));
    }

    o e(q qVar);

    default Object f(q qVar) {
        N4.b bVarC = c(qVar);
        if (bVarC == null) {
            return null;
        }
        return bVarC.get();
    }

    N4.b g(q qVar);

    default o h(Class cls) {
        return e(q.a(cls));
    }
}
