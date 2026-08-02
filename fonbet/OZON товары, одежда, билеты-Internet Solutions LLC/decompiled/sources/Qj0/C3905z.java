package Qj0;

import Sc.InterfaceC3999a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Qj0.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3905z implements V {
    @Override // Qj0.V
    public final void a() {
    }

    @Override // Qj0.V
    @NotNull
    public final U beginTrace(@NotNull U trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        U u11 = new U(trace);
        u11.r();
        return u11;
    }

    @Override // Qj0.V
    @InterfaceC3999a
    public final void c(Function1<? super Integer, Unit> function1) {
    }

    @Override // Qj0.V
    public final void e() {
    }

    @Override // Qj0.V
    public final void endTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // Qj0.V
    public final Object f(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return Unit.f71690a;
    }

    @Override // Qj0.V
    public final boolean hasTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return true;
    }

    @Override // Qj0.V
    public final U removeTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return null;
    }

    @Override // Qj0.V
    @NotNull
    public final U beginTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        U u11 = new U(name);
        u11.r();
        return u11;
    }
}
