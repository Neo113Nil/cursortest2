package La;

import Na.c;
import Wa.b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f16666a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f16667b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16668c;

    public a(@NotNull b inputStream, @NotNull c array, Long l11) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(array, "array");
        this.f16666a = inputStream;
        this.f16667b = l11;
    }

    @NotNull
    public final InputStream c() {
        if (this.f16668c) {
            throw new IOException("Body is closed");
        }
        return this.f16666a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16668c) {
            return;
        }
        this.f16668c = true;
        this.f16666a.close();
    }

    public final long d() {
        Long l11 = this.f16667b;
        if (l11 != null) {
            return l11.longValue();
        }
        return -1L;
    }
}
