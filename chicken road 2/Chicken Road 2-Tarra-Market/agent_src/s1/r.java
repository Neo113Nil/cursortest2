package s1;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface r extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    u d();

    void e(e eVar, long j2);

    void flush();
}
