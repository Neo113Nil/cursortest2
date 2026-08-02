package He;

import Bl0.c0;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.I;

/* loaded from: classes.dex */
final class k extends I {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final k f10893b = new k();

    @Override // xe.I
    public final void q(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        c.f10881c.z(runnable, false);
    }

    @Override // xe.I
    public final void r(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        c.f10881c.z(runnable, true);
    }

    @Override // xe.I
    @NotNull
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // xe.I
    @NotNull
    public final I w(int i11) {
        c0.b(i11);
        return i11 >= j.f10890d ? this : super.w(i11);
    }
}
