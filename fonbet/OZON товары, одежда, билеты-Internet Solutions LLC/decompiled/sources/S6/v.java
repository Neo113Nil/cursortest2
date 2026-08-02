package S6;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes9.dex */
abstract class v implements Closeable {
    abstract Z6.d c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        c().close();
    }
}
