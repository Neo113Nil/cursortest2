package He;

import Bl0.c0;
import org.jetbrains.annotations.NotNull;
import xe.I;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final c f10881c = new c(j.f10891e, j.f10889c, j.f10890d, j.f10887a);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // xe.I
    @NotNull
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // xe.I
    @NotNull
    public final I w(int i11) {
        c0.b(i11);
        return i11 >= j.f10889c ? this : super.w(i11);
    }
}
