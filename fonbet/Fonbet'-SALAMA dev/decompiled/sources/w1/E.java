package w1;

import java.io.DataInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class E extends DataInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17358a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(InputStream inputStream, int i7) {
        super(inputStream);
        this.f17358a = i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i7 = this.f17358a;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }
}
