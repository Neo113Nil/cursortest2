package R2;

import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l0 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final FileOutputStream f24382a;

    public l0(@NotNull FileOutputStream fileOutputStream) {
        Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.f24382a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f24382a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i11) {
        this.f24382a.write(i11);
    }

    @Override // java.io.OutputStream
    public final void write(@NotNull byte[] b11) {
        Intrinsics.checkNotNullParameter(b11, "b");
        this.f24382a.write(b11);
    }

    @Override // java.io.OutputStream
    public final void write(@NotNull byte[] bytes, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f24382a.write(bytes, i11, i12);
    }
}
