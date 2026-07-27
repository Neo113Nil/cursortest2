package j5;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class m implements w {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f10510a;

    /* renamed from: b, reason: collision with root package name */
    public final y f10511b;

    public m(InputStream inputStream, y yVar) {
        this.f10510a = inputStream;
        this.f10511b = yVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10510a.close();
    }

    @Override // j5.w
    public final y d() {
        return this.f10511b;
    }

    @Override // j5.w
    public final long s(f sink, long j2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        try {
            this.f10511b.f();
            r F2 = sink.F(1);
            int read = this.f10510a.read(F2.f10521a, F2.f10523c, (int) Math.min(8192L, 8192 - F2.f10523c));
            if (read != -1) {
                F2.f10523c += read;
                long j6 = read;
                sink.f10495b += j6;
                return j6;
            }
            if (F2.f10522b != F2.f10523c) {
                return -1L;
            }
            sink.f10494a = F2.a();
            s.a(F2);
            return -1L;
        } catch (AssertionError e3) {
            if (k5.f.a(e3)) {
                throw new IOException(e3);
            }
            throw e3;
        }
    }

    public final String toString() {
        return "source(" + this.f10510a + ')';
    }
}
