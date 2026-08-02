package Oe;

import Le.InterfaceC3583a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC3683b<T> implements InterfaceC3583a<T> {
    @Override // Le.f
    public final void c(@NotNull Ne.a encoder, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Le.f<? super T> a11 = Le.c.a(this, encoder, value);
        Me.f b11 = b();
        Ne.b e11 = encoder.e(b11);
        e11.k(b(), 0, a11.b().f());
        e11.u(b(), 1, a11, value);
        e11.B(b11);
    }

    public Le.f d(@NotNull Ne.a encoder, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return encoder.z().b(e(), value);
    }

    @NotNull
    public abstract kotlin.reflect.d<T> e();
}
