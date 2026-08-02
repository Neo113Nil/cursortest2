package af;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.F;
import sf.InterfaceC9683i;
import sf.M;
import sf.N;

/* renamed from: af.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5012b implements M {

    /* renamed from: a, reason: collision with root package name */
    private boolean f36692a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC9683i f36693b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC5013c f36694c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ F f36695d;

    C5012b(InterfaceC9683i interfaceC9683i, InterfaceC5013c interfaceC5013c, F f7) {
        this.f36693b = interfaceC9683i;
        this.f36694c = interfaceC5013c;
        this.f36695d = f7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f36692a) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!Ye.b.j(this)) {
                this.f36692a = true;
                this.f36694c.a();
            }
        }
        this.f36693b.close();
    }

    @Override // sf.M
    public final long read(@NotNull C9681g sink, long j11) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            long read = this.f36693b.read(sink, j11);
            F f7 = this.f36695d;
            if (read == -1) {
                if (!this.f36692a) {
                    this.f36692a = true;
                    f7.close();
                }
                return -1L;
            }
            sink.k(f7.f98663b, sink.size() - read, read);
            f7.c();
            return read;
        } catch (IOException e11) {
            if (this.f36692a) {
                throw e11;
            }
            this.f36692a = true;
            this.f36694c.a();
            throw e11;
        }
    }

    @Override // sf.M
    @NotNull
    public final N timeout() {
        return this.f36693b.timeout();
    }
}
