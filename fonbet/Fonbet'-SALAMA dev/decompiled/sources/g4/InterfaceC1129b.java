package g4;

import java.util.Set;

/* renamed from: g4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1129b {
    default Object a(Class cls) {
        return f(C1144q.a(cls));
    }

    default Set b(C1144q c1144q) {
        return (Set) g(c1144q).get();
    }

    N4.b c(C1144q c1144q);

    default N4.b d(Class cls) {
        return c(C1144q.a(cls));
    }

    C1142o e(C1144q c1144q);

    default Object f(C1144q c1144q) {
        N4.b c3 = c(c1144q);
        if (c3 == null) {
            return null;
        }
        return c3.get();
    }

    N4.b g(C1144q c1144q);

    default C1142o h(Class cls) {
        return e(C1144q.a(cls));
    }
}
