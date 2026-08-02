package L4;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface G extends Closeable, Flushable {
    void D(C0226i c0226i, long j5);

    K c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
