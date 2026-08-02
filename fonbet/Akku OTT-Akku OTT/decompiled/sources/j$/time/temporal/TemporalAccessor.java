package j$.time.temporal;

import java.util.Objects;

/* loaded from: classes6.dex */
public interface TemporalAccessor {
    boolean g(q qVar);

    long h(q qVar);

    default u j(q qVar) {
        if (!(qVar instanceof a)) {
            Objects.requireNonNull(qVar, "field");
            return qVar.v(this);
        }
        if (g(qVar)) {
            return ((a) qVar).b;
        }
        throw new t(j$.time.d.a("Unsupported field: ", qVar));
    }

    default int f(q qVar) {
        u j = j(qVar);
        if (!j.d()) {
            throw new t("Invalid field " + qVar + " for get() method, use getLong() instead");
        }
        long h = h(qVar);
        if (j.e(h)) {
            return (int) h;
        }
        throw new j$.time.c("Invalid value for " + qVar + " (valid values " + j + "): " + h);
    }

    default Object b(j$.time.h hVar) {
        if (hVar == r.a || hVar == r.b || hVar == r.c) {
            return null;
        }
        return hVar.i(this);
    }
}
