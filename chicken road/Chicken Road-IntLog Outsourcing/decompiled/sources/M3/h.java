package M3;

import a3.C0182a;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface h extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    default J3.c e() {
        return J3.c.f1361e;
    }

    void r(C0182a c0182a, p pVar);

    default J3.c shutdown() {
        return e();
    }
}
