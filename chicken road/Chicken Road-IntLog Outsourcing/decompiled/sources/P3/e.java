package P3;

import java.io.Closeable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface e extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    J3.c export(Collection collection);

    J3.c flush();

    J3.c shutdown();
}
