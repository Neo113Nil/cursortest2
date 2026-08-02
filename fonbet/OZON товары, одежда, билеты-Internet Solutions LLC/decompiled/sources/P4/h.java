package P4;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class h implements O4.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SQLiteProgram f21836a;

    public h(@NotNull SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f21836a = delegate;
    }

    @Override // O4.d
    public final void C0(int i11) {
        this.f21836a.bindNull(i11);
    }

    @Override // O4.d
    public final void S0(int i11, double d11) {
        this.f21836a.bindDouble(i11, d11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21836a.close();
    }

    @Override // O4.d
    public final void e0(int i11, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f21836a.bindString(i11, value);
    }

    @Override // O4.d
    public final void m0(int i11, long j11) {
        this.f21836a.bindLong(i11, j11);
    }

    @Override // O4.d
    public final void q0(int i11, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f21836a.bindBlob(i11, value);
    }
}
