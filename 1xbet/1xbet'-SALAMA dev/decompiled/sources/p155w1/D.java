package p155w1;

import java.io.DataOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class D extends DataOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17324a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(OutputStream outputStream, int i7) {
        super(outputStream);
        this.f17324a = i7;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i7 = this.f17324a;
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
